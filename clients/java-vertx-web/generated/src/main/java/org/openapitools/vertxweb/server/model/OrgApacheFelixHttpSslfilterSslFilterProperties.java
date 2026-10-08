package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyBoolean;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrgApacheFelixHttpSslfilterSslFilterProperties   {
  
  private ConfigNodePropertyString sslForwardHeader;
  private ConfigNodePropertyString sslForwardValue;
  private ConfigNodePropertyString sslForwardCertHeader;
  private ConfigNodePropertyBoolean rewriteAbsoluteUrls;

  public OrgApacheFelixHttpSslfilterSslFilterProperties () {

  }

  public OrgApacheFelixHttpSslfilterSslFilterProperties (ConfigNodePropertyString sslForwardHeader, ConfigNodePropertyString sslForwardValue, ConfigNodePropertyString sslForwardCertHeader, ConfigNodePropertyBoolean rewriteAbsoluteUrls) {
    this.sslForwardHeader = sslForwardHeader;
    this.sslForwardValue = sslForwardValue;
    this.sslForwardCertHeader = sslForwardCertHeader;
    this.rewriteAbsoluteUrls = rewriteAbsoluteUrls;
  }

    
  @JsonProperty("ssl-forward.header")
  public ConfigNodePropertyString getSslForwardHeader() {
    return sslForwardHeader;
  }
  public void setSslForwardHeader(ConfigNodePropertyString sslForwardHeader) {
    this.sslForwardHeader = sslForwardHeader;
  }

    
  @JsonProperty("ssl-forward.value")
  public ConfigNodePropertyString getSslForwardValue() {
    return sslForwardValue;
  }
  public void setSslForwardValue(ConfigNodePropertyString sslForwardValue) {
    this.sslForwardValue = sslForwardValue;
  }

    
  @JsonProperty("ssl-forward-cert.header")
  public ConfigNodePropertyString getSslForwardCertHeader() {
    return sslForwardCertHeader;
  }
  public void setSslForwardCertHeader(ConfigNodePropertyString sslForwardCertHeader) {
    this.sslForwardCertHeader = sslForwardCertHeader;
  }

    
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
