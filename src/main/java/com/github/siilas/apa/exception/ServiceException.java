package com.github.siilas.apa.exception;

public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = -8412405853242501457L;
    
    public ServiceException(String mensagem) {
        super(mensagem);
    }

}
