package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties   {
  @JsonProperty("streamPath")
  private ConfigNodePropertyString streamPath;

  @JsonProperty("streamName")
  private ConfigNodePropertyString streamName;

  /**
   **/
  public ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties streamPath(ConfigNodePropertyString streamPath) {
    this.streamPath = streamPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("streamPath")
  public ConfigNodePropertyString getStreamPath() {
    return streamPath;
  }
  public void setStreamPath(ConfigNodePropertyString streamPath) {
    this.streamPath = streamPath;
  }

  /**
   **/
  public ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties streamName(ConfigNodePropertyString streamName) {
    this.streamName = streamName;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

