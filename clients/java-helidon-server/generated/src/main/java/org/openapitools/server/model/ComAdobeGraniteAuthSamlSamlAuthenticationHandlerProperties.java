package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties   {

    private ConfigNodePropertyArray path;
    private ConfigNodePropertyInteger serviceRanking;
    private ConfigNodePropertyString idpUrl;
    private ConfigNodePropertyString idpCertAlias;
    private ConfigNodePropertyBoolean idpHttpRedirect;
    private ConfigNodePropertyString serviceProviderEntityId;
    private ConfigNodePropertyString assertionConsumerServiceURL;
    private ConfigNodePropertyString spPrivateKeyAlias;
    private ConfigNodePropertyString keyStorePassword;
    private ConfigNodePropertyString defaultRedirectUrl;
    private ConfigNodePropertyString userIDAttribute;
    private ConfigNodePropertyBoolean useEncryption;
    private ConfigNodePropertyBoolean createUser;
    private ConfigNodePropertyString userIntermediatePath;
    private ConfigNodePropertyBoolean addGroupMemberships;
    private ConfigNodePropertyString groupMembershipAttribute;
    private ConfigNodePropertyArray defaultGroups;
    private ConfigNodePropertyString nameIdFormat;
    private ConfigNodePropertyArray synchronizeAttributes;
    private ConfigNodePropertyBoolean handleLogout;
    private ConfigNodePropertyString logoutUrl;
    private ConfigNodePropertyInteger clockTolerance;
    private ConfigNodePropertyString digestMethod;
    private ConfigNodePropertyString signatureMethod;
    private ConfigNodePropertyDropDown identitySyncType;
    private ConfigNodePropertyString idpIdentifier;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.
     *
     * @param path path
     * @param serviceRanking serviceRanking
     * @param idpUrl idpUrl
     * @param idpCertAlias idpCertAlias
     * @param idpHttpRedirect idpHttpRedirect
     * @param serviceProviderEntityId serviceProviderEntityId
     * @param assertionConsumerServiceURL assertionConsumerServiceURL
     * @param spPrivateKeyAlias spPrivateKeyAlias
     * @param keyStorePassword keyStorePassword
     * @param defaultRedirectUrl defaultRedirectUrl
     * @param userIDAttribute userIDAttribute
     * @param useEncryption useEncryption
     * @param createUser createUser
     * @param userIntermediatePath userIntermediatePath
     * @param addGroupMemberships addGroupMemberships
     * @param groupMembershipAttribute groupMembershipAttribute
     * @param defaultGroups defaultGroups
     * @param nameIdFormat nameIdFormat
     * @param synchronizeAttributes synchronizeAttributes
     * @param handleLogout handleLogout
     * @param logoutUrl logoutUrl
     * @param clockTolerance clockTolerance
     * @param digestMethod digestMethod
     * @param signatureMethod signatureMethod
     * @param identitySyncType identitySyncType
     * @param idpIdentifier idpIdentifier
     */
    public ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties(
        ConfigNodePropertyArray path, 
        ConfigNodePropertyInteger serviceRanking, 
        ConfigNodePropertyString idpUrl, 
        ConfigNodePropertyString idpCertAlias, 
        ConfigNodePropertyBoolean idpHttpRedirect, 
        ConfigNodePropertyString serviceProviderEntityId, 
        ConfigNodePropertyString assertionConsumerServiceURL, 
        ConfigNodePropertyString spPrivateKeyAlias, 
        ConfigNodePropertyString keyStorePassword, 
        ConfigNodePropertyString defaultRedirectUrl, 
        ConfigNodePropertyString userIDAttribute, 
        ConfigNodePropertyBoolean useEncryption, 
        ConfigNodePropertyBoolean createUser, 
        ConfigNodePropertyString userIntermediatePath, 
        ConfigNodePropertyBoolean addGroupMemberships, 
        ConfigNodePropertyString groupMembershipAttribute, 
        ConfigNodePropertyArray defaultGroups, 
        ConfigNodePropertyString nameIdFormat, 
        ConfigNodePropertyArray synchronizeAttributes, 
        ConfigNodePropertyBoolean handleLogout, 
        ConfigNodePropertyString logoutUrl, 
        ConfigNodePropertyInteger clockTolerance, 
        ConfigNodePropertyString digestMethod, 
        ConfigNodePropertyString signatureMethod, 
        ConfigNodePropertyDropDown identitySyncType, 
        ConfigNodePropertyString idpIdentifier
    ) {
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



    /**
     * Get path
     * @return path
     */
    public ConfigNodePropertyArray getPath() {
        return path;
    }

    public void setPath(ConfigNodePropertyArray path) {
        this.path = path;
    }

    /**
     * Get serviceRanking
     * @return serviceRanking
     */
    public ConfigNodePropertyInteger getServiceRanking() {
        return serviceRanking;
    }

    public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
        this.serviceRanking = serviceRanking;
    }

    /**
     * Get idpUrl
     * @return idpUrl
     */
    public ConfigNodePropertyString getIdpUrl() {
        return idpUrl;
    }

    public void setIdpUrl(ConfigNodePropertyString idpUrl) {
        this.idpUrl = idpUrl;
    }

    /**
     * Get idpCertAlias
     * @return idpCertAlias
     */
    public ConfigNodePropertyString getIdpCertAlias() {
        return idpCertAlias;
    }

    public void setIdpCertAlias(ConfigNodePropertyString idpCertAlias) {
        this.idpCertAlias = idpCertAlias;
    }

    /**
     * Get idpHttpRedirect
     * @return idpHttpRedirect
     */
    public ConfigNodePropertyBoolean getIdpHttpRedirect() {
        return idpHttpRedirect;
    }

    public void setIdpHttpRedirect(ConfigNodePropertyBoolean idpHttpRedirect) {
        this.idpHttpRedirect = idpHttpRedirect;
    }

    /**
     * Get serviceProviderEntityId
     * @return serviceProviderEntityId
     */
    public ConfigNodePropertyString getServiceProviderEntityId() {
        return serviceProviderEntityId;
    }

    public void setServiceProviderEntityId(ConfigNodePropertyString serviceProviderEntityId) {
        this.serviceProviderEntityId = serviceProviderEntityId;
    }

    /**
     * Get assertionConsumerServiceURL
     * @return assertionConsumerServiceURL
     */
    public ConfigNodePropertyString getAssertionConsumerServiceURL() {
        return assertionConsumerServiceURL;
    }

    public void setAssertionConsumerServiceURL(ConfigNodePropertyString assertionConsumerServiceURL) {
        this.assertionConsumerServiceURL = assertionConsumerServiceURL;
    }

    /**
     * Get spPrivateKeyAlias
     * @return spPrivateKeyAlias
     */
    public ConfigNodePropertyString getSpPrivateKeyAlias() {
        return spPrivateKeyAlias;
    }

    public void setSpPrivateKeyAlias(ConfigNodePropertyString spPrivateKeyAlias) {
        this.spPrivateKeyAlias = spPrivateKeyAlias;
    }

    /**
     * Get keyStorePassword
     * @return keyStorePassword
     */
    public ConfigNodePropertyString getKeyStorePassword() {
        return keyStorePassword;
    }

    public void setKeyStorePassword(ConfigNodePropertyString keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
    }

    /**
     * Get defaultRedirectUrl
     * @return defaultRedirectUrl
     */
    public ConfigNodePropertyString getDefaultRedirectUrl() {
        return defaultRedirectUrl;
    }

    public void setDefaultRedirectUrl(ConfigNodePropertyString defaultRedirectUrl) {
        this.defaultRedirectUrl = defaultRedirectUrl;
    }

    /**
     * Get userIDAttribute
     * @return userIDAttribute
     */
    public ConfigNodePropertyString getUserIDAttribute() {
        return userIDAttribute;
    }

    public void setUserIDAttribute(ConfigNodePropertyString userIDAttribute) {
        this.userIDAttribute = userIDAttribute;
    }

    /**
     * Get useEncryption
     * @return useEncryption
     */
    public ConfigNodePropertyBoolean getUseEncryption() {
        return useEncryption;
    }

    public void setUseEncryption(ConfigNodePropertyBoolean useEncryption) {
        this.useEncryption = useEncryption;
    }

    /**
     * Get createUser
     * @return createUser
     */
    public ConfigNodePropertyBoolean getCreateUser() {
        return createUser;
    }

    public void setCreateUser(ConfigNodePropertyBoolean createUser) {
        this.createUser = createUser;
    }

    /**
     * Get userIntermediatePath
     * @return userIntermediatePath
     */
    public ConfigNodePropertyString getUserIntermediatePath() {
        return userIntermediatePath;
    }

    public void setUserIntermediatePath(ConfigNodePropertyString userIntermediatePath) {
        this.userIntermediatePath = userIntermediatePath;
    }

    /**
     * Get addGroupMemberships
     * @return addGroupMemberships
     */
    public ConfigNodePropertyBoolean getAddGroupMemberships() {
        return addGroupMemberships;
    }

    public void setAddGroupMemberships(ConfigNodePropertyBoolean addGroupMemberships) {
        this.addGroupMemberships = addGroupMemberships;
    }

    /**
     * Get groupMembershipAttribute
     * @return groupMembershipAttribute
     */
    public ConfigNodePropertyString getGroupMembershipAttribute() {
        return groupMembershipAttribute;
    }

    public void setGroupMembershipAttribute(ConfigNodePropertyString groupMembershipAttribute) {
        this.groupMembershipAttribute = groupMembershipAttribute;
    }

    /**
     * Get defaultGroups
     * @return defaultGroups
     */
    public ConfigNodePropertyArray getDefaultGroups() {
        return defaultGroups;
    }

    public void setDefaultGroups(ConfigNodePropertyArray defaultGroups) {
        this.defaultGroups = defaultGroups;
    }

    /**
     * Get nameIdFormat
     * @return nameIdFormat
     */
    public ConfigNodePropertyString getNameIdFormat() {
        return nameIdFormat;
    }

    public void setNameIdFormat(ConfigNodePropertyString nameIdFormat) {
        this.nameIdFormat = nameIdFormat;
    }

    /**
     * Get synchronizeAttributes
     * @return synchronizeAttributes
     */
    public ConfigNodePropertyArray getSynchronizeAttributes() {
        return synchronizeAttributes;
    }

    public void setSynchronizeAttributes(ConfigNodePropertyArray synchronizeAttributes) {
        this.synchronizeAttributes = synchronizeAttributes;
    }

    /**
     * Get handleLogout
     * @return handleLogout
     */
    public ConfigNodePropertyBoolean getHandleLogout() {
        return handleLogout;
    }

    public void setHandleLogout(ConfigNodePropertyBoolean handleLogout) {
        this.handleLogout = handleLogout;
    }

    /**
     * Get logoutUrl
     * @return logoutUrl
     */
    public ConfigNodePropertyString getLogoutUrl() {
        return logoutUrl;
    }

    public void setLogoutUrl(ConfigNodePropertyString logoutUrl) {
        this.logoutUrl = logoutUrl;
    }

    /**
     * Get clockTolerance
     * @return clockTolerance
     */
    public ConfigNodePropertyInteger getClockTolerance() {
        return clockTolerance;
    }

    public void setClockTolerance(ConfigNodePropertyInteger clockTolerance) {
        this.clockTolerance = clockTolerance;
    }

    /**
     * Get digestMethod
     * @return digestMethod
     */
    public ConfigNodePropertyString getDigestMethod() {
        return digestMethod;
    }

    public void setDigestMethod(ConfigNodePropertyString digestMethod) {
        this.digestMethod = digestMethod;
    }

    /**
     * Get signatureMethod
     * @return signatureMethod
     */
    public ConfigNodePropertyString getSignatureMethod() {
        return signatureMethod;
    }

    public void setSignatureMethod(ConfigNodePropertyString signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    /**
     * Get identitySyncType
     * @return identitySyncType
     */
    public ConfigNodePropertyDropDown getIdentitySyncType() {
        return identitySyncType;
    }

    public void setIdentitySyncType(ConfigNodePropertyDropDown identitySyncType) {
        this.identitySyncType = identitySyncType;
    }

    /**
     * Get idpIdentifier
     * @return idpIdentifier
     */
    public ConfigNodePropertyString getIdpIdentifier() {
        return idpIdentifier;
    }

    public void setIdpIdentifier(ConfigNodePropertyString idpIdentifier) {
        this.idpIdentifier = idpIdentifier;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

