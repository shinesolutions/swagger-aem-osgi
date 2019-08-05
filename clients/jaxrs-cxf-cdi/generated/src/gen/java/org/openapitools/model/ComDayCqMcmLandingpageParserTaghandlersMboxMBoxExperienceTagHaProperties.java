package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties   {
  
  private ConfigNodePropertyInteger serviceRanking = null;

  private ConfigNodePropertyString tagpattern = null;


  /**
   **/
  public ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }


  /**
   **/
  public ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties tagpattern(ConfigNodePropertyString tagpattern) {
    this.tagpattern = tagpattern;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tagpattern")
  public ConfigNodePropertyString getTagpattern() {
    return tagpattern;
  }
  public void setTagpattern(ConfigNodePropertyString tagpattern) {
    this.tagpattern = tagpattern;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties = (ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties) o;
    return Objects.equals(serviceRanking, comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties.serviceRanking) &&
        Objects.equals(tagpattern, comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties.tagpattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, tagpattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties {\n");
    
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    tagpattern: ").append(toIndentedString(tagpattern)).append("\n");
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

