/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixHttpSslfilterSslFilterProperties   {
  
  private ConfigNodePropertyString sslForwardHeader;
  private ConfigNodePropertyString sslForwardValue;
  private ConfigNodePropertyString sslForwardCertHeader;
  private ConfigNodePropertyBoolean rewriteAbsoluteUrls;

  /**
   */
  public OrgApacheFelixHttpSslfilterSslFilterProperties sslForwardHeader(ConfigNodePropertyString sslForwardHeader) {
    this.sslForwardHeader = sslForwardHeader;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ssl-forward.header")
  public ConfigNodePropertyString getSslForwardHeader() {
    return sslForwardHeader;
  }
  public void setSslForwardHeader(ConfigNodePropertyString sslForwardHeader) {
    this.sslForwardHeader = sslForwardHeader;
  }

  /**
   */
  public OrgApacheFelixHttpSslfilterSslFilterProperties sslForwardValue(ConfigNodePropertyString sslForwardValue) {
    this.sslForwardValue = sslForwardValue;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ssl-forward.value")
  public ConfigNodePropertyString getSslForwardValue() {
    return sslForwardValue;
  }
  public void setSslForwardValue(ConfigNodePropertyString sslForwardValue) {
    this.sslForwardValue = sslForwardValue;
  }

  /**
   */
  public OrgApacheFelixHttpSslfilterSslFilterProperties sslForwardCertHeader(ConfigNodePropertyString sslForwardCertHeader) {
    this.sslForwardCertHeader = sslForwardCertHeader;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ssl-forward-cert.header")
  public ConfigNodePropertyString getSslForwardCertHeader() {
    return sslForwardCertHeader;
  }
  public void setSslForwardCertHeader(ConfigNodePropertyString sslForwardCertHeader) {
    this.sslForwardCertHeader = sslForwardCertHeader;
  }

  /**
   */
  public OrgApacheFelixHttpSslfilterSslFilterProperties rewriteAbsoluteUrls(ConfigNodePropertyBoolean rewriteAbsoluteUrls) {
    this.rewriteAbsoluteUrls = rewriteAbsoluteUrls;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("rewrite.absolute.urls")
  public ConfigNodePropertyBoolean getRewriteAbsoluteUrls() {
    return rewriteAbsoluteUrls;
  }
  public void setRewriteAbsoluteUrls(ConfigNodePropertyBoolean rewriteAbsoluteUrls) {
    this.rewriteAbsoluteUrls = rewriteAbsoluteUrls;
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
    return Objects.equals(sslForwardHeader, orgApacheFelixHttpSslfilterSslFilterProperties.sslForwardHeader) &&
        Objects.equals(sslForwardValue, orgApacheFelixHttpSslfilterSslFilterProperties.sslForwardValue) &&
        Objects.equals(sslForwardCertHeader, orgApacheFelixHttpSslfilterSslFilterProperties.sslForwardCertHeader) &&
        Objects.equals(rewriteAbsoluteUrls, orgApacheFelixHttpSslfilterSslFilterProperties.rewriteAbsoluteUrls);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

