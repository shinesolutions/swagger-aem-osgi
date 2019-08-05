package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties   {
  
  private ConfigNodePropertyInteger serviceRanking = null;
  private ConfigNodePropertyString tagpattern = null;
  private ConfigNodePropertyString componentResourceType = null;

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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties = (ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties) o;
    return Objects.equals(serviceRanking, comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.serviceRanking) &&
        Objects.equals(tagpattern, comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.tagpattern) &&
        Objects.equals(componentResourceType, comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.componentResourceType);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

