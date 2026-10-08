package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("batch.commit.size")
  private ConfigNodePropertyInteger batchCommitSize;

  /**
   * 
   * @return batchCommitSize
   */
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
    return Objects.equals(this.batchCommitSize, comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.batchCommitSize);
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
