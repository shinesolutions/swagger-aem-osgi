package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties   {
  
  private ConfigNodePropertyString streamPath = null;
  private ConfigNodePropertyString streamName = null;

  public ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties () {

  }

  public ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties (ConfigNodePropertyString streamPath, ConfigNodePropertyString streamName) {
    this.streamPath = streamPath;
    this.streamName = streamName;
  }

    
  @JsonProperty("streamPath")
  public ConfigNodePropertyString getStreamPath() {
    return streamPath;
  }
  public void setStreamPath(ConfigNodePropertyString streamPath) {
    this.streamPath = streamPath;
  }

    
  @JsonProperty("streamName")
  public ConfigNodePropertyString getStreamName() {
    return streamName;
  }
  public void setStreamName(ConfigNodePropertyString streamName) {
    this.streamName = streamName;
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
    return Objects.equals(streamPath, comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.streamPath) &&
        Objects.equals(streamName, comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.streamName);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
