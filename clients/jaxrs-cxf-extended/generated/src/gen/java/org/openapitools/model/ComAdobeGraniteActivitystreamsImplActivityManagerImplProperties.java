package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray aggregateRelationships;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean aggregateDescendVirtual;
 /**
  * Get aggregateRelationships
  * @return aggregateRelationships
  */
  @JsonProperty("aggregate.relationships")
  public ConfigNodePropertyArray getAggregateRelationships() {
    return aggregateRelationships;
  }

  /**
   * Sets the <code>aggregateRelationships</code> property.
   */
 public void setAggregateRelationships(ConfigNodePropertyArray aggregateRelationships) {
    this.aggregateRelationships = aggregateRelationships;
  }

  /**
   * Sets the <code>aggregateRelationships</code> property.
   */
  public ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties aggregateRelationships(ConfigNodePropertyArray aggregateRelationships) {
    this.aggregateRelationships = aggregateRelationships;
    return this;
  }

 /**
  * Get aggregateDescendVirtual
  * @return aggregateDescendVirtual
  */
  @JsonProperty("aggregate.descend.virtual")
  public ConfigNodePropertyBoolean getAggregateDescendVirtual() {
    return aggregateDescendVirtual;
  }

  /**
   * Sets the <code>aggregateDescendVirtual</code> property.
   */
 public void setAggregateDescendVirtual(ConfigNodePropertyBoolean aggregateDescendVirtual) {
    this.aggregateDescendVirtual = aggregateDescendVirtual;
  }

  /**
   * Sets the <code>aggregateDescendVirtual</code> property.
   */
  public ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties aggregateDescendVirtual(ConfigNodePropertyBoolean aggregateDescendVirtual) {
    this.aggregateDescendVirtual = aggregateDescendVirtual;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

