package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamIdsImplIDSPoolManagerImplProperties   {
  
  private ConfigNodePropertyInteger maxErrorsToBlacklist = null;
  private ConfigNodePropertyInteger retryIntervalToWhitelist = null;
  private ConfigNodePropertyInteger connectTimeout = null;
  private ConfigNodePropertyInteger socketTimeout = null;
  private ConfigNodePropertyString processLabel = null;
  private ConfigNodePropertyInteger connectionUseMax = null;

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties () {

  }

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties (ConfigNodePropertyInteger maxErrorsToBlacklist, ConfigNodePropertyInteger retryIntervalToWhitelist, ConfigNodePropertyInteger connectTimeout, ConfigNodePropertyInteger socketTimeout, ConfigNodePropertyString processLabel, ConfigNodePropertyInteger connectionUseMax) {
    this.maxErrorsToBlacklist = maxErrorsToBlacklist;
    this.retryIntervalToWhitelist = retryIntervalToWhitelist;
    this.connectTimeout = connectTimeout;
    this.socketTimeout = socketTimeout;
    this.processLabel = processLabel;
    this.connectionUseMax = connectionUseMax;
  }

    
  @JsonProperty("max.errors.to.blacklist")
  public ConfigNodePropertyInteger getMaxErrorsToBlacklist() {
    return maxErrorsToBlacklist;
  }
  public void setMaxErrorsToBlacklist(ConfigNodePropertyInteger maxErrorsToBlacklist) {
    this.maxErrorsToBlacklist = maxErrorsToBlacklist;
  }

    
  @JsonProperty("retry.interval.to.whitelist")
  public ConfigNodePropertyInteger getRetryIntervalToWhitelist() {
    return retryIntervalToWhitelist;
  }
  public void setRetryIntervalToWhitelist(ConfigNodePropertyInteger retryIntervalToWhitelist) {
    this.retryIntervalToWhitelist = retryIntervalToWhitelist;
  }

    
  @JsonProperty("connect.timeout")
  public ConfigNodePropertyInteger getConnectTimeout() {
    return connectTimeout;
  }
  public void setConnectTimeout(ConfigNodePropertyInteger connectTimeout) {
    this.connectTimeout = connectTimeout;
  }

    
  @JsonProperty("socket.timeout")
  public ConfigNodePropertyInteger getSocketTimeout() {
    return socketTimeout;
  }
  public void setSocketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
  }

    
  @JsonProperty("process.label")
  public ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }
  public void setProcessLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }

    
  @JsonProperty("connection.use.max")
  public ConfigNodePropertyInteger getConnectionUseMax() {
    return connectionUseMax;
  }
  public void setConnectionUseMax(ConfigNodePropertyInteger connectionUseMax) {
    this.connectionUseMax = connectionUseMax;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
