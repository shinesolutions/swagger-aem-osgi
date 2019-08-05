package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean cqDamMissingmetadataNotificationSchedulerIstimebased = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString cqDamMissingmetadataNotificationSchedulerTimebasedRule = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger cqDamMissingmetadataNotificationSchedulerPeriodRule = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString cqDamMissingmetadataNotificationRecipient = null;
 /**
   * Get cqDamMissingmetadataNotificationSchedulerIstimebased
   * @return cqDamMissingmetadataNotificationSchedulerIstimebased
  **/
  @JsonProperty("cq.dam.missingmetadata.notification.scheduler.istimebased")
  public ConfigNodePropertyBoolean getCqDamMissingmetadataNotificationSchedulerIstimebased() {
    return cqDamMissingmetadataNotificationSchedulerIstimebased;
  }

  public void setCqDamMissingmetadataNotificationSchedulerIstimebased(ConfigNodePropertyBoolean cqDamMissingmetadataNotificationSchedulerIstimebased) {
    this.cqDamMissingmetadataNotificationSchedulerIstimebased = cqDamMissingmetadataNotificationSchedulerIstimebased;
  }

  public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties cqDamMissingmetadataNotificationSchedulerIstimebased(ConfigNodePropertyBoolean cqDamMissingmetadataNotificationSchedulerIstimebased) {
    this.cqDamMissingmetadataNotificationSchedulerIstimebased = cqDamMissingmetadataNotificationSchedulerIstimebased;
    return this;
  }

 /**
   * Get cqDamMissingmetadataNotificationSchedulerTimebasedRule
   * @return cqDamMissingmetadataNotificationSchedulerTimebasedRule
  **/
  @JsonProperty("cq.dam.missingmetadata.notification.scheduler.timebased.rule")
  public ConfigNodePropertyString getCqDamMissingmetadataNotificationSchedulerTimebasedRule() {
    return cqDamMissingmetadataNotificationSchedulerTimebasedRule;
  }

  public void setCqDamMissingmetadataNotificationSchedulerTimebasedRule(ConfigNodePropertyString cqDamMissingmetadataNotificationSchedulerTimebasedRule) {
    this.cqDamMissingmetadataNotificationSchedulerTimebasedRule = cqDamMissingmetadataNotificationSchedulerTimebasedRule;
  }

  public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties cqDamMissingmetadataNotificationSchedulerTimebasedRule(ConfigNodePropertyString cqDamMissingmetadataNotificationSchedulerTimebasedRule) {
    this.cqDamMissingmetadataNotificationSchedulerTimebasedRule = cqDamMissingmetadataNotificationSchedulerTimebasedRule;
    return this;
  }

 /**
   * Get cqDamMissingmetadataNotificationSchedulerPeriodRule
   * @return cqDamMissingmetadataNotificationSchedulerPeriodRule
  **/
  @JsonProperty("cq.dam.missingmetadata.notification.scheduler.period.rule")
  public ConfigNodePropertyInteger getCqDamMissingmetadataNotificationSchedulerPeriodRule() {
    return cqDamMissingmetadataNotificationSchedulerPeriodRule;
  }

  public void setCqDamMissingmetadataNotificationSchedulerPeriodRule(ConfigNodePropertyInteger cqDamMissingmetadataNotificationSchedulerPeriodRule) {
    this.cqDamMissingmetadataNotificationSchedulerPeriodRule = cqDamMissingmetadataNotificationSchedulerPeriodRule;
  }

  public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties cqDamMissingmetadataNotificationSchedulerPeriodRule(ConfigNodePropertyInteger cqDamMissingmetadataNotificationSchedulerPeriodRule) {
    this.cqDamMissingmetadataNotificationSchedulerPeriodRule = cqDamMissingmetadataNotificationSchedulerPeriodRule;
    return this;
  }

 /**
   * Get cqDamMissingmetadataNotificationRecipient
   * @return cqDamMissingmetadataNotificationRecipient
  **/
  @JsonProperty("cq.dam.missingmetadata.notification.recipient")
  public ConfigNodePropertyString getCqDamMissingmetadataNotificationRecipient() {
    return cqDamMissingmetadataNotificationRecipient;
  }

  public void setCqDamMissingmetadataNotificationRecipient(ConfigNodePropertyString cqDamMissingmetadataNotificationRecipient) {
    this.cqDamMissingmetadataNotificationRecipient = cqDamMissingmetadataNotificationRecipient;
  }

  public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties cqDamMissingmetadataNotificationRecipient(ConfigNodePropertyString cqDamMissingmetadataNotificationRecipient) {
    this.cqDamMissingmetadataNotificationRecipient = cqDamMissingmetadataNotificationRecipient;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

