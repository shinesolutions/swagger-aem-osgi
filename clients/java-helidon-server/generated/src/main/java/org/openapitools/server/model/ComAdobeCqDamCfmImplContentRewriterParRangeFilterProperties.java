package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties   {

    private ConfigNodePropertyString pipelineType;

    /**
     * Default constructor.
     */
    public ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties.
     *
     * @param pipelineType pipelineType
     */
    public ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties(
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
        sb.append("class ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties {\n");
        
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

