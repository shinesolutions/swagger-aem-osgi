package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties
 */

@JsonTypeName("comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties {

  private ConfigNodePropertyArray cqWcmQrcodeServletWhitelist;

  public ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties cqWcmQrcodeServletWhitelist(ConfigNodePropertyArray cqWcmQrcodeServletWhitelist) {
    this.cqWcmQrcodeServletWhitelist = cqWcmQrcodeServletWhitelist;
    return this;
  }

  /**
   * Get cqWcmQrcodeServletWhitelist
   * @return cqWcmQrcodeServletWhitelist
   */
  @Valid 
  @Schema(name = "cq.wcm.qrcode.servlet.whitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.wcm.qrcode.servlet.whitelist")
  public ConfigNodePropertyArray getCqWcmQrcodeServletWhitelist() {
    return cqWcmQrcodeServletWhitelist;
  }

  public void setCqWcmQrcodeServletWhitelist(ConfigNodePropertyArray cqWcmQrcodeServletWhitelist) {
    this.cqWcmQrcodeServletWhitelist = cqWcmQrcodeServletWhitelist;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties = (ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties) o;
    return Objects.equals(this.cqWcmQrcodeServletWhitelist, comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties.cqWcmQrcodeServletWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqWcmQrcodeServletWhitelist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties {\n");
    sb.append("    cqWcmQrcodeServletWhitelist: ").append(toIndentedString(cqWcmQrcodeServletWhitelist)).append("\n");
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

