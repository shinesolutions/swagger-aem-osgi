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



@JsonTypeName("comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties   {
  private ConfigNodePropertyInteger serviceRanking;
  private ConfigNodePropertyString tagpattern;

  public ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties() {
  }

  /**
   **/
  public ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
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
  public ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties tagpattern(ConfigNodePropertyString tagpattern) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties = (ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties) o;
    return Objects.equals(this.serviceRanking, comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties.serviceRanking) &&
        Objects.equals(this.tagpattern, comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties.tagpattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, tagpattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties {\n");
    
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    tagpattern: ").append(toIndentedString(tagpattern)).append("\n");
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
