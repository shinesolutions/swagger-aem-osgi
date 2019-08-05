package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqReportingImplRLogAnalyzerProperties   {
  
  private ConfigNodePropertyString requestLogOutput = null;


  /**
   **/
  public ComDayCqReportingImplRLogAnalyzerProperties requestLogOutput(ConfigNodePropertyString requestLogOutput) {
    this.requestLogOutput = requestLogOutput;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("request.log.output")
  public ConfigNodePropertyString getRequestLogOutput() {
    return requestLogOutput;
  }
  public void setRequestLogOutput(ConfigNodePropertyString requestLogOutput) {
    this.requestLogOutput = requestLogOutput;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReportingImplRLogAnalyzerProperties comDayCqReportingImplRLogAnalyzerProperties = (ComDayCqReportingImplRLogAnalyzerProperties) o;
    return Objects.equals(requestLogOutput, comDayCqReportingImplRLogAnalyzerProperties.requestLogOutput);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

