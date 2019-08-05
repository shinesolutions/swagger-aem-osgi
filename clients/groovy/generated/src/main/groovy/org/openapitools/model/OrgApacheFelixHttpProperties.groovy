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
    ConfigNodePropertyString orgApacheFelixHttpHost = null

    ConfigNodePropertyBoolean orgApacheFelixHttpEnable = null

    ConfigNodePropertyInteger orgOsgiServiceHttpPort = null

    ConfigNodePropertyInteger orgApacheFelixHttpTimeout = null

    ConfigNodePropertyBoolean orgApacheFelixHttpsEnable = null

    ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure = null

    ConfigNodePropertyString orgApacheFelixHttpsKeystore = null

    ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword = null

    ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword = null

    ConfigNodePropertyString orgApacheFelixHttpsTruststore = null

    ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword = null

    ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate = null

    ConfigNodePropertyString orgApacheFelixHttpContextPath = null

    ConfigNodePropertyBoolean orgApacheFelixHttpMbeans = null

    ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout = null

    ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax = null

    ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors = null

    ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors = null

    ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize = null

    ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize = null

    ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize = null

    ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize = null

    ConfigNodePropertyArray orgApacheFelixHttpPathExclusions = null

    ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded = null

    ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded = null

    ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader = null

    ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded = null

    ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded = null

    ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable = null

    ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed = null

    ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly = null

    ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure = null

    ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName = null

    ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding = null

    ConfigNodePropertyString orgEclipseJettyServletSessionCookie = null

    ConfigNodePropertyString orgEclipseJettyServletSessionDomain = null

    ConfigNodePropertyString orgEclipseJettyServletSessionPath = null

    ConfigNodePropertyInteger orgEclipseJettyServletMaxAge = null

    ConfigNodePropertyString orgApacheFelixHttpName = null

    ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable = null

    ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize = null

    ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel = null

    ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize = null

    ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush = null

    ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents = null

    ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods = null

    ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods = null

    ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths = null

    ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths = null

    ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes = null

    ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes = null

    ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate = null

    ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid = null

}
