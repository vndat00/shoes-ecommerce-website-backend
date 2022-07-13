package com.atshoes.backendshoesstorewebsite.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "detail_historys")
public class DetailHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "history_id", nullable = false )
    private ImportCSVHistory importCSVHistory;

    @Column( name = "error_row_position")
    private int errorRowPosition;

    @Column(name = "error_name")
    private String errorName;

    @Column
    private boolean delete_flg;

}
