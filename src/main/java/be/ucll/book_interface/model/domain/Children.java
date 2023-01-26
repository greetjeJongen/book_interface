package be.ucll.book_interface.model.domain;

import javax.persistence.Entity;

@Entity
public class Children extends Book {
    private String theme;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String getCode() {
        return super.getCode() + getTheme();
    }

}
