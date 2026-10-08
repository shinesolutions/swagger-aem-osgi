package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqScreensImplScreensChannelPostProcessorProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("screens.channels.properties.to.remove")
  private ConfigNodePropertyArray screensChannelsPropertiesToRemove;

  /**
   * 
   * @return screensChannelsPropertiesToRemove
   */
  public ConfigNodePropertyArray getScreensChannelsPropertiesToRemove() {
    return screensChannelsPropertiesToRemove;
  }

  public void setScreensChannelsPropertiesToRemove(ConfigNodePropertyArray screensChannelsPropertiesToRemove) {
    this.screensChannelsPropertiesToRemove = screensChannelsPropertiesToRemove;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensImplScreensChannelPostProcessorProperties comAdobeCqScreensImplScreensChannelPostProcessorProperties = (ComAdobeCqScreensImplScreensChannelPostProcessorProperties) o;
    return Objects.equals(this.screensChannelsPropertiesToRemove, comAdobeCqScreensImplScreensChannelPostProcessorProperties.screensChannelsPropertiesToRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(screensChannelsPropertiesToRemove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensImplScreensChannelPostProcessorProperties {\n");
    
    sb.append("    screensChannelsPropertiesToRemove: ").append(toIndentedString(screensChannelsPropertiesToRemove)).append("\n");
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
