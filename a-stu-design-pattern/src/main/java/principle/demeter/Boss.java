package principle.demeter;

public class Boss {

    public void commandCHeckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourse();
    }
}
