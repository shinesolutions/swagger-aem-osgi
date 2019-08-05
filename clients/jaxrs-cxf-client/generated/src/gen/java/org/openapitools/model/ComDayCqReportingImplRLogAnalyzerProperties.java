package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqReportingImplRLogAnalyzerProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString requestLogOutput = null;
 /**
   * Get requestLogOutput
   * @return requestLogOutput
  **/
  @JsonProperty("request.log.output")
  public ConfigNodePropertyString getRequestLogOutput() {
    return requestLogOutput;
  }

  public void setRequestLogOutput(ConfigNodePropertyString requestLogOutput) {
    this.requestLogOutput = requestLogOutput;
  }

  public ComDayCqReportingImplRLogAnalyzerProperties requestLogOutput(ConfigNodePropertyString requestLogOutput) {
    this.requestLogOutput = requestLogOutput;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

