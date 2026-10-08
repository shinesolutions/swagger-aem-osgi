package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheFelixHttpProperties {
    
    ConfigNodePropertyString orgApacheFelixHttpHost
    
    ConfigNodePropertyBoolean orgApacheFelixHttpEnable
    
    ConfigNodePropertyInteger orgOsgiServiceHttpPort
    
    ConfigNodePropertyInteger orgApacheFelixHttpTimeout
    
    ConfigNodePropertyBoolean orgApacheFelixHttpsEnable
    
    ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure
    
    ConfigNodePropertyString orgApacheFelixHttpsKeystore
    
    ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword
    
    ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword
    
    ConfigNodePropertyString orgApacheFelixHttpsTruststore
    
    ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword
    
    ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate
    
    ConfigNodePropertyString orgApacheFelixHttpContextPath
    
    ConfigNodePropertyBoolean orgApacheFelixHttpMbeans
    
    ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout
    
    ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax
    
    ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors
    
    ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors
    
    ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize
    
    ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize
    
    ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize
    
    ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize
    
    ConfigNodePropertyArray orgApacheFelixHttpPathExclusions
    
    ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded
    
    ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded
    
    ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader
    
    ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded
    
    ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded
    
    ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable
    
    ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed
    
    ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly
    
    ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure
    
    ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName
    
    ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding
    
    ConfigNodePropertyString orgEclipseJettyServletSessionCookie
    
    ConfigNodePropertyString orgEclipseJettyServletSessionDomain
    
    ConfigNodePropertyString orgEclipseJettyServletSessionPath
    
    ConfigNodePropertyInteger orgEclipseJettyServletMaxAge
    
    ConfigNodePropertyString orgApacheFelixHttpName
    
    ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable
    
    ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize
    
    ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel
    
    ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize
    
    ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush
    
    ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents
    
    ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods
    
    ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods
    
    ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths
    
    ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths
    
    ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes
    
    ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes
    
    ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate
    
    ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid
}
