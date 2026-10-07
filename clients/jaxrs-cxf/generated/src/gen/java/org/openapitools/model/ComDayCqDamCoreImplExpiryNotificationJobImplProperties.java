package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplExpiryNotificationJobImplProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean cqDamExpiryNotificationSchedulerIstimebased;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString cqDamExpiryNotificationSchedulerTimebasedRule;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger cqDamExpiryNotificationSchedulerPeriodRule;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean sendEmail;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger assetExpiredLimit;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger priorNotificationSeconds;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString cqDamExpiryNotificationUrlProtocol;
 /**
   * Get cqDamExpiryNotificationSchedulerIstimebased
   * @return cqDamExpiryNotificationSchedulerIstimebased
  **/
  @JsonProperty("cq.dam.expiry.notification.scheduler.istimebased")
  public ConfigNodePropertyBoolean getCqDamExpiryNotificationSchedulerIstimebased() {
    return cqDamExpiryNotificationSchedulerIstimebased;
  }

  public void setCqDamExpiryNotificationSchedulerIstimebased(ConfigNodePropertyBoolean cqDamExpiryNotificationSchedulerIstimebased) {
    this.cqDamExpiryNotificationSchedulerIstimebased = cqDamExpiryNotificationSchedulerIstimebased;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties cqDamExpiryNotificationSchedulerIstimebased(ConfigNodePropertyBoolean cqDamExpiryNotificationSchedulerIstimebased) {
    this.cqDamExpiryNotificationSchedulerIstimebased = cqDamExpiryNotificationSchedulerIstimebased;
    return this;
  }

 /**
   * Get cqDamExpiryNotificationSchedulerTimebasedRule
   * @return cqDamExpiryNotificationSchedulerTimebasedRule
  **/
  @JsonProperty("cq.dam.expiry.notification.scheduler.timebased.rule")
  public ConfigNodePropertyString getCqDamExpiryNotificationSchedulerTimebasedRule() {
    return cqDamExpiryNotificationSchedulerTimebasedRule;
  }

  public void setCqDamExpiryNotificationSchedulerTimebasedRule(ConfigNodePropertyString cqDamExpiryNotificationSchedulerTimebasedRule) {
    this.cqDamExpiryNotificationSchedulerTimebasedRule = cqDamExpiryNotificationSchedulerTimebasedRule;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties cqDamExpiryNotificationSchedulerTimebasedRule(ConfigNodePropertyString cqDamExpiryNotificationSchedulerTimebasedRule) {
    this.cqDamExpiryNotificationSchedulerTimebasedRule = cqDamExpiryNotificationSchedulerTimebasedRule;
    return this;
  }

 /**
   * Get cqDamExpiryNotificationSchedulerPeriodRule
   * @return cqDamExpiryNotificationSchedulerPeriodRule
  **/
  @JsonProperty("cq.dam.expiry.notification.scheduler.period.rule")
  public ConfigNodePropertyInteger getCqDamExpiryNotificationSchedulerPeriodRule() {
    return cqDamExpiryNotificationSchedulerPeriodRule;
  }

  public void setCqDamExpiryNotificationSchedulerPeriodRule(ConfigNodePropertyInteger cqDamExpiryNotificationSchedulerPeriodRule) {
    this.cqDamExpiryNotificationSchedulerPeriodRule = cqDamExpiryNotificationSchedulerPeriodRule;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties cqDamExpiryNotificationSchedulerPeriodRule(ConfigNodePropertyInteger cqDamExpiryNotificationSchedulerPeriodRule) {
    this.cqDamExpiryNotificationSchedulerPeriodRule = cqDamExpiryNotificationSchedulerPeriodRule;
    return this;
  }

 /**
   * Get sendEmail
   * @return sendEmail
  **/
  @JsonProperty("send_email")
  public ConfigNodePropertyBoolean getSendEmail() {
    return sendEmail;
  }

  public void setSendEmail(ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties sendEmail(ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
    return this;
  }

 /**
   * Get assetExpiredLimit
   * @return assetExpiredLimit
  **/
  @JsonProperty("asset_expired_limit")
  public ConfigNodePropertyInteger getAssetExpiredLimit() {
    return assetExpiredLimit;
  }

  public void setAssetExpiredLimit(ConfigNodePropertyInteger assetExpiredLimit) {
    this.assetExpiredLimit = assetExpiredLimit;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties assetExpiredLimit(ConfigNodePropertyInteger assetExpiredLimit) {
    this.assetExpiredLimit = assetExpiredLimit;
    return this;
  }

 /**
   * Get priorNotificationSeconds
   * @return priorNotificationSeconds
  **/
  @JsonProperty("prior_notification_seconds")
  public ConfigNodePropertyInteger getPriorNotificationSeconds() {
    return priorNotificationSeconds;
  }

  public void setPriorNotificationSeconds(ConfigNodePropertyInteger priorNotificationSeconds) {
    this.priorNotificationSeconds = priorNotificationSeconds;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties priorNotificationSeconds(ConfigNodePropertyInteger priorNotificationSeconds) {
    this.priorNotificationSeconds = priorNotificationSeconds;
    return this;
  }

 /**
   * Get cqDamExpiryNotificationUrlProtocol
   * @return cqDamExpiryNotificationUrlProtocol
  **/
  @JsonProperty("cq.dam.expiry.notification.url.protocol")
  public ConfigNodePropertyString getCqDamExpiryNotificationUrlProtocol() {
    return cqDamExpiryNotificationUrlProtocol;
  }

  public void setCqDamExpiryNotificationUrlProtocol(ConfigNodePropertyString cqDamExpiryNotificationUrlProtocol) {
    this.cqDamExpiryNotificationUrlProtocol = cqDamExpiryNotificationUrlProtocol;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties cqDamExpiryNotificationUrlProtocol(ConfigNodePropertyString cqDamExpiryNotificationUrlProtocol) {
    this.cqDamExpiryNotificationUrlProtocol = cqDamExpiryNotificationUrlProtocol;
    return this;
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
    return Objects.equals(this.cqDamExpiryNotificationSchedulerIstimebased, comDayCqDamCoreImplExpiryNotificationJobImplProperties.cqDamExpiryNotificationSchedulerIstimebased) &&
        Objects.equals(this.cqDamExpiryNotificationSchedulerTimebasedRule, comDayCqDamCoreImplExpiryNotificationJobImplProperties.cqDamExpiryNotificationSchedulerTimebasedRule) &&
        Objects.equals(this.cqDamExpiryNotificationSchedulerPeriodRule, comDayCqDamCoreImplExpiryNotificationJobImplProperties.cqDamExpiryNotificationSchedulerPeriodRule) &&
        Objects.equals(this.sendEmail, comDayCqDamCoreImplExpiryNotificationJobImplProperties.sendEmail) &&
        Objects.equals(this.assetExpiredLimit, comDayCqDamCoreImplExpiryNotificationJobImplProperties.assetExpiredLimit) &&
        Objects.equals(this.priorNotificationSeconds, comDayCqDamCoreImplExpiryNotificationJobImplProperties.priorNotificationSeconds) &&
        Objects.equals(this.cqDamExpiryNotificationUrlProtocol, comDayCqDamCoreImplExpiryNotificationJobImplProperties.cqDamExpiryNotificationUrlProtocol);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

