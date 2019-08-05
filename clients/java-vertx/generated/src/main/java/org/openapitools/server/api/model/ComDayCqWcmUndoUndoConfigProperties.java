package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmUndoUndoConfigProperties   {
  
  private ConfigNodePropertyBoolean cqWcmUndoEnabled = null;
  private ConfigNodePropertyString cqWcmUndoPath = null;
  private ConfigNodePropertyInteger cqWcmUndoValidity = null;
  private ConfigNodePropertyInteger cqWcmUndoSteps = null;
  private ConfigNodePropertyString cqWcmUndoPersistence = null;
  private ConfigNodePropertyBoolean cqWcmUndoPersistenceMode = null;
  private ConfigNodePropertyString cqWcmUndoMarkermode = null;
  private ConfigNodePropertyArray cqWcmUndoWhitelist = null;
  private ConfigNodePropertyArray cqWcmUndoBlacklist = null;

  public ComDayCqWcmUndoUndoConfigProperties () {

  }

  public ComDayCqWcmUndoUndoConfigProperties (ConfigNodePropertyBoolean cqWcmUndoEnabled, ConfigNodePropertyString cqWcmUndoPath, ConfigNodePropertyInteger cqWcmUndoValidity, ConfigNodePropertyInteger cqWcmUndoSteps, ConfigNodePropertyString cqWcmUndoPersistence, ConfigNodePropertyBoolean cqWcmUndoPersistenceMode, ConfigNodePropertyString cqWcmUndoMarkermode, ConfigNodePropertyArray cqWcmUndoWhitelist, ConfigNodePropertyArray cqWcmUndoBlacklist) {
    this.cqWcmUndoEnabled = cqWcmUndoEnabled;
    this.cqWcmUndoPath = cqWcmUndoPath;
    this.cqWcmUndoValidity = cqWcmUndoValidity;
    this.cqWcmUndoSteps = cqWcmUndoSteps;
    this.cqWcmUndoPersistence = cqWcmUndoPersistence;
    this.cqWcmUndoPersistenceMode = cqWcmUndoPersistenceMode;
    this.cqWcmUndoMarkermode = cqWcmUndoMarkermode;
    this.cqWcmUndoWhitelist = cqWcmUndoWhitelist;
    this.cqWcmUndoBlacklist = cqWcmUndoBlacklist;
  }

    
  @JsonProperty("cq.wcm.undo.enabled")
  public ConfigNodePropertyBoolean getCqWcmUndoEnabled() {
    return cqWcmUndoEnabled;
  }
  public void setCqWcmUndoEnabled(ConfigNodePropertyBoolean cqWcmUndoEnabled) {
    this.cqWcmUndoEnabled = cqWcmUndoEnabled;
  }

    
  @JsonProperty("cq.wcm.undo.path")
  public ConfigNodePropertyString getCqWcmUndoPath() {
    return cqWcmUndoPath;
  }
  public void setCqWcmUndoPath(ConfigNodePropertyString cqWcmUndoPath) {
    this.cqWcmUndoPath = cqWcmUndoPath;
  }

    
  @JsonProperty("cq.wcm.undo.validity")
  public ConfigNodePropertyInteger getCqWcmUndoValidity() {
    return cqWcmUndoValidity;
  }
  public void setCqWcmUndoValidity(ConfigNodePropertyInteger cqWcmUndoValidity) {
    this.cqWcmUndoValidity = cqWcmUndoValidity;
  }

    
  @JsonProperty("cq.wcm.undo.steps")
  public ConfigNodePropertyInteger getCqWcmUndoSteps() {
    return cqWcmUndoSteps;
  }
  public void setCqWcmUndoSteps(ConfigNodePropertyInteger cqWcmUndoSteps) {
    this.cqWcmUndoSteps = cqWcmUndoSteps;
  }

    
  @JsonProperty("cq.wcm.undo.persistence")
  public ConfigNodePropertyString getCqWcmUndoPersistence() {
    return cqWcmUndoPersistence;
  }
  public void setCqWcmUndoPersistence(ConfigNodePropertyString cqWcmUndoPersistence) {
    this.cqWcmUndoPersistence = cqWcmUndoPersistence;
  }

    
  @JsonProperty("cq.wcm.undo.persistence.mode")
  public ConfigNodePropertyBoolean getCqWcmUndoPersistenceMode() {
    return cqWcmUndoPersistenceMode;
  }
  public void setCqWcmUndoPersistenceMode(ConfigNodePropertyBoolean cqWcmUndoPersistenceMode) {
    this.cqWcmUndoPersistenceMode = cqWcmUndoPersistenceMode;
  }

    
  @JsonProperty("cq.wcm.undo.markermode")
  public ConfigNodePropertyString getCqWcmUndoMarkermode() {
    return cqWcmUndoMarkermode;
  }
  public void setCqWcmUndoMarkermode(ConfigNodePropertyString cqWcmUndoMarkermode) {
    this.cqWcmUndoMarkermode = cqWcmUndoMarkermode;
  }

    
  @JsonProperty("cq.wcm.undo.whitelist")
  public ConfigNodePropertyArray getCqWcmUndoWhitelist() {
    return cqWcmUndoWhitelist;
  }
  public void setCqWcmUndoWhitelist(ConfigNodePropertyArray cqWcmUndoWhitelist) {
    this.cqWcmUndoWhitelist = cqWcmUndoWhitelist;
  }

    
  @JsonProperty("cq.wcm.undo.blacklist")
  public ConfigNodePropertyArray getCqWcmUndoBlacklist() {
    return cqWcmUndoBlacklist;
  }
  public void setCqWcmUndoBlacklist(ConfigNodePropertyArray cqWcmUndoBlacklist) {
    this.cqWcmUndoBlacklist = cqWcmUndoBlacklist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmUndoUndoConfigProperties comDayCqWcmUndoUndoConfigProperties = (ComDayCqWcmUndoUndoConfigProperties) o;
    return Objects.equals(cqWcmUndoEnabled, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoEnabled) &&
        Objects.equals(cqWcmUndoPath, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoPath) &&
        Objects.equals(cqWcmUndoValidity, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoValidity) &&
        Objects.equals(cqWcmUndoSteps, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoSteps) &&
        Objects.equals(cqWcmUndoPersistence, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoPersistence) &&
        Objects.equals(cqWcmUndoPersistenceMode, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoPersistenceMode) &&
        Objects.equals(cqWcmUndoMarkermode, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoMarkermode) &&
        Objects.equals(cqWcmUndoWhitelist, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoWhitelist) &&
        Objects.equals(cqWcmUndoBlacklist, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqWcmUndoEnabled, cqWcmUndoPath, cqWcmUndoValidity, cqWcmUndoSteps, cqWcmUndoPersistence, cqWcmUndoPersistenceMode, cqWcmUndoMarkermode, cqWcmUndoWhitelist, cqWcmUndoBlacklist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmUndoUndoConfigProperties {\n");
    
    sb.append("    cqWcmUndoEnabled: ").append(toIndentedString(cqWcmUndoEnabled)).append("\n");
    sb.append("    cqWcmUndoPath: ").append(toIndentedString(cqWcmUndoPath)).append("\n");
    sb.append("    cqWcmUndoValidity: ").append(toIndentedString(cqWcmUndoValidity)).append("\n");
    sb.append("    cqWcmUndoSteps: ").append(toIndentedString(cqWcmUndoSteps)).append("\n");
    sb.append("    cqWcmUndoPersistence: ").append(toIndentedString(cqWcmUndoPersistence)).append("\n");
    sb.append("    cqWcmUndoPersistenceMode: ").append(toIndentedString(cqWcmUndoPersistenceMode)).append("\n");
    sb.append("    cqWcmUndoMarkermode: ").append(toIndentedString(cqWcmUndoMarkermode)).append("\n");
    sb.append("    cqWcmUndoWhitelist: ").append(toIndentedString(cqWcmUndoWhitelist)).append("\n");
    sb.append("    cqWcmUndoBlacklist: ").append(toIndentedString(cqWcmUndoBlacklist)).append("\n");
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
