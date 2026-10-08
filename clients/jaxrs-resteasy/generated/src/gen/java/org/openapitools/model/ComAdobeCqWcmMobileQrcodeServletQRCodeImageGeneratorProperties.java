package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties   {
  
  private ConfigNodePropertyArray cqWcmQrcodeServletWhitelist;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.qrcode.servlet.whitelist")
  @Valid
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

