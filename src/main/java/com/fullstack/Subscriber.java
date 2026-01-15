package com.fullstack;

public class Subscriber {

    private int id;
    private String name;
    private String email;
    private plan plan;
    private boolean active;
    private int monthsRemaining;

    public Subscriber(int id, String name, String email, plan plan, boolean active, int monthsRemaining) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.plan = plan;
        this.active = active;
        this.monthsRemaining = monthsRemaining;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public plan getPlan() {
        return plan;
    }

    public boolean isActive() {
        return active;
    }

    public int getMonthsRemaining() {
        return monthsRemaining;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setMonthsRemaining(int monthsRemaining) {
        this.monthsRemaining = monthsRemaining;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", plan=" + plan +
                ", active=" + active +
                ", monthsRemaining=" + monthsRemaining +
                '}';
    }
}
