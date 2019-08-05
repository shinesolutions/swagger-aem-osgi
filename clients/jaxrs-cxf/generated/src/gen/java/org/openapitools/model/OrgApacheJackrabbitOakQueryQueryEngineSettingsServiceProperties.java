package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger queryLimitInMemory = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger queryLimitReads = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean queryFailTraversal = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean fastQuerySize = null;
 /**
   * Get queryLimitInMemory
   * @return queryLimitInMemory
  **/
  @JsonProperty("queryLimitInMemory")
  public ConfigNodePropertyInteger getQueryLimitInMemory() {
    return queryLimitInMemory;
  }

  public void setQueryLimitInMemory(ConfigNodePropertyInteger queryLimitInMemory) {
    this.queryLimitInMemory = queryLimitInMemory;
  }

  public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties queryLimitInMemory(ConfigNodePropertyInteger queryLimitInMemory) {
    this.queryLimitInMemory = queryLimitInMemory;
    return this;
  }

 /**
   * Get queryLimitReads
   * @return queryLimitReads
  **/
  @JsonProperty("queryLimitReads")
  public ConfigNodePropertyInteger getQueryLimitReads() {
    return queryLimitReads;
  }

  public void setQueryLimitReads(ConfigNodePropertyInteger queryLimitReads) {
    this.queryLimitReads = queryLimitReads;
  }

  public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties queryLimitReads(ConfigNodePropertyInteger queryLimitReads) {
    this.queryLimitReads = queryLimitReads;
    return this;
  }

 /**
   * Get queryFailTraversal
   * @return queryFailTraversal
  **/
  @JsonProperty("queryFailTraversal")
  public ConfigNodePropertyBoolean getQueryFailTraversal() {
    return queryFailTraversal;
  }

  public void setQueryFailTraversal(ConfigNodePropertyBoolean queryFailTraversal) {
    this.queryFailTraversal = queryFailTraversal;
  }

  public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties queryFailTraversal(ConfigNodePropertyBoolean queryFailTraversal) {
    this.queryFailTraversal = queryFailTraversal;
    return this;
  }

 /**
   * Get fastQuerySize
   * @return fastQuerySize
  **/
  @JsonProperty("fastQuerySize")
  public ConfigNodePropertyBoolean getFastQuerySize() {
    return fastQuerySize;
  }

  public void setFastQuerySize(ConfigNodePropertyBoolean fastQuerySize) {
    this.fastQuerySize = fastQuerySize;
  }

  public OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties fastQuerySize(ConfigNodePropertyBoolean fastQuerySize) {
    this.fastQuerySize = fastQuerySize;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

