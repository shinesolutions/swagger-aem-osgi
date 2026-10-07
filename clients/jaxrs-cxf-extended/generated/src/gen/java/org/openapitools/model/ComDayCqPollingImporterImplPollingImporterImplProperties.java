package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqPollingImporterImplPollingImporterImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger importerMinInterval;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString importerUser;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray excludePaths;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray includePaths;
 /**
  * Get importerMinInterval
  * @return importerMinInterval
  */
  @JsonProperty("importer.min.interval")
  public ConfigNodePropertyInteger getImporterMinInterval() {
    return importerMinInterval;
  }

  /**
   * Sets the <code>importerMinInterval</code> property.
   */
 public void setImporterMinInterval(ConfigNodePropertyInteger importerMinInterval) {
    this.importerMinInterval = importerMinInterval;
  }

  /**
   * Sets the <code>importerMinInterval</code> property.
   */
  public ComDayCqPollingImporterImplPollingImporterImplProperties importerMinInterval(ConfigNodePropertyInteger importerMinInterval) {
    this.importerMinInterval = importerMinInterval;
    return this;
  }

 /**
  * Get importerUser
  * @return importerUser
  */
  @JsonProperty("importer.user")
  public ConfigNodePropertyString getImporterUser() {
    return importerUser;
  }

  /**
   * Sets the <code>importerUser</code> property.
   */
 public void setImporterUser(ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
  }

  /**
   * Sets the <code>importerUser</code> property.
   */
  public ComDayCqPollingImporterImplPollingImporterImplProperties importerUser(ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
    return this;
  }

 /**
  * Get excludePaths
  * @return excludePaths
  */
  @JsonProperty("exclude.paths")
  public ConfigNodePropertyArray getExcludePaths() {
    return excludePaths;
  }

  /**
   * Sets the <code>excludePaths</code> property.
   */
 public void setExcludePaths(ConfigNodePropertyArray excludePaths) {
    this.excludePaths = excludePaths;
  }

  /**
   * Sets the <code>excludePaths</code> property.
   */
  public ComDayCqPollingImporterImplPollingImporterImplProperties excludePaths(ConfigNodePropertyArray excludePaths) {
    this.excludePaths = excludePaths;
    return this;
  }

 /**
  * Get includePaths
  * @return includePaths
  */
  @JsonProperty("include.paths")
  public ConfigNodePropertyArray getIncludePaths() {
    return includePaths;
  }

  /**
   * Sets the <code>includePaths</code> property.
   */
 public void setIncludePaths(ConfigNodePropertyArray includePaths) {
    this.includePaths = includePaths;
  }

  /**
   * Sets the <code>includePaths</code> property.
   */
  public ComDayCqPollingImporterImplPollingImporterImplProperties includePaths(ConfigNodePropertyArray includePaths) {
    this.includePaths = includePaths;
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
    ComDayCqPollingImporterImplPollingImporterImplProperties comDayCqPollingImporterImplPollingImporterImplProperties = (ComDayCqPollingImporterImplPollingImporterImplProperties) o;
    return Objects.equals(this.importerMinInterval, comDayCqPollingImporterImplPollingImporterImplProperties.importerMinInterval) &&
        Objects.equals(this.importerUser, comDayCqPollingImporterImplPollingImporterImplProperties.importerUser) &&
        Objects.equals(this.excludePaths, comDayCqPollingImporterImplPollingImporterImplProperties.excludePaths) &&
        Objects.equals(this.includePaths, comDayCqPollingImporterImplPollingImporterImplProperties.includePaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importerMinInterval, importerUser, excludePaths, includePaths);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

