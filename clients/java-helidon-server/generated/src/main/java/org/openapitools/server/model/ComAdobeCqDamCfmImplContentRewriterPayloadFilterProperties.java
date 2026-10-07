package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties   {

    private ConfigNodePropertyString pipelineType;

    /**
     * Default constructor.
     */
    public ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties.
     *
     * @param pipelineType pipelineType
     */
    public ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties(
        ConfigNodePropertyString pipelineType
    ) {
        this.pipelineType = pipelineType;
    }



    /**
     * Get pipelineType
     * @return pipelineType
     */
    public ConfigNodePropertyString getPipelineType() {
        return pipelineType;
    }

    public void setPipelineType(ConfigNodePropertyString pipelineType) {
        this.pipelineType = pipelineType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties {\n");
        
        sb.append("    pipelineType: ").append(toIndentedString(pipelineType)).append("\n");
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

