package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties
 */

@JsonTypeName("comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray path;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger serviceRanking;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString idpUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString idpCertAlias;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean idpHttpRedirect;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString serviceProviderEntityId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString assertionConsumerServiceURL;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString spPrivateKeyAlias;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString keyStorePassword;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString defaultRedirectUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString userIDAttribute;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean useEncryption;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean createUser;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString userIntermediatePath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean addGroupMemberships;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString groupMembershipAttribute;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray defaultGroups;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString nameIdFormat;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray synchronizeAttributes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean handleLogout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString logoutUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clockTolerance;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString digestMethod;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString signatureMethod;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown identitySyncType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString idpIdentifier;

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties path(@Nullable ConfigNodePropertyArray path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
  @Valid 
  @Schema(name = "path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public @Nullable ConfigNodePropertyArray getPath() {
    return path;
  }

  @JsonProperty("path")
  public void setPath(@Nullable ConfigNodePropertyArray path) {
    this.path = path;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties serviceRanking(@Nullable ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  /**
   * Get serviceRanking
   * @return serviceRanking
   */
  @Valid 
  @Schema(name = "service.ranking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service.ranking")
  public @Nullable ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  @JsonProperty("service.ranking")
  public void setServiceRanking(@Nullable ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties idpUrl(@Nullable ConfigNodePropertyString idpUrl) {
    this.idpUrl = idpUrl;
    return this;
  }

  /**
   * Get idpUrl
   * @return idpUrl
   */
  @Valid 
  @Schema(name = "idpUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpUrl")
  public @Nullable ConfigNodePropertyString getIdpUrl() {
    return idpUrl;
  }

  @JsonProperty("idpUrl")
  public void setIdpUrl(@Nullable ConfigNodePropertyString idpUrl) {
    this.idpUrl = idpUrl;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties idpCertAlias(@Nullable ConfigNodePropertyString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
    return this;
  }

  /**
   * Get idpCertAlias
   * @return idpCertAlias
   */
  @Valid 
  @Schema(name = "idpCertAlias", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpCertAlias")
  public @Nullable ConfigNodePropertyString getIdpCertAlias() {
    return idpCertAlias;
  }

  @JsonProperty("idpCertAlias")
  public void setIdpCertAlias(@Nullable ConfigNodePropertyString idpCertAlias) {
    this.idpCertAlias = idpCertAlias;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties idpHttpRedirect(@Nullable ConfigNodePropertyBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
    return this;
  }

  /**
   * Get idpHttpRedirect
   * @return idpHttpRedirect
   */
  @Valid 
  @Schema(name = "idpHttpRedirect", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpHttpRedirect")
  public @Nullable ConfigNodePropertyBoolean getIdpHttpRedirect() {
    return idpHttpRedirect;
  }

  @JsonProperty("idpHttpRedirect")
  public void setIdpHttpRedirect(@Nullable ConfigNodePropertyBoolean idpHttpRedirect) {
    this.idpHttpRedirect = idpHttpRedirect;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties serviceProviderEntityId(@Nullable ConfigNodePropertyString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
    return this;
  }

  /**
   * Get serviceProviderEntityId
   * @return serviceProviderEntityId
   */
  @Valid 
  @Schema(name = "serviceProviderEntityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceProviderEntityId")
  public @Nullable ConfigNodePropertyString getServiceProviderEntityId() {
    return serviceProviderEntityId;
  }

  @JsonProperty("serviceProviderEntityId")
  public void setServiceProviderEntityId(@Nullable ConfigNodePropertyString serviceProviderEntityId) {
    this.serviceProviderEntityId = serviceProviderEntityId;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties assertionConsumerServiceURL(@Nullable ConfigNodePropertyString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
    return this;
  }

  /**
   * Get assertionConsumerServiceURL
   * @return assertionConsumerServiceURL
   */
  @Valid 
  @Schema(name = "assertionConsumerServiceURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assertionConsumerServiceURL")
  public @Nullable ConfigNodePropertyString getAssertionConsumerServiceURL() {
    return assertionConsumerServiceURL;
  }

  @JsonProperty("assertionConsumerServiceURL")
  public void setAssertionConsumerServiceURL(@Nullable ConfigNodePropertyString assertionConsumerServiceURL) {
    this.assertionConsumerServiceURL = assertionConsumerServiceURL;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties spPrivateKeyAlias(@Nullable ConfigNodePropertyString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
    return this;
  }

  /**
   * Get spPrivateKeyAlias
   * @return spPrivateKeyAlias
   */
  @Valid 
  @Schema(name = "spPrivateKeyAlias", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spPrivateKeyAlias")
  public @Nullable ConfigNodePropertyString getSpPrivateKeyAlias() {
    return spPrivateKeyAlias;
  }

  @JsonProperty("spPrivateKeyAlias")
  public void setSpPrivateKeyAlias(@Nullable ConfigNodePropertyString spPrivateKeyAlias) {
    this.spPrivateKeyAlias = spPrivateKeyAlias;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties keyStorePassword(@Nullable ConfigNodePropertyString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
    return this;
  }

  /**
   * Get keyStorePassword
   * @return keyStorePassword
   */
  @Valid 
  @Schema(name = "keyStorePassword", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keyStorePassword")
  public @Nullable ConfigNodePropertyString getKeyStorePassword() {
    return keyStorePassword;
  }

  @JsonProperty("keyStorePassword")
  public void setKeyStorePassword(@Nullable ConfigNodePropertyString keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties defaultRedirectUrl(@Nullable ConfigNodePropertyString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
    return this;
  }

  /**
   * Get defaultRedirectUrl
   * @return defaultRedirectUrl
   */
  @Valid 
  @Schema(name = "defaultRedirectUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultRedirectUrl")
  public @Nullable ConfigNodePropertyString getDefaultRedirectUrl() {
    return defaultRedirectUrl;
  }

  @JsonProperty("defaultRedirectUrl")
  public void setDefaultRedirectUrl(@Nullable ConfigNodePropertyString defaultRedirectUrl) {
    this.defaultRedirectUrl = defaultRedirectUrl;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties userIDAttribute(@Nullable ConfigNodePropertyString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
    return this;
  }

  /**
   * Get userIDAttribute
   * @return userIDAttribute
   */
  @Valid 
  @Schema(name = "userIDAttribute", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userIDAttribute")
  public @Nullable ConfigNodePropertyString getUserIDAttribute() {
    return userIDAttribute;
  }

  @JsonProperty("userIDAttribute")
  public void setUserIDAttribute(@Nullable ConfigNodePropertyString userIDAttribute) {
    this.userIDAttribute = userIDAttribute;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties useEncryption(@Nullable ConfigNodePropertyBoolean useEncryption) {
    this.useEncryption = useEncryption;
    return this;
  }

  /**
   * Get useEncryption
   * @return useEncryption
   */
  @Valid 
  @Schema(name = "useEncryption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useEncryption")
  public @Nullable ConfigNodePropertyBoolean getUseEncryption() {
    return useEncryption;
  }

  @JsonProperty("useEncryption")
  public void setUseEncryption(@Nullable ConfigNodePropertyBoolean useEncryption) {
    this.useEncryption = useEncryption;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties createUser(@Nullable ConfigNodePropertyBoolean createUser) {
    this.createUser = createUser;
    return this;
  }

  /**
   * Get createUser
   * @return createUser
   */
  @Valid 
  @Schema(name = "createUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createUser")
  public @Nullable ConfigNodePropertyBoolean getCreateUser() {
    return createUser;
  }

  @JsonProperty("createUser")
  public void setCreateUser(@Nullable ConfigNodePropertyBoolean createUser) {
    this.createUser = createUser;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties userIntermediatePath(@Nullable ConfigNodePropertyString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
    return this;
  }

  /**
   * Get userIntermediatePath
   * @return userIntermediatePath
   */
  @Valid 
  @Schema(name = "userIntermediatePath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userIntermediatePath")
  public @Nullable ConfigNodePropertyString getUserIntermediatePath() {
    return userIntermediatePath;
  }

  @JsonProperty("userIntermediatePath")
  public void setUserIntermediatePath(@Nullable ConfigNodePropertyString userIntermediatePath) {
    this.userIntermediatePath = userIntermediatePath;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties addGroupMemberships(@Nullable ConfigNodePropertyBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
    return this;
  }

  /**
   * Get addGroupMemberships
   * @return addGroupMemberships
   */
  @Valid 
  @Schema(name = "addGroupMemberships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addGroupMemberships")
  public @Nullable ConfigNodePropertyBoolean getAddGroupMemberships() {
    return addGroupMemberships;
  }

  @JsonProperty("addGroupMemberships")
  public void setAddGroupMemberships(@Nullable ConfigNodePropertyBoolean addGroupMemberships) {
    this.addGroupMemberships = addGroupMemberships;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties groupMembershipAttribute(@Nullable ConfigNodePropertyString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
    return this;
  }

  /**
   * Get groupMembershipAttribute
   * @return groupMembershipAttribute
   */
  @Valid 
  @Schema(name = "groupMembershipAttribute", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupMembershipAttribute")
  public @Nullable ConfigNodePropertyString getGroupMembershipAttribute() {
    return groupMembershipAttribute;
  }

  @JsonProperty("groupMembershipAttribute")
  public void setGroupMembershipAttribute(@Nullable ConfigNodePropertyString groupMembershipAttribute) {
    this.groupMembershipAttribute = groupMembershipAttribute;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties defaultGroups(@Nullable ConfigNodePropertyArray defaultGroups) {
    this.defaultGroups = defaultGroups;
    return this;
  }

  /**
   * Get defaultGroups
   * @return defaultGroups
   */
  @Valid 
  @Schema(name = "defaultGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultGroups")
  public @Nullable ConfigNodePropertyArray getDefaultGroups() {
    return defaultGroups;
  }

  @JsonProperty("defaultGroups")
  public void setDefaultGroups(@Nullable ConfigNodePropertyArray defaultGroups) {
    this.defaultGroups = defaultGroups;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties nameIdFormat(@Nullable ConfigNodePropertyString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
    return this;
  }

  /**
   * Get nameIdFormat
   * @return nameIdFormat
   */
  @Valid 
  @Schema(name = "nameIdFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nameIdFormat")
  public @Nullable ConfigNodePropertyString getNameIdFormat() {
    return nameIdFormat;
  }

  @JsonProperty("nameIdFormat")
  public void setNameIdFormat(@Nullable ConfigNodePropertyString nameIdFormat) {
    this.nameIdFormat = nameIdFormat;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties synchronizeAttributes(@Nullable ConfigNodePropertyArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
    return this;
  }

  /**
   * Get synchronizeAttributes
   * @return synchronizeAttributes
   */
  @Valid 
  @Schema(name = "synchronizeAttributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("synchronizeAttributes")
  public @Nullable ConfigNodePropertyArray getSynchronizeAttributes() {
    return synchronizeAttributes;
  }

  @JsonProperty("synchronizeAttributes")
  public void setSynchronizeAttributes(@Nullable ConfigNodePropertyArray synchronizeAttributes) {
    this.synchronizeAttributes = synchronizeAttributes;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties handleLogout(@Nullable ConfigNodePropertyBoolean handleLogout) {
    this.handleLogout = handleLogout;
    return this;
  }

  /**
   * Get handleLogout
   * @return handleLogout
   */
  @Valid 
  @Schema(name = "handleLogout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("handleLogout")
  public @Nullable ConfigNodePropertyBoolean getHandleLogout() {
    return handleLogout;
  }

  @JsonProperty("handleLogout")
  public void setHandleLogout(@Nullable ConfigNodePropertyBoolean handleLogout) {
    this.handleLogout = handleLogout;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties logoutUrl(@Nullable ConfigNodePropertyString logoutUrl) {
    this.logoutUrl = logoutUrl;
    return this;
  }

  /**
   * Get logoutUrl
   * @return logoutUrl
   */
  @Valid 
  @Schema(name = "logoutUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logoutUrl")
  public @Nullable ConfigNodePropertyString getLogoutUrl() {
    return logoutUrl;
  }

  @JsonProperty("logoutUrl")
  public void setLogoutUrl(@Nullable ConfigNodePropertyString logoutUrl) {
    this.logoutUrl = logoutUrl;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties clockTolerance(@Nullable ConfigNodePropertyInteger clockTolerance) {
    this.clockTolerance = clockTolerance;
    return this;
  }

  /**
   * Get clockTolerance
   * @return clockTolerance
   */
  @Valid 
  @Schema(name = "clockTolerance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clockTolerance")
  public @Nullable ConfigNodePropertyInteger getClockTolerance() {
    return clockTolerance;
  }

  @JsonProperty("clockTolerance")
  public void setClockTolerance(@Nullable ConfigNodePropertyInteger clockTolerance) {
    this.clockTolerance = clockTolerance;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties digestMethod(@Nullable ConfigNodePropertyString digestMethod) {
    this.digestMethod = digestMethod;
    return this;
  }

  /**
   * Get digestMethod
   * @return digestMethod
   */
  @Valid 
  @Schema(name = "digestMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("digestMethod")
  public @Nullable ConfigNodePropertyString getDigestMethod() {
    return digestMethod;
  }

  @JsonProperty("digestMethod")
  public void setDigestMethod(@Nullable ConfigNodePropertyString digestMethod) {
    this.digestMethod = digestMethod;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties signatureMethod(@Nullable ConfigNodePropertyString signatureMethod) {
    this.signatureMethod = signatureMethod;
    return this;
  }

  /**
   * Get signatureMethod
   * @return signatureMethod
   */
  @Valid 
  @Schema(name = "signatureMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("signatureMethod")
  public @Nullable ConfigNodePropertyString getSignatureMethod() {
    return signatureMethod;
  }

  @JsonProperty("signatureMethod")
  public void setSignatureMethod(@Nullable ConfigNodePropertyString signatureMethod) {
    this.signatureMethod = signatureMethod;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties identitySyncType(@Nullable ConfigNodePropertyDropDown identitySyncType) {
    this.identitySyncType = identitySyncType;
    return this;
  }

  /**
   * Get identitySyncType
   * @return identitySyncType
   */
  @Valid 
  @Schema(name = "identitySyncType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identitySyncType")
  public @Nullable ConfigNodePropertyDropDown getIdentitySyncType() {
    return identitySyncType;
  }

  @JsonProperty("identitySyncType")
  public void setIdentitySyncType(@Nullable ConfigNodePropertyDropDown identitySyncType) {
    this.identitySyncType = identitySyncType;
  }

  public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties idpIdentifier(@Nullable ConfigNodePropertyString idpIdentifier) {
    this.idpIdentifier = idpIdentifier;
    return this;
  }

  /**
   * Get idpIdentifier
   * @return idpIdentifier
   */
  @Valid 
  @Schema(name = "idpIdentifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idpIdentifier")
  public @Nullable ConfigNodePropertyString getIdpIdentifier() {
    return idpIdentifier;
  }

  @JsonProperty("idpIdentifier")
  public void setIdpIdentifier(@Nullable ConfigNodePropertyString idpIdentifier) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

