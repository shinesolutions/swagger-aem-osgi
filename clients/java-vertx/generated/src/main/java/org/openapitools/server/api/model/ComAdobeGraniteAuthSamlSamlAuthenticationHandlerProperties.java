package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties   {
  
  private ConfigNodePropertyArray path = null;
  private ConfigNodePropertyInteger serviceRanking = null;
  private ConfigNodePropertyString idpUrl = null;
  private ConfigNodePropertyString idpCertAlias = null;
  private ConfigNodePropertyBoolean idpHttpRedirect = null;
  private ConfigNodePropertyString serviceProviderEntityId = null;
  private ConfigNodePropertyString assertionConsumerServiceURL = null;
  private ConfigNodePropertyString spPrivateKeyAlias = null;
  private ConfigNodePropertyString keyStorePassword = null;
  private ConfigNodePropertyString defaultRedirectUrl = null;
  private ConfigNodePropertyString userIDAttribute = null;
  private ConfigNodePropertyBoolean useEncryption = null;
  private ConfigNodePropertyBoolean createUser = null;
  private ConfigNodePropertyString userIntermediatePath = null;
  private ConfigNodePropertyBoolean addGroupMemberships = null;
  private ConfigNodePropertyString groupMembershipAttribute = null;
  private ConfigNodePropertyArray defaultGroups = null;
  private ConfigNodePropertyString nameIdFormat = null;
  private ConfigNodePropertyArray synchronizeAttributes = null;
  private ConfigNodePropertyBoolean handleLogout = null;
  private ConfigNodePropertyString logoutUrl = null;
  private ConfigNodePropertyInteger clockTolerance = null;
  private ConfigNodePropertyString digestMethod = null;
  private ConfigNodePropertyString signatureMethod = null;
  private ConfigNodePropertyDropDown identitySyncType = null;
  private ConfigNodePropertyString idpIdentifier = null;

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties () {

  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties (ConfigNodePropertyArray path, ConfigNodePropertyInteger serviceRanking, ConfigNodePropertyString idpUrl, ConfigNodePropertyString idpCertAlias, ConfigNodePropertyBoolean idpHttpRedirect, ConfigNodePropertyString serviceProviderEntityId, ConfigNodePropertyString assertionConsumerServiceURL, ConfigNodePropertyString spPrivateKeyAlias, ConfigNodePropertyString keyStorePassword, ConfigNodePropertyString defaultRedirectUrl, ConfigNodePropertyString userIDAttribute, ConfigNodePropertyBoolean useEncryption, ConfigNodePropertyBoolean createUser, ConfigNodePropertyString userIntermediatePath, ConfigNodePropertyBoolean addGroupMemberships, ConfigNodePropertyString groupMembershipAttribute, ConfigNodePropertyArray defaultGroups, ConfigNodePropertyString nameIdFormat, ConfigNodePropertyArray synchronizeAttributes, ConfigNodePropertyBoolean handleLogout, ConfigNodePropertyString logoutUrl, ConfigNodePropertyInteger clockTolerance, ConfigNodePropertyString digestMethod, ConfigNodePropertyString signatureMethod, ConfigNodePropertyDropDown identitySyncType, ConfigNodePropertyString idpIdentifier) {
    this.path = path;
    this.serviceRanking = serviceRanking;
    this.idpUrl = idpUrl;
    this.idpCertAlias = idpCertAlias;
    this.idpHttpRedirect = idpHttpRedirect;
    this.serviceProviderEntityId = serviceProviderEntityId;
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
    this.spPrivateKeyAlias = spPrivateKeyAlias;
    this.keyStorePassword = keyStorePassword;
    this.defaultRedirectUrl = defaultRedirectUrl;
    this.userIDAttribute = userIDAttribute;
    this.useEncryption = useEncryption;
    this.createUser = createUser;
    this.userIntermediatePath = userIntermediatePath;
    this.addGroupMemberships = addGroupMemberships;
    this.groupMembershipAttribute = groupMembershipAttribute;
    this.defaultGroups = defaultGroups;
    this.nameIdFormat = nameIdFormat;
    this.synchronizeAttributes = synchronizeAttributes;
    this.handleLogout = handleLogout;
    this.logoutUrl = logoutUrl;
    this.clockTolerance = clockTolerance;
    this.digestMethod = digestMethod;
    this.signatureMethod = signatureMethod;
    this.identitySyncType = identitySyncType;
    this.idpIdentifier = idpIdentifier;
  }

    
  @JsonProperty("path")
  public ConfigNodePropertyArray getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyArray path) {
    this.path = path;
  }

    
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

    
  @JsonProperty("idpUrl")
  public ConfigNodePropertyString getIdpUrl() {
    return idpUrl;
  }
  public void setIdpUrl(ConfigNodePropertyString idpUrl) {
    this.idpUrl = idpUrl;
  }

    
  @JsonProperty("idpCertAlias")
  public ConfigNodePropertyString getIdpCertAlias() {
    return idpCertAlias;
  }
  public void setIdpCertAlias(ConfigNodePropertyString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
  }

    
  @JsonProperty("idpHttpRedirect")
  public ConfigNodePropertyBoolean getIdpHttpRedirect() {
    return idpHttpRedirect;
  }
  public void setIdpHttpRedirect(ConfigNodePropertyBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
  }

    
  @JsonProperty("serviceProviderEntityId")
  public ConfigNodePropertyString getServiceProviderEntityId() {
    return serviceProviderEntityId;
  }
  public void setServiceProviderEntityId(ConfigNodePropertyString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
  }

    
  @JsonProperty("assertionConsumerServiceURL")
  public ConfigNodePropertyString getAssertionConsumerServiceURL() {
    return assertionConsumerServiceURL;
  }
  public void setAssertionConsumerServiceURL(ConfigNodePropertyString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
  }

    
  @JsonProperty("spPrivateKeyAlias")
  public ConfigNodePropertyString getSpPrivateKeyAlias() {
    return spPrivateKeyAlias;
  }
  public void setSpPrivateKeyAlias(ConfigNodePropertyString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
  }

    
  @JsonProperty("keyStorePassword")
  public ConfigNodePropertyString getKeyStorePassword() {
    return keyStorePassword;
  }
  public void setKeyStorePassword(ConfigNodePropertyString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

    
  @JsonProperty("defaultRedirectUrl")
  public ConfigNodePropertyString getDefaultRedirectUrl() {
    return defaultRedirectUrl;
  }
  public void setDefaultRedirectUrl(ConfigNodePropertyString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
  }

    
  @JsonProperty("userIDAttribute")
  public ConfigNodePropertyString getUserIDAttribute() {
    return userIDAttribute;
  }
  public void setUserIDAttribute(ConfigNodePropertyString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
  }

    
  @JsonProperty("useEncryption")
  public ConfigNodePropertyBoolean getUseEncryption() {
    return useEncryption;
  }
  public void setUseEncryption(ConfigNodePropertyBoolean useEncryption) {
    this.useEncryption = useEncryption;
  }

    
  @JsonProperty("createUser")
  public ConfigNodePropertyBoolean getCreateUser() {
    return createUser;
  }
  public void setCreateUser(ConfigNodePropertyBoolean createUser) {
    this.createUser = createUser;
  }

    
  @JsonProperty("userIntermediatePath")
  public ConfigNodePropertyString getUserIntermediatePath() {
    return userIntermediatePath;
  }
  public void setUserIntermediatePath(ConfigNodePropertyString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
  }

    
  @JsonProperty("addGroupMemberships")
  public ConfigNodePropertyBoolean getAddGroupMemberships() {
    return addGroupMemberships;
  }
  public void setAddGroupMemberships(ConfigNodePropertyBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
  }

    
  @JsonProperty("groupMembershipAttribute")
  public ConfigNodePropertyString getGroupMembershipAttribute() {
    return groupMembershipAttribute;
  }
  public void setGroupMembershipAttribute(ConfigNodePropertyString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
  }

    
  @JsonProperty("defaultGroups")
  public ConfigNodePropertyArray getDefaultGroups() {
    return defaultGroups;
  }
  public void setDefaultGroups(ConfigNodePropertyArray defaultGroups) {
    this.defaultGroups = defaultGroups;
  }

    
  @JsonProperty("nameIdFormat")
  public ConfigNodePropertyString getNameIdFormat() {
    return nameIdFormat;
  }
  public void setNameIdFormat(ConfigNodePropertyString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
  }

    
  @JsonProperty("synchronizeAttributes")
  public ConfigNodePropertyArray getSynchronizeAttributes() {
    return synchronizeAttributes;
  }
  public void setSynchronizeAttributes(ConfigNodePropertyArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
  }

    
  @JsonProperty("handleLogout")
  public ConfigNodePropertyBoolean getHandleLogout() {
    return handleLogout;
  }
  public void setHandleLogout(ConfigNodePropertyBoolean handleLogout) {
    this.handleLogout = handleLogout;
  }

    
  @JsonProperty("logoutUrl")
  public ConfigNodePropertyString getLogoutUrl() {
    return logoutUrl;
  }
  public void setLogoutUrl(ConfigNodePropertyString logoutUrl) {
    this.logoutUrl = logoutUrl;
  }

    
  @JsonProperty("clockTolerance")
  public ConfigNodePropertyInteger getClockTolerance() {
    return clockTolerance;
  }
  public void setClockTolerance(ConfigNodePropertyInteger clockTolerance) {
    this.clockTolerance = clockTolerance;
  }

    
  @JsonProperty("digestMethod")
  public ConfigNodePropertyString getDigestMethod() {
    return digestMethod;
  }
  public void setDigestMethod(ConfigNodePropertyString digestMethod) {
    this.digestMethod = digestMethod;
  }

    
  @JsonProperty("signatureMethod")
  public ConfigNodePropertyString getSignatureMethod() {
    return signatureMethod;
  }
  public void setSignatureMethod(ConfigNodePropertyString signatureMethod) {
    this.signatureMethod = signatureMethod;
  }

    
  @JsonProperty("identitySyncType")
  public ConfigNodePropertyDropDown getIdentitySyncType() {
    return identitySyncType;
  }
  public void setIdentitySyncType(ConfigNodePropertyDropDown identitySyncType) {
    this.identitySyncType = identitySyncType;
  }

    
  @JsonProperty("idpIdentifier")
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
    return Objects.equals(path, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.path) &&
        Objects.equals(serviceRanking, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.serviceRanking) &&
        Objects.equals(idpUrl, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.idpUrl) &&
        Objects.equals(idpCertAlias, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.idpCertAlias) &&
        Objects.equals(idpHttpRedirect, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.idpHttpRedirect) &&
        Objects.equals(serviceProviderEntityId, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.serviceProviderEntityId) &&
        Objects.equals(assertionConsumerServiceURL, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.assertionConsumerServiceURL) &&
        Objects.equals(spPrivateKeyAlias, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.spPrivateKeyAlias) &&
        Objects.equals(keyStorePassword, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.keyStorePassword) &&
        Objects.equals(defaultRedirectUrl, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.defaultRedirectUrl) &&
        Objects.equals(userIDAttribute, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.userIDAttribute) &&
        Objects.equals(useEncryption, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.useEncryption) &&
        Objects.equals(createUser, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.createUser) &&
        Objects.equals(userIntermediatePath, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.userIntermediatePath) &&
        Objects.equals(addGroupMemberships, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.addGroupMemberships) &&
        Objects.equals(groupMembershipAttribute, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.groupMembershipAttribute) &&
        Objects.equals(defaultGroups, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.defaultGroups) &&
        Objects.equals(nameIdFormat, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.nameIdFormat) &&
        Objects.equals(synchronizeAttributes, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.synchronizeAttributes) &&
        Objects.equals(handleLogout, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.handleLogout) &&
        Objects.equals(logoutUrl, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.logoutUrl) &&
        Objects.equals(clockTolerance, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.clockTolerance) &&
        Objects.equals(digestMethod, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.digestMethod) &&
        Objects.equals(signatureMethod, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.signatureMethod) &&
        Objects.equals(identitySyncType, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.identitySyncType) &&
        Objects.equals(idpIdentifier, comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.idpIdentifier);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
