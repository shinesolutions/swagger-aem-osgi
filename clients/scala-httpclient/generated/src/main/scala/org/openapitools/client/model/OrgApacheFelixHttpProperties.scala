/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model


case class OrgApacheFelixHttpProperties (
  orgApacheFelixHttpHost: Option[ConfigNodePropertyString] = None,
  orgApacheFelixHttpEnable: Option[ConfigNodePropertyBoolean] = None,
  orgOsgiServiceHttpPort: Option[ConfigNodePropertyInteger] = None,
  orgApacheFelixHttpTimeout: Option[ConfigNodePropertyInteger] = None,
  orgApacheFelixHttpsEnable: Option[ConfigNodePropertyBoolean] = None,
  orgOsgiServiceHttpPortSecure: Option[ConfigNodePropertyInteger] = None,
  orgApacheFelixHttpsKeystore: Option[ConfigNodePropertyString] = None,
  orgApacheFelixHttpsKeystorePassword: Option[ConfigNodePropertyString] = None,
  orgApacheFelixHttpsKeystoreKeyPassword: Option[ConfigNodePropertyString] = None,
  orgApacheFelixHttpsTruststore: Option[ConfigNodePropertyString] = None,
  orgApacheFelixHttpsTruststorePassword: Option[ConfigNodePropertyString] = None,
  orgApacheFelixHttpsClientcertificate: Option[ConfigNodePropertyDropDown] = None,
  orgApacheFelixHttpContextPath: Option[ConfigNodePropertyString] = None,
  orgApacheFelixHttpMbeans: Option[ConfigNodePropertyBoolean] = None,
  orgApacheFelixHttpSessionTimeout: Option[ConfigNodePropertyInteger] = None,
  orgApacheFelixHttpJettyThreadpoolMax: Option[ConfigNodePropertyInteger] = None,
  orgApacheFelixHttpJettyAcceptors: Option[ConfigNodePropertyInteger] = None,
  orgApacheFelixHttpJettySelectors: Option[ConfigNodePropertyInteger] = None,
  orgApacheFelixHttpJettyHeaderBufferSize: Option[ConfigNodePropertyInteger] = None,
  orgApacheFelixHttpJettyRequestBufferSize: Option[ConfigNodePropertyInteger] = None,
  orgApacheFelixHttpJettyResponseBufferSize: Option[ConfigNodePropertyInteger] = None,
  orgApacheFelixHttpJettyMaxFormSize: Option[ConfigNodePropertyInteger] = None,
  orgApacheFelixHttpPathExclusions: Option[ConfigNodePropertyArray] = None,
  orgApacheFelixHttpsJettyCiphersuitesExcluded: Option[ConfigNodePropertyArray] = None,
  orgApacheFelixHttpsJettyCiphersuitesIncluded: Option[ConfigNodePropertyArray] = None,
  orgApacheFelixHttpJettySendServerHeader: Option[ConfigNodePropertyBoolean] = None,
  orgApacheFelixHttpsJettyProtocolsIncluded: Option[ConfigNodePropertyArray] = None,
  orgApacheFelixHttpsJettyProtocolsExcluded: Option[ConfigNodePropertyArray] = None,
  orgApacheFelixProxyLoadBalancerConnectionEnable: Option[ConfigNodePropertyBoolean] = None,
  orgApacheFelixHttpsJettyRenegotiateAllowed: Option[ConfigNodePropertyBoolean] = None,
  orgApacheFelixHttpsJettySessionCookieHttpOnly: Option[ConfigNodePropertyBoolean] = None,
  orgApacheFelixHttpsJettySessionCookieSecure: Option[ConfigNodePropertyBoolean] = None,
  orgEclipseJettyServletSessionIdPathParameterName: Option[ConfigNodePropertyString] = None,
  orgEclipseJettyServletCheckingRemoteSessionIdEncoding: Option[ConfigNodePropertyBoolean] = None,
  orgEclipseJettyServletSessionCookie: Option[ConfigNodePropertyString] = None,
  orgEclipseJettyServletSessionDomain: Option[ConfigNodePropertyString] = None,
  orgEclipseJettyServletSessionPath: Option[ConfigNodePropertyString] = None,
  orgEclipseJettyServletMaxAge: Option[ConfigNodePropertyInteger] = None,
  orgApacheFelixHttpName: Option[ConfigNodePropertyString] = None,
  orgApacheFelixJettyGziphandlerEnable: Option[ConfigNodePropertyBoolean] = None,
  orgApacheFelixJettyGzipMinGzipSize: Option[ConfigNodePropertyInteger] = None,
  orgApacheFelixJettyGzipCompressionLevel: Option[ConfigNodePropertyInteger] = None,
  orgApacheFelixJettyGzipInflateBufferSize: Option[ConfigNodePropertyInteger] = None,
  orgApacheFelixJettyGzipSyncFlush: Option[ConfigNodePropertyBoolean] = None,
  orgApacheFelixJettyGzipExcludedUserAgents: Option[ConfigNodePropertyArray] = None,
  orgApacheFelixJettyGzipIncludedMethods: Option[ConfigNodePropertyArray] = None,
  orgApacheFelixJettyGzipExcludedMethods: Option[ConfigNodePropertyArray] = None,
  orgApacheFelixJettyGzipIncludedPaths: Option[ConfigNodePropertyArray] = None,
  orgApacheFelixJettyGzipExcludedPaths: Option[ConfigNodePropertyArray] = None,
  orgApacheFelixJettyGzipIncludedMimeTypes: Option[ConfigNodePropertyArray] = None,
  orgApacheFelixJettyGzipExcludedMimeTypes: Option[ConfigNodePropertyArray] = None,
  orgApacheFelixHttpSessionInvalidate: Option[ConfigNodePropertyBoolean] = None,
  orgApacheFelixHttpSessionUniqueid: Option[ConfigNodePropertyBoolean] = None
)
