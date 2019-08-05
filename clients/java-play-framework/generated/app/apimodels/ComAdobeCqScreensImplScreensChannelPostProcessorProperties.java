package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqScreensImplScreensChannelPostProcessorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqScreensImplScreensChannelPostProcessorProperties   {
  @JsonProperty("screens.channels.properties.to.remove")
  private ConfigNodePropertyArray screensChannelsPropertiesToRemove = null;

  public ComAdobeCqScreensImplScreensChannelPostProcessorProperties screensChannelsPropertiesToRemove(ConfigNodePropertyArray screensChannelsPropertiesToRemove) {
    this.screensChannelsPropertiesToRemove = screensChannelsPropertiesToRemove;
    return this;
  }

   /**
   * Get screensChannelsPropertiesToRemove
   * @return screensChannelsPropertiesToRemove
  **/
  @Valid
  public ConfigNodePropertyArray getScreensChannelsPropertiesToRemove() {
    return screensChannelsPropertiesToRemove;
  }

  public void setScreensChannelsPropertiesToRemove(ConfigNodePropertyArray screensChannelsPropertiesToRemove) {
    this.screensChannelsPropertiesToRemove = screensChannelsPropertiesToRemove;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

