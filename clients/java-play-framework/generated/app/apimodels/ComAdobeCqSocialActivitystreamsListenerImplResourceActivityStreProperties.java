package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties   {
  @JsonProperty("streamPath")
  @Valid

  private ConfigNodePropertyString streamPath;

  @JsonProperty("streamName")
  @Valid

  private ConfigNodePropertyString streamName;

  public ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties streamPath(ConfigNodePropertyString streamPath) {
    this.streamPath = streamPath;
    return this;
  }

   /**
   * Get streamPath
   * @return streamPath
  **/
  public ConfigNodePropertyString getStreamPath() {
    return streamPath;
  }

  public void setStreamPath(ConfigNodePropertyString streamPath) {
    this.streamPath = streamPath;
  }

  public ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties streamName(ConfigNodePropertyString streamName) {
    this.streamName = streamName;
    return this;
  }

   /**
   * Get streamName
   * @return streamName
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

