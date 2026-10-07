package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteAuthImsImplIMSProviderImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderId;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderImsAuthorizationUrl;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderImsTokenUrl;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderImsProfileUrl;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray oauthProviderImsExtendedDetailsUrls;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderImsValidateTokenUrl;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderImsSessionProperty;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderImsServiceTokenClientId;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderImsServiceTokenClientSecret;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString oauthProviderImsServiceToken;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString imsOrgRef;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray imsGroupMapping;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean oauthProviderImsOnlyLicenseGroup;
 /**
  * Get oauthProviderId
  * @return oauthProviderId
  */
  @JsonProperty("oauth.provider.id")
  public ConfigNodePropertyString getOauthProviderId() {
    return oauthProviderId;
  }

  /**
   * Sets the <code>oauthProviderId</code> property.
   */
 public void setOauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
  }

  /**
   * Sets the <code>oauthProviderId</code> property.
   */
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderId(ConfigNodePropertyString oauthProviderId) {
    this.oauthProviderId = oauthProviderId;
    return this;
  }

 /**
  * Get oauthProviderImsAuthorizationUrl
  * @return oauthProviderImsAuthorizationUrl
  */
  @JsonProperty("oauth.provider.ims.authorization.url")
  public ConfigNodePropertyString getOauthProviderImsAuthorizationUrl() {
    return oauthProviderImsAuthorizationUrl;
  }

  /**
   * Sets the <code>oauthProviderImsAuthorizationUrl</code> property.
   */
 public void setOauthProviderImsAuthorizationUrl(ConfigNodePropertyString oauthProviderImsAuthorizationUrl) {
    this.oauthProviderImsAuthorizationUrl = oauthProviderImsAuthorizationUrl;
  }

  /**
   * Sets the <code>oauthProviderImsAuthorizationUrl</code> property.
   */
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsAuthorizationUrl(ConfigNodePropertyString oauthProviderImsAuthorizationUrl) {
    this.oauthProviderImsAuthorizationUrl = oauthProviderImsAuthorizationUrl;
    return this;
  }

 /**
  * Get oauthProviderImsTokenUrl
  * @return oauthProviderImsTokenUrl
  */
  @JsonProperty("oauth.provider.ims.token.url")
  public ConfigNodePropertyString getOauthProviderImsTokenUrl() {
    return oauthProviderImsTokenUrl;
  }

  /**
   * Sets the <code>oauthProviderImsTokenUrl</code> property.
   */
 public void setOauthProviderImsTokenUrl(ConfigNodePropertyString oauthProviderImsTokenUrl) {
    this.oauthProviderImsTokenUrl = oauthProviderImsTokenUrl;
  }

  /**
   * Sets the <code>oauthProviderImsTokenUrl</code> property.
   */
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsTokenUrl(ConfigNodePropertyString oauthProviderImsTokenUrl) {
    this.oauthProviderImsTokenUrl = oauthProviderImsTokenUrl;
    return this;
  }

 /**
  * Get oauthProviderImsProfileUrl
  * @return oauthProviderImsProfileUrl
  */
  @JsonProperty("oauth.provider.ims.profile.url")
  public ConfigNodePropertyString getOauthProviderImsProfileUrl() {
    return oauthProviderImsProfileUrl;
  }

  /**
   * Sets the <code>oauthProviderImsProfileUrl</code> property.
   */
 public void setOauthProviderImsProfileUrl(ConfigNodePropertyString oauthProviderImsProfileUrl) {
    this.oauthProviderImsProfileUrl = oauthProviderImsProfileUrl;
  }

  /**
   * Sets the <code>oauthProviderImsProfileUrl</code> property.
   */
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsProfileUrl(ConfigNodePropertyString oauthProviderImsProfileUrl) {
    this.oauthProviderImsProfileUrl = oauthProviderImsProfileUrl;
    return this;
  }

 /**
  * Get oauthProviderImsExtendedDetailsUrls
  * @return oauthProviderImsExtendedDetailsUrls
  */
  @JsonProperty("oauth.provider.ims.extended.details.urls")
  public ConfigNodePropertyArray getOauthProviderImsExtendedDetailsUrls() {
    return oauthProviderImsExtendedDetailsUrls;
  }

  /**
   * Sets the <code>oauthProviderImsExtendedDetailsUrls</code> property.
   */
 public void setOauthProviderImsExtendedDetailsUrls(ConfigNodePropertyArray oauthProviderImsExtendedDetailsUrls) {
    this.oauthProviderImsExtendedDetailsUrls = oauthProviderImsExtendedDetailsUrls;
  }

  /**
   * Sets the <code>oauthProviderImsExtendedDetailsUrls</code> property.
   */
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsExtendedDetailsUrls(ConfigNodePropertyArray oauthProviderImsExtendedDetailsUrls) {
    this.oauthProviderImsExtendedDetailsUrls = oauthProviderImsExtendedDetailsUrls;
    return this;
  }

 /**
  * Get oauthProviderImsValidateTokenUrl
  * @return oauthProviderImsValidateTokenUrl
  */
  @JsonProperty("oauth.provider.ims.validate.token.url")
  public ConfigNodePropertyString getOauthProviderImsValidateTokenUrl() {
    return oauthProviderImsValidateTokenUrl;
  }

  /**
   * Sets the <code>oauthProviderImsValidateTokenUrl</code> property.
   */
 public void setOauthProviderImsValidateTokenUrl(ConfigNodePropertyString oauthProviderImsValidateTokenUrl) {
    this.oauthProviderImsValidateTokenUrl = oauthProviderImsValidateTokenUrl;
  }

  /**
   * Sets the <code>oauthProviderImsValidateTokenUrl</code> property.
   */
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsValidateTokenUrl(ConfigNodePropertyString oauthProviderImsValidateTokenUrl) {
    this.oauthProviderImsValidateTokenUrl = oauthProviderImsValidateTokenUrl;
    return this;
  }

 /**
  * Get oauthProviderImsSessionProperty
  * @return oauthProviderImsSessionProperty
  */
  @JsonProperty("oauth.provider.ims.session.property")
  public ConfigNodePropertyString getOauthProviderImsSessionProperty() {
    return oauthProviderImsSessionProperty;
  }

  /**
   * Sets the <code>oauthProviderImsSessionProperty</code> property.
   */
 public void setOauthProviderImsSessionProperty(ConfigNodePropertyString oauthProviderImsSessionProperty) {
    this.oauthProviderImsSessionProperty = oauthProviderImsSessionProperty;
  }

  /**
   * Sets the <code>oauthProviderImsSessionProperty</code> property.
   */
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsSessionProperty(ConfigNodePropertyString oauthProviderImsSessionProperty) {
    this.oauthProviderImsSessionProperty = oauthProviderImsSessionProperty;
    return this;
  }

 /**
  * Get oauthProviderImsServiceTokenClientId
  * @return oauthProviderImsServiceTokenClientId
  */
  @JsonProperty("oauth.provider.ims.service.token.client.id")
  public ConfigNodePropertyString getOauthProviderImsServiceTokenClientId() {
    return oauthProviderImsServiceTokenClientId;
  }

  /**
   * Sets the <code>oauthProviderImsServiceTokenClientId</code> property.
   */
 public void setOauthProviderImsServiceTokenClientId(ConfigNodePropertyString oauthProviderImsServiceTokenClientId) {
    this.oauthProviderImsServiceTokenClientId = oauthProviderImsServiceTokenClientId;
  }

  /**
   * Sets the <code>oauthProviderImsServiceTokenClientId</code> property.
   */
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsServiceTokenClientId(ConfigNodePropertyString oauthProviderImsServiceTokenClientId) {
    this.oauthProviderImsServiceTokenClientId = oauthProviderImsServiceTokenClientId;
    return this;
  }

 /**
  * Get oauthProviderImsServiceTokenClientSecret
  * @return oauthProviderImsServiceTokenClientSecret
  */
  @JsonProperty("oauth.provider.ims.service.token.client.secret")
  public ConfigNodePropertyString getOauthProviderImsServiceTokenClientSecret() {
    return oauthProviderImsServiceTokenClientSecret;
  }

  /**
   * Sets the <code>oauthProviderImsServiceTokenClientSecret</code> property.
   */
 public void setOauthProviderImsServiceTokenClientSecret(ConfigNodePropertyString oauthProviderImsServiceTokenClientSecret) {
    this.oauthProviderImsServiceTokenClientSecret = oauthProviderImsServiceTokenClientSecret;
  }

  /**
   * Sets the <code>oauthProviderImsServiceTokenClientSecret</code> property.
   */
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsServiceTokenClientSecret(ConfigNodePropertyString oauthProviderImsServiceTokenClientSecret) {
    this.oauthProviderImsServiceTokenClientSecret = oauthProviderImsServiceTokenClientSecret;
    return this;
  }

 /**
  * Get oauthProviderImsServiceToken
  * @return oauthProviderImsServiceToken
  */
  @JsonProperty("oauth.provider.ims.service.token")
  public ConfigNodePropertyString getOauthProviderImsServiceToken() {
    return oauthProviderImsServiceToken;
  }

  /**
   * Sets the <code>oauthProviderImsServiceToken</code> property.
   */
 public void setOauthProviderImsServiceToken(ConfigNodePropertyString oauthProviderImsServiceToken) {
    this.oauthProviderImsServiceToken = oauthProviderImsServiceToken;
  }

  /**
   * Sets the <code>oauthProviderImsServiceToken</code> property.
   */
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsServiceToken(ConfigNodePropertyString oauthProviderImsServiceToken) {
    this.oauthProviderImsServiceToken = oauthProviderImsServiceToken;
    return this;
  }

 /**
  * Get imsOrgRef
  * @return imsOrgRef
  */
  @JsonProperty("ims.org.ref")
  public ConfigNodePropertyString getImsOrgRef() {
    return imsOrgRef;
  }

  /**
   * Sets the <code>imsOrgRef</code> property.
   */
 public void setImsOrgRef(ConfigNodePropertyString imsOrgRef) {
    this.imsOrgRef = imsOrgRef;
  }

  /**
   * Sets the <code>imsOrgRef</code> property.
   */
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties imsOrgRef(ConfigNodePropertyString imsOrgRef) {
    this.imsOrgRef = imsOrgRef;
    return this;
  }

 /**
  * Get imsGroupMapping
  * @return imsGroupMapping
  */
  @JsonProperty("ims.group.mapping")
  public ConfigNodePropertyArray getImsGroupMapping() {
    return imsGroupMapping;
  }

  /**
   * Sets the <code>imsGroupMapping</code> property.
   */
 public void setImsGroupMapping(ConfigNodePropertyArray imsGroupMapping) {
    this.imsGroupMapping = imsGroupMapping;
  }

  /**
   * Sets the <code>imsGroupMapping</code> property.
   */
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties imsGroupMapping(ConfigNodePropertyArray imsGroupMapping) {
    this.imsGroupMapping = imsGroupMapping;
    return this;
  }

 /**
  * Get oauthProviderImsOnlyLicenseGroup
  * @return oauthProviderImsOnlyLicenseGroup
  */
  @JsonProperty("oauth.provider.ims.only.license.group")
  public ConfigNodePropertyBoolean getOauthProviderImsOnlyLicenseGroup() {
    return oauthProviderImsOnlyLicenseGroup;
  }

  /**
   * Sets the <code>oauthProviderImsOnlyLicenseGroup</code> property.
   */
 public void setOauthProviderImsOnlyLicenseGroup(ConfigNodePropertyBoolean oauthProviderImsOnlyLicenseGroup) {
    this.oauthProviderImsOnlyLicenseGroup = oauthProviderImsOnlyLicenseGroup;
  }

  /**
   * Sets the <code>oauthProviderImsOnlyLicenseGroup</code> property.
   */
  public ComAdobeGraniteAuthImsImplIMSProviderImplProperties oauthProviderImsOnlyLicenseGroup(ConfigNodePropertyBoolean oauthProviderImsOnlyLicenseGroup) {
    this.oauthProviderImsOnlyLicenseGroup = oauthProviderImsOnlyLicenseGroup;
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
    ComAdobeGraniteAuthImsImplIMSProviderImplProperties comAdobeGraniteAuthImsImplIMSProviderImplProperties = (ComAdobeGraniteAuthImsImplIMSProviderImplProperties) o;
    return Objects.equals(this.oauthProviderId, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderId) &&
        Objects.equals(this.oauthProviderImsAuthorizationUrl, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsAuthorizationUrl) &&
        Objects.equals(this.oauthProviderImsTokenUrl, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsTokenUrl) &&
        Objects.equals(this.oauthProviderImsProfileUrl, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsProfileUrl) &&
        Objects.equals(this.oauthProviderImsExtendedDetailsUrls, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsExtendedDetailsUrls) &&
        Objects.equals(this.oauthProviderImsValidateTokenUrl, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsValidateTokenUrl) &&
        Objects.equals(this.oauthProviderImsSessionProperty, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsSessionProperty) &&
        Objects.equals(this.oauthProviderImsServiceTokenClientId, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsServiceTokenClientId) &&
        Objects.equals(this.oauthProviderImsServiceTokenClientSecret, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsServiceTokenClientSecret) &&
        Objects.equals(this.oauthProviderImsServiceToken, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsServiceToken) &&
        Objects.equals(this.imsOrgRef, comAdobeGraniteAuthImsImplIMSProviderImplProperties.imsOrgRef) &&
        Objects.equals(this.imsGroupMapping, comAdobeGraniteAuthImsImplIMSProviderImplProperties.imsGroupMapping) &&
        Objects.equals(this.oauthProviderImsOnlyLicenseGroup, comAdobeGraniteAuthImsImplIMSProviderImplProperties.oauthProviderImsOnlyLicenseGroup);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

