/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties   {
  
  private ConfigNodePropertyInteger queryLimitInMemory;
  private ConfigNodePropertyInteger queryLimitReads;
  private ConfigNodePropertyBoolean queryFailTraversal;
  private ConfigNodePropertyBoolean fastQuerySize;

  /**
   */
  public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties queryLimitInMemory(ConfigNodePropertyInteger queryLimitInMemory) {
    this.queryLimitInMemory = queryLimitInMemory;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queryLimitInMemory")
  public ConfigNodePropertyInteger getQueryLimitInMemory() {
    return queryLimitInMemory;
  }
  public void setQueryLimitInMemory(ConfigNodePropertyInteger queryLimitInMemory) {
    this.queryLimitInMemory = queryLimitInMemory;
  }

  /**
   */
  public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties queryLimitReads(ConfigNodePropertyInteger queryLimitReads) {
    this.queryLimitReads = queryLimitReads;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queryLimitReads")
  public ConfigNodePropertyInteger getQueryLimitReads() {
    return queryLimitReads;
  }
  public void setQueryLimitReads(ConfigNodePropertyInteger queryLimitReads) {
    this.queryLimitReads = queryLimitReads;
  }

  /**
   */
  public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties queryFailTraversal(ConfigNodePropertyBoolean queryFailTraversal) {
    this.queryFailTraversal = queryFailTraversal;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queryFailTraversal")
  public ConfigNodePropertyBoolean getQueryFailTraversal() {
    return queryFailTraversal;
  }
  public void setQueryFailTraversal(ConfigNodePropertyBoolean queryFailTraversal) {
    this.queryFailTraversal = queryFailTraversal;
  }

  /**
   */
  public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties fastQuerySize(ConfigNodePropertyBoolean fastQuerySize) {
    this.fastQuerySize = fastQuerySize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fastQuerySize")
  public ConfigNodePropertyBoolean getFastQuerySize() {
    return fastQuerySize;
  }
  public void setFastQuerySize(ConfigNodePropertyBoolean fastQuerySize) {
    this.fastQuerySize = fastQuerySize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties = (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties) o;
    return Objects.equals(queryLimitInMemory, orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.queryLimitInMemory) &&
        Objects.equals(queryLimitReads, orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.queryLimitReads) &&
        Objects.equals(queryFailTraversal, orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.queryFailTraversal) &&
        Objects.equals(fastQuerySize, orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.fastQuerySize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryLimitInMemory, queryLimitReads, queryFailTraversal, fastQuerySize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties {\n");
    
    sb.append("    queryLimitInMemory: ").append(toIndentedString(queryLimitInMemory)).append("\n");
    sb.append("    queryLimitReads: ").append(toIndentedString(queryLimitReads)).append("\n");
    sb.append("    queryFailTraversal: ").append(toIndentedString(queryFailTraversal)).append("\n");
    sb.append("    fastQuerySize: ").append(toIndentedString(fastQuerySize)).append("\n");
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

