package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComDayCqWcmCoreImplVersionManagerImplProperties   {
  @JsonProperty("versionmanager.createVersionOnActivation")
  private ConfigNodePropertyBoolean versionmanagerCreateVersionOnActivation = null;

  @JsonProperty("versionmanager.purgingEnabled")
  private ConfigNodePropertyBoolean versionmanagerPurgingEnabled = null;

  @JsonProperty("versionmanager.purgePaths")
  private ConfigNodePropertyArray versionmanagerPurgePaths = null;

  @JsonProperty("versionmanager.ivPaths")
  private ConfigNodePropertyArray versionmanagerIvPaths = null;

  @JsonProperty("versionmanager.maxAgeDays")
  private ConfigNodePropertyInteger versionmanagerMaxAgeDays = null;

  @JsonProperty("versionmanager.maxNumberVersions")
  private ConfigNodePropertyInteger versionmanagerMaxNumberVersions = null;

  @JsonProperty("versionmanager.minNumberVersions")
  private ConfigNodePropertyInteger versionmanagerMinNumberVersions = null;

  /**
   **/
  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerCreateVersionOnActivation(ConfigNodePropertyBoolean versionmanagerCreateVersionOnActivation) {
    this.versionmanagerCreateVersionOnActivation = versionmanagerCreateVersionOnActivation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("versionmanager.createVersionOnActivation")
  public ConfigNodePropertyBoolean getVersionmanagerCreateVersionOnActivation() {
    return versionmanagerCreateVersionOnActivation;
  }
  public void setVersionmanagerCreateVersionOnActivation(ConfigNodePropertyBoolean versionmanagerCreateVersionOnActivation) {
    this.versionmanagerCreateVersionOnActivation = versionmanagerCreateVersionOnActivation;
  }

  /**
   **/
  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerPurgingEnabled(ConfigNodePropertyBoolean versionmanagerPurgingEnabled) {
    this.versionmanagerPurgingEnabled = versionmanagerPurgingEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("versionmanager.purgingEnabled")
  public ConfigNodePropertyBoolean getVersionmanagerPurgingEnabled() {
    return versionmanagerPurgingEnabled;
  }
  public void setVersionmanagerPurgingEnabled(ConfigNodePropertyBoolean versionmanagerPurgingEnabled) {
    this.versionmanagerPurgingEnabled = versionmanagerPurgingEnabled;
  }

  /**
   **/
  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerPurgePaths(ConfigNodePropertyArray versionmanagerPurgePaths) {
    this.versionmanagerPurgePaths = versionmanagerPurgePaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("versionmanager.purgePaths")
  public ConfigNodePropertyArray getVersionmanagerPurgePaths() {
    return versionmanagerPurgePaths;
  }
  public void setVersionmanagerPurgePaths(ConfigNodePropertyArray versionmanagerPurgePaths) {
    this.versionmanagerPurgePaths = versionmanagerPurgePaths;
  }

  /**
   **/
  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerIvPaths(ConfigNodePropertyArray versionmanagerIvPaths) {
    this.versionmanagerIvPaths = versionmanagerIvPaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("versionmanager.ivPaths")
  public ConfigNodePropertyArray getVersionmanagerIvPaths() {
    return versionmanagerIvPaths;
  }
  public void setVersionmanagerIvPaths(ConfigNodePropertyArray versionmanagerIvPaths) {
    this.versionmanagerIvPaths = versionmanagerIvPaths;
  }

  /**
   **/
  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerMaxAgeDays(ConfigNodePropertyInteger versionmanagerMaxAgeDays) {
    this.versionmanagerMaxAgeDays = versionmanagerMaxAgeDays;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("versionmanager.maxAgeDays")
  public ConfigNodePropertyInteger getVersionmanagerMaxAgeDays() {
    return versionmanagerMaxAgeDays;
  }
  public void setVersionmanagerMaxAgeDays(ConfigNodePropertyInteger versionmanagerMaxAgeDays) {
    this.versionmanagerMaxAgeDays = versionmanagerMaxAgeDays;
  }

  /**
   **/
  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerMaxNumberVersions(ConfigNodePropertyInteger versionmanagerMaxNumberVersions) {
    this.versionmanagerMaxNumberVersions = versionmanagerMaxNumberVersions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("versionmanager.maxNumberVersions")
  public ConfigNodePropertyInteger getVersionmanagerMaxNumberVersions() {
    return versionmanagerMaxNumberVersions;
  }
  public void setVersionmanagerMaxNumberVersions(ConfigNodePropertyInteger versionmanagerMaxNumberVersions) {
    this.versionmanagerMaxNumberVersions = versionmanagerMaxNumberVersions;
  }

  /**
   **/
  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerMinNumberVersions(ConfigNodePropertyInteger versionmanagerMinNumberVersions) {
    this.versionmanagerMinNumberVersions = versionmanagerMinNumberVersions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("versionmanager.minNumberVersions")
  public ConfigNodePropertyInteger getVersionmanagerMinNumberVersions() {
    return versionmanagerMinNumberVersions;
  }
  public void setVersionmanagerMinNumberVersions(ConfigNodePropertyInteger versionmanagerMinNumberVersions) {
    this.versionmanagerMinNumberVersions = versionmanagerMinNumberVersions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplVersionManagerImplProperties comDayCqWcmCoreImplVersionManagerImplProperties = (ComDayCqWcmCoreImplVersionManagerImplProperties) o;
    return Objects.equals(versionmanagerCreateVersionOnActivation, comDayCqWcmCoreImplVersionManagerImplProperties.versionmanagerCreateVersionOnActivation) &&
        Objects.equals(versionmanagerPurgingEnabled, comDayCqWcmCoreImplVersionManagerImplProperties.versionmanagerPurgingEnabled) &&
        Objects.equals(versionmanagerPurgePaths, comDayCqWcmCoreImplVersionManagerImplProperties.versionmanagerPurgePaths) &&
        Objects.equals(versionmanagerIvPaths, comDayCqWcmCoreImplVersionManagerImplProperties.versionmanagerIvPaths) &&
        Objects.equals(versionmanagerMaxAgeDays, comDayCqWcmCoreImplVersionManagerImplProperties.versionmanagerMaxAgeDays) &&
        Objects.equals(versionmanagerMaxNumberVersions, comDayCqWcmCoreImplVersionManagerImplProperties.versionmanagerMaxNumberVersions) &&
        Objects.equals(versionmanagerMinNumberVersions, comDayCqWcmCoreImplVersionManagerImplProperties.versionmanagerMinNumberVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionmanagerCreateVersionOnActivation, versionmanagerPurgingEnabled, versionmanagerPurgePaths, versionmanagerIvPaths, versionmanagerMaxAgeDays, versionmanagerMaxNumberVersions, versionmanagerMinNumberVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplVersionManagerImplProperties {\n");
    
    sb.append("    versionmanagerCreateVersionOnActivation: ").append(toIndentedString(versionmanagerCreateVersionOnActivation)).append("\n");
    sb.append("    versionmanagerPurgingEnabled: ").append(toIndentedString(versionmanagerPurgingEnabled)).append("\n");
    sb.append("    versionmanagerPurgePaths: ").append(toIndentedString(versionmanagerPurgePaths)).append("\n");
    sb.append("    versionmanagerIvPaths: ").append(toIndentedString(versionmanagerIvPaths)).append("\n");
    sb.append("    versionmanagerMaxAgeDays: ").append(toIndentedString(versionmanagerMaxAgeDays)).append("\n");
    sb.append("    versionmanagerMaxNumberVersions: ").append(toIndentedString(versionmanagerMaxNumberVersions)).append("\n");
    sb.append("    versionmanagerMinNumberVersions: ").append(toIndentedString(versionmanagerMinNumberVersions)).append("\n");
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

