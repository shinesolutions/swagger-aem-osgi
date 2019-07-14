/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-14T23:44:05.965Z[GMT]")
public class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties {
  public static final String SERIALIZED_NAME_PARAMETER_WHITELIST = "parameter.whitelist";
  @SerializedName(SERIALIZED_NAME_PARAMETER_WHITELIST)
  private ConfigNodePropertyArray parameterWhitelist = null;

  public static final String SERIALIZED_NAME_PARAMETER_WHITELIST_PREFIXES = "parameter.whitelist.prefixes";
  @SerializedName(SERIALIZED_NAME_PARAMETER_WHITELIST_PREFIXES)
  private ConfigNodePropertyArray parameterWhitelistPrefixes = null;

  public static final String SERIALIZED_NAME_BINARY_PARAMETER_WHITELIST = "binary.parameter.whitelist";
  @SerializedName(SERIALIZED_NAME_BINARY_PARAMETER_WHITELIST)
  private ConfigNodePropertyArray binaryParameterWhitelist = null;

  public static final String SERIALIZED_NAME_MODIFIER_WHITELIST = "modifier.whitelist";
  @SerializedName(SERIALIZED_NAME_MODIFIER_WHITELIST)
  private ConfigNodePropertyArray modifierWhitelist = null;

  public static final String SERIALIZED_NAME_OPERATION_WHITELIST = "operation.whitelist";
  @SerializedName(SERIALIZED_NAME_OPERATION_WHITELIST)
  private ConfigNodePropertyArray operationWhitelist = null;

  public static final String SERIALIZED_NAME_OPERATION_WHITELIST_PREFIXES = "operation.whitelist.prefixes";
  @SerializedName(SERIALIZED_NAME_OPERATION_WHITELIST_PREFIXES)
  private ConfigNodePropertyArray operationWhitelistPrefixes = null;

  public static final String SERIALIZED_NAME_TYPEHINT_WHITELIST = "typehint.whitelist";
  @SerializedName(SERIALIZED_NAME_TYPEHINT_WHITELIST)
  private ConfigNodePropertyArray typehintWhitelist = null;

  public static final String SERIALIZED_NAME_RESOURCETYPE_WHITELIST = "resourcetype.whitelist";
  @SerializedName(SERIALIZED_NAME_RESOURCETYPE_WHITELIST)
  private ConfigNodePropertyArray resourcetypeWhitelist = null;

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties parameterWhitelist(ConfigNodePropertyArray parameterWhitelist) {
    this.parameterWhitelist = parameterWhitelist;
    return this;
  }

   /**
   * Get parameterWhitelist
   * @return parameterWhitelist
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getParameterWhitelist() {
    return parameterWhitelist;
  }

  public void setParameterWhitelist(ConfigNodePropertyArray parameterWhitelist) {
    this.parameterWhitelist = parameterWhitelist;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties parameterWhitelistPrefixes(ConfigNodePropertyArray parameterWhitelistPrefixes) {
    this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
    return this;
  }

   /**
   * Get parameterWhitelistPrefixes
   * @return parameterWhitelistPrefixes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getParameterWhitelistPrefixes() {
    return parameterWhitelistPrefixes;
  }

  public void setParameterWhitelistPrefixes(ConfigNodePropertyArray parameterWhitelistPrefixes) {
    this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties binaryParameterWhitelist(ConfigNodePropertyArray binaryParameterWhitelist) {
    this.binaryParameterWhitelist = binaryParameterWhitelist;
    return this;
  }

   /**
   * Get binaryParameterWhitelist
   * @return binaryParameterWhitelist
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getBinaryParameterWhitelist() {
    return binaryParameterWhitelist;
  }

  public void setBinaryParameterWhitelist(ConfigNodePropertyArray binaryParameterWhitelist) {
    this.binaryParameterWhitelist = binaryParameterWhitelist;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties modifierWhitelist(ConfigNodePropertyArray modifierWhitelist) {
    this.modifierWhitelist = modifierWhitelist;
    return this;
  }

   /**
   * Get modifierWhitelist
   * @return modifierWhitelist
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getModifierWhitelist() {
    return modifierWhitelist;
  }

  public void setModifierWhitelist(ConfigNodePropertyArray modifierWhitelist) {
    this.modifierWhitelist = modifierWhitelist;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties operationWhitelist(ConfigNodePropertyArray operationWhitelist) {
    this.operationWhitelist = operationWhitelist;
    return this;
  }

   /**
   * Get operationWhitelist
   * @return operationWhitelist
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getOperationWhitelist() {
    return operationWhitelist;
  }

  public void setOperationWhitelist(ConfigNodePropertyArray operationWhitelist) {
    this.operationWhitelist = operationWhitelist;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties operationWhitelistPrefixes(ConfigNodePropertyArray operationWhitelistPrefixes) {
    this.operationWhitelistPrefixes = operationWhitelistPrefixes;
    return this;
  }

   /**
   * Get operationWhitelistPrefixes
   * @return operationWhitelistPrefixes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getOperationWhitelistPrefixes() {
    return operationWhitelistPrefixes;
  }

  public void setOperationWhitelistPrefixes(ConfigNodePropertyArray operationWhitelistPrefixes) {
    this.operationWhitelistPrefixes = operationWhitelistPrefixes;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties typehintWhitelist(ConfigNodePropertyArray typehintWhitelist) {
    this.typehintWhitelist = typehintWhitelist;
    return this;
  }

   /**
   * Get typehintWhitelist
   * @return typehintWhitelist
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getTypehintWhitelist() {
    return typehintWhitelist;
  }

  public void setTypehintWhitelist(ConfigNodePropertyArray typehintWhitelist) {
    this.typehintWhitelist = typehintWhitelist;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties resourcetypeWhitelist(ConfigNodePropertyArray resourcetypeWhitelist) {
    this.resourcetypeWhitelist = resourcetypeWhitelist;
    return this;
  }

   /**
   * Get resourcetypeWhitelist
   * @return resourcetypeWhitelist
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

