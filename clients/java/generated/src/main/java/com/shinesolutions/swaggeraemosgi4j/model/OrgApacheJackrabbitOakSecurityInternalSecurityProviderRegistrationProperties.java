/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyDropDown;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrationProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T12:10:03.209Z[GMT]")
public class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrationProperties {
  public static final String SERIALIZED_NAME_REQUIRED_SERVICE_PIDS = "requiredServicePids";
  @SerializedName(SERIALIZED_NAME_REQUIRED_SERVICE_PIDS)
  private ConfigNodePropertyArray requiredServicePids = null;

  public static final String SERIALIZED_NAME_AUTHORIZATION_COMPOSITION_TYPE = "authorizationCompositionType";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_COMPOSITION_TYPE)
  private ConfigNodePropertyDropDown authorizationCompositionType = null;

  public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrationProperties requiredServicePids(ConfigNodePropertyArray requiredServicePids) {
    this.requiredServicePids = requiredServicePids;
    return this;
  }

   /**
   * Get requiredServicePids
   * @return requiredServicePids
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getRequiredServicePids() {
    return requiredServicePids;
  }

  public void setRequiredServicePids(ConfigNodePropertyArray requiredServicePids) {
    this.requiredServicePids = requiredServicePids;
  }

  public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrationProperties authorizationCompositionType(ConfigNodePropertyDropDown authorizationCompositionType) {
    this.authorizationCompositionType = authorizationCompositionType;
    return this;
  }

   /**
   * Get authorizationCompositionType
   * @return authorizationCompositionType
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getAuthorizationCompositionType() {
    return authorizationCompositionType;
  }

  public void setAuthorizationCompositionType(ConfigNodePropertyDropDown authorizationCompositionType) {
    this.authorizationCompositionType = authorizationCompositionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrationProperties orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrationProperties = (OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrationProperties) o;
    return Objects.equals(this.requiredServicePids, orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrationProperties.requiredServicePids) &&
        Objects.equals(this.authorizationCompositionType, orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrationProperties.authorizationCompositionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredServicePids, authorizationCompositionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrationProperties {\n");
    sb.append("    requiredServicePids: ").append(toIndentedString(requiredServicePids)).append("\n");
    sb.append("    authorizationCompositionType: ").append(toIndentedString(authorizationCompositionType)).append("\n");
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
