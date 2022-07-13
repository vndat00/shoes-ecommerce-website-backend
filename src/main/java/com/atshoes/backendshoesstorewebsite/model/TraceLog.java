package com.atshoes.backendshoesstorewebsite.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table( name = "trace_logs")
public class TraceLog {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "trace_log_id")
    private int traceLogId;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @Column(name = "ip_address")
    private String ipAddress;

    @Column
    private Date time;

    @Column
    private String action;

    @Column
    private boolean delete_flg;

}
