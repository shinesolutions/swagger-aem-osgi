package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqDamCoreImplReportsReportExportServiceProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("queryBatchSize")
  private ConfigNodePropertyInteger queryBatchSize;

  /**
   * 
   * @return queryBatchSize
   */
  public ConfigNodePropertyInteger getQueryBatchSize() {
    return queryBatchSize;
  }

  public void setQueryBatchSize(ConfigNodePropertyInteger queryBatchSize) {
    this.queryBatchSize = queryBatchSize;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
