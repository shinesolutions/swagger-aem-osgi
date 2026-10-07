namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheFelixHttpProperties =

  //#region OrgApacheFelixHttpProperties

  [<CLIMutable>]
  type OrgApacheFelixHttpProperties = {
    [<JsonProperty(PropertyName = "org.apache.felix.http.host")>]
    OrgApacheFelixHttpHost : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.felix.http.enable")>]
    OrgApacheFelixHttpEnable : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "org.osgi.service.http.port")>]
    OrgOsgiServiceHttpPort : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.felix.http.timeout")>]
    OrgApacheFelixHttpTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.felix.https.enable")>]
    OrgApacheFelixHttpsEnable : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "org.osgi.service.http.port.secure")>]
    OrgOsgiServiceHttpPortSecure : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.felix.https.keystore")>]
    OrgApacheFelixHttpsKeystore : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.felix.https.keystore.password")>]
    OrgApacheFelixHttpsKeystorePassword : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.felix.https.keystore.key.password")>]
    OrgApacheFelixHttpsKeystoreKeyPassword : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.felix.https.truststore")>]
    OrgApacheFelixHttpsTruststore : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.felix.https.truststore.password")>]
    OrgApacheFelixHttpsTruststorePassword : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.felix.https.clientcertificate")>]
    OrgApacheFelixHttpsClientcertificate : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "org.apache.felix.http.context_path")>]
    OrgApacheFelixHttpContextPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.felix.http.mbeans")>]
    OrgApacheFelixHttpMbeans : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "org.apache.felix.http.session.timeout")>]
    OrgApacheFelixHttpSessionTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.felix.http.jetty.threadpool.max")>]
    OrgApacheFelixHttpJettyThreadpoolMax : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.felix.http.jetty.acceptors")>]
    OrgApacheFelixHttpJettyAcceptors : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.felix.http.jetty.selectors")>]
    OrgApacheFelixHttpJettySelectors : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.felix.http.jetty.headerBufferSize")>]
    OrgApacheFelixHttpJettyHeaderBufferSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.felix.http.jetty.requestBufferSize")>]
    OrgApacheFelixHttpJettyRequestBufferSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.felix.http.jetty.responseBufferSize")>]
    OrgApacheFelixHttpJettyResponseBufferSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.felix.http.jetty.maxFormSize")>]
    OrgApacheFelixHttpJettyMaxFormSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.felix.http.path_exclusions")>]
    OrgApacheFelixHttpPathExclusions : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "org.apache.felix.https.jetty.ciphersuites.excluded")>]
    OrgApacheFelixHttpsJettyCiphersuitesExcluded : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "org.apache.felix.https.jetty.ciphersuites.included")>]
    OrgApacheFelixHttpsJettyCiphersuitesIncluded : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "org.apache.felix.http.jetty.sendServerHeader")>]
    OrgApacheFelixHttpJettySendServerHeader : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "org.apache.felix.https.jetty.protocols.included")>]
    OrgApacheFelixHttpsJettyProtocolsIncluded : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "org.apache.felix.https.jetty.protocols.excluded")>]
    OrgApacheFelixHttpsJettyProtocolsExcluded : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "org.apache.felix.proxy.load.balancer.connection.enable")>]
    OrgApacheFelixProxyLoadBalancerConnectionEnable : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "org.apache.felix.https.jetty.renegotiateAllowed")>]
    OrgApacheFelixHttpsJettyRenegotiateAllowed : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "org.apache.felix.https.jetty.session.cookie.httpOnly")>]
    OrgApacheFelixHttpsJettySessionCookieHttpOnly : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "org.apache.felix.https.jetty.session.cookie.secure")>]
    OrgApacheFelixHttpsJettySessionCookieSecure : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "org.eclipse.jetty.servlet.SessionIdPathParameterName")>]
    OrgEclipseJettyServletSessionIdPathParameterName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding")>]
    OrgEclipseJettyServletCheckingRemoteSessionIdEncoding : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "org.eclipse.jetty.servlet.SessionCookie")>]
    OrgEclipseJettyServletSessionCookie : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.eclipse.jetty.servlet.SessionDomain")>]
    OrgEclipseJettyServletSessionDomain : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.eclipse.jetty.servlet.SessionPath")>]
    OrgEclipseJettyServletSessionPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.eclipse.jetty.servlet.MaxAge")>]
    OrgEclipseJettyServletMaxAge : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.felix.http.name")>]
    OrgApacheFelixHttpName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "org.apache.felix.jetty.gziphandler.enable")>]
    OrgApacheFelixJettyGziphandlerEnable : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.minGzipSize")>]
    OrgApacheFelixJettyGzipMinGzipSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.compressionLevel")>]
    OrgApacheFelixJettyGzipCompressionLevel : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.inflateBufferSize")>]
    OrgApacheFelixJettyGzipInflateBufferSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.syncFlush")>]
    OrgApacheFelixJettyGzipSyncFlush : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.excludedUserAgents")>]
    OrgApacheFelixJettyGzipExcludedUserAgents : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.includedMethods")>]
    OrgApacheFelixJettyGzipIncludedMethods : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.excludedMethods")>]
    OrgApacheFelixJettyGzipExcludedMethods : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.includedPaths")>]
    OrgApacheFelixJettyGzipIncludedPaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.excludedPaths")>]
    OrgApacheFelixJettyGzipExcludedPaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.includedMimeTypes")>]
    OrgApacheFelixJettyGzipIncludedMimeTypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.excludedMimeTypes")>]
    OrgApacheFelixJettyGzipExcludedMimeTypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "org.apache.felix.http.session.invalidate")>]
    OrgApacheFelixHttpSessionInvalidate : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "org.apache.felix.http.session.uniqueid")>]
    OrgApacheFelixHttpSessionUniqueid : ConfigNodePropertyBoolean;
  }

  //#endregion
