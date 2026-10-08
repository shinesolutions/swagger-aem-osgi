package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties   {
  private ConfigNodePropertyInteger serviceRanking;
  private ConfigNodePropertyString tagpattern;
  private ConfigNodePropertyString componentResourceType;

  public ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties() {
  }

  /**
   **/
  public ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service.ranking")
  @Valid public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  @JsonProperty("service.ranking")
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
  @Valid public ConfigNodePropertyString getTagpattern() {
    return tagpattern;
  }

  @JsonProperty("tagpattern")
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
  @Valid public ConfigNodePropertyString getComponentResourceType() {
    return componentResourceType;
  }

  @JsonProperty("component.resourceType")
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
    ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties = (ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties) o;
    return Objects.equals(this.serviceRanking, comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties.serviceRanking) &&
        Objects.equals(this.tagpattern, comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties.tagpattern) &&
        Objects.equals(this.componentResourceType, comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties.componentResourceType);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
