package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqDamIdsImplIDSPoolManagerImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxErrorsToBlacklist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger retryIntervalToWhitelist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger connectTimeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger socketTimeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString processLabel = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger connectionUseMax = null;
 /**
   * Get maxErrorsToBlacklist
   * @return maxErrorsToBlacklist
  **/
  @JsonProperty("max.errors.to.blacklist")
  public ConfigNodePropertyInteger getMaxErrorsToBlacklist() {
    return maxErrorsToBlacklist;
  }

  public void setMaxErrorsToBlacklist(ConfigNodePropertyInteger maxErrorsToBlacklist) {
    this.maxErrorsToBlacklist = maxErrorsToBlacklist;
  }

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties maxErrorsToBlacklist(ConfigNodePropertyInteger maxErrorsToBlacklist) {
    this.maxErrorsToBlacklist = maxErrorsToBlacklist;
    return this;
  }

 /**
   * Get retryIntervalToWhitelist
   * @return retryIntervalToWhitelist
  **/
  @JsonProperty("retry.interval.to.whitelist")
  public ConfigNodePropertyInteger getRetryIntervalToWhitelist() {
    return retryIntervalToWhitelist;
  }

  public void setRetryIntervalToWhitelist(ConfigNodePropertyInteger retryIntervalToWhitelist) {
    this.retryIntervalToWhitelist = retryIntervalToWhitelist;
  }

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties retryIntervalToWhitelist(ConfigNodePropertyInteger retryIntervalToWhitelist) {
    this.retryIntervalToWhitelist = retryIntervalToWhitelist;
    return this;
  }

 /**
   * Get connectTimeout
   * @return connectTimeout
  **/
  @JsonProperty("connect.timeout")
  public ConfigNodePropertyInteger getConnectTimeout() {
    return connectTimeout;
  }

  public void setConnectTimeout(ConfigNodePropertyInteger connectTimeout) {
    this.connectTimeout = connectTimeout;
  }

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties connectTimeout(ConfigNodePropertyInteger connectTimeout) {
    this.connectTimeout = connectTimeout;
    return this;
  }

 /**
   * Get socketTimeout
   * @return socketTimeout
  **/
  @JsonProperty("socket.timeout")
  public ConfigNodePropertyInteger getSocketTimeout() {
    return socketTimeout;
  }

  public void setSocketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
  }

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties socketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
    return this;
  }

 /**
   * Get processLabel
   * @return processLabel
  **/
  @JsonProperty("process.label")
  public ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }

  public void setProcessLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties processLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

 /**
   * Get connectionUseMax
   * @return connectionUseMax
  **/
  @JsonProperty("connection.use.max")
  public ConfigNodePropertyInteger getConnectionUseMax() {
    return connectionUseMax;
  }

  public void setConnectionUseMax(ConfigNodePropertyInteger connectionUseMax) {
    this.connectionUseMax = connectionUseMax;
  }

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties connectionUseMax(ConfigNodePropertyInteger connectionUseMax) {
    this.connectionUseMax = connectionUseMax;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamIdsImplIDSPoolManagerImplProperties {\n");
    
    sb.append("    maxErrorsToBlacklist: ").append(toIndentedString(maxErrorsToBlacklist)).append("\n");
    sb.append("    retryIntervalToWhitelist: ").append(toIndentedString(retryIntervalToWhitelist)).append("\n");
    sb.append("    connectTimeout: ").append(toIndentedString(connectTimeout)).append("\n");
    sb.append("    socketTimeout: ").append(toIndentedString(socketTimeout)).append("\n");
    sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
    sb.append("    connectionUseMax: ").append(toIndentedString(connectionUseMax)).append("\n");
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

