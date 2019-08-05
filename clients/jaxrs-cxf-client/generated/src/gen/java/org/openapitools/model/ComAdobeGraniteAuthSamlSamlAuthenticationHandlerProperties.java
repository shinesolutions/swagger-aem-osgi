package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray path = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger serviceRanking = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString idpUrl = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString idpCertAlias = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean idpHttpRedirect = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString serviceProviderEntityId = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString assertionConsumerServiceURL = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString spPrivateKeyAlias = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString keyStorePassword = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString defaultRedirectUrl = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString userIDAttribute = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean useEncryption = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean createUser = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString userIntermediatePath = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean addGroupMemberships = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString groupMembershipAttribute = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray defaultGroups = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString nameIdFormat = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray synchronizeAttributes = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean handleLogout = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString logoutUrl = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger clockTolerance = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString digestMethod = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString signatureMethod = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown identitySyncType = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString idpIdentifier = null;
 /**
   * Get path
   * @return path
  **/
  @JsonProperty("path")
  public ConfigNodePropertyArray getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyArray path) {
    this.path = path;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties path(ConfigNodePropertyArray path) {
    this.path = path;
    return this;
  }

 /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

 /**
   * Get idpUrl
   * @return idpUrl
  **/
  @JsonProperty("idpUrl")
  public ConfigNodePropertyString getIdpUrl() {
    return idpUrl;
  }

  public void setIdpUrl(ConfigNodePropertyString idpUrl) {
    this.idpUrl = idpUrl;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties idpUrl(ConfigNodePropertyString idpUrl) {
    this.idpUrl = idpUrl;
    return this;
  }

 /**
   * Get idpCertAlias
   * @return idpCertAlias
  **/
  @JsonProperty("idpCertAlias")
  public ConfigNodePropertyString getIdpCertAlias() {
    return idpCertAlias;
  }

  public void setIdpCertAlias(ConfigNodePropertyString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties idpCertAlias(ConfigNodePropertyString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
    return this;
  }

 /**
   * Get idpHttpRedirect
   * @return idpHttpRedirect
  **/
  @JsonProperty("idpHttpRedirect")
  public ConfigNodePropertyBoolean getIdpHttpRedirect() {
    return idpHttpRedirect;
  }

  public void setIdpHttpRedirect(ConfigNodePropertyBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties idpHttpRedirect(ConfigNodePropertyBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
    return this;
  }

 /**
   * Get serviceProviderEntityId
   * @return serviceProviderEntityId
  **/
  @JsonProperty("serviceProviderEntityId")
  public ConfigNodePropertyString getServiceProviderEntityId() {
    return serviceProviderEntityId;
  }

  public void setServiceProviderEntityId(ConfigNodePropertyString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties serviceProviderEntityId(ConfigNodePropertyString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
    return this;
  }

 /**
   * Get assertionConsumerServiceURL
   * @return assertionConsumerServiceURL
  **/
  @JsonProperty("assertionConsumerServiceURL")
  public ConfigNodePropertyString getAssertionConsumerServiceURL() {
    return assertionConsumerServiceURL;
  }

  public void setAssertionConsumerServiceURL(ConfigNodePropertyString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties assertionConsumerServiceURL(ConfigNodePropertyString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
    return this;
  }

 /**
   * Get spPrivateKeyAlias
   * @return spPrivateKeyAlias
  **/
  @JsonProperty("spPrivateKeyAlias")
  public ConfigNodePropertyString getSpPrivateKeyAlias() {
    return spPrivateKeyAlias;
  }

  public void setSpPrivateKeyAlias(ConfigNodePropertyString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties spPrivateKeyAlias(ConfigNodePropertyString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
    return this;
  }

 /**
   * Get keyStorePassword
   * @return keyStorePassword
  **/
  @JsonProperty("keyStorePassword")
  public ConfigNodePropertyString getKeyStorePassword() {
    return keyStorePassword;
  }

  public void setKeyStorePassword(ConfigNodePropertyString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties keyStorePassword(ConfigNodePropertyString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
    return this;
  }

 /**
   * Get defaultRedirectUrl
   * @return defaultRedirectUrl
  **/
  @JsonProperty("defaultRedirectUrl")
  public ConfigNodePropertyString getDefaultRedirectUrl() {
    return defaultRedirectUrl;
  }

  public void setDefaultRedirectUrl(ConfigNodePropertyString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties defaultRedirectUrl(ConfigNodePropertyString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
    return this;
  }

 /**
   * Get userIDAttribute
   * @return userIDAttribute
  **/
  @JsonProperty("userIDAttribute")
  public ConfigNodePropertyString getUserIDAttribute() {
    return userIDAttribute;
  }

  public void setUserIDAttribute(ConfigNodePropertyString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties userIDAttribute(ConfigNodePropertyString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
    return this;
  }

 /**
   * Get useEncryption
   * @return useEncryption
  **/
  @JsonProperty("useEncryption")
  public ConfigNodePropertyBoolean getUseEncryption() {
    return useEncryption;
  }

  public void setUseEncryption(ConfigNodePropertyBoolean useEncryption) {
    this.useEncryption = useEncryption;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties useEncryption(ConfigNodePropertyBoolean useEncryption) {
    this.useEncryption = useEncryption;
    return this;
  }

 /**
   * Get createUser
   * @return createUser
  **/
  @JsonProperty("createUser")
  public ConfigNodePropertyBoolean getCreateUser() {
    return createUser;
  }

  public void setCreateUser(ConfigNodePropertyBoolean createUser) {
    this.createUser = createUser;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties createUser(ConfigNodePropertyBoolean createUser) {
    this.createUser = createUser;
    return this;
  }

 /**
   * Get userIntermediatePath
   * @return userIntermediatePath
  **/
  @JsonProperty("userIntermediatePath")
  public ConfigNodePropertyString getUserIntermediatePath() {
    return userIntermediatePath;
  }

  public void setUserIntermediatePath(ConfigNodePropertyString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties userIntermediatePath(ConfigNodePropertyString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
    return this;
  }

 /**
   * Get addGroupMemberships
   * @return addGroupMemberships
  **/
  @JsonProperty("addGroupMemberships")
  public ConfigNodePropertyBoolean getAddGroupMemberships() {
    return addGroupMemberships;
  }

  public void setAddGroupMemberships(ConfigNodePropertyBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties addGroupMemberships(ConfigNodePropertyBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
    return this;
  }

 /**
   * Get groupMembershipAttribute
   * @return groupMembershipAttribute
  **/
  @JsonProperty("groupMembershipAttribute")
  public ConfigNodePropertyString getGroupMembershipAttribute() {
    return groupMembershipAttribute;
  }

  public void setGroupMembershipAttribute(ConfigNodePropertyString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties groupMembershipAttribute(ConfigNodePropertyString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
    return this;
  }

 /**
   * Get defaultGroups
   * @return defaultGroups
  **/
  @JsonProperty("defaultGroups")
  public ConfigNodePropertyArray getDefaultGroups() {
    return defaultGroups;
  }

  public void setDefaultGroups(ConfigNodePropertyArray defaultGroups) {
    this.defaultGroups = defaultGroups;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties defaultGroups(ConfigNodePropertyArray defaultGroups) {
    this.defaultGroups = defaultGroups;
    return this;
  }

 /**
   * Get nameIdFormat
   * @return nameIdFormat
  **/
  @JsonProperty("nameIdFormat")
  public ConfigNodePropertyString getNameIdFormat() {
    return nameIdFormat;
  }

  public void setNameIdFormat(ConfigNodePropertyString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties nameIdFormat(ConfigNodePropertyString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
    return this;
  }

 /**
   * Get synchronizeAttributes
   * @return synchronizeAttributes
  **/
  @JsonProperty("synchronizeAttributes")
  public ConfigNodePropertyArray getSynchronizeAttributes() {
    return synchronizeAttributes;
  }

  public void setSynchronizeAttributes(ConfigNodePropertyArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties synchronizeAttributes(ConfigNodePropertyArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
    return this;
  }

 /**
   * Get handleLogout
   * @return handleLogout
  **/
  @JsonProperty("handleLogout")
  public ConfigNodePropertyBoolean getHandleLogout() {
    return handleLogout;
  }

  public void setHandleLogout(ConfigNodePropertyBoolean handleLogout) {
    this.handleLogout = handleLogout;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties handleLogout(ConfigNodePropertyBoolean handleLogout) {
    this.handleLogout = handleLogout;
    return this;
  }

 /**
   * Get logoutUrl
   * @return logoutUrl
  **/
  @JsonProperty("logoutUrl")
  public ConfigNodePropertyString getLogoutUrl() {
    return logoutUrl;
  }

  public void setLogoutUrl(ConfigNodePropertyString logoutUrl) {
    this.logoutUrl = logoutUrl;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties logoutUrl(ConfigNodePropertyString logoutUrl) {
    this.logoutUrl = logoutUrl;
    return this;
  }

 /**
   * Get clockTolerance
   * @return clockTolerance
  **/
  @JsonProperty("clockTolerance")
  public ConfigNodePropertyInteger getClockTolerance() {
    return clockTolerance;
  }

  public void setClockTolerance(ConfigNodePropertyInteger clockTolerance) {
    this.clockTolerance = clockTolerance;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties clockTolerance(ConfigNodePropertyInteger clockTolerance) {
    this.clockTolerance = clockTolerance;
    return this;
  }

 /**
   * Get digestMethod
   * @return digestMethod
  **/
  @JsonProperty("digestMethod")
  public ConfigNodePropertyString getDigestMethod() {
    return digestMethod;
  }

  public void setDigestMethod(ConfigNodePropertyString digestMethod) {
    this.digestMethod = digestMethod;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties digestMethod(ConfigNodePropertyString digestMethod) {
    this.digestMethod = digestMethod;
    return this;
  }

 /**
   * Get signatureMethod
   * @return signatureMethod
  **/
  @JsonProperty("signatureMethod")
  public ConfigNodePropertyString getSignatureMethod() {
    return signatureMethod;
  }

  public void setSignatureMethod(ConfigNodePropertyString signatureMethod) {
    this.signatureMethod = signatureMethod;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties signatureMethod(ConfigNodePropertyString signatureMethod) {
    this.signatureMethod = signatureMethod;
    return this;
  }

 /**
   * Get identitySyncType
   * @return identitySyncType
  **/
  @JsonProperty("identitySyncType")
  public ConfigNodePropertyDropDown getIdentitySyncType() {
    return identitySyncType;
  }

  public void setIdentitySyncType(ConfigNodePropertyDropDown identitySyncType) {
    this.identitySyncType = identitySyncType;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties identitySyncType(ConfigNodePropertyDropDown identitySyncType) {
    this.identitySyncType = identitySyncType;
    return this;
  }

 /**
   * Get idpIdentifier
   * @return idpIdentifier
  **/
  @JsonProperty("idpIdentifier")
  public ConfigNodePropertyString getIdpIdentifier() {
    return idpIdentifier;
  }

  public void setIdpIdentifier(ConfigNodePropertyString idpIdentifier) {
    this.idpIdentifier = idpIdentifier;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties idpIdentifier(ConfigNodePropertyString idpIdentifier) {
    this.idpIdentifier = idpIdentifier;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    idpUrl: ").append(toIndentedString(idpUrl)).append("\n");
    sb.append("    idpCertAlias: ").append(toIndentedString(idpCertAlias)).append("\n");
    sb.append("    idpHttpRedirect: ").append(toIndentedString(idpHttpRedirect)).append("\n");
    sb.append("    serviceProviderEntityId: ").append(toIndentedString(serviceProviderEntityId)).append("\n");
    sb.append("    assertionConsumerServiceURL: ").append(toIndentedString(assertionConsumerServiceURL)).append("\n");
    sb.append("    spPrivateKeyAlias: ").append(toIndentedString(spPrivateKeyAlias)).append("\n");
    sb.append("    keyStorePassword: ").append(toIndentedString(keyStorePassword)).append("\n");
    sb.append("    defaultRedirectUrl: ").append(toIndentedString(defaultRedirectUrl)).append("\n");
    sb.append("    userIDAttribute: ").append(toIndentedString(userIDAttribute)).append("\n");
    sb.append("    useEncryption: ").append(toIndentedString(useEncryption)).append("\n");
    sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
    sb.append("    userIntermediatePath: ").append(toIndentedString(userIntermediatePath)).append("\n");
    sb.append("    addGroupMemberships: ").append(toIndentedString(addGroupMemberships)).append("\n");
    sb.append("    groupMembershipAttribute: ").append(toIndentedString(groupMembershipAttribute)).append("\n");
    sb.append("    defaultGroups: ").append(toIndentedString(defaultGroups)).append("\n");
    sb.append("    nameIdFormat: ").append(toIndentedString(nameIdFormat)).append("\n");
    sb.append("    synchronizeAttributes: ").append(toIndentedString(synchronizeAttributes)).append("\n");
    sb.append("    handleLogout: ").append(toIndentedString(handleLogout)).append("\n");
    sb.append("    logoutUrl: ").append(toIndentedString(logoutUrl)).append("\n");
    sb.append("    clockTolerance: ").append(toIndentedString(clockTolerance)).append("\n");
    sb.append("    digestMethod: ").append(toIndentedString(digestMethod)).append("\n");
    sb.append("    signatureMethod: ").append(toIndentedString(signatureMethod)).append("\n");
    sb.append("    identitySyncType: ").append(toIndentedString(identitySyncType)).append("\n");
    sb.append("    idpIdentifier: ").append(toIndentedString(idpIdentifier)).append("\n");
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

