package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqDamIdsImplIDSPoolManagerImplProperties
 */

@JsonTypeName("comDayCqDamIdsImplIDSPoolManagerImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamIdsImplIDSPoolManagerImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxErrorsToBlacklist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger retryIntervalToWhitelist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger connectTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger socketTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString processLabel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger connectionUseMax;

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties maxErrorsToBlacklist(@Nullable ConfigNodePropertyInteger maxErrorsToBlacklist) {
    this.maxErrorsToBlacklist = maxErrorsToBlacklist;
    return this;
  }

  /**
   * Get maxErrorsToBlacklist
   * @return maxErrorsToBlacklist
   */
  @Valid 
  @Schema(name = "max.errors.to.blacklist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max.errors.to.blacklist")
  public @Nullable ConfigNodePropertyInteger getMaxErrorsToBlacklist() {
    return maxErrorsToBlacklist;
  }

  @JsonProperty("max.errors.to.blacklist")
  public void setMaxErrorsToBlacklist(@Nullable ConfigNodePropertyInteger maxErrorsToBlacklist) {
    this.maxErrorsToBlacklist = maxErrorsToBlacklist;
  }

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties retryIntervalToWhitelist(@Nullable ConfigNodePropertyInteger retryIntervalToWhitelist) {
    this.retryIntervalToWhitelist = retryIntervalToWhitelist;
    return this;
  }

  /**
   * Get retryIntervalToWhitelist
   * @return retryIntervalToWhitelist
   */
  @Valid 
  @Schema(name = "retry.interval.to.whitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retry.interval.to.whitelist")
  public @Nullable ConfigNodePropertyInteger getRetryIntervalToWhitelist() {
    return retryIntervalToWhitelist;
  }

  @JsonProperty("retry.interval.to.whitelist")
  public void setRetryIntervalToWhitelist(@Nullable ConfigNodePropertyInteger retryIntervalToWhitelist) {
    this.retryIntervalToWhitelist = retryIntervalToWhitelist;
  }

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties connectTimeout(@Nullable ConfigNodePropertyInteger connectTimeout) {
    this.connectTimeout = connectTimeout;
    return this;
  }

  /**
   * Get connectTimeout
   * @return connectTimeout
   */
  @Valid 
  @Schema(name = "connect.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connect.timeout")
  public @Nullable ConfigNodePropertyInteger getConnectTimeout() {
    return connectTimeout;
  }

  @JsonProperty("connect.timeout")
  public void setConnectTimeout(@Nullable ConfigNodePropertyInteger connectTimeout) {
    this.connectTimeout = connectTimeout;
  }

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties socketTimeout(@Nullable ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
    return this;
  }

  /**
   * Get socketTimeout
   * @return socketTimeout
   */
  @Valid 
  @Schema(name = "socket.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("socket.timeout")
  public @Nullable ConfigNodePropertyInteger getSocketTimeout() {
    return socketTimeout;
  }

  @JsonProperty("socket.timeout")
  public void setSocketTimeout(@Nullable ConfigNodePropertyInteger socketTimeout) {
    this.socketTimeout = socketTimeout;
  }

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties processLabel(@Nullable ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

  /**
   * Get processLabel
   * @return processLabel
   */
  @Valid 
  @Schema(name = "process.label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("process.label")
  public @Nullable ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }

  @JsonProperty("process.label")
  public void setProcessLabel(@Nullable ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }

  public ComDayCqDamIdsImplIDSPoolManagerImplProperties connectionUseMax(@Nullable ConfigNodePropertyInteger connectionUseMax) {
    this.connectionUseMax = connectionUseMax;
    return this;
  }

  /**
   * Get connectionUseMax
   * @return connectionUseMax
   */
  @Valid 
  @Schema(name = "connection.use.max", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connection.use.max")
  public @Nullable ConfigNodePropertyInteger getConnectionUseMax() {
    return connectionUseMax;
  }

  @JsonProperty("connection.use.max")
  public void setConnectionUseMax(@Nullable ConfigNodePropertyInteger connectionUseMax) {
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
    return Objects.equals(this.maxErrorsToBlacklist, comDayCqDamIdsImplIDSPoolManagerImplProperties.maxErrorsToBlacklist) &&
        Objects.equals(this.retryIntervalToWhitelist, comDayCqDamIdsImplIDSPoolManagerImplProperties.retryIntervalToWhitelist) &&
        Objects.equals(this.connectTimeout, comDayCqDamIdsImplIDSPoolManagerImplProperties.connectTimeout) &&
        Objects.equals(this.socketTimeout, comDayCqDamIdsImplIDSPoolManagerImplProperties.socketTimeout) &&
        Objects.equals(this.processLabel, comDayCqDamIdsImplIDSPoolManagerImplProperties.processLabel) &&
        Objects.equals(this.connectionUseMax, comDayCqDamIdsImplIDSPoolManagerImplProperties.connectionUseMax);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

