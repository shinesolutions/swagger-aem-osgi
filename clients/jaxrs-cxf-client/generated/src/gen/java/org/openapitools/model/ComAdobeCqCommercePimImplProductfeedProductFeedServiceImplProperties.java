package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyDropDown;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyDropDown feedGeneratorAlgorithm;
 /**
   * Get feedGeneratorAlgorithm
   * @return feedGeneratorAlgorithm
  **/
  @JsonProperty("Feed generator algorithm")
  public ConfigNodePropertyDropDown getFeedGeneratorAlgorithm() {
    return feedGeneratorAlgorithm;
  }

  public void setFeedGeneratorAlgorithm(ConfigNodePropertyDropDown feedGeneratorAlgorithm) {
    this.feedGeneratorAlgorithm = feedGeneratorAlgorithm;
  }

  public ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties feedGeneratorAlgorithm(ConfigNodePropertyDropDown feedGeneratorAlgorithm) {
    this.feedGeneratorAlgorithm = feedGeneratorAlgorithm;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties = (ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties) o;
    return Objects.equals(this.feedGeneratorAlgorithm, comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.feedGeneratorAlgorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedGeneratorAlgorithm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties {\n");
    
    sb.append("    feedGeneratorAlgorithm: ").append(toIndentedString(feedGeneratorAlgorithm)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

