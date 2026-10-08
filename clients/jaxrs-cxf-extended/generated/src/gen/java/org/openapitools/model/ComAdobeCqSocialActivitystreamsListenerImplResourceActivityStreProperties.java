package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString streamPath;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString streamName;
 /**
  * Get streamPath
  * @return streamPath
  */
  @JsonProperty("streamPath")
  public ConfigNodePropertyString getStreamPath() {
    return streamPath;
  }

  /**
   * Sets the <code>streamPath</code> property.
   */
 public void setStreamPath(ConfigNodePropertyString streamPath) {
    this.streamPath = streamPath;
  }

  /**
   * Sets the <code>streamPath</code> property.
   */
  public ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties streamPath(ConfigNodePropertyString streamPath) {
    this.streamPath = streamPath;
    return this;
  }

 /**
  * Get streamName
  * @return streamName
  */
  @JsonProperty("streamName")
  public ConfigNodePropertyString getStreamName() {
    return streamName;
  }

  /**
   * Sets the <code>streamName</code> property.
   */
 public void setStreamName(ConfigNodePropertyString streamName) {
    this.streamName = streamName;
  }

  /**
   * Sets the <code>streamName</code> property.
   */
  public ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties streamName(ConfigNodePropertyString streamName) {
    this.streamName = streamName;
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
    ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties = (ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties) o;
    return Objects.equals(this.streamPath, comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.streamPath) &&
        Objects.equals(this.streamName, comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.streamName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamPath, streamName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties {\n");
    
    sb.append("    streamPath: ").append(toIndentedString(streamPath)).append("\n");
    sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
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

