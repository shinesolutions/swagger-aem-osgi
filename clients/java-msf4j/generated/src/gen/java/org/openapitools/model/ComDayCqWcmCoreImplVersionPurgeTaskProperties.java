package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

/**
 * ComDayCqWcmCoreImplVersionPurgeTaskProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComDayCqWcmCoreImplVersionPurgeTaskProperties   {
  @JsonProperty("versionpurge.paths")
  private ConfigNodePropertyArray versionpurgePaths = null;

  @JsonProperty("versionpurge.recursive")
  private ConfigNodePropertyBoolean versionpurgeRecursive = null;

  @JsonProperty("versionpurge.maxVersions")
  private ConfigNodePropertyInteger versionpurgeMaxVersions = null;

  @JsonProperty("versionpurge.minVersions")
  private ConfigNodePropertyInteger versionpurgeMinVersions = null;

  @JsonProperty("versionpurge.maxAgeDays")
  private ConfigNodePropertyInteger versionpurgeMaxAgeDays = null;

  public ComDayCqWcmCoreImplVersionPurgeTaskProperties versionpurgePaths(ConfigNodePropertyArray versionpurgePaths) {
    this.versionpurgePaths = versionpurgePaths;
    return this;
  }

   /**
   * Get versionpurgePaths
   * @return versionpurgePaths
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getVersionpurgePaths() {
    return versionpurgePaths;
  }

  public void setVersionpurgePaths(ConfigNodePropertyArray versionpurgePaths) {
    this.versionpurgePaths = versionpurgePaths;
  }

  public ComDayCqWcmCoreImplVersionPurgeTaskProperties versionpurgeRecursive(ConfigNodePropertyBoolean versionpurgeRecursive) {
    this.versionpurgeRecursive = versionpurgeRecursive;
    return this;
  }

   /**
   * Get versionpurgeRecursive
   * @return versionpurgeRecursive
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getVersionpurgeRecursive() {
    return versionpurgeRecursive;
  }

  public void setVersionpurgeRecursive(ConfigNodePropertyBoolean versionpurgeRecursive) {
    this.versionpurgeRecursive = versionpurgeRecursive;
  }

  public ComDayCqWcmCoreImplVersionPurgeTaskProperties versionpurgeMaxVersions(ConfigNodePropertyInteger versionpurgeMaxVersions) {
    this.versionpurgeMaxVersions = versionpurgeMaxVersions;
    return this;
  }

   /**
   * Get versionpurgeMaxVersions
   * @return versionpurgeMaxVersions
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getVersionpurgeMaxVersions() {
    return versionpurgeMaxVersions;
  }

  public void setVersionpurgeMaxVersions(ConfigNodePropertyInteger versionpurgeMaxVersions) {
    this.versionpurgeMaxVersions = versionpurgeMaxVersions;
  }

  public ComDayCqWcmCoreImplVersionPurgeTaskProperties versionpurgeMinVersions(ConfigNodePropertyInteger versionpurgeMinVersions) {
    this.versionpurgeMinVersions = versionpurgeMinVersions;
    return this;
  }

   /**
   * Get versionpurgeMinVersions
   * @return versionpurgeMinVersions
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getVersionpurgeMinVersions() {
    return versionpurgeMinVersions;
  }

  public void setVersionpurgeMinVersions(ConfigNodePropertyInteger versionpurgeMinVersions) {
    this.versionpurgeMinVersions = versionpurgeMinVersions;
  }

  public ComDayCqWcmCoreImplVersionPurgeTaskProperties versionpurgeMaxAgeDays(ConfigNodePropertyInteger versionpurgeMaxAgeDays) {
    this.versionpurgeMaxAgeDays = versionpurgeMaxAgeDays;
    return this;
  }

   /**
   * Get versionpurgeMaxAgeDays
   * @return versionpurgeMaxAgeDays
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getVersionpurgeMaxAgeDays() {
    return versionpurgeMaxAgeDays;
  }

  public void setVersionpurgeMaxAgeDays(ConfigNodePropertyInteger versionpurgeMaxAgeDays) {
    this.versionpurgeMaxAgeDays = versionpurgeMaxAgeDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplVersionPurgeTaskProperties comDayCqWcmCoreImplVersionPurgeTaskProperties = (ComDayCqWcmCoreImplVersionPurgeTaskProperties) o;
    return Objects.equals(this.versionpurgePaths, comDayCqWcmCoreImplVersionPurgeTaskProperties.versionpurgePaths) &&
        Objects.equals(this.versionpurgeRecursive, comDayCqWcmCoreImplVersionPurgeTaskProperties.versionpurgeRecursive) &&
        Objects.equals(this.versionpurgeMaxVersions, comDayCqWcmCoreImplVersionPurgeTaskProperties.versionpurgeMaxVersions) &&
        Objects.equals(this.versionpurgeMinVersions, comDayCqWcmCoreImplVersionPurgeTaskProperties.versionpurgeMinVersions) &&
        Objects.equals(this.versionpurgeMaxAgeDays, comDayCqWcmCoreImplVersionPurgeTaskProperties.versionpurgeMaxAgeDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionpurgePaths, versionpurgeRecursive, versionpurgeMaxVersions, versionpurgeMinVersions, versionpurgeMaxAgeDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplVersionPurgeTaskProperties {\n");
    
    sb.append("    versionpurgePaths: ").append(toIndentedString(versionpurgePaths)).append("\n");
    sb.append("    versionpurgeRecursive: ").append(toIndentedString(versionpurgeRecursive)).append("\n");
    sb.append("    versionpurgeMaxVersions: ").append(toIndentedString(versionpurgeMaxVersions)).append("\n");
    sb.append("    versionpurgeMinVersions: ").append(toIndentedString(versionpurgeMinVersions)).append("\n");
    sb.append("    versionpurgeMaxAgeDays: ").append(toIndentedString(versionpurgeMaxAgeDays)).append("\n");
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

