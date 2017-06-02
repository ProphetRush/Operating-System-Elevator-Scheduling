import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Created by 63160 on 3/22/2017.
 */
public class Controller implements Runnable{

    private static UserInterface ElevatorUI;
    private static Controller[] ElevatorControllers = new Controller[UserInterface.Elevator.ELEVATORNUM];
    ArrayList<Integer> Queue = new ArrayList<>();
    private int[] PassengerFloorSelectStatus = new int[UserInterface.Elevator.floornum];
    UserInterface.Elevator elevator;
    public static final int ORIGIN = -1;
    public static final int DEST = 1;
    public static int ElevatorID = 1;




    static void initialize(UserInterface gui){
        Controller.ElevatorUI = gui;
        FloorSelectorListener.userInterface = gui;
        LeftPanelListener.userInterface = gui;
        for(int i=0; i< UserInterface.Elevator.ELEVATORNUM; i++){
            ElevatorControllers[i] = new Controller(gui.elevators[i]);
        }
        LeftPanelListener leftPanelListener = new LeftPanelListener();
        FloorSelectorListener floorSelectorListener = new FloorSelectorListener();

        for (int i = 0; i < UserInterface.Elevator.ELEVATORNUM; i++){
            gui.gotoButton[i].addActionListener(floorSelectorListener);
        }
        for(int i=0; i < UserInterface.Elevator.floornum-1; i++){
            gui.ButtonDown[i].addActionListener(leftPanelListener);
            gui.ButtonUp[i].addActionListener(leftPanelListener);
        }
        for(int i=0; i<UserInterface.Elevator.ELEVATORNUM; i++){
            Thread t = new Thread(ElevatorControllers[i]);
            t.start();
        }
    }

    public static int getDistance(int thisFloor, int ElevatorNo){
         int currentFloor = ElevatorUI.elevators[ElevatorNo].getCurrentFloor();
         int currentDirection = ElevatorUI.elevators[ElevatorNo].getDirection();
         if (thisFloor == currentFloor) return 0;
         if (thisFloor > currentFloor){
             if(!ElevatorUI.elevators[ElevatorNo].isRunning() || currentDirection == UserInterface.Elevator.UP){
                 return thisFloor - currentFloor;
             }
             else return thisFloor+currentFloor;
         }
         else{
             if (!ElevatorUI.elevators[ElevatorNo].isRunning() || currentDirection == UserInterface.Elevator.DOWN){
                 return currentFloor - thisFloor;
             }
             else return 2*UserInterface.Elevator.floornum - thisFloor - currentFloor - 2;
         }

    }


    public static int getNearest(int thisFloor){
         int tmp = 2*UserInterface.Elevator.floornum;
         int minDistance = tmp;
         int nearest = 0;
         for (int i=0; i<UserInterface.Elevator.ELEVATORNUM-1; i++){
             tmp = getDistance(thisFloor, i);
             if (tmp<minDistance){
                 minDistance = tmp;
                 nearest = i;
             }
        }
        ElevatorID = nearest+1;
        return nearest;
    }


    public static Controller getController(int i){
        if (i >= 0 && i<UserInterface.Elevator.ELEVATORNUM) return ElevatorControllers[i];
        else return null;
    }

    public void enQueue(int targetFloor, int status){
        if (targetFloor<=0 && targetFloor > UserInterface.Elevator.floornum) return;
        if (Queue.contains(targetFloor)) return;
        Queue.add(targetFloor);
        Queue.sort(Integer::compareTo);
        PassengerFloorSelectStatus[targetFloor-1] = status;
    }


    public void updateStatus(){
        if(Queue.isEmpty()) {
            elevator.setRunningState(false);
        }
        else{
            elevator.setRunningState(true);
        }

        if(elevator.getCurrentFloor()==0) elevator.setDirection(UserInterface.Elevator.UP);
        else if (elevator.getCurrentFloor() == UserInterface.Elevator.floornum) elevator.setDirection(UserInterface.Elevator.DOWN);
        else{
            if(elevator.getDirection() == UserInterface.Elevator.UP && (!elevator.isRunning() || (elevator.getCurrentFloor() < Queue.get(Queue.size()-1)))){
                elevator.setDirection(UserInterface.Elevator.UP);
            }
            else elevator.setDirection(UserInterface.Elevator.DOWN);
            if(elevator.getDirection() == UserInterface.Elevator.DOWN && (!elevator.isRunning() || (elevator.getCurrentFloor() > Queue.get(0)))){
                elevator.setDirection(UserInterface.Elevator.DOWN);
            }
            else elevator.setDirection(UserInterface.Elevator.UP);
        }

    }



    private void RunCheck() throws InterruptedException{
        if(elevator.isRunning()){
            int currentFloor = elevator.getCurrentFloor();
            if(Queue.contains(currentFloor)){
                Queue.remove(Queue.indexOf(currentFloor));
                if (PassengerFloorSelectStatus[currentFloor-1] == ORIGIN){
                    PassengerFloorSelectStatus[currentFloor-1] = 0;
                    elevator.setCurrentLoad(elevator.getCurrentLoad()+1);
                }
                else if(PassengerFloorSelectStatus[currentFloor-1] == DEST){
                    PassengerFloorSelectStatus[currentFloor-1] = 0;
                    elevator.setCurrentLoad(elevator.getCurrentLoad()-1);
                }

                elevator.doorOpen();
            }
            else{
                if(elevator.getDirection() == UserInterface.Elevator.UP)
                    elevator.setCurrentFloor(elevator.getCurrentFloor()+1);
                else if(elevator.getDirection() == UserInterface.Elevator.DOWN)
                    elevator.setCurrentFloor(elevator.getCurrentFloor()-1);
            }
        }
        updateStatus();
    }



    public Controller(UserInterface.Elevator e) {
        this.elevator = e;
    }







    @Override
    public void run() {
        while(true){
            try{
                RunCheck();
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}



class LeftPanelListener implements ActionListener{
    public static UserInterface userInterface;
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        int targetFloor = Integer.parseInt(clicked.getName());
        Controller controller = Controller.getController(Controller.getNearest(targetFloor));
        if(controller != null) controller.enQueue(targetFloor, Controller.ORIGIN);
    }
}

class FloorSelectorListener implements ActionListener{
    public static UserInterface userInterface;
    @Override
    public void actionPerformed(ActionEvent e){
        JButton clicked = (JButton) e.getSource();
        int targetElevator = Integer.parseInt(clicked.getName());
        int targetFloor = Integer.parseInt(userInterface.FloorSelector[targetElevator-1].getSelectedItem().toString());
        System.out.println(targetElevator);
        System.out.println(targetFloor);
        Controller.ElevatorID = targetElevator;
        Controller controller = Controller.getController(targetElevator-1);
        if(controller!=null) controller.enQueue(targetFloor,Controller.DEST);
    }

}
