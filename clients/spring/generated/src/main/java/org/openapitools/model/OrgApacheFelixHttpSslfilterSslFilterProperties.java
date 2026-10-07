package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheFelixHttpSslfilterSslFilterProperties
 */

@JsonTypeName("orgApacheFelixHttpSslfilterSslFilterProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixHttpSslfilterSslFilterProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString sslForwardHeader;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString sslForwardValue;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString sslForwardCertHeader;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean rewriteAbsoluteUrls;

  public OrgApacheFelixHttpSslfilterSslFilterProperties sslForwardHeader(@Nullable ConfigNodePropertyString sslForwardHeader) {
    this.sslForwardHeader = sslForwardHeader;
    return this;
  }

  /**
   * Get sslForwardHeader
   * @return sslForwardHeader
   */
  @Valid 
  @Schema(name = "ssl-forward.header", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ssl-forward.header")
  public @Nullable ConfigNodePropertyString getSslForwardHeader() {
    return sslForwardHeader;
  }

  @JsonProperty("ssl-forward.header")
  public void setSslForwardHeader(@Nullable ConfigNodePropertyString sslForwardHeader) {
    this.sslForwardHeader = sslForwardHeader;
  }

  public OrgApacheFelixHttpSslfilterSslFilterProperties sslForwardValue(@Nullable ConfigNodePropertyString sslForwardValue) {
    this.sslForwardValue = sslForwardValue;
    return this;
  }

  /**
   * Get sslForwardValue
   * @return sslForwardValue
   */
  @Valid 
  @Schema(name = "ssl-forward.value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ssl-forward.value")
  public @Nullable ConfigNodePropertyString getSslForwardValue() {
    return sslForwardValue;
  }

  @JsonProperty("ssl-forward.value")
  public void setSslForwardValue(@Nullable ConfigNodePropertyString sslForwardValue) {
    this.sslForwardValue = sslForwardValue;
  }

  public OrgApacheFelixHttpSslfilterSslFilterProperties sslForwardCertHeader(@Nullable ConfigNodePropertyString sslForwardCertHeader) {
    this.sslForwardCertHeader = sslForwardCertHeader;
    return this;
  }

  /**
   * Get sslForwardCertHeader
   * @return sslForwardCertHeader
   */
  @Valid 
  @Schema(name = "ssl-forward-cert.header", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ssl-forward-cert.header")
  public @Nullable ConfigNodePropertyString getSslForwardCertHeader() {
    return sslForwardCertHeader;
  }

  @JsonProperty("ssl-forward-cert.header")
  public void setSslForwardCertHeader(@Nullable ConfigNodePropertyString sslForwardCertHeader) {
    this.sslForwardCertHeader = sslForwardCertHeader;
  }

  public OrgApacheFelixHttpSslfilterSslFilterProperties rewriteAbsoluteUrls(@Nullable ConfigNodePropertyBoolean rewriteAbsoluteUrls) {
    this.rewriteAbsoluteUrls = rewriteAbsoluteUrls;
    return this;
  }

  /**
   * Get rewriteAbsoluteUrls
   * @return rewriteAbsoluteUrls
   */
  @Valid 
  @Schema(name = "rewrite.absolute.urls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rewrite.absolute.urls")
  public @Nullable ConfigNodePropertyBoolean getRewriteAbsoluteUrls() {
    return rewriteAbsoluteUrls;
  }

  @JsonProperty("rewrite.absolute.urls")
  public void setRewriteAbsoluteUrls(@Nullable ConfigNodePropertyBoolean rewriteAbsoluteUrls) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

