package apimodels;

import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamIdsImplIDSPoolManagerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamIdsImplIDSPoolManagerImplProperties   {
  @JsonProperty("max.errors.to.blacklist")
  private ConfigNodePropertyInteger maxErrorsToBlacklist = null;

  @JsonProperty("retry.interval.to.whitelist")
  private ConfigNodePropertyInteger retryIntervalToWhitelist = null;

  @JsonProperty("connect.timeout")
  private ConfigNodePropertyInteger connectTimeout = null;

  @JsonProperty("socket.timeout")
  private ConfigNodePropertyInteger socketTimeout = null;

  @JsonProperty("process.label")
  private ConfigNodePropertyString processLabel = null;

  @JsonProperty("connection.use.max")
  private ConfigNodePropertyInteger connectionUseMax = null;

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties maxErrorsToBlacklist(ConfigNodePropertyInteger maxErrorsToBlacklist) {
    this.maxErrorsToBlacklist = maxErrorsToBlacklist;
    return this;
  }

   /**
   * Get maxErrorsToBlacklist
   * @return maxErrorsToBlacklist
  **/
  @Valid
  public ConfigNodePropertyInteger getMaxErrorsToBlacklist() {
    return maxErrorsToBlacklist;
  }

  public void setMaxErrorsToBlacklist(ConfigNodePropertyInteger maxErrorsToBlacklist) {
    this.maxErrorsToBlacklist = maxErrorsToBlacklist;
  }

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties retryIntervalToWhitelist(ConfigNodePropertyInteger retryIntervalToWhitelist) {
    this.retryIntervalToWhitelist = retryIntervalToWhitelist;
    return this;
  }

   /**
   * Get retryIntervalToWhitelist
   * @return retryIntervalToWhitelist
  **/
  @Valid
  public ConfigNodePropertyInteger getRetryIntervalToWhitelist() {
    return retryIntervalToWhitelist;
  }

  public void setRetryIntervalToWhitelist(ConfigNodePropertyInteger retryIntervalToWhitelist) {
    this.retryIntervalToWhitelist = retryIntervalToWhitelist;
  }

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties connectTimeout(ConfigNodePropertyInteger connectTimeout) {
    this.connectTimeout = connectTimeout;
    return this;
  }

   /**
   * Get connectTimeout
   * @return connectTimeout
  **/
  @Valid
  public ConfigNodePropertyInteger getConnectTimeout() {
    return connectTimeout;
  }

  public void setConnectTimeout(ConfigNodePropertyInteger connectTimeout) {
    this.connectTimeout = connectTimeout;
  }

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties socketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
    return this;
  }

   /**
   * Get socketTimeout
   * @return socketTimeout
  **/
  @Valid
  public ConfigNodePropertyInteger getSocketTimeout() {
    return socketTimeout;
  }

  public void setSocketTimeout(ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
  }

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties processLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

   /**
   * Get processLabel
   * @return processLabel
  **/
  @Valid
  public ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }

  public void setProcessLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties connectionUseMax(ConfigNodePropertyInteger connectionUseMax) {
    this.connectionUseMax = connectionUseMax;
    return this;
  }

   /**
   * Get connectionUseMax
   * @return connectionUseMax
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

