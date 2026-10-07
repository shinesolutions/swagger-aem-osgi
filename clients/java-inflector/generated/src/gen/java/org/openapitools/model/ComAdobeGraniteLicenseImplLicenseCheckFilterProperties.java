package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties   {
  @JsonProperty("checkInternval")
  private ConfigNodePropertyInteger checkInternval;

  @JsonProperty("excludeIds")
  private ConfigNodePropertyArray excludeIds;

  @JsonProperty("encryptPing")
  private ConfigNodePropertyBoolean encryptPing;

  /**
   **/
  public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties checkInternval(ConfigNodePropertyInteger checkInternval) {
    this.checkInternval = checkInternval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("checkInternval")
  public ConfigNodePropertyInteger getCheckInternval() {
    return checkInternval;
  }
  public void setCheckInternval(ConfigNodePropertyInteger checkInternval) {
    this.checkInternval = checkInternval;
  }

  /**
   **/
  public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties excludeIds(ConfigNodePropertyArray excludeIds) {
    this.excludeIds = excludeIds;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("excludeIds")
  public ConfigNodePropertyArray getExcludeIds() {
    return excludeIds;
  }
  public void setExcludeIds(ConfigNodePropertyArray excludeIds) {
    this.excludeIds = excludeIds;
  }

  /**
   **/
  public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties encryptPing(ConfigNodePropertyBoolean encryptPing) {
    this.encryptPing = encryptPing;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("encryptPing")
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
    return Objects.equals(checkInternval, comAdobeGraniteLicenseImplLicenseCheckFilterProperties.checkInternval) &&
        Objects.equals(excludeIds, comAdobeGraniteLicenseImplLicenseCheckFilterProperties.excludeIds) &&
        Objects.equals(encryptPing, comAdobeGraniteLicenseImplLicenseCheckFilterProperties.encryptPing);
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

