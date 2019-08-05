package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComDayCqDamCoreImplReportsReportExportServiceProperties   {
  
  private ConfigNodePropertyInteger queryBatchSize = null;

  /**
   **/
  public ComDayCqDamCoreImplReportsReportExportServiceProperties queryBatchSize(ConfigNodePropertyInteger queryBatchSize) {
    this.queryBatchSize = queryBatchSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queryBatchSize")
  public ConfigNodePropertyInteger getQueryBatchSize() {
    return queryBatchSize;
  }
  public void setQueryBatchSize(ConfigNodePropertyInteger queryBatchSize) {
    this.queryBatchSize = queryBatchSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplReportsReportExportServiceProperties comDayCqDamCoreImplReportsReportExportServiceProperties = (ComDayCqDamCoreImplReportsReportExportServiceProperties) o;
    return Objects.equals(queryBatchSize, comDayCqDamCoreImplReportsReportExportServiceProperties.queryBatchSize);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

