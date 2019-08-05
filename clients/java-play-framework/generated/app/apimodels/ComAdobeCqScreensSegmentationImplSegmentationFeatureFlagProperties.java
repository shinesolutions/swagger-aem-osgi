package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties   {
  @JsonProperty("enableDataTriggeredContent")
  private ConfigNodePropertyBoolean enableDataTriggeredContent = null;

  public ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties enableDataTriggeredContent(ConfigNodePropertyBoolean enableDataTriggeredContent) {
    this.enableDataTriggeredContent = enableDataTriggeredContent;
    return this;
  }

   /**
   * Get enableDataTriggeredContent
   * @return enableDataTriggeredContent
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnableDataTriggeredContent() {
    return enableDataTriggeredContent;
  }

  public void setEnableDataTriggeredContent(ConfigNodePropertyBoolean enableDataTriggeredContent) {
    this.enableDataTriggeredContent = enableDataTriggeredContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties = (ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties) o;
    return Objects.equals(enableDataTriggeredContent, comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties.enableDataTriggeredContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableDataTriggeredContent);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties {\n");
    
    sb.append("    enableDataTriggeredContent: ").append(toIndentedString(enableDataTriggeredContent)).append("\n");
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

