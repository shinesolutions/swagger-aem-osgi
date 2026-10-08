package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("parameter.whitelist")
  private ConfigNodePropertyArray parameterWhitelist;

  @JsonProperty("parameter.whitelist.prefixes")
  private ConfigNodePropertyArray parameterWhitelistPrefixes;

  @JsonProperty("binary.parameter.whitelist")
  private ConfigNodePropertyArray binaryParameterWhitelist;

  @JsonProperty("modifier.whitelist")
  private ConfigNodePropertyArray modifierWhitelist;

  @JsonProperty("operation.whitelist")
  private ConfigNodePropertyArray operationWhitelist;

  @JsonProperty("operation.whitelist.prefixes")
  private ConfigNodePropertyArray operationWhitelistPrefixes;

  @JsonProperty("typehint.whitelist")
  private ConfigNodePropertyArray typehintWhitelist;

  @JsonProperty("resourcetype.whitelist")
  private ConfigNodePropertyArray resourcetypeWhitelist;

  /**
   * 
   * @return parameterWhitelist
   */
  public ConfigNodePropertyArray getParameterWhitelist() {
    return parameterWhitelist;
  }

  public void setParameterWhitelist(ConfigNodePropertyArray parameterWhitelist) {
    this.parameterWhitelist = parameterWhitelist;
  }

  /**
   * 
   * @return parameterWhitelistPrefixes
   */
  public ConfigNodePropertyArray getParameterWhitelistPrefixes() {
    return parameterWhitelistPrefixes;
  }

  public void setParameterWhitelistPrefixes(ConfigNodePropertyArray parameterWhitelistPrefixes) {
    this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
  }

  /**
   * 
   * @return binaryParameterWhitelist
   */
  public ConfigNodePropertyArray getBinaryParameterWhitelist() {
    return binaryParameterWhitelist;
  }

  public void setBinaryParameterWhitelist(ConfigNodePropertyArray binaryParameterWhitelist) {
    this.binaryParameterWhitelist = binaryParameterWhitelist;
  }

  /**
   * 
   * @return modifierWhitelist
   */
  public ConfigNodePropertyArray getModifierWhitelist() {
    return modifierWhitelist;
  }

  public void setModifierWhitelist(ConfigNodePropertyArray modifierWhitelist) {
    this.modifierWhitelist = modifierWhitelist;
  }

  /**
   * 
   * @return operationWhitelist
   */
  public ConfigNodePropertyArray getOperationWhitelist() {
    return operationWhitelist;
  }

  public void setOperationWhitelist(ConfigNodePropertyArray operationWhitelist) {
    this.operationWhitelist = operationWhitelist;
  }

  /**
   * 
   * @return operationWhitelistPrefixes
   */
  public ConfigNodePropertyArray getOperationWhitelistPrefixes() {
    return operationWhitelistPrefixes;
  }

  public void setOperationWhitelistPrefixes(ConfigNodePropertyArray operationWhitelistPrefixes) {
    this.operationWhitelistPrefixes = operationWhitelistPrefixes;
  }

  /**
   * 
   * @return typehintWhitelist
   */
  public ConfigNodePropertyArray getTypehintWhitelist() {
    return typehintWhitelist;
  }

  public void setTypehintWhitelist(ConfigNodePropertyArray typehintWhitelist) {
    this.typehintWhitelist = typehintWhitelist;
  }

  /**
   * 
   * @return resourcetypeWhitelist
   */
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
    return Objects.equals(this.parameterWhitelist, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.parameterWhitelist) &&
        Objects.equals(this.parameterWhitelistPrefixes, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.parameterWhitelistPrefixes) &&
        Objects.equals(this.binaryParameterWhitelist, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.binaryParameterWhitelist) &&
        Objects.equals(this.modifierWhitelist, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.modifierWhitelist) &&
        Objects.equals(this.operationWhitelist, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.operationWhitelist) &&
        Objects.equals(this.operationWhitelistPrefixes, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.operationWhitelistPrefixes) &&
        Objects.equals(this.typehintWhitelist, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.typehintWhitelist) &&
        Objects.equals(this.resourcetypeWhitelist, comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.resourcetypeWhitelist);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
