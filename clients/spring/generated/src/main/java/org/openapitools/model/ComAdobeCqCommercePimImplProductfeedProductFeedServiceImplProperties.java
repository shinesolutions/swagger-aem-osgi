package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties   {
  @JsonProperty("Feed generator algorithm")
  private ConfigNodePropertyDropDown feedGeneratorAlgorithm = null;

  public ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties feedGeneratorAlgorithm(ConfigNodePropertyDropDown feedGeneratorAlgorithm) {
    this.feedGeneratorAlgorithm = feedGeneratorAlgorithm;
    return this;
  }

  /**
   * Get feedGeneratorAlgorithm
   * @return feedGeneratorAlgorithm
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyDropDown getFeedGeneratorAlgorithm() {
    return feedGeneratorAlgorithm;
  }

  public void setFeedGeneratorAlgorithm(ConfigNodePropertyDropDown feedGeneratorAlgorithm) {
    this.feedGeneratorAlgorithm = feedGeneratorAlgorithm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

