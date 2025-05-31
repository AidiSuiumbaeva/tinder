package org.example.models;

import org.example.models.enums.RelationStatus;

import java.time.LocalDateTime;

public class Relation {
    private Long id;
    private Users master;
    private Users slave;
    private RelationStatus status;
    private LocalDateTime addDate;
    private LocalDateTime updateDate;



    public Relation() {
    }

    public Users getMaster() {
        return master;
    }

    public void setMaster(Users master) {
        this.master = master;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getSlave() {
        return slave;
    }

    public void setSlave(Users slave) {
        this.slave = slave;
    }

    public RelationStatus getStatus() {
        return status;
    }

    public void setStatus(RelationStatus status) {
        this.status = status;
    }

    public LocalDateTime getAddDate() {
        return addDate;
    }

    public void setAddDate(LocalDateTime addDate) {
        this.addDate = addDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
}
