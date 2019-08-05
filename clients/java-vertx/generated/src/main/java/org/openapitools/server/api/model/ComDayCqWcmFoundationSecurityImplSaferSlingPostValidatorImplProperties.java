package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties   {
  
  private ConfigNodePropertyArray parameterWhitelist = null;
  private ConfigNodePropertyArray parameterWhitelistPrefixes = null;
  private ConfigNodePropertyArray binaryParameterWhitelist = null;
  private ConfigNodePropertyArray modifierWhitelist = null;
  private ConfigNodePropertyArray operationWhitelist = null;
  private ConfigNodePropertyArray operationWhitelistPrefixes = null;
  private ConfigNodePropertyArray typehintWhitelist = null;
  private ConfigNodePropertyArray resourcetypeWhitelist = null;

  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties () {

  }

  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties (ConfigNodePropertyArray parameterWhitelist, ConfigNodePropertyArray parameterWhitelistPrefixes, ConfigNodePropertyArray binaryParameterWhitelist, ConfigNodePropertyArray modifierWhitelist, ConfigNodePropertyArray operationWhitelist, ConfigNodePropertyArray operationWhitelistPrefixes, ConfigNodePropertyArray typehintWhitelist, ConfigNodePropertyArray resourcetypeWhitelist) {
    this.parameterWhitelist = parameterWhitelist;
    this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
    this.binaryParameterWhitelist = binaryParameterWhitelist;
    this.modifierWhitelist = modifierWhitelist;
    this.operationWhitelist = operationWhitelist;
    this.operationWhitelistPrefixes = operationWhitelistPrefixes;
    this.typehintWhitelist = typehintWhitelist;
    this.resourcetypeWhitelist = resourcetypeWhitelist;
  }

    
  @JsonProperty("parameter.whitelist")
  public ConfigNodePropertyArray getParameterWhitelist() {
    return parameterWhitelist;
  }
  public void setParameterWhitelist(ConfigNodePropertyArray parameterWhitelist) {
    this.parameterWhitelist = parameterWhitelist;
  }

    
  @JsonProperty("parameter.whitelist.prefixes")
  public ConfigNodePropertyArray getParameterWhitelistPrefixes() {
    return parameterWhitelistPrefixes;
  }
  public void setParameterWhitelistPrefixes(ConfigNodePropertyArray parameterWhitelistPrefixes) {
    this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
  }

    
  @JsonProperty("binary.parameter.whitelist")
  public ConfigNodePropertyArray getBinaryParameterWhitelist() {
    return binaryParameterWhitelist;
  }
  public void setBinaryParameterWhitelist(ConfigNodePropertyArray binaryParameterWhitelist) {
    this.binaryParameterWhitelist = binaryParameterWhitelist;
  }

    
  @JsonProperty("modifier.whitelist")
  public ConfigNodePropertyArray getModifierWhitelist() {
    return modifierWhitelist;
  }
  public void setModifierWhitelist(ConfigNodePropertyArray modifierWhitelist) {
    this.modifierWhitelist = modifierWhitelist;
  }

    
  @JsonProperty("operation.whitelist")
  public ConfigNodePropertyArray getOperationWhitelist() {
    return operationWhitelist;
  }
  public void setOperationWhitelist(ConfigNodePropertyArray operationWhitelist) {
    this.operationWhitelist = operationWhitelist;
  }

    
  @JsonProperty("operation.whitelist.prefixes")
  public ConfigNodePropertyArray getOperationWhitelistPrefixes() {
    return operationWhitelistPrefixes;
  }
  public void setOperationWhitelistPrefixes(ConfigNodePropertyArray operationWhitelistPrefixes) {
    this.operationWhitelistPrefixes = operationWhitelistPrefixes;
  }

    
  @JsonProperty("typehint.whitelist")
  public ConfigNodePropertyArray getTypehintWhitelist() {
    return typehintWhitelist;
  }
  public void setTypehintWhitelist(ConfigNodePropertyArray typehintWhitelist) {
    this.typehintWhitelist = typehintWhitelist;
  }

    
  @JsonProperty("resourcetype.whitelist")
  public ConfigNodePropertyArray getResourcetypeWhitelist() {
    return resourcetypeWhitelist;
  }
  public void setResourcetypeWhitelist(ConfigNodePropertyArray resourcetypeWhitelist) {
    this.resourcetypeWhitelist = resourcetypeWhitelist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties = (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties) o;
    return Objects.equals(parameterWhitelist, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.parameterWhitelist) &&
        Objects.equals(parameterWhitelistPrefixes, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.parameterWhitelistPrefixes) &&
        Objects.equals(binaryParameterWhitelist, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.binaryParameterWhitelist) &&
        Objects.equals(modifierWhitelist, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.modifierWhitelist) &&
        Objects.equals(operationWhitelist, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.operationWhitelist) &&
        Objects.equals(operationWhitelistPrefixes, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.operationWhitelistPrefixes) &&
        Objects.equals(typehintWhitelist, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.typehintWhitelist) &&
        Objects.equals(resourcetypeWhitelist, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.resourcetypeWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterWhitelist, parameterWhitelistPrefixes, binaryParameterWhitelist, modifierWhitelist, operationWhitelist, operationWhitelistPrefixes, typehintWhitelist, resourcetypeWhitelist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
