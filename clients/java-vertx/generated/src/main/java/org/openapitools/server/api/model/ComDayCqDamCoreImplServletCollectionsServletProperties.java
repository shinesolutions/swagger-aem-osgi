package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamCoreImplServletCollectionsServletProperties   {
  
  private ConfigNodePropertyArray cqDamBatchCollectionsProperties = null;
  private ConfigNodePropertyInteger cqDamBatchCollectionsLimit = null;

  public ComDayCqDamCoreImplServletCollectionsServletProperties () {

  }

  public ComDayCqDamCoreImplServletCollectionsServletProperties (ConfigNodePropertyArray cqDamBatchCollectionsProperties, ConfigNodePropertyInteger cqDamBatchCollectionsLimit) {
    this.cqDamBatchCollectionsProperties = cqDamBatchCollectionsProperties;
    this.cqDamBatchCollectionsLimit = cqDamBatchCollectionsLimit;
  }

    
  @JsonProperty("cq.dam.batch.collections.properties")
  public ConfigNodePropertyArray getCqDamBatchCollectionsProperties() {
    return cqDamBatchCollectionsProperties;
  }
  public void setCqDamBatchCollectionsProperties(ConfigNodePropertyArray cqDamBatchCollectionsProperties) {
    this.cqDamBatchCollectionsProperties = cqDamBatchCollectionsProperties;
  }

    
  @JsonProperty("cq.dam.batch.collections.limit")
  public ConfigNodePropertyInteger getCqDamBatchCollectionsLimit() {
    return cqDamBatchCollectionsLimit;
  }
  public void setCqDamBatchCollectionsLimit(ConfigNodePropertyInteger cqDamBatchCollectionsLimit) {
    this.cqDamBatchCollectionsLimit = cqDamBatchCollectionsLimit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletCollectionsServletProperties comDayCqDamCoreImplServletCollectionsServletProperties = (ComDayCqDamCoreImplServletCollectionsServletProperties) o;
    return Objects.equals(cqDamBatchCollectionsProperties, comDayCqDamCoreImplServletCollectionsServletProperties.cqDamBatchCollectionsProperties) &&
        Objects.equals(cqDamBatchCollectionsLimit, comDayCqDamCoreImplServletCollectionsServletProperties.cqDamBatchCollectionsLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamBatchCollectionsProperties, cqDamBatchCollectionsLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletCollectionsServletProperties {\n");
    
    sb.append("    cqDamBatchCollectionsProperties: ").append(toIndentedString(cqDamBatchCollectionsProperties)).append("\n");
    sb.append("    cqDamBatchCollectionsLimit: ").append(toIndentedString(cqDamBatchCollectionsLimit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
