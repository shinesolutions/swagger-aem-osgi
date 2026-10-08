package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo   {

    private String pid;
    private String title;
    private String description;
    private ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties properties;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo.
     *
     * @param pid pid
     * @param title title
     * @param description description
     * @param properties properties
     */
    public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo(
        String pid, 
        String title, 
        String description, 
        ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties properties
    ) {
        this.pid = pid;
        this.title = title;
        this.description = description;
        this.properties = properties;
    }



    /**
     * Get pid
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * Get title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get properties
     * @return properties
     */
    public ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties getProperties() {
        return properties;
    }

    public void setProperties(ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties properties) {
        this.properties = properties;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo {\n");
        
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

