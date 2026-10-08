@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheFelixHttpProperties(
    @field:JsonProperty("org.apache.felix.http.host")
    val orgApacheFelixHttpHost: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.felix.http.enable")
    val orgApacheFelixHttpEnable: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("org.osgi.service.http.port")
    val orgOsgiServiceHttpPort: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.felix.http.timeout")
    val orgApacheFelixHttpTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.felix.https.enable")
    val orgApacheFelixHttpsEnable: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("org.osgi.service.http.port.secure")
    val orgOsgiServiceHttpPortSecure: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.felix.https.keystore")
    val orgApacheFelixHttpsKeystore: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.felix.https.keystore.password")
    val orgApacheFelixHttpsKeystorePassword: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.felix.https.keystore.key.password")
    val orgApacheFelixHttpsKeystoreKeyPassword: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.felix.https.truststore")
    val orgApacheFelixHttpsTruststore: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.felix.https.truststore.password")
    val orgApacheFelixHttpsTruststorePassword: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.felix.https.clientcertificate")
    val orgApacheFelixHttpsClientcertificate: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("org.apache.felix.http.context_path")
    val orgApacheFelixHttpContextPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.felix.http.mbeans")
    val orgApacheFelixHttpMbeans: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("org.apache.felix.http.session.timeout")
    val orgApacheFelixHttpSessionTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.felix.http.jetty.threadpool.max")
    val orgApacheFelixHttpJettyThreadpoolMax: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.felix.http.jetty.acceptors")
    val orgApacheFelixHttpJettyAcceptors: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.felix.http.jetty.selectors")
    val orgApacheFelixHttpJettySelectors: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.felix.http.jetty.headerBufferSize")
    val orgApacheFelixHttpJettyHeaderBufferSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.felix.http.jetty.requestBufferSize")
    val orgApacheFelixHttpJettyRequestBufferSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.felix.http.jetty.responseBufferSize")
    val orgApacheFelixHttpJettyResponseBufferSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.felix.http.jetty.maxFormSize")
    val orgApacheFelixHttpJettyMaxFormSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.felix.http.path_exclusions")
    val orgApacheFelixHttpPathExclusions: ConfigNodePropertyArray? = null,

    @field:JsonProperty("org.apache.felix.https.jetty.ciphersuites.excluded")
    val orgApacheFelixHttpsJettyCiphersuitesExcluded: ConfigNodePropertyArray? = null,

    @field:JsonProperty("org.apache.felix.https.jetty.ciphersuites.included")
    val orgApacheFelixHttpsJettyCiphersuitesIncluded: ConfigNodePropertyArray? = null,

    @field:JsonProperty("org.apache.felix.http.jetty.sendServerHeader")
    val orgApacheFelixHttpJettySendServerHeader: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("org.apache.felix.https.jetty.protocols.included")
    val orgApacheFelixHttpsJettyProtocolsIncluded: ConfigNodePropertyArray? = null,

    @field:JsonProperty("org.apache.felix.https.jetty.protocols.excluded")
    val orgApacheFelixHttpsJettyProtocolsExcluded: ConfigNodePropertyArray? = null,

    @field:JsonProperty("org.apache.felix.proxy.load.balancer.connection.enable")
    val orgApacheFelixProxyLoadBalancerConnectionEnable: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("org.apache.felix.https.jetty.renegotiateAllowed")
    val orgApacheFelixHttpsJettyRenegotiateAllowed: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("org.apache.felix.https.jetty.session.cookie.httpOnly")
    val orgApacheFelixHttpsJettySessionCookieHttpOnly: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("org.apache.felix.https.jetty.session.cookie.secure")
    val orgApacheFelixHttpsJettySessionCookieSecure: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("org.eclipse.jetty.servlet.SessionIdPathParameterName")
    val orgEclipseJettyServletSessionIdPathParameterName: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding")
    val orgEclipseJettyServletCheckingRemoteSessionIdEncoding: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("org.eclipse.jetty.servlet.SessionCookie")
    val orgEclipseJettyServletSessionCookie: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.eclipse.jetty.servlet.SessionDomain")
    val orgEclipseJettyServletSessionDomain: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.eclipse.jetty.servlet.SessionPath")
    val orgEclipseJettyServletSessionPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.eclipse.jetty.servlet.MaxAge")
    val orgEclipseJettyServletMaxAge: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.felix.http.name")
    val orgApacheFelixHttpName: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.felix.jetty.gziphandler.enable")
    val orgApacheFelixJettyGziphandlerEnable: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("org.apache.felix.jetty.gzip.minGzipSize")
    val orgApacheFelixJettyGzipMinGzipSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.felix.jetty.gzip.compressionLevel")
    val orgApacheFelixJettyGzipCompressionLevel: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.felix.jetty.gzip.inflateBufferSize")
    val orgApacheFelixJettyGzipInflateBufferSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.felix.jetty.gzip.syncFlush")
    val orgApacheFelixJettyGzipSyncFlush: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("org.apache.felix.jetty.gzip.excludedUserAgents")
    val orgApacheFelixJettyGzipExcludedUserAgents: ConfigNodePropertyArray? = null,

    @field:JsonProperty("org.apache.felix.jetty.gzip.includedMethods")
    val orgApacheFelixJettyGzipIncludedMethods: ConfigNodePropertyArray? = null,

    @field:JsonProperty("org.apache.felix.jetty.gzip.excludedMethods")
    val orgApacheFelixJettyGzipExcludedMethods: ConfigNodePropertyArray? = null,

    @field:JsonProperty("org.apache.felix.jetty.gzip.includedPaths")
    val orgApacheFelixJettyGzipIncludedPaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("org.apache.felix.jetty.gzip.excludedPaths")
    val orgApacheFelixJettyGzipExcludedPaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("org.apache.felix.jetty.gzip.includedMimeTypes")
    val orgApacheFelixJettyGzipIncludedMimeTypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("org.apache.felix.jetty.gzip.excludedMimeTypes")
    val orgApacheFelixJettyGzipExcludedMimeTypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("org.apache.felix.http.session.invalidate")
    val orgApacheFelixHttpSessionInvalidate: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("org.apache.felix.http.session.uniqueid")
    val orgApacheFelixHttpSessionUniqueid: ConfigNodePropertyBoolean? = null,

)
