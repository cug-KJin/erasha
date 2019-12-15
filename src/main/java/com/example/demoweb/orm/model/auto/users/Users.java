package com.example.demoweb.orm.model.auto.users;

public class Users {
    private String USER;

    private Long CURRENT_CONNECTIONS;

    private Long TOTAL_CONNECTIONS;

    public String getUSER() {
        return USER;
    }

    public void setUSER(String USER) {
        this.USER = USER == null ? null : USER.trim();
    }

    public Long getCURRENT_CONNECTIONS() {
        return CURRENT_CONNECTIONS;
    }

    public void setCURRENT_CONNECTIONS(Long CURRENT_CONNECTIONS) {
        this.CURRENT_CONNECTIONS = CURRENT_CONNECTIONS;
    }

    public Long getTOTAL_CONNECTIONS() {
        return TOTAL_CONNECTIONS;
    }

    public void setTOTAL_CONNECTIONS(Long TOTAL_CONNECTIONS) {
        this.TOTAL_CONNECTIONS = TOTAL_CONNECTIONS;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", USER=").append(USER);
        sb.append(", CURRENT_CONNECTIONS=").append(CURRENT_CONNECTIONS);
        sb.append(", TOTAL_CONNECTIONS=").append(TOTAL_CONNECTIONS);
        sb.append("]");
        return sb.toString();
    }
}