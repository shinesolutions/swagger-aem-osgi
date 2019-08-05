package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyDropDown;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmMsmImplRolloutManagerImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqWcmMsmImplRolloutManagerImplProperties   {
  @JsonProperty("event.filter")
  private ConfigNodePropertyString eventFilter = null;

  @JsonProperty("rolloutmgr.excludedprops.default")
  private ConfigNodePropertyArray rolloutmgrExcludedpropsDefault = null;

  @JsonProperty("rolloutmgr.excludedparagraphprops.default")
  private ConfigNodePropertyArray rolloutmgrExcludedparagraphpropsDefault = null;

  @JsonProperty("rolloutmgr.excludednodetypes.default")
  private ConfigNodePropertyArray rolloutmgrExcludednodetypesDefault = null;

  @JsonProperty("rolloutmgr.threadpool.maxsize")
  private ConfigNodePropertyInteger rolloutmgrThreadpoolMaxsize = null;

  @JsonProperty("rolloutmgr.threadpool.maxshutdowntime")
  private ConfigNodePropertyInteger rolloutmgrThreadpoolMaxshutdowntime = null;

  @JsonProperty("rolloutmgr.threadpool.priority")
  private ConfigNodePropertyDropDown rolloutmgrThreadpoolPriority = null;

  @JsonProperty("rolloutmgr.commit.size")
  private ConfigNodePropertyInteger rolloutmgrCommitSize = null;

  @JsonProperty("rolloutmgr.conflicthandling.enabled")
  private ConfigNodePropertyBoolean rolloutmgrConflicthandlingEnabled = null;

  public ComDayCqWcmMsmImplRolloutManagerImplProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

   /**
   * Get eventFilter
   * @return eventFilter
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrExcludedpropsDefault(ConfigNodePropertyArray rolloutmgrExcludedpropsDefault) {
    this.rolloutmgrExcludedpropsDefault = rolloutmgrExcludedpropsDefault;
    return this;
  }

   /**
   * Get rolloutmgrExcludedpropsDefault
   * @return rolloutmgrExcludedpropsDefault
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getRolloutmgrExcludedpropsDefault() {
    return rolloutmgrExcludedpropsDefault;
  }

  public void setRolloutmgrExcludedpropsDefault(ConfigNodePropertyArray rolloutmgrExcludedpropsDefault) {
    this.rolloutmgrExcludedpropsDefault = rolloutmgrExcludedpropsDefault;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrExcludedparagraphpropsDefault(ConfigNodePropertyArray rolloutmgrExcludedparagraphpropsDefault) {
    this.rolloutmgrExcludedparagraphpropsDefault = rolloutmgrExcludedparagraphpropsDefault;
    return this;
  }

   /**
   * Get rolloutmgrExcludedparagraphpropsDefault
   * @return rolloutmgrExcludedparagraphpropsDefault
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getRolloutmgrExcludedparagraphpropsDefault() {
    return rolloutmgrExcludedparagraphpropsDefault;
  }

  public void setRolloutmgrExcludedparagraphpropsDefault(ConfigNodePropertyArray rolloutmgrExcludedparagraphpropsDefault) {
    this.rolloutmgrExcludedparagraphpropsDefault = rolloutmgrExcludedparagraphpropsDefault;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrExcludednodetypesDefault(ConfigNodePropertyArray rolloutmgrExcludednodetypesDefault) {
    this.rolloutmgrExcludednodetypesDefault = rolloutmgrExcludednodetypesDefault;
    return this;
  }

   /**
   * Get rolloutmgrExcludednodetypesDefault
   * @return rolloutmgrExcludednodetypesDefault
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getRolloutmgrExcludednodetypesDefault() {
    return rolloutmgrExcludednodetypesDefault;
  }

  public void setRolloutmgrExcludednodetypesDefault(ConfigNodePropertyArray rolloutmgrExcludednodetypesDefault) {
    this.rolloutmgrExcludednodetypesDefault = rolloutmgrExcludednodetypesDefault;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrThreadpoolMaxsize(ConfigNodePropertyInteger rolloutmgrThreadpoolMaxsize) {
    this.rolloutmgrThreadpoolMaxsize = rolloutmgrThreadpoolMaxsize;
    return this;
  }

   /**
   * Get rolloutmgrThreadpoolMaxsize
   * @return rolloutmgrThreadpoolMaxsize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getRolloutmgrThreadpoolMaxsize() {
    return rolloutmgrThreadpoolMaxsize;
  }

  public void setRolloutmgrThreadpoolMaxsize(ConfigNodePropertyInteger rolloutmgrThreadpoolMaxsize) {
    this.rolloutmgrThreadpoolMaxsize = rolloutmgrThreadpoolMaxsize;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrThreadpoolMaxshutdowntime(ConfigNodePropertyInteger rolloutmgrThreadpoolMaxshutdowntime) {
    this.rolloutmgrThreadpoolMaxshutdowntime = rolloutmgrThreadpoolMaxshutdowntime;
    return this;
  }

   /**
   * Get rolloutmgrThreadpoolMaxshutdowntime
   * @return rolloutmgrThreadpoolMaxshutdowntime
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getRolloutmgrThreadpoolMaxshutdowntime() {
    return rolloutmgrThreadpoolMaxshutdowntime;
  }

  public void setRolloutmgrThreadpoolMaxshutdowntime(ConfigNodePropertyInteger rolloutmgrThreadpoolMaxshutdowntime) {
    this.rolloutmgrThreadpoolMaxshutdowntime = rolloutmgrThreadpoolMaxshutdowntime;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrThreadpoolPriority(ConfigNodePropertyDropDown rolloutmgrThreadpoolPriority) {
    this.rolloutmgrThreadpoolPriority = rolloutmgrThreadpoolPriority;
    return this;
  }

   /**
   * Get rolloutmgrThreadpoolPriority
   * @return rolloutmgrThreadpoolPriority
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getRolloutmgrThreadpoolPriority() {
    return rolloutmgrThreadpoolPriority;
  }

  public void setRolloutmgrThreadpoolPriority(ConfigNodePropertyDropDown rolloutmgrThreadpoolPriority) {
    this.rolloutmgrThreadpoolPriority = rolloutmgrThreadpoolPriority;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrCommitSize(ConfigNodePropertyInteger rolloutmgrCommitSize) {
    this.rolloutmgrCommitSize = rolloutmgrCommitSize;
    return this;
  }

   /**
   * Get rolloutmgrCommitSize
   * @return rolloutmgrCommitSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getRolloutmgrCommitSize() {
    return rolloutmgrCommitSize;
  }

  public void setRolloutmgrCommitSize(ConfigNodePropertyInteger rolloutmgrCommitSize) {
    this.rolloutmgrCommitSize = rolloutmgrCommitSize;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrConflicthandlingEnabled(ConfigNodePropertyBoolean rolloutmgrConflicthandlingEnabled) {
    this.rolloutmgrConflicthandlingEnabled = rolloutmgrConflicthandlingEnabled;
    return this;
  }

   /**
   * Get rolloutmgrConflicthandlingEnabled
   * @return rolloutmgrConflicthandlingEnabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getRolloutmgrConflicthandlingEnabled() {
    return rolloutmgrConflicthandlingEnabled;
  }

  public void setRolloutmgrConflicthandlingEnabled(ConfigNodePropertyBoolean rolloutmgrConflicthandlingEnabled) {
    this.rolloutmgrConflicthandlingEnabled = rolloutmgrConflicthandlingEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMsmImplRolloutManagerImplProperties comDayCqWcmMsmImplRolloutManagerImplProperties = (ComDayCqWcmMsmImplRolloutManagerImplProperties) o;
    return Objects.equals(this.eventFilter, comDayCqWcmMsmImplRolloutManagerImplProperties.eventFilter) &&
        Objects.equals(this.rolloutmgrExcludedpropsDefault, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrExcludedpropsDefault) &&
        Objects.equals(this.rolloutmgrExcludedparagraphpropsDefault, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrExcludedparagraphpropsDefault) &&
        Objects.equals(this.rolloutmgrExcludednodetypesDefault, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrExcludednodetypesDefault) &&
        Objects.equals(this.rolloutmgrThreadpoolMaxsize, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrThreadpoolMaxsize) &&
        Objects.equals(this.rolloutmgrThreadpoolMaxshutdowntime, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrThreadpoolMaxshutdowntime) &&
        Objects.equals(this.rolloutmgrThreadpoolPriority, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrThreadpoolPriority) &&
        Objects.equals(this.rolloutmgrCommitSize, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrCommitSize) &&
        Objects.equals(this.rolloutmgrConflicthandlingEnabled, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrConflicthandlingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFilter, rolloutmgrExcludedpropsDefault, rolloutmgrExcludedparagraphpropsDefault, rolloutmgrExcludednodetypesDefault, rolloutmgrThreadpoolMaxsize, rolloutmgrThreadpoolMaxshutdowntime, rolloutmgrThreadpoolPriority, rolloutmgrCommitSize, rolloutmgrConflicthandlingEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMsmImplRolloutManagerImplProperties {\n");
    
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
    sb.append("    rolloutmgrExcludedpropsDefault: ").append(toIndentedString(rolloutmgrExcludedpropsDefault)).append("\n");
    sb.append("    rolloutmgrExcludedparagraphpropsDefault: ").append(toIndentedString(rolloutmgrExcludedparagraphpropsDefault)).append("\n");
    sb.append("    rolloutmgrExcludednodetypesDefault: ").append(toIndentedString(rolloutmgrExcludednodetypesDefault)).append("\n");
    sb.append("    rolloutmgrThreadpoolMaxsize: ").append(toIndentedString(rolloutmgrThreadpoolMaxsize)).append("\n");
    sb.append("    rolloutmgrThreadpoolMaxshutdowntime: ").append(toIndentedString(rolloutmgrThreadpoolMaxshutdowntime)).append("\n");
    sb.append("    rolloutmgrThreadpoolPriority: ").append(toIndentedString(rolloutmgrThreadpoolPriority)).append("\n");
    sb.append("    rolloutmgrCommitSize: ").append(toIndentedString(rolloutmgrCommitSize)).append("\n");
    sb.append("    rolloutmgrConflicthandlingEnabled: ").append(toIndentedString(rolloutmgrConflicthandlingEnabled)).append("\n");
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

