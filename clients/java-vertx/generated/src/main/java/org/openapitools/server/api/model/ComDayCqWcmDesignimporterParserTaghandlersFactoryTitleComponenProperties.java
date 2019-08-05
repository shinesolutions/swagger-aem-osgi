package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties   {
  
  private ConfigNodePropertyInteger serviceRanking = null;
  private ConfigNodePropertyString tagpattern = null;
  private ConfigNodePropertyString componentResourceType = null;

  public ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties () {

  }

  public ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties (ConfigNodePropertyInteger serviceRanking, ConfigNodePropertyString tagpattern, ConfigNodePropertyString componentResourceType) {
    this.serviceRanking = serviceRanking;
    this.tagpattern = tagpattern;
    this.componentResourceType = componentResourceType;
  }

    
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

    
  @JsonProperty("tagpattern")
  public ConfigNodePropertyString getTagpattern() {
    return tagpattern;
  }
  public void setTagpattern(ConfigNodePropertyString tagpattern) {
    this.tagpattern = tagpattern;
  }

    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
