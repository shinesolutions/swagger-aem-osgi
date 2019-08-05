package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmUndoUndoConfigProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmUndoUndoConfigProperties   {
  @JsonProperty("cq.wcm.undo.enabled")
  private ConfigNodePropertyBoolean cqWcmUndoEnabled = null;

  @JsonProperty("cq.wcm.undo.path")
  private ConfigNodePropertyString cqWcmUndoPath = null;

  @JsonProperty("cq.wcm.undo.validity")
  private ConfigNodePropertyInteger cqWcmUndoValidity = null;

  @JsonProperty("cq.wcm.undo.steps")
  private ConfigNodePropertyInteger cqWcmUndoSteps = null;

  @JsonProperty("cq.wcm.undo.persistence")
  private ConfigNodePropertyString cqWcmUndoPersistence = null;

  @JsonProperty("cq.wcm.undo.persistence.mode")
  private ConfigNodePropertyBoolean cqWcmUndoPersistenceMode = null;

  @JsonProperty("cq.wcm.undo.markermode")
  private ConfigNodePropertyString cqWcmUndoMarkermode = null;

  @JsonProperty("cq.wcm.undo.whitelist")
  private ConfigNodePropertyArray cqWcmUndoWhitelist = null;

  @JsonProperty("cq.wcm.undo.blacklist")
  private ConfigNodePropertyArray cqWcmUndoBlacklist = null;

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoEnabled(ConfigNodePropertyBoolean cqWcmUndoEnabled) {
    this.cqWcmUndoEnabled = cqWcmUndoEnabled;
    return this;
  }

   /**
   * Get cqWcmUndoEnabled
   * @return cqWcmUndoEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getCqWcmUndoEnabled() {
    return cqWcmUndoEnabled;
  }

  public void setCqWcmUndoEnabled(ConfigNodePropertyBoolean cqWcmUndoEnabled) {
    this.cqWcmUndoEnabled = cqWcmUndoEnabled;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoPath(ConfigNodePropertyString cqWcmUndoPath) {
    this.cqWcmUndoPath = cqWcmUndoPath;
    return this;
  }

   /**
   * Get cqWcmUndoPath
   * @return cqWcmUndoPath
  **/
  @Valid
  public ConfigNodePropertyString getCqWcmUndoPath() {
    return cqWcmUndoPath;
  }

  public void setCqWcmUndoPath(ConfigNodePropertyString cqWcmUndoPath) {
    this.cqWcmUndoPath = cqWcmUndoPath;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoValidity(ConfigNodePropertyInteger cqWcmUndoValidity) {
    this.cqWcmUndoValidity = cqWcmUndoValidity;
    return this;
  }

   /**
   * Get cqWcmUndoValidity
   * @return cqWcmUndoValidity
  **/
  @Valid
  public ConfigNodePropertyInteger getCqWcmUndoValidity() {
    return cqWcmUndoValidity;
  }

  public void setCqWcmUndoValidity(ConfigNodePropertyInteger cqWcmUndoValidity) {
    this.cqWcmUndoValidity = cqWcmUndoValidity;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoSteps(ConfigNodePropertyInteger cqWcmUndoSteps) {
    this.cqWcmUndoSteps = cqWcmUndoSteps;
    return this;
  }

   /**
   * Get cqWcmUndoSteps
   * @return cqWcmUndoSteps
  **/
  @Valid
  public ConfigNodePropertyInteger getCqWcmUndoSteps() {
    return cqWcmUndoSteps;
  }

  public void setCqWcmUndoSteps(ConfigNodePropertyInteger cqWcmUndoSteps) {
    this.cqWcmUndoSteps = cqWcmUndoSteps;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoPersistence(ConfigNodePropertyString cqWcmUndoPersistence) {
    this.cqWcmUndoPersistence = cqWcmUndoPersistence;
    return this;
  }

   /**
   * Get cqWcmUndoPersistence
   * @return cqWcmUndoPersistence
  **/
  @Valid
  public ConfigNodePropertyString getCqWcmUndoPersistence() {
    return cqWcmUndoPersistence;
  }

  public void setCqWcmUndoPersistence(ConfigNodePropertyString cqWcmUndoPersistence) {
    this.cqWcmUndoPersistence = cqWcmUndoPersistence;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoPersistenceMode(ConfigNodePropertyBoolean cqWcmUndoPersistenceMode) {
    this.cqWcmUndoPersistenceMode = cqWcmUndoPersistenceMode;
    return this;
  }

   /**
   * Get cqWcmUndoPersistenceMode
   * @return cqWcmUndoPersistenceMode
  **/
  @Valid
  public ConfigNodePropertyBoolean getCqWcmUndoPersistenceMode() {
    return cqWcmUndoPersistenceMode;
  }

  public void setCqWcmUndoPersistenceMode(ConfigNodePropertyBoolean cqWcmUndoPersistenceMode) {
    this.cqWcmUndoPersistenceMode = cqWcmUndoPersistenceMode;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoMarkermode(ConfigNodePropertyString cqWcmUndoMarkermode) {
    this.cqWcmUndoMarkermode = cqWcmUndoMarkermode;
    return this;
  }

   /**
   * Get cqWcmUndoMarkermode
   * @return cqWcmUndoMarkermode
  **/
  @Valid
  public ConfigNodePropertyString getCqWcmUndoMarkermode() {
    return cqWcmUndoMarkermode;
  }

  public void setCqWcmUndoMarkermode(ConfigNodePropertyString cqWcmUndoMarkermode) {
    this.cqWcmUndoMarkermode = cqWcmUndoMarkermode;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoWhitelist(ConfigNodePropertyArray cqWcmUndoWhitelist) {
    this.cqWcmUndoWhitelist = cqWcmUndoWhitelist;
    return this;
  }

   /**
   * Get cqWcmUndoWhitelist
   * @return cqWcmUndoWhitelist
  **/
  @Valid
  public ConfigNodePropertyArray getCqWcmUndoWhitelist() {
    return cqWcmUndoWhitelist;
  }

  public void setCqWcmUndoWhitelist(ConfigNodePropertyArray cqWcmUndoWhitelist) {
    this.cqWcmUndoWhitelist = cqWcmUndoWhitelist;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoBlacklist(ConfigNodePropertyArray cqWcmUndoBlacklist) {
    this.cqWcmUndoBlacklist = cqWcmUndoBlacklist;
    return this;
  }

   /**
   * Get cqWcmUndoBlacklist
   * @return cqWcmUndoBlacklist
  **/
  @Valid
  public ConfigNodePropertyArray getCqWcmUndoBlacklist() {
    return cqWcmUndoBlacklist;
  }

  public void setCqWcmUndoBlacklist(ConfigNodePropertyArray cqWcmUndoBlacklist) {
    this.cqWcmUndoBlacklist = cqWcmUndoBlacklist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

