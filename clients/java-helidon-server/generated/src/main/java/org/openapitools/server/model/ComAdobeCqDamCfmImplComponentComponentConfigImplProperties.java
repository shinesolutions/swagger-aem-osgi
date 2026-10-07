package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties   {

    private ConfigNodePropertyString damCfmComponentResourceType;
    private ConfigNodePropertyString damCfmComponentFileReferenceProp;
    private ConfigNodePropertyString damCfmComponentElementsProp;
    private ConfigNodePropertyString damCfmComponentVariationProp;

    /**
     * Default constructor.
     */
    public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.
     *
     * @param damCfmComponentResourceType damCfmComponentResourceType
     * @param damCfmComponentFileReferenceProp damCfmComponentFileReferenceProp
     * @param damCfmComponentElementsProp damCfmComponentElementsProp
     * @param damCfmComponentVariationProp damCfmComponentVariationProp
     */
    public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties(
        ConfigNodePropertyString damCfmComponentResourceType, 
        ConfigNodePropertyString damCfmComponentFileReferenceProp, 
        ConfigNodePropertyString damCfmComponentElementsProp, 
        ConfigNodePropertyString damCfmComponentVariationProp
    ) {
        this.damCfmComponentResourceType = damCfmComponentResourceType;
        this.damCfmComponentFileReferenceProp = damCfmComponentFileReferenceProp;
        this.damCfmComponentElementsProp = damCfmComponentElementsProp;
        this.damCfmComponentVariationProp = damCfmComponentVariationProp;
    }



    /**
     * Get damCfmComponentResourceType
     * @return damCfmComponentResourceType
     */
    public ConfigNodePropertyString getDamCfmComponentResourceType() {
        return damCfmComponentResourceType;
    }

    public void setDamCfmComponentResourceType(ConfigNodePropertyString damCfmComponentResourceType) {
        this.damCfmComponentResourceType = damCfmComponentResourceType;
    }

    /**
     * Get damCfmComponentFileReferenceProp
     * @return damCfmComponentFileReferenceProp
     */
    public ConfigNodePropertyString getDamCfmComponentFileReferenceProp() {
        return damCfmComponentFileReferenceProp;
    }

    public void setDamCfmComponentFileReferenceProp(ConfigNodePropertyString damCfmComponentFileReferenceProp) {
        this.damCfmComponentFileReferenceProp = damCfmComponentFileReferenceProp;
    }

    /**
     * Get damCfmComponentElementsProp
     * @return damCfmComponentElementsProp
     */
    public ConfigNodePropertyString getDamCfmComponentElementsProp() {
        return damCfmComponentElementsProp;
    }

    public void setDamCfmComponentElementsProp(ConfigNodePropertyString damCfmComponentElementsProp) {
        this.damCfmComponentElementsProp = damCfmComponentElementsProp;
    }

    /**
     * Get damCfmComponentVariationProp
     * @return damCfmComponentVariationProp
     */
    public ConfigNodePropertyString getDamCfmComponentVariationProp() {
        return damCfmComponentVariationProp;
    }

    public void setDamCfmComponentVariationProp(ConfigNodePropertyString damCfmComponentVariationProp) {
        this.damCfmComponentVariationProp = damCfmComponentVariationProp;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties {\n");
        
        sb.append("    damCfmComponentResourceType: ").append(toIndentedString(damCfmComponentResourceType)).append("\n");
        sb.append("    damCfmComponentFileReferenceProp: ").append(toIndentedString(damCfmComponentFileReferenceProp)).append("\n");
        sb.append("    damCfmComponentElementsProp: ").append(toIndentedString(damCfmComponentElementsProp)).append("\n");
        sb.append("    damCfmComponentVariationProp: ").append(toIndentedString(damCfmComponentVariationProp)).append("\n");
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

