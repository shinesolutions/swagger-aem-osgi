package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties   {
  
  private ConfigNodePropertyInteger serviceRanking = null;

  private ConfigNodePropertyString tagpattern = null;

  private ConfigNodePropertyString componentResourceType = null;


  /**
   **/
  public ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
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
  public ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties tagpattern(ConfigNodePropertyString tagpattern) {
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
  public ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties componentResourceType(ConfigNodePropertyString componentResourceType) {
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
    ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties = (ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties) o;
    return Objects.equals(serviceRanking, comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties.serviceRanking) &&
        Objects.equals(tagpattern, comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties.tagpattern) &&
        Objects.equals(componentResourceType, comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties.componentResourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, tagpattern, componentResourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties {\n");
    
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

