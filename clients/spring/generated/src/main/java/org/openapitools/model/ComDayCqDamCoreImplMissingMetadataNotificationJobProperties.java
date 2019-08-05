package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqDamCoreImplMissingMetadataNotificationJobProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties   {
  @JsonProperty("cq.dam.missingmetadata.notification.scheduler.istimebased")
  private ConfigNodePropertyBoolean cqDamMissingmetadataNotificationSchedulerIstimebased = null;

  @JsonProperty("cq.dam.missingmetadata.notification.scheduler.timebased.rule")
  private ConfigNodePropertyString cqDamMissingmetadataNotificationSchedulerTimebasedRule = null;

  @JsonProperty("cq.dam.missingmetadata.notification.scheduler.period.rule")
  private ConfigNodePropertyInteger cqDamMissingmetadataNotificationSchedulerPeriodRule = null;

  @JsonProperty("cq.dam.missingmetadata.notification.recipient")
  private ConfigNodePropertyString cqDamMissingmetadataNotificationRecipient = null;

  public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties cqDamMissingmetadataNotificationSchedulerIstimebased(ConfigNodePropertyBoolean cqDamMissingmetadataNotificationSchedulerIstimebased) {
    this.cqDamMissingmetadataNotificationSchedulerIstimebased = cqDamMissingmetadataNotificationSchedulerIstimebased;
    return this;
  }

  /**
   * Get cqDamMissingmetadataNotificationSchedulerIstimebased
   * @return cqDamMissingmetadataNotificationSchedulerIstimebased
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getCqDamMissingmetadataNotificationSchedulerIstimebased() {
    return cqDamMissingmetadataNotificationSchedulerIstimebased;
  }

  public void setCqDamMissingmetadataNotificationSchedulerIstimebased(ConfigNodePropertyBoolean cqDamMissingmetadataNotificationSchedulerIstimebased) {
    this.cqDamMissingmetadataNotificationSchedulerIstimebased = cqDamMissingmetadataNotificationSchedulerIstimebased;
  }

  public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties cqDamMissingmetadataNotificationSchedulerTimebasedRule(ConfigNodePropertyString cqDamMissingmetadataNotificationSchedulerTimebasedRule) {
    this.cqDamMissingmetadataNotificationSchedulerTimebasedRule = cqDamMissingmetadataNotificationSchedulerTimebasedRule;
    return this;
  }

  /**
   * Get cqDamMissingmetadataNotificationSchedulerTimebasedRule
   * @return cqDamMissingmetadataNotificationSchedulerTimebasedRule
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getCqDamMissingmetadataNotificationSchedulerTimebasedRule() {
    return cqDamMissingmetadataNotificationSchedulerTimebasedRule;
  }

  public void setCqDamMissingmetadataNotificationSchedulerTimebasedRule(ConfigNodePropertyString cqDamMissingmetadataNotificationSchedulerTimebasedRule) {
    this.cqDamMissingmetadataNotificationSchedulerTimebasedRule = cqDamMissingmetadataNotificationSchedulerTimebasedRule;
  }

  public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties cqDamMissingmetadataNotificationSchedulerPeriodRule(ConfigNodePropertyInteger cqDamMissingmetadataNotificationSchedulerPeriodRule) {
    this.cqDamMissingmetadataNotificationSchedulerPeriodRule = cqDamMissingmetadataNotificationSchedulerPeriodRule;
    return this;
  }

  /**
   * Get cqDamMissingmetadataNotificationSchedulerPeriodRule
   * @return cqDamMissingmetadataNotificationSchedulerPeriodRule
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCqDamMissingmetadataNotificationSchedulerPeriodRule() {
    return cqDamMissingmetadataNotificationSchedulerPeriodRule;
  }

  public void setCqDamMissingmetadataNotificationSchedulerPeriodRule(ConfigNodePropertyInteger cqDamMissingmetadataNotificationSchedulerPeriodRule) {
    this.cqDamMissingmetadataNotificationSchedulerPeriodRule = cqDamMissingmetadataNotificationSchedulerPeriodRule;
  }

  public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties cqDamMissingmetadataNotificationRecipient(ConfigNodePropertyString cqDamMissingmetadataNotificationRecipient) {
    this.cqDamMissingmetadataNotificationRecipient = cqDamMissingmetadataNotificationRecipient;
    return this;
  }

  /**
   * Get cqDamMissingmetadataNotificationRecipient
   * @return cqDamMissingmetadataNotificationRecipient
  **/
  @ApiModelProperty(value = "")

  @Valid

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
    return Objects.equals(this.cqDamMissingmetadataNotificationSchedulerIstimebased, comDayCqDamCoreImplMissingMetadataNotificationJobProperties.cqDamMissingmetadataNotificationSchedulerIstimebased) &&
        Objects.equals(this.cqDamMissingmetadataNotificationSchedulerTimebasedRule, comDayCqDamCoreImplMissingMetadataNotificationJobProperties.cqDamMissingmetadataNotificationSchedulerTimebasedRule) &&
        Objects.equals(this.cqDamMissingmetadataNotificationSchedulerPeriodRule, comDayCqDamCoreImplMissingMetadataNotificationJobProperties.cqDamMissingmetadataNotificationSchedulerPeriodRule) &&
        Objects.equals(this.cqDamMissingmetadataNotificationRecipient, comDayCqDamCoreImplMissingMetadataNotificationJobProperties.cqDamMissingmetadataNotificationRecipient);
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

