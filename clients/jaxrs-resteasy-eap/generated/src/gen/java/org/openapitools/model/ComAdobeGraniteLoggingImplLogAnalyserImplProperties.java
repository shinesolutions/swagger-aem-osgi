package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeGraniteLoggingImplLogAnalyserImplProperties   {
  

  private ConfigNodePropertyInteger messagesQueueSize = null;

  private ConfigNodePropertyArray loggerConfig = null;

  private ConfigNodePropertyInteger messagesSize = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("messages.size")
  public ConfigNodePropertyInteger getMessagesSize() {
    return messagesSize;
  }
  public void setMessagesSize(ConfigNodePropertyInteger messagesSize) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

