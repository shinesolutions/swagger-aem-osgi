package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties   {
  
  private ConfigNodePropertyBoolean cqDamMissingmetadataNotificationSchedulerIstimebased;
  private ConfigNodePropertyString cqDamMissingmetadataNotificationSchedulerTimebasedRule;
  private ConfigNodePropertyInteger cqDamMissingmetadataNotificationSchedulerPeriodRule;
  private ConfigNodePropertyString cqDamMissingmetadataNotificationRecipient;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.missingmetadata.notification.recipient")
  public ConfigNodePropertyString getCqDamMissingmetadataNotificationRecipient() {
    return cqDamMissingmetadataNotificationRecipient;
  }
  public void setCqDamMissingmetadataNotificationRecipient(ConfigNodePropertyString cqDamMissingmetadataNotificationRecipient) {
    this.cqDamMissingmetadataNotificationRecipient = cqDamMissingmetadataNotificationRecipient;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

