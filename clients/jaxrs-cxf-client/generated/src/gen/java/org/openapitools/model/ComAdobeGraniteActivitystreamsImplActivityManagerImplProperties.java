package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray aggregateRelationships = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean aggregateDescendVirtual = null;
 /**
   * Get aggregateRelationships
   * @return aggregateRelationships
  **/
  @JsonProperty("aggregate.relationships")
  public ConfigNodePropertyArray getAggregateRelationships() {
    return aggregateRelationships;
  }

  public void setAggregateRelationships(ConfigNodePropertyArray aggregateRelationships) {
    this.aggregateRelationships = aggregateRelationships;
  }

  public ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties aggregateRelationships(ConfigNodePropertyArray aggregateRelationships) {
    this.aggregateRelationships = aggregateRelationships;
    return this;
  }

 /**
   * Get aggregateDescendVirtual
   * @return aggregateDescendVirtual
  **/
  @JsonProperty("aggregate.descend.virtual")
  public ConfigNodePropertyBoolean getAggregateDescendVirtual() {
    return aggregateDescendVirtual;
  }

  public void setAggregateDescendVirtual(ConfigNodePropertyBoolean aggregateDescendVirtual) {
    this.aggregateDescendVirtual = aggregateDescendVirtual;
  }

  public ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties aggregateDescendVirtual(ConfigNodePropertyBoolean aggregateDescendVirtual) {
    this.aggregateDescendVirtual = aggregateDescendVirtual;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

