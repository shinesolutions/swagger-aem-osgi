package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmCoreImplVersionManagerImplProperties   {
  
  private ConfigNodePropertyBoolean versionmanagerCreateVersionOnActivation = null;
  private ConfigNodePropertyBoolean versionmanagerPurgingEnabled = null;
  private ConfigNodePropertyArray versionmanagerPurgePaths = null;
  private ConfigNodePropertyArray versionmanagerIvPaths = null;
  private ConfigNodePropertyInteger versionmanagerMaxAgeDays = null;
  private ConfigNodePropertyInteger versionmanagerMaxNumberVersions = null;
  private ConfigNodePropertyInteger versionmanagerMinNumberVersions = null;

  public ComDayCqWcmCoreImplVersionManagerImplProperties () {

  }

  public ComDayCqWcmCoreImplVersionManagerImplProperties (ConfigNodePropertyBoolean versionmanagerCreateVersionOnActivation, ConfigNodePropertyBoolean versionmanagerPurgingEnabled, ConfigNodePropertyArray versionmanagerPurgePaths, ConfigNodePropertyArray versionmanagerIvPaths, ConfigNodePropertyInteger versionmanagerMaxAgeDays, ConfigNodePropertyInteger versionmanagerMaxNumberVersions, ConfigNodePropertyInteger versionmanagerMinNumberVersions) {
    this.versionmanagerCreateVersionOnActivation = versionmanagerCreateVersionOnActivation;
    this.versionmanagerPurgingEnabled = versionmanagerPurgingEnabled;
    this.versionmanagerPurgePaths = versionmanagerPurgePaths;
    this.versionmanagerIvPaths = versionmanagerIvPaths;
    this.versionmanagerMaxAgeDays = versionmanagerMaxAgeDays;
    this.versionmanagerMaxNumberVersions = versionmanagerMaxNumberVersions;
    this.versionmanagerMinNumberVersions = versionmanagerMinNumberVersions;
  }

    
  @JsonProperty("versionmanager.createVersionOnActivation")
  public ConfigNodePropertyBoolean getVersionmanagerCreateVersionOnActivation() {
    return versionmanagerCreateVersionOnActivation;
  }
  public void setVersionmanagerCreateVersionOnActivation(ConfigNodePropertyBoolean versionmanagerCreateVersionOnActivation) {
    this.versionmanagerCreateVersionOnActivation = versionmanagerCreateVersionOnActivation;
  }

    
  @JsonProperty("versionmanager.purgingEnabled")
  public ConfigNodePropertyBoolean getVersionmanagerPurgingEnabled() {
    return versionmanagerPurgingEnabled;
  }
  public void setVersionmanagerPurgingEnabled(ConfigNodePropertyBoolean versionmanagerPurgingEnabled) {
    this.versionmanagerPurgingEnabled = versionmanagerPurgingEnabled;
  }

    
  @JsonProperty("versionmanager.purgePaths")
  public ConfigNodePropertyArray getVersionmanagerPurgePaths() {
    return versionmanagerPurgePaths;
  }
  public void setVersionmanagerPurgePaths(ConfigNodePropertyArray versionmanagerPurgePaths) {
    this.versionmanagerPurgePaths = versionmanagerPurgePaths;
  }

    
  @JsonProperty("versionmanager.ivPaths")
  public ConfigNodePropertyArray getVersionmanagerIvPaths() {
    return versionmanagerIvPaths;
  }
  public void setVersionmanagerIvPaths(ConfigNodePropertyArray versionmanagerIvPaths) {
    this.versionmanagerIvPaths = versionmanagerIvPaths;
  }

    
  @JsonProperty("versionmanager.maxAgeDays")
  public ConfigNodePropertyInteger getVersionmanagerMaxAgeDays() {
    return versionmanagerMaxAgeDays;
  }
  public void setVersionmanagerMaxAgeDays(ConfigNodePropertyInteger versionmanagerMaxAgeDays) {
    this.versionmanagerMaxAgeDays = versionmanagerMaxAgeDays;
  }

    
  @JsonProperty("versionmanager.maxNumberVersions")
  public ConfigNodePropertyInteger getVersionmanagerMaxNumberVersions() {
    return versionmanagerMaxNumberVersions;
  }
  public void setVersionmanagerMaxNumberVersions(ConfigNodePropertyInteger versionmanagerMaxNumberVersions) {
    this.versionmanagerMaxNumberVersions = versionmanagerMaxNumberVersions;
  }

    
  @JsonProperty("versionmanager.minNumberVersions")
  public ConfigNodePropertyInteger getVersionmanagerMinNumberVersions() {
    return versionmanagerMinNumberVersions;
  }
  public void setVersionmanagerMinNumberVersions(ConfigNodePropertyInteger versionmanagerMinNumberVersions) {
    this.versionmanagerMinNumberVersions = versionmanagerMinNumberVersions;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
