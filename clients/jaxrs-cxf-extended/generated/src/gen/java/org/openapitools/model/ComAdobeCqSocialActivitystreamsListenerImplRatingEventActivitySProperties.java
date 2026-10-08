package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger ranking;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enable;
 /**
  * Get ranking
  * @return ranking
  */
  @JsonProperty("ranking")
  public ConfigNodePropertyInteger getRanking() {
    return ranking;
  }

  /**
   * Sets the <code>ranking</code> property.
   */
 public void setRanking(ConfigNodePropertyInteger ranking) {
    this.ranking = ranking;
  }

  /**
   * Sets the <code>ranking</code> property.
   */
  public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties ranking(ConfigNodePropertyInteger ranking) {
    this.ranking = ranking;
    return this;
  }

 /**
  * Get enable
  * @return enable
  */
  @JsonProperty("enable")
  public ConfigNodePropertyBoolean getEnable() {
    return enable;
  }

  /**
   * Sets the <code>enable</code> property.
   */
 public void setEnable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
  }

  /**
   * Sets the <code>enable</code> property.
   */
  public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties enable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
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
    ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties = (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties) o;
    return Objects.equals(this.ranking, comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.ranking) &&
        Objects.equals(this.enable, comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.enable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranking, enable);
  }

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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

