package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties   {
  private ConfigNodePropertyArray parameterWhitelist;
  private ConfigNodePropertyArray parameterWhitelistPrefixes;
  private ConfigNodePropertyArray binaryParameterWhitelist;
  private ConfigNodePropertyArray modifierWhitelist;
  private ConfigNodePropertyArray operationWhitelist;
  private ConfigNodePropertyArray operationWhitelistPrefixes;
  private ConfigNodePropertyArray typehintWhitelist;
  private ConfigNodePropertyArray resourcetypeWhitelist;

  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties() {
  }

  /**
   **/
  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties parameterWhitelist(ConfigNodePropertyArray parameterWhitelist) {
    this.parameterWhitelist = parameterWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("parameter.whitelist")
  @Valid public ConfigNodePropertyArray getParameterWhitelist() {
    return parameterWhitelist;
  }

  @JsonProperty("parameter.whitelist")
  public void setParameterWhitelist(ConfigNodePropertyArray parameterWhitelist) {
    this.parameterWhitelist = parameterWhitelist;
  }

  /**
   **/
  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties parameterWhitelistPrefixes(ConfigNodePropertyArray parameterWhitelistPrefixes) {
    this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("parameter.whitelist.prefixes")
  @Valid public ConfigNodePropertyArray getParameterWhitelistPrefixes() {
    return parameterWhitelistPrefixes;
  }

  @JsonProperty("parameter.whitelist.prefixes")
  public void setParameterWhitelistPrefixes(ConfigNodePropertyArray parameterWhitelistPrefixes) {
    this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
  }

  /**
   **/
  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties binaryParameterWhitelist(ConfigNodePropertyArray binaryParameterWhitelist) {
    this.binaryParameterWhitelist = binaryParameterWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("binary.parameter.whitelist")
  @Valid public ConfigNodePropertyArray getBinaryParameterWhitelist() {
    return binaryParameterWhitelist;
  }

  @JsonProperty("binary.parameter.whitelist")
  public void setBinaryParameterWhitelist(ConfigNodePropertyArray binaryParameterWhitelist) {
    this.binaryParameterWhitelist = binaryParameterWhitelist;
  }

  /**
   **/
  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties modifierWhitelist(ConfigNodePropertyArray modifierWhitelist) {
    this.modifierWhitelist = modifierWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("modifier.whitelist")
  @Valid public ConfigNodePropertyArray getModifierWhitelist() {
    return modifierWhitelist;
  }

  @JsonProperty("modifier.whitelist")
  public void setModifierWhitelist(ConfigNodePropertyArray modifierWhitelist) {
    this.modifierWhitelist = modifierWhitelist;
  }

  /**
   **/
  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties operationWhitelist(ConfigNodePropertyArray operationWhitelist) {
    this.operationWhitelist = operationWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("operation.whitelist")
  @Valid public ConfigNodePropertyArray getOperationWhitelist() {
    return operationWhitelist;
  }

  @JsonProperty("operation.whitelist")
  public void setOperationWhitelist(ConfigNodePropertyArray operationWhitelist) {
    this.operationWhitelist = operationWhitelist;
  }

  /**
   **/
  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties operationWhitelistPrefixes(ConfigNodePropertyArray operationWhitelistPrefixes) {
    this.operationWhitelistPrefixes = operationWhitelistPrefixes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("operation.whitelist.prefixes")
  @Valid public ConfigNodePropertyArray getOperationWhitelistPrefixes() {
    return operationWhitelistPrefixes;
  }

  @JsonProperty("operation.whitelist.prefixes")
  public void setOperationWhitelistPrefixes(ConfigNodePropertyArray operationWhitelistPrefixes) {
    this.operationWhitelistPrefixes = operationWhitelistPrefixes;
  }

  /**
   **/
  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties typehintWhitelist(ConfigNodePropertyArray typehintWhitelist) {
    this.typehintWhitelist = typehintWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("typehint.whitelist")
  @Valid public ConfigNodePropertyArray getTypehintWhitelist() {
    return typehintWhitelist;
  }

  @JsonProperty("typehint.whitelist")
  public void setTypehintWhitelist(ConfigNodePropertyArray typehintWhitelist) {
    this.typehintWhitelist = typehintWhitelist;
  }

  /**
   **/
  public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties resourcetypeWhitelist(ConfigNodePropertyArray resourcetypeWhitelist) {
    this.resourcetypeWhitelist = resourcetypeWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resourcetype.whitelist")
  @Valid public ConfigNodePropertyArray getResourcetypeWhitelist() {
    return resourcetypeWhitelist;
  }

  @JsonProperty("resourcetype.whitelist")
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
