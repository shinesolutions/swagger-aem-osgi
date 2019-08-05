package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties   {
  
  private ConfigNodePropertyBoolean enableDataTriggeredContent = null;

  public ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties () {

  }

  public ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties (ConfigNodePropertyBoolean enableDataTriggeredContent) {
    this.enableDataTriggeredContent = enableDataTriggeredContent;
  }

    
  @JsonProperty("enableDataTriggeredContent")
  public ConfigNodePropertyBoolean getEnableDataTriggeredContent() {
    return enableDataTriggeredContent;
  }
  public void setEnableDataTriggeredContent(ConfigNodePropertyBoolean enableDataTriggeredContent) {
    this.enableDataTriggeredContent = enableDataTriggeredContent;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
