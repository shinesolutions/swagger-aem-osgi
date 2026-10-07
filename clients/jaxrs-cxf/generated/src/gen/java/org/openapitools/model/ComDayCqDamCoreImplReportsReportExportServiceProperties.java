package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplReportsReportExportServiceProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger queryBatchSize;
 /**
   * Get queryBatchSize
   * @return queryBatchSize
  **/
  @JsonProperty("queryBatchSize")
  public ConfigNodePropertyInteger getQueryBatchSize() {
    return queryBatchSize;
  }

  public void setQueryBatchSize(ConfigNodePropertyInteger queryBatchSize) {
    this.queryBatchSize = queryBatchSize;
  }

  public ComDayCqDamCoreImplReportsReportExportServiceProperties queryBatchSize(ConfigNodePropertyInteger queryBatchSize) {
    this.queryBatchSize = queryBatchSize;
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
    ComDayCqDamCoreImplReportsReportExportServiceProperties comDayCqDamCoreImplReportsReportExportServiceProperties = (ComDayCqDamCoreImplReportsReportExportServiceProperties) o;
    return Objects.equals(this.queryBatchSize, comDayCqDamCoreImplReportsReportExportServiceProperties.queryBatchSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryBatchSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplReportsReportExportServiceProperties {\n");
    
    sb.append("    queryBatchSize: ").append(toIndentedString(queryBatchSize)).append("\n");
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

