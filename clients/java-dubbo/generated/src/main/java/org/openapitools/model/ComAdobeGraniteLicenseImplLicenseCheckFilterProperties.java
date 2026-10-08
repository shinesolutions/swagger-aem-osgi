package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("checkInternval")
  private ConfigNodePropertyInteger checkInternval;

  @JsonProperty("excludeIds")
  private ConfigNodePropertyArray excludeIds;

  @JsonProperty("encryptPing")
  private ConfigNodePropertyBoolean encryptPing;

  /**
   * 
   * @return checkInternval
   */
  public ConfigNodePropertyInteger getCheckInternval() {
    return checkInternval;
  }

  public void setCheckInternval(ConfigNodePropertyInteger checkInternval) {
    this.checkInternval = checkInternval;
  }

  /**
   * 
   * @return excludeIds
   */
  public ConfigNodePropertyArray getExcludeIds() {
    return excludeIds;
  }

  public void setExcludeIds(ConfigNodePropertyArray excludeIds) {
    this.excludeIds = excludeIds;
  }

  /**
   * 
   * @return encryptPing
   */
  public ConfigNodePropertyBoolean getEncryptPing() {
    return encryptPing;
  }

  public void setEncryptPing(ConfigNodePropertyBoolean encryptPing) {
    this.encryptPing = encryptPing;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
