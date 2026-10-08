package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties   {
  
  private ConfigNodePropertyInteger batchCommitSize;

  public ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties () {

  }

  public ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties (ConfigNodePropertyInteger batchCommitSize) {
    this.batchCommitSize = batchCommitSize;
  }

    
  @JsonProperty("batch.commit.size")
  public ConfigNodePropertyInteger getBatchCommitSize() {
    return batchCommitSize;
  }
  public void setBatchCommitSize(ConfigNodePropertyInteger batchCommitSize) {
    this.batchCommitSize = batchCommitSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties = (ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties) o;
    return Objects.equals(batchCommitSize, comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.batchCommitSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchCommitSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties {\n");
    
    sb.append("    batchCommitSize: ").append(toIndentedString(batchCommitSize)).append("\n");
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
