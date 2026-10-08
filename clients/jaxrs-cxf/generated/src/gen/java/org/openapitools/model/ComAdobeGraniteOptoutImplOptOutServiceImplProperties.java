package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteOptoutImplOptOutServiceImplProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray optoutCookies;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray optoutHeaders;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray optoutWhitelistCookies;
 /**
   * Get optoutCookies
   * @return optoutCookies
  **/
  @JsonProperty("optout.cookies")
  public ConfigNodePropertyArray getOptoutCookies() {
    return optoutCookies;
  }

  public void setOptoutCookies(ConfigNodePropertyArray optoutCookies) {
    this.optoutCookies = optoutCookies;
  }

  public ComAdobeGraniteOptoutImplOptOutServiceImplProperties optoutCookies(ConfigNodePropertyArray optoutCookies) {
    this.optoutCookies = optoutCookies;
    return this;
  }

 /**
   * Get optoutHeaders
   * @return optoutHeaders
  **/
  @JsonProperty("optout.headers")
  public ConfigNodePropertyArray getOptoutHeaders() {
    return optoutHeaders;
  }

  public void setOptoutHeaders(ConfigNodePropertyArray optoutHeaders) {
    this.optoutHeaders = optoutHeaders;
  }

  public ComAdobeGraniteOptoutImplOptOutServiceImplProperties optoutHeaders(ConfigNodePropertyArray optoutHeaders) {
    this.optoutHeaders = optoutHeaders;
    return this;
  }

 /**
   * Get optoutWhitelistCookies
   * @return optoutWhitelistCookies
  **/
  @JsonProperty("optout.whitelist.cookies")
  public ConfigNodePropertyArray getOptoutWhitelistCookies() {
    return optoutWhitelistCookies;
  }

  public void setOptoutWhitelistCookies(ConfigNodePropertyArray optoutWhitelistCookies) {
    this.optoutWhitelistCookies = optoutWhitelistCookies;
  }

  public ComAdobeGraniteOptoutImplOptOutServiceImplProperties optoutWhitelistCookies(ConfigNodePropertyArray optoutWhitelistCookies) {
    this.optoutWhitelistCookies = optoutWhitelistCookies;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOptoutImplOptOutServiceImplProperties comAdobeGraniteOptoutImplOptOutServiceImplProperties = (ComAdobeGraniteOptoutImplOptOutServiceImplProperties) o;
    return Objects.equals(this.optoutCookies, comAdobeGraniteOptoutImplOptOutServiceImplProperties.optoutCookies) &&
        Objects.equals(this.optoutHeaders, comAdobeGraniteOptoutImplOptOutServiceImplProperties.optoutHeaders) &&
        Objects.equals(this.optoutWhitelistCookies, comAdobeGraniteOptoutImplOptOutServiceImplProperties.optoutWhitelistCookies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optoutCookies, optoutHeaders, optoutWhitelistCookies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOptoutImplOptOutServiceImplProperties {\n");
    
    sb.append("    optoutCookies: ").append(toIndentedString(optoutCookies)).append("\n");
    sb.append("    optoutHeaders: ").append(toIndentedString(optoutHeaders)).append("\n");
    sb.append("    optoutWhitelistCookies: ").append(toIndentedString(optoutWhitelistCookies)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

