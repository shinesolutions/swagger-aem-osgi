package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqDamCoreImplServletCollectionServletProperties   {
  
  private ConfigNodePropertyArray cqDamBatchCollectionProperties = null;
  private ConfigNodePropertyInteger cqDamBatchCollectionMaxcollections = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.batch.collection.properties")
  public ConfigNodePropertyArray getCqDamBatchCollectionProperties() {
    return cqDamBatchCollectionProperties;
  }
  public void setCqDamBatchCollectionProperties(ConfigNodePropertyArray cqDamBatchCollectionProperties) {
    this.cqDamBatchCollectionProperties = cqDamBatchCollectionProperties;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.batch.collection.maxcollections")
  public ConfigNodePropertyInteger getCqDamBatchCollectionMaxcollections() {
    return cqDamBatchCollectionMaxcollections;
  }
  public void setCqDamBatchCollectionMaxcollections(ConfigNodePropertyInteger cqDamBatchCollectionMaxcollections) {
    this.cqDamBatchCollectionMaxcollections = cqDamBatchCollectionMaxcollections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletCollectionServletProperties comDayCqDamCoreImplServletCollectionServletProperties = (ComDayCqDamCoreImplServletCollectionServletProperties) o;
    return Objects.equals(cqDamBatchCollectionProperties, comDayCqDamCoreImplServletCollectionServletProperties.cqDamBatchCollectionProperties) &&
        Objects.equals(cqDamBatchCollectionMaxcollections, comDayCqDamCoreImplServletCollectionServletProperties.cqDamBatchCollectionMaxcollections);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

