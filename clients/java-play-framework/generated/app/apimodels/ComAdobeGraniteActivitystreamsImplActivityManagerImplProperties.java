package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
    return Objects.equals(aggregateRelationships, comAdobeGraniteActivitystreamsImplActivityManagerImplProperties.aggregateRelationships) &&
        Objects.equals(aggregateDescendVirtual, comAdobeGraniteActivitystreamsImplActivityManagerImplProperties.aggregateDescendVirtual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregateRelationships, aggregateDescendVirtual);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
