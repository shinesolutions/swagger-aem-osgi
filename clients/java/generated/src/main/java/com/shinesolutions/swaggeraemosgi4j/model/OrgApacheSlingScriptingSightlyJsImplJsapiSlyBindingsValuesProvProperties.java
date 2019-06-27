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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T11:23:34.688Z[GMT]")
public class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties {
  public static final String SERIALIZED_NAME_ORG_APACHE_SLING_SCRIPTING_SIGHTLY_JS_BINDINGS = "org.apache.sling.scripting.sightly.js.bindings";
  @SerializedName(SERIALIZED_NAME_ORG_APACHE_SLING_SCRIPTING_SIGHTLY_JS_BINDINGS)
  private ConfigNodePropertyArray orgApacheSlingScriptingSightlyJsBindings = null;

  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties orgApacheSlingScriptingSightlyJsBindings(ConfigNodePropertyArray orgApacheSlingScriptingSightlyJsBindings) {
    this.orgApacheSlingScriptingSightlyJsBindings = orgApacheSlingScriptingSightlyJsBindings;
    return this;
  }

   /**
   * Get orgApacheSlingScriptingSightlyJsBindings
   * @return orgApacheSlingScriptingSightlyJsBindings
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getOrgApacheSlingScriptingSightlyJsBindings() {
    return orgApacheSlingScriptingSightlyJsBindings;
  }

  public void setOrgApacheSlingScriptingSightlyJsBindings(ConfigNodePropertyArray orgApacheSlingScriptingSightlyJsBindings) {
    this.orgApacheSlingScriptingSightlyJsBindings = orgApacheSlingScriptingSightlyJsBindings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties = (OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties) o;
    return Objects.equals(this.orgApacheSlingScriptingSightlyJsBindings, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.orgApacheSlingScriptingSightlyJsBindings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheSlingScriptingSightlyJsBindings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties {\n");
    sb.append("    orgApacheSlingScriptingSightlyJsBindings: ").append(toIndentedString(orgApacheSlingScriptingSightlyJsBindings)).append("\n");
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

