package apimodels;

import apimodels.ConfigNodePropertyDropDown;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties   {
  @JsonProperty("Feed generator algorithm")
  @Valid

  private ConfigNodePropertyDropDown feedGeneratorAlgorithm;

  public ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties feedGeneratorAlgorithm(ConfigNodePropertyDropDown feedGeneratorAlgorithm) {
    this.feedGeneratorAlgorithm = feedGeneratorAlgorithm;
    return this;
  }

   /**
   * Get feedGeneratorAlgorithm
   * @return feedGeneratorAlgorithm
  **/
  public ConfigNodePropertyDropDown getFeedGeneratorAlgorithm() {
    return feedGeneratorAlgorithm;
  }

  public void setFeedGeneratorAlgorithm(ConfigNodePropertyDropDown feedGeneratorAlgorithm) {
    this.feedGeneratorAlgorithm = feedGeneratorAlgorithm;
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
    return Objects.equals(feedGeneratorAlgorithm, comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.feedGeneratorAlgorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedGeneratorAlgorithm);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

