package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray parameterWhitelist;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray parameterWhitelistPrefixes;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray binaryParameterWhitelist;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray modifierWhitelist;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray operationWhitelist;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray operationWhitelistPrefixes;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray typehintWhitelist;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray resourcetypeWhitelist;
 /**
  * Get parameterWhitelist
  * @return parameterWhitelist
  */
  @JsonProperty("parameter.whitelist")
  public ConfigNodePropertyArray getParameterWhitelist() {
    return parameterWhitelist;
  }

  /**
   * Sets the <code>parameterWhitelist</code> property.
   */
 public void setParameterWhitelist(ConfigNodePropertyArray parameterWhitelist) {
    this.parameterWhitelist = parameterWhitelist;
  }

  /**
   * Sets the <code>parameterWhitelist</code> property.
   */
  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties parameterWhitelist(ConfigNodePropertyArray parameterWhitelist) {
    this.parameterWhitelist = parameterWhitelist;
    return this;
  }

 /**
  * Get parameterWhitelistPrefixes
  * @return parameterWhitelistPrefixes
  */
  @JsonProperty("parameter.whitelist.prefixes")
  public ConfigNodePropertyArray getParameterWhitelistPrefixes() {
    return parameterWhitelistPrefixes;
  }

  /**
   * Sets the <code>parameterWhitelistPrefixes</code> property.
   */
 public void setParameterWhitelistPrefixes(ConfigNodePropertyArray parameterWhitelistPrefixes) {
    this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
  }

  /**
   * Sets the <code>parameterWhitelistPrefixes</code> property.
   */
  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties parameterWhitelistPrefixes(ConfigNodePropertyArray parameterWhitelistPrefixes) {
    this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
    return this;
  }

 /**
  * Get binaryParameterWhitelist
  * @return binaryParameterWhitelist
  */
  @JsonProperty("binary.parameter.whitelist")
  public ConfigNodePropertyArray getBinaryParameterWhitelist() {
    return binaryParameterWhitelist;
  }

  /**
   * Sets the <code>binaryParameterWhitelist</code> property.
   */
 public void setBinaryParameterWhitelist(ConfigNodePropertyArray binaryParameterWhitelist) {
    this.binaryParameterWhitelist = binaryParameterWhitelist;
  }

  /**
   * Sets the <code>binaryParameterWhitelist</code> property.
   */
  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties binaryParameterWhitelist(ConfigNodePropertyArray binaryParameterWhitelist) {
    this.binaryParameterWhitelist = binaryParameterWhitelist;
    return this;
  }

 /**
  * Get modifierWhitelist
  * @return modifierWhitelist
  */
  @JsonProperty("modifier.whitelist")
  public ConfigNodePropertyArray getModifierWhitelist() {
    return modifierWhitelist;
  }

  /**
   * Sets the <code>modifierWhitelist</code> property.
   */
 public void setModifierWhitelist(ConfigNodePropertyArray modifierWhitelist) {
    this.modifierWhitelist = modifierWhitelist;
  }

  /**
   * Sets the <code>modifierWhitelist</code> property.
   */
  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties modifierWhitelist(ConfigNodePropertyArray modifierWhitelist) {
    this.modifierWhitelist = modifierWhitelist;
    return this;
  }

 /**
  * Get operationWhitelist
  * @return operationWhitelist
  */
  @JsonProperty("operation.whitelist")
  public ConfigNodePropertyArray getOperationWhitelist() {
    return operationWhitelist;
  }

  /**
   * Sets the <code>operationWhitelist</code> property.
   */
 public void setOperationWhitelist(ConfigNodePropertyArray operationWhitelist) {
    this.operationWhitelist = operationWhitelist;
  }

  /**
   * Sets the <code>operationWhitelist</code> property.
   */
  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties operationWhitelist(ConfigNodePropertyArray operationWhitelist) {
    this.operationWhitelist = operationWhitelist;
    return this;
  }

 /**
  * Get operationWhitelistPrefixes
  * @return operationWhitelistPrefixes
  */
  @JsonProperty("operation.whitelist.prefixes")
  public ConfigNodePropertyArray getOperationWhitelistPrefixes() {
    return operationWhitelistPrefixes;
  }

  /**
   * Sets the <code>operationWhitelistPrefixes</code> property.
   */
 public void setOperationWhitelistPrefixes(ConfigNodePropertyArray operationWhitelistPrefixes) {
    this.operationWhitelistPrefixes = operationWhitelistPrefixes;
  }

  /**
   * Sets the <code>operationWhitelistPrefixes</code> property.
   */
  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties operationWhitelistPrefixes(ConfigNodePropertyArray operationWhitelistPrefixes) {
    this.operationWhitelistPrefixes = operationWhitelistPrefixes;
    return this;
  }

 /**
  * Get typehintWhitelist
  * @return typehintWhitelist
  */
  @JsonProperty("typehint.whitelist")
  public ConfigNodePropertyArray getTypehintWhitelist() {
    return typehintWhitelist;
  }

  /**
   * Sets the <code>typehintWhitelist</code> property.
   */
 public void setTypehintWhitelist(ConfigNodePropertyArray typehintWhitelist) {
    this.typehintWhitelist = typehintWhitelist;
  }

  /**
   * Sets the <code>typehintWhitelist</code> property.
   */
  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties typehintWhitelist(ConfigNodePropertyArray typehintWhitelist) {
    this.typehintWhitelist = typehintWhitelist;
    return this;
  }

 /**
  * Get resourcetypeWhitelist
  * @return resourcetypeWhitelist
  */
  @JsonProperty("resourcetype.whitelist")
  public ConfigNodePropertyArray getResourcetypeWhitelist() {
    return resourcetypeWhitelist;
  }

  /**
   * Sets the <code>resourcetypeWhitelist</code> property.
   */
 public void setResourcetypeWhitelist(ConfigNodePropertyArray resourcetypeWhitelist) {
    this.resourcetypeWhitelist = resourcetypeWhitelist;
  }

  /**
   * Sets the <code>resourcetypeWhitelist</code> property.
   */
  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties resourcetypeWhitelist(ConfigNodePropertyArray resourcetypeWhitelist) {
    this.resourcetypeWhitelist = resourcetypeWhitelist;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties = (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties) o;
    return Objects.equals(this.parameterWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.parameterWhitelist) &&
        Objects.equals(this.parameterWhitelistPrefixes, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.parameterWhitelistPrefixes) &&
        Objects.equals(this.binaryParameterWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.binaryParameterWhitelist) &&
        Objects.equals(this.modifierWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.modifierWhitelist) &&
        Objects.equals(this.operationWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.operationWhitelist) &&
        Objects.equals(this.operationWhitelistPrefixes, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.operationWhitelistPrefixes) &&
        Objects.equals(this.typehintWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.typehintWhitelist) &&
        Objects.equals(this.resourcetypeWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.resourcetypeWhitelist);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

