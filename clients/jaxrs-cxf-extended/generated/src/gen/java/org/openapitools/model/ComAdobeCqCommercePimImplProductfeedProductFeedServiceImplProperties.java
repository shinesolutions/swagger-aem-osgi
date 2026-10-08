package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyDropDown;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown feedGeneratorAlgorithm;
 /**
  * Get feedGeneratorAlgorithm
  * @return feedGeneratorAlgorithm
  */
  @JsonProperty("Feed generator algorithm")
  public ConfigNodePropertyDropDown getFeedGeneratorAlgorithm() {
    return feedGeneratorAlgorithm;
  }

  /**
   * Sets the <code>feedGeneratorAlgorithm</code> property.
   */
 public void setFeedGeneratorAlgorithm(ConfigNodePropertyDropDown feedGeneratorAlgorithm) {
    this.feedGeneratorAlgorithm = feedGeneratorAlgorithm;
  }

  /**
   * Sets the <code>feedGeneratorAlgorithm</code> property.
   */
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

