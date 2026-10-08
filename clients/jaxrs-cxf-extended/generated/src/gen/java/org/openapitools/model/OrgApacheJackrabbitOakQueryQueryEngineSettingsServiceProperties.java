package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger queryLimitInMemory;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger queryLimitReads;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean queryFailTraversal;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean fastQuerySize;
 /**
  * Get queryLimitInMemory
  * @return queryLimitInMemory
  */
  @JsonProperty("queryLimitInMemory")
  public ConfigNodePropertyInteger getQueryLimitInMemory() {
    return queryLimitInMemory;
  }

  /**
   * Sets the <code>queryLimitInMemory</code> property.
   */
 public void setQueryLimitInMemory(ConfigNodePropertyInteger queryLimitInMemory) {
    this.queryLimitInMemory = queryLimitInMemory;
  }

  /**
   * Sets the <code>queryLimitInMemory</code> property.
   */
  public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties queryLimitInMemory(ConfigNodePropertyInteger queryLimitInMemory) {
    this.queryLimitInMemory = queryLimitInMemory;
    return this;
  }

 /**
  * Get queryLimitReads
  * @return queryLimitReads
  */
  @JsonProperty("queryLimitReads")
  public ConfigNodePropertyInteger getQueryLimitReads() {
    return queryLimitReads;
  }

  /**
   * Sets the <code>queryLimitReads</code> property.
   */
 public void setQueryLimitReads(ConfigNodePropertyInteger queryLimitReads) {
    this.queryLimitReads = queryLimitReads;
  }

  /**
   * Sets the <code>queryLimitReads</code> property.
   */
  public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties queryLimitReads(ConfigNodePropertyInteger queryLimitReads) {
    this.queryLimitReads = queryLimitReads;
    return this;
  }

 /**
  * Get queryFailTraversal
  * @return queryFailTraversal
  */
  @JsonProperty("queryFailTraversal")
  public ConfigNodePropertyBoolean getQueryFailTraversal() {
    return queryFailTraversal;
  }

  /**
   * Sets the <code>queryFailTraversal</code> property.
   */
 public void setQueryFailTraversal(ConfigNodePropertyBoolean queryFailTraversal) {
    this.queryFailTraversal = queryFailTraversal;
  }

  /**
   * Sets the <code>queryFailTraversal</code> property.
   */
  public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties queryFailTraversal(ConfigNodePropertyBoolean queryFailTraversal) {
    this.queryFailTraversal = queryFailTraversal;
    return this;
  }

 /**
  * Get fastQuerySize
  * @return fastQuerySize
  */
  @JsonProperty("fastQuerySize")
  public ConfigNodePropertyBoolean getFastQuerySize() {
    return fastQuerySize;
  }

  /**
   * Sets the <code>fastQuerySize</code> property.
   */
 public void setFastQuerySize(ConfigNodePropertyBoolean fastQuerySize) {
    this.fastQuerySize = fastQuerySize;
  }

  /**
   * Sets the <code>fastQuerySize</code> property.
   */
  public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties fastQuerySize(ConfigNodePropertyBoolean fastQuerySize) {
    this.fastQuerySize = fastQuerySize;
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
    OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties = (OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties) o;
    return Objects.equals(this.queryLimitInMemory, orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.queryLimitInMemory) &&
        Objects.equals(this.queryLimitReads, orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.queryLimitReads) &&
        Objects.equals(this.queryFailTraversal, orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.queryFailTraversal) &&
        Objects.equals(this.fastQuerySize, orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.fastQuerySize);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

