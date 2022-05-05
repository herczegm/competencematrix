package com.idomsoft.competencematrix.repositories.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.event.InternalFrameEvent;

@Entity
@Table(name = "rolepermissionset")
public class RolePermissionSet {

    @Id
    private Long id;

    @Column(name = "permissionid")
    private Integer permissionId;

    @Column(name = "roleid")
    private Integer roleId;

    public RolePermissionSet(){

    }
}
