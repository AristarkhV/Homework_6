package mateacademy.homework.homework_6;

public class Robot {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean connectionStatus = false;
        for (int i = 0; i < 3; i++) {
            if (!connectionStatus) {
                try (RobotConnection currentRobotConnection = robotConnectionManager.getConnection()) {
                    currentRobotConnection.moveRobotTo(toX, toY);
                    connectionStatus = true;
                } catch (RobotConnectionException ex) {
                }
                if (i == 3) {
                    throw new RobotConnectionException("bad day for connection");
                }
            }
        }
    }
}
