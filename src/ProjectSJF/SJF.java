package ProjectSJF;

import java.util.ArrayList;
import java.util.Iterator;

class Process {

    private String processID;
    private int burstTime;
    private int arrivalTime;
    private int burstTimeSt;
    private int waitingTime;
    boolean processed = false;
    int path;
    int[] colors;

    public Process(String processID, String burstTime, String arrivalTime,int x,int y, int z) {
        this.processID = processID;
        this.burstTime = Integer.parseInt(burstTime);
        this.arrivalTime = Integer.parseInt(arrivalTime);
        burstTimeSt = this.burstTime;
        colors=new int[3];
        colors[0]=x;
        colors[1]=y;
        colors[2]=z;
    }
    
    public void setColor(int x,int y, int z){
        colors[0]=x;
        colors[1]=y;
        colors[2]=z;
    }
    public int[] getColor(){
        return colors;
    } 
    

    public String getProcessID() {
        return processID;
    }

    public void setProcessID(String processID) {
        this.processID = processID;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(String burstTime) {
        this.burstTime = Integer.parseInt(burstTime);
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = Integer.parseInt(arrivalTime);
    }

    public int getBurstTimeSt() {
        return burstTimeSt;
    }

    public void setBurstTimeSt(int burstTimeSt) {
        this.burstTimeSt = burstTimeSt;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    @Override
    public String toString() {
        return processID + " bt " + burstTime + " at " + arrivalTime + " wt " + waitingTime;//To change body of generated methods, choose Tools | Templates.
    }

}

class SJF {

    ArrayList<Process> process;
    private int toalT = 0;
    String[] gannt;

    public SJF() {
        process = new ArrayList<Process>();

    }

    public SJF(ArrayList<Process> process) {
        this.process = process;
//        for(Process p:process){
//            System.out.println(p);
//        }
        calSJF();
    }

    int getTotTime() {
        int tot = 0;
        for (Process p : process) {
            tot += p.getBurstTime();
        }
        return tot;
    }

    ArrayList<Process> getMinAarrivalT(int time) {
        ArrayList<Process> minArrivalSet = new ArrayList<Process>();
        for (Process p : process) {
            if (p.getArrivalTime() <= time) {
                //System.out.println(p.getBurstTimeSt());
                if (p.getBurstTimeSt() > 0) {
                    minArrivalSet.add(p);
                }
            }
        }

        return minArrivalSet;
    }

    String getSuatableProcess(ArrayList<Process> minArrivalSet) {
        String pin = "";
        if (!minArrivalSet.isEmpty()) {
            Process min = minArrivalSet.get(0);
            pin = min.getProcessID();
            for (Process p : minArrivalSet) {
                if (min.getBurstTimeSt() > p.getBurstTimeSt()) {
                    min = p;
                    pin = min.getProcessID();
                }
            }
        }

        return pin;
    }

    void calSJF() {
        toalT = getTotTime();
        gannt = new String[toalT];
        String crntProcess = "";

        for (int i = 0; i < toalT; i++) {
            crntProcess = getSuatableProcess(getMinAarrivalT(i));
            if (crntProcess.equals("")) {
                continue;
            } else {
                for (Process p : process) {
                    if (p.getProcessID().equals(crntProcess)) {
                        if (!p.processed) {
                            p.processed = true;
                            p.setWaitingTime(i);
                            
                        }
                        
                        p.setBurstTimeSt(p.getBurstTimeSt() - 1);
                        p.path=i;
                        gannt[i] = p.getProcessID();
                        
                        break;
                    }
                }
            }

        }

    }

    double getTurnAroundTime() {
        int tot = 0;
        double tTime = 0.0;
        for (Process p : process) {
            tot += p.getWaitingTime();
        }
        return tTime;
    }

    void showFinalProcesses() {
        for (Process p : process) {
            System.out.println(p + " // " + p.getBurstTimeSt());
        }
    }

}
