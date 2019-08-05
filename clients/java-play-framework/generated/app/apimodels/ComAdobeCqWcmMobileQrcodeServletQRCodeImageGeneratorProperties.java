package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
    return Objects.equals(cqWcmQrcodeServletWhitelist, comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties.cqWcmQrcodeServletWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqWcmQrcodeServletWhitelist);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

