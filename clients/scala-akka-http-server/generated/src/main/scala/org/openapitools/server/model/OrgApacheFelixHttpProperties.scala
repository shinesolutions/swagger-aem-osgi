package org.openapitools.server.model


/**
 * @param orgApacheFelixHttpHost  for example: ''null''
 * @param orgApacheFelixHttpEnable  for example: ''null''
 * @param orgOsgiServiceHttpPort  for example: ''null''
 * @param orgApacheFelixHttpTimeout  for example: ''null''
 * @param orgApacheFelixHttpsEnable  for example: ''null''
 * @param orgOsgiServiceHttpPortSecure  for example: ''null''
 * @param orgApacheFelixHttpsKeystore  for example: ''null''
 * @param orgApacheFelixHttpsKeystorePassword  for example: ''null''
 * @param orgApacheFelixHttpsKeystoreKeyPassword  for example: ''null''
 * @param orgApacheFelixHttpsTruststore  for example: ''null''
 * @param orgApacheFelixHttpsTruststorePassword  for example: ''null''
 * @param orgApacheFelixHttpsClientcertificate  for example: ''null''
 * @param orgApacheFelixHttpContextPath  for example: ''null''
 * @param orgApacheFelixHttpMbeans  for example: ''null''
 * @param orgApacheFelixHttpSessionTimeout  for example: ''null''
 * @param orgApacheFelixHttpJettyThreadpoolMax  for example: ''null''
 * @param orgApacheFelixHttpJettyAcceptors  for example: ''null''
 * @param orgApacheFelixHttpJettySelectors  for example: ''null''
 * @param orgApacheFelixHttpJettyHeaderBufferSize  for example: ''null''
 * @param orgApacheFelixHttpJettyRequestBufferSize  for example: ''null''
 * @param orgApacheFelixHttpJettyResponseBufferSize  for example: ''null''
 * @param orgApacheFelixHttpJettyMaxFormSize  for example: ''null''
 * @param orgApacheFelixHttpPathExclusions  for example: ''null''
 * @param orgApacheFelixHttpsJettyCiphersuitesExcluded  for example: ''null''
 * @param orgApacheFelixHttpsJettyCiphersuitesIncluded  for example: ''null''
 * @param orgApacheFelixHttpJettySendServerHeader  for example: ''null''
 * @param orgApacheFelixHttpsJettyProtocolsIncluded  for example: ''null''
 * @param orgApacheFelixHttpsJettyProtocolsExcluded  for example: ''null''
 * @param orgApacheFelixProxyLoadBalancerConnectionEnable  for example: ''null''
 * @param orgApacheFelixHttpsJettyRenegotiateAllowed  for example: ''null''
 * @param orgApacheFelixHttpsJettySessionCookieHttpOnly  for example: ''null''
 * @param orgApacheFelixHttpsJettySessionCookieSecure  for example: ''null''
 * @param orgEclipseJettyServletSessionIdPathParameterName  for example: ''null''
 * @param orgEclipseJettyServletCheckingRemoteSessionIdEncoding  for example: ''null''
 * @param orgEclipseJettyServletSessionCookie  for example: ''null''
 * @param orgEclipseJettyServletSessionDomain  for example: ''null''
 * @param orgEclipseJettyServletSessionPath  for example: ''null''
 * @param orgEclipseJettyServletMaxAge  for example: ''null''
 * @param orgApacheFelixHttpName  for example: ''null''
 * @param orgApacheFelixJettyGziphandlerEnable  for example: ''null''
 * @param orgApacheFelixJettyGzipMinGzipSize  for example: ''null''
 * @param orgApacheFelixJettyGzipCompressionLevel  for example: ''null''
 * @param orgApacheFelixJettyGzipInflateBufferSize  for example: ''null''
 * @param orgApacheFelixJettyGzipSyncFlush  for example: ''null''
 * @param orgApacheFelixJettyGzipExcludedUserAgents  for example: ''null''
 * @param orgApacheFelixJettyGzipIncludedMethods  for example: ''null''
 * @param orgApacheFelixJettyGzipExcludedMethods  for example: ''null''
 * @param orgApacheFelixJettyGzipIncludedPaths  for example: ''null''
 * @param orgApacheFelixJettyGzipExcludedPaths  for example: ''null''
 * @param orgApacheFelixJettyGzipIncludedMimeTypes  for example: ''null''
 * @param orgApacheFelixJettyGzipExcludedMimeTypes  for example: ''null''
 * @param orgApacheFelixHttpSessionInvalidate  for example: ''null''
 * @param orgApacheFelixHttpSessionUniqueid  for example: ''null''
*/
final case class OrgApacheFelixHttpProperties (
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

