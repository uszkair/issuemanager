package com.jira.plugins.rest;
//
//import com.atlassian.jira.component.ComponentAccessor;
//import com.atlassian.jira.project.Project;
//import com.atlassian.jira.issue.issuetype.IssueType;

import com.atlassian.jira.component.ComponentAccessor;
import com.atlassian.jira.project.Project;
import com.atlassian.plugins.rest.common.security.AnonymousAllowed;
import sun.awt.AWTAccessor;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;

/**
 * create an issue
 */
@Path("/issue/create")
public class IssueRestResource {

    private String issueTypeName = null;

    @GET
    @AnonymousAllowed
    @Produces({MediaType.APPLICATION_JSON})
    public Response getMessage()
    {

        Project project = ComponentAccessor.getProjectManager().getProjectObjByKey("");
//        IssueType issueTypeObj = getIssueType(project);
//
//








       IssueRestResourceModel issueRestResourceModel = new IssueRestResourceModel();
       issueRestResourceModel.setMessage("Hello World");
        return Response.ok(issueRestResourceModel).build();
    }

//    private IssueType getIssueType(Project project){
//        if(project!=null){
//            Collection<IssueType> issueTypes = project.getIssueTypes();
//            for(IssueType issueType: issueTypes){
//                if(issueType.getName().equals(issueTypeName)){
//                    return issueType;
//                }
//            }
//        }
//        return null;
//    }
}