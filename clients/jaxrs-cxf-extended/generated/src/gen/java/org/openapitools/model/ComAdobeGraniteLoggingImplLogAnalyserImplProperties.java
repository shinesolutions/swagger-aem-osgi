package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteLoggingImplLogAnalyserImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger messagesQueueSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray loggerConfig;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger messagesSize;
 /**
  * Get messagesQueueSize
  * @return messagesQueueSize
  */
  @JsonProperty("messages.queue.size")
  public ConfigNodePropertyInteger getMessagesQueueSize() {
    return messagesQueueSize;
  }

  /**
   * Sets the <code>messagesQueueSize</code> property.
   */
 public void setMessagesQueueSize(ConfigNodePropertyInteger messagesQueueSize) {
    this.messagesQueueSize = messagesQueueSize;
  }

  /**
   * Sets the <code>messagesQueueSize</code> property.
   */
  public ComAdobeGraniteLoggingImplLogAnalyserImplProperties messagesQueueSize(ConfigNodePropertyInteger messagesQueueSize) {
    this.messagesQueueSize = messagesQueueSize;
    return this;
  }

 /**
  * Get loggerConfig
  * @return loggerConfig
  */
  @JsonProperty("logger.config")
  public ConfigNodePropertyArray getLoggerConfig() {
    return loggerConfig;
  }

  /**
   * Sets the <code>loggerConfig</code> property.
   */
 public void setLoggerConfig(ConfigNodePropertyArray loggerConfig) {
    this.loggerConfig = loggerConfig;
  }

  /**
   * Sets the <code>loggerConfig</code> property.
   */
  public ComAdobeGraniteLoggingImplLogAnalyserImplProperties loggerConfig(ConfigNodePropertyArray loggerConfig) {
    this.loggerConfig = loggerConfig;
    return this;
  }

 /**
  * Get messagesSize
  * @return messagesSize
  */
  @JsonProperty("messages.size")
  public ConfigNodePropertyInteger getMessagesSize() {
    return messagesSize;
  }

  /**
   * Sets the <code>messagesSize</code> property.
   */
 public void setMessagesSize(ConfigNodePropertyInteger messagesSize) {
    this.messagesSize = messagesSize;
  }

  /**
   * Sets the <code>messagesSize</code> property.
   */
  public ComAdobeGraniteLoggingImplLogAnalyserImplProperties messagesSize(ConfigNodePropertyInteger messagesSize) {
    this.messagesSize = messagesSize;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

