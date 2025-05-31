package org.example.models;

public class Media {
    private Long id;
    private String link;
    private boolean isMain;
    private Users user;

    public Media() {
    }

    public Media(boolean isMain, Long id, String link, Users user) {
        this.isMain = isMain;
        this.id = id;
        this.link = link;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean isMain() {
        return isMain;
    }

    public void setMain(boolean main) {
        isMain = main;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
