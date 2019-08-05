package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties   {
  
  private ConfigNodePropertyInteger ranking = null;

  private ConfigNodePropertyBoolean enable = null;


  /**
   **/
  public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties ranking(ConfigNodePropertyInteger ranking) {
    this.ranking = ranking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ranking")
  public ConfigNodePropertyInteger getRanking() {
    return ranking;
  }
  public void setRanking(ConfigNodePropertyInteger ranking) {
    this.ranking = ranking;
  }


  /**
   **/
  public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties enable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enable")
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

