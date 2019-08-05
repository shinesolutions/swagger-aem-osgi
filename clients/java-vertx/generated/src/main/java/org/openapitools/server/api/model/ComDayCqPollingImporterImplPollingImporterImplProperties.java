package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqPollingImporterImplPollingImporterImplProperties   {
  
  private ConfigNodePropertyInteger importerMinInterval = null;
  private ConfigNodePropertyString importerUser = null;
  private ConfigNodePropertyArray excludePaths = null;
  private ConfigNodePropertyArray includePaths = null;

  public ComDayCqPollingImporterImplPollingImporterImplProperties () {

  }

  public ComDayCqPollingImporterImplPollingImporterImplProperties (ConfigNodePropertyInteger importerMinInterval, ConfigNodePropertyString importerUser, ConfigNodePropertyArray excludePaths, ConfigNodePropertyArray includePaths) {
    this.importerMinInterval = importerMinInterval;
    this.importerUser = importerUser;
    this.excludePaths = excludePaths;
    this.includePaths = includePaths;
  }

    
  @JsonProperty("importer.min.interval")
  public ConfigNodePropertyInteger getImporterMinInterval() {
    return importerMinInterval;
  }
  public void setImporterMinInterval(ConfigNodePropertyInteger importerMinInterval) {
    this.importerMinInterval = importerMinInterval;
  }

    
  @JsonProperty("importer.user")
  public ConfigNodePropertyString getImporterUser() {
    return importerUser;
  }
  public void setImporterUser(ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
  }

    
  @JsonProperty("exclude.paths")
  public ConfigNodePropertyArray getExcludePaths() {
    return excludePaths;
  }
  public void setExcludePaths(ConfigNodePropertyArray excludePaths) {
    this.excludePaths = excludePaths;
  }

    
  @JsonProperty("include.paths")
  public ConfigNodePropertyArray getIncludePaths() {
    return includePaths;
  }
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
    return Objects.equals(importerMinInterval, comDayCqPollingImporterImplPollingImporterImplProperties.importerMinInterval) &&
        Objects.equals(importerUser, comDayCqPollingImporterImplPollingImporterImplProperties.importerUser) &&
        Objects.equals(excludePaths, comDayCqPollingImporterImplPollingImporterImplProperties.excludePaths) &&
        Objects.equals(includePaths, comDayCqPollingImporterImplPollingImporterImplProperties.includePaths);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
