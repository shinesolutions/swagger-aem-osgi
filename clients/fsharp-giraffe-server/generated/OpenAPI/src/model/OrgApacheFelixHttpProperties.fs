namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheFelixHttpProperties =

  //#region OrgApacheFelixHttpProperties


  type orgApacheFelixHttpProperties = {
    OrgApacheFelixHttpHost : ConfigNodePropertyString;
    OrgApacheFelixHttpEnable : ConfigNodePropertyBoolean;
    OrgOsgiServiceHttpPort : ConfigNodePropertyInteger;
    OrgApacheFelixHttpTimeout : ConfigNodePropertyInteger;
    OrgApacheFelixHttpsEnable : ConfigNodePropertyBoolean;
    OrgOsgiServiceHttpPortSecure : ConfigNodePropertyInteger;
    OrgApacheFelixHttpsKeystore : ConfigNodePropertyString;
    OrgApacheFelixHttpsKeystorePassword : ConfigNodePropertyString;
    OrgApacheFelixHttpsKeystoreKeyPassword : ConfigNodePropertyString;
    OrgApacheFelixHttpsTruststore : ConfigNodePropertyString;
    OrgApacheFelixHttpsTruststorePassword : ConfigNodePropertyString;
    OrgApacheFelixHttpsClientcertificate : ConfigNodePropertyDropDown;
    OrgApacheFelixHttpContextPath : ConfigNodePropertyString;
    OrgApacheFelixHttpMbeans : ConfigNodePropertyBoolean;
    OrgApacheFelixHttpSessionTimeout : ConfigNodePropertyInteger;
    OrgApacheFelixHttpJettyThreadpoolMax : ConfigNodePropertyInteger;
    OrgApacheFelixHttpJettyAcceptors : ConfigNodePropertyInteger;
    OrgApacheFelixHttpJettySelectors : ConfigNodePropertyInteger;
    OrgApacheFelixHttpJettyHeaderBufferSize : ConfigNodePropertyInteger;
    OrgApacheFelixHttpJettyRequestBufferSize : ConfigNodePropertyInteger;
    OrgApacheFelixHttpJettyResponseBufferSize : ConfigNodePropertyInteger;
    OrgApacheFelixHttpJettyMaxFormSize : ConfigNodePropertyInteger;
    OrgApacheFelixHttpPathExclusions : ConfigNodePropertyArray;
    OrgApacheFelixHttpsJettyCiphersuitesExcluded : ConfigNodePropertyArray;
    OrgApacheFelixHttpsJettyCiphersuitesIncluded : ConfigNodePropertyArray;
    OrgApacheFelixHttpJettySendServerHeader : ConfigNodePropertyBoolean;
    OrgApacheFelixHttpsJettyProtocolsIncluded : ConfigNodePropertyArray;
    OrgApacheFelixHttpsJettyProtocolsExcluded : ConfigNodePropertyArray;
    OrgApacheFelixProxyLoadBalancerConnectionEnable : ConfigNodePropertyBoolean;
    OrgApacheFelixHttpsJettyRenegotiateAllowed : ConfigNodePropertyBoolean;
    OrgApacheFelixHttpsJettySessionCookieHttpOnly : ConfigNodePropertyBoolean;
    OrgApacheFelixHttpsJettySessionCookieSecure : ConfigNodePropertyBoolean;
    OrgEclipseJettyServletSessionIdPathParameterName : ConfigNodePropertyString;
    OrgEclipseJettyServletCheckingRemoteSessionIdEncoding : ConfigNodePropertyBoolean;
    OrgEclipseJettyServletSessionCookie : ConfigNodePropertyString;
    OrgEclipseJettyServletSessionDomain : ConfigNodePropertyString;
    OrgEclipseJettyServletSessionPath : ConfigNodePropertyString;
    OrgEclipseJettyServletMaxAge : ConfigNodePropertyInteger;
    OrgApacheFelixHttpName : ConfigNodePropertyString;
    OrgApacheFelixJettyGziphandlerEnable : ConfigNodePropertyBoolean;
    OrgApacheFelixJettyGzipMinGzipSize : ConfigNodePropertyInteger;
    OrgApacheFelixJettyGzipCompressionLevel : ConfigNodePropertyInteger;
    OrgApacheFelixJettyGzipInflateBufferSize : ConfigNodePropertyInteger;
    OrgApacheFelixJettyGzipSyncFlush : ConfigNodePropertyBoolean;
    OrgApacheFelixJettyGzipExcludedUserAgents : ConfigNodePropertyArray;
    OrgApacheFelixJettyGzipIncludedMethods : ConfigNodePropertyArray;
    OrgApacheFelixJettyGzipExcludedMethods : ConfigNodePropertyArray;
    OrgApacheFelixJettyGzipIncludedPaths : ConfigNodePropertyArray;
    OrgApacheFelixJettyGzipExcludedPaths : ConfigNodePropertyArray;
    OrgApacheFelixJettyGzipIncludedMimeTypes : ConfigNodePropertyArray;
    OrgApacheFelixJettyGzipExcludedMimeTypes : ConfigNodePropertyArray;
    OrgApacheFelixHttpSessionInvalidate : ConfigNodePropertyBoolean;
    OrgApacheFelixHttpSessionUniqueid : ConfigNodePropertyBoolean;
  }
  //#endregion
