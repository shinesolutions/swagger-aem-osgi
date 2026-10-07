package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
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
 * ComDayCqDamCoreImplExpiryNotificationJobImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplExpiryNotificationJobImplProperties   {
  @JsonProperty("cq.dam.expiry.notification.scheduler.istimebased")
  private ConfigNodePropertyBoolean cqDamExpiryNotificationSchedulerIstimebased;

  @JsonProperty("cq.dam.expiry.notification.scheduler.timebased.rule")
  private ConfigNodePropertyString cqDamExpiryNotificationSchedulerTimebasedRule;

  @JsonProperty("cq.dam.expiry.notification.scheduler.period.rule")
  private ConfigNodePropertyInteger cqDamExpiryNotificationSchedulerPeriodRule;

  @JsonProperty("send_email")
  private ConfigNodePropertyBoolean sendEmail;

  @JsonProperty("asset_expired_limit")
  private ConfigNodePropertyInteger assetExpiredLimit;

  @JsonProperty("prior_notification_seconds")
  private ConfigNodePropertyInteger priorNotificationSeconds;

  @JsonProperty("cq.dam.expiry.notification.url.protocol")
  private ConfigNodePropertyString cqDamExpiryNotificationUrlProtocol;

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties cqDamExpiryNotificationSchedulerIstimebased(ConfigNodePropertyBoolean cqDamExpiryNotificationSchedulerIstimebased) {
    this.cqDamExpiryNotificationSchedulerIstimebased = cqDamExpiryNotificationSchedulerIstimebased;
    return this;
  }

  /**
   * Get cqDamExpiryNotificationSchedulerIstimebased
   * @return cqDamExpiryNotificationSchedulerIstimebased
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCqDamExpiryNotificationSchedulerIstimebased() {
    return cqDamExpiryNotificationSchedulerIstimebased;
  }

  public void setCqDamExpiryNotificationSchedulerIstimebased(ConfigNodePropertyBoolean cqDamExpiryNotificationSchedulerIstimebased) {
    this.cqDamExpiryNotificationSchedulerIstimebased = cqDamExpiryNotificationSchedulerIstimebased;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties cqDamExpiryNotificationSchedulerTimebasedRule(ConfigNodePropertyString cqDamExpiryNotificationSchedulerTimebasedRule) {
    this.cqDamExpiryNotificationSchedulerTimebasedRule = cqDamExpiryNotificationSchedulerTimebasedRule;
    return this;
  }

  /**
   * Get cqDamExpiryNotificationSchedulerTimebasedRule
   * @return cqDamExpiryNotificationSchedulerTimebasedRule
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getCqDamExpiryNotificationSchedulerTimebasedRule() {
    return cqDamExpiryNotificationSchedulerTimebasedRule;
  }

  public void setCqDamExpiryNotificationSchedulerTimebasedRule(ConfigNodePropertyString cqDamExpiryNotificationSchedulerTimebasedRule) {
    this.cqDamExpiryNotificationSchedulerTimebasedRule = cqDamExpiryNotificationSchedulerTimebasedRule;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties cqDamExpiryNotificationSchedulerPeriodRule(ConfigNodePropertyInteger cqDamExpiryNotificationSchedulerPeriodRule) {
    this.cqDamExpiryNotificationSchedulerPeriodRule = cqDamExpiryNotificationSchedulerPeriodRule;
    return this;
  }

  /**
   * Get cqDamExpiryNotificationSchedulerPeriodRule
   * @return cqDamExpiryNotificationSchedulerPeriodRule
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCqDamExpiryNotificationSchedulerPeriodRule() {
    return cqDamExpiryNotificationSchedulerPeriodRule;
  }

  public void setCqDamExpiryNotificationSchedulerPeriodRule(ConfigNodePropertyInteger cqDamExpiryNotificationSchedulerPeriodRule) {
    this.cqDamExpiryNotificationSchedulerPeriodRule = cqDamExpiryNotificationSchedulerPeriodRule;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties sendEmail(ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
    return this;
  }

  /**
   * Get sendEmail
   * @return sendEmail
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getSendEmail() {
    return sendEmail;
  }

  public void setSendEmail(ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties assetExpiredLimit(ConfigNodePropertyInteger assetExpiredLimit) {
    this.assetExpiredLimit = assetExpiredLimit;
    return this;
  }

  /**
   * Get assetExpiredLimit
   * @return assetExpiredLimit
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getAssetExpiredLimit() {
    return assetExpiredLimit;
  }

  public void setAssetExpiredLimit(ConfigNodePropertyInteger assetExpiredLimit) {
    this.assetExpiredLimit = assetExpiredLimit;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties priorNotificationSeconds(ConfigNodePropertyInteger priorNotificationSeconds) {
    this.priorNotificationSeconds = priorNotificationSeconds;
    return this;
  }

  /**
   * Get priorNotificationSeconds
   * @return priorNotificationSeconds
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getPriorNotificationSeconds() {
    return priorNotificationSeconds;
  }

  public void setPriorNotificationSeconds(ConfigNodePropertyInteger priorNotificationSeconds) {
    this.priorNotificationSeconds = priorNotificationSeconds;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties cqDamExpiryNotificationUrlProtocol(ConfigNodePropertyString cqDamExpiryNotificationUrlProtocol) {
    this.cqDamExpiryNotificationUrlProtocol = cqDamExpiryNotificationUrlProtocol;
    return this;
  }

  /**
   * Get cqDamExpiryNotificationUrlProtocol
   * @return cqDamExpiryNotificationUrlProtocol
   */
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

