package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComAdobeGraniteLoggingImplLogAnalyserImplProperties   {
  @JsonProperty("messages.queue.size")
  private ConfigNodePropertyInteger messagesQueueSize = null;

  @JsonProperty("logger.config")
  private ConfigNodePropertyArray loggerConfig = null;

  @JsonProperty("messages.size")
  private ConfigNodePropertyInteger messagesSize = null;

  /**
   **/
  public ComAdobeGraniteLoggingImplLogAnalyserImplProperties messagesQueueSize(ConfigNodePropertyInteger messagesQueueSize) {
    this.messagesQueueSize = messagesQueueSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("messages.queue.size")
  public ConfigNodePropertyInteger getMessagesQueueSize() {
    return messagesQueueSize;
  }
  public void setMessagesQueueSize(ConfigNodePropertyInteger messagesQueueSize) {
    this.messagesQueueSize = messagesQueueSize;
  }

  /**
   **/
  public ComAdobeGraniteLoggingImplLogAnalyserImplProperties loggerConfig(ConfigNodePropertyArray loggerConfig) {
    this.loggerConfig = loggerConfig;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("logger.config")
  public ConfigNodePropertyArray getLoggerConfig() {
    return loggerConfig;
  }
  public void setLoggerConfig(ConfigNodePropertyArray loggerConfig) {
    this.loggerConfig = loggerConfig;
  }

  /**
   **/
  public ComAdobeGraniteLoggingImplLogAnalyserImplProperties messagesSize(ConfigNodePropertyInteger messagesSize) {
    this.messagesSize = messagesSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("messages.size")
  public ConfigNodePropertyInteger getMessagesSize() {
    return messagesSize;
  }
  public void setMessagesSize(ConfigNodePropertyInteger messagesSize) {
    this.messagesSize = messagesSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteLoggingImplLogAnalyserImplProperties comAdobeGraniteLoggingImplLogAnalyserImplProperties = (ComAdobeGraniteLoggingImplLogAnalyserImplProperties) o;
    return Objects.equals(messagesQueueSize, comAdobeGraniteLoggingImplLogAnalyserImplProperties.messagesQueueSize) &&
        Objects.equals(loggerConfig, comAdobeGraniteLoggingImplLogAnalyserImplProperties.loggerConfig) &&
        Objects.equals(messagesSize, comAdobeGraniteLoggingImplLogAnalyserImplProperties.messagesSize);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

