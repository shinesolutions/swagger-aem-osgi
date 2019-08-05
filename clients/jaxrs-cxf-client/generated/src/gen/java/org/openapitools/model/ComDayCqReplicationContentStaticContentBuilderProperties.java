package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
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

public class ComDayCqReplicationContentStaticContentBuilderProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString host = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger port = null;
 /**
   * Get host
   * @return host
  **/
  @JsonProperty("host")
  public ConfigNodePropertyString getHost() {
    return host;
  }

  public void setHost(ConfigNodePropertyString host) {
    this.host = host;
  }

  public ComDayCqReplicationContentStaticContentBuilderProperties host(ConfigNodePropertyString host) {
    this.host = host;
    return this;
  }

 /**
   * Get port
   * @return port
  **/
  @JsonProperty("port")
  public ConfigNodePropertyInteger getPort() {
    return port;
  }

  public void setPort(ConfigNodePropertyInteger port) {
    this.port = port;
  }

  public ComDayCqReplicationContentStaticContentBuilderProperties port(ConfigNodePropertyInteger port) {
    this.port = port;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationContentStaticContentBuilderProperties {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

