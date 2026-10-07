package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo   {

    private String pid;
    private String title;
    private String description;
    private ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties properties;

    /**
     * Default constructor.
     */
    public ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo.
     *
     * @param pid pid
     * @param title title
     * @param description description
     * @param properties properties
     */
    public ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo(
        String pid, 
        String title, 
        String description, 
        ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties properties
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
    public ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties getProperties() {
        return properties;
    }

    public void setProperties(ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties properties) {
        this.properties = properties;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo {\n");
        
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

