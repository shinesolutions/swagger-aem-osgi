package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("path")
  private ConfigNodePropertyArray path;

  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking;

  @JsonProperty("idpUrl")
  private ConfigNodePropertyString idpUrl;

  @JsonProperty("idpCertAlias")
  private ConfigNodePropertyString idpCertAlias;

  @JsonProperty("idpHttpRedirect")
  private ConfigNodePropertyBoolean idpHttpRedirect;

  @JsonProperty("serviceProviderEntityId")
  private ConfigNodePropertyString serviceProviderEntityId;

  @JsonProperty("assertionConsumerServiceURL")
  private ConfigNodePropertyString assertionConsumerServiceURL;

  @JsonProperty("spPrivateKeyAlias")
  private ConfigNodePropertyString spPrivateKeyAlias;

  @JsonProperty("keyStorePassword")
  private ConfigNodePropertyString keyStorePassword;

  @JsonProperty("defaultRedirectUrl")
  private ConfigNodePropertyString defaultRedirectUrl;

  @JsonProperty("userIDAttribute")
  private ConfigNodePropertyString userIDAttribute;

  @JsonProperty("useEncryption")
  private ConfigNodePropertyBoolean useEncryption;

  @JsonProperty("createUser")
  private ConfigNodePropertyBoolean createUser;

  @JsonProperty("userIntermediatePath")
  private ConfigNodePropertyString userIntermediatePath;

  @JsonProperty("addGroupMemberships")
  private ConfigNodePropertyBoolean addGroupMemberships;

  @JsonProperty("groupMembershipAttribute")
  private ConfigNodePropertyString groupMembershipAttribute;

  @JsonProperty("defaultGroups")
  private ConfigNodePropertyArray defaultGroups;

  @JsonProperty("nameIdFormat")
  private ConfigNodePropertyString nameIdFormat;

  @JsonProperty("synchronizeAttributes")
  private ConfigNodePropertyArray synchronizeAttributes;

  @JsonProperty("handleLogout")
  private ConfigNodePropertyBoolean handleLogout;

  @JsonProperty("logoutUrl")
  private ConfigNodePropertyString logoutUrl;

  @JsonProperty("clockTolerance")
  private ConfigNodePropertyInteger clockTolerance;

  @JsonProperty("digestMethod")
  private ConfigNodePropertyString digestMethod;

  @JsonProperty("signatureMethod")
  private ConfigNodePropertyString signatureMethod;

  @JsonProperty("identitySyncType")
  private ConfigNodePropertyDropDown identitySyncType;

  @JsonProperty("idpIdentifier")
  private ConfigNodePropertyString idpIdentifier;

  /**
   * 
   * @return path
   */
  public ConfigNodePropertyArray getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyArray path) {
    this.path = path;
  }

  /**
   * 
   * @return serviceRanking
   */
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  /**
   * 
   * @return idpUrl
   */
  public ConfigNodePropertyString getIdpUrl() {
    return idpUrl;
  }

  public void setIdpUrl(ConfigNodePropertyString idpUrl) {
    this.idpUrl = idpUrl;
  }

  /**
   * 
   * @return idpCertAlias
   */
  public ConfigNodePropertyString getIdpCertAlias() {
    return idpCertAlias;
  }

  public void setIdpCertAlias(ConfigNodePropertyString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
  }

  /**
   * 
   * @return idpHttpRedirect
   */
  public ConfigNodePropertyBoolean getIdpHttpRedirect() {
    return idpHttpRedirect;
  }

  public void setIdpHttpRedirect(ConfigNodePropertyBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
  }

  /**
   * 
   * @return serviceProviderEntityId
   */
  public ConfigNodePropertyString getServiceProviderEntityId() {
    return serviceProviderEntityId;
  }

  public void setServiceProviderEntityId(ConfigNodePropertyString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
  }

  /**
   * 
   * @return assertionConsumerServiceURL
   */
  public ConfigNodePropertyString getAssertionConsumerServiceURL() {
    return assertionConsumerServiceURL;
  }

  public void setAssertionConsumerServiceURL(ConfigNodePropertyString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
  }

  /**
   * 
   * @return spPrivateKeyAlias
   */
  public ConfigNodePropertyString getSpPrivateKeyAlias() {
    return spPrivateKeyAlias;
  }

  public void setSpPrivateKeyAlias(ConfigNodePropertyString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
  }

  /**
   * 
   * @return keyStorePassword
   */
  public ConfigNodePropertyString getKeyStorePassword() {
    return keyStorePassword;
  }

  public void setKeyStorePassword(ConfigNodePropertyString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  /**
   * 
   * @return defaultRedirectUrl
   */
  public ConfigNodePropertyString getDefaultRedirectUrl() {
    return defaultRedirectUrl;
  }

  public void setDefaultRedirectUrl(ConfigNodePropertyString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
  }

  /**
   * 
   * @return userIDAttribute
   */
  public ConfigNodePropertyString getUserIDAttribute() {
    return userIDAttribute;
  }

  public void setUserIDAttribute(ConfigNodePropertyString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
  }

  /**
   * 
   * @return useEncryption
   */
  public ConfigNodePropertyBoolean getUseEncryption() {
    return useEncryption;
  }

  public void setUseEncryption(ConfigNodePropertyBoolean useEncryption) {
    this.useEncryption = useEncryption;
  }

  /**
   * 
   * @return createUser
   */
  public ConfigNodePropertyBoolean getCreateUser() {
    return createUser;
  }

  public void setCreateUser(ConfigNodePropertyBoolean createUser) {
    this.createUser = createUser;
  }

  /**
   * 
   * @return userIntermediatePath
   */
  public ConfigNodePropertyString getUserIntermediatePath() {
    return userIntermediatePath;
  }

  public void setUserIntermediatePath(ConfigNodePropertyString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
  }

  /**
   * 
   * @return addGroupMemberships
   */
  public ConfigNodePropertyBoolean getAddGroupMemberships() {
    return addGroupMemberships;
  }

  public void setAddGroupMemberships(ConfigNodePropertyBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
  }

  /**
   * 
   * @return groupMembershipAttribute
   */
  public ConfigNodePropertyString getGroupMembershipAttribute() {
    return groupMembershipAttribute;
  }

  public void setGroupMembershipAttribute(ConfigNodePropertyString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
  }

  /**
   * 
   * @return defaultGroups
   */
  public ConfigNodePropertyArray getDefaultGroups() {
    return defaultGroups;
  }

  public void setDefaultGroups(ConfigNodePropertyArray defaultGroups) {
    this.defaultGroups = defaultGroups;
  }

  /**
   * 
   * @return nameIdFormat
   */
  public ConfigNodePropertyString getNameIdFormat() {
    return nameIdFormat;
  }

  public void setNameIdFormat(ConfigNodePropertyString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
  }

  /**
   * 
   * @return synchronizeAttributes
   */
  public ConfigNodePropertyArray getSynchronizeAttributes() {
    return synchronizeAttributes;
  }

  public void setSynchronizeAttributes(ConfigNodePropertyArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
  }

  /**
   * 
   * @return handleLogout
   */
  public ConfigNodePropertyBoolean getHandleLogout() {
    return handleLogout;
  }

  public void setHandleLogout(ConfigNodePropertyBoolean handleLogout) {
    this.handleLogout = handleLogout;
  }

  /**
   * 
   * @return logoutUrl
   */
  public ConfigNodePropertyString getLogoutUrl() {
    return logoutUrl;
  }

  public void setLogoutUrl(ConfigNodePropertyString logoutUrl) {
    this.logoutUrl = logoutUrl;
  }

  /**
   * 
   * @return clockTolerance
   */
  public ConfigNodePropertyInteger getClockTolerance() {
    return clockTolerance;
  }

  public void setClockTolerance(ConfigNodePropertyInteger clockTolerance) {
    this.clockTolerance = clockTolerance;
  }

  /**
   * 
   * @return digestMethod
   */
  public ConfigNodePropertyString getDigestMethod() {
    return digestMethod;
  }

  public void setDigestMethod(ConfigNodePropertyString digestMethod) {
    this.digestMethod = digestMethod;
  }

  /**
   * 
   * @return signatureMethod
   */
  public ConfigNodePropertyString getSignatureMethod() {
    return signatureMethod;
  }

  public void setSignatureMethod(ConfigNodePropertyString signatureMethod) {
    this.signatureMethod = signatureMethod;
  }

  /**
   * 
   * @return identitySyncType
   */
  public ConfigNodePropertyDropDown getIdentitySyncType() {
    return identitySyncType;
  }

  public void setIdentitySyncType(ConfigNodePropertyDropDown identitySyncType) {
    this.identitySyncType = identitySyncType;
  }

  /**
   * 
   * @return idpIdentifier
   */
  public ConfigNodePropertyString getIdpIdentifier() {
    return idpIdentifier;
  }

  public void setIdpIdentifier(ConfigNodePropertyString idpIdentifier) {
    this.idpIdentifier = idpIdentifier;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
