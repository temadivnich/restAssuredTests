package snooker.model;

/**
 * Represents the status of the Player : amateur or professional
 */
public enum PlayerStatus {

    Professional("p"),
    Amateur("a");

    private String status;

    PlayerStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
