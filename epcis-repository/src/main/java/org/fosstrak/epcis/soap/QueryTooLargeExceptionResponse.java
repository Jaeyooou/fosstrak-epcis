package org.accada.epcis.soap;

import javax.xml.ws.WebFault;

/**
 * This class was generated by Apache CXF (incubator) 2.0.4-incubator Wed Jan 30
 * 15:43:44 CET 2008 Generated source version: 2.0.4-incubator
 */

@WebFault(name = "QueryTooLargeException", targetNamespace = "urn:epcglobal:epcis-query:xsd:1")
public class QueryTooLargeExceptionResponse extends Exception {
    public static final long serialVersionUID = 20080130154344L;

    private org.accada.epcis.model.QueryTooLargeException queryTooLargeException;

    public QueryTooLargeExceptionResponse() {
        super();
    }

    public QueryTooLargeExceptionResponse(String message) {
        super(message);
    }

    public QueryTooLargeExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public QueryTooLargeExceptionResponse(String message,
            org.accada.epcis.model.QueryTooLargeException queryTooLargeException) {
        super(message);
        this.queryTooLargeException = queryTooLargeException;
    }

    public QueryTooLargeExceptionResponse(String message,
            org.accada.epcis.model.QueryTooLargeException queryTooLargeException, Throwable cause) {
        super(message, cause);
        this.queryTooLargeException = queryTooLargeException;
    }

    public org.accada.epcis.model.QueryTooLargeException getFaultInfo() {
        return this.queryTooLargeException;
    }
}