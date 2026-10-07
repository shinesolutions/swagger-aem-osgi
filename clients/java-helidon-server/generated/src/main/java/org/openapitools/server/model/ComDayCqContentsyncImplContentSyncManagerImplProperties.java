package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqContentsyncImplContentSyncManagerImplProperties   {

    private ConfigNodePropertyString contentsyncFallbackAuthorizable;
    private ConfigNodePropertyString contentsyncFallbackUpdateuser;

    /**
     * Default constructor.
     */
    public ComDayCqContentsyncImplContentSyncManagerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqContentsyncImplContentSyncManagerImplProperties.
     *
     * @param contentsyncFallbackAuthorizable contentsyncFallbackAuthorizable
     * @param contentsyncFallbackUpdateuser contentsyncFallbackUpdateuser
     */
    public ComDayCqContentsyncImplContentSyncManagerImplProperties(
        ConfigNodePropertyString contentsyncFallbackAuthorizable, 
        ConfigNodePropertyString contentsyncFallbackUpdateuser
    ) {
        this.contentsyncFallbackAuthorizable = contentsyncFallbackAuthorizable;
        this.contentsyncFallbackUpdateuser = contentsyncFallbackUpdateuser;
    }



    /**
     * Get contentsyncFallbackAuthorizable
     * @return contentsyncFallbackAuthorizable
     */
    public ConfigNodePropertyString getContentsyncFallbackAuthorizable() {
        return contentsyncFallbackAuthorizable;
    }

    public void setContentsyncFallbackAuthorizable(ConfigNodePropertyString contentsyncFallbackAuthorizable) {
        this.contentsyncFallbackAuthorizable = contentsyncFallbackAuthorizable;
    }

    /**
     * Get contentsyncFallbackUpdateuser
     * @return contentsyncFallbackUpdateuser
     */
    public ConfigNodePropertyString getContentsyncFallbackUpdateuser() {
        return contentsyncFallbackUpdateuser;
    }

    public void setContentsyncFallbackUpdateuser(ConfigNodePropertyString contentsyncFallbackUpdateuser) {
        this.contentsyncFallbackUpdateuser = contentsyncFallbackUpdateuser;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqContentsyncImplContentSyncManagerImplProperties {\n");
        
        sb.append("    contentsyncFallbackAuthorizable: ").append(toIndentedString(contentsyncFallbackAuthorizable)).append("\n");
        sb.append("    contentsyncFallbackUpdateuser: ").append(toIndentedString(contentsyncFallbackUpdateuser)).append("\n");
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

