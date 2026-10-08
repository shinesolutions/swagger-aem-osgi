package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties   {

    private ConfigNodePropertyDropDown connectProtocol;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties.
     *
     * @param connectProtocol connectProtocol
     */
    public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties(
        ConfigNodePropertyDropDown connectProtocol
    ) {
        this.connectProtocol = connectProtocol;
    }



    /**
     * Get connectProtocol
     * @return connectProtocol
     */
    public ConfigNodePropertyDropDown getConnectProtocol() {
        return connectProtocol;
    }

    public void setConnectProtocol(ConfigNodePropertyDropDown connectProtocol) {
        this.connectProtocol = connectProtocol;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties {\n");
        
        sb.append("    connectProtocol: ").append(toIndentedString(connectProtocol)).append("\n");
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

