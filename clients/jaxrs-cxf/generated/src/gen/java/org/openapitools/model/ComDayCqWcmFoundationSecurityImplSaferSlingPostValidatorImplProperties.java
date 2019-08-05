package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray parameterWhitelist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray parameterWhitelistPrefixes = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray binaryParameterWhitelist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray modifierWhitelist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray operationWhitelist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray operationWhitelistPrefixes = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray typehintWhitelist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourcetypeWhitelist = null;
 /**
   * Get parameterWhitelist
   * @return parameterWhitelist
  **/
  @JsonProperty("parameter.whitelist")
  public ConfigNodePropertyArray getParameterWhitelist() {
    return parameterWhitelist;
  }

  public void setParameterWhitelist(ConfigNodePropertyArray parameterWhitelist) {
    this.parameterWhitelist = parameterWhitelist;
  }

  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties parameterWhitelist(ConfigNodePropertyArray parameterWhitelist) {
    this.parameterWhitelist = parameterWhitelist;
    return this;
  }

 /**
   * Get parameterWhitelistPrefixes
   * @return parameterWhitelistPrefixes
  **/
  @JsonProperty("parameter.whitelist.prefixes")
  public ConfigNodePropertyArray getParameterWhitelistPrefixes() {
    return parameterWhitelistPrefixes;
  }

  public void setParameterWhitelistPrefixes(ConfigNodePropertyArray parameterWhitelistPrefixes) {
    this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
  }

  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties parameterWhitelistPrefixes(ConfigNodePropertyArray parameterWhitelistPrefixes) {
    this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
    return this;
  }

 /**
   * Get binaryParameterWhitelist
   * @return binaryParameterWhitelist
  **/
  @JsonProperty("binary.parameter.whitelist")
  public ConfigNodePropertyArray getBinaryParameterWhitelist() {
    return binaryParameterWhitelist;
  }

  public void setBinaryParameterWhitelist(ConfigNodePropertyArray binaryParameterWhitelist) {
    this.binaryParameterWhitelist = binaryParameterWhitelist;
  }

  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties binaryParameterWhitelist(ConfigNodePropertyArray binaryParameterWhitelist) {
    this.binaryParameterWhitelist = binaryParameterWhitelist;
    return this;
  }

 /**
   * Get modifierWhitelist
   * @return modifierWhitelist
  **/
  @JsonProperty("modifier.whitelist")
  public ConfigNodePropertyArray getModifierWhitelist() {
    return modifierWhitelist;
  }

  public void setModifierWhitelist(ConfigNodePropertyArray modifierWhitelist) {
    this.modifierWhitelist = modifierWhitelist;
  }

  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties modifierWhitelist(ConfigNodePropertyArray modifierWhitelist) {
    this.modifierWhitelist = modifierWhitelist;
    return this;
  }

 /**
   * Get operationWhitelist
   * @return operationWhitelist
  **/
  @JsonProperty("operation.whitelist")
  public ConfigNodePropertyArray getOperationWhitelist() {
    return operationWhitelist;
  }

  public void setOperationWhitelist(ConfigNodePropertyArray operationWhitelist) {
    this.operationWhitelist = operationWhitelist;
  }

  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties operationWhitelist(ConfigNodePropertyArray operationWhitelist) {
    this.operationWhitelist = operationWhitelist;
    return this;
  }

 /**
   * Get operationWhitelistPrefixes
   * @return operationWhitelistPrefixes
  **/
  @JsonProperty("operation.whitelist.prefixes")
  public ConfigNodePropertyArray getOperationWhitelistPrefixes() {
    return operationWhitelistPrefixes;
  }

  public void setOperationWhitelistPrefixes(ConfigNodePropertyArray operationWhitelistPrefixes) {
    this.operationWhitelistPrefixes = operationWhitelistPrefixes;
  }

  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties operationWhitelistPrefixes(ConfigNodePropertyArray operationWhitelistPrefixes) {
    this.operationWhitelistPrefixes = operationWhitelistPrefixes;
    return this;
  }

 /**
   * Get typehintWhitelist
   * @return typehintWhitelist
  **/
  @JsonProperty("typehint.whitelist")
  public ConfigNodePropertyArray getTypehintWhitelist() {
    return typehintWhitelist;
  }

  public void setTypehintWhitelist(ConfigNodePropertyArray typehintWhitelist) {
    this.typehintWhitelist = typehintWhitelist;
  }

  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties typehintWhitelist(ConfigNodePropertyArray typehintWhitelist) {
    this.typehintWhitelist = typehintWhitelist;
    return this;
  }

 /**
   * Get resourcetypeWhitelist
   * @return resourcetypeWhitelist
  **/
  @JsonProperty("resourcetype.whitelist")
  public ConfigNodePropertyArray getResourcetypeWhitelist() {
    return resourcetypeWhitelist;
  }

  public void setResourcetypeWhitelist(ConfigNodePropertyArray resourcetypeWhitelist) {
    this.resourcetypeWhitelist = resourcetypeWhitelist;
  }

  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties resourcetypeWhitelist(ConfigNodePropertyArray resourcetypeWhitelist) {
    this.resourcetypeWhitelist = resourcetypeWhitelist;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

