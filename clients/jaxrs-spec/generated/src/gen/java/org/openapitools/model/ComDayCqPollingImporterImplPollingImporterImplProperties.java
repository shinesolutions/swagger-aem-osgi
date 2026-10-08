package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqPollingImporterImplPollingImporterImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqPollingImporterImplPollingImporterImplProperties   {
  private ConfigNodePropertyInteger importerMinInterval;
  private ConfigNodePropertyString importerUser;
  private ConfigNodePropertyArray excludePaths;
  private ConfigNodePropertyArray includePaths;

  public ComDayCqPollingImporterImplPollingImporterImplProperties() {
  }

  /**
   **/
  public ComDayCqPollingImporterImplPollingImporterImplProperties importerMinInterval(ConfigNodePropertyInteger importerMinInterval) {
    this.importerMinInterval = importerMinInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("importer.min.interval")
  @Valid public ConfigNodePropertyInteger getImporterMinInterval() {
    return importerMinInterval;
  }

  @JsonProperty("importer.min.interval")
  public void setImporterMinInterval(ConfigNodePropertyInteger importerMinInterval) {
    this.importerMinInterval = importerMinInterval;
  }

  /**
   **/
  public ComDayCqPollingImporterImplPollingImporterImplProperties importerUser(ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("importer.user")
  @Valid public ConfigNodePropertyString getImporterUser() {
    return importerUser;
  }

  @JsonProperty("importer.user")
  public void setImporterUser(ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
  }

  /**
   **/
  public ComDayCqPollingImporterImplPollingImporterImplProperties excludePaths(ConfigNodePropertyArray excludePaths) {
    this.excludePaths = excludePaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exclude.paths")
  @Valid public ConfigNodePropertyArray getExcludePaths() {
    return excludePaths;
  }

  @JsonProperty("exclude.paths")
  public void setExcludePaths(ConfigNodePropertyArray excludePaths) {
    this.excludePaths = excludePaths;
  }

  /**
   **/
  public ComDayCqPollingImporterImplPollingImporterImplProperties includePaths(ConfigNodePropertyArray includePaths) {
    this.includePaths = includePaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("include.paths")
  @Valid public ConfigNodePropertyArray getIncludePaths() {
    return includePaths;
  }

  @JsonProperty("include.paths")
  public void setIncludePaths(ConfigNodePropertyArray includePaths) {
    this.includePaths = includePaths;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
