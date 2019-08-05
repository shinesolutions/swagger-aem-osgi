package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
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

public class OrgApacheFelixHttpSslfilterSslFilterProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString sslForwardHeader = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString sslForwardValue = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString sslForwardCertHeader = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean rewriteAbsoluteUrls = null;
 /**
   * Get sslForwardHeader
   * @return sslForwardHeader
  **/
  @JsonProperty("ssl-forward.header")
  public ConfigNodePropertyString getSslForwardHeader() {
    return sslForwardHeader;
  }

  public void setSslForwardHeader(ConfigNodePropertyString sslForwardHeader) {
    this.sslForwardHeader = sslForwardHeader;
  }

  public OrgApacheFelixHttpSslfilterSslFilterProperties sslForwardHeader(ConfigNodePropertyString sslForwardHeader) {
    this.sslForwardHeader = sslForwardHeader;
    return this;
  }

 /**
   * Get sslForwardValue
   * @return sslForwardValue
  **/
  @JsonProperty("ssl-forward.value")
  public ConfigNodePropertyString getSslForwardValue() {
    return sslForwardValue;
  }

  public void setSslForwardValue(ConfigNodePropertyString sslForwardValue) {
    this.sslForwardValue = sslForwardValue;
  }

  public OrgApacheFelixHttpSslfilterSslFilterProperties sslForwardValue(ConfigNodePropertyString sslForwardValue) {
    this.sslForwardValue = sslForwardValue;
    return this;
  }

 /**
   * Get sslForwardCertHeader
   * @return sslForwardCertHeader
  **/
  @JsonProperty("ssl-forward-cert.header")
  public ConfigNodePropertyString getSslForwardCertHeader() {
    return sslForwardCertHeader;
  }

  public void setSslForwardCertHeader(ConfigNodePropertyString sslForwardCertHeader) {
    this.sslForwardCertHeader = sslForwardCertHeader;
  }

  public OrgApacheFelixHttpSslfilterSslFilterProperties sslForwardCertHeader(ConfigNodePropertyString sslForwardCertHeader) {
    this.sslForwardCertHeader = sslForwardCertHeader;
    return this;
  }

 /**
   * Get rewriteAbsoluteUrls
   * @return rewriteAbsoluteUrls
  **/
  @JsonProperty("rewrite.absolute.urls")
  public ConfigNodePropertyBoolean getRewriteAbsoluteUrls() {
    return rewriteAbsoluteUrls;
  }

  public void setRewriteAbsoluteUrls(ConfigNodePropertyBoolean rewriteAbsoluteUrls) {
    this.rewriteAbsoluteUrls = rewriteAbsoluteUrls;
  }

  public OrgApacheFelixHttpSslfilterSslFilterProperties rewriteAbsoluteUrls(ConfigNodePropertyBoolean rewriteAbsoluteUrls) {
    this.rewriteAbsoluteUrls = rewriteAbsoluteUrls;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixHttpSslfilterSslFilterProperties {\n");
    
    sb.append("    sslForwardHeader: ").append(toIndentedString(sslForwardHeader)).append("\n");
    sb.append("    sslForwardValue: ").append(toIndentedString(sslForwardValue)).append("\n");
    sb.append("    sslForwardCertHeader: ").append(toIndentedString(sslForwardCertHeader)).append("\n");
    sb.append("    rewriteAbsoluteUrls: ").append(toIndentedString(rewriteAbsoluteUrls)).append("\n");
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

