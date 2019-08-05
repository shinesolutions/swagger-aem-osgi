package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString streamPath = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString streamName = null;
 /**
   * Get streamPath
   * @return streamPath
  **/
  @JsonProperty("streamPath")
  public ConfigNodePropertyString getStreamPath() {
    return streamPath;
  }

  public void setStreamPath(ConfigNodePropertyString streamPath) {
    this.streamPath = streamPath;
  }

  public ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties streamPath(ConfigNodePropertyString streamPath) {
    this.streamPath = streamPath;
    return this;
  }

 /**
   * Get streamName
   * @return streamName
  **/
  @JsonProperty("streamName")
  public ConfigNodePropertyString getStreamName() {
    return streamName;
  }

  public void setStreamName(ConfigNodePropertyString streamName) {
    this.streamName = streamName;
  }

  public ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties streamName(ConfigNodePropertyString streamName) {
    this.streamName = streamName;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

