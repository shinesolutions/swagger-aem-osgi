package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties   {

    private ConfigNodePropertyArray parameterWhitelist;
    private ConfigNodePropertyArray parameterWhitelistPrefixes;
    private ConfigNodePropertyArray binaryParameterWhitelist;
    private ConfigNodePropertyArray modifierWhitelist;
    private ConfigNodePropertyArray operationWhitelist;
    private ConfigNodePropertyArray operationWhitelistPrefixes;
    private ConfigNodePropertyArray typehintWhitelist;
    private ConfigNodePropertyArray resourcetypeWhitelist;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.
     *
     * @param parameterWhitelist parameterWhitelist
     * @param parameterWhitelistPrefixes parameterWhitelistPrefixes
     * @param binaryParameterWhitelist binaryParameterWhitelist
     * @param modifierWhitelist modifierWhitelist
     * @param operationWhitelist operationWhitelist
     * @param operationWhitelistPrefixes operationWhitelistPrefixes
     * @param typehintWhitelist typehintWhitelist
     * @param resourcetypeWhitelist resourcetypeWhitelist
     */
    public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties(
        ConfigNodePropertyArray parameterWhitelist, 
        ConfigNodePropertyArray parameterWhitelistPrefixes, 
        ConfigNodePropertyArray binaryParameterWhitelist, 
        ConfigNodePropertyArray modifierWhitelist, 
        ConfigNodePropertyArray operationWhitelist, 
        ConfigNodePropertyArray operationWhitelistPrefixes, 
        ConfigNodePropertyArray typehintWhitelist, 
        ConfigNodePropertyArray resourcetypeWhitelist
    ) {
        this.parameterWhitelist = parameterWhitelist;
        this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
        this.binaryParameterWhitelist = binaryParameterWhitelist;
        this.modifierWhitelist = modifierWhitelist;
        this.operationWhitelist = operationWhitelist;
        this.operationWhitelistPrefixes = operationWhitelistPrefixes;
        this.typehintWhitelist = typehintWhitelist;
        this.resourcetypeWhitelist = resourcetypeWhitelist;
    }



    /**
     * Get parameterWhitelist
     * @return parameterWhitelist
     */
    public ConfigNodePropertyArray getParameterWhitelist() {
        return parameterWhitelist;
    }

    public void setParameterWhitelist(ConfigNodePropertyArray parameterWhitelist) {
        this.parameterWhitelist = parameterWhitelist;
    }

    /**
     * Get parameterWhitelistPrefixes
     * @return parameterWhitelistPrefixes
     */
    public ConfigNodePropertyArray getParameterWhitelistPrefixes() {
        return parameterWhitelistPrefixes;
    }

    public void setParameterWhitelistPrefixes(ConfigNodePropertyArray parameterWhitelistPrefixes) {
        this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
    }

    /**
     * Get binaryParameterWhitelist
     * @return binaryParameterWhitelist
     */
    public ConfigNodePropertyArray getBinaryParameterWhitelist() {
        return binaryParameterWhitelist;
    }

    public void setBinaryParameterWhitelist(ConfigNodePropertyArray binaryParameterWhitelist) {
        this.binaryParameterWhitelist = binaryParameterWhitelist;
    }

    /**
     * Get modifierWhitelist
     * @return modifierWhitelist
     */
    public ConfigNodePropertyArray getModifierWhitelist() {
        return modifierWhitelist;
    }

    public void setModifierWhitelist(ConfigNodePropertyArray modifierWhitelist) {
        this.modifierWhitelist = modifierWhitelist;
    }

    /**
     * Get operationWhitelist
     * @return operationWhitelist
     */
    public ConfigNodePropertyArray getOperationWhitelist() {
        return operationWhitelist;
    }

    public void setOperationWhitelist(ConfigNodePropertyArray operationWhitelist) {
        this.operationWhitelist = operationWhitelist;
    }

    /**
     * Get operationWhitelistPrefixes
     * @return operationWhitelistPrefixes
     */
    public ConfigNodePropertyArray getOperationWhitelistPrefixes() {
        return operationWhitelistPrefixes;
    }

    public void setOperationWhitelistPrefixes(ConfigNodePropertyArray operationWhitelistPrefixes) {
        this.operationWhitelistPrefixes = operationWhitelistPrefixes;
    }

    /**
     * Get typehintWhitelist
     * @return typehintWhitelist
     */
    public ConfigNodePropertyArray getTypehintWhitelist() {
        return typehintWhitelist;
    }

    public void setTypehintWhitelist(ConfigNodePropertyArray typehintWhitelist) {
        this.typehintWhitelist = typehintWhitelist;
    }

    /**
     * Get resourcetypeWhitelist
     * @return resourcetypeWhitelist
     */
    public ConfigNodePropertyArray getResourcetypeWhitelist() {
        return resourcetypeWhitelist;
    }

    public void setResourcetypeWhitelist(ConfigNodePropertyArray resourcetypeWhitelist) {
        this.resourcetypeWhitelist = resourcetypeWhitelist;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties {\n");
        
        sb.append("    parameterWhitelist: ").append(toIndentedString(parameterWhitelist)).append("\n");
        sb.append("    parameterWhitelistPrefixes: ").append(toIndentedString(parameterWhitelistPrefixes)).append("\n");
        sb.append("    binaryParameterWhitelist: ").append(toIndentedString(binaryParameterWhitelist)).append("\n");
        sb.append("    modifierWhitelist: ").append(toIndentedString(modifierWhitelist)).append("\n");
        sb.append("    operationWhitelist: ").append(toIndentedString(operationWhitelist)).append("\n");
        sb.append("    operationWhitelistPrefixes: ").append(toIndentedString(operationWhitelistPrefixes)).append("\n");
        sb.append("    typehintWhitelist: ").append(toIndentedString(typehintWhitelist)).append("\n");
        sb.append("    resourcetypeWhitelist: ").append(toIndentedString(resourcetypeWhitelist)).append("\n");
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

