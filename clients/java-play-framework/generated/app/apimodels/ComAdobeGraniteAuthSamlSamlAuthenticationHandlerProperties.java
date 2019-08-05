package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties   {
  @JsonProperty("path")
  private ConfigNodePropertyArray path = null;

  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking = null;

  @JsonProperty("idpUrl")
  private ConfigNodePropertyString idpUrl = null;

  @JsonProperty("idpCertAlias")
  private ConfigNodePropertyString idpCertAlias = null;

  @JsonProperty("idpHttpRedirect")
  private ConfigNodePropertyBoolean idpHttpRedirect = null;

  @JsonProperty("serviceProviderEntityId")
  private ConfigNodePropertyString serviceProviderEntityId = null;

  @JsonProperty("assertionConsumerServiceURL")
  private ConfigNodePropertyString assertionConsumerServiceURL = null;

  @JsonProperty("spPrivateKeyAlias")
  private ConfigNodePropertyString spPrivateKeyAlias = null;

  @JsonProperty("keyStorePassword")
  private ConfigNodePropertyString keyStorePassword = null;

  @JsonProperty("defaultRedirectUrl")
  private ConfigNodePropertyString defaultRedirectUrl = null;

  @JsonProperty("userIDAttribute")
  private ConfigNodePropertyString userIDAttribute = null;

  @JsonProperty("useEncryption")
  private ConfigNodePropertyBoolean useEncryption = null;

  @JsonProperty("createUser")
  private ConfigNodePropertyBoolean createUser = null;

  @JsonProperty("userIntermediatePath")
  private ConfigNodePropertyString userIntermediatePath = null;

  @JsonProperty("addGroupMemberships")
  private ConfigNodePropertyBoolean addGroupMemberships = null;

  @JsonProperty("groupMembershipAttribute")
  private ConfigNodePropertyString groupMembershipAttribute = null;

  @JsonProperty("defaultGroups")
  private ConfigNodePropertyArray defaultGroups = null;

  @JsonProperty("nameIdFormat")
  private ConfigNodePropertyString nameIdFormat = null;

  @JsonProperty("synchronizeAttributes")
  private ConfigNodePropertyArray synchronizeAttributes = null;

  @JsonProperty("handleLogout")
  private ConfigNodePropertyBoolean handleLogout = null;

  @JsonProperty("logoutUrl")
  private ConfigNodePropertyString logoutUrl = null;

  @JsonProperty("clockTolerance")
  private ConfigNodePropertyInteger clockTolerance = null;

  @JsonProperty("digestMethod")
  private ConfigNodePropertyString digestMethod = null;

  @JsonProperty("signatureMethod")
  private ConfigNodePropertyString signatureMethod = null;

  @JsonProperty("identitySyncType")
  private ConfigNodePropertyDropDown identitySyncType = null;

  @JsonProperty("idpIdentifier")
  private ConfigNodePropertyString idpIdentifier = null;

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties path(ConfigNodePropertyArray path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Valid
  public ConfigNodePropertyArray getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyArray path) {
    this.path = path;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

   /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @Valid
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties idpUrl(ConfigNodePropertyString idpUrl) {
    this.idpUrl = idpUrl;
    return this;
  }

   /**
   * Get idpUrl
   * @return idpUrl
  **/
  @Valid
  public ConfigNodePropertyString getIdpUrl() {
    return idpUrl;
  }

  public void setIdpUrl(ConfigNodePropertyString idpUrl) {
    this.idpUrl = idpUrl;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties idpCertAlias(ConfigNodePropertyString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
    return this;
  }

   /**
   * Get idpCertAlias
   * @return idpCertAlias
  **/
  @Valid
  public ConfigNodePropertyString getIdpCertAlias() {
    return idpCertAlias;
  }

  public void setIdpCertAlias(ConfigNodePropertyString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties idpHttpRedirect(ConfigNodePropertyBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
    return this;
  }

   /**
   * Get idpHttpRedirect
   * @return idpHttpRedirect
  **/
  @Valid
  public ConfigNodePropertyBoolean getIdpHttpRedirect() {
    return idpHttpRedirect;
  }

  public void setIdpHttpRedirect(ConfigNodePropertyBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties serviceProviderEntityId(ConfigNodePropertyString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
    return this;
  }

   /**
   * Get serviceProviderEntityId
   * @return serviceProviderEntityId
  **/
  @Valid
  public ConfigNodePropertyString getServiceProviderEntityId() {
    return serviceProviderEntityId;
  }

  public void setServiceProviderEntityId(ConfigNodePropertyString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties assertionConsumerServiceURL(ConfigNodePropertyString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
    return this;
  }

   /**
   * Get assertionConsumerServiceURL
   * @return assertionConsumerServiceURL
  **/
  @Valid
  public ConfigNodePropertyString getAssertionConsumerServiceURL() {
    return assertionConsumerServiceURL;
  }

  public void setAssertionConsumerServiceURL(ConfigNodePropertyString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties spPrivateKeyAlias(ConfigNodePropertyString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
    return this;
  }

   /**
   * Get spPrivateKeyAlias
   * @return spPrivateKeyAlias
  **/
  @Valid
  public ConfigNodePropertyString getSpPrivateKeyAlias() {
    return spPrivateKeyAlias;
  }

  public void setSpPrivateKeyAlias(ConfigNodePropertyString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties keyStorePassword(ConfigNodePropertyString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
    return this;
  }

   /**
   * Get keyStorePassword
   * @return keyStorePassword
  **/
  @Valid
  public ConfigNodePropertyString getKeyStorePassword() {
    return keyStorePassword;
  }

  public void setKeyStorePassword(ConfigNodePropertyString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties defaultRedirectUrl(ConfigNodePropertyString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
    return this;
  }

   /**
   * Get defaultRedirectUrl
   * @return defaultRedirectUrl
  **/
  @Valid
  public ConfigNodePropertyString getDefaultRedirectUrl() {
    return defaultRedirectUrl;
  }

  public void setDefaultRedirectUrl(ConfigNodePropertyString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties userIDAttribute(ConfigNodePropertyString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
    return this;
  }

   /**
   * Get userIDAttribute
   * @return userIDAttribute
  **/
  @Valid
  public ConfigNodePropertyString getUserIDAttribute() {
    return userIDAttribute;
  }

  public void setUserIDAttribute(ConfigNodePropertyString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties useEncryption(ConfigNodePropertyBoolean useEncryption) {
    this.useEncryption = useEncryption;
    return this;
  }

   /**
   * Get useEncryption
   * @return useEncryption
  **/
  @Valid
  public ConfigNodePropertyBoolean getUseEncryption() {
    return useEncryption;
  }

  public void setUseEncryption(ConfigNodePropertyBoolean useEncryption) {
    this.useEncryption = useEncryption;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties createUser(ConfigNodePropertyBoolean createUser) {
    this.createUser = createUser;
    return this;
  }

   /**
   * Get createUser
   * @return createUser
  **/
  @Valid
  public ConfigNodePropertyBoolean getCreateUser() {
    return createUser;
  }

  public void setCreateUser(ConfigNodePropertyBoolean createUser) {
    this.createUser = createUser;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties userIntermediatePath(ConfigNodePropertyString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
    return this;
  }

   /**
   * Get userIntermediatePath
   * @return userIntermediatePath
  **/
  @Valid
  public ConfigNodePropertyString getUserIntermediatePath() {
    return userIntermediatePath;
  }

  public void setUserIntermediatePath(ConfigNodePropertyString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties addGroupMemberships(ConfigNodePropertyBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
    return this;
  }

   /**
   * Get addGroupMemberships
   * @return addGroupMemberships
  **/
  @Valid
  public ConfigNodePropertyBoolean getAddGroupMemberships() {
    return addGroupMemberships;
  }

  public void setAddGroupMemberships(ConfigNodePropertyBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties groupMembershipAttribute(ConfigNodePropertyString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
    return this;
  }

   /**
   * Get groupMembershipAttribute
   * @return groupMembershipAttribute
  **/
  @Valid
  public ConfigNodePropertyString getGroupMembershipAttribute() {
    return groupMembershipAttribute;
  }

  public void setGroupMembershipAttribute(ConfigNodePropertyString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties defaultGroups(ConfigNodePropertyArray defaultGroups) {
    this.defaultGroups = defaultGroups;
    return this;
  }

   /**
   * Get defaultGroups
   * @return defaultGroups
  **/
  @Valid
  public ConfigNodePropertyArray getDefaultGroups() {
    return defaultGroups;
  }

  public void setDefaultGroups(ConfigNodePropertyArray defaultGroups) {
    this.defaultGroups = defaultGroups;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties nameIdFormat(ConfigNodePropertyString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
    return this;
  }

   /**
   * Get nameIdFormat
   * @return nameIdFormat
  **/
  @Valid
  public ConfigNodePropertyString getNameIdFormat() {
    return nameIdFormat;
  }

  public void setNameIdFormat(ConfigNodePropertyString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties synchronizeAttributes(ConfigNodePropertyArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
    return this;
  }

   /**
   * Get synchronizeAttributes
   * @return synchronizeAttributes
  **/
  @Valid
  public ConfigNodePropertyArray getSynchronizeAttributes() {
    return synchronizeAttributes;
  }

  public void setSynchronizeAttributes(ConfigNodePropertyArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties handleLogout(ConfigNodePropertyBoolean handleLogout) {
    this.handleLogout = handleLogout;
    return this;
  }

   /**
   * Get handleLogout
   * @return handleLogout
  **/
  @Valid
  public ConfigNodePropertyBoolean getHandleLogout() {
    return handleLogout;
  }

  public void setHandleLogout(ConfigNodePropertyBoolean handleLogout) {
    this.handleLogout = handleLogout;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties logoutUrl(ConfigNodePropertyString logoutUrl) {
    this.logoutUrl = logoutUrl;
    return this;
  }

   /**
   * Get logoutUrl
   * @return logoutUrl
  **/
  @Valid
  public ConfigNodePropertyString getLogoutUrl() {
    return logoutUrl;
  }

  public void setLogoutUrl(ConfigNodePropertyString logoutUrl) {
    this.logoutUrl = logoutUrl;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties clockTolerance(ConfigNodePropertyInteger clockTolerance) {
    this.clockTolerance = clockTolerance;
    return this;
  }

   /**
   * Get clockTolerance
   * @return clockTolerance
  **/
  @Valid
  public ConfigNodePropertyInteger getClockTolerance() {
    return clockTolerance;
  }

  public void setClockTolerance(ConfigNodePropertyInteger clockTolerance) {
    this.clockTolerance = clockTolerance;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties digestMethod(ConfigNodePropertyString digestMethod) {
    this.digestMethod = digestMethod;
    return this;
  }

   /**
   * Get digestMethod
   * @return digestMethod
  **/
  @Valid
  public ConfigNodePropertyString getDigestMethod() {
    return digestMethod;
  }

  public void setDigestMethod(ConfigNodePropertyString digestMethod) {
    this.digestMethod = digestMethod;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties signatureMethod(ConfigNodePropertyString signatureMethod) {
    this.signatureMethod = signatureMethod;
    return this;
  }

   /**
   * Get signatureMethod
   * @return signatureMethod
  **/
  @Valid
  public ConfigNodePropertyString getSignatureMethod() {
    return signatureMethod;
  }

  public void setSignatureMethod(ConfigNodePropertyString signatureMethod) {
    this.signatureMethod = signatureMethod;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties identitySyncType(ConfigNodePropertyDropDown identitySyncType) {
    this.identitySyncType = identitySyncType;
    return this;
  }

   /**
   * Get identitySyncType
   * @return identitySyncType
  **/
  @Valid
  public ConfigNodePropertyDropDown getIdentitySyncType() {
    return identitySyncType;
  }

  public void setIdentitySyncType(ConfigNodePropertyDropDown identitySyncType) {
    this.identitySyncType = identitySyncType;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties idpIdentifier(ConfigNodePropertyString idpIdentifier) {
    this.idpIdentifier = idpIdentifier;
    return this;
  }

   /**
   * Get idpIdentifier
   * @return idpIdentifier
  **/
  @Valid
  public ConfigNodePropertyString getIdpIdentifier() {
    return idpIdentifier;
  }

  public void setIdpIdentifier(ConfigNodePropertyString idpIdentifier) {
    this.idpIdentifier = idpIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

