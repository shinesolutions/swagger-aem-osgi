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

public class ComDayCqDamHandlerStandardPsdPsdHandlerProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger largeFileThreshold = null;
 /**
   * Get largeFileThreshold
   * @return largeFileThreshold
  **/
  @JsonProperty("large_file_threshold")
  public ConfigNodePropertyInteger getLargeFileThreshold() {
    return largeFileThreshold;
  }

  public void setLargeFileThreshold(ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
  }

  public ComDayCqDamHandlerStandardPsdPsdHandlerProperties largeFileThreshold(ConfigNodePropertyInteger largeFileThreshold) {
    this.largeFileThreshold = largeFileThreshold;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamHandlerStandardPsdPsdHandlerProperties {\n");
    
    sb.append("    largeFileThreshold: ").append(toIndentedString(largeFileThreshold)).append("\n");
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

