package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheFelixHttpProperties(
    val orgApacheFelixHttpHost: ConfigNodePropertyString? = null,
    val orgApacheFelixHttpEnable: ConfigNodePropertyBoolean? = null,
    val orgOsgiServiceHttpPort: ConfigNodePropertyInteger? = null,
    val orgApacheFelixHttpTimeout: ConfigNodePropertyInteger? = null,
    val orgApacheFelixHttpsEnable: ConfigNodePropertyBoolean? = null,
    val orgOsgiServiceHttpPortSecure: ConfigNodePropertyInteger? = null,
    val orgApacheFelixHttpsKeystore: ConfigNodePropertyString? = null,
    val orgApacheFelixHttpsKeystorePassword: ConfigNodePropertyString? = null,
    val orgApacheFelixHttpsKeystoreKeyPassword: ConfigNodePropertyString? = null,
    val orgApacheFelixHttpsTruststore: ConfigNodePropertyString? = null,
    val orgApacheFelixHttpsTruststorePassword: ConfigNodePropertyString? = null,
    val orgApacheFelixHttpsClientcertificate: ConfigNodePropertyDropDown? = null,
    val orgApacheFelixHttpContextPath: ConfigNodePropertyString? = null,
    val orgApacheFelixHttpMbeans: ConfigNodePropertyBoolean? = null,
    val orgApacheFelixHttpSessionTimeout: ConfigNodePropertyInteger? = null,
    val orgApacheFelixHttpJettyThreadpoolMax: ConfigNodePropertyInteger? = null,
    val orgApacheFelixHttpJettyAcceptors: ConfigNodePropertyInteger? = null,
    val orgApacheFelixHttpJettySelectors: ConfigNodePropertyInteger? = null,
    val orgApacheFelixHttpJettyHeaderBufferSize: ConfigNodePropertyInteger? = null,
    val orgApacheFelixHttpJettyRequestBufferSize: ConfigNodePropertyInteger? = null,
    val orgApacheFelixHttpJettyResponseBufferSize: ConfigNodePropertyInteger? = null,
    val orgApacheFelixHttpJettyMaxFormSize: ConfigNodePropertyInteger? = null,
    val orgApacheFelixHttpPathExclusions: ConfigNodePropertyArray? = null,
    val orgApacheFelixHttpsJettyCiphersuitesExcluded: ConfigNodePropertyArray? = null,
    val orgApacheFelixHttpsJettyCiphersuitesIncluded: ConfigNodePropertyArray? = null,
    val orgApacheFelixHttpJettySendServerHeader: ConfigNodePropertyBoolean? = null,
    val orgApacheFelixHttpsJettyProtocolsIncluded: ConfigNodePropertyArray? = null,
    val orgApacheFelixHttpsJettyProtocolsExcluded: ConfigNodePropertyArray? = null,
    val orgApacheFelixProxyLoadBalancerConnectionEnable: ConfigNodePropertyBoolean? = null,
    val orgApacheFelixHttpsJettyRenegotiateAllowed: ConfigNodePropertyBoolean? = null,
    val orgApacheFelixHttpsJettySessionCookieHttpOnly: ConfigNodePropertyBoolean? = null,
    val orgApacheFelixHttpsJettySessionCookieSecure: ConfigNodePropertyBoolean? = null,
    val orgEclipseJettyServletSessionIdPathParameterName: ConfigNodePropertyString? = null,
    val orgEclipseJettyServletCheckingRemoteSessionIdEncoding: ConfigNodePropertyBoolean? = null,
    val orgEclipseJettyServletSessionCookie: ConfigNodePropertyString? = null,
    val orgEclipseJettyServletSessionDomain: ConfigNodePropertyString? = null,
    val orgEclipseJettyServletSessionPath: ConfigNodePropertyString? = null,
    val orgEclipseJettyServletMaxAge: ConfigNodePropertyInteger? = null,
    val orgApacheFelixHttpName: ConfigNodePropertyString? = null,
    val orgApacheFelixJettyGziphandlerEnable: ConfigNodePropertyBoolean? = null,
    val orgApacheFelixJettyGzipMinGzipSize: ConfigNodePropertyInteger? = null,
    val orgApacheFelixJettyGzipCompressionLevel: ConfigNodePropertyInteger? = null,
    val orgApacheFelixJettyGzipInflateBufferSize: ConfigNodePropertyInteger? = null,
    val orgApacheFelixJettyGzipSyncFlush: ConfigNodePropertyBoolean? = null,
    val orgApacheFelixJettyGzipExcludedUserAgents: ConfigNodePropertyArray? = null,
    val orgApacheFelixJettyGzipIncludedMethods: ConfigNodePropertyArray? = null,
    val orgApacheFelixJettyGzipExcludedMethods: ConfigNodePropertyArray? = null,
    val orgApacheFelixJettyGzipIncludedPaths: ConfigNodePropertyArray? = null,
    val orgApacheFelixJettyGzipExcludedPaths: ConfigNodePropertyArray? = null,
    val orgApacheFelixJettyGzipIncludedMimeTypes: ConfigNodePropertyArray? = null,
    val orgApacheFelixJettyGzipExcludedMimeTypes: ConfigNodePropertyArray? = null,
    val orgApacheFelixHttpSessionInvalidate: ConfigNodePropertyBoolean? = null,
    val orgApacheFelixHttpSessionUniqueid: ConfigNodePropertyBoolean? = null
)
