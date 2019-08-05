package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties   {
  
  private @Valid ConfigNodePropertyBoolean cqDamMissingmetadataNotificationSchedulerIstimebased = null;
  private @Valid ConfigNodePropertyString cqDamMissingmetadataNotificationSchedulerTimebasedRule = null;
  private @Valid ConfigNodePropertyInteger cqDamMissingmetadataNotificationSchedulerPeriodRule = null;
  private @Valid ConfigNodePropertyString cqDamMissingmetadataNotificationRecipient = null;

  /**
   **/
  public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties cqDamMissingmetadataNotificationSchedulerIstimebased(ConfigNodePropertyBoolean cqDamMissingmetadataNotificationSchedulerIstimebased) {
    this.cqDamMissingmetadataNotificationSchedulerIstimebased = cqDamMissingmetadataNotificationSchedulerIstimebased;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.missingmetadata.notification.scheduler.istimebased")
  public ConfigNodePropertyBoolean getCqDamMissingmetadataNotificationSchedulerIstimebased() {
    return cqDamMissingmetadataNotificationSchedulerIstimebased;
  }
  public void setCqDamMissingmetadataNotificationSchedulerIstimebased(ConfigNodePropertyBoolean cqDamMissingmetadataNotificationSchedulerIstimebased) {
    this.cqDamMissingmetadataNotificationSchedulerIstimebased = cqDamMissingmetadataNotificationSchedulerIstimebased;
  }

  /**
   **/
  public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties cqDamMissingmetadataNotificationSchedulerTimebasedRule(ConfigNodePropertyString cqDamMissingmetadataNotificationSchedulerTimebasedRule) {
    this.cqDamMissingmetadataNotificationSchedulerTimebasedRule = cqDamMissingmetadataNotificationSchedulerTimebasedRule;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.missingmetadata.notification.scheduler.timebased.rule")
  public ConfigNodePropertyString getCqDamMissingmetadataNotificationSchedulerTimebasedRule() {
    return cqDamMissingmetadataNotificationSchedulerTimebasedRule;
  }
  public void setCqDamMissingmetadataNotificationSchedulerTimebasedRule(ConfigNodePropertyString cqDamMissingmetadataNotificationSchedulerTimebasedRule) {
    this.cqDamMissingmetadataNotificationSchedulerTimebasedRule = cqDamMissingmetadataNotificationSchedulerTimebasedRule;
  }

  /**
   **/
  public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties cqDamMissingmetadataNotificationSchedulerPeriodRule(ConfigNodePropertyInteger cqDamMissingmetadataNotificationSchedulerPeriodRule) {
    this.cqDamMissingmetadataNotificationSchedulerPeriodRule = cqDamMissingmetadataNotificationSchedulerPeriodRule;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.missingmetadata.notification.scheduler.period.rule")
  public ConfigNodePropertyInteger getCqDamMissingmetadataNotificationSchedulerPeriodRule() {
    return cqDamMissingmetadataNotificationSchedulerPeriodRule;
  }
  public void setCqDamMissingmetadataNotificationSchedulerPeriodRule(ConfigNodePropertyInteger cqDamMissingmetadataNotificationSchedulerPeriodRule) {
    this.cqDamMissingmetadataNotificationSchedulerPeriodRule = cqDamMissingmetadataNotificationSchedulerPeriodRule;
  }

  /**
   **/
  public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties cqDamMissingmetadataNotificationRecipient(ConfigNodePropertyString cqDamMissingmetadataNotificationRecipient) {
    this.cqDamMissingmetadataNotificationRecipient = cqDamMissingmetadataNotificationRecipient;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.missingmetadata.notification.recipient")
  public ConfigNodePropertyString getCqDamMissingmetadataNotificationRecipient() {
    return cqDamMissingmetadataNotificationRecipient;
  }
  public void setCqDamMissingmetadataNotificationRecipient(ConfigNodePropertyString cqDamMissingmetadataNotificationRecipient) {
    this.cqDamMissingmetadataNotificationRecipient = cqDamMissingmetadataNotificationRecipient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplMissingMetadataNotificationJobProperties comDayCqDamCoreImplMissingMetadataNotificationJobProperties = (ComDayCqDamCoreImplMissingMetadataNotificationJobProperties) o;
    return Objects.equals(cqDamMissingmetadataNotificationSchedulerIstimebased, comDayCqDamCoreImplMissingMetadataNotificationJobProperties.cqDamMissingmetadataNotificationSchedulerIstimebased) &&
        Objects.equals(cqDamMissingmetadataNotificationSchedulerTimebasedRule, comDayCqDamCoreImplMissingMetadataNotificationJobProperties.cqDamMissingmetadataNotificationSchedulerTimebasedRule) &&
        Objects.equals(cqDamMissingmetadataNotificationSchedulerPeriodRule, comDayCqDamCoreImplMissingMetadataNotificationJobProperties.cqDamMissingmetadataNotificationSchedulerPeriodRule) &&
        Objects.equals(cqDamMissingmetadataNotificationRecipient, comDayCqDamCoreImplMissingMetadataNotificationJobProperties.cqDamMissingmetadataNotificationRecipient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamMissingmetadataNotificationSchedulerIstimebased, cqDamMissingmetadataNotificationSchedulerTimebasedRule, cqDamMissingmetadataNotificationSchedulerPeriodRule, cqDamMissingmetadataNotificationRecipient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties {\n");
    
    sb.append("    cqDamMissingmetadataNotificationSchedulerIstimebased: ").append(toIndentedString(cqDamMissingmetadataNotificationSchedulerIstimebased)).append("\n");
    sb.append("    cqDamMissingmetadataNotificationSchedulerTimebasedRule: ").append(toIndentedString(cqDamMissingmetadataNotificationSchedulerTimebasedRule)).append("\n");
    sb.append("    cqDamMissingmetadataNotificationSchedulerPeriodRule: ").append(toIndentedString(cqDamMissingmetadataNotificationSchedulerPeriodRule)).append("\n");
    sb.append("    cqDamMissingmetadataNotificationRecipient: ").append(toIndentedString(cqDamMissingmetadataNotificationRecipient)).append("\n");
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

