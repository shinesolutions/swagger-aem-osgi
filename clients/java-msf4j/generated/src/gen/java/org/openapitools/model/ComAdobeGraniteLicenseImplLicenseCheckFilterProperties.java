package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

/**
 * ComAdobeGraniteLicenseImplLicenseCheckFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.checkInternval, comAdobeGraniteLicenseImplLicenseCheckFilterProperties.checkInternval) &&
        Objects.equals(this.excludeIds, comAdobeGraniteLicenseImplLicenseCheckFilterProperties.excludeIds) &&
        Objects.equals(this.encryptPing, comAdobeGraniteLicenseImplLicenseCheckFilterProperties.encryptPing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkInternval, excludeIds, encryptPing);
  }

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
