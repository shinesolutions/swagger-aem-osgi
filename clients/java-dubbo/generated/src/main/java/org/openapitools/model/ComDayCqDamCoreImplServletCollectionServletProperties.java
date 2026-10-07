package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqDamCoreImplServletCollectionServletProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cq.dam.batch.collection.properties")
  private ConfigNodePropertyArray cqDamBatchCollectionProperties;

  @JsonProperty("cq.dam.batch.collection.maxcollections")
  private ConfigNodePropertyInteger cqDamBatchCollectionMaxcollections;

  /**
   * 
   * @return cqDamBatchCollectionProperties
   */
  public ConfigNodePropertyArray getCqDamBatchCollectionProperties() {
    return cqDamBatchCollectionProperties;
  }

  public void setCqDamBatchCollectionProperties(ConfigNodePropertyArray cqDamBatchCollectionProperties) {
    this.cqDamBatchCollectionProperties = cqDamBatchCollectionProperties;
  }

  /**
   * 
   * @return cqDamBatchCollectionMaxcollections
   */
  public ConfigNodePropertyInteger getCqDamBatchCollectionMaxcollections() {
    return cqDamBatchCollectionMaxcollections;
  }

  public void setCqDamBatchCollectionMaxcollections(ConfigNodePropertyInteger cqDamBatchCollectionMaxcollections) {
    this.cqDamBatchCollectionMaxcollections = cqDamBatchCollectionMaxcollections;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletCollectionServletProperties comDayCqDamCoreImplServletCollectionServletProperties = (ComDayCqDamCoreImplServletCollectionServletProperties) o;
    return Objects.equals(this.cqDamBatchCollectionProperties, comDayCqDamCoreImplServletCollectionServletProperties.cqDamBatchCollectionProperties) &&
        Objects.equals(this.cqDamBatchCollectionMaxcollections, comDayCqDamCoreImplServletCollectionServletProperties.cqDamBatchCollectionMaxcollections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamBatchCollectionProperties, cqDamBatchCollectionMaxcollections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletCollectionServletProperties {\n");
    
    sb.append("    cqDamBatchCollectionProperties: ").append(toIndentedString(cqDamBatchCollectionProperties)).append("\n");
    sb.append("    cqDamBatchCollectionMaxcollections: ").append(toIndentedString(cqDamBatchCollectionMaxcollections)).append("\n");
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
