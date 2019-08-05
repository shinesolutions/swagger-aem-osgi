package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties   {
  
  private ConfigNodePropertyBoolean enableDataTriggeredContent = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableDataTriggeredContent")
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

