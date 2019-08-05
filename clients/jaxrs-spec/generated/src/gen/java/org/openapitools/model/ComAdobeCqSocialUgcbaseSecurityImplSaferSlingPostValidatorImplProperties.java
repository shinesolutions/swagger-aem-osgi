package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties   {
  
  private @Valid ConfigNodePropertyArray parameterWhitelist = null;
  private @Valid ConfigNodePropertyArray parameterWhitelistPrefixes = null;
  private @Valid ConfigNodePropertyArray binaryParameterWhitelist = null;
  private @Valid ConfigNodePropertyArray modifierWhitelist = null;
  private @Valid ConfigNodePropertyArray operationWhitelist = null;
  private @Valid ConfigNodePropertyArray operationWhitelistPrefixes = null;
  private @Valid ConfigNodePropertyArray typehintWhitelist = null;
  private @Valid ConfigNodePropertyArray resourcetypeWhitelist = null;

  /**
   **/
  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties parameterWhitelist(ConfigNodePropertyArray parameterWhitelist) {
    this.parameterWhitelist = parameterWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("parameter.whitelist")
  public ConfigNodePropertyArray getParameterWhitelist() {
    return parameterWhitelist;
  }
  public void setParameterWhitelist(ConfigNodePropertyArray parameterWhitelist) {
    this.parameterWhitelist = parameterWhitelist;
  }

  /**
   **/
  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties parameterWhitelistPrefixes(ConfigNodePropertyArray parameterWhitelistPrefixes) {
    this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("parameter.whitelist.prefixes")
  public ConfigNodePropertyArray getParameterWhitelistPrefixes() {
    return parameterWhitelistPrefixes;
  }
  public void setParameterWhitelistPrefixes(ConfigNodePropertyArray parameterWhitelistPrefixes) {
    this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
  }

  /**
   **/
  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties binaryParameterWhitelist(ConfigNodePropertyArray binaryParameterWhitelist) {
    this.binaryParameterWhitelist = binaryParameterWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("binary.parameter.whitelist")
  public ConfigNodePropertyArray getBinaryParameterWhitelist() {
    return binaryParameterWhitelist;
  }
  public void setBinaryParameterWhitelist(ConfigNodePropertyArray binaryParameterWhitelist) {
    this.binaryParameterWhitelist = binaryParameterWhitelist;
  }

  /**
   **/
  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties modifierWhitelist(ConfigNodePropertyArray modifierWhitelist) {
    this.modifierWhitelist = modifierWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("modifier.whitelist")
  public ConfigNodePropertyArray getModifierWhitelist() {
    return modifierWhitelist;
  }
  public void setModifierWhitelist(ConfigNodePropertyArray modifierWhitelist) {
    this.modifierWhitelist = modifierWhitelist;
  }

  /**
   **/
  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties operationWhitelist(ConfigNodePropertyArray operationWhitelist) {
    this.operationWhitelist = operationWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("operation.whitelist")
  public ConfigNodePropertyArray getOperationWhitelist() {
    return operationWhitelist;
  }
  public void setOperationWhitelist(ConfigNodePropertyArray operationWhitelist) {
    this.operationWhitelist = operationWhitelist;
  }

  /**
   **/
  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties operationWhitelistPrefixes(ConfigNodePropertyArray operationWhitelistPrefixes) {
    this.operationWhitelistPrefixes = operationWhitelistPrefixes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("operation.whitelist.prefixes")
  public ConfigNodePropertyArray getOperationWhitelistPrefixes() {
    return operationWhitelistPrefixes;
  }
  public void setOperationWhitelistPrefixes(ConfigNodePropertyArray operationWhitelistPrefixes) {
    this.operationWhitelistPrefixes = operationWhitelistPrefixes;
  }

  /**
   **/
  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties typehintWhitelist(ConfigNodePropertyArray typehintWhitelist) {
    this.typehintWhitelist = typehintWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("typehint.whitelist")
  public ConfigNodePropertyArray getTypehintWhitelist() {
    return typehintWhitelist;
  }
  public void setTypehintWhitelist(ConfigNodePropertyArray typehintWhitelist) {
    this.typehintWhitelist = typehintWhitelist;
  }

  /**
   **/
  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties resourcetypeWhitelist(ConfigNodePropertyArray resourcetypeWhitelist) {
    this.resourcetypeWhitelist = resourcetypeWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("resourcetype.whitelist")
  public ConfigNodePropertyArray getResourcetypeWhitelist() {
    return resourcetypeWhitelist;
  }
  public void setResourcetypeWhitelist(ConfigNodePropertyArray resourcetypeWhitelist) {
    this.resourcetypeWhitelist = resourcetypeWhitelist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties = (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties) o;
    return Objects.equals(parameterWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.parameterWhitelist) &&
        Objects.equals(parameterWhitelistPrefixes, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.parameterWhitelistPrefixes) &&
        Objects.equals(binaryParameterWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.binaryParameterWhitelist) &&
        Objects.equals(modifierWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.modifierWhitelist) &&
        Objects.equals(operationWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.operationWhitelist) &&
        Objects.equals(operationWhitelistPrefixes, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.operationWhitelistPrefixes) &&
        Objects.equals(typehintWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.typehintWhitelist) &&
        Objects.equals(resourcetypeWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.resourcetypeWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterWhitelist, parameterWhitelistPrefixes, binaryParameterWhitelist, modifierWhitelist, operationWhitelist, operationWhitelistPrefixes, typehintWhitelist, resourcetypeWhitelist);
  }

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

