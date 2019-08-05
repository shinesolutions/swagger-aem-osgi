package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties   {
  

  private ConfigNodePropertyInteger serviceRanking = null;

  private ConfigNodePropertyString tagpattern = null;

  private ConfigNodePropertyString componentResourceType = null;

  /**
   **/
  
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
    ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties = (ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties) o;
    return Objects.equals(serviceRanking, comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties.serviceRanking) &&
        Objects.equals(tagpattern, comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties.tagpattern) &&
        Objects.equals(componentResourceType, comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties.componentResourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, tagpattern, componentResourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

