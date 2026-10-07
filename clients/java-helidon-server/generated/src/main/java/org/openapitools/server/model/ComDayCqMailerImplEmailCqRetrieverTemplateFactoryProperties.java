package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties   {

    private ConfigNodePropertyBoolean mailerEmailEmbed;
    private ConfigNodePropertyString mailerEmailCharset;
    private ConfigNodePropertyString mailerEmailRetrieverUserID;
    private ConfigNodePropertyString mailerEmailRetrieverUserPWD;

    /**
     * Default constructor.
     */
    public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.
     *
     * @param mailerEmailEmbed mailerEmailEmbed
     * @param mailerEmailCharset mailerEmailCharset
     * @param mailerEmailRetrieverUserID mailerEmailRetrieverUserID
     * @param mailerEmailRetrieverUserPWD mailerEmailRetrieverUserPWD
     */
    public ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties(
        ConfigNodePropertyBoolean mailerEmailEmbed, 
        ConfigNodePropertyString mailerEmailCharset, 
        ConfigNodePropertyString mailerEmailRetrieverUserID, 
        ConfigNodePropertyString mailerEmailRetrieverUserPWD
    ) {
        this.mailerEmailEmbed = mailerEmailEmbed;
        this.mailerEmailCharset = mailerEmailCharset;
        this.mailerEmailRetrieverUserID = mailerEmailRetrieverUserID;
        this.mailerEmailRetrieverUserPWD = mailerEmailRetrieverUserPWD;
    }



    /**
     * Get mailerEmailEmbed
     * @return mailerEmailEmbed
     */
    public ConfigNodePropertyBoolean getMailerEmailEmbed() {
        return mailerEmailEmbed;
    }

    public void setMailerEmailEmbed(ConfigNodePropertyBoolean mailerEmailEmbed) {
        this.mailerEmailEmbed = mailerEmailEmbed;
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
     * Get mailerEmailRetrieverUserID
     * @return mailerEmailRetrieverUserID
     */
    public ConfigNodePropertyString getMailerEmailRetrieverUserID() {
        return mailerEmailRetrieverUserID;
    }

    public void setMailerEmailRetrieverUserID(ConfigNodePropertyString mailerEmailRetrieverUserID) {
        this.mailerEmailRetrieverUserID = mailerEmailRetrieverUserID;
    }

    /**
     * Get mailerEmailRetrieverUserPWD
     * @return mailerEmailRetrieverUserPWD
     */
    public ConfigNodePropertyString getMailerEmailRetrieverUserPWD() {
        return mailerEmailRetrieverUserPWD;
    }

    public void setMailerEmailRetrieverUserPWD(ConfigNodePropertyString mailerEmailRetrieverUserPWD) {
        this.mailerEmailRetrieverUserPWD = mailerEmailRetrieverUserPWD;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {\n");
        
        sb.append("    mailerEmailEmbed: ").append(toIndentedString(mailerEmailEmbed)).append("\n");
        sb.append("    mailerEmailCharset: ").append(toIndentedString(mailerEmailCharset)).append("\n");
        sb.append("    mailerEmailRetrieverUserID: ").append(toIndentedString(mailerEmailRetrieverUserID)).append("\n");
        sb.append("    mailerEmailRetrieverUserPWD: ").append(toIndentedString(mailerEmailRetrieverUserPWD)).append("\n");
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

