<?php
/**
 * OrgApacheFelixHttpProperties
 */
namespace OpenAPIServer\Model;

/**
 * OrgApacheFelixHttpProperties
 */
class OrgApacheFelixHttpProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $orgApacheFelixHttpHost */
    private $orgApacheFelixHttpHost;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $orgApacheFelixHttpEnable */
    private $orgApacheFelixHttpEnable;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $orgOsgiServiceHttpPort */
    private $orgOsgiServiceHttpPort;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $orgApacheFelixHttpTimeout */
    private $orgApacheFelixHttpTimeout;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $orgApacheFelixHttpsEnable */
    private $orgApacheFelixHttpsEnable;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $orgOsgiServiceHttpPortSecure */
    private $orgOsgiServiceHttpPortSecure;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $orgApacheFelixHttpsKeystore */
    private $orgApacheFelixHttpsKeystore;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $orgApacheFelixHttpsKeystorePassword */
    private $orgApacheFelixHttpsKeystorePassword;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $orgApacheFelixHttpsKeystoreKeyPassword */
    private $orgApacheFelixHttpsKeystoreKeyPassword;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $orgApacheFelixHttpsTruststore */
    private $orgApacheFelixHttpsTruststore;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $orgApacheFelixHttpsTruststorePassword */
    private $orgApacheFelixHttpsTruststorePassword;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyDropDown $orgApacheFelixHttpsClientcertificate */
    private $orgApacheFelixHttpsClientcertificate;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $orgApacheFelixHttpContextPath */
    private $orgApacheFelixHttpContextPath;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $orgApacheFelixHttpMbeans */
    private $orgApacheFelixHttpMbeans;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $orgApacheFelixHttpSessionTimeout */
    private $orgApacheFelixHttpSessionTimeout;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $orgApacheFelixHttpJettyThreadpoolMax */
    private $orgApacheFelixHttpJettyThreadpoolMax;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $orgApacheFelixHttpJettyAcceptors */
    private $orgApacheFelixHttpJettyAcceptors;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $orgApacheFelixHttpJettySelectors */
    private $orgApacheFelixHttpJettySelectors;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $orgApacheFelixHttpJettyHeaderBufferSize */
    private $orgApacheFelixHttpJettyHeaderBufferSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $orgApacheFelixHttpJettyRequestBufferSize */
    private $orgApacheFelixHttpJettyRequestBufferSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $orgApacheFelixHttpJettyResponseBufferSize */
    private $orgApacheFelixHttpJettyResponseBufferSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $orgApacheFelixHttpJettyMaxFormSize */
    private $orgApacheFelixHttpJettyMaxFormSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $orgApacheFelixHttpPathExclusions */
    private $orgApacheFelixHttpPathExclusions;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $orgApacheFelixHttpsJettyCiphersuitesExcluded */
    private $orgApacheFelixHttpsJettyCiphersuitesExcluded;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $orgApacheFelixHttpsJettyCiphersuitesIncluded */
    private $orgApacheFelixHttpsJettyCiphersuitesIncluded;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $orgApacheFelixHttpJettySendServerHeader */
    private $orgApacheFelixHttpJettySendServerHeader;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $orgApacheFelixHttpsJettyProtocolsIncluded */
    private $orgApacheFelixHttpsJettyProtocolsIncluded;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $orgApacheFelixHttpsJettyProtocolsExcluded */
    private $orgApacheFelixHttpsJettyProtocolsExcluded;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $orgApacheFelixProxyLoadBalancerConnectionEnable */
    private $orgApacheFelixProxyLoadBalancerConnectionEnable;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $orgApacheFelixHttpsJettyRenegotiateAllowed */
    private $orgApacheFelixHttpsJettyRenegotiateAllowed;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $orgApacheFelixHttpsJettySessionCookieHttpOnly */
    private $orgApacheFelixHttpsJettySessionCookieHttpOnly;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $orgApacheFelixHttpsJettySessionCookieSecure */
    private $orgApacheFelixHttpsJettySessionCookieSecure;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $orgEclipseJettyServletSessionIdPathParameterName */
    private $orgEclipseJettyServletSessionIdPathParameterName;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $orgEclipseJettyServletCheckingRemoteSessionIdEncoding */
    private $orgEclipseJettyServletCheckingRemoteSessionIdEncoding;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $orgEclipseJettyServletSessionCookie */
    private $orgEclipseJettyServletSessionCookie;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $orgEclipseJettyServletSessionDomain */
    private $orgEclipseJettyServletSessionDomain;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $orgEclipseJettyServletSessionPath */
    private $orgEclipseJettyServletSessionPath;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $orgEclipseJettyServletMaxAge */
    private $orgEclipseJettyServletMaxAge;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $orgApacheFelixHttpName */
    private $orgApacheFelixHttpName;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $orgApacheFelixJettyGziphandlerEnable */
    private $orgApacheFelixJettyGziphandlerEnable;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $orgApacheFelixJettyGzipMinGzipSize */
    private $orgApacheFelixJettyGzipMinGzipSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $orgApacheFelixJettyGzipCompressionLevel */
    private $orgApacheFelixJettyGzipCompressionLevel;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $orgApacheFelixJettyGzipInflateBufferSize */
    private $orgApacheFelixJettyGzipInflateBufferSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $orgApacheFelixJettyGzipSyncFlush */
    private $orgApacheFelixJettyGzipSyncFlush;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $orgApacheFelixJettyGzipExcludedUserAgents */
    private $orgApacheFelixJettyGzipExcludedUserAgents;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $orgApacheFelixJettyGzipIncludedMethods */
    private $orgApacheFelixJettyGzipIncludedMethods;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $orgApacheFelixJettyGzipExcludedMethods */
    private $orgApacheFelixJettyGzipExcludedMethods;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $orgApacheFelixJettyGzipIncludedPaths */
    private $orgApacheFelixJettyGzipIncludedPaths;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $orgApacheFelixJettyGzipExcludedPaths */
    private $orgApacheFelixJettyGzipExcludedPaths;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $orgApacheFelixJettyGzipIncludedMimeTypes */
    private $orgApacheFelixJettyGzipIncludedMimeTypes;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $orgApacheFelixJettyGzipExcludedMimeTypes */
    private $orgApacheFelixJettyGzipExcludedMimeTypes;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $orgApacheFelixHttpSessionInvalidate */
    private $orgApacheFelixHttpSessionInvalidate;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $orgApacheFelixHttpSessionUniqueid */
    private $orgApacheFelixHttpSessionUniqueid;

}
