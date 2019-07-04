package com.jira.plugins.rest;

import com.atlassian.plugins.rest.common.security.AnonymousAllowed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * create an issue
 */
@Path("/issue/create")
public class IssueRestResource {

    @GET
    @AnonymousAllowed
    @Produces({MediaType.APPLICATION_JSON})
    public Response getMessage()
    {
       IssueRestResourceModel issueRestResourceModel = new IssueRestResourceModel();
       issueRestResourceModel.setMessage("MAJOM");
        return Response.ok(issueRestResourceModel).build();
    }
}