package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;

/**
 * ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties   {
  @JsonProperty("aggregate.relationships")
  private ConfigNodePropertyArray aggregateRelationships = null;

  @JsonProperty("aggregate.descend.virtual")
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

