package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties   {
  @JsonProperty("cq.wcm.qrcode.servlet.whitelist")
  private ConfigNodePropertyArray cqWcmQrcodeServletWhitelist = null;

  public ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties cqWcmQrcodeServletWhitelist(ConfigNodePropertyArray cqWcmQrcodeServletWhitelist) {
    this.cqWcmQrcodeServletWhitelist = cqWcmQrcodeServletWhitelist;
    return this;
  }

   /**
   * Get cqWcmQrcodeServletWhitelist
   * @return cqWcmQrcodeServletWhitelist
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqWcmQrcodeServletWhitelist() {
    return cqWcmQrcodeServletWhitelist;
  }

  public void setCqWcmQrcodeServletWhitelist(ConfigNodePropertyArray cqWcmQrcodeServletWhitelist) {
    this.cqWcmQrcodeServletWhitelist = cqWcmQrcodeServletWhitelist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

