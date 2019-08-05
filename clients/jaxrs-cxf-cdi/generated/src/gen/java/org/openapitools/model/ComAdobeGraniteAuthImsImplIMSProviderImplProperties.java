package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeGraniteAuthImsImplIMSProviderImplProperties   {
  
  private ConfigNodePropertyString oauthProviderId = null;

  private ConfigNodePropertyString oauthProviderImsAuthorizationUrl = null;

  private ConfigNodePropertyString oauthProviderImsTokenUrl = null;

  private ConfigNodePropertyString oauthProviderImsProfileUrl = null;

  private ConfigNodePropertyArray oauthProviderImsExtendedDetailsUrls = null;

  private ConfigNodePropertyString oauthProviderImsValidateTokenUrl = null;

  private ConfigNodePropertyString oauthProviderImsSessionProperty = null;

  private ConfigNodePropertyString oauthProviderImsServiceTokenClientId = null;

  private ConfigNodePropertyString oauthProviderImsServiceTokenClientSecret = null;

  private ConfigNodePropertyString oauthProviderImsServiceToken = null;

  private ConfigNodePropertyString imsOrgRef = null;

  private ConfigNodePropertyArray imsGroupMapping = null;

  private ConfigNodePropertyBoolean oauthProviderImsOnlyLicenseGroup = null;


  /**
   **/
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.id")
  public ConfigNodePropertyString getOauthProviderId() {
    return oauthProviderId;
  }
  public void setOauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
  }


  /**
   **/
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsAuthorizationUrl(ConfigNodePropertyString oauthProviderImsAuthorizationUrl) {
    this.oauthProviderImsAuthorizationUrl = oauthProviderImsAuthorizationUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.ims.authorization.url")
  public ConfigNodePropertyString getOauthProviderImsAuthorizationUrl() {
    return oauthProviderImsAuthorizationUrl;
  }
  public void setOauthProviderImsAuthorizationUrl(ConfigNodePropertyString oauthProviderImsAuthorizationUrl) {
    this.oauthProviderImsAuthorizationUrl = oauthProviderImsAuthorizationUrl;
  }


  /**
   **/
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsTokenUrl(ConfigNodePropertyString oauthProviderImsTokenUrl) {
    this.oauthProviderImsTokenUrl = oauthProviderImsTokenUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.ims.token.url")
  public ConfigNodePropertyString getOauthProviderImsTokenUrl() {
    return oauthProviderImsTokenUrl;
  }
  public void setOauthProviderImsTokenUrl(ConfigNodePropertyString oauthProviderImsTokenUrl) {
    this.oauthProviderImsTokenUrl = oauthProviderImsTokenUrl;
  }


  /**
   **/
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsProfileUrl(ConfigNodePropertyString oauthProviderImsProfileUrl) {
    this.oauthProviderImsProfileUrl = oauthProviderImsProfileUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.ims.profile.url")
  public ConfigNodePropertyString getOauthProviderImsProfileUrl() {
    return oauthProviderImsProfileUrl;
  }
  public void setOauthProviderImsProfileUrl(ConfigNodePropertyString oauthProviderImsProfileUrl) {
    this.oauthProviderImsProfileUrl = oauthProviderImsProfileUrl;
  }


  /**
   **/
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsExtendedDetailsUrls(ConfigNodePropertyArray oauthProviderImsExtendedDetailsUrls) {
    this.oauthProviderImsExtendedDetailsUrls = oauthProviderImsExtendedDetailsUrls;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.ims.extended.details.urls")
  public ConfigNodePropertyArray getOauthProviderImsExtendedDetailsUrls() {
    return oauthProviderImsExtendedDetailsUrls;
  }
  public void setOauthProviderImsExtendedDetailsUrls(ConfigNodePropertyArray oauthProviderImsExtendedDetailsUrls) {
    this.oauthProviderImsExtendedDetailsUrls = oauthProviderImsExtendedDetailsUrls;
  }


  /**
   **/
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsValidateTokenUrl(ConfigNodePropertyString oauthProviderImsValidateTokenUrl) {
    this.oauthProviderImsValidateTokenUrl = oauthProviderImsValidateTokenUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.ims.validate.token.url")
  public ConfigNodePropertyString getOauthProviderImsValidateTokenUrl() {
    return oauthProviderImsValidateTokenUrl;
  }
  public void setOauthProviderImsValidateTokenUrl(ConfigNodePropertyString oauthProviderImsValidateTokenUrl) {
    this.oauthProviderImsValidateTokenUrl = oauthProviderImsValidateTokenUrl;
  }


  /**
   **/
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsSessionProperty(ConfigNodePropertyString oauthProviderImsSessionProperty) {
    this.oauthProviderImsSessionProperty = oauthProviderImsSessionProperty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.ims.session.property")
  public ConfigNodePropertyString getOauthProviderImsSessionProperty() {
    return oauthProviderImsSessionProperty;
  }
  public void setOauthProviderImsSessionProperty(ConfigNodePropertyString oauthProviderImsSessionProperty) {
    this.oauthProviderImsSessionProperty = oauthProviderImsSessionProperty;
  }


  /**
   **/
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsServiceTokenClientId(ConfigNodePropertyString oauthProviderImsServiceTokenClientId) {
    this.oauthProviderImsServiceTokenClientId = oauthProviderImsServiceTokenClientId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.ims.service.token.client.id")
  public ConfigNodePropertyString getOauthProviderImsServiceTokenClientId() {
    return oauthProviderImsServiceTokenClientId;
  }
  public void setOauthProviderImsServiceTokenClientId(ConfigNodePropertyString oauthProviderImsServiceTokenClientId) {
    this.oauthProviderImsServiceTokenClientId = oauthProviderImsServiceTokenClientId;
  }


  /**
   **/
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsServiceTokenClientSecret(ConfigNodePropertyString oauthProviderImsServiceTokenClientSecret) {
    this.oauthProviderImsServiceTokenClientSecret = oauthProviderImsServiceTokenClientSecret;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.ims.service.token.client.secret")
  public ConfigNodePropertyString getOauthProviderImsServiceTokenClientSecret() {
    return oauthProviderImsServiceTokenClientSecret;
  }
  public void setOauthProviderImsServiceTokenClientSecret(ConfigNodePropertyString oauthProviderImsServiceTokenClientSecret) {
    this.oauthProviderImsServiceTokenClientSecret = oauthProviderImsServiceTokenClientSecret;
  }


  /**
   **/
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsServiceToken(ConfigNodePropertyString oauthProviderImsServiceToken) {
    this.oauthProviderImsServiceToken = oauthProviderImsServiceToken;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.ims.service.token")
  public ConfigNodePropertyString getOauthProviderImsServiceToken() {
    return oauthProviderImsServiceToken;
  }
  public void setOauthProviderImsServiceToken(ConfigNodePropertyString oauthProviderImsServiceToken) {
    this.oauthProviderImsServiceToken = oauthProviderImsServiceToken;
  }


  /**
   **/
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties imsOrgRef(ConfigNodePropertyString imsOrgRef) {
    this.imsOrgRef = imsOrgRef;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ims.org.ref")
  public ConfigNodePropertyString getImsOrgRef() {
    return imsOrgRef;
  }
  public void setImsOrgRef(ConfigNodePropertyString imsOrgRef) {
    this.imsOrgRef = imsOrgRef;
  }


  /**
   **/
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties imsGroupMapping(ConfigNodePropertyArray imsGroupMapping) {
    this.imsGroupMapping = imsGroupMapping;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ims.group.mapping")
  public ConfigNodePropertyArray getImsGroupMapping() {
    return imsGroupMapping;
  }
  public void setImsGroupMapping(ConfigNodePropertyArray imsGroupMapping) {
    this.imsGroupMapping = imsGroupMapping;
  }


  /**
   **/
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsOnlyLicenseGroup(ConfigNodePropertyBoolean oauthProviderImsOnlyLicenseGroup) {
    this.oauthProviderImsOnlyLicenseGroup = oauthProviderImsOnlyLicenseGroup;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("oauth.provider.ims.only.license.group")
  public ConfigNodePropertyBoolean getOauthProviderImsOnlyLicenseGroup() {
    return oauthProviderImsOnlyLicenseGroup;
  }
  public void setOauthProviderImsOnlyLicenseGroup(ConfigNodePropertyBoolean oauthProviderImsOnlyLicenseGroup) {
    this.oauthProviderImsOnlyLicenseGroup = oauthProviderImsOnlyLicenseGroup;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthImsImplIMSProviderImplProperties comAdobeGraniteAuthImsImplIMSProviderImplProperties = (ComAdobeGraniteAuthImsImplIMSProviderImplProperties) o;
    return Objects.equals(oauthProviderId, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderId) &&
        Objects.equals(oauthProviderImsAuthorizationUrl, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsAuthorizationUrl) &&
        Objects.equals(oauthProviderImsTokenUrl, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsTokenUrl) &&
        Objects.equals(oauthProviderImsProfileUrl, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsProfileUrl) &&
        Objects.equals(oauthProviderImsExtendedDetailsUrls, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsExtendedDetailsUrls) &&
        Objects.equals(oauthProviderImsValidateTokenUrl, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsValidateTokenUrl) &&
        Objects.equals(oauthProviderImsSessionProperty, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsSessionProperty) &&
        Objects.equals(oauthProviderImsServiceTokenClientId, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsServiceTokenClientId) &&
        Objects.equals(oauthProviderImsServiceTokenClientSecret, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsServiceTokenClientSecret) &&
        Objects.equals(oauthProviderImsServiceToken, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsServiceToken) &&
        Objects.equals(imsOrgRef, comAdobeGraniteAuthImsImplIMSProviderImplProperties.imsOrgRef) &&
        Objects.equals(imsGroupMapping, comAdobeGraniteAuthImsImplIMSProviderImplProperties.imsGroupMapping) &&
        Objects.equals(oauthProviderImsOnlyLicenseGroup, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsOnlyLicenseGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthProviderId, oauthProviderImsAuthorizationUrl, oauthProviderImsTokenUrl, oauthProviderImsProfileUrl, oauthProviderImsExtendedDetailsUrls, oauthProviderImsValidateTokenUrl, oauthProviderImsSessionProperty, oauthProviderImsServiceTokenClientId, oauthProviderImsServiceTokenClientSecret, oauthProviderImsServiceToken, imsOrgRef, imsGroupMapping, oauthProviderImsOnlyLicenseGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthImsImplIMSProviderImplProperties {\n");
    
    sb.append("    oauthProviderId: ").append(toIndentedString(oauthProviderId)).append("\n");
    sb.append("    oauthProviderImsAuthorizationUrl: ").append(toIndentedString(oauthProviderImsAuthorizationUrl)).append("\n");
    sb.append("    oauthProviderImsTokenUrl: ").append(toIndentedString(oauthProviderImsTokenUrl)).append("\n");
    sb.append("    oauthProviderImsProfileUrl: ").append(toIndentedString(oauthProviderImsProfileUrl)).append("\n");
    sb.append("    oauthProviderImsExtendedDetailsUrls: ").append(toIndentedString(oauthProviderImsExtendedDetailsUrls)).append("\n");
    sb.append("    oauthProviderImsValidateTokenUrl: ").append(toIndentedString(oauthProviderImsValidateTokenUrl)).append("\n");
    sb.append("    oauthProviderImsSessionProperty: ").append(toIndentedString(oauthProviderImsSessionProperty)).append("\n");
    sb.append("    oauthProviderImsServiceTokenClientId: ").append(toIndentedString(oauthProviderImsServiceTokenClientId)).append("\n");
    sb.append("    oauthProviderImsServiceTokenClientSecret: ").append(toIndentedString(oauthProviderImsServiceTokenClientSecret)).append("\n");
    sb.append("    oauthProviderImsServiceToken: ").append(toIndentedString(oauthProviderImsServiceToken)).append("\n");
    sb.append("    imsOrgRef: ").append(toIndentedString(imsOrgRef)).append("\n");
    sb.append("    imsGroupMapping: ").append(toIndentedString(imsGroupMapping)).append("\n");
    sb.append("    oauthProviderImsOnlyLicenseGroup: ").append(toIndentedString(oauthProviderImsOnlyLicenseGroup)).append("\n");
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

