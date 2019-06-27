/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyArray;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T11:23:34.688Z[GMT]")
public class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties {
  public static final String SERIALIZED_NAME_AGGREGATE_RELATIONSHIPS = "aggregate.relationships";
  @SerializedName(SERIALIZED_NAME_AGGREGATE_RELATIONSHIPS)
  private ConfigNodePropertyArray aggregateRelationships = null;

  public static final String SERIALIZED_NAME_AGGREGATE_DESCEND_VIRTUAL = "aggregate.descend.virtual";
  @SerializedName(SERIALIZED_NAME_AGGREGATE_DESCEND_VIRTUAL)
  private ConfigNodePropertyBoolean aggregateDescendVirtual = null;

  public ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties aggregateRelationships(ConfigNodePropertyArray aggregateRelationships) {
    this.aggregateRelationships = aggregateRelationships;
    return this;
  }

   /**
   * Get aggregateRelationships
   * @return aggregateRelationships
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAggregateRelationships() {
    return aggregateRelationships;
  }

  public void setAggregateRelationships(ConfigNodePropertyArray aggregateRelationships) {
    this.aggregateRelationships = aggregateRelationships;
  }

  public ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties aggregateDescendVirtual(ConfigNodePropertyBoolean aggregateDescendVirtual) {
    this.aggregateDescendVirtual = aggregateDescendVirtual;
    return this;
  }

   /**
   * Get aggregateDescendVirtual
   * @return aggregateDescendVirtual
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getAggregateDescendVirtual() {
    return aggregateDescendVirtual;
  }

  public void setAggregateDescendVirtual(ConfigNodePropertyBoolean aggregateDescendVirtual) {
    this.aggregateDescendVirtual = aggregateDescendVirtual;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties comAdobeGraniteActivitystreamsImplActivityManagerImplProperties = (ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties) o;
    return Objects.equals(this.aggregateRelationships, comAdobeGraniteActivitystreamsImplActivityManagerImplProperties.aggregateRelationships) &&
        Objects.equals(this.aggregateDescendVirtual, comAdobeGraniteActivitystreamsImplActivityManagerImplProperties.aggregateDescendVirtual);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

