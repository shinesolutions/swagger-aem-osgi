package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties   {

    private ConfigNodePropertyBoolean accepted;
    private ConfigNodePropertyInteger ranked;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.
     *
     * @param accepted accepted
     * @param ranked ranked
     */
    public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties(
        ConfigNodePropertyBoolean accepted, 
        ConfigNodePropertyInteger ranked
    ) {
        this.accepted = accepted;
        this.ranked = ranked;
    }



    /**
     * Get accepted
     * @return accepted
     */
    public ConfigNodePropertyBoolean getAccepted() {
        return accepted;
    }

    public void setAccepted(ConfigNodePropertyBoolean accepted) {
        this.accepted = accepted;
    }

    /**
     * Get ranked
     * @return ranked
     */
    public ConfigNodePropertyInteger getRanked() {
        return ranked;
    }

    public void setRanked(ConfigNodePropertyInteger ranked) {
        this.ranked = ranked;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties {\n");
        
        sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
        sb.append("    ranked: ").append(toIndentedString(ranked)).append("\n");
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

