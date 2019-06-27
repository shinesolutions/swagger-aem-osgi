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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T11:23:34.688Z[GMT]")
public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties {
  public static final String SERIALIZED_NAME_PROTECT_EXTERNAL_ID = "protectExternalId";
  @SerializedName(SERIALIZED_NAME_PROTECT_EXTERNAL_ID)
  private ConfigNodePropertyBoolean protectExternalId = null;

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties protectExternalId(ConfigNodePropertyBoolean protectExternalId) {
    this.protectExternalId = protectExternalId;
    return this;
  }

   /**
   * Get protectExternalId
   * @return protectExternalId
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getProtectExternalId() {
    return protectExternalId;
  }

  public void setProtectExternalId(ConfigNodePropertyBoolean protectExternalId) {
    this.protectExternalId = protectExternalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties = (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties) o;
    return Objects.equals(this.protectExternalId, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties.protectExternalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protectExternalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties {\n");
    sb.append("    protectExternalId: ").append(toIndentedString(protectExternalId)).append("\n");
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
