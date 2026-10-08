/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties   {
  
  private ConfigNodePropertyArray aggregateRelationships;
  private ConfigNodePropertyBoolean aggregateDescendVirtual;

  /**
   */
  public ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties aggregateRelationships(ConfigNodePropertyArray aggregateRelationships) {
    this.aggregateRelationships = aggregateRelationships;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("aggregate.relationships")
  public ConfigNodePropertyArray getAggregateRelationships() {
    return aggregateRelationships;
  }
  public void setAggregateRelationships(ConfigNodePropertyArray aggregateRelationships) {
    this.aggregateRelationships = aggregateRelationships;
  }

  /**
   */
  public ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties aggregateDescendVirtual(ConfigNodePropertyBoolean aggregateDescendVirtual) {
    this.aggregateDescendVirtual = aggregateDescendVirtual;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("aggregate.descend.virtual")
  public ConfigNodePropertyBoolean getAggregateDescendVirtual() {
    return aggregateDescendVirtual;
  }
  public void setAggregateDescendVirtual(ConfigNodePropertyBoolean aggregateDescendVirtual) {
    this.aggregateDescendVirtual = aggregateDescendVirtual;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties comAdobeGraniteActivitystreamsImplActivityManagerImplProperties = (ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties) o;
    return Objects.equals(aggregateRelationships, comAdobeGraniteActivitystreamsImplActivityManagerImplProperties.aggregateRelationships) &&
        Objects.equals(aggregateDescendVirtual, comAdobeGraniteActivitystreamsImplActivityManagerImplProperties.aggregateDescendVirtual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregateRelationships, aggregateDescendVirtual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties {\n");
    
    sb.append("    aggregateRelationships: ").append(toIndentedString(aggregateRelationships)).append("\n");
    sb.append("    aggregateDescendVirtual: ").append(toIndentedString(aggregateDescendVirtual)).append("\n");
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

