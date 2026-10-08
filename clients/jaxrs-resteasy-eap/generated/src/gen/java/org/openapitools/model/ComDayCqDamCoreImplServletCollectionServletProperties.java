package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplServletCollectionServletProperties   {
  
  private ConfigNodePropertyArray cqDamBatchCollectionProperties;
  private ConfigNodePropertyInteger cqDamBatchCollectionMaxcollections;

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

