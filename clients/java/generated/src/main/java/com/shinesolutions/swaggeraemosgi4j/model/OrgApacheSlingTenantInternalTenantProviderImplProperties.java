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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrgApacheSlingTenantInternalTenantProviderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T13:44:27.963Z[GMT]")
public class OrgApacheSlingTenantInternalTenantProviderImplProperties {
  public static final String SERIALIZED_NAME_TENANT_ROOT = "tenant.root";
  @SerializedName(SERIALIZED_NAME_TENANT_ROOT)
  private ConfigNodePropertyString tenantRoot = null;

  public static final String SERIALIZED_NAME_TENANT_PATH_MATCHER = "tenant.path.matcher";
  @SerializedName(SERIALIZED_NAME_TENANT_PATH_MATCHER)
  private ConfigNodePropertyArray tenantPathMatcher = null;

  public OrgApacheSlingTenantInternalTenantProviderImplProperties tenantRoot(ConfigNodePropertyString tenantRoot) {
    this.tenantRoot = tenantRoot;
    return this;
  }

   /**
   * Get tenantRoot
   * @return tenantRoot
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getTenantRoot() {
    return tenantRoot;
  }

  public void setTenantRoot(ConfigNodePropertyString tenantRoot) {
    this.tenantRoot = tenantRoot;
  }

  public OrgApacheSlingTenantInternalTenantProviderImplProperties tenantPathMatcher(ConfigNodePropertyArray tenantPathMatcher) {
    this.tenantPathMatcher = tenantPathMatcher;
    return this;
  }

   /**
   * Get tenantPathMatcher
   * @return tenantPathMatcher
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getTenantPathMatcher() {
    return tenantPathMatcher;
  }

  public void setTenantPathMatcher(ConfigNodePropertyArray tenantPathMatcher) {
    this.tenantPathMatcher = tenantPathMatcher;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingTenantInternalTenantProviderImplProperties orgApacheSlingTenantInternalTenantProviderImplProperties = (OrgApacheSlingTenantInternalTenantProviderImplProperties) o;
    return Objects.equals(this.tenantRoot, orgApacheSlingTenantInternalTenantProviderImplProperties.tenantRoot) &&
        Objects.equals(this.tenantPathMatcher, orgApacheSlingTenantInternalTenantProviderImplProperties.tenantPathMatcher);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantRoot, tenantPathMatcher);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingTenantInternalTenantProviderImplProperties {\n");
    sb.append("    tenantRoot: ").append(toIndentedString(tenantRoot)).append("\n");
    sb.append("    tenantPathMatcher: ").append(toIndentedString(tenantPathMatcher)).append("\n");
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

