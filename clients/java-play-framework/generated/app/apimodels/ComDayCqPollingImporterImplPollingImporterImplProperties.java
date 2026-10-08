package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqPollingImporterImplPollingImporterImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqPollingImporterImplPollingImporterImplProperties   {
  @JsonProperty("importer.min.interval")
  @Valid

  private ConfigNodePropertyInteger importerMinInterval;

  @JsonProperty("importer.user")
  @Valid

  private ConfigNodePropertyString importerUser;

  @JsonProperty("exclude.paths")
  @Valid

  private ConfigNodePropertyArray excludePaths;

  @JsonProperty("include.paths")
  @Valid

  private ConfigNodePropertyArray includePaths;

  public ComDayCqPollingImporterImplPollingImporterImplProperties importerMinInterval(ConfigNodePropertyInteger importerMinInterval) {
    this.importerMinInterval = importerMinInterval;
    return this;
  }

   /**
   * Get importerMinInterval
   * @return importerMinInterval
  **/
  public ConfigNodePropertyInteger getImporterMinInterval() {
    return importerMinInterval;
  }

  public void setImporterMinInterval(ConfigNodePropertyInteger importerMinInterval) {
    this.importerMinInterval = importerMinInterval;
  }

  public ComDayCqPollingImporterImplPollingImporterImplProperties importerUser(ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
    return this;
  }

   /**
   * Get importerUser
   * @return importerUser
  **/
  public ConfigNodePropertyString getImporterUser() {
    return importerUser;
  }

  public void setImporterUser(ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
  }

  public ComDayCqPollingImporterImplPollingImporterImplProperties excludePaths(ConfigNodePropertyArray excludePaths) {
    this.excludePaths = excludePaths;
    return this;
  }

   /**
   * Get excludePaths
   * @return excludePaths
  **/
  public ConfigNodePropertyArray getExcludePaths() {
    return excludePaths;
  }

  public void setExcludePaths(ConfigNodePropertyArray excludePaths) {
    this.excludePaths = excludePaths;
  }

  public ComDayCqPollingImporterImplPollingImporterImplProperties includePaths(ConfigNodePropertyArray includePaths) {
    this.includePaths = includePaths;
    return this;
  }

   /**
   * Get includePaths
   * @return includePaths
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

