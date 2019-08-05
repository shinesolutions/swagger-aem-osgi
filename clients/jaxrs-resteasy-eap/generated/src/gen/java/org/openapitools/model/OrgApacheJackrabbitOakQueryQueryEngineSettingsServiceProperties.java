package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties   {
  

  private ConfigNodePropertyInteger queryLimitInMemory = null;

  private ConfigNodePropertyInteger queryLimitReads = null;

  private ConfigNodePropertyBoolean queryFailTraversal = null;

  private ConfigNodePropertyBoolean fastQuerySize = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("queryLimitInMemory")
  public ConfigNodePropertyInteger getQueryLimitInMemory() {
    return queryLimitInMemory;
  }
  public void setQueryLimitInMemory(ConfigNodePropertyInteger queryLimitInMemory) {
    this.queryLimitInMemory = queryLimitInMemory;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("queryLimitReads")
  public ConfigNodePropertyInteger getQueryLimitReads() {
    return queryLimitReads;
  }
  public void setQueryLimitReads(ConfigNodePropertyInteger queryLimitReads) {
    this.queryLimitReads = queryLimitReads;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("queryFailTraversal")
  public ConfigNodePropertyBoolean getQueryFailTraversal() {
    return queryFailTraversal;
  }
  public void setQueryFailTraversal(ConfigNodePropertyBoolean queryFailTraversal) {
    this.queryFailTraversal = queryFailTraversal;
  }

  /**
   **/
  
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

