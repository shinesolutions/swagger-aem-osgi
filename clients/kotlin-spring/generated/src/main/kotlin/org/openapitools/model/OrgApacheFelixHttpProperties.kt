package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyDropDown
import org.openapitools.model.ConfigNodePropertyInteger
import org.openapitools.model.ConfigNodePropertyString
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param orgApacheFelixHttpHost 
 * @param orgApacheFelixHttpEnable 
 * @param orgOsgiServiceHttpPort 
 * @param orgApacheFelixHttpTimeout 
 * @param orgApacheFelixHttpsEnable 
 * @param orgOsgiServiceHttpPortSecure 
 * @param orgApacheFelixHttpsKeystore 
 * @param orgApacheFelixHttpsKeystorePassword 
 * @param orgApacheFelixHttpsKeystoreKeyPassword 
 * @param orgApacheFelixHttpsTruststore 
 * @param orgApacheFelixHttpsTruststorePassword 
 * @param orgApacheFelixHttpsClientcertificate 
 * @param orgApacheFelixHttpContextPath 
 * @param orgApacheFelixHttpMbeans 
 * @param orgApacheFelixHttpSessionTimeout 
 * @param orgApacheFelixHttpJettyThreadpoolMax 
 * @param orgApacheFelixHttpJettyAcceptors 
 * @param orgApacheFelixHttpJettySelectors 
 * @param orgApacheFelixHttpJettyHeaderBufferSize 
 * @param orgApacheFelixHttpJettyRequestBufferSize 
 * @param orgApacheFelixHttpJettyResponseBufferSize 
 * @param orgApacheFelixHttpJettyMaxFormSize 
 * @param orgApacheFelixHttpPathExclusions 
 * @param orgApacheFelixHttpsJettyCiphersuitesExcluded 
 * @param orgApacheFelixHttpsJettyCiphersuitesIncluded 
 * @param orgApacheFelixHttpJettySendServerHeader 
 * @param orgApacheFelixHttpsJettyProtocolsIncluded 
 * @param orgApacheFelixHttpsJettyProtocolsExcluded 
 * @param orgApacheFelixProxyLoadBalancerConnectionEnable 
 * @param orgApacheFelixHttpsJettyRenegotiateAllowed 
 * @param orgApacheFelixHttpsJettySessionCookieHttpOnly 
 * @param orgApacheFelixHttpsJettySessionCookieSecure 
 * @param orgEclipseJettyServletSessionIdPathParameterName 
 * @param orgEclipseJettyServletCheckingRemoteSessionIdEncoding 
 * @param orgEclipseJettyServletSessionCookie 
 * @param orgEclipseJettyServletSessionDomain 
 * @param orgEclipseJettyServletSessionPath 
 * @param orgEclipseJettyServletMaxAge 
 * @param orgApacheFelixHttpName 
 * @param orgApacheFelixJettyGziphandlerEnable 
 * @param orgApacheFelixJettyGzipMinGzipSize 
 * @param orgApacheFelixJettyGzipCompressionLevel 
 * @param orgApacheFelixJettyGzipInflateBufferSize 
 * @param orgApacheFelixJettyGzipSyncFlush 
 * @param orgApacheFelixJettyGzipExcludedUserAgents 
 * @param orgApacheFelixJettyGzipIncludedMethods 
 * @param orgApacheFelixJettyGzipExcludedMethods 
 * @param orgApacheFelixJettyGzipIncludedPaths 
 * @param orgApacheFelixJettyGzipExcludedPaths 
 * @param orgApacheFelixJettyGzipIncludedMimeTypes 
 * @param orgApacheFelixJettyGzipExcludedMimeTypes 
 * @param orgApacheFelixHttpSessionInvalidate 
 * @param orgApacheFelixHttpSessionUniqueid 
 */
data class OrgApacheFelixHttpProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.host")
    @get:JsonProperty("org.apache.felix.http.host") val orgApacheFelixHttpHost: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.enable")
    @get:JsonProperty("org.apache.felix.http.enable") val orgApacheFelixHttpEnable: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.osgi.service.http.port")
    @get:JsonProperty("org.osgi.service.http.port") val orgOsgiServiceHttpPort: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.timeout")
    @get:JsonProperty("org.apache.felix.http.timeout") val orgApacheFelixHttpTimeout: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.https.enable")
    @get:JsonProperty("org.apache.felix.https.enable") val orgApacheFelixHttpsEnable: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.osgi.service.http.port.secure")
    @get:JsonProperty("org.osgi.service.http.port.secure") val orgOsgiServiceHttpPortSecure: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.https.keystore")
    @get:JsonProperty("org.apache.felix.https.keystore") val orgApacheFelixHttpsKeystore: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.https.keystore.password")
    @get:JsonProperty("org.apache.felix.https.keystore.password") val orgApacheFelixHttpsKeystorePassword: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.https.keystore.key.password")
    @get:JsonProperty("org.apache.felix.https.keystore.key.password") val orgApacheFelixHttpsKeystoreKeyPassword: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.https.truststore")
    @get:JsonProperty("org.apache.felix.https.truststore") val orgApacheFelixHttpsTruststore: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.https.truststore.password")
    @get:JsonProperty("org.apache.felix.https.truststore.password") val orgApacheFelixHttpsTruststorePassword: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.https.clientcertificate")
    @get:JsonProperty("org.apache.felix.https.clientcertificate") val orgApacheFelixHttpsClientcertificate: ConfigNodePropertyDropDown? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.context_path")
    @get:JsonProperty("org.apache.felix.http.context_path") val orgApacheFelixHttpContextPath: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.mbeans")
    @get:JsonProperty("org.apache.felix.http.mbeans") val orgApacheFelixHttpMbeans: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.session.timeout")
    @get:JsonProperty("org.apache.felix.http.session.timeout") val orgApacheFelixHttpSessionTimeout: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.jetty.threadpool.max")
    @get:JsonProperty("org.apache.felix.http.jetty.threadpool.max") val orgApacheFelixHttpJettyThreadpoolMax: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.jetty.acceptors")
    @get:JsonProperty("org.apache.felix.http.jetty.acceptors") val orgApacheFelixHttpJettyAcceptors: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.jetty.selectors")
    @get:JsonProperty("org.apache.felix.http.jetty.selectors") val orgApacheFelixHttpJettySelectors: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.jetty.headerBufferSize")
    @get:JsonProperty("org.apache.felix.http.jetty.headerBufferSize") val orgApacheFelixHttpJettyHeaderBufferSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.jetty.requestBufferSize")
    @get:JsonProperty("org.apache.felix.http.jetty.requestBufferSize") val orgApacheFelixHttpJettyRequestBufferSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.jetty.responseBufferSize")
    @get:JsonProperty("org.apache.felix.http.jetty.responseBufferSize") val orgApacheFelixHttpJettyResponseBufferSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.jetty.maxFormSize")
    @get:JsonProperty("org.apache.felix.http.jetty.maxFormSize") val orgApacheFelixHttpJettyMaxFormSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.path_exclusions")
    @get:JsonProperty("org.apache.felix.http.path_exclusions") val orgApacheFelixHttpPathExclusions: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.https.jetty.ciphersuites.excluded")
    @get:JsonProperty("org.apache.felix.https.jetty.ciphersuites.excluded") val orgApacheFelixHttpsJettyCiphersuitesExcluded: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.https.jetty.ciphersuites.included")
    @get:JsonProperty("org.apache.felix.https.jetty.ciphersuites.included") val orgApacheFelixHttpsJettyCiphersuitesIncluded: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.jetty.sendServerHeader")
    @get:JsonProperty("org.apache.felix.http.jetty.sendServerHeader") val orgApacheFelixHttpJettySendServerHeader: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.https.jetty.protocols.included")
    @get:JsonProperty("org.apache.felix.https.jetty.protocols.included") val orgApacheFelixHttpsJettyProtocolsIncluded: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.https.jetty.protocols.excluded")
    @get:JsonProperty("org.apache.felix.https.jetty.protocols.excluded") val orgApacheFelixHttpsJettyProtocolsExcluded: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.proxy.load.balancer.connection.enable")
    @get:JsonProperty("org.apache.felix.proxy.load.balancer.connection.enable") val orgApacheFelixProxyLoadBalancerConnectionEnable: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.https.jetty.renegotiateAllowed")
    @get:JsonProperty("org.apache.felix.https.jetty.renegotiateAllowed") val orgApacheFelixHttpsJettyRenegotiateAllowed: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.https.jetty.session.cookie.httpOnly")
    @get:JsonProperty("org.apache.felix.https.jetty.session.cookie.httpOnly") val orgApacheFelixHttpsJettySessionCookieHttpOnly: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.https.jetty.session.cookie.secure")
    @get:JsonProperty("org.apache.felix.https.jetty.session.cookie.secure") val orgApacheFelixHttpsJettySessionCookieSecure: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.eclipse.jetty.servlet.SessionIdPathParameterName")
    @get:JsonProperty("org.eclipse.jetty.servlet.SessionIdPathParameterName") val orgEclipseJettyServletSessionIdPathParameterName: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding")
    @get:JsonProperty("org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding") val orgEclipseJettyServletCheckingRemoteSessionIdEncoding: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.eclipse.jetty.servlet.SessionCookie")
    @get:JsonProperty("org.eclipse.jetty.servlet.SessionCookie") val orgEclipseJettyServletSessionCookie: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.eclipse.jetty.servlet.SessionDomain")
    @get:JsonProperty("org.eclipse.jetty.servlet.SessionDomain") val orgEclipseJettyServletSessionDomain: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.eclipse.jetty.servlet.SessionPath")
    @get:JsonProperty("org.eclipse.jetty.servlet.SessionPath") val orgEclipseJettyServletSessionPath: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.eclipse.jetty.servlet.MaxAge")
    @get:JsonProperty("org.eclipse.jetty.servlet.MaxAge") val orgEclipseJettyServletMaxAge: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.name")
    @get:JsonProperty("org.apache.felix.http.name") val orgApacheFelixHttpName: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.jetty.gziphandler.enable")
    @get:JsonProperty("org.apache.felix.jetty.gziphandler.enable") val orgApacheFelixJettyGziphandlerEnable: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.jetty.gzip.minGzipSize")
    @get:JsonProperty("org.apache.felix.jetty.gzip.minGzipSize") val orgApacheFelixJettyGzipMinGzipSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.jetty.gzip.compressionLevel")
    @get:JsonProperty("org.apache.felix.jetty.gzip.compressionLevel") val orgApacheFelixJettyGzipCompressionLevel: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.jetty.gzip.inflateBufferSize")
    @get:JsonProperty("org.apache.felix.jetty.gzip.inflateBufferSize") val orgApacheFelixJettyGzipInflateBufferSize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.jetty.gzip.syncFlush")
    @get:JsonProperty("org.apache.felix.jetty.gzip.syncFlush") val orgApacheFelixJettyGzipSyncFlush: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.jetty.gzip.excludedUserAgents")
    @get:JsonProperty("org.apache.felix.jetty.gzip.excludedUserAgents") val orgApacheFelixJettyGzipExcludedUserAgents: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.jetty.gzip.includedMethods")
    @get:JsonProperty("org.apache.felix.jetty.gzip.includedMethods") val orgApacheFelixJettyGzipIncludedMethods: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.jetty.gzip.excludedMethods")
    @get:JsonProperty("org.apache.felix.jetty.gzip.excludedMethods") val orgApacheFelixJettyGzipExcludedMethods: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.jetty.gzip.includedPaths")
    @get:JsonProperty("org.apache.felix.jetty.gzip.includedPaths") val orgApacheFelixJettyGzipIncludedPaths: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.jetty.gzip.excludedPaths")
    @get:JsonProperty("org.apache.felix.jetty.gzip.excludedPaths") val orgApacheFelixJettyGzipExcludedPaths: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.jetty.gzip.includedMimeTypes")
    @get:JsonProperty("org.apache.felix.jetty.gzip.includedMimeTypes") val orgApacheFelixJettyGzipIncludedMimeTypes: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.jetty.gzip.excludedMimeTypes")
    @get:JsonProperty("org.apache.felix.jetty.gzip.excludedMimeTypes") val orgApacheFelixJettyGzipExcludedMimeTypes: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.session.invalidate")
    @get:JsonProperty("org.apache.felix.http.session.invalidate") val orgApacheFelixHttpSessionInvalidate: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("org.apache.felix.http.session.uniqueid")
    @get:JsonProperty("org.apache.felix.http.session.uniqueid") val orgApacheFelixHttpSessionUniqueid: ConfigNodePropertyBoolean? = null
) {

}

