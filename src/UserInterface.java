import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 63160 on 3/21/2017.
 */
public class UserInterface{
    //User Interface Components Initialize
    public JButton ButtonDown20;
    public JButton ButtonUp19;
    public JButton ButtonUp18;
    public JButton ButtonUp17;
    public JButton ButtonUp16;
    public JButton ButtonUp15;
    public JButton ButtonUp14;
    public JButton ButtonUp13;
    public JButton ButtonUp12;
    public JButton ButtonUp11;
    public JButton ButtonUp10;
    public JButton ButtonUp9;
    public JButton ButtonUp8;
    public JButton ButtonUp7;
    public JButton ButtonUp6;
    public JButton ButtonUp5;
    public JButton ButtonUp4;
    public JButton ButtonUp3;
    public JButton ButtonUp2;
    public JButton ButtonUp1;
    public JButton ButtonDown19;
    public JButton ButtonDown18;
    public JButton ButtonDown17;
    public JButton ButtonDown16;
    public JButton ButtonDown15;
    public JButton ButtonDown14;
    public JButton ButtonDown13;
    public JButton ButtonDown12;
    public JButton ButtonDown11;
    public JButton ButtonDown10;
    public JButton ButtonDown9;
    public JButton ButtonDown8;
    public JButton ButtonDown7;
    public JButton ButtonDown6;
    public JButton ButtonDown5;
    public JButton ButtonDown4;
    public JButton ButtonDown3;
    public JButton ButtonDown2;
    public JComboBox ChooseBox_Elevator1;
    public JComboBox ChooseBox_Elevator2;
    public JComboBox ChooseBox_Elevator3;
    public JComboBox ChooseBox_Elevator4;
    public JComboBox ChooseBox_Elevator5;
    public JButton gotoButton1;
    public JButton gotoButton2;
    public JButton gotoButton3;
    public JButton gotoButton4;
    public JButton gotoButton5;
    public JPanel MainPanel;
    public JPanel ElevatorIndicator1_20;
    public JPanel ElevatorIndicator1_19;
    public JPanel ElevatorIndicator1_18;
    public JPanel ElevatorIndicator1_17;
    public JPanel ElevatorIndicator1_16;
    public JPanel ElevatorIndicator1_15;
    public JPanel ElevatorIndicator1_14;
    public JPanel ElevatorIndicator1_13;
    public JPanel ElevatorIndicator1_12;
    public JPanel ElevatorIndicator1_11;
    public JPanel ElevatorIndicator1_10;
    public JPanel ElevatorIndicator1_9;
    public JPanel ElevatorIndicator1_8;
    public JPanel ElevatorIndicator1_7;
    public JPanel ElevatorIndicator1_6;
    public JPanel ElevatorIndicator1_5;
    public JPanel ElevatorIndicator1_4;
    public JPanel ElevatorIndicator1_3;
    public JPanel ElevatorIndicator1_2;
    public JPanel ElevatorIndicator1_1;
    public JPanel ElevatorIndicator2_20;
    public JPanel ElevatorIndicator2_19;
    public JPanel ElevatorIndicator2_18;
    public JPanel ElevatorIndicator2_17;
    public JPanel ElevatorIndicator2_16;
    public JPanel ElevatorIndicator2_15;
    public JPanel ElevatorIndicator2_14;
    public JPanel ElevatorIndicator2_13;
    public JPanel ElevatorIndicator2_12;
    public JPanel ElevatorIndicator2_11;
    public JPanel ElevatorIndicator2_10;
    public JPanel ElevatorIndicator2_9;
    public JPanel ElevatorIndicator2_8;
    public JPanel ElevatorIndicator2_7;
    public JPanel ElevatorIndicator2_6;
    public JPanel ElevatorIndicator2_5;
    public JPanel ElevatorIndicator2_4;
    public JPanel ElevatorIndicator2_3;
    public JPanel ElevatorIndicator2_2;
    public JPanel ElevatorIndicator2_1;
    public JPanel ElevatorIndicator3_20;
    public JPanel ElevatorIndicator3_19;
    public JPanel ElevatorIndicator3_18;
    public JPanel ElevatorIndicator3_17;
    public JPanel ElevatorIndicator3_16;
    public JPanel ElevatorIndicator3_15;
    public JPanel ElevatorIndicator3_14;
    public JPanel ElevatorIndicator3_13;
    public JPanel ElevatorIndicator3_12;
    public JPanel ElevatorIndicator3_11;
    public JPanel ElevatorIndicator3_10;
    public JPanel ElevatorIndicator3_9;
    public JPanel ElevatorIndicator3_8;
    public JPanel ElevatorIndicator3_7;
    public JPanel ElevatorIndicator3_6;
    public JPanel ElevatorIndicator3_5;
    public JPanel ElevatorIndicator3_4;
    public JPanel ElevatorIndicator3_3;
    public JPanel ElevatorIndicator3_2;
    public JPanel ElevatorIndicator3_1;
    public JPanel ElevatorIndicator4_20;
    public JPanel ElevatorIndicator4_19;
    public JPanel ElevatorIndicator4_18;
    public JPanel ElevatorIndicator4_17;
    public JPanel ElevatorIndicator4_16;
    public JPanel ElevatorIndicator4_15;
    public JPanel ElevatorIndicator4_14;
    public JPanel ElevatorIndicator4_13;
    public JPanel ElevatorIndicator4_12;
    public JPanel ElevatorIndicator4_11;
    public JPanel ElevatorIndicator4_10;
    public JPanel ElevatorIndicator4_9;
    public JPanel ElevatorIndicator4_8;
    public JPanel ElevatorIndicator4_7;
    public JPanel ElevatorIndicator4_6;
    public JPanel ElevatorIndicator4_5;
    public JPanel ElevatorIndicator4_4;
    public JPanel ElevatorIndicator4_3;
    public JPanel ElevatorIndicator4_2;
    public JPanel ElevatorIndicator4_1;
    public JPanel ElevatorIndicator5_20;
    public JPanel ElevatorIndicator5_19;
    public JPanel ElevatorIndicator5_18;
    public JPanel ElevatorIndicator5_17;
    public JPanel ElevatorIndicator5_16;
    public JPanel ElevatorIndicator5_15;
    public JPanel ElevatorIndicator5_14;
    public JPanel ElevatorIndicator5_13;
    public JPanel ElevatorIndicator5_12;
    public JPanel ElevatorIndicator5_11;
    public JPanel ElevatorIndicator5_10;
    public JPanel ElevatorIndicator5_9;
    public JPanel ElevatorIndicator5_8;
    public JPanel ElevatorIndicator5_7;
    public JPanel ElevatorIndicator5_6;
    public JPanel ElevatorIndicator5_5;
    public JPanel ElevatorIndicator5_4;
    public JPanel ElevatorIndicator5_3;
    public JPanel ElevatorIndicator5_2;
    public JPanel ElevatorIndicator5_1;



