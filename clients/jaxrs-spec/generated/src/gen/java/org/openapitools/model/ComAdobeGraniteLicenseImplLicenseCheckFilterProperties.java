package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeGraniteLicenseImplLicenseCheckFilterProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties   {
  private ConfigNodePropertyInteger checkInternval;
  private ConfigNodePropertyArray excludeIds;
  private ConfigNodePropertyBoolean encryptPing;

  public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties() {
  }

  /**
   **/
  public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties checkInternval(ConfigNodePropertyInteger checkInternval) {
    this.checkInternval = checkInternval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("checkInternval")
  @Valid public ConfigNodePropertyInteger getCheckInternval() {
    return checkInternval;
  }

  @JsonProperty("checkInternval")
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
  @Valid public ConfigNodePropertyArray getExcludeIds() {
    return excludeIds;
  }

  @JsonProperty("excludeIds")
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
  @Valid public ConfigNodePropertyBoolean getEncryptPing() {
    return encryptPing;
  }

  @JsonProperty("encryptPing")
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
