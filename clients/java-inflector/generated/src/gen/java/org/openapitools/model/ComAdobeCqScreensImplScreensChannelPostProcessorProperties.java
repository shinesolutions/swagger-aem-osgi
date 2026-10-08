package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqScreensImplScreensChannelPostProcessorProperties   {
  @JsonProperty("screens.channels.properties.to.remove")
  private ConfigNodePropertyArray screensChannelsPropertiesToRemove;

  /**
   **/
  public ComAdobeCqScreensImplScreensChannelPostProcessorProperties screensChannelsPropertiesToRemove(ConfigNodePropertyArray screensChannelsPropertiesToRemove) {
    this.screensChannelsPropertiesToRemove = screensChannelsPropertiesToRemove;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("screens.channels.properties.to.remove")
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
    return Objects.equals(screensChannelsPropertiesToRemove, comAdobeCqScreensImplScreensChannelPostProcessorProperties.screensChannelsPropertiesToRemove);
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

