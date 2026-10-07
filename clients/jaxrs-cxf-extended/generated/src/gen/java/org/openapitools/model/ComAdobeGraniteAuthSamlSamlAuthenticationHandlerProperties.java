package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray path;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger serviceRanking;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString idpUrl;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString idpCertAlias;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean idpHttpRedirect;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString serviceProviderEntityId;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString assertionConsumerServiceURL;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString spPrivateKeyAlias;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString keyStorePassword;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString defaultRedirectUrl;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString userIDAttribute;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean useEncryption;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean createUser;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString userIntermediatePath;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean addGroupMemberships;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString groupMembershipAttribute;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray defaultGroups;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString nameIdFormat;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray synchronizeAttributes;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean handleLogout;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString logoutUrl;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clockTolerance;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString digestMethod;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString signatureMethod;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown identitySyncType;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString idpIdentifier;
 /**
  * Get path
  * @return path
  */
  @JsonProperty("path")
  public ConfigNodePropertyArray getPath() {
    return path;
  }

  /**
   * Sets the <code>path</code> property.
   */
 public void setPath(ConfigNodePropertyArray path) {
    this.path = path;
  }

  /**
   * Sets the <code>path</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties path(ConfigNodePropertyArray path) {
    this.path = path;
    return this;
  }

 /**
  * Get serviceRanking
  * @return serviceRanking
  */
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  /**
   * Sets the <code>serviceRanking</code> property.
   */
 public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  /**
   * Sets the <code>serviceRanking</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

 /**
  * Get idpUrl
  * @return idpUrl
  */
  @JsonProperty("idpUrl")
  public ConfigNodePropertyString getIdpUrl() {
    return idpUrl;
  }

  /**
   * Sets the <code>idpUrl</code> property.
   */
 public void setIdpUrl(ConfigNodePropertyString idpUrl) {
    this.idpUrl = idpUrl;
  }

  /**
   * Sets the <code>idpUrl</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties idpUrl(ConfigNodePropertyString idpUrl) {
    this.idpUrl = idpUrl;
    return this;
  }

 /**
  * Get idpCertAlias
  * @return idpCertAlias
  */
  @JsonProperty("idpCertAlias")
  public ConfigNodePropertyString getIdpCertAlias() {
    return idpCertAlias;
  }

  /**
   * Sets the <code>idpCertAlias</code> property.
   */
 public void setIdpCertAlias(ConfigNodePropertyString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
  }

  /**
   * Sets the <code>idpCertAlias</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties idpCertAlias(ConfigNodePropertyString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
    return this;
  }

 /**
  * Get idpHttpRedirect
  * @return idpHttpRedirect
  */
  @JsonProperty("idpHttpRedirect")
  public ConfigNodePropertyBoolean getIdpHttpRedirect() {
    return idpHttpRedirect;
  }

  /**
   * Sets the <code>idpHttpRedirect</code> property.
   */
 public void setIdpHttpRedirect(ConfigNodePropertyBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
  }

  /**
   * Sets the <code>idpHttpRedirect</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties idpHttpRedirect(ConfigNodePropertyBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
    return this;
  }

 /**
  * Get serviceProviderEntityId
  * @return serviceProviderEntityId
  */
  @JsonProperty("serviceProviderEntityId")
  public ConfigNodePropertyString getServiceProviderEntityId() {
    return serviceProviderEntityId;
  }

  /**
   * Sets the <code>serviceProviderEntityId</code> property.
   */
 public void setServiceProviderEntityId(ConfigNodePropertyString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
  }

  /**
   * Sets the <code>serviceProviderEntityId</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties serviceProviderEntityId(ConfigNodePropertyString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
    return this;
  }

 /**
  * Get assertionConsumerServiceURL
  * @return assertionConsumerServiceURL
  */
  @JsonProperty("assertionConsumerServiceURL")
  public ConfigNodePropertyString getAssertionConsumerServiceURL() {
    return assertionConsumerServiceURL;
  }

  /**
   * Sets the <code>assertionConsumerServiceURL</code> property.
   */
 public void setAssertionConsumerServiceURL(ConfigNodePropertyString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
  }

  /**
   * Sets the <code>assertionConsumerServiceURL</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties assertionConsumerServiceURL(ConfigNodePropertyString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
    return this;
  }

 /**
  * Get spPrivateKeyAlias
  * @return spPrivateKeyAlias
  */
  @JsonProperty("spPrivateKeyAlias")
  public ConfigNodePropertyString getSpPrivateKeyAlias() {
    return spPrivateKeyAlias;
  }

  /**
   * Sets the <code>spPrivateKeyAlias</code> property.
   */
 public void setSpPrivateKeyAlias(ConfigNodePropertyString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
  }

  /**
   * Sets the <code>spPrivateKeyAlias</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties spPrivateKeyAlias(ConfigNodePropertyString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
    return this;
  }

 /**
  * Get keyStorePassword
  * @return keyStorePassword
  */
  @JsonProperty("keyStorePassword")
  public ConfigNodePropertyString getKeyStorePassword() {
    return keyStorePassword;
  }

  /**
   * Sets the <code>keyStorePassword</code> property.
   */
 public void setKeyStorePassword(ConfigNodePropertyString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  /**
   * Sets the <code>keyStorePassword</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties keyStorePassword(ConfigNodePropertyString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
    return this;
  }

 /**
  * Get defaultRedirectUrl
  * @return defaultRedirectUrl
  */
  @JsonProperty("defaultRedirectUrl")
  public ConfigNodePropertyString getDefaultRedirectUrl() {
    return defaultRedirectUrl;
  }

  /**
   * Sets the <code>defaultRedirectUrl</code> property.
   */
 public void setDefaultRedirectUrl(ConfigNodePropertyString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
  }

  /**
   * Sets the <code>defaultRedirectUrl</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties defaultRedirectUrl(ConfigNodePropertyString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
    return this;
  }

 /**
  * Get userIDAttribute
  * @return userIDAttribute
  */
  @JsonProperty("userIDAttribute")
  public ConfigNodePropertyString getUserIDAttribute() {
    return userIDAttribute;
  }

  /**
   * Sets the <code>userIDAttribute</code> property.
   */
 public void setUserIDAttribute(ConfigNodePropertyString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
  }

  /**
   * Sets the <code>userIDAttribute</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties userIDAttribute(ConfigNodePropertyString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
    return this;
  }

 /**
  * Get useEncryption
  * @return useEncryption
  */
  @JsonProperty("useEncryption")
  public ConfigNodePropertyBoolean getUseEncryption() {
    return useEncryption;
  }

  /**
   * Sets the <code>useEncryption</code> property.
   */
 public void setUseEncryption(ConfigNodePropertyBoolean useEncryption) {
    this.useEncryption = useEncryption;
  }

  /**
   * Sets the <code>useEncryption</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties useEncryption(ConfigNodePropertyBoolean useEncryption) {
    this.useEncryption = useEncryption;
    return this;
  }

 /**
  * Get createUser
  * @return createUser
  */
  @JsonProperty("createUser")
  public ConfigNodePropertyBoolean getCreateUser() {
    return createUser;
  }

  /**
   * Sets the <code>createUser</code> property.
   */
 public void setCreateUser(ConfigNodePropertyBoolean createUser) {
    this.createUser = createUser;
  }

  /**
   * Sets the <code>createUser</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties createUser(ConfigNodePropertyBoolean createUser) {
    this.createUser = createUser;
    return this;
  }

 /**
  * Get userIntermediatePath
  * @return userIntermediatePath
  */
  @JsonProperty("userIntermediatePath")
  public ConfigNodePropertyString getUserIntermediatePath() {
    return userIntermediatePath;
  }

  /**
   * Sets the <code>userIntermediatePath</code> property.
   */
 public void setUserIntermediatePath(ConfigNodePropertyString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
  }

  /**
   * Sets the <code>userIntermediatePath</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties userIntermediatePath(ConfigNodePropertyString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
    return this;
  }

 /**
  * Get addGroupMemberships
  * @return addGroupMemberships
  */
  @JsonProperty("addGroupMemberships")
  public ConfigNodePropertyBoolean getAddGroupMemberships() {
    return addGroupMemberships;
  }

  /**
   * Sets the <code>addGroupMemberships</code> property.
   */
 public void setAddGroupMemberships(ConfigNodePropertyBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
  }

  /**
   * Sets the <code>addGroupMemberships</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties addGroupMemberships(ConfigNodePropertyBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
    return this;
  }

 /**
  * Get groupMembershipAttribute
  * @return groupMembershipAttribute
  */
  @JsonProperty("groupMembershipAttribute")
  public ConfigNodePropertyString getGroupMembershipAttribute() {
    return groupMembershipAttribute;
  }

  /**
   * Sets the <code>groupMembershipAttribute</code> property.
   */
 public void setGroupMembershipAttribute(ConfigNodePropertyString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
  }

  /**
   * Sets the <code>groupMembershipAttribute</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties groupMembershipAttribute(ConfigNodePropertyString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
    return this;
  }

 /**
  * Get defaultGroups
  * @return defaultGroups
  */
  @JsonProperty("defaultGroups")
  public ConfigNodePropertyArray getDefaultGroups() {
    return defaultGroups;
  }

  /**
   * Sets the <code>defaultGroups</code> property.
   */
 public void setDefaultGroups(ConfigNodePropertyArray defaultGroups) {
    this.defaultGroups = defaultGroups;
  }

  /**
   * Sets the <code>defaultGroups</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties defaultGroups(ConfigNodePropertyArray defaultGroups) {
    this.defaultGroups = defaultGroups;
    return this;
  }

 /**
  * Get nameIdFormat
  * @return nameIdFormat
  */
  @JsonProperty("nameIdFormat")
  public ConfigNodePropertyString getNameIdFormat() {
    return nameIdFormat;
  }

  /**
   * Sets the <code>nameIdFormat</code> property.
   */
 public void setNameIdFormat(ConfigNodePropertyString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
  }

  /**
   * Sets the <code>nameIdFormat</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties nameIdFormat(ConfigNodePropertyString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
    return this;
  }

 /**
  * Get synchronizeAttributes
  * @return synchronizeAttributes
  */
  @JsonProperty("synchronizeAttributes")
  public ConfigNodePropertyArray getSynchronizeAttributes() {
    return synchronizeAttributes;
  }

  /**
   * Sets the <code>synchronizeAttributes</code> property.
   */
 public void setSynchronizeAttributes(ConfigNodePropertyArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
  }

  /**
   * Sets the <code>synchronizeAttributes</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties synchronizeAttributes(ConfigNodePropertyArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
    return this;
  }

 /**
  * Get handleLogout
  * @return handleLogout
  */
  @JsonProperty("handleLogout")
  public ConfigNodePropertyBoolean getHandleLogout() {
    return handleLogout;
  }

  /**
   * Sets the <code>handleLogout</code> property.
   */
 public void setHandleLogout(ConfigNodePropertyBoolean handleLogout) {
    this.handleLogout = handleLogout;
  }

  /**
   * Sets the <code>handleLogout</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties handleLogout(ConfigNodePropertyBoolean handleLogout) {
    this.handleLogout = handleLogout;
    return this;
  }

 /**
  * Get logoutUrl
  * @return logoutUrl
  */
  @JsonProperty("logoutUrl")
  public ConfigNodePropertyString getLogoutUrl() {
    return logoutUrl;
  }

  /**
   * Sets the <code>logoutUrl</code> property.
   */
 public void setLogoutUrl(ConfigNodePropertyString logoutUrl) {
    this.logoutUrl = logoutUrl;
  }

  /**
   * Sets the <code>logoutUrl</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties logoutUrl(ConfigNodePropertyString logoutUrl) {
    this.logoutUrl = logoutUrl;
    return this;
  }

 /**
  * Get clockTolerance
  * @return clockTolerance
  */
  @JsonProperty("clockTolerance")
  public ConfigNodePropertyInteger getClockTolerance() {
    return clockTolerance;
  }

  /**
   * Sets the <code>clockTolerance</code> property.
   */
 public void setClockTolerance(ConfigNodePropertyInteger clockTolerance) {
    this.clockTolerance = clockTolerance;
  }

  /**
   * Sets the <code>clockTolerance</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties clockTolerance(ConfigNodePropertyInteger clockTolerance) {
    this.clockTolerance = clockTolerance;
    return this;
  }

 /**
  * Get digestMethod
  * @return digestMethod
  */
  @JsonProperty("digestMethod")
  public ConfigNodePropertyString getDigestMethod() {
    return digestMethod;
  }

  /**
   * Sets the <code>digestMethod</code> property.
   */
 public void setDigestMethod(ConfigNodePropertyString digestMethod) {
    this.digestMethod = digestMethod;
  }

  /**
   * Sets the <code>digestMethod</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties digestMethod(ConfigNodePropertyString digestMethod) {
    this.digestMethod = digestMethod;
    return this;
  }

 /**
  * Get signatureMethod
  * @return signatureMethod
  */
  @JsonProperty("signatureMethod")
  public ConfigNodePropertyString getSignatureMethod() {
    return signatureMethod;
  }

  /**
   * Sets the <code>signatureMethod</code> property.
   */
 public void setSignatureMethod(ConfigNodePropertyString signatureMethod) {
    this.signatureMethod = signatureMethod;
  }

  /**
   * Sets the <code>signatureMethod</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties signatureMethod(ConfigNodePropertyString signatureMethod) {
    this.signatureMethod = signatureMethod;
    return this;
  }

 /**
  * Get identitySyncType
  * @return identitySyncType
  */
  @JsonProperty("identitySyncType")
  public ConfigNodePropertyDropDown getIdentitySyncType() {
    return identitySyncType;
  }

  /**
   * Sets the <code>identitySyncType</code> property.
   */
 public void setIdentitySyncType(ConfigNodePropertyDropDown identitySyncType) {
    this.identitySyncType = identitySyncType;
  }

  /**
   * Sets the <code>identitySyncType</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties identitySyncType(ConfigNodePropertyDropDown identitySyncType) {
    this.identitySyncType = identitySyncType;
    return this;
  }

 /**
  * Get idpIdentifier
  * @return idpIdentifier
  */
  @JsonProperty("idpIdentifier")
  public ConfigNodePropertyString getIdpIdentifier() {
    return idpIdentifier;
  }

  /**
   * Sets the <code>idpIdentifier</code> property.
   */
 public void setIdpIdentifier(ConfigNodePropertyString idpIdentifier) {
    this.idpIdentifier = idpIdentifier;
  }

  /**
   * Sets the <code>idpIdentifier</code> property.
   */
  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties idpIdentifier(ConfigNodePropertyString idpIdentifier) {
    this.idpIdentifier = idpIdentifier;
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
    ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties = (ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) o;
    return Objects.equals(this.path, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.path) &&
        Objects.equals(this.serviceRanking, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.serviceRanking) &&
        Objects.equals(this.idpUrl, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.idpUrl) &&
        Objects.equals(this.idpCertAlias, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.idpCertAlias) &&
        Objects.equals(this.idpHttpRedirect, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.idpHttpRedirect) &&
        Objects.equals(this.serviceProviderEntityId, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.serviceProviderEntityId) &&
        Objects.equals(this.assertionConsumerServiceURL, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.assertionConsumerServiceURL) &&
        Objects.equals(this.spPrivateKeyAlias, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.spPrivateKeyAlias) &&
        Objects.equals(this.keyStorePassword, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.keyStorePassword) &&
        Objects.equals(this.defaultRedirectUrl, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.defaultRedirectUrl) &&
        Objects.equals(this.userIDAttribute, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.userIDAttribute) &&
        Objects.equals(this.useEncryption, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.useEncryption) &&
        Objects.equals(this.createUser, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.createUser) &&
        Objects.equals(this.userIntermediatePath, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.userIntermediatePath) &&
        Objects.equals(this.addGroupMemberships, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.addGroupMemberships) &&
        Objects.equals(this.groupMembershipAttribute, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.groupMembershipAttribute) &&
        Objects.equals(this.defaultGroups, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.defaultGroups) &&
        Objects.equals(this.nameIdFormat, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.nameIdFormat) &&
        Objects.equals(this.synchronizeAttributes, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.synchronizeAttributes) &&
        Objects.equals(this.handleLogout, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.handleLogout) &&
        Objects.equals(this.logoutUrl, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.logoutUrl) &&
        Objects.equals(this.clockTolerance, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.clockTolerance) &&
        Objects.equals(this.digestMethod, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.digestMethod) &&
        Objects.equals(this.signatureMethod, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.signatureMethod) &&
        Objects.equals(this.identitySyncType, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.identitySyncType) &&
        Objects.equals(this.idpIdentifier, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.idpIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, userIntermediatePath, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, identitySyncType, idpIdentifier);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

