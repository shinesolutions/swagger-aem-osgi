package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqDamCoreImplExpiryNotificationJobImplProperties   {
  

  private ConfigNodePropertyBoolean cqDamExpiryNotificationSchedulerIstimebased = null;

  private ConfigNodePropertyString cqDamExpiryNotificationSchedulerTimebasedRule = null;

  private ConfigNodePropertyInteger cqDamExpiryNotificationSchedulerPeriodRule = null;

  private ConfigNodePropertyBoolean sendEmail = null;

  private ConfigNodePropertyInteger assetExpiredLimit = null;

  private ConfigNodePropertyInteger priorNotificationSeconds = null;

  private ConfigNodePropertyString cqDamExpiryNotificationUrlProtocol = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.expiry.notification.scheduler.istimebased")
  public ConfigNodePropertyBoolean getCqDamExpiryNotificationSchedulerIstimebased() {
    return cqDamExpiryNotificationSchedulerIstimebased;
  }
  public void setCqDamExpiryNotificationSchedulerIstimebased(ConfigNodePropertyBoolean cqDamExpiryNotificationSchedulerIstimebased) {
    this.cqDamExpiryNotificationSchedulerIstimebased = cqDamExpiryNotificationSchedulerIstimebased;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.expiry.notification.scheduler.timebased.rule")
  public ConfigNodePropertyString getCqDamExpiryNotificationSchedulerTimebasedRule() {
    return cqDamExpiryNotificationSchedulerTimebasedRule;
  }
  public void setCqDamExpiryNotificationSchedulerTimebasedRule(ConfigNodePropertyString cqDamExpiryNotificationSchedulerTimebasedRule) {
    this.cqDamExpiryNotificationSchedulerTimebasedRule = cqDamExpiryNotificationSchedulerTimebasedRule;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.expiry.notification.scheduler.period.rule")
  public ConfigNodePropertyInteger getCqDamExpiryNotificationSchedulerPeriodRule() {
    return cqDamExpiryNotificationSchedulerPeriodRule;
  }
  public void setCqDamExpiryNotificationSchedulerPeriodRule(ConfigNodePropertyInteger cqDamExpiryNotificationSchedulerPeriodRule) {
    this.cqDamExpiryNotificationSchedulerPeriodRule = cqDamExpiryNotificationSchedulerPeriodRule;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("send_email")
  public ConfigNodePropertyBoolean getSendEmail() {
    return sendEmail;
  }
  public void setSendEmail(ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asset_expired_limit")
  public ConfigNodePropertyInteger getAssetExpiredLimit() {
    return assetExpiredLimit;
  }
  public void setAssetExpiredLimit(ConfigNodePropertyInteger assetExpiredLimit) {
    this.assetExpiredLimit = assetExpiredLimit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prior_notification_seconds")
  public ConfigNodePropertyInteger getPriorNotificationSeconds() {
    return priorNotificationSeconds;
  }
  public void setPriorNotificationSeconds(ConfigNodePropertyInteger priorNotificationSeconds) {
    this.priorNotificationSeconds = priorNotificationSeconds;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.expiry.notification.url.protocol")
  public ConfigNodePropertyString getCqDamExpiryNotificationUrlProtocol() {
    return cqDamExpiryNotificationUrlProtocol;
  }
  public void setCqDamExpiryNotificationUrlProtocol(ConfigNodePropertyString cqDamExpiryNotificationUrlProtocol) {
    this.cqDamExpiryNotificationUrlProtocol = cqDamExpiryNotificationUrlProtocol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplExpiryNotificationJobImplProperties comDayCqDamCoreImplExpiryNotificationJobImplProperties = (ComDayCqDamCoreImplExpiryNotificationJobImplProperties) o;
    return Objects.equals(cqDamExpiryNotificationSchedulerIstimebased, comDayCqDamCoreImplExpiryNotificationJobImplProperties.cqDamExpiryNotificationSchedulerIstimebased) &&
        Objects.equals(cqDamExpiryNotificationSchedulerTimebasedRule, comDayCqDamCoreImplExpiryNotificationJobImplProperties.cqDamExpiryNotificationSchedulerTimebasedRule) &&
        Objects.equals(cqDamExpiryNotificationSchedulerPeriodRule, comDayCqDamCoreImplExpiryNotificationJobImplProperties.cqDamExpiryNotificationSchedulerPeriodRule) &&
        Objects.equals(sendEmail, comDayCqDamCoreImplExpiryNotificationJobImplProperties.sendEmail) &&
        Objects.equals(assetExpiredLimit, comDayCqDamCoreImplExpiryNotificationJobImplProperties.assetExpiredLimit) &&
        Objects.equals(priorNotificationSeconds, comDayCqDamCoreImplExpiryNotificationJobImplProperties.priorNotificationSeconds) &&
        Objects.equals(cqDamExpiryNotificationUrlProtocol, comDayCqDamCoreImplExpiryNotificationJobImplProperties.cqDamExpiryNotificationUrlProtocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamExpiryNotificationSchedulerIstimebased, cqDamExpiryNotificationSchedulerTimebasedRule, cqDamExpiryNotificationSchedulerPeriodRule, sendEmail, assetExpiredLimit, priorNotificationSeconds, cqDamExpiryNotificationUrlProtocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplExpiryNotificationJobImplProperties {\n");
    
    sb.append("    cqDamExpiryNotificationSchedulerIstimebased: ").append(toIndentedString(cqDamExpiryNotificationSchedulerIstimebased)).append("\n");
    sb.append("    cqDamExpiryNotificationSchedulerTimebasedRule: ").append(toIndentedString(cqDamExpiryNotificationSchedulerTimebasedRule)).append("\n");
    sb.append("    cqDamExpiryNotificationSchedulerPeriodRule: ").append(toIndentedString(cqDamExpiryNotificationSchedulerPeriodRule)).append("\n");
    sb.append("    sendEmail: ").append(toIndentedString(sendEmail)).append("\n");
    sb.append("    assetExpiredLimit: ").append(toIndentedString(assetExpiredLimit)).append("\n");
    sb.append("    priorNotificationSeconds: ").append(toIndentedString(priorNotificationSeconds)).append("\n");
    sb.append("    cqDamExpiryNotificationUrlProtocol: ").append(toIndentedString(cqDamExpiryNotificationUrlProtocol)).append("\n");
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

