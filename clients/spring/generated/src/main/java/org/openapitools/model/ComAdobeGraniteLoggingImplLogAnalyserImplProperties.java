package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteLoggingImplLogAnalyserImplProperties
 */

@JsonTypeName("comAdobeGraniteLoggingImplLogAnalyserImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteLoggingImplLogAnalyserImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger messagesQueueSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray loggerConfig;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger messagesSize;

  public ComAdobeGraniteLoggingImplLogAnalyserImplProperties messagesQueueSize(@Nullable ConfigNodePropertyInteger messagesQueueSize) {
    this.messagesQueueSize = messagesQueueSize;
    return this;
  }

  /**
   * Get messagesQueueSize
   * @return messagesQueueSize
   */
  @Valid 
  @Schema(name = "messages.queue.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messages.queue.size")
  public @Nullable ConfigNodePropertyInteger getMessagesQueueSize() {
    return messagesQueueSize;
  }

  @JsonProperty("messages.queue.size")
  public void setMessagesQueueSize(@Nullable ConfigNodePropertyInteger messagesQueueSize) {
    this.messagesQueueSize = messagesQueueSize;
  }

  public ComAdobeGraniteLoggingImplLogAnalyserImplProperties loggerConfig(@Nullable ConfigNodePropertyArray loggerConfig) {
    this.loggerConfig = loggerConfig;
    return this;
  }

  /**
   * Get loggerConfig
   * @return loggerConfig
   */
  @Valid 
  @Schema(name = "logger.config", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logger.config")
  public @Nullable ConfigNodePropertyArray getLoggerConfig() {
    return loggerConfig;
  }

  @JsonProperty("logger.config")
  public void setLoggerConfig(@Nullable ConfigNodePropertyArray loggerConfig) {
    this.loggerConfig = loggerConfig;
  }

  public ComAdobeGraniteLoggingImplLogAnalyserImplProperties messagesSize(@Nullable ConfigNodePropertyInteger messagesSize) {
    this.messagesSize = messagesSize;
    return this;
  }

  /**
   * Get messagesSize
   * @return messagesSize
   */
  @Valid 
  @Schema(name = "messages.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messages.size")
  public @Nullable ConfigNodePropertyInteger getMessagesSize() {
    return messagesSize;
  }

  @JsonProperty("messages.size")
  public void setMessagesSize(@Nullable ConfigNodePropertyInteger messagesSize) {
    this.messagesSize = messagesSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteLoggingImplLogAnalyserImplProperties comAdobeGraniteLoggingImplLogAnalyserImplProperties = (ComAdobeGraniteLoggingImplLogAnalyserImplProperties) o;
    return Objects.equals(this.messagesQueueSize, comAdobeGraniteLoggingImplLogAnalyserImplProperties.messagesQueueSize) &&
        Objects.equals(this.loggerConfig, comAdobeGraniteLoggingImplLogAnalyserImplProperties.loggerConfig) &&
        Objects.equals(this.messagesSize, comAdobeGraniteLoggingImplLogAnalyserImplProperties.messagesSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messagesQueueSize, loggerConfig, messagesSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteLoggingImplLogAnalyserImplProperties {\n");
    sb.append("    messagesQueueSize: ").append(toIndentedString(messagesQueueSize)).append("\n");
    sb.append("    loggerConfig: ").append(toIndentedString(loggerConfig)).append("\n");
    sb.append("    messagesSize: ").append(toIndentedString(messagesSize)).append("\n");
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

