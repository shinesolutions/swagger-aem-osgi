package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheFelixHttpProperties   {

    private ConfigNodePropertyString orgApacheFelixHttpHost;
    private ConfigNodePropertyBoolean orgApacheFelixHttpEnable;
    private ConfigNodePropertyInteger orgOsgiServiceHttpPort;
    private ConfigNodePropertyInteger orgApacheFelixHttpTimeout;
    private ConfigNodePropertyBoolean orgApacheFelixHttpsEnable;
    private ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure;
    private ConfigNodePropertyString orgApacheFelixHttpsKeystore;
    private ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword;
    private ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword;
    private ConfigNodePropertyString orgApacheFelixHttpsTruststore;
    private ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword;
    private ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate;
    private ConfigNodePropertyString orgApacheFelixHttpContextPath;
    private ConfigNodePropertyBoolean orgApacheFelixHttpMbeans;
    private ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout;
    private ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax;
    private ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors;
    private ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors;
    private ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize;
    private ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize;
    private ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize;
    private ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize;
    private ConfigNodePropertyArray orgApacheFelixHttpPathExclusions;
    private ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded;
    private ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded;
    private ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader;
    private ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded;
    private ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded;
    private ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable;
    private ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed;
    private ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly;
    private ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure;
    private ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName;
    private ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
    private ConfigNodePropertyString orgEclipseJettyServletSessionCookie;
    private ConfigNodePropertyString orgEclipseJettyServletSessionDomain;
    private ConfigNodePropertyString orgEclipseJettyServletSessionPath;
    private ConfigNodePropertyInteger orgEclipseJettyServletMaxAge;
    private ConfigNodePropertyString orgApacheFelixHttpName;
    private ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable;
    private ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize;
    private ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel;
    private ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize;
    private ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush;
    private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents;
    private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods;
    private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods;
    private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths;
    private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths;
    private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes;
    private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes;
    private ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate;
    private ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid;

    /**
     * Default constructor.
     */
    public OrgApacheFelixHttpProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheFelixHttpProperties.
     *
     * @param orgApacheFelixHttpHost orgApacheFelixHttpHost
     * @param orgApacheFelixHttpEnable orgApacheFelixHttpEnable
     * @param orgOsgiServiceHttpPort orgOsgiServiceHttpPort
     * @param orgApacheFelixHttpTimeout orgApacheFelixHttpTimeout
     * @param orgApacheFelixHttpsEnable orgApacheFelixHttpsEnable
     * @param orgOsgiServiceHttpPortSecure orgOsgiServiceHttpPortSecure
     * @param orgApacheFelixHttpsKeystore orgApacheFelixHttpsKeystore
     * @param orgApacheFelixHttpsKeystorePassword orgApacheFelixHttpsKeystorePassword
     * @param orgApacheFelixHttpsKeystoreKeyPassword orgApacheFelixHttpsKeystoreKeyPassword
     * @param orgApacheFelixHttpsTruststore orgApacheFelixHttpsTruststore
     * @param orgApacheFelixHttpsTruststorePassword orgApacheFelixHttpsTruststorePassword
     * @param orgApacheFelixHttpsClientcertificate orgApacheFelixHttpsClientcertificate
     * @param orgApacheFelixHttpContextPath orgApacheFelixHttpContextPath
     * @param orgApacheFelixHttpMbeans orgApacheFelixHttpMbeans
     * @param orgApacheFelixHttpSessionTimeout orgApacheFelixHttpSessionTimeout
     * @param orgApacheFelixHttpJettyThreadpoolMax orgApacheFelixHttpJettyThreadpoolMax
     * @param orgApacheFelixHttpJettyAcceptors orgApacheFelixHttpJettyAcceptors
     * @param orgApacheFelixHttpJettySelectors orgApacheFelixHttpJettySelectors
     * @param orgApacheFelixHttpJettyHeaderBufferSize orgApacheFelixHttpJettyHeaderBufferSize
     * @param orgApacheFelixHttpJettyRequestBufferSize orgApacheFelixHttpJettyRequestBufferSize
     * @param orgApacheFelixHttpJettyResponseBufferSize orgApacheFelixHttpJettyResponseBufferSize
     * @param orgApacheFelixHttpJettyMaxFormSize orgApacheFelixHttpJettyMaxFormSize
     * @param orgApacheFelixHttpPathExclusions orgApacheFelixHttpPathExclusions
     * @param orgApacheFelixHttpsJettyCiphersuitesExcluded orgApacheFelixHttpsJettyCiphersuitesExcluded
     * @param orgApacheFelixHttpsJettyCiphersuitesIncluded orgApacheFelixHttpsJettyCiphersuitesIncluded
     * @param orgApacheFelixHttpJettySendServerHeader orgApacheFelixHttpJettySendServerHeader
     * @param orgApacheFelixHttpsJettyProtocolsIncluded orgApacheFelixHttpsJettyProtocolsIncluded
     * @param orgApacheFelixHttpsJettyProtocolsExcluded orgApacheFelixHttpsJettyProtocolsExcluded
     * @param orgApacheFelixProxyLoadBalancerConnectionEnable orgApacheFelixProxyLoadBalancerConnectionEnable
     * @param orgApacheFelixHttpsJettyRenegotiateAllowed orgApacheFelixHttpsJettyRenegotiateAllowed
     * @param orgApacheFelixHttpsJettySessionCookieHttpOnly orgApacheFelixHttpsJettySessionCookieHttpOnly
     * @param orgApacheFelixHttpsJettySessionCookieSecure orgApacheFelixHttpsJettySessionCookieSecure
     * @param orgEclipseJettyServletSessionIdPathParameterName orgEclipseJettyServletSessionIdPathParameterName
     * @param orgEclipseJettyServletCheckingRemoteSessionIdEncoding orgEclipseJettyServletCheckingRemoteSessionIdEncoding
     * @param orgEclipseJettyServletSessionCookie orgEclipseJettyServletSessionCookie
     * @param orgEclipseJettyServletSessionDomain orgEclipseJettyServletSessionDomain
     * @param orgEclipseJettyServletSessionPath orgEclipseJettyServletSessionPath
     * @param orgEclipseJettyServletMaxAge orgEclipseJettyServletMaxAge
     * @param orgApacheFelixHttpName orgApacheFelixHttpName
     * @param orgApacheFelixJettyGziphandlerEnable orgApacheFelixJettyGziphandlerEnable
     * @param orgApacheFelixJettyGzipMinGzipSize orgApacheFelixJettyGzipMinGzipSize
     * @param orgApacheFelixJettyGzipCompressionLevel orgApacheFelixJettyGzipCompressionLevel
     * @param orgApacheFelixJettyGzipInflateBufferSize orgApacheFelixJettyGzipInflateBufferSize
     * @param orgApacheFelixJettyGzipSyncFlush orgApacheFelixJettyGzipSyncFlush
     * @param orgApacheFelixJettyGzipExcludedUserAgents orgApacheFelixJettyGzipExcludedUserAgents
     * @param orgApacheFelixJettyGzipIncludedMethods orgApacheFelixJettyGzipIncludedMethods
     * @param orgApacheFelixJettyGzipExcludedMethods orgApacheFelixJettyGzipExcludedMethods
     * @param orgApacheFelixJettyGzipIncludedPaths orgApacheFelixJettyGzipIncludedPaths
     * @param orgApacheFelixJettyGzipExcludedPaths orgApacheFelixJettyGzipExcludedPaths
     * @param orgApacheFelixJettyGzipIncludedMimeTypes orgApacheFelixJettyGzipIncludedMimeTypes
     * @param orgApacheFelixJettyGzipExcludedMimeTypes orgApacheFelixJettyGzipExcludedMimeTypes
     * @param orgApacheFelixHttpSessionInvalidate orgApacheFelixHttpSessionInvalidate
     * @param orgApacheFelixHttpSessionUniqueid orgApacheFelixHttpSessionUniqueid
     */
    public OrgApacheFelixHttpProperties(
        ConfigNodePropertyString orgApacheFelixHttpHost, 
        ConfigNodePropertyBoolean orgApacheFelixHttpEnable, 
        ConfigNodePropertyInteger orgOsgiServiceHttpPort, 
        ConfigNodePropertyInteger orgApacheFelixHttpTimeout, 
        ConfigNodePropertyBoolean orgApacheFelixHttpsEnable, 
        ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure, 
        ConfigNodePropertyString orgApacheFelixHttpsKeystore, 
        ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword, 
        ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword, 
        ConfigNodePropertyString orgApacheFelixHttpsTruststore, 
        ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword, 
        ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate, 
        ConfigNodePropertyString orgApacheFelixHttpContextPath, 
        ConfigNodePropertyBoolean orgApacheFelixHttpMbeans, 
        ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout, 
        ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax, 
        ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors, 
        ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors, 
        ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize, 
        ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize, 
        ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize, 
        ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize, 
        ConfigNodePropertyArray orgApacheFelixHttpPathExclusions, 
        ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded, 
        ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded, 
        ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader, 
        ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded, 
        ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded, 
        ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable, 
        ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed, 
        ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly, 
        ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure, 
        ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName, 
        ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding, 
        ConfigNodePropertyString orgEclipseJettyServletSessionCookie, 
        ConfigNodePropertyString orgEclipseJettyServletSessionDomain, 
        ConfigNodePropertyString orgEclipseJettyServletSessionPath, 
        ConfigNodePropertyInteger orgEclipseJettyServletMaxAge, 
        ConfigNodePropertyString orgApacheFelixHttpName, 
        ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable, 
        ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize, 
        ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel, 
        ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize, 
        ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush, 
        ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents, 
        ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods, 
        ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods, 
        ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths, 
        ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths, 
        ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes, 
        ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes, 
        ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate, 
        ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid
    ) {
        this.orgApacheFelixHttpHost = orgApacheFelixHttpHost;
        this.orgApacheFelixHttpEnable = orgApacheFelixHttpEnable;
        this.orgOsgiServiceHttpPort = orgOsgiServiceHttpPort;
        this.orgApacheFelixHttpTimeout = orgApacheFelixHttpTimeout;
        this.orgApacheFelixHttpsEnable = orgApacheFelixHttpsEnable;
        this.orgOsgiServiceHttpPortSecure = orgOsgiServiceHttpPortSecure;
        this.orgApacheFelixHttpsKeystore = orgApacheFelixHttpsKeystore;
        this.orgApacheFelixHttpsKeystorePassword = orgApacheFelixHttpsKeystorePassword;
        this.orgApacheFelixHttpsKeystoreKeyPassword = orgApacheFelixHttpsKeystoreKeyPassword;
        this.orgApacheFelixHttpsTruststore = orgApacheFelixHttpsTruststore;
        this.orgApacheFelixHttpsTruststorePassword = orgApacheFelixHttpsTruststorePassword;
        this.orgApacheFelixHttpsClientcertificate = orgApacheFelixHttpsClientcertificate;
        this.orgApacheFelixHttpContextPath = orgApacheFelixHttpContextPath;
        this.orgApacheFelixHttpMbeans = orgApacheFelixHttpMbeans;
        this.orgApacheFelixHttpSessionTimeout = orgApacheFelixHttpSessionTimeout;
        this.orgApacheFelixHttpJettyThreadpoolMax = orgApacheFelixHttpJettyThreadpoolMax;
        this.orgApacheFelixHttpJettyAcceptors = orgApacheFelixHttpJettyAcceptors;
        this.orgApacheFelixHttpJettySelectors = orgApacheFelixHttpJettySelectors;
        this.orgApacheFelixHttpJettyHeaderBufferSize = orgApacheFelixHttpJettyHeaderBufferSize;
        this.orgApacheFelixHttpJettyRequestBufferSize = orgApacheFelixHttpJettyRequestBufferSize;
        this.orgApacheFelixHttpJettyResponseBufferSize = orgApacheFelixHttpJettyResponseBufferSize;
        this.orgApacheFelixHttpJettyMaxFormSize = orgApacheFelixHttpJettyMaxFormSize;
        this.orgApacheFelixHttpPathExclusions = orgApacheFelixHttpPathExclusions;
        this.orgApacheFelixHttpsJettyCiphersuitesExcluded = orgApacheFelixHttpsJettyCiphersuitesExcluded;
        this.orgApacheFelixHttpsJettyCiphersuitesIncluded = orgApacheFelixHttpsJettyCiphersuitesIncluded;
        this.orgApacheFelixHttpJettySendServerHeader = orgApacheFelixHttpJettySendServerHeader;
        this.orgApacheFelixHttpsJettyProtocolsIncluded = orgApacheFelixHttpsJettyProtocolsIncluded;
        this.orgApacheFelixHttpsJettyProtocolsExcluded = orgApacheFelixHttpsJettyProtocolsExcluded;
        this.orgApacheFelixProxyLoadBalancerConnectionEnable = orgApacheFelixProxyLoadBalancerConnectionEnable;
        this.orgApacheFelixHttpsJettyRenegotiateAllowed = orgApacheFelixHttpsJettyRenegotiateAllowed;
        this.orgApacheFelixHttpsJettySessionCookieHttpOnly = orgApacheFelixHttpsJettySessionCookieHttpOnly;
        this.orgApacheFelixHttpsJettySessionCookieSecure = orgApacheFelixHttpsJettySessionCookieSecure;
        this.orgEclipseJettyServletSessionIdPathParameterName = orgEclipseJettyServletSessionIdPathParameterName;
        this.orgEclipseJettyServletCheckingRemoteSessionIdEncoding = orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
        this.orgEclipseJettyServletSessionCookie = orgEclipseJettyServletSessionCookie;
        this.orgEclipseJettyServletSessionDomain = orgEclipseJettyServletSessionDomain;
        this.orgEclipseJettyServletSessionPath = orgEclipseJettyServletSessionPath;
        this.orgEclipseJettyServletMaxAge = orgEclipseJettyServletMaxAge;
        this.orgApacheFelixHttpName = orgApacheFelixHttpName;
        this.orgApacheFelixJettyGziphandlerEnable = orgApacheFelixJettyGziphandlerEnable;
        this.orgApacheFelixJettyGzipMinGzipSize = orgApacheFelixJettyGzipMinGzipSize;
        this.orgApacheFelixJettyGzipCompressionLevel = orgApacheFelixJettyGzipCompressionLevel;
        this.orgApacheFelixJettyGzipInflateBufferSize = orgApacheFelixJettyGzipInflateBufferSize;
        this.orgApacheFelixJettyGzipSyncFlush = orgApacheFelixJettyGzipSyncFlush;
        this.orgApacheFelixJettyGzipExcludedUserAgents = orgApacheFelixJettyGzipExcludedUserAgents;
        this.orgApacheFelixJettyGzipIncludedMethods = orgApacheFelixJettyGzipIncludedMethods;
        this.orgApacheFelixJettyGzipExcludedMethods = orgApacheFelixJettyGzipExcludedMethods;
        this.orgApacheFelixJettyGzipIncludedPaths = orgApacheFelixJettyGzipIncludedPaths;
        this.orgApacheFelixJettyGzipExcludedPaths = orgApacheFelixJettyGzipExcludedPaths;
        this.orgApacheFelixJettyGzipIncludedMimeTypes = orgApacheFelixJettyGzipIncludedMimeTypes;
        this.orgApacheFelixJettyGzipExcludedMimeTypes = orgApacheFelixJettyGzipExcludedMimeTypes;
        this.orgApacheFelixHttpSessionInvalidate = orgApacheFelixHttpSessionInvalidate;
        this.orgApacheFelixHttpSessionUniqueid = orgApacheFelixHttpSessionUniqueid;
    }



    /**
     * Get orgApacheFelixHttpHost
     * @return orgApacheFelixHttpHost
     */
    public ConfigNodePropertyString getOrgApacheFelixHttpHost() {
        return orgApacheFelixHttpHost;
    }

    public void setOrgApacheFelixHttpHost(ConfigNodePropertyString orgApacheFelixHttpHost) {
        this.orgApacheFelixHttpHost = orgApacheFelixHttpHost;
    }

    /**
     * Get orgApacheFelixHttpEnable
     * @return orgApacheFelixHttpEnable
     */
    public ConfigNodePropertyBoolean getOrgApacheFelixHttpEnable() {
        return orgApacheFelixHttpEnable;
    }

    public void setOrgApacheFelixHttpEnable(ConfigNodePropertyBoolean orgApacheFelixHttpEnable) {
        this.orgApacheFelixHttpEnable = orgApacheFelixHttpEnable;
    }

    /**
     * Get orgOsgiServiceHttpPort
     * @return orgOsgiServiceHttpPort
     */
    public ConfigNodePropertyInteger getOrgOsgiServiceHttpPort() {
        return orgOsgiServiceHttpPort;
    }

    public void setOrgOsgiServiceHttpPort(ConfigNodePropertyInteger orgOsgiServiceHttpPort) {
        this.orgOsgiServiceHttpPort = orgOsgiServiceHttpPort;
    }

    /**
     * Get orgApacheFelixHttpTimeout
     * @return orgApacheFelixHttpTimeout
     */
    public ConfigNodePropertyInteger getOrgApacheFelixHttpTimeout() {
        return orgApacheFelixHttpTimeout;
    }

    public void setOrgApacheFelixHttpTimeout(ConfigNodePropertyInteger orgApacheFelixHttpTimeout) {
        this.orgApacheFelixHttpTimeout = orgApacheFelixHttpTimeout;
    }

    /**
     * Get orgApacheFelixHttpsEnable
     * @return orgApacheFelixHttpsEnable
     */
    public ConfigNodePropertyBoolean getOrgApacheFelixHttpsEnable() {
        return orgApacheFelixHttpsEnable;
    }

    public void setOrgApacheFelixHttpsEnable(ConfigNodePropertyBoolean orgApacheFelixHttpsEnable) {
        this.orgApacheFelixHttpsEnable = orgApacheFelixHttpsEnable;
    }

    /**
     * Get orgOsgiServiceHttpPortSecure
     * @return orgOsgiServiceHttpPortSecure
     */
    public ConfigNodePropertyInteger getOrgOsgiServiceHttpPortSecure() {
        return orgOsgiServiceHttpPortSecure;
    }

    public void setOrgOsgiServiceHttpPortSecure(ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure) {
        this.orgOsgiServiceHttpPortSecure = orgOsgiServiceHttpPortSecure;
    }

    /**
     * Get orgApacheFelixHttpsKeystore
     * @return orgApacheFelixHttpsKeystore
     */
    public ConfigNodePropertyString getOrgApacheFelixHttpsKeystore() {
        return orgApacheFelixHttpsKeystore;
    }

    public void setOrgApacheFelixHttpsKeystore(ConfigNodePropertyString orgApacheFelixHttpsKeystore) {
        this.orgApacheFelixHttpsKeystore = orgApacheFelixHttpsKeystore;
    }

    /**
     * Get orgApacheFelixHttpsKeystorePassword
     * @return orgApacheFelixHttpsKeystorePassword
     */
    public ConfigNodePropertyString getOrgApacheFelixHttpsKeystorePassword() {
        return orgApacheFelixHttpsKeystorePassword;
    }

    public void setOrgApacheFelixHttpsKeystorePassword(ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword) {
        this.orgApacheFelixHttpsKeystorePassword = orgApacheFelixHttpsKeystorePassword;
    }

    /**
     * Get orgApacheFelixHttpsKeystoreKeyPassword
     * @return orgApacheFelixHttpsKeystoreKeyPassword
     */
    public ConfigNodePropertyString getOrgApacheFelixHttpsKeystoreKeyPassword() {
        return orgApacheFelixHttpsKeystoreKeyPassword;
    }

    public void setOrgApacheFelixHttpsKeystoreKeyPassword(ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword) {
        this.orgApacheFelixHttpsKeystoreKeyPassword = orgApacheFelixHttpsKeystoreKeyPassword;
    }

    /**
     * Get orgApacheFelixHttpsTruststore
     * @return orgApacheFelixHttpsTruststore
     */
    public ConfigNodePropertyString getOrgApacheFelixHttpsTruststore() {
        return orgApacheFelixHttpsTruststore;
    }

    public void setOrgApacheFelixHttpsTruststore(ConfigNodePropertyString orgApacheFelixHttpsTruststore) {
        this.orgApacheFelixHttpsTruststore = orgApacheFelixHttpsTruststore;
    }

    /**
     * Get orgApacheFelixHttpsTruststorePassword
     * @return orgApacheFelixHttpsTruststorePassword
     */
    public ConfigNodePropertyString getOrgApacheFelixHttpsTruststorePassword() {
        return orgApacheFelixHttpsTruststorePassword;
    }

    public void setOrgApacheFelixHttpsTruststorePassword(ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword) {
        this.orgApacheFelixHttpsTruststorePassword = orgApacheFelixHttpsTruststorePassword;
    }

    /**
     * Get orgApacheFelixHttpsClientcertificate
     * @return orgApacheFelixHttpsClientcertificate
     */
    public ConfigNodePropertyDropDown getOrgApacheFelixHttpsClientcertificate() {
        return orgApacheFelixHttpsClientcertificate;
    }

    public void setOrgApacheFelixHttpsClientcertificate(ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate) {
        this.orgApacheFelixHttpsClientcertificate = orgApacheFelixHttpsClientcertificate;
    }

    /**
     * Get orgApacheFelixHttpContextPath
     * @return orgApacheFelixHttpContextPath
     */
    public ConfigNodePropertyString getOrgApacheFelixHttpContextPath() {
        return orgApacheFelixHttpContextPath;
    }

    public void setOrgApacheFelixHttpContextPath(ConfigNodePropertyString orgApacheFelixHttpContextPath) {
        this.orgApacheFelixHttpContextPath = orgApacheFelixHttpContextPath;
    }

    /**
     * Get orgApacheFelixHttpMbeans
     * @return orgApacheFelixHttpMbeans
     */
    public ConfigNodePropertyBoolean getOrgApacheFelixHttpMbeans() {
        return orgApacheFelixHttpMbeans;
    }

    public void setOrgApacheFelixHttpMbeans(ConfigNodePropertyBoolean orgApacheFelixHttpMbeans) {
        this.orgApacheFelixHttpMbeans = orgApacheFelixHttpMbeans;
    }

    /**
     * Get orgApacheFelixHttpSessionTimeout
     * @return orgApacheFelixHttpSessionTimeout
     */
    public ConfigNodePropertyInteger getOrgApacheFelixHttpSessionTimeout() {
        return orgApacheFelixHttpSessionTimeout;
    }

    public void setOrgApacheFelixHttpSessionTimeout(ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout) {
        this.orgApacheFelixHttpSessionTimeout = orgApacheFelixHttpSessionTimeout;
    }

    /**
     * Get orgApacheFelixHttpJettyThreadpoolMax
     * @return orgApacheFelixHttpJettyThreadpoolMax
     */
    public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyThreadpoolMax() {
        return orgApacheFelixHttpJettyThreadpoolMax;
    }

    public void setOrgApacheFelixHttpJettyThreadpoolMax(ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax) {
        this.orgApacheFelixHttpJettyThreadpoolMax = orgApacheFelixHttpJettyThreadpoolMax;
    }

    /**
     * Get orgApacheFelixHttpJettyAcceptors
     * @return orgApacheFelixHttpJettyAcceptors
     */
    public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyAcceptors() {
        return orgApacheFelixHttpJettyAcceptors;
    }

    public void setOrgApacheFelixHttpJettyAcceptors(ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors) {
        this.orgApacheFelixHttpJettyAcceptors = orgApacheFelixHttpJettyAcceptors;
    }

    /**
     * Get orgApacheFelixHttpJettySelectors
     * @return orgApacheFelixHttpJettySelectors
     */
    public ConfigNodePropertyInteger getOrgApacheFelixHttpJettySelectors() {
        return orgApacheFelixHttpJettySelectors;
    }

    public void setOrgApacheFelixHttpJettySelectors(ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors) {
        this.orgApacheFelixHttpJettySelectors = orgApacheFelixHttpJettySelectors;
    }

    /**
     * Get orgApacheFelixHttpJettyHeaderBufferSize
     * @return orgApacheFelixHttpJettyHeaderBufferSize
     */
    public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyHeaderBufferSize() {
        return orgApacheFelixHttpJettyHeaderBufferSize;
    }

    public void setOrgApacheFelixHttpJettyHeaderBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize) {
        this.orgApacheFelixHttpJettyHeaderBufferSize = orgApacheFelixHttpJettyHeaderBufferSize;
    }

    /**
     * Get orgApacheFelixHttpJettyRequestBufferSize
     * @return orgApacheFelixHttpJettyRequestBufferSize
     */
    public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyRequestBufferSize() {
        return orgApacheFelixHttpJettyRequestBufferSize;
    }

    public void setOrgApacheFelixHttpJettyRequestBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize) {
        this.orgApacheFelixHttpJettyRequestBufferSize = orgApacheFelixHttpJettyRequestBufferSize;
    }

    /**
     * Get orgApacheFelixHttpJettyResponseBufferSize
     * @return orgApacheFelixHttpJettyResponseBufferSize
     */
    public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyResponseBufferSize() {
        return orgApacheFelixHttpJettyResponseBufferSize;
    }

    public void setOrgApacheFelixHttpJettyResponseBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize) {
        this.orgApacheFelixHttpJettyResponseBufferSize = orgApacheFelixHttpJettyResponseBufferSize;
    }

    /**
     * Get orgApacheFelixHttpJettyMaxFormSize
     * @return orgApacheFelixHttpJettyMaxFormSize
     */
    public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyMaxFormSize() {
        return orgApacheFelixHttpJettyMaxFormSize;
    }

    public void setOrgApacheFelixHttpJettyMaxFormSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize) {
        this.orgApacheFelixHttpJettyMaxFormSize = orgApacheFelixHttpJettyMaxFormSize;
    }

    /**
     * Get orgApacheFelixHttpPathExclusions
     * @return orgApacheFelixHttpPathExclusions
     */
    public ConfigNodePropertyArray getOrgApacheFelixHttpPathExclusions() {
        return orgApacheFelixHttpPathExclusions;
    }

    public void setOrgApacheFelixHttpPathExclusions(ConfigNodePropertyArray orgApacheFelixHttpPathExclusions) {
        this.orgApacheFelixHttpPathExclusions = orgApacheFelixHttpPathExclusions;
    }

    /**
     * Get orgApacheFelixHttpsJettyCiphersuitesExcluded
     * @return orgApacheFelixHttpsJettyCiphersuitesExcluded
     */
    public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyCiphersuitesExcluded() {
        return orgApacheFelixHttpsJettyCiphersuitesExcluded;
    }

    public void setOrgApacheFelixHttpsJettyCiphersuitesExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded) {
        this.orgApacheFelixHttpsJettyCiphersuitesExcluded = orgApacheFelixHttpsJettyCiphersuitesExcluded;
    }

    /**
     * Get orgApacheFelixHttpsJettyCiphersuitesIncluded
     * @return orgApacheFelixHttpsJettyCiphersuitesIncluded
     */
    public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyCiphersuitesIncluded() {
        return orgApacheFelixHttpsJettyCiphersuitesIncluded;
    }

    public void setOrgApacheFelixHttpsJettyCiphersuitesIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded) {
        this.orgApacheFelixHttpsJettyCiphersuitesIncluded = orgApacheFelixHttpsJettyCiphersuitesIncluded;
    }

    /**
     * Get orgApacheFelixHttpJettySendServerHeader
     * @return orgApacheFelixHttpJettySendServerHeader
     */
    public ConfigNodePropertyBoolean getOrgApacheFelixHttpJettySendServerHeader() {
        return orgApacheFelixHttpJettySendServerHeader;
    }

    public void setOrgApacheFelixHttpJettySendServerHeader(ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader) {
        this.orgApacheFelixHttpJettySendServerHeader = orgApacheFelixHttpJettySendServerHeader;
    }

    /**
     * Get orgApacheFelixHttpsJettyProtocolsIncluded
     * @return orgApacheFelixHttpsJettyProtocolsIncluded
     */
    public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyProtocolsIncluded() {
        return orgApacheFelixHttpsJettyProtocolsIncluded;
    }

    public void setOrgApacheFelixHttpsJettyProtocolsIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded) {
        this.orgApacheFelixHttpsJettyProtocolsIncluded = orgApacheFelixHttpsJettyProtocolsIncluded;
    }

    /**
     * Get orgApacheFelixHttpsJettyProtocolsExcluded
     * @return orgApacheFelixHttpsJettyProtocolsExcluded
     */
    public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyProtocolsExcluded() {
        return orgApacheFelixHttpsJettyProtocolsExcluded;
    }

    public void setOrgApacheFelixHttpsJettyProtocolsExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded) {
        this.orgApacheFelixHttpsJettyProtocolsExcluded = orgApacheFelixHttpsJettyProtocolsExcluded;
    }

    /**
     * Get orgApacheFelixProxyLoadBalancerConnectionEnable
     * @return orgApacheFelixProxyLoadBalancerConnectionEnable
     */
    public ConfigNodePropertyBoolean getOrgApacheFelixProxyLoadBalancerConnectionEnable() {
        return orgApacheFelixProxyLoadBalancerConnectionEnable;
    }

    public void setOrgApacheFelixProxyLoadBalancerConnectionEnable(ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable) {
        this.orgApacheFelixProxyLoadBalancerConnectionEnable = orgApacheFelixProxyLoadBalancerConnectionEnable;
    }

    /**
     * Get orgApacheFelixHttpsJettyRenegotiateAllowed
     * @return orgApacheFelixHttpsJettyRenegotiateAllowed
     */
    public ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettyRenegotiateAllowed() {
        return orgApacheFelixHttpsJettyRenegotiateAllowed;
    }

    public void setOrgApacheFelixHttpsJettyRenegotiateAllowed(ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed) {
        this.orgApacheFelixHttpsJettyRenegotiateAllowed = orgApacheFelixHttpsJettyRenegotiateAllowed;
    }

    /**
     * Get orgApacheFelixHttpsJettySessionCookieHttpOnly
     * @return orgApacheFelixHttpsJettySessionCookieHttpOnly
     */
    public ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettySessionCookieHttpOnly() {
        return orgApacheFelixHttpsJettySessionCookieHttpOnly;
    }

    public void setOrgApacheFelixHttpsJettySessionCookieHttpOnly(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly) {
        this.orgApacheFelixHttpsJettySessionCookieHttpOnly = orgApacheFelixHttpsJettySessionCookieHttpOnly;
    }

    /**
     * Get orgApacheFelixHttpsJettySessionCookieSecure
     * @return orgApacheFelixHttpsJettySessionCookieSecure
     */
    public ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettySessionCookieSecure() {
        return orgApacheFelixHttpsJettySessionCookieSecure;
    }

    public void setOrgApacheFelixHttpsJettySessionCookieSecure(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure) {
        this.orgApacheFelixHttpsJettySessionCookieSecure = orgApacheFelixHttpsJettySessionCookieSecure;
    }

    /**
     * Get orgEclipseJettyServletSessionIdPathParameterName
     * @return orgEclipseJettyServletSessionIdPathParameterName
     */
    public ConfigNodePropertyString getOrgEclipseJettyServletSessionIdPathParameterName() {
        return orgEclipseJettyServletSessionIdPathParameterName;
    }

    public void setOrgEclipseJettyServletSessionIdPathParameterName(ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName) {
        this.orgEclipseJettyServletSessionIdPathParameterName = orgEclipseJettyServletSessionIdPathParameterName;
    }

    /**
     * Get orgEclipseJettyServletCheckingRemoteSessionIdEncoding
     * @return orgEclipseJettyServletCheckingRemoteSessionIdEncoding
     */
    public ConfigNodePropertyBoolean getOrgEclipseJettyServletCheckingRemoteSessionIdEncoding() {
        return orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
    }

    public void setOrgEclipseJettyServletCheckingRemoteSessionIdEncoding(ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding) {
        this.orgEclipseJettyServletCheckingRemoteSessionIdEncoding = orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
    }

    /**
     * Get orgEclipseJettyServletSessionCookie
     * @return orgEclipseJettyServletSessionCookie
     */
    public ConfigNodePropertyString getOrgEclipseJettyServletSessionCookie() {
        return orgEclipseJettyServletSessionCookie;
    }

    public void setOrgEclipseJettyServletSessionCookie(ConfigNodePropertyString orgEclipseJettyServletSessionCookie) {
        this.orgEclipseJettyServletSessionCookie = orgEclipseJettyServletSessionCookie;
    }

    /**
     * Get orgEclipseJettyServletSessionDomain
     * @return orgEclipseJettyServletSessionDomain
     */
    public ConfigNodePropertyString getOrgEclipseJettyServletSessionDomain() {
        return orgEclipseJettyServletSessionDomain;
    }

    public void setOrgEclipseJettyServletSessionDomain(ConfigNodePropertyString orgEclipseJettyServletSessionDomain) {
        this.orgEclipseJettyServletSessionDomain = orgEclipseJettyServletSessionDomain;
    }

    /**
     * Get orgEclipseJettyServletSessionPath
     * @return orgEclipseJettyServletSessionPath
     */
    public ConfigNodePropertyString getOrgEclipseJettyServletSessionPath() {
        return orgEclipseJettyServletSessionPath;
    }

    public void setOrgEclipseJettyServletSessionPath(ConfigNodePropertyString orgEclipseJettyServletSessionPath) {
        this.orgEclipseJettyServletSessionPath = orgEclipseJettyServletSessionPath;
    }

    /**
     * Get orgEclipseJettyServletMaxAge
     * @return orgEclipseJettyServletMaxAge
     */
    public ConfigNodePropertyInteger getOrgEclipseJettyServletMaxAge() {
        return orgEclipseJettyServletMaxAge;
    }

    public void setOrgEclipseJettyServletMaxAge(ConfigNodePropertyInteger orgEclipseJettyServletMaxAge) {
        this.orgEclipseJettyServletMaxAge = orgEclipseJettyServletMaxAge;
    }

    /**
     * Get orgApacheFelixHttpName
     * @return orgApacheFelixHttpName
     */
    public ConfigNodePropertyString getOrgApacheFelixHttpName() {
        return orgApacheFelixHttpName;
    }

    public void setOrgApacheFelixHttpName(ConfigNodePropertyString orgApacheFelixHttpName) {
        this.orgApacheFelixHttpName = orgApacheFelixHttpName;
    }

    /**
     * Get orgApacheFelixJettyGziphandlerEnable
     * @return orgApacheFelixJettyGziphandlerEnable
     */
    public ConfigNodePropertyBoolean getOrgApacheFelixJettyGziphandlerEnable() {
        return orgApacheFelixJettyGziphandlerEnable;
    }

    public void setOrgApacheFelixJettyGziphandlerEnable(ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable) {
        this.orgApacheFelixJettyGziphandlerEnable = orgApacheFelixJettyGziphandlerEnable;
    }

    /**
     * Get orgApacheFelixJettyGzipMinGzipSize
     * @return orgApacheFelixJettyGzipMinGzipSize
     */
    public ConfigNodePropertyInteger getOrgApacheFelixJettyGzipMinGzipSize() {
        return orgApacheFelixJettyGzipMinGzipSize;
    }

    public void setOrgApacheFelixJettyGzipMinGzipSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize) {
        this.orgApacheFelixJettyGzipMinGzipSize = orgApacheFelixJettyGzipMinGzipSize;
    }

    /**
     * Get orgApacheFelixJettyGzipCompressionLevel
     * @return orgApacheFelixJettyGzipCompressionLevel
     */
    public ConfigNodePropertyInteger getOrgApacheFelixJettyGzipCompressionLevel() {
        return orgApacheFelixJettyGzipCompressionLevel;
    }

    public void setOrgApacheFelixJettyGzipCompressionLevel(ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel) {
        this.orgApacheFelixJettyGzipCompressionLevel = orgApacheFelixJettyGzipCompressionLevel;
    }

    /**
     * Get orgApacheFelixJettyGzipInflateBufferSize
     * @return orgApacheFelixJettyGzipInflateBufferSize
     */
    public ConfigNodePropertyInteger getOrgApacheFelixJettyGzipInflateBufferSize() {
        return orgApacheFelixJettyGzipInflateBufferSize;
    }

    public void setOrgApacheFelixJettyGzipInflateBufferSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize) {
        this.orgApacheFelixJettyGzipInflateBufferSize = orgApacheFelixJettyGzipInflateBufferSize;
    }

    /**
     * Get orgApacheFelixJettyGzipSyncFlush
     * @return orgApacheFelixJettyGzipSyncFlush
     */
    public ConfigNodePropertyBoolean getOrgApacheFelixJettyGzipSyncFlush() {
        return orgApacheFelixJettyGzipSyncFlush;
    }

    public void setOrgApacheFelixJettyGzipSyncFlush(ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush) {
        this.orgApacheFelixJettyGzipSyncFlush = orgApacheFelixJettyGzipSyncFlush;
    }

    /**
     * Get orgApacheFelixJettyGzipExcludedUserAgents
     * @return orgApacheFelixJettyGzipExcludedUserAgents
     */
    public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedUserAgents() {
        return orgApacheFelixJettyGzipExcludedUserAgents;
    }

    public void setOrgApacheFelixJettyGzipExcludedUserAgents(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents) {
        this.orgApacheFelixJettyGzipExcludedUserAgents = orgApacheFelixJettyGzipExcludedUserAgents;
    }

    /**
     * Get orgApacheFelixJettyGzipIncludedMethods
     * @return orgApacheFelixJettyGzipIncludedMethods
     */
    public ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedMethods() {
        return orgApacheFelixJettyGzipIncludedMethods;
    }

    public void setOrgApacheFelixJettyGzipIncludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods) {
        this.orgApacheFelixJettyGzipIncludedMethods = orgApacheFelixJettyGzipIncludedMethods;
    }

    /**
     * Get orgApacheFelixJettyGzipExcludedMethods
     * @return orgApacheFelixJettyGzipExcludedMethods
     */
    public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedMethods() {
        return orgApacheFelixJettyGzipExcludedMethods;
    }

    public void setOrgApacheFelixJettyGzipExcludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods) {
        this.orgApacheFelixJettyGzipExcludedMethods = orgApacheFelixJettyGzipExcludedMethods;
    }

    /**
     * Get orgApacheFelixJettyGzipIncludedPaths
     * @return orgApacheFelixJettyGzipIncludedPaths
     */
    public ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedPaths() {
        return orgApacheFelixJettyGzipIncludedPaths;
    }

    public void setOrgApacheFelixJettyGzipIncludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths) {
        this.orgApacheFelixJettyGzipIncludedPaths = orgApacheFelixJettyGzipIncludedPaths;
    }

    /**
     * Get orgApacheFelixJettyGzipExcludedPaths
     * @return orgApacheFelixJettyGzipExcludedPaths
     */
    public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedPaths() {
        return orgApacheFelixJettyGzipExcludedPaths;
    }

    public void setOrgApacheFelixJettyGzipExcludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths) {
        this.orgApacheFelixJettyGzipExcludedPaths = orgApacheFelixJettyGzipExcludedPaths;
    }

    /**
     * Get orgApacheFelixJettyGzipIncludedMimeTypes
     * @return orgApacheFelixJettyGzipIncludedMimeTypes
     */
    public ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedMimeTypes() {
        return orgApacheFelixJettyGzipIncludedMimeTypes;
    }

    public void setOrgApacheFelixJettyGzipIncludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes) {
        this.orgApacheFelixJettyGzipIncludedMimeTypes = orgApacheFelixJettyGzipIncludedMimeTypes;
    }

    /**
     * Get orgApacheFelixJettyGzipExcludedMimeTypes
     * @return orgApacheFelixJettyGzipExcludedMimeTypes
     */
    public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedMimeTypes() {
        return orgApacheFelixJettyGzipExcludedMimeTypes;
    }

    public void setOrgApacheFelixJettyGzipExcludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes) {
        this.orgApacheFelixJettyGzipExcludedMimeTypes = orgApacheFelixJettyGzipExcludedMimeTypes;
    }

    /**
     * Get orgApacheFelixHttpSessionInvalidate
     * @return orgApacheFelixHttpSessionInvalidate
     */
    public ConfigNodePropertyBoolean getOrgApacheFelixHttpSessionInvalidate() {
        return orgApacheFelixHttpSessionInvalidate;
    }

    public void setOrgApacheFelixHttpSessionInvalidate(ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate) {
        this.orgApacheFelixHttpSessionInvalidate = orgApacheFelixHttpSessionInvalidate;
    }

    /**
     * Get orgApacheFelixHttpSessionUniqueid
     * @return orgApacheFelixHttpSessionUniqueid
     */
    public ConfigNodePropertyBoolean getOrgApacheFelixHttpSessionUniqueid() {
        return orgApacheFelixHttpSessionUniqueid;
    }

    public void setOrgApacheFelixHttpSessionUniqueid(ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid) {
        this.orgApacheFelixHttpSessionUniqueid = orgApacheFelixHttpSessionUniqueid;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheFelixHttpProperties {\n");
        
        sb.append("    orgApacheFelixHttpHost: ").append(toIndentedString(orgApacheFelixHttpHost)).append("\n");
        sb.append("    orgApacheFelixHttpEnable: ").append(toIndentedString(orgApacheFelixHttpEnable)).append("\n");
        sb.append("    orgOsgiServiceHttpPort: ").append(toIndentedString(orgOsgiServiceHttpPort)).append("\n");
        sb.append("    orgApacheFelixHttpTimeout: ").append(toIndentedString(orgApacheFelixHttpTimeout)).append("\n");
        sb.append("    orgApacheFelixHttpsEnable: ").append(toIndentedString(orgApacheFelixHttpsEnable)).append("\n");
        sb.append("    orgOsgiServiceHttpPortSecure: ").append(toIndentedString(orgOsgiServiceHttpPortSecure)).append("\n");
        sb.append("    orgApacheFelixHttpsKeystore: ").append(toIndentedString(orgApacheFelixHttpsKeystore)).append("\n");
        sb.append("    orgApacheFelixHttpsKeystorePassword: ").append(toIndentedString(orgApacheFelixHttpsKeystorePassword)).append("\n");
        sb.append("    orgApacheFelixHttpsKeystoreKeyPassword: ").append(toIndentedString(orgApacheFelixHttpsKeystoreKeyPassword)).append("\n");
        sb.append("    orgApacheFelixHttpsTruststore: ").append(toIndentedString(orgApacheFelixHttpsTruststore)).append("\n");
        sb.append("    orgApacheFelixHttpsTruststorePassword: ").append(toIndentedString(orgApacheFelixHttpsTruststorePassword)).append("\n");
        sb.append("    orgApacheFelixHttpsClientcertificate: ").append(toIndentedString(orgApacheFelixHttpsClientcertificate)).append("\n");
        sb.append("    orgApacheFelixHttpContextPath: ").append(toIndentedString(orgApacheFelixHttpContextPath)).append("\n");
        sb.append("    orgApacheFelixHttpMbeans: ").append(toIndentedString(orgApacheFelixHttpMbeans)).append("\n");
        sb.append("    orgApacheFelixHttpSessionTimeout: ").append(toIndentedString(orgApacheFelixHttpSessionTimeout)).append("\n");
        sb.append("    orgApacheFelixHttpJettyThreadpoolMax: ").append(toIndentedString(orgApacheFelixHttpJettyThreadpoolMax)).append("\n");
        sb.append("    orgApacheFelixHttpJettyAcceptors: ").append(toIndentedString(orgApacheFelixHttpJettyAcceptors)).append("\n");
        sb.append("    orgApacheFelixHttpJettySelectors: ").append(toIndentedString(orgApacheFelixHttpJettySelectors)).append("\n");
        sb.append("    orgApacheFelixHttpJettyHeaderBufferSize: ").append(toIndentedString(orgApacheFelixHttpJettyHeaderBufferSize)).append("\n");
        sb.append("    orgApacheFelixHttpJettyRequestBufferSize: ").append(toIndentedString(orgApacheFelixHttpJettyRequestBufferSize)).append("\n");
        sb.append("    orgApacheFelixHttpJettyResponseBufferSize: ").append(toIndentedString(orgApacheFelixHttpJettyResponseBufferSize)).append("\n");
        sb.append("    orgApacheFelixHttpJettyMaxFormSize: ").append(toIndentedString(orgApacheFelixHttpJettyMaxFormSize)).append("\n");
        sb.append("    orgApacheFelixHttpPathExclusions: ").append(toIndentedString(orgApacheFelixHttpPathExclusions)).append("\n");
        sb.append("    orgApacheFelixHttpsJettyCiphersuitesExcluded: ").append(toIndentedString(orgApacheFelixHttpsJettyCiphersuitesExcluded)).append("\n");
        sb.append("    orgApacheFelixHttpsJettyCiphersuitesIncluded: ").append(toIndentedString(orgApacheFelixHttpsJettyCiphersuitesIncluded)).append("\n");
        sb.append("    orgApacheFelixHttpJettySendServerHeader: ").append(toIndentedString(orgApacheFelixHttpJettySendServerHeader)).append("\n");
        sb.append("    orgApacheFelixHttpsJettyProtocolsIncluded: ").append(toIndentedString(orgApacheFelixHttpsJettyProtocolsIncluded)).append("\n");
        sb.append("    orgApacheFelixHttpsJettyProtocolsExcluded: ").append(toIndentedString(orgApacheFelixHttpsJettyProtocolsExcluded)).append("\n");
        sb.append("    orgApacheFelixProxyLoadBalancerConnectionEnable: ").append(toIndentedString(orgApacheFelixProxyLoadBalancerConnectionEnable)).append("\n");
        sb.append("    orgApacheFelixHttpsJettyRenegotiateAllowed: ").append(toIndentedString(orgApacheFelixHttpsJettyRenegotiateAllowed)).append("\n");
        sb.append("    orgApacheFelixHttpsJettySessionCookieHttpOnly: ").append(toIndentedString(orgApacheFelixHttpsJettySessionCookieHttpOnly)).append("\n");
        sb.append("    orgApacheFelixHttpsJettySessionCookieSecure: ").append(toIndentedString(orgApacheFelixHttpsJettySessionCookieSecure)).append("\n");
        sb.append("    orgEclipseJettyServletSessionIdPathParameterName: ").append(toIndentedString(orgEclipseJettyServletSessionIdPathParameterName)).append("\n");
        sb.append("    orgEclipseJettyServletCheckingRemoteSessionIdEncoding: ").append(toIndentedString(orgEclipseJettyServletCheckingRemoteSessionIdEncoding)).append("\n");
        sb.append("    orgEclipseJettyServletSessionCookie: ").append(toIndentedString(orgEclipseJettyServletSessionCookie)).append("\n");
        sb.append("    orgEclipseJettyServletSessionDomain: ").append(toIndentedString(orgEclipseJettyServletSessionDomain)).append("\n");
        sb.append("    orgEclipseJettyServletSessionPath: ").append(toIndentedString(orgEclipseJettyServletSessionPath)).append("\n");
        sb.append("    orgEclipseJettyServletMaxAge: ").append(toIndentedString(orgEclipseJettyServletMaxAge)).append("\n");
        sb.append("    orgApacheFelixHttpName: ").append(toIndentedString(orgApacheFelixHttpName)).append("\n");
        sb.append("    orgApacheFelixJettyGziphandlerEnable: ").append(toIndentedString(orgApacheFelixJettyGziphandlerEnable)).append("\n");
        sb.append("    orgApacheFelixJettyGzipMinGzipSize: ").append(toIndentedString(orgApacheFelixJettyGzipMinGzipSize)).append("\n");
        sb.append("    orgApacheFelixJettyGzipCompressionLevel: ").append(toIndentedString(orgApacheFelixJettyGzipCompressionLevel)).append("\n");
        sb.append("    orgApacheFelixJettyGzipInflateBufferSize: ").append(toIndentedString(orgApacheFelixJettyGzipInflateBufferSize)).append("\n");
        sb.append("    orgApacheFelixJettyGzipSyncFlush: ").append(toIndentedString(orgApacheFelixJettyGzipSyncFlush)).append("\n");
        sb.append("    orgApacheFelixJettyGzipExcludedUserAgents: ").append(toIndentedString(orgApacheFelixJettyGzipExcludedUserAgents)).append("\n");
        sb.append("    orgApacheFelixJettyGzipIncludedMethods: ").append(toIndentedString(orgApacheFelixJettyGzipIncludedMethods)).append("\n");
        sb.append("    orgApacheFelixJettyGzipExcludedMethods: ").append(toIndentedString(orgApacheFelixJettyGzipExcludedMethods)).append("\n");
        sb.append("    orgApacheFelixJettyGzipIncludedPaths: ").append(toIndentedString(orgApacheFelixJettyGzipIncludedPaths)).append("\n");
        sb.append("    orgApacheFelixJettyGzipExcludedPaths: ").append(toIndentedString(orgApacheFelixJettyGzipExcludedPaths)).append("\n");
        sb.append("    orgApacheFelixJettyGzipIncludedMimeTypes: ").append(toIndentedString(orgApacheFelixJettyGzipIncludedMimeTypes)).append("\n");
        sb.append("    orgApacheFelixJettyGzipExcludedMimeTypes: ").append(toIndentedString(orgApacheFelixJettyGzipExcludedMimeTypes)).append("\n");
        sb.append("    orgApacheFelixHttpSessionInvalidate: ").append(toIndentedString(orgApacheFelixHttpSessionInvalidate)).append("\n");
        sb.append("    orgApacheFelixHttpSessionUniqueid: ").append(toIndentedString(orgApacheFelixHttpSessionUniqueid)).append("\n");
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

