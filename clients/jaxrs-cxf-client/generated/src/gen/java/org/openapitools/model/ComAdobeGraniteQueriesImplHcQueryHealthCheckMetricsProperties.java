package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger getPeriod = null;
 /**
   * Get getPeriod
   * @return getPeriod
  **/
  @JsonProperty("getPeriod")
  public ConfigNodePropertyInteger getGetPeriod() {
    return getPeriod;
  }

  public void setGetPeriod(ConfigNodePropertyInteger getPeriod) {
    this.getPeriod = getPeriod;
  }

  public ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties getPeriod(ConfigNodePropertyInteger getPeriod) {
    this.getPeriod = getPeriod;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties {\n");
    
    sb.append("    getPeriod: ").append(toIndentedString(getPeriod)).append("\n");
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

