package com.nexola.dslist.projections;

public interface GameMinProjection { // Projection precisa ter as propriedades retornadas na consulta SQL

    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Long getPosition();

}
