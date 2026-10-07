package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger serviceRanking;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString tagpattern;
 /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

 /**
   * Get tagpattern
   * @return tagpattern
  **/
  @JsonProperty("tagpattern")
  public ConfigNodePropertyString getTagpattern() {
    return tagpattern;
  }

  public void setTagpattern(ConfigNodePropertyString tagpattern) {
    this.tagpattern = tagpattern;
  }

  public ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties tagpattern(ConfigNodePropertyString tagpattern) {
    this.tagpattern = tagpattern;
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
    ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties = (ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties) o;
    return Objects.equals(this.serviceRanking, comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties.serviceRanking) &&
        Objects.equals(this.tagpattern, comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties.tagpattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, tagpattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties {\n");
    
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    tagpattern: ").append(toIndentedString(tagpattern)).append("\n");
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

