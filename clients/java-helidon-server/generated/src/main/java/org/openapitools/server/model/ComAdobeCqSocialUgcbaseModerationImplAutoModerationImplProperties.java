package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties   {

    private ConfigNodePropertyArray automoderationSequence;
    private ConfigNodePropertyBoolean automoderationOnfailurestop;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.
     *
     * @param automoderationSequence automoderationSequence
     * @param automoderationOnfailurestop automoderationOnfailurestop
     */
    public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties(
        ConfigNodePropertyArray automoderationSequence, 
        ConfigNodePropertyBoolean automoderationOnfailurestop
    ) {
        this.automoderationSequence = automoderationSequence;
        this.automoderationOnfailurestop = automoderationOnfailurestop;
    }



    /**
     * Get automoderationSequence
     * @return automoderationSequence
     */
    public ConfigNodePropertyArray getAutomoderationSequence() {
        return automoderationSequence;
    }

    public void setAutomoderationSequence(ConfigNodePropertyArray automoderationSequence) {
        this.automoderationSequence = automoderationSequence;
    }

    /**
     * Get automoderationOnfailurestop
     * @return automoderationOnfailurestop
     */
    public ConfigNodePropertyBoolean getAutomoderationOnfailurestop() {
        return automoderationOnfailurestop;
    }

    public void setAutomoderationOnfailurestop(ConfigNodePropertyBoolean automoderationOnfailurestop) {
        this.automoderationOnfailurestop = automoderationOnfailurestop;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties {\n");
        
        sb.append("    automoderationSequence: ").append(toIndentedString(automoderationSequence)).append("\n");
        sb.append("    automoderationOnfailurestop: ").append(toIndentedString(automoderationOnfailurestop)).append("\n");
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

