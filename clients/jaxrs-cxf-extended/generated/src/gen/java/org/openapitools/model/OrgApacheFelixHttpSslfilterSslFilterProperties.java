package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheFelixHttpSslfilterSslFilterProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString sslForwardHeader;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString sslForwardValue;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString sslForwardCertHeader;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean rewriteAbsoluteUrls;
 /**
  * Get sslForwardHeader
  * @return sslForwardHeader
  */
  @JsonProperty("ssl-forward.header")
  public ConfigNodePropertyString getSslForwardHeader() {
    return sslForwardHeader;
  }

  /**
   * Sets the <code>sslForwardHeader</code> property.
   */
 public void setSslForwardHeader(ConfigNodePropertyString sslForwardHeader) {
    this.sslForwardHeader = sslForwardHeader;
  }

  /**
   * Sets the <code>sslForwardHeader</code> property.
   */
  public OrgApacheFelixHttpSslfilterSslFilterProperties sslForwardHeader(ConfigNodePropertyString sslForwardHeader) {
    this.sslForwardHeader = sslForwardHeader;
    return this;
  }

 /**
  * Get sslForwardValue
  * @return sslForwardValue
  */
  @JsonProperty("ssl-forward.value")
  public ConfigNodePropertyString getSslForwardValue() {
    return sslForwardValue;
  }

  /**
   * Sets the <code>sslForwardValue</code> property.
   */
 public void setSslForwardValue(ConfigNodePropertyString sslForwardValue) {
    this.sslForwardValue = sslForwardValue;
  }

  /**
   * Sets the <code>sslForwardValue</code> property.
   */
  public OrgApacheFelixHttpSslfilterSslFilterProperties sslForwardValue(ConfigNodePropertyString sslForwardValue) {
    this.sslForwardValue = sslForwardValue;
    return this;
  }

 /**
  * Get sslForwardCertHeader
  * @return sslForwardCertHeader
  */
  @JsonProperty("ssl-forward-cert.header")
  public ConfigNodePropertyString getSslForwardCertHeader() {
    return sslForwardCertHeader;
  }

  /**
   * Sets the <code>sslForwardCertHeader</code> property.
   */
 public void setSslForwardCertHeader(ConfigNodePropertyString sslForwardCertHeader) {
    this.sslForwardCertHeader = sslForwardCertHeader;
  }

  /**
   * Sets the <code>sslForwardCertHeader</code> property.
   */
  public OrgApacheFelixHttpSslfilterSslFilterProperties sslForwardCertHeader(ConfigNodePropertyString sslForwardCertHeader) {
    this.sslForwardCertHeader = sslForwardCertHeader;
    return this;
  }

 /**
  * Get rewriteAbsoluteUrls
  * @return rewriteAbsoluteUrls
  */
  @JsonProperty("rewrite.absolute.urls")
  public ConfigNodePropertyBoolean getRewriteAbsoluteUrls() {
    return rewriteAbsoluteUrls;
  }

  /**
   * Sets the <code>rewriteAbsoluteUrls</code> property.
   */
 public void setRewriteAbsoluteUrls(ConfigNodePropertyBoolean rewriteAbsoluteUrls) {
    this.rewriteAbsoluteUrls = rewriteAbsoluteUrls;
  }

  /**
   * Sets the <code>rewriteAbsoluteUrls</code> property.
   */
  public OrgApacheFelixHttpSslfilterSslFilterProperties rewriteAbsoluteUrls(ConfigNodePropertyBoolean rewriteAbsoluteUrls) {
    this.rewriteAbsoluteUrls = rewriteAbsoluteUrls;
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
    OrgApacheFelixHttpSslfilterSslFilterProperties orgApacheFelixHttpSslfilterSslFilterProperties = (OrgApacheFelixHttpSslfilterSslFilterProperties) o;
    return Objects.equals(this.sslForwardHeader, orgApacheFelixHttpSslfilterSslFilterProperties.sslForwardHeader) &&
        Objects.equals(this.sslForwardValue, orgApacheFelixHttpSslfilterSslFilterProperties.sslForwardValue) &&
        Objects.equals(this.sslForwardCertHeader, orgApacheFelixHttpSslfilterSslFilterProperties.sslForwardCertHeader) &&
        Objects.equals(this.rewriteAbsoluteUrls, orgApacheFelixHttpSslfilterSslFilterProperties.rewriteAbsoluteUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sslForwardHeader, sslForwardValue, sslForwardCertHeader, rewriteAbsoluteUrls);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

