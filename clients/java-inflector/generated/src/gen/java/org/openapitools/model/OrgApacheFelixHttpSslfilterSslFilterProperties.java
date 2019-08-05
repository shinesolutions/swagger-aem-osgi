package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class OrgApacheFelixHttpSslfilterSslFilterProperties   {
  @JsonProperty("ssl-forward.header")
  private ConfigNodePropertyString sslForwardHeader = null;

  @JsonProperty("ssl-forward.value")
  private ConfigNodePropertyString sslForwardValue = null;

  @JsonProperty("ssl-forward-cert.header")
  private ConfigNodePropertyString sslForwardCertHeader = null;

  @JsonProperty("rewrite.absolute.urls")
  private ConfigNodePropertyBoolean rewriteAbsoluteUrls = null;

  /**
   **/
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
   **/
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
   **/
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
   **/
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
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

