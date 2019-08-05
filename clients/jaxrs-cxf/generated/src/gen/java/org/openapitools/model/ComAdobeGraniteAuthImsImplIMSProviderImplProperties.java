package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteAuthImsImplIMSProviderImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderId = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderImsAuthorizationUrl = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderImsTokenUrl = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderImsProfileUrl = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray oauthProviderImsExtendedDetailsUrls = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderImsValidateTokenUrl = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderImsSessionProperty = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderImsServiceTokenClientId = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderImsServiceTokenClientSecret = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderImsServiceToken = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString imsOrgRef = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray imsGroupMapping = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthProviderImsOnlyLicenseGroup = null;
 /**
   * Get oauthProviderId
   * @return oauthProviderId
  **/
  @JsonProperty("oauth.provider.id")
  public ConfigNodePropertyString getOauthProviderId() {
    return oauthProviderId;
  }

  public void setOauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
  }

  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
    return this;
  }

 /**
   * Get oauthProviderImsAuthorizationUrl
   * @return oauthProviderImsAuthorizationUrl
  **/
  @JsonProperty("oauth.provider.ims.authorization.url")
  public ConfigNodePropertyString getOauthProviderImsAuthorizationUrl() {
    return oauthProviderImsAuthorizationUrl;
  }

  public void setOauthProviderImsAuthorizationUrl(ConfigNodePropertyString oauthProviderImsAuthorizationUrl) {
    this.oauthProviderImsAuthorizationUrl = oauthProviderImsAuthorizationUrl;
  }

  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsAuthorizationUrl(ConfigNodePropertyString oauthProviderImsAuthorizationUrl) {
    this.oauthProviderImsAuthorizationUrl = oauthProviderImsAuthorizationUrl;
    return this;
  }

 /**
   * Get oauthProviderImsTokenUrl
   * @return oauthProviderImsTokenUrl
  **/
  @JsonProperty("oauth.provider.ims.token.url")
  public ConfigNodePropertyString getOauthProviderImsTokenUrl() {
    return oauthProviderImsTokenUrl;
  }

  public void setOauthProviderImsTokenUrl(ConfigNodePropertyString oauthProviderImsTokenUrl) {
    this.oauthProviderImsTokenUrl = oauthProviderImsTokenUrl;
  }

  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsTokenUrl(ConfigNodePropertyString oauthProviderImsTokenUrl) {
    this.oauthProviderImsTokenUrl = oauthProviderImsTokenUrl;
    return this;
  }

 /**
   * Get oauthProviderImsProfileUrl
   * @return oauthProviderImsProfileUrl
  **/
  @JsonProperty("oauth.provider.ims.profile.url")
  public ConfigNodePropertyString getOauthProviderImsProfileUrl() {
    return oauthProviderImsProfileUrl;
  }

  public void setOauthProviderImsProfileUrl(ConfigNodePropertyString oauthProviderImsProfileUrl) {
    this.oauthProviderImsProfileUrl = oauthProviderImsProfileUrl;
  }

  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsProfileUrl(ConfigNodePropertyString oauthProviderImsProfileUrl) {
    this.oauthProviderImsProfileUrl = oauthProviderImsProfileUrl;
    return this;
  }

 /**
   * Get oauthProviderImsExtendedDetailsUrls
   * @return oauthProviderImsExtendedDetailsUrls
  **/
  @JsonProperty("oauth.provider.ims.extended.details.urls")
  public ConfigNodePropertyArray getOauthProviderImsExtendedDetailsUrls() {
    return oauthProviderImsExtendedDetailsUrls;
  }

  public void setOauthProviderImsExtendedDetailsUrls(ConfigNodePropertyArray oauthProviderImsExtendedDetailsUrls) {
    this.oauthProviderImsExtendedDetailsUrls = oauthProviderImsExtendedDetailsUrls;
  }

  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsExtendedDetailsUrls(ConfigNodePropertyArray oauthProviderImsExtendedDetailsUrls) {
    this.oauthProviderImsExtendedDetailsUrls = oauthProviderImsExtendedDetailsUrls;
    return this;
  }

 /**
   * Get oauthProviderImsValidateTokenUrl
   * @return oauthProviderImsValidateTokenUrl
  **/
  @JsonProperty("oauth.provider.ims.validate.token.url")
  public ConfigNodePropertyString getOauthProviderImsValidateTokenUrl() {
    return oauthProviderImsValidateTokenUrl;
  }

  public void setOauthProviderImsValidateTokenUrl(ConfigNodePropertyString oauthProviderImsValidateTokenUrl) {
    this.oauthProviderImsValidateTokenUrl = oauthProviderImsValidateTokenUrl;
  }

  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsValidateTokenUrl(ConfigNodePropertyString oauthProviderImsValidateTokenUrl) {
    this.oauthProviderImsValidateTokenUrl = oauthProviderImsValidateTokenUrl;
    return this;
  }

 /**
   * Get oauthProviderImsSessionProperty
   * @return oauthProviderImsSessionProperty
  **/
  @JsonProperty("oauth.provider.ims.session.property")
  public ConfigNodePropertyString getOauthProviderImsSessionProperty() {
    return oauthProviderImsSessionProperty;
  }

  public void setOauthProviderImsSessionProperty(ConfigNodePropertyString oauthProviderImsSessionProperty) {
    this.oauthProviderImsSessionProperty = oauthProviderImsSessionProperty;
  }

  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsSessionProperty(ConfigNodePropertyString oauthProviderImsSessionProperty) {
    this.oauthProviderImsSessionProperty = oauthProviderImsSessionProperty;
    return this;
  }

 /**
   * Get oauthProviderImsServiceTokenClientId
   * @return oauthProviderImsServiceTokenClientId
  **/
  @JsonProperty("oauth.provider.ims.service.token.client.id")
  public ConfigNodePropertyString getOauthProviderImsServiceTokenClientId() {
    return oauthProviderImsServiceTokenClientId;
  }

  public void setOauthProviderImsServiceTokenClientId(ConfigNodePropertyString oauthProviderImsServiceTokenClientId) {
    this.oauthProviderImsServiceTokenClientId = oauthProviderImsServiceTokenClientId;
  }

  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsServiceTokenClientId(ConfigNodePropertyString oauthProviderImsServiceTokenClientId) {
    this.oauthProviderImsServiceTokenClientId = oauthProviderImsServiceTokenClientId;
    return this;
  }

 /**
   * Get oauthProviderImsServiceTokenClientSecret
   * @return oauthProviderImsServiceTokenClientSecret
  **/
  @JsonProperty("oauth.provider.ims.service.token.client.secret")
  public ConfigNodePropertyString getOauthProviderImsServiceTokenClientSecret() {
    return oauthProviderImsServiceTokenClientSecret;
  }

  public void setOauthProviderImsServiceTokenClientSecret(ConfigNodePropertyString oauthProviderImsServiceTokenClientSecret) {
    this.oauthProviderImsServiceTokenClientSecret = oauthProviderImsServiceTokenClientSecret;
  }

  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsServiceTokenClientSecret(ConfigNodePropertyString oauthProviderImsServiceTokenClientSecret) {
    this.oauthProviderImsServiceTokenClientSecret = oauthProviderImsServiceTokenClientSecret;
    return this;
  }

 /**
   * Get oauthProviderImsServiceToken
   * @return oauthProviderImsServiceToken
  **/
  @JsonProperty("oauth.provider.ims.service.token")
  public ConfigNodePropertyString getOauthProviderImsServiceToken() {
    return oauthProviderImsServiceToken;
  }

  public void setOauthProviderImsServiceToken(ConfigNodePropertyString oauthProviderImsServiceToken) {
    this.oauthProviderImsServiceToken = oauthProviderImsServiceToken;
  }

  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsServiceToken(ConfigNodePropertyString oauthProviderImsServiceToken) {
    this.oauthProviderImsServiceToken = oauthProviderImsServiceToken;
    return this;
  }

 /**
   * Get imsOrgRef
   * @return imsOrgRef
  **/
  @JsonProperty("ims.org.ref")
  public ConfigNodePropertyString getImsOrgRef() {
    return imsOrgRef;
  }

  public void setImsOrgRef(ConfigNodePropertyString imsOrgRef) {
    this.imsOrgRef = imsOrgRef;
  }

  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties imsOrgRef(ConfigNodePropertyString imsOrgRef) {
    this.imsOrgRef = imsOrgRef;
    return this;
  }

 /**
   * Get imsGroupMapping
   * @return imsGroupMapping
  **/
  @JsonProperty("ims.group.mapping")
  public ConfigNodePropertyArray getImsGroupMapping() {
    return imsGroupMapping;
  }

  public void setImsGroupMapping(ConfigNodePropertyArray imsGroupMapping) {
    this.imsGroupMapping = imsGroupMapping;
  }

  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties imsGroupMapping(ConfigNodePropertyArray imsGroupMapping) {
    this.imsGroupMapping = imsGroupMapping;
    return this;
  }

 /**
   * Get oauthProviderImsOnlyLicenseGroup
   * @return oauthProviderImsOnlyLicenseGroup
  **/
  @JsonProperty("oauth.provider.ims.only.license.group")
  public ConfigNodePropertyBoolean getOauthProviderImsOnlyLicenseGroup() {
    return oauthProviderImsOnlyLicenseGroup;
  }

  public void setOauthProviderImsOnlyLicenseGroup(ConfigNodePropertyBoolean oauthProviderImsOnlyLicenseGroup) {
    this.oauthProviderImsOnlyLicenseGroup = oauthProviderImsOnlyLicenseGroup;
  }

  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsOnlyLicenseGroup(ConfigNodePropertyBoolean oauthProviderImsOnlyLicenseGroup) {
    this.oauthProviderImsOnlyLicenseGroup = oauthProviderImsOnlyLicenseGroup;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

