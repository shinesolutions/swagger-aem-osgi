using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class OrgApacheFelixHttpProperties {
    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpHost
    /// </summary>
    [DataMember(Name="org.apache.felix.http.host", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.host")]
    public ConfigNodePropertyString OrgApacheFelixHttpHost { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpEnable
    /// </summary>
    [DataMember(Name="org.apache.felix.http.enable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.enable")]
    public ConfigNodePropertyBoolean OrgApacheFelixHttpEnable { get; set; }

    /// <summary>
    /// Gets or Sets OrgOsgiServiceHttpPort
    /// </summary>
    [DataMember(Name="org.osgi.service.http.port", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.osgi.service.http.port")]
    public ConfigNodePropertyInteger OrgOsgiServiceHttpPort { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpTimeout
    /// </summary>
    [DataMember(Name="org.apache.felix.http.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.timeout")]
    public ConfigNodePropertyInteger OrgApacheFelixHttpTimeout { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpsEnable
    /// </summary>
    [DataMember(Name="org.apache.felix.https.enable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.https.enable")]
    public ConfigNodePropertyBoolean OrgApacheFelixHttpsEnable { get; set; }

    /// <summary>
    /// Gets or Sets OrgOsgiServiceHttpPortSecure
    /// </summary>
    [DataMember(Name="org.osgi.service.http.port.secure", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.osgi.service.http.port.secure")]
    public ConfigNodePropertyInteger OrgOsgiServiceHttpPortSecure { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpsKeystore
    /// </summary>
    [DataMember(Name="org.apache.felix.https.keystore", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.https.keystore")]
    public ConfigNodePropertyString OrgApacheFelixHttpsKeystore { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpsKeystorePassword
    /// </summary>
    [DataMember(Name="org.apache.felix.https.keystore.password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.https.keystore.password")]
    public ConfigNodePropertyString OrgApacheFelixHttpsKeystorePassword { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpsKeystoreKeyPassword
    /// </summary>
    [DataMember(Name="org.apache.felix.https.keystore.key.password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.https.keystore.key.password")]
    public ConfigNodePropertyString OrgApacheFelixHttpsKeystoreKeyPassword { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpsTruststore
    /// </summary>
    [DataMember(Name="org.apache.felix.https.truststore", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.https.truststore")]
    public ConfigNodePropertyString OrgApacheFelixHttpsTruststore { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpsTruststorePassword
    /// </summary>
    [DataMember(Name="org.apache.felix.https.truststore.password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.https.truststore.password")]
    public ConfigNodePropertyString OrgApacheFelixHttpsTruststorePassword { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpsClientcertificate
    /// </summary>
    [DataMember(Name="org.apache.felix.https.clientcertificate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.https.clientcertificate")]
    public ConfigNodePropertyDropDown OrgApacheFelixHttpsClientcertificate { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpContextPath
    /// </summary>
    [DataMember(Name="org.apache.felix.http.context_path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.context_path")]
    public ConfigNodePropertyString OrgApacheFelixHttpContextPath { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpMbeans
    /// </summary>
    [DataMember(Name="org.apache.felix.http.mbeans", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.mbeans")]
    public ConfigNodePropertyBoolean OrgApacheFelixHttpMbeans { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpSessionTimeout
    /// </summary>
    [DataMember(Name="org.apache.felix.http.session.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.session.timeout")]
    public ConfigNodePropertyInteger OrgApacheFelixHttpSessionTimeout { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpJettyThreadpoolMax
    /// </summary>
    [DataMember(Name="org.apache.felix.http.jetty.threadpool.max", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.jetty.threadpool.max")]
    public ConfigNodePropertyInteger OrgApacheFelixHttpJettyThreadpoolMax { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpJettyAcceptors
    /// </summary>
    [DataMember(Name="org.apache.felix.http.jetty.acceptors", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.jetty.acceptors")]
    public ConfigNodePropertyInteger OrgApacheFelixHttpJettyAcceptors { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpJettySelectors
    /// </summary>
    [DataMember(Name="org.apache.felix.http.jetty.selectors", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.jetty.selectors")]
    public ConfigNodePropertyInteger OrgApacheFelixHttpJettySelectors { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpJettyHeaderBufferSize
    /// </summary>
    [DataMember(Name="org.apache.felix.http.jetty.headerBufferSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.jetty.headerBufferSize")]
    public ConfigNodePropertyInteger OrgApacheFelixHttpJettyHeaderBufferSize { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpJettyRequestBufferSize
    /// </summary>
    [DataMember(Name="org.apache.felix.http.jetty.requestBufferSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.jetty.requestBufferSize")]
    public ConfigNodePropertyInteger OrgApacheFelixHttpJettyRequestBufferSize { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpJettyResponseBufferSize
    /// </summary>
    [DataMember(Name="org.apache.felix.http.jetty.responseBufferSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.jetty.responseBufferSize")]
    public ConfigNodePropertyInteger OrgApacheFelixHttpJettyResponseBufferSize { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpJettyMaxFormSize
    /// </summary>
    [DataMember(Name="org.apache.felix.http.jetty.maxFormSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.jetty.maxFormSize")]
    public ConfigNodePropertyInteger OrgApacheFelixHttpJettyMaxFormSize { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpPathExclusions
    /// </summary>
    [DataMember(Name="org.apache.felix.http.path_exclusions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.path_exclusions")]
    public ConfigNodePropertyArray OrgApacheFelixHttpPathExclusions { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpsJettyCiphersuitesExcluded
    /// </summary>
    [DataMember(Name="org.apache.felix.https.jetty.ciphersuites.excluded", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.https.jetty.ciphersuites.excluded")]
    public ConfigNodePropertyArray OrgApacheFelixHttpsJettyCiphersuitesExcluded { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpsJettyCiphersuitesIncluded
    /// </summary>
    [DataMember(Name="org.apache.felix.https.jetty.ciphersuites.included", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.https.jetty.ciphersuites.included")]
    public ConfigNodePropertyArray OrgApacheFelixHttpsJettyCiphersuitesIncluded { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpJettySendServerHeader
    /// </summary>
    [DataMember(Name="org.apache.felix.http.jetty.sendServerHeader", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.jetty.sendServerHeader")]
    public ConfigNodePropertyBoolean OrgApacheFelixHttpJettySendServerHeader { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpsJettyProtocolsIncluded
    /// </summary>
    [DataMember(Name="org.apache.felix.https.jetty.protocols.included", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.https.jetty.protocols.included")]
    public ConfigNodePropertyArray OrgApacheFelixHttpsJettyProtocolsIncluded { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpsJettyProtocolsExcluded
    /// </summary>
    [DataMember(Name="org.apache.felix.https.jetty.protocols.excluded", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.https.jetty.protocols.excluded")]
    public ConfigNodePropertyArray OrgApacheFelixHttpsJettyProtocolsExcluded { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixProxyLoadBalancerConnectionEnable
    /// </summary>
    [DataMember(Name="org.apache.felix.proxy.load.balancer.connection.enable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.proxy.load.balancer.connection.enable")]
    public ConfigNodePropertyBoolean OrgApacheFelixProxyLoadBalancerConnectionEnable { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpsJettyRenegotiateAllowed
    /// </summary>
    [DataMember(Name="org.apache.felix.https.jetty.renegotiateAllowed", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.https.jetty.renegotiateAllowed")]
    public ConfigNodePropertyBoolean OrgApacheFelixHttpsJettyRenegotiateAllowed { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpsJettySessionCookieHttpOnly
    /// </summary>
    [DataMember(Name="org.apache.felix.https.jetty.session.cookie.httpOnly", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.https.jetty.session.cookie.httpOnly")]
    public ConfigNodePropertyBoolean OrgApacheFelixHttpsJettySessionCookieHttpOnly { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpsJettySessionCookieSecure
    /// </summary>
    [DataMember(Name="org.apache.felix.https.jetty.session.cookie.secure", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.https.jetty.session.cookie.secure")]
    public ConfigNodePropertyBoolean OrgApacheFelixHttpsJettySessionCookieSecure { get; set; }

    /// <summary>
    /// Gets or Sets OrgEclipseJettyServletSessionIdPathParameterName
    /// </summary>
    [DataMember(Name="org.eclipse.jetty.servlet.SessionIdPathParameterName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.eclipse.jetty.servlet.SessionIdPathParameterName")]
    public ConfigNodePropertyString OrgEclipseJettyServletSessionIdPathParameterName { get; set; }

    /// <summary>
    /// Gets or Sets OrgEclipseJettyServletCheckingRemoteSessionIdEncoding
    /// </summary>
    [DataMember(Name="org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding")]
    public ConfigNodePropertyBoolean OrgEclipseJettyServletCheckingRemoteSessionIdEncoding { get; set; }

    /// <summary>
    /// Gets or Sets OrgEclipseJettyServletSessionCookie
    /// </summary>
    [DataMember(Name="org.eclipse.jetty.servlet.SessionCookie", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.eclipse.jetty.servlet.SessionCookie")]
    public ConfigNodePropertyString OrgEclipseJettyServletSessionCookie { get; set; }

    /// <summary>
    /// Gets or Sets OrgEclipseJettyServletSessionDomain
    /// </summary>
    [DataMember(Name="org.eclipse.jetty.servlet.SessionDomain", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.eclipse.jetty.servlet.SessionDomain")]
    public ConfigNodePropertyString OrgEclipseJettyServletSessionDomain { get; set; }

    /// <summary>
    /// Gets or Sets OrgEclipseJettyServletSessionPath
    /// </summary>
    [DataMember(Name="org.eclipse.jetty.servlet.SessionPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.eclipse.jetty.servlet.SessionPath")]
    public ConfigNodePropertyString OrgEclipseJettyServletSessionPath { get; set; }

    /// <summary>
    /// Gets or Sets OrgEclipseJettyServletMaxAge
    /// </summary>
    [DataMember(Name="org.eclipse.jetty.servlet.MaxAge", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.eclipse.jetty.servlet.MaxAge")]
    public ConfigNodePropertyInteger OrgEclipseJettyServletMaxAge { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpName
    /// </summary>
    [DataMember(Name="org.apache.felix.http.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.name")]
    public ConfigNodePropertyString OrgApacheFelixHttpName { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixJettyGziphandlerEnable
    /// </summary>
    [DataMember(Name="org.apache.felix.jetty.gziphandler.enable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.jetty.gziphandler.enable")]
    public ConfigNodePropertyBoolean OrgApacheFelixJettyGziphandlerEnable { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixJettyGzipMinGzipSize
    /// </summary>
    [DataMember(Name="org.apache.felix.jetty.gzip.minGzipSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.minGzipSize")]
    public ConfigNodePropertyInteger OrgApacheFelixJettyGzipMinGzipSize { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixJettyGzipCompressionLevel
    /// </summary>
    [DataMember(Name="org.apache.felix.jetty.gzip.compressionLevel", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.compressionLevel")]
    public ConfigNodePropertyInteger OrgApacheFelixJettyGzipCompressionLevel { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixJettyGzipInflateBufferSize
    /// </summary>
    [DataMember(Name="org.apache.felix.jetty.gzip.inflateBufferSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.inflateBufferSize")]
    public ConfigNodePropertyInteger OrgApacheFelixJettyGzipInflateBufferSize { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixJettyGzipSyncFlush
    /// </summary>
    [DataMember(Name="org.apache.felix.jetty.gzip.syncFlush", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.syncFlush")]
    public ConfigNodePropertyBoolean OrgApacheFelixJettyGzipSyncFlush { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixJettyGzipExcludedUserAgents
    /// </summary>
    [DataMember(Name="org.apache.felix.jetty.gzip.excludedUserAgents", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.excludedUserAgents")]
    public ConfigNodePropertyArray OrgApacheFelixJettyGzipExcludedUserAgents { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixJettyGzipIncludedMethods
    /// </summary>
    [DataMember(Name="org.apache.felix.jetty.gzip.includedMethods", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.includedMethods")]
    public ConfigNodePropertyArray OrgApacheFelixJettyGzipIncludedMethods { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixJettyGzipExcludedMethods
    /// </summary>
    [DataMember(Name="org.apache.felix.jetty.gzip.excludedMethods", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.excludedMethods")]
    public ConfigNodePropertyArray OrgApacheFelixJettyGzipExcludedMethods { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixJettyGzipIncludedPaths
    /// </summary>
    [DataMember(Name="org.apache.felix.jetty.gzip.includedPaths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.includedPaths")]
    public ConfigNodePropertyArray OrgApacheFelixJettyGzipIncludedPaths { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixJettyGzipExcludedPaths
    /// </summary>
    [DataMember(Name="org.apache.felix.jetty.gzip.excludedPaths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.excludedPaths")]
    public ConfigNodePropertyArray OrgApacheFelixJettyGzipExcludedPaths { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixJettyGzipIncludedMimeTypes
    /// </summary>
    [DataMember(Name="org.apache.felix.jetty.gzip.includedMimeTypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.includedMimeTypes")]
    public ConfigNodePropertyArray OrgApacheFelixJettyGzipIncludedMimeTypes { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixJettyGzipExcludedMimeTypes
    /// </summary>
    [DataMember(Name="org.apache.felix.jetty.gzip.excludedMimeTypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.jetty.gzip.excludedMimeTypes")]
    public ConfigNodePropertyArray OrgApacheFelixJettyGzipExcludedMimeTypes { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpSessionInvalidate
    /// </summary>
    [DataMember(Name="org.apache.felix.http.session.invalidate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.session.invalidate")]
    public ConfigNodePropertyBoolean OrgApacheFelixHttpSessionInvalidate { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixHttpSessionUniqueid
    /// </summary>
    [DataMember(Name="org.apache.felix.http.session.uniqueid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.http.session.uniqueid")]
    public ConfigNodePropertyBoolean OrgApacheFelixHttpSessionUniqueid { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheFelixHttpProperties {\n");
      sb.Append("  OrgApacheFelixHttpHost: ").Append(OrgApacheFelixHttpHost).Append("\n");
      sb.Append("  OrgApacheFelixHttpEnable: ").Append(OrgApacheFelixHttpEnable).Append("\n");
      sb.Append("  OrgOsgiServiceHttpPort: ").Append(OrgOsgiServiceHttpPort).Append("\n");
      sb.Append("  OrgApacheFelixHttpTimeout: ").Append(OrgApacheFelixHttpTimeout).Append("\n");
      sb.Append("  OrgApacheFelixHttpsEnable: ").Append(OrgApacheFelixHttpsEnable).Append("\n");
      sb.Append("  OrgOsgiServiceHttpPortSecure: ").Append(OrgOsgiServiceHttpPortSecure).Append("\n");
      sb.Append("  OrgApacheFelixHttpsKeystore: ").Append(OrgApacheFelixHttpsKeystore).Append("\n");
      sb.Append("  OrgApacheFelixHttpsKeystorePassword: ").Append(OrgApacheFelixHttpsKeystorePassword).Append("\n");
      sb.Append("  OrgApacheFelixHttpsKeystoreKeyPassword: ").Append(OrgApacheFelixHttpsKeystoreKeyPassword).Append("\n");
      sb.Append("  OrgApacheFelixHttpsTruststore: ").Append(OrgApacheFelixHttpsTruststore).Append("\n");
      sb.Append("  OrgApacheFelixHttpsTruststorePassword: ").Append(OrgApacheFelixHttpsTruststorePassword).Append("\n");
      sb.Append("  OrgApacheFelixHttpsClientcertificate: ").Append(OrgApacheFelixHttpsClientcertificate).Append("\n");
      sb.Append("  OrgApacheFelixHttpContextPath: ").Append(OrgApacheFelixHttpContextPath).Append("\n");
      sb.Append("  OrgApacheFelixHttpMbeans: ").Append(OrgApacheFelixHttpMbeans).Append("\n");
      sb.Append("  OrgApacheFelixHttpSessionTimeout: ").Append(OrgApacheFelixHttpSessionTimeout).Append("\n");
      sb.Append("  OrgApacheFelixHttpJettyThreadpoolMax: ").Append(OrgApacheFelixHttpJettyThreadpoolMax).Append("\n");
      sb.Append("  OrgApacheFelixHttpJettyAcceptors: ").Append(OrgApacheFelixHttpJettyAcceptors).Append("\n");
      sb.Append("  OrgApacheFelixHttpJettySelectors: ").Append(OrgApacheFelixHttpJettySelectors).Append("\n");
      sb.Append("  OrgApacheFelixHttpJettyHeaderBufferSize: ").Append(OrgApacheFelixHttpJettyHeaderBufferSize).Append("\n");
      sb.Append("  OrgApacheFelixHttpJettyRequestBufferSize: ").Append(OrgApacheFelixHttpJettyRequestBufferSize).Append("\n");
      sb.Append("  OrgApacheFelixHttpJettyResponseBufferSize: ").Append(OrgApacheFelixHttpJettyResponseBufferSize).Append("\n");
      sb.Append("  OrgApacheFelixHttpJettyMaxFormSize: ").Append(OrgApacheFelixHttpJettyMaxFormSize).Append("\n");
      sb.Append("  OrgApacheFelixHttpPathExclusions: ").Append(OrgApacheFelixHttpPathExclusions).Append("\n");
      sb.Append("  OrgApacheFelixHttpsJettyCiphersuitesExcluded: ").Append(OrgApacheFelixHttpsJettyCiphersuitesExcluded).Append("\n");
      sb.Append("  OrgApacheFelixHttpsJettyCiphersuitesIncluded: ").Append(OrgApacheFelixHttpsJettyCiphersuitesIncluded).Append("\n");
      sb.Append("  OrgApacheFelixHttpJettySendServerHeader: ").Append(OrgApacheFelixHttpJettySendServerHeader).Append("\n");
      sb.Append("  OrgApacheFelixHttpsJettyProtocolsIncluded: ").Append(OrgApacheFelixHttpsJettyProtocolsIncluded).Append("\n");
      sb.Append("  OrgApacheFelixHttpsJettyProtocolsExcluded: ").Append(OrgApacheFelixHttpsJettyProtocolsExcluded).Append("\n");
      sb.Append("  OrgApacheFelixProxyLoadBalancerConnectionEnable: ").Append(OrgApacheFelixProxyLoadBalancerConnectionEnable).Append("\n");
      sb.Append("  OrgApacheFelixHttpsJettyRenegotiateAllowed: ").Append(OrgApacheFelixHttpsJettyRenegotiateAllowed).Append("\n");
      sb.Append("  OrgApacheFelixHttpsJettySessionCookieHttpOnly: ").Append(OrgApacheFelixHttpsJettySessionCookieHttpOnly).Append("\n");
      sb.Append("  OrgApacheFelixHttpsJettySessionCookieSecure: ").Append(OrgApacheFelixHttpsJettySessionCookieSecure).Append("\n");
      sb.Append("  OrgEclipseJettyServletSessionIdPathParameterName: ").Append(OrgEclipseJettyServletSessionIdPathParameterName).Append("\n");
      sb.Append("  OrgEclipseJettyServletCheckingRemoteSessionIdEncoding: ").Append(OrgEclipseJettyServletCheckingRemoteSessionIdEncoding).Append("\n");
      sb.Append("  OrgEclipseJettyServletSessionCookie: ").Append(OrgEclipseJettyServletSessionCookie).Append("\n");
      sb.Append("  OrgEclipseJettyServletSessionDomain: ").Append(OrgEclipseJettyServletSessionDomain).Append("\n");
      sb.Append("  OrgEclipseJettyServletSessionPath: ").Append(OrgEclipseJettyServletSessionPath).Append("\n");
      sb.Append("  OrgEclipseJettyServletMaxAge: ").Append(OrgEclipseJettyServletMaxAge).Append("\n");
      sb.Append("  OrgApacheFelixHttpName: ").Append(OrgApacheFelixHttpName).Append("\n");
      sb.Append("  OrgApacheFelixJettyGziphandlerEnable: ").Append(OrgApacheFelixJettyGziphandlerEnable).Append("\n");
      sb.Append("  OrgApacheFelixJettyGzipMinGzipSize: ").Append(OrgApacheFelixJettyGzipMinGzipSize).Append("\n");
      sb.Append("  OrgApacheFelixJettyGzipCompressionLevel: ").Append(OrgApacheFelixJettyGzipCompressionLevel).Append("\n");
      sb.Append("  OrgApacheFelixJettyGzipInflateBufferSize: ").Append(OrgApacheFelixJettyGzipInflateBufferSize).Append("\n");
      sb.Append("  OrgApacheFelixJettyGzipSyncFlush: ").Append(OrgApacheFelixJettyGzipSyncFlush).Append("\n");
      sb.Append("  OrgApacheFelixJettyGzipExcludedUserAgents: ").Append(OrgApacheFelixJettyGzipExcludedUserAgents).Append("\n");
      sb.Append("  OrgApacheFelixJettyGzipIncludedMethods: ").Append(OrgApacheFelixJettyGzipIncludedMethods).Append("\n");
      sb.Append("  OrgApacheFelixJettyGzipExcludedMethods: ").Append(OrgApacheFelixJettyGzipExcludedMethods).Append("\n");
      sb.Append("  OrgApacheFelixJettyGzipIncludedPaths: ").Append(OrgApacheFelixJettyGzipIncludedPaths).Append("\n");
      sb.Append("  OrgApacheFelixJettyGzipExcludedPaths: ").Append(OrgApacheFelixJettyGzipExcludedPaths).Append("\n");
      sb.Append("  OrgApacheFelixJettyGzipIncludedMimeTypes: ").Append(OrgApacheFelixJettyGzipIncludedMimeTypes).Append("\n");
      sb.Append("  OrgApacheFelixJettyGzipExcludedMimeTypes: ").Append(OrgApacheFelixJettyGzipExcludedMimeTypes).Append("\n");
      sb.Append("  OrgApacheFelixHttpSessionInvalidate: ").Append(OrgApacheFelixHttpSessionInvalidate).Append("\n");
      sb.Append("  OrgApacheFelixHttpSessionUniqueid: ").Append(OrgApacheFelixHttpSessionUniqueid).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