    public JButton[] gotoButton = {gotoButton1,gotoButton2,gotoButton3,gotoButton4, gotoButton5};
    public JComboBox[] FloorSelector = {ChooseBox_Elevator1,ChooseBox_Elevator2,ChooseBox_Elevator3,ChooseBox_Elevator4,ChooseBox_Elevator5};
    public JButton[] ButtonUp = {ButtonUp1,ButtonUp2,ButtonUp3,ButtonUp4,ButtonUp5,ButtonUp6,ButtonUp7,ButtonUp8,ButtonUp9,ButtonUp10,
            ButtonUp11, ButtonUp12,ButtonUp13,ButtonUp14,ButtonUp15,ButtonUp16,ButtonUp17,ButtonUp18,ButtonUp19};
    public JButton[] ButtonDown = {ButtonDown2, ButtonDown3,ButtonDown4,ButtonDown5,ButtonDown6,ButtonDown7,ButtonDown8,
            ButtonDown9,ButtonDown10,ButtonDown11,ButtonDown12,ButtonDown13,ButtonDown14,ButtonDown15,ButtonDown16,
            ButtonDown17,ButtonDown18,ButtonDown19,ButtonDown20};
    public JPanel[] Elevator1 = {ElevatorIndicator1_1, ElevatorIndicator1_2, ElevatorIndicator1_3, ElevatorIndicator1_4,
            ElevatorIndicator1_5, ElevatorIndicator1_6, ElevatorIndicator1_7, ElevatorIndicator1_8, ElevatorIndicator1_9,
            ElevatorIndicator1_10, ElevatorIndicator1_11, ElevatorIndicator1_12, ElevatorIndicator1_13, ElevatorIndicator1_14, ElevatorIndicator1_15,
            ElevatorIndicator1_16, ElevatorIndicator1_17, ElevatorIndicator1_18, ElevatorIndicator1_19, ElevatorIndicator1_20};
    public JPanel[] Elevator2 = {ElevatorIndicator2_1, ElevatorIndicator2_2, ElevatorIndicator2_3, ElevatorIndicator2_4,
            ElevatorIndicator2_5, ElevatorIndicator2_6, ElevatorIndicator2_7, ElevatorIndicator2_8, ElevatorIndicator2_9,
            ElevatorIndicator2_10, ElevatorIndicator2_11, ElevatorIndicator2_12, ElevatorIndicator2_13, ElevatorIndicator2_14, ElevatorIndicator2_15,
            ElevatorIndicator2_16, ElevatorIndicator2_17, ElevatorIndicator2_18, ElevatorIndicator2_19, ElevatorIndicator2_20};
    public JPanel[] Elevator3 = {ElevatorIndicator3_1, ElevatorIndicator3_2, ElevatorIndicator3_3, ElevatorIndicator3_4,
            ElevatorIndicator3_5, ElevatorIndicator3_6, ElevatorIndicator3_7, ElevatorIndicator3_8, ElevatorIndicator3_9,
            ElevatorIndicator3_10, ElevatorIndicator3_11, ElevatorIndicator3_12, ElevatorIndicator3_13, ElevatorIndicator3_14, ElevatorIndicator3_15,
            ElevatorIndicator3_16, ElevatorIndicator3_17, ElevatorIndicator3_18, ElevatorIndicator3_19, ElevatorIndicator3_20};
    public JPanel[] Elevator4 = {ElevatorIndicator4_1, ElevatorIndicator4_2, ElevatorIndicator4_3, ElevatorIndicator4_4,
            ElevatorIndicator4_5, ElevatorIndicator4_6, ElevatorIndicator4_7, ElevatorIndicator4_8, ElevatorIndicator4_9,
            ElevatorIndicator4_10, ElevatorIndicator4_11, ElevatorIndicator4_12, ElevatorIndicator4_13, ElevatorIndicator4_14, ElevatorIndicator4_15,
            ElevatorIndicator4_16, ElevatorIndicator4_17, ElevatorIndicator4_18, ElevatorIndicator4_19, ElevatorIndicator4_20};
    public JPanel[] Elevator5 = {ElevatorIndicator5_1, ElevatorIndicator5_2, ElevatorIndicator5_3, ElevatorIndicator5_4,
            ElevatorIndicator5_5, ElevatorIndicator5_6, ElevatorIndicator5_7, ElevatorIndicator5_8, ElevatorIndicator5_9,
            ElevatorIndicator5_10, ElevatorIndicator5_11, ElevatorIndicator5_12, ElevatorIndicator5_13, ElevatorIndicator5_14, ElevatorIndicator5_15,
            ElevatorIndicator5_16, ElevatorIndicator5_17, ElevatorIndicator5_18, ElevatorIndicator5_19, ElevatorIndicator5_20};

    public JPanel[][] Elevators = {Elevator1, Elevator2, Elevator3, Elevator4, Elevator5};
    public Elevator[] elevators = new Elevator[Elevator.ELEVATORNUM];


    public UserInterface(){

        for (int i=0; i<Elevator.ELEVATORNUM; i++){
            elevators[i] = new Elevator(Elevators[i]);
        }
        for (int i=0; i<Elevator.floornum-1; i++){
            ButtonUp[i].setName(""+(i+1));
            ButtonDown[i].setName(""+(i+2));
        }
        for(int i=0; i<Elevator.ELEVATORNUM; i++){
            gotoButton[i].setName(""+(i+1));
        }
        JFrame frame = new JFrame("Elevator Scheduling");
        frame.setContentPane(this.MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public class Elevator {
        public static final int floornum = 20;
        public static final int IDLE = 0;
        public static final int UP = 1;
        public static final int DOWN = -1;
        public static final int ELEVATORNUM = 5;


        private int direction = UP;
        private int currentLoad = 0;
        private int currentFloor = 1;
        private boolean runningState = false;

        JPanel[] ElevatorPanel = null;

        public int getCurrentLoad() {
            return currentLoad;
        }

        public void setCurrentLoad(int currentLoad) {
            if (currentLoad <= 0) this.currentLoad = 0;
            else this.currentLoad = currentLoad;
        }

        public int getCurrentFloor() {
            return currentFloor;
        }

        public void setCurrentFloor(int currentFloor) {
            ElevatorPanel[this.getCurrentFloor()-1].setBackground(new Color(80,109,96));
            this.currentFloor = currentFloor;
            ElevatorPanel[this.getCurrentFloor()-1].setBackground(getCurrentColor());
        }

        public Color getCurrentColor() {
            if (getCurrentLoad() > 0) return Color.blue;
            else return Color.green;
        }

        public boolean isRunning() {
            return runningState;
        }

        public void setRunningState(boolean runningState) {
            this.runningState = runningState;
        }

        public int getDirection() {
            return direction;
        }

        public void setDirection(int direction) {
            this.direction = direction;
        }

        public void doorOpen() throws InterruptedException{
            for(int i=0; i<3; i++){
                ElevatorPanel[currentFloor-1]. setBackground(Color.red);
                Thread.sleep(250);
                if(this.getCurrentFloor() == 1)
                    ElevatorPanel[currentFloor-1].setBackground(Color.green);
                else ElevatorPanel[currentFloor-1].setBackground(getCurrentColor());

            }
        }


        public Elevator(JPanel[] elevatorPanel){
            this.ElevatorPanel = elevatorPanel;
            setCurrentFloor(1);
        }
    }
}