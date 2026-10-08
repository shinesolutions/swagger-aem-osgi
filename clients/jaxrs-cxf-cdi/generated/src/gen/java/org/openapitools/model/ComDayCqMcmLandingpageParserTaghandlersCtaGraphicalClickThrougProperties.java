package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties   {
  
  private ConfigNodePropertyInteger serviceRanking;

  private ConfigNodePropertyString tagpattern;

  private ConfigNodePropertyString componentResourceType;

  /**
   **/
  public ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
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
  public ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties tagpattern(ConfigNodePropertyString tagpattern) {
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


  /**
   **/
  public ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties componentResourceType(ConfigNodePropertyString componentResourceType) {
    this.componentResourceType = componentResourceType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("component.resourceType")
  public ConfigNodePropertyString getComponentResourceType() {
    return componentResourceType;
  }
  public void setComponentResourceType(ConfigNodePropertyString componentResourceType) {
    this.componentResourceType = componentResourceType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties = (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties) o;
    return Objects.equals(this.serviceRanking, comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.serviceRanking) &&
        Objects.equals(this.tagpattern, comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.tagpattern) &&
        Objects.equals(this.componentResourceType, comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.componentResourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, tagpattern, componentResourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties {\n");
    
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    tagpattern: ").append(toIndentedString(tagpattern)).append("\n");
    sb.append("    componentResourceType: ").append(toIndentedString(componentResourceType)).append("\n");
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

