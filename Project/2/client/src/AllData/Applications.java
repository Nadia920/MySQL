package AllData;

public class Applications {

    private int id;
    private String direction;
    private String status;
    private String execution;
    private String numberPA;

    public Applications(int id, String str1, String str2, String str3, String str4) {
        this.id = id;
        this.direction = str1;
        this.status = str2;
        this.execution = str3;
        this.numberPA = str4;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDirection(String direction) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setExecution(String execution) {
        this.execution = execution;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPA = numberPassport;
    }

    public int getId() {
        return this.id;
    }

    public String getDirection() {
        return this.direction;
    }

    public String getStatus() {
        return this.status;
    }

    public String getExecution() {
        return this.execution;
    }

    public String getNumberPassport() {
        return this.numberPA;
    }
}
