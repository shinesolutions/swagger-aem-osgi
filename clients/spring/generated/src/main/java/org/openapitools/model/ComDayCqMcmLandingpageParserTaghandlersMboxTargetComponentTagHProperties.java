package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties   {
  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking = null;

  @JsonProperty("tagpattern")
  private ConfigNodePropertyString tagpattern = null;

  @JsonProperty("component.resourceType")
  private ConfigNodePropertyString componentResourceType = null;

  public ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties tagpattern(ConfigNodePropertyString tagpattern) {
    this.tagpattern = tagpattern;
    return this;
  }

  /**
   * Get tagpattern
   * @return tagpattern
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getTagpattern() {
    return tagpattern;
  }

  public void setTagpattern(ConfigNodePropertyString tagpattern) {
    this.tagpattern = tagpattern;
  }

  public ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties componentResourceType(ConfigNodePropertyString componentResourceType) {
    this.componentResourceType = componentResourceType;
    return this;
  }

  /**
   * Get componentResourceType
   * @return componentResourceType
  **/
  @ApiModelProperty(value = "")

  @Valid

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
    ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties = (ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties) o;
    return Objects.equals(this.serviceRanking, comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties.serviceRanking) &&
        Objects.equals(this.tagpattern, comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties.tagpattern) &&
        Objects.equals(this.componentResourceType, comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties.componentResourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, tagpattern, componentResourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties {\n");
    
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
