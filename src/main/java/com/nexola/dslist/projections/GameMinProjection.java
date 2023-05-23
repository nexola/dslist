package com.nexola.dslist.projections;

public interface GameMinProjection { // Projection precisa ter as propriedades retornadas na consulta SQL

    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Long getPosition();

}
