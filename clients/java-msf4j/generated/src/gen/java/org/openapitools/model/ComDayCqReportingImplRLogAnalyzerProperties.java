package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComDayCqReportingImplRLogAnalyzerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqReportingImplRLogAnalyzerProperties   {
  @JsonProperty("request.log.output")
  private ConfigNodePropertyString requestLogOutput;

  public ComDayCqReportingImplRLogAnalyzerProperties requestLogOutput(ConfigNodePropertyString requestLogOutput) {
    this.requestLogOutput = requestLogOutput;
    return this;
  }

   /**
   * Get requestLogOutput
   * @return requestLogOutput
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getRequestLogOutput() {
    return requestLogOutput;
  }

  public void setRequestLogOutput(ConfigNodePropertyString requestLogOutput) {
    this.requestLogOutput = requestLogOutput;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReportingImplRLogAnalyzerProperties comDayCqReportingImplRLogAnalyzerProperties = (ComDayCqReportingImplRLogAnalyzerProperties) o;
    return Objects.equals(this.requestLogOutput, comDayCqReportingImplRLogAnalyzerProperties.requestLogOutput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestLogOutput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReportingImplRLogAnalyzerProperties {\n");
    
    sb.append("    requestLogOutput: ").append(toIndentedString(requestLogOutput)).append("\n");
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

