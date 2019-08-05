package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties   {
  @JsonProperty("ranking")
  private ConfigNodePropertyInteger ranking = null;

  @JsonProperty("enable")
  private ConfigNodePropertyBoolean enable = null;

  public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties ranking(ConfigNodePropertyInteger ranking) {
    this.ranking = ranking;
    return this;
  }

   /**
   * Get ranking
   * @return ranking
  **/
  @Valid
  public ConfigNodePropertyInteger getRanking() {
    return ranking;
  }

  public void setRanking(ConfigNodePropertyInteger ranking) {
    this.ranking = ranking;
  }

  public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties enable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnable() {
    return enable;
  }

  public void setEnable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties = (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties) o;
    return Objects.equals(ranking, comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.ranking) &&
        Objects.equals(enable, comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.enable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranking, enable);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties {\n");
    
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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

