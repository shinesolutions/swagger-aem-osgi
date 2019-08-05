package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqDamIdsImplIDSPoolManagerImplProperties   {
  
  private ConfigNodePropertyInteger maxErrorsToBlacklist = null;

  private ConfigNodePropertyInteger retryIntervalToWhitelist = null;

  private ConfigNodePropertyInteger connectTimeout = null;

  private ConfigNodePropertyInteger socketTimeout = null;

  private ConfigNodePropertyString processLabel = null;

  private ConfigNodePropertyInteger connectionUseMax = null;


  /**
   **/
  public ComDayCqDamIdsImplIDSPoolManagerImplProperties maxErrorsToBlacklist(ConfigNodePropertyInteger maxErrorsToBlacklist) {
    this.maxErrorsToBlacklist = maxErrorsToBlacklist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("max.errors.to.blacklist")
  public ConfigNodePropertyInteger getMaxErrorsToBlacklist() {
    return maxErrorsToBlacklist;
  }
  public void setMaxErrorsToBlacklist(ConfigNodePropertyInteger maxErrorsToBlacklist) {
    this.maxErrorsToBlacklist = maxErrorsToBlacklist;
  }


  /**
   **/
  public ComDayCqDamIdsImplIDSPoolManagerImplProperties retryIntervalToWhitelist(ConfigNodePropertyInteger retryIntervalToWhitelist) {
    this.retryIntervalToWhitelist = retryIntervalToWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("retry.interval.to.whitelist")
  public ConfigNodePropertyInteger getRetryIntervalToWhitelist() {
    return retryIntervalToWhitelist;
  }
  public void setRetryIntervalToWhitelist(ConfigNodePropertyInteger retryIntervalToWhitelist) {
    this.retryIntervalToWhitelist = retryIntervalToWhitelist;
  }


  /**
   **/
  public ComDayCqDamIdsImplIDSPoolManagerImplProperties connectTimeout(ConfigNodePropertyInteger connectTimeout) {
    this.connectTimeout = connectTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("connect.timeout")
  public ConfigNodePropertyInteger getConnectTimeout() {
    return connectTimeout;
  }
  public void setConnectTimeout(ConfigNodePropertyInteger connectTimeout) {
    this.connectTimeout = connectTimeout;
  }


  /**
   **/
  public ComDayCqDamIdsImplIDSPoolManagerImplProperties socketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("socket.timeout")
  public ConfigNodePropertyInteger getSocketTimeout() {
    return socketTimeout;
  }
  public void setSocketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
  }


  /**
   **/
  public ComDayCqDamIdsImplIDSPoolManagerImplProperties processLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("process.label")
  public ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }
  public void setProcessLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }


  /**
   **/
  public ComDayCqDamIdsImplIDSPoolManagerImplProperties connectionUseMax(ConfigNodePropertyInteger connectionUseMax) {
    this.connectionUseMax = connectionUseMax;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("connection.use.max")
  public ConfigNodePropertyInteger getConnectionUseMax() {
    return connectionUseMax;
  }
  public void setConnectionUseMax(ConfigNodePropertyInteger connectionUseMax) {
    this.connectionUseMax = connectionUseMax;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamIdsImplIDSPoolManagerImplProperties comDayCqDamIdsImplIDSPoolManagerImplProperties = (ComDayCqDamIdsImplIDSPoolManagerImplProperties) o;
    return Objects.equals(maxErrorsToBlacklist, comDayCqDamIdsImplIDSPoolManagerImplProperties.maxErrorsToBlacklist) &&
        Objects.equals(retryIntervalToWhitelist, comDayCqDamIdsImplIDSPoolManagerImplProperties.retryIntervalToWhitelist) &&
        Objects.equals(connectTimeout, comDayCqDamIdsImplIDSPoolManagerImplProperties.connectTimeout) &&
        Objects.equals(socketTimeout, comDayCqDamIdsImplIDSPoolManagerImplProperties.socketTimeout) &&
        Objects.equals(processLabel, comDayCqDamIdsImplIDSPoolManagerImplProperties.processLabel) &&
        Objects.equals(connectionUseMax, comDayCqDamIdsImplIDSPoolManagerImplProperties.connectionUseMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxErrorsToBlacklist, retryIntervalToWhitelist, connectTimeout, socketTimeout, processLabel, connectionUseMax);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

