package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
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

public class ComDayCqPollingImporterImplPollingImporterImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger importerMinInterval = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString importerUser = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray excludePaths = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray includePaths = null;
 /**
   * Get importerMinInterval
   * @return importerMinInterval
  **/
  @JsonProperty("importer.min.interval")
  public ConfigNodePropertyInteger getImporterMinInterval() {
    return importerMinInterval;
  }

  public void setImporterMinInterval(ConfigNodePropertyInteger importerMinInterval) {
    this.importerMinInterval = importerMinInterval;
  }

  public ComDayCqPollingImporterImplPollingImporterImplProperties importerMinInterval(ConfigNodePropertyInteger importerMinInterval) {
    this.importerMinInterval = importerMinInterval;
    return this;
  }

 /**
   * Get importerUser
   * @return importerUser
  **/
  @JsonProperty("importer.user")
  public ConfigNodePropertyString getImporterUser() {
    return importerUser;
  }

  public void setImporterUser(ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
  }

  public ComDayCqPollingImporterImplPollingImporterImplProperties importerUser(ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
    return this;
  }

 /**
   * Get excludePaths
   * @return excludePaths
  **/
  @JsonProperty("exclude.paths")
  public ConfigNodePropertyArray getExcludePaths() {
    return excludePaths;
  }

  public void setExcludePaths(ConfigNodePropertyArray excludePaths) {
    this.excludePaths = excludePaths;
  }

  public ComDayCqPollingImporterImplPollingImporterImplProperties excludePaths(ConfigNodePropertyArray excludePaths) {
    this.excludePaths = excludePaths;
    return this;
  }

 /**
   * Get includePaths
   * @return includePaths
  **/
  @JsonProperty("include.paths")
  public ConfigNodePropertyArray getIncludePaths() {
    return includePaths;
  }

  public void setIncludePaths(ConfigNodePropertyArray includePaths) {
    this.includePaths = includePaths;
  }

  public ComDayCqPollingImporterImplPollingImporterImplProperties includePaths(ConfigNodePropertyArray includePaths) {
    this.includePaths = includePaths;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqPollingImporterImplPollingImporterImplProperties {\n");
    
    sb.append("    importerMinInterval: ").append(toIndentedString(importerMinInterval)).append("\n");
    sb.append("    importerUser: ").append(toIndentedString(importerUser)).append("\n");
    sb.append("    excludePaths: ").append(toIndentedString(excludePaths)).append("\n");
    sb.append("    includePaths: ").append(toIndentedString(includePaths)).append("\n");
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

