/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.timgroup.statsd.NonBlockingStatsDClient;
import com.timgroup.statsd.StatsDClient;


/**
 *
 * @author siaa
 */
public class Constants {
    
    public static final int STATSD_PORT = 8125;
    public static final String STATSD_HOST = "localhost";
    public static final String STATSD_PREFIX = "taskager";
    
    public static final String PROJETO_PROGRESS = "Em progresso";
    public static final String PROJETO_STALLED = "Parado";
    public static final String PROJETO_CLOSED = "Fechado";
    public static final String ALL_PROJECTS = "Todos os projetos";
    
    public static final String TAREFA_PROGRESS = "Em progresso";
    public static final String TAREFA_STALLED = "Parada";
    public static final String TAREFA_CLOSED = "Fechada";
    
    
    

}
