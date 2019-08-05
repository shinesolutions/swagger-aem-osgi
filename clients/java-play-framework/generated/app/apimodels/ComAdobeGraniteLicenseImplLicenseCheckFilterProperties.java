package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteLicenseImplLicenseCheckFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties   {
  @JsonProperty("checkInternval")
  private ConfigNodePropertyInteger checkInternval = null;

  @JsonProperty("excludeIds")
  private ConfigNodePropertyArray excludeIds = null;

  @JsonProperty("encryptPing")
  private ConfigNodePropertyBoolean encryptPing = null;

  public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties checkInternval(ConfigNodePropertyInteger checkInternval) {
    this.checkInternval = checkInternval;
    return this;
  }

   /**
   * Get checkInternval
   * @return checkInternval
  **/
  @Valid
  public ConfigNodePropertyInteger getCheckInternval() {
    return checkInternval;
  }

  public void setCheckInternval(ConfigNodePropertyInteger checkInternval) {
    this.checkInternval = checkInternval;
  }

  public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties excludeIds(ConfigNodePropertyArray excludeIds) {
    this.excludeIds = excludeIds;
    return this;
  }

   /**
   * Get excludeIds
   * @return excludeIds
  **/
  @Valid
  public ConfigNodePropertyArray getExcludeIds() {
    return excludeIds;
  }

  public void setExcludeIds(ConfigNodePropertyArray excludeIds) {
    this.excludeIds = excludeIds;
  }

  public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties encryptPing(ConfigNodePropertyBoolean encryptPing) {
    this.encryptPing = encryptPing;
    return this;
  }

   /**
   * Get encryptPing
   * @return encryptPing
  **/
  @Valid
  public ConfigNodePropertyBoolean getEncryptPing() {
    return encryptPing;
  }

  public void setEncryptPing(ConfigNodePropertyBoolean encryptPing) {
    this.encryptPing = encryptPing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteLicenseImplLicenseCheckFilterProperties comAdobeGraniteLicenseImplLicenseCheckFilterProperties = (ComAdobeGraniteLicenseImplLicenseCheckFilterProperties) o;
    return Objects.equals(checkInternval, comAdobeGraniteLicenseImplLicenseCheckFilterProperties.checkInternval) &&
        Objects.equals(excludeIds, comAdobeGraniteLicenseImplLicenseCheckFilterProperties.excludeIds) &&
        Objects.equals(encryptPing, comAdobeGraniteLicenseImplLicenseCheckFilterProperties.encryptPing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkInternval, excludeIds, encryptPing);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties {\n");
    
    sb.append("    checkInternval: ").append(toIndentedString(checkInternval)).append("\n");
    sb.append("    excludeIds: ").append(toIndentedString(excludeIds)).append("\n");
    sb.append("    encryptPing: ").append(toIndentedString(encryptPing)).append("\n");
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

