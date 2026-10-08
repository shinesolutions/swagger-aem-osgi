package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties   {

    private ConfigNodePropertyString mailerEmailCharset;

    /**
     * Default constructor.
     */
    public ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties.
     *
     * @param mailerEmailCharset mailerEmailCharset
     */
    public ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties(
        ConfigNodePropertyString mailerEmailCharset
    ) {
        this.mailerEmailCharset = mailerEmailCharset;
    }



    /**
     * Get mailerEmailCharset
     * @return mailerEmailCharset
     */
    public ConfigNodePropertyString getMailerEmailCharset() {
        return mailerEmailCharset;
    }

    public void setMailerEmailCharset(ConfigNodePropertyString mailerEmailCharset) {
        this.mailerEmailCharset = mailerEmailCharset;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties {\n");
        
        sb.append("    mailerEmailCharset: ").append(toIndentedString(mailerEmailCharset)).append("\n");
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

