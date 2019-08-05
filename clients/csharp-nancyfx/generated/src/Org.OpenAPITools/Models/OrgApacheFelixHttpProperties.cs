using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixHttpProperties
    /// </summary>
    public sealed class OrgApacheFelixHttpProperties:  IEquatable<OrgApacheFelixHttpProperties>
    { 
        /// <summary>
        /// OrgApacheFelixHttpHost
        /// </summary>
        public ConfigNodePropertyString OrgApacheFelixHttpHost { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpEnable
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheFelixHttpEnable { get; private set; }

        /// <summary>
        /// OrgOsgiServiceHttpPort
        /// </summary>
        public ConfigNodePropertyInteger OrgOsgiServiceHttpPort { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpTimeout
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheFelixHttpTimeout { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpsEnable
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheFelixHttpsEnable { get; private set; }

        /// <summary>
        /// OrgOsgiServiceHttpPortSecure
        /// </summary>
        public ConfigNodePropertyInteger OrgOsgiServiceHttpPortSecure { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpsKeystore
        /// </summary>
        public ConfigNodePropertyString OrgApacheFelixHttpsKeystore { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpsKeystorePassword
        /// </summary>
        public ConfigNodePropertyString OrgApacheFelixHttpsKeystorePassword { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpsKeystoreKeyPassword
        /// </summary>
        public ConfigNodePropertyString OrgApacheFelixHttpsKeystoreKeyPassword { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpsTruststore
        /// </summary>
        public ConfigNodePropertyString OrgApacheFelixHttpsTruststore { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpsTruststorePassword
        /// </summary>
        public ConfigNodePropertyString OrgApacheFelixHttpsTruststorePassword { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpsClientcertificate
        /// </summary>
        public ConfigNodePropertyDropDown OrgApacheFelixHttpsClientcertificate { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpContextPath
        /// </summary>
        public ConfigNodePropertyString OrgApacheFelixHttpContextPath { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpMbeans
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheFelixHttpMbeans { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpSessionTimeout
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheFelixHttpSessionTimeout { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpJettyThreadpoolMax
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheFelixHttpJettyThreadpoolMax { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpJettyAcceptors
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheFelixHttpJettyAcceptors { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpJettySelectors
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheFelixHttpJettySelectors { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpJettyHeaderBufferSize
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheFelixHttpJettyHeaderBufferSize { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpJettyRequestBufferSize
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheFelixHttpJettyRequestBufferSize { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpJettyResponseBufferSize
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheFelixHttpJettyResponseBufferSize { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpJettyMaxFormSize
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheFelixHttpJettyMaxFormSize { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpPathExclusions
        /// </summary>
        public ConfigNodePropertyArray OrgApacheFelixHttpPathExclusions { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpsJettyCiphersuitesExcluded
        /// </summary>
        public ConfigNodePropertyArray OrgApacheFelixHttpsJettyCiphersuitesExcluded { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpsJettyCiphersuitesIncluded
        /// </summary>
        public ConfigNodePropertyArray OrgApacheFelixHttpsJettyCiphersuitesIncluded { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpJettySendServerHeader
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheFelixHttpJettySendServerHeader { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpsJettyProtocolsIncluded
        /// </summary>
        public ConfigNodePropertyArray OrgApacheFelixHttpsJettyProtocolsIncluded { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpsJettyProtocolsExcluded
        /// </summary>
        public ConfigNodePropertyArray OrgApacheFelixHttpsJettyProtocolsExcluded { get; private set; }

        /// <summary>
        /// OrgApacheFelixProxyLoadBalancerConnectionEnable
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheFelixProxyLoadBalancerConnectionEnable { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpsJettyRenegotiateAllowed
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheFelixHttpsJettyRenegotiateAllowed { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpsJettySessionCookieHttpOnly
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheFelixHttpsJettySessionCookieHttpOnly { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpsJettySessionCookieSecure
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheFelixHttpsJettySessionCookieSecure { get; private set; }

        /// <summary>
        /// OrgEclipseJettyServletSessionIdPathParameterName
        /// </summary>
        public ConfigNodePropertyString OrgEclipseJettyServletSessionIdPathParameterName { get; private set; }

        /// <summary>
        /// OrgEclipseJettyServletCheckingRemoteSessionIdEncoding
        /// </summary>
        public ConfigNodePropertyBoolean OrgEclipseJettyServletCheckingRemoteSessionIdEncoding { get; private set; }

        /// <summary>
        /// OrgEclipseJettyServletSessionCookie
        /// </summary>
        public ConfigNodePropertyString OrgEclipseJettyServletSessionCookie { get; private set; }

        /// <summary>
        /// OrgEclipseJettyServletSessionDomain
        /// </summary>
        public ConfigNodePropertyString OrgEclipseJettyServletSessionDomain { get; private set; }

        /// <summary>
        /// OrgEclipseJettyServletSessionPath
        /// </summary>
        public ConfigNodePropertyString OrgEclipseJettyServletSessionPath { get; private set; }

        /// <summary>
        /// OrgEclipseJettyServletMaxAge
        /// </summary>
        public ConfigNodePropertyInteger OrgEclipseJettyServletMaxAge { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpName
        /// </summary>
        public ConfigNodePropertyString OrgApacheFelixHttpName { get; private set; }

        /// <summary>
        /// OrgApacheFelixJettyGziphandlerEnable
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheFelixJettyGziphandlerEnable { get; private set; }

        /// <summary>
        /// OrgApacheFelixJettyGzipMinGzipSize
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheFelixJettyGzipMinGzipSize { get; private set; }

        /// <summary>
        /// OrgApacheFelixJettyGzipCompressionLevel
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheFelixJettyGzipCompressionLevel { get; private set; }

        /// <summary>
        /// OrgApacheFelixJettyGzipInflateBufferSize
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheFelixJettyGzipInflateBufferSize { get; private set; }

        /// <summary>
        /// OrgApacheFelixJettyGzipSyncFlush
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheFelixJettyGzipSyncFlush { get; private set; }

        /// <summary>
        /// OrgApacheFelixJettyGzipExcludedUserAgents
        /// </summary>
        public ConfigNodePropertyArray OrgApacheFelixJettyGzipExcludedUserAgents { get; private set; }

        /// <summary>
        /// OrgApacheFelixJettyGzipIncludedMethods
        /// </summary>
        public ConfigNodePropertyArray OrgApacheFelixJettyGzipIncludedMethods { get; private set; }

        /// <summary>
        /// OrgApacheFelixJettyGzipExcludedMethods
        /// </summary>
        public ConfigNodePropertyArray OrgApacheFelixJettyGzipExcludedMethods { get; private set; }

        /// <summary>
        /// OrgApacheFelixJettyGzipIncludedPaths
        /// </summary>
        public ConfigNodePropertyArray OrgApacheFelixJettyGzipIncludedPaths { get; private set; }

        /// <summary>
        /// OrgApacheFelixJettyGzipExcludedPaths
        /// </summary>
        public ConfigNodePropertyArray OrgApacheFelixJettyGzipExcludedPaths { get; private set; }

        /// <summary>
        /// OrgApacheFelixJettyGzipIncludedMimeTypes
        /// </summary>
        public ConfigNodePropertyArray OrgApacheFelixJettyGzipIncludedMimeTypes { get; private set; }

        /// <summary>
        /// OrgApacheFelixJettyGzipExcludedMimeTypes
        /// </summary>
        public ConfigNodePropertyArray OrgApacheFelixJettyGzipExcludedMimeTypes { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpSessionInvalidate
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheFelixHttpSessionInvalidate { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpSessionUniqueid
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheFelixHttpSessionUniqueid { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixHttpProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixHttpProperties()
        {
        }

        private OrgApacheFelixHttpProperties(ConfigNodePropertyString OrgApacheFelixHttpHost, ConfigNodePropertyBoolean OrgApacheFelixHttpEnable, ConfigNodePropertyInteger OrgOsgiServiceHttpPort, ConfigNodePropertyInteger OrgApacheFelixHttpTimeout, ConfigNodePropertyBoolean OrgApacheFelixHttpsEnable, ConfigNodePropertyInteger OrgOsgiServiceHttpPortSecure, ConfigNodePropertyString OrgApacheFelixHttpsKeystore, ConfigNodePropertyString OrgApacheFelixHttpsKeystorePassword, ConfigNodePropertyString OrgApacheFelixHttpsKeystoreKeyPassword, ConfigNodePropertyString OrgApacheFelixHttpsTruststore, ConfigNodePropertyString OrgApacheFelixHttpsTruststorePassword, ConfigNodePropertyDropDown OrgApacheFelixHttpsClientcertificate, ConfigNodePropertyString OrgApacheFelixHttpContextPath, ConfigNodePropertyBoolean OrgApacheFelixHttpMbeans, ConfigNodePropertyInteger OrgApacheFelixHttpSessionTimeout, ConfigNodePropertyInteger OrgApacheFelixHttpJettyThreadpoolMax, ConfigNodePropertyInteger OrgApacheFelixHttpJettyAcceptors, ConfigNodePropertyInteger OrgApacheFelixHttpJettySelectors, ConfigNodePropertyInteger OrgApacheFelixHttpJettyHeaderBufferSize, ConfigNodePropertyInteger OrgApacheFelixHttpJettyRequestBufferSize, ConfigNodePropertyInteger OrgApacheFelixHttpJettyResponseBufferSize, ConfigNodePropertyInteger OrgApacheFelixHttpJettyMaxFormSize, ConfigNodePropertyArray OrgApacheFelixHttpPathExclusions, ConfigNodePropertyArray OrgApacheFelixHttpsJettyCiphersuitesExcluded, ConfigNodePropertyArray OrgApacheFelixHttpsJettyCiphersuitesIncluded, ConfigNodePropertyBoolean OrgApacheFelixHttpJettySendServerHeader, ConfigNodePropertyArray OrgApacheFelixHttpsJettyProtocolsIncluded, ConfigNodePropertyArray OrgApacheFelixHttpsJettyProtocolsExcluded, ConfigNodePropertyBoolean OrgApacheFelixProxyLoadBalancerConnectionEnable, ConfigNodePropertyBoolean OrgApacheFelixHttpsJettyRenegotiateAllowed, ConfigNodePropertyBoolean OrgApacheFelixHttpsJettySessionCookieHttpOnly, ConfigNodePropertyBoolean OrgApacheFelixHttpsJettySessionCookieSecure, ConfigNodePropertyString OrgEclipseJettyServletSessionIdPathParameterName, ConfigNodePropertyBoolean OrgEclipseJettyServletCheckingRemoteSessionIdEncoding, ConfigNodePropertyString OrgEclipseJettyServletSessionCookie, ConfigNodePropertyString OrgEclipseJettyServletSessionDomain, ConfigNodePropertyString OrgEclipseJettyServletSessionPath, ConfigNodePropertyInteger OrgEclipseJettyServletMaxAge, ConfigNodePropertyString OrgApacheFelixHttpName, ConfigNodePropertyBoolean OrgApacheFelixJettyGziphandlerEnable, ConfigNodePropertyInteger OrgApacheFelixJettyGzipMinGzipSize, ConfigNodePropertyInteger OrgApacheFelixJettyGzipCompressionLevel, ConfigNodePropertyInteger OrgApacheFelixJettyGzipInflateBufferSize, ConfigNodePropertyBoolean OrgApacheFelixJettyGzipSyncFlush, ConfigNodePropertyArray OrgApacheFelixJettyGzipExcludedUserAgents, ConfigNodePropertyArray OrgApacheFelixJettyGzipIncludedMethods, ConfigNodePropertyArray OrgApacheFelixJettyGzipExcludedMethods, ConfigNodePropertyArray OrgApacheFelixJettyGzipIncludedPaths, ConfigNodePropertyArray OrgApacheFelixJettyGzipExcludedPaths, ConfigNodePropertyArray OrgApacheFelixJettyGzipIncludedMimeTypes, ConfigNodePropertyArray OrgApacheFelixJettyGzipExcludedMimeTypes, ConfigNodePropertyBoolean OrgApacheFelixHttpSessionInvalidate, ConfigNodePropertyBoolean OrgApacheFelixHttpSessionUniqueid)
        {
            
            this.OrgApacheFelixHttpHost = OrgApacheFelixHttpHost;
            
            this.OrgApacheFelixHttpEnable = OrgApacheFelixHttpEnable;
            
            this.OrgOsgiServiceHttpPort = OrgOsgiServiceHttpPort;
            
            this.OrgApacheFelixHttpTimeout = OrgApacheFelixHttpTimeout;
            
            this.OrgApacheFelixHttpsEnable = OrgApacheFelixHttpsEnable;
            
            this.OrgOsgiServiceHttpPortSecure = OrgOsgiServiceHttpPortSecure;
            
            this.OrgApacheFelixHttpsKeystore = OrgApacheFelixHttpsKeystore;
            
            this.OrgApacheFelixHttpsKeystorePassword = OrgApacheFelixHttpsKeystorePassword;
            
            this.OrgApacheFelixHttpsKeystoreKeyPassword = OrgApacheFelixHttpsKeystoreKeyPassword;
            
            this.OrgApacheFelixHttpsTruststore = OrgApacheFelixHttpsTruststore;
            
            this.OrgApacheFelixHttpsTruststorePassword = OrgApacheFelixHttpsTruststorePassword;
            
            this.OrgApacheFelixHttpsClientcertificate = OrgApacheFelixHttpsClientcertificate;
            
            this.OrgApacheFelixHttpContextPath = OrgApacheFelixHttpContextPath;
            
            this.OrgApacheFelixHttpMbeans = OrgApacheFelixHttpMbeans;
            
            this.OrgApacheFelixHttpSessionTimeout = OrgApacheFelixHttpSessionTimeout;
            
            this.OrgApacheFelixHttpJettyThreadpoolMax = OrgApacheFelixHttpJettyThreadpoolMax;
            
            this.OrgApacheFelixHttpJettyAcceptors = OrgApacheFelixHttpJettyAcceptors;
            
            this.OrgApacheFelixHttpJettySelectors = OrgApacheFelixHttpJettySelectors;
            
            this.OrgApacheFelixHttpJettyHeaderBufferSize = OrgApacheFelixHttpJettyHeaderBufferSize;
            
            this.OrgApacheFelixHttpJettyRequestBufferSize = OrgApacheFelixHttpJettyRequestBufferSize;
            
            this.OrgApacheFelixHttpJettyResponseBufferSize = OrgApacheFelixHttpJettyResponseBufferSize;
            
            this.OrgApacheFelixHttpJettyMaxFormSize = OrgApacheFelixHttpJettyMaxFormSize;
            
            this.OrgApacheFelixHttpPathExclusions = OrgApacheFelixHttpPathExclusions;
            
            this.OrgApacheFelixHttpsJettyCiphersuitesExcluded = OrgApacheFelixHttpsJettyCiphersuitesExcluded;
            
            this.OrgApacheFelixHttpsJettyCiphersuitesIncluded = OrgApacheFelixHttpsJettyCiphersuitesIncluded;
            
            this.OrgApacheFelixHttpJettySendServerHeader = OrgApacheFelixHttpJettySendServerHeader;
            
            this.OrgApacheFelixHttpsJettyProtocolsIncluded = OrgApacheFelixHttpsJettyProtocolsIncluded;
            
            this.OrgApacheFelixHttpsJettyProtocolsExcluded = OrgApacheFelixHttpsJettyProtocolsExcluded;
            
            this.OrgApacheFelixProxyLoadBalancerConnectionEnable = OrgApacheFelixProxyLoadBalancerConnectionEnable;
            
            this.OrgApacheFelixHttpsJettyRenegotiateAllowed = OrgApacheFelixHttpsJettyRenegotiateAllowed;
            
            this.OrgApacheFelixHttpsJettySessionCookieHttpOnly = OrgApacheFelixHttpsJettySessionCookieHttpOnly;
            
            this.OrgApacheFelixHttpsJettySessionCookieSecure = OrgApacheFelixHttpsJettySessionCookieSecure;
            
            this.OrgEclipseJettyServletSessionIdPathParameterName = OrgEclipseJettyServletSessionIdPathParameterName;
            
            this.OrgEclipseJettyServletCheckingRemoteSessionIdEncoding = OrgEclipseJettyServletCheckingRemoteSessionIdEncoding;
            
            this.OrgEclipseJettyServletSessionCookie = OrgEclipseJettyServletSessionCookie;
            
            this.OrgEclipseJettyServletSessionDomain = OrgEclipseJettyServletSessionDomain;
            
            this.OrgEclipseJettyServletSessionPath = OrgEclipseJettyServletSessionPath;
            
            this.OrgEclipseJettyServletMaxAge = OrgEclipseJettyServletMaxAge;
            
            this.OrgApacheFelixHttpName = OrgApacheFelixHttpName;
            
            this.OrgApacheFelixJettyGziphandlerEnable = OrgApacheFelixJettyGziphandlerEnable;
            
            this.OrgApacheFelixJettyGzipMinGzipSize = OrgApacheFelixJettyGzipMinGzipSize;
            
            this.OrgApacheFelixJettyGzipCompressionLevel = OrgApacheFelixJettyGzipCompressionLevel;
            
            this.OrgApacheFelixJettyGzipInflateBufferSize = OrgApacheFelixJettyGzipInflateBufferSize;
            
            this.OrgApacheFelixJettyGzipSyncFlush = OrgApacheFelixJettyGzipSyncFlush;
            
            this.OrgApacheFelixJettyGzipExcludedUserAgents = OrgApacheFelixJettyGzipExcludedUserAgents;
            
            this.OrgApacheFelixJettyGzipIncludedMethods = OrgApacheFelixJettyGzipIncludedMethods;
            
            this.OrgApacheFelixJettyGzipExcludedMethods = OrgApacheFelixJettyGzipExcludedMethods;
            
            this.OrgApacheFelixJettyGzipIncludedPaths = OrgApacheFelixJettyGzipIncludedPaths;
            
            this.OrgApacheFelixJettyGzipExcludedPaths = OrgApacheFelixJettyGzipExcludedPaths;
            
            this.OrgApacheFelixJettyGzipIncludedMimeTypes = OrgApacheFelixJettyGzipIncludedMimeTypes;
            
            this.OrgApacheFelixJettyGzipExcludedMimeTypes = OrgApacheFelixJettyGzipExcludedMimeTypes;
            
            this.OrgApacheFelixHttpSessionInvalidate = OrgApacheFelixHttpSessionInvalidate;
            
            this.OrgApacheFelixHttpSessionUniqueid = OrgApacheFelixHttpSessionUniqueid;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixHttpProperties.
        /// </summary>
        /// <returns>OrgApacheFelixHttpPropertiesBuilder</returns>
        public static OrgApacheFelixHttpPropertiesBuilder Builder()
        {
            return new OrgApacheFelixHttpPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixHttpPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixHttpPropertiesBuilder</returns>
        public OrgApacheFelixHttpPropertiesBuilder With()
        {
            return Builder()
                .OrgApacheFelixHttpHost(OrgApacheFelixHttpHost)
                .OrgApacheFelixHttpEnable(OrgApacheFelixHttpEnable)
                .OrgOsgiServiceHttpPort(OrgOsgiServiceHttpPort)
                .OrgApacheFelixHttpTimeout(OrgApacheFelixHttpTimeout)
                .OrgApacheFelixHttpsEnable(OrgApacheFelixHttpsEnable)
                .OrgOsgiServiceHttpPortSecure(OrgOsgiServiceHttpPortSecure)
                .OrgApacheFelixHttpsKeystore(OrgApacheFelixHttpsKeystore)
                .OrgApacheFelixHttpsKeystorePassword(OrgApacheFelixHttpsKeystorePassword)
                .OrgApacheFelixHttpsKeystoreKeyPassword(OrgApacheFelixHttpsKeystoreKeyPassword)
                .OrgApacheFelixHttpsTruststore(OrgApacheFelixHttpsTruststore)
                .OrgApacheFelixHttpsTruststorePassword(OrgApacheFelixHttpsTruststorePassword)
                .OrgApacheFelixHttpsClientcertificate(OrgApacheFelixHttpsClientcertificate)
                .OrgApacheFelixHttpContextPath(OrgApacheFelixHttpContextPath)
                .OrgApacheFelixHttpMbeans(OrgApacheFelixHttpMbeans)
                .OrgApacheFelixHttpSessionTimeout(OrgApacheFelixHttpSessionTimeout)
                .OrgApacheFelixHttpJettyThreadpoolMax(OrgApacheFelixHttpJettyThreadpoolMax)
                .OrgApacheFelixHttpJettyAcceptors(OrgApacheFelixHttpJettyAcceptors)
                .OrgApacheFelixHttpJettySelectors(OrgApacheFelixHttpJettySelectors)
                .OrgApacheFelixHttpJettyHeaderBufferSize(OrgApacheFelixHttpJettyHeaderBufferSize)
                .OrgApacheFelixHttpJettyRequestBufferSize(OrgApacheFelixHttpJettyRequestBufferSize)
                .OrgApacheFelixHttpJettyResponseBufferSize(OrgApacheFelixHttpJettyResponseBufferSize)
                .OrgApacheFelixHttpJettyMaxFormSize(OrgApacheFelixHttpJettyMaxFormSize)
                .OrgApacheFelixHttpPathExclusions(OrgApacheFelixHttpPathExclusions)
                .OrgApacheFelixHttpsJettyCiphersuitesExcluded(OrgApacheFelixHttpsJettyCiphersuitesExcluded)
                .OrgApacheFelixHttpsJettyCiphersuitesIncluded(OrgApacheFelixHttpsJettyCiphersuitesIncluded)
                .OrgApacheFelixHttpJettySendServerHeader(OrgApacheFelixHttpJettySendServerHeader)
                .OrgApacheFelixHttpsJettyProtocolsIncluded(OrgApacheFelixHttpsJettyProtocolsIncluded)
                .OrgApacheFelixHttpsJettyProtocolsExcluded(OrgApacheFelixHttpsJettyProtocolsExcluded)
                .OrgApacheFelixProxyLoadBalancerConnectionEnable(OrgApacheFelixProxyLoadBalancerConnectionEnable)
                .OrgApacheFelixHttpsJettyRenegotiateAllowed(OrgApacheFelixHttpsJettyRenegotiateAllowed)
                .OrgApacheFelixHttpsJettySessionCookieHttpOnly(OrgApacheFelixHttpsJettySessionCookieHttpOnly)
                .OrgApacheFelixHttpsJettySessionCookieSecure(OrgApacheFelixHttpsJettySessionCookieSecure)
                .OrgEclipseJettyServletSessionIdPathParameterName(OrgEclipseJettyServletSessionIdPathParameterName)
                .OrgEclipseJettyServletCheckingRemoteSessionIdEncoding(OrgEclipseJettyServletCheckingRemoteSessionIdEncoding)
                .OrgEclipseJettyServletSessionCookie(OrgEclipseJettyServletSessionCookie)
                .OrgEclipseJettyServletSessionDomain(OrgEclipseJettyServletSessionDomain)
                .OrgEclipseJettyServletSessionPath(OrgEclipseJettyServletSessionPath)
                .OrgEclipseJettyServletMaxAge(OrgEclipseJettyServletMaxAge)
                .OrgApacheFelixHttpName(OrgApacheFelixHttpName)
                .OrgApacheFelixJettyGziphandlerEnable(OrgApacheFelixJettyGziphandlerEnable)
                .OrgApacheFelixJettyGzipMinGzipSize(OrgApacheFelixJettyGzipMinGzipSize)
                .OrgApacheFelixJettyGzipCompressionLevel(OrgApacheFelixJettyGzipCompressionLevel)
                .OrgApacheFelixJettyGzipInflateBufferSize(OrgApacheFelixJettyGzipInflateBufferSize)
                .OrgApacheFelixJettyGzipSyncFlush(OrgApacheFelixJettyGzipSyncFlush)
                .OrgApacheFelixJettyGzipExcludedUserAgents(OrgApacheFelixJettyGzipExcludedUserAgents)
                .OrgApacheFelixJettyGzipIncludedMethods(OrgApacheFelixJettyGzipIncludedMethods)
                .OrgApacheFelixJettyGzipExcludedMethods(OrgApacheFelixJettyGzipExcludedMethods)
                .OrgApacheFelixJettyGzipIncludedPaths(OrgApacheFelixJettyGzipIncludedPaths)
                .OrgApacheFelixJettyGzipExcludedPaths(OrgApacheFelixJettyGzipExcludedPaths)
                .OrgApacheFelixJettyGzipIncludedMimeTypes(OrgApacheFelixJettyGzipIncludedMimeTypes)
                .OrgApacheFelixJettyGzipExcludedMimeTypes(OrgApacheFelixJettyGzipExcludedMimeTypes)
                .OrgApacheFelixHttpSessionInvalidate(OrgApacheFelixHttpSessionInvalidate)
                .OrgApacheFelixHttpSessionUniqueid(OrgApacheFelixHttpSessionUniqueid);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheFelixHttpProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixHttpProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixHttpProperties</param>
        /// <param name="right">Compared (OrgApacheFelixHttpProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixHttpProperties left, OrgApacheFelixHttpProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixHttpProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixHttpProperties</param>
        /// <param name="right">Compared (OrgApacheFelixHttpProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixHttpProperties left, OrgApacheFelixHttpProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixHttpProperties.
        /// </summary>
        public sealed class OrgApacheFelixHttpPropertiesBuilder
        {
            private ConfigNodePropertyString _OrgApacheFelixHttpHost;
            private ConfigNodePropertyBoolean _OrgApacheFelixHttpEnable;
            private ConfigNodePropertyInteger _OrgOsgiServiceHttpPort;
            private ConfigNodePropertyInteger _OrgApacheFelixHttpTimeout;
            private ConfigNodePropertyBoolean _OrgApacheFelixHttpsEnable;
            private ConfigNodePropertyInteger _OrgOsgiServiceHttpPortSecure;
            private ConfigNodePropertyString _OrgApacheFelixHttpsKeystore;
            private ConfigNodePropertyString _OrgApacheFelixHttpsKeystorePassword;
            private ConfigNodePropertyString _OrgApacheFelixHttpsKeystoreKeyPassword;
            private ConfigNodePropertyString _OrgApacheFelixHttpsTruststore;
            private ConfigNodePropertyString _OrgApacheFelixHttpsTruststorePassword;
            private ConfigNodePropertyDropDown _OrgApacheFelixHttpsClientcertificate;
            private ConfigNodePropertyString _OrgApacheFelixHttpContextPath;
            private ConfigNodePropertyBoolean _OrgApacheFelixHttpMbeans;
            private ConfigNodePropertyInteger _OrgApacheFelixHttpSessionTimeout;
            private ConfigNodePropertyInteger _OrgApacheFelixHttpJettyThreadpoolMax;
            private ConfigNodePropertyInteger _OrgApacheFelixHttpJettyAcceptors;
            private ConfigNodePropertyInteger _OrgApacheFelixHttpJettySelectors;
            private ConfigNodePropertyInteger _OrgApacheFelixHttpJettyHeaderBufferSize;
            private ConfigNodePropertyInteger _OrgApacheFelixHttpJettyRequestBufferSize;
            private ConfigNodePropertyInteger _OrgApacheFelixHttpJettyResponseBufferSize;
            private ConfigNodePropertyInteger _OrgApacheFelixHttpJettyMaxFormSize;
            private ConfigNodePropertyArray _OrgApacheFelixHttpPathExclusions;
            private ConfigNodePropertyArray _OrgApacheFelixHttpsJettyCiphersuitesExcluded;
            private ConfigNodePropertyArray _OrgApacheFelixHttpsJettyCiphersuitesIncluded;
            private ConfigNodePropertyBoolean _OrgApacheFelixHttpJettySendServerHeader;
            private ConfigNodePropertyArray _OrgApacheFelixHttpsJettyProtocolsIncluded;
            private ConfigNodePropertyArray _OrgApacheFelixHttpsJettyProtocolsExcluded;
            private ConfigNodePropertyBoolean _OrgApacheFelixProxyLoadBalancerConnectionEnable;
            private ConfigNodePropertyBoolean _OrgApacheFelixHttpsJettyRenegotiateAllowed;
            private ConfigNodePropertyBoolean _OrgApacheFelixHttpsJettySessionCookieHttpOnly;
            private ConfigNodePropertyBoolean _OrgApacheFelixHttpsJettySessionCookieSecure;
            private ConfigNodePropertyString _OrgEclipseJettyServletSessionIdPathParameterName;
            private ConfigNodePropertyBoolean _OrgEclipseJettyServletCheckingRemoteSessionIdEncoding;
            private ConfigNodePropertyString _OrgEclipseJettyServletSessionCookie;
            private ConfigNodePropertyString _OrgEclipseJettyServletSessionDomain;
            private ConfigNodePropertyString _OrgEclipseJettyServletSessionPath;
            private ConfigNodePropertyInteger _OrgEclipseJettyServletMaxAge;
            private ConfigNodePropertyString _OrgApacheFelixHttpName;
            private ConfigNodePropertyBoolean _OrgApacheFelixJettyGziphandlerEnable;
            private ConfigNodePropertyInteger _OrgApacheFelixJettyGzipMinGzipSize;
            private ConfigNodePropertyInteger _OrgApacheFelixJettyGzipCompressionLevel;
            private ConfigNodePropertyInteger _OrgApacheFelixJettyGzipInflateBufferSize;
            private ConfigNodePropertyBoolean _OrgApacheFelixJettyGzipSyncFlush;
            private ConfigNodePropertyArray _OrgApacheFelixJettyGzipExcludedUserAgents;
            private ConfigNodePropertyArray _OrgApacheFelixJettyGzipIncludedMethods;
            private ConfigNodePropertyArray _OrgApacheFelixJettyGzipExcludedMethods;
            private ConfigNodePropertyArray _OrgApacheFelixJettyGzipIncludedPaths;
            private ConfigNodePropertyArray _OrgApacheFelixJettyGzipExcludedPaths;
            private ConfigNodePropertyArray _OrgApacheFelixJettyGzipIncludedMimeTypes;
            private ConfigNodePropertyArray _OrgApacheFelixJettyGzipExcludedMimeTypes;
            private ConfigNodePropertyBoolean _OrgApacheFelixHttpSessionInvalidate;
            private ConfigNodePropertyBoolean _OrgApacheFelixHttpSessionUniqueid;

            internal OrgApacheFelixHttpPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpHost property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpHost</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpHost(ConfigNodePropertyString value)
            {
                _OrgApacheFelixHttpHost = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpEnable property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpEnable</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpEnable(ConfigNodePropertyBoolean value)
            {
                _OrgApacheFelixHttpEnable = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgOsgiServiceHttpPort property.
            /// </summary>
            /// <param name="value">OrgOsgiServiceHttpPort</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgOsgiServiceHttpPort(ConfigNodePropertyInteger value)
            {
                _OrgOsgiServiceHttpPort = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpTimeout property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpTimeout</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpTimeout(ConfigNodePropertyInteger value)
            {
                _OrgApacheFelixHttpTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpsEnable property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpsEnable</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpsEnable(ConfigNodePropertyBoolean value)
            {
                _OrgApacheFelixHttpsEnable = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgOsgiServiceHttpPortSecure property.
            /// </summary>
            /// <param name="value">OrgOsgiServiceHttpPortSecure</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgOsgiServiceHttpPortSecure(ConfigNodePropertyInteger value)
            {
                _OrgOsgiServiceHttpPortSecure = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpsKeystore property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpsKeystore</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpsKeystore(ConfigNodePropertyString value)
            {
                _OrgApacheFelixHttpsKeystore = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpsKeystorePassword property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpsKeystorePassword</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpsKeystorePassword(ConfigNodePropertyString value)
            {
                _OrgApacheFelixHttpsKeystorePassword = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpsKeystoreKeyPassword property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpsKeystoreKeyPassword</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpsKeystoreKeyPassword(ConfigNodePropertyString value)
            {
                _OrgApacheFelixHttpsKeystoreKeyPassword = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpsTruststore property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpsTruststore</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpsTruststore(ConfigNodePropertyString value)
            {
                _OrgApacheFelixHttpsTruststore = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpsTruststorePassword property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpsTruststorePassword</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpsTruststorePassword(ConfigNodePropertyString value)
            {
                _OrgApacheFelixHttpsTruststorePassword = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpsClientcertificate property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpsClientcertificate</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpsClientcertificate(ConfigNodePropertyDropDown value)
            {
                _OrgApacheFelixHttpsClientcertificate = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpContextPath property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpContextPath</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpContextPath(ConfigNodePropertyString value)
            {
                _OrgApacheFelixHttpContextPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpMbeans property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpMbeans</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpMbeans(ConfigNodePropertyBoolean value)
            {
                _OrgApacheFelixHttpMbeans = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpSessionTimeout property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpSessionTimeout</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpSessionTimeout(ConfigNodePropertyInteger value)
            {
                _OrgApacheFelixHttpSessionTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpJettyThreadpoolMax property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpJettyThreadpoolMax</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpJettyThreadpoolMax(ConfigNodePropertyInteger value)
            {
                _OrgApacheFelixHttpJettyThreadpoolMax = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpJettyAcceptors property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpJettyAcceptors</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpJettyAcceptors(ConfigNodePropertyInteger value)
            {
                _OrgApacheFelixHttpJettyAcceptors = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpJettySelectors property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpJettySelectors</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpJettySelectors(ConfigNodePropertyInteger value)
            {
                _OrgApacheFelixHttpJettySelectors = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpJettyHeaderBufferSize property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpJettyHeaderBufferSize</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpJettyHeaderBufferSize(ConfigNodePropertyInteger value)
            {
                _OrgApacheFelixHttpJettyHeaderBufferSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpJettyRequestBufferSize property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpJettyRequestBufferSize</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpJettyRequestBufferSize(ConfigNodePropertyInteger value)
            {
                _OrgApacheFelixHttpJettyRequestBufferSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpJettyResponseBufferSize property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpJettyResponseBufferSize</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpJettyResponseBufferSize(ConfigNodePropertyInteger value)
            {
                _OrgApacheFelixHttpJettyResponseBufferSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpJettyMaxFormSize property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpJettyMaxFormSize</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpJettyMaxFormSize(ConfigNodePropertyInteger value)
            {
                _OrgApacheFelixHttpJettyMaxFormSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpPathExclusions property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpPathExclusions</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpPathExclusions(ConfigNodePropertyArray value)
            {
                _OrgApacheFelixHttpPathExclusions = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpsJettyCiphersuitesExcluded property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpsJettyCiphersuitesExcluded</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpsJettyCiphersuitesExcluded(ConfigNodePropertyArray value)
            {
                _OrgApacheFelixHttpsJettyCiphersuitesExcluded = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpsJettyCiphersuitesIncluded property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpsJettyCiphersuitesIncluded</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpsJettyCiphersuitesIncluded(ConfigNodePropertyArray value)
            {
                _OrgApacheFelixHttpsJettyCiphersuitesIncluded = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpJettySendServerHeader property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpJettySendServerHeader</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpJettySendServerHeader(ConfigNodePropertyBoolean value)
            {
                _OrgApacheFelixHttpJettySendServerHeader = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpsJettyProtocolsIncluded property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpsJettyProtocolsIncluded</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpsJettyProtocolsIncluded(ConfigNodePropertyArray value)
            {
                _OrgApacheFelixHttpsJettyProtocolsIncluded = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpsJettyProtocolsExcluded property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpsJettyProtocolsExcluded</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpsJettyProtocolsExcluded(ConfigNodePropertyArray value)
            {
                _OrgApacheFelixHttpsJettyProtocolsExcluded = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixProxyLoadBalancerConnectionEnable property.
            /// </summary>
            /// <param name="value">OrgApacheFelixProxyLoadBalancerConnectionEnable</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixProxyLoadBalancerConnectionEnable(ConfigNodePropertyBoolean value)
            {
                _OrgApacheFelixProxyLoadBalancerConnectionEnable = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpsJettyRenegotiateAllowed property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpsJettyRenegotiateAllowed</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpsJettyRenegotiateAllowed(ConfigNodePropertyBoolean value)
            {
                _OrgApacheFelixHttpsJettyRenegotiateAllowed = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpsJettySessionCookieHttpOnly property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpsJettySessionCookieHttpOnly</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpsJettySessionCookieHttpOnly(ConfigNodePropertyBoolean value)
            {
                _OrgApacheFelixHttpsJettySessionCookieHttpOnly = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpsJettySessionCookieSecure property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpsJettySessionCookieSecure</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpsJettySessionCookieSecure(ConfigNodePropertyBoolean value)
            {
                _OrgApacheFelixHttpsJettySessionCookieSecure = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgEclipseJettyServletSessionIdPathParameterName property.
            /// </summary>
            /// <param name="value">OrgEclipseJettyServletSessionIdPathParameterName</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgEclipseJettyServletSessionIdPathParameterName(ConfigNodePropertyString value)
            {
                _OrgEclipseJettyServletSessionIdPathParameterName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgEclipseJettyServletCheckingRemoteSessionIdEncoding property.
            /// </summary>
            /// <param name="value">OrgEclipseJettyServletCheckingRemoteSessionIdEncoding</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgEclipseJettyServletCheckingRemoteSessionIdEncoding(ConfigNodePropertyBoolean value)
            {
                _OrgEclipseJettyServletCheckingRemoteSessionIdEncoding = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgEclipseJettyServletSessionCookie property.
            /// </summary>
            /// <param name="value">OrgEclipseJettyServletSessionCookie</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgEclipseJettyServletSessionCookie(ConfigNodePropertyString value)
            {
                _OrgEclipseJettyServletSessionCookie = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgEclipseJettyServletSessionDomain property.
            /// </summary>
            /// <param name="value">OrgEclipseJettyServletSessionDomain</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgEclipseJettyServletSessionDomain(ConfigNodePropertyString value)
            {
                _OrgEclipseJettyServletSessionDomain = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgEclipseJettyServletSessionPath property.
            /// </summary>
            /// <param name="value">OrgEclipseJettyServletSessionPath</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgEclipseJettyServletSessionPath(ConfigNodePropertyString value)
            {
                _OrgEclipseJettyServletSessionPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgEclipseJettyServletMaxAge property.
            /// </summary>
            /// <param name="value">OrgEclipseJettyServletMaxAge</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgEclipseJettyServletMaxAge(ConfigNodePropertyInteger value)
            {
                _OrgEclipseJettyServletMaxAge = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpName property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpName</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpName(ConfigNodePropertyString value)
            {
                _OrgApacheFelixHttpName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixJettyGziphandlerEnable property.
            /// </summary>
            /// <param name="value">OrgApacheFelixJettyGziphandlerEnable</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixJettyGziphandlerEnable(ConfigNodePropertyBoolean value)
            {
                _OrgApacheFelixJettyGziphandlerEnable = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixJettyGzipMinGzipSize property.
            /// </summary>
            /// <param name="value">OrgApacheFelixJettyGzipMinGzipSize</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixJettyGzipMinGzipSize(ConfigNodePropertyInteger value)
            {
                _OrgApacheFelixJettyGzipMinGzipSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixJettyGzipCompressionLevel property.
            /// </summary>
            /// <param name="value">OrgApacheFelixJettyGzipCompressionLevel</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixJettyGzipCompressionLevel(ConfigNodePropertyInteger value)
            {
                _OrgApacheFelixJettyGzipCompressionLevel = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixJettyGzipInflateBufferSize property.
            /// </summary>
            /// <param name="value">OrgApacheFelixJettyGzipInflateBufferSize</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixJettyGzipInflateBufferSize(ConfigNodePropertyInteger value)
            {
                _OrgApacheFelixJettyGzipInflateBufferSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixJettyGzipSyncFlush property.
            /// </summary>
            /// <param name="value">OrgApacheFelixJettyGzipSyncFlush</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixJettyGzipSyncFlush(ConfigNodePropertyBoolean value)
            {
                _OrgApacheFelixJettyGzipSyncFlush = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixJettyGzipExcludedUserAgents property.
            /// </summary>
            /// <param name="value">OrgApacheFelixJettyGzipExcludedUserAgents</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixJettyGzipExcludedUserAgents(ConfigNodePropertyArray value)
            {
                _OrgApacheFelixJettyGzipExcludedUserAgents = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixJettyGzipIncludedMethods property.
            /// </summary>
            /// <param name="value">OrgApacheFelixJettyGzipIncludedMethods</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixJettyGzipIncludedMethods(ConfigNodePropertyArray value)
            {
                _OrgApacheFelixJettyGzipIncludedMethods = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixJettyGzipExcludedMethods property.
            /// </summary>
            /// <param name="value">OrgApacheFelixJettyGzipExcludedMethods</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixJettyGzipExcludedMethods(ConfigNodePropertyArray value)
            {
                _OrgApacheFelixJettyGzipExcludedMethods = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixJettyGzipIncludedPaths property.
            /// </summary>
            /// <param name="value">OrgApacheFelixJettyGzipIncludedPaths</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixJettyGzipIncludedPaths(ConfigNodePropertyArray value)
            {
                _OrgApacheFelixJettyGzipIncludedPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixJettyGzipExcludedPaths property.
            /// </summary>
            /// <param name="value">OrgApacheFelixJettyGzipExcludedPaths</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixJettyGzipExcludedPaths(ConfigNodePropertyArray value)
            {
                _OrgApacheFelixJettyGzipExcludedPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixJettyGzipIncludedMimeTypes property.
            /// </summary>
            /// <param name="value">OrgApacheFelixJettyGzipIncludedMimeTypes</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixJettyGzipIncludedMimeTypes(ConfigNodePropertyArray value)
            {
                _OrgApacheFelixJettyGzipIncludedMimeTypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixJettyGzipExcludedMimeTypes property.
            /// </summary>
            /// <param name="value">OrgApacheFelixJettyGzipExcludedMimeTypes</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixJettyGzipExcludedMimeTypes(ConfigNodePropertyArray value)
            {
                _OrgApacheFelixJettyGzipExcludedMimeTypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpSessionInvalidate property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpSessionInvalidate</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpSessionInvalidate(ConfigNodePropertyBoolean value)
            {
                _OrgApacheFelixHttpSessionInvalidate = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpProperties.OrgApacheFelixHttpSessionUniqueid property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpSessionUniqueid</param>
            public OrgApacheFelixHttpPropertiesBuilder OrgApacheFelixHttpSessionUniqueid(ConfigNodePropertyBoolean value)
            {
                _OrgApacheFelixHttpSessionUniqueid = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixHttpProperties.
            /// </summary>
            /// <returns>OrgApacheFelixHttpProperties</returns>
            public OrgApacheFelixHttpProperties Build()
            {
                Validate();
                return new OrgApacheFelixHttpProperties(
                    OrgApacheFelixHttpHost: _OrgApacheFelixHttpHost,
                    OrgApacheFelixHttpEnable: _OrgApacheFelixHttpEnable,
                    OrgOsgiServiceHttpPort: _OrgOsgiServiceHttpPort,
                    OrgApacheFelixHttpTimeout: _OrgApacheFelixHttpTimeout,
                    OrgApacheFelixHttpsEnable: _OrgApacheFelixHttpsEnable,
                    OrgOsgiServiceHttpPortSecure: _OrgOsgiServiceHttpPortSecure,
                    OrgApacheFelixHttpsKeystore: _OrgApacheFelixHttpsKeystore,
                    OrgApacheFelixHttpsKeystorePassword: _OrgApacheFelixHttpsKeystorePassword,
                    OrgApacheFelixHttpsKeystoreKeyPassword: _OrgApacheFelixHttpsKeystoreKeyPassword,
                    OrgApacheFelixHttpsTruststore: _OrgApacheFelixHttpsTruststore,
                    OrgApacheFelixHttpsTruststorePassword: _OrgApacheFelixHttpsTruststorePassword,
                    OrgApacheFelixHttpsClientcertificate: _OrgApacheFelixHttpsClientcertificate,
                    OrgApacheFelixHttpContextPath: _OrgApacheFelixHttpContextPath,
                    OrgApacheFelixHttpMbeans: _OrgApacheFelixHttpMbeans,
                    OrgApacheFelixHttpSessionTimeout: _OrgApacheFelixHttpSessionTimeout,
                    OrgApacheFelixHttpJettyThreadpoolMax: _OrgApacheFelixHttpJettyThreadpoolMax,
                    OrgApacheFelixHttpJettyAcceptors: _OrgApacheFelixHttpJettyAcceptors,
                    OrgApacheFelixHttpJettySelectors: _OrgApacheFelixHttpJettySelectors,
                    OrgApacheFelixHttpJettyHeaderBufferSize: _OrgApacheFelixHttpJettyHeaderBufferSize,
                    OrgApacheFelixHttpJettyRequestBufferSize: _OrgApacheFelixHttpJettyRequestBufferSize,
                    OrgApacheFelixHttpJettyResponseBufferSize: _OrgApacheFelixHttpJettyResponseBufferSize,
                    OrgApacheFelixHttpJettyMaxFormSize: _OrgApacheFelixHttpJettyMaxFormSize,
                    OrgApacheFelixHttpPathExclusions: _OrgApacheFelixHttpPathExclusions,
                    OrgApacheFelixHttpsJettyCiphersuitesExcluded: _OrgApacheFelixHttpsJettyCiphersuitesExcluded,
                    OrgApacheFelixHttpsJettyCiphersuitesIncluded: _OrgApacheFelixHttpsJettyCiphersuitesIncluded,
                    OrgApacheFelixHttpJettySendServerHeader: _OrgApacheFelixHttpJettySendServerHeader,
                    OrgApacheFelixHttpsJettyProtocolsIncluded: _OrgApacheFelixHttpsJettyProtocolsIncluded,
                    OrgApacheFelixHttpsJettyProtocolsExcluded: _OrgApacheFelixHttpsJettyProtocolsExcluded,
                    OrgApacheFelixProxyLoadBalancerConnectionEnable: _OrgApacheFelixProxyLoadBalancerConnectionEnable,
                    OrgApacheFelixHttpsJettyRenegotiateAllowed: _OrgApacheFelixHttpsJettyRenegotiateAllowed,
                    OrgApacheFelixHttpsJettySessionCookieHttpOnly: _OrgApacheFelixHttpsJettySessionCookieHttpOnly,
                    OrgApacheFelixHttpsJettySessionCookieSecure: _OrgApacheFelixHttpsJettySessionCookieSecure,
                    OrgEclipseJettyServletSessionIdPathParameterName: _OrgEclipseJettyServletSessionIdPathParameterName,
                    OrgEclipseJettyServletCheckingRemoteSessionIdEncoding: _OrgEclipseJettyServletCheckingRemoteSessionIdEncoding,
                    OrgEclipseJettyServletSessionCookie: _OrgEclipseJettyServletSessionCookie,
                    OrgEclipseJettyServletSessionDomain: _OrgEclipseJettyServletSessionDomain,
                    OrgEclipseJettyServletSessionPath: _OrgEclipseJettyServletSessionPath,
                    OrgEclipseJettyServletMaxAge: _OrgEclipseJettyServletMaxAge,
                    OrgApacheFelixHttpName: _OrgApacheFelixHttpName,
                    OrgApacheFelixJettyGziphandlerEnable: _OrgApacheFelixJettyGziphandlerEnable,
                    OrgApacheFelixJettyGzipMinGzipSize: _OrgApacheFelixJettyGzipMinGzipSize,
                    OrgApacheFelixJettyGzipCompressionLevel: _OrgApacheFelixJettyGzipCompressionLevel,
                    OrgApacheFelixJettyGzipInflateBufferSize: _OrgApacheFelixJettyGzipInflateBufferSize,
                    OrgApacheFelixJettyGzipSyncFlush: _OrgApacheFelixJettyGzipSyncFlush,
                    OrgApacheFelixJettyGzipExcludedUserAgents: _OrgApacheFelixJettyGzipExcludedUserAgents,
                    OrgApacheFelixJettyGzipIncludedMethods: _OrgApacheFelixJettyGzipIncludedMethods,
                    OrgApacheFelixJettyGzipExcludedMethods: _OrgApacheFelixJettyGzipExcludedMethods,
                    OrgApacheFelixJettyGzipIncludedPaths: _OrgApacheFelixJettyGzipIncludedPaths,
                    OrgApacheFelixJettyGzipExcludedPaths: _OrgApacheFelixJettyGzipExcludedPaths,
                    OrgApacheFelixJettyGzipIncludedMimeTypes: _OrgApacheFelixJettyGzipIncludedMimeTypes,
                    OrgApacheFelixJettyGzipExcludedMimeTypes: _OrgApacheFelixJettyGzipExcludedMimeTypes,
                    OrgApacheFelixHttpSessionInvalidate: _OrgApacheFelixHttpSessionInvalidate,
                    OrgApacheFelixHttpSessionUniqueid: _OrgApacheFelixHttpSessionUniqueid
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}