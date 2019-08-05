package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheFelixHttpProperties   {
  
  private ConfigNodePropertyString orgApacheFelixHttpHost = null;
  private ConfigNodePropertyBoolean orgApacheFelixHttpEnable = null;
  private ConfigNodePropertyInteger orgOsgiServiceHttpPort = null;
  private ConfigNodePropertyInteger orgApacheFelixHttpTimeout = null;
  private ConfigNodePropertyBoolean orgApacheFelixHttpsEnable = null;
  private ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure = null;
  private ConfigNodePropertyString orgApacheFelixHttpsKeystore = null;
  private ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword = null;
  private ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword = null;
  private ConfigNodePropertyString orgApacheFelixHttpsTruststore = null;
  private ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword = null;
  private ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate = null;
  private ConfigNodePropertyString orgApacheFelixHttpContextPath = null;
  private ConfigNodePropertyBoolean orgApacheFelixHttpMbeans = null;
  private ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout = null;
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax = null;
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors = null;
  private ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors = null;
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize = null;
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize = null;
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize = null;
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize = null;
  private ConfigNodePropertyArray orgApacheFelixHttpPathExclusions = null;
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded = null;
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded = null;
  private ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader = null;
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded = null;
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded = null;
  private ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable = null;
  private ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed = null;
  private ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly = null;
  private ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure = null;
  private ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName = null;
  private ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding = null;
  private ConfigNodePropertyString orgEclipseJettyServletSessionCookie = null;
  private ConfigNodePropertyString orgEclipseJettyServletSessionDomain = null;
  private ConfigNodePropertyString orgEclipseJettyServletSessionPath = null;
  private ConfigNodePropertyInteger orgEclipseJettyServletMaxAge = null;
  private ConfigNodePropertyString orgApacheFelixHttpName = null;
  private ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable = null;
  private ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize = null;
  private ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel = null;
  private ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize = null;
  private ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush = null;
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents = null;
  private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods = null;
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods = null;
  private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths = null;
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths = null;
  private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes = null;
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes = null;
  private ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate = null;
  private ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.host")
  public ConfigNodePropertyString getOrgApacheFelixHttpHost() {
    return orgApacheFelixHttpHost;
  }
  public void setOrgApacheFelixHttpHost(ConfigNodePropertyString orgApacheFelixHttpHost) {
    this.orgApacheFelixHttpHost = orgApacheFelixHttpHost;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.enable")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpEnable() {
    return orgApacheFelixHttpEnable;
  }
  public void setOrgApacheFelixHttpEnable(ConfigNodePropertyBoolean orgApacheFelixHttpEnable) {
    this.orgApacheFelixHttpEnable = orgApacheFelixHttpEnable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.osgi.service.http.port")
  public ConfigNodePropertyInteger getOrgOsgiServiceHttpPort() {
    return orgOsgiServiceHttpPort;
  }
  public void setOrgOsgiServiceHttpPort(ConfigNodePropertyInteger orgOsgiServiceHttpPort) {
    this.orgOsgiServiceHttpPort = orgOsgiServiceHttpPort;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.timeout")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpTimeout() {
    return orgApacheFelixHttpTimeout;
  }
  public void setOrgApacheFelixHttpTimeout(ConfigNodePropertyInteger orgApacheFelixHttpTimeout) {
    this.orgApacheFelixHttpTimeout = orgApacheFelixHttpTimeout;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.https.enable")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpsEnable() {
    return orgApacheFelixHttpsEnable;
  }
  public void setOrgApacheFelixHttpsEnable(ConfigNodePropertyBoolean orgApacheFelixHttpsEnable) {
    this.orgApacheFelixHttpsEnable = orgApacheFelixHttpsEnable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.osgi.service.http.port.secure")
  public ConfigNodePropertyInteger getOrgOsgiServiceHttpPortSecure() {
    return orgOsgiServiceHttpPortSecure;
  }
  public void setOrgOsgiServiceHttpPortSecure(ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure) {
    this.orgOsgiServiceHttpPortSecure = orgOsgiServiceHttpPortSecure;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.https.keystore")
  public ConfigNodePropertyString getOrgApacheFelixHttpsKeystore() {
    return orgApacheFelixHttpsKeystore;
  }
  public void setOrgApacheFelixHttpsKeystore(ConfigNodePropertyString orgApacheFelixHttpsKeystore) {
    this.orgApacheFelixHttpsKeystore = orgApacheFelixHttpsKeystore;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.https.keystore.password")
  public ConfigNodePropertyString getOrgApacheFelixHttpsKeystorePassword() {
    return orgApacheFelixHttpsKeystorePassword;
  }
  public void setOrgApacheFelixHttpsKeystorePassword(ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword) {
    this.orgApacheFelixHttpsKeystorePassword = orgApacheFelixHttpsKeystorePassword;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.https.keystore.key.password")
  public ConfigNodePropertyString getOrgApacheFelixHttpsKeystoreKeyPassword() {
    return orgApacheFelixHttpsKeystoreKeyPassword;
  }
  public void setOrgApacheFelixHttpsKeystoreKeyPassword(ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword) {
    this.orgApacheFelixHttpsKeystoreKeyPassword = orgApacheFelixHttpsKeystoreKeyPassword;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.https.truststore")
  public ConfigNodePropertyString getOrgApacheFelixHttpsTruststore() {
    return orgApacheFelixHttpsTruststore;
  }
  public void setOrgApacheFelixHttpsTruststore(ConfigNodePropertyString orgApacheFelixHttpsTruststore) {
    this.orgApacheFelixHttpsTruststore = orgApacheFelixHttpsTruststore;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.https.truststore.password")
  public ConfigNodePropertyString getOrgApacheFelixHttpsTruststorePassword() {
    return orgApacheFelixHttpsTruststorePassword;
  }
  public void setOrgApacheFelixHttpsTruststorePassword(ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword) {
    this.orgApacheFelixHttpsTruststorePassword = orgApacheFelixHttpsTruststorePassword;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.https.clientcertificate")
  public ConfigNodePropertyDropDown getOrgApacheFelixHttpsClientcertificate() {
    return orgApacheFelixHttpsClientcertificate;
  }
  public void setOrgApacheFelixHttpsClientcertificate(ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate) {
    this.orgApacheFelixHttpsClientcertificate = orgApacheFelixHttpsClientcertificate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.context_path")
  public ConfigNodePropertyString getOrgApacheFelixHttpContextPath() {
    return orgApacheFelixHttpContextPath;
  }
  public void setOrgApacheFelixHttpContextPath(ConfigNodePropertyString orgApacheFelixHttpContextPath) {
    this.orgApacheFelixHttpContextPath = orgApacheFelixHttpContextPath;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.mbeans")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpMbeans() {
    return orgApacheFelixHttpMbeans;
  }
  public void setOrgApacheFelixHttpMbeans(ConfigNodePropertyBoolean orgApacheFelixHttpMbeans) {
    this.orgApacheFelixHttpMbeans = orgApacheFelixHttpMbeans;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.session.timeout")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpSessionTimeout() {
    return orgApacheFelixHttpSessionTimeout;
  }
  public void setOrgApacheFelixHttpSessionTimeout(ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout) {
    this.orgApacheFelixHttpSessionTimeout = orgApacheFelixHttpSessionTimeout;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.jetty.threadpool.max")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyThreadpoolMax() {
    return orgApacheFelixHttpJettyThreadpoolMax;
  }
  public void setOrgApacheFelixHttpJettyThreadpoolMax(ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax) {
    this.orgApacheFelixHttpJettyThreadpoolMax = orgApacheFelixHttpJettyThreadpoolMax;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.jetty.acceptors")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyAcceptors() {
    return orgApacheFelixHttpJettyAcceptors;
  }
  public void setOrgApacheFelixHttpJettyAcceptors(ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors) {
    this.orgApacheFelixHttpJettyAcceptors = orgApacheFelixHttpJettyAcceptors;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.jetty.selectors")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettySelectors() {
    return orgApacheFelixHttpJettySelectors;
  }
  public void setOrgApacheFelixHttpJettySelectors(ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors) {
    this.orgApacheFelixHttpJettySelectors = orgApacheFelixHttpJettySelectors;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.jetty.headerBufferSize")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyHeaderBufferSize() {
    return orgApacheFelixHttpJettyHeaderBufferSize;
  }
  public void setOrgApacheFelixHttpJettyHeaderBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize) {
    this.orgApacheFelixHttpJettyHeaderBufferSize = orgApacheFelixHttpJettyHeaderBufferSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.jetty.requestBufferSize")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyRequestBufferSize() {
    return orgApacheFelixHttpJettyRequestBufferSize;
  }
  public void setOrgApacheFelixHttpJettyRequestBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize) {
    this.orgApacheFelixHttpJettyRequestBufferSize = orgApacheFelixHttpJettyRequestBufferSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.jetty.responseBufferSize")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyResponseBufferSize() {
    return orgApacheFelixHttpJettyResponseBufferSize;
  }
  public void setOrgApacheFelixHttpJettyResponseBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize) {
    this.orgApacheFelixHttpJettyResponseBufferSize = orgApacheFelixHttpJettyResponseBufferSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.jetty.maxFormSize")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyMaxFormSize() {
    return orgApacheFelixHttpJettyMaxFormSize;
  }
  public void setOrgApacheFelixHttpJettyMaxFormSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize) {
    this.orgApacheFelixHttpJettyMaxFormSize = orgApacheFelixHttpJettyMaxFormSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.path_exclusions")
  public ConfigNodePropertyArray getOrgApacheFelixHttpPathExclusions() {
    return orgApacheFelixHttpPathExclusions;
  }
  public void setOrgApacheFelixHttpPathExclusions(ConfigNodePropertyArray orgApacheFelixHttpPathExclusions) {
    this.orgApacheFelixHttpPathExclusions = orgApacheFelixHttpPathExclusions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.https.jetty.ciphersuites.excluded")
  public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyCiphersuitesExcluded() {
    return orgApacheFelixHttpsJettyCiphersuitesExcluded;
  }
  public void setOrgApacheFelixHttpsJettyCiphersuitesExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesExcluded = orgApacheFelixHttpsJettyCiphersuitesExcluded;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.https.jetty.ciphersuites.included")
  public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyCiphersuitesIncluded() {
    return orgApacheFelixHttpsJettyCiphersuitesIncluded;
  }
  public void setOrgApacheFelixHttpsJettyCiphersuitesIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesIncluded = orgApacheFelixHttpsJettyCiphersuitesIncluded;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.jetty.sendServerHeader")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpJettySendServerHeader() {
    return orgApacheFelixHttpJettySendServerHeader;
  }
  public void setOrgApacheFelixHttpJettySendServerHeader(ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader) {
    this.orgApacheFelixHttpJettySendServerHeader = orgApacheFelixHttpJettySendServerHeader;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.https.jetty.protocols.included")
  public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyProtocolsIncluded() {
    return orgApacheFelixHttpsJettyProtocolsIncluded;
  }
  public void setOrgApacheFelixHttpsJettyProtocolsIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded) {
    this.orgApacheFelixHttpsJettyProtocolsIncluded = orgApacheFelixHttpsJettyProtocolsIncluded;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.https.jetty.protocols.excluded")
  public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyProtocolsExcluded() {
    return orgApacheFelixHttpsJettyProtocolsExcluded;
  }
  public void setOrgApacheFelixHttpsJettyProtocolsExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded) {
    this.orgApacheFelixHttpsJettyProtocolsExcluded = orgApacheFelixHttpsJettyProtocolsExcluded;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.proxy.load.balancer.connection.enable")
  public ConfigNodePropertyBoolean getOrgApacheFelixProxyLoadBalancerConnectionEnable() {
    return orgApacheFelixProxyLoadBalancerConnectionEnable;
  }
  public void setOrgApacheFelixProxyLoadBalancerConnectionEnable(ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable) {
    this.orgApacheFelixProxyLoadBalancerConnectionEnable = orgApacheFelixProxyLoadBalancerConnectionEnable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.https.jetty.renegotiateAllowed")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettyRenegotiateAllowed() {
    return orgApacheFelixHttpsJettyRenegotiateAllowed;
  }
  public void setOrgApacheFelixHttpsJettyRenegotiateAllowed(ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed) {
    this.orgApacheFelixHttpsJettyRenegotiateAllowed = orgApacheFelixHttpsJettyRenegotiateAllowed;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.https.jetty.session.cookie.httpOnly")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettySessionCookieHttpOnly() {
    return orgApacheFelixHttpsJettySessionCookieHttpOnly;
  }
  public void setOrgApacheFelixHttpsJettySessionCookieHttpOnly(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly) {
    this.orgApacheFelixHttpsJettySessionCookieHttpOnly = orgApacheFelixHttpsJettySessionCookieHttpOnly;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.https.jetty.session.cookie.secure")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettySessionCookieSecure() {
    return orgApacheFelixHttpsJettySessionCookieSecure;
  }
  public void setOrgApacheFelixHttpsJettySessionCookieSecure(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure) {
    this.orgApacheFelixHttpsJettySessionCookieSecure = orgApacheFelixHttpsJettySessionCookieSecure;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.eclipse.jetty.servlet.SessionIdPathParameterName")
  public ConfigNodePropertyString getOrgEclipseJettyServletSessionIdPathParameterName() {
    return orgEclipseJettyServletSessionIdPathParameterName;
  }
  public void setOrgEclipseJettyServletSessionIdPathParameterName(ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName) {
    this.orgEclipseJettyServletSessionIdPathParameterName = orgEclipseJettyServletSessionIdPathParameterName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding")
  public ConfigNodePropertyBoolean getOrgEclipseJettyServletCheckingRemoteSessionIdEncoding() {
    return orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
  }
  public void setOrgEclipseJettyServletCheckingRemoteSessionIdEncoding(ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding) {
    this.orgEclipseJettyServletCheckingRemoteSessionIdEncoding = orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.eclipse.jetty.servlet.SessionCookie")
  public ConfigNodePropertyString getOrgEclipseJettyServletSessionCookie() {
    return orgEclipseJettyServletSessionCookie;
  }
  public void setOrgEclipseJettyServletSessionCookie(ConfigNodePropertyString orgEclipseJettyServletSessionCookie) {
    this.orgEclipseJettyServletSessionCookie = orgEclipseJettyServletSessionCookie;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.eclipse.jetty.servlet.SessionDomain")
  public ConfigNodePropertyString getOrgEclipseJettyServletSessionDomain() {
    return orgEclipseJettyServletSessionDomain;
  }
  public void setOrgEclipseJettyServletSessionDomain(ConfigNodePropertyString orgEclipseJettyServletSessionDomain) {
    this.orgEclipseJettyServletSessionDomain = orgEclipseJettyServletSessionDomain;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.eclipse.jetty.servlet.SessionPath")
  public ConfigNodePropertyString getOrgEclipseJettyServletSessionPath() {
    return orgEclipseJettyServletSessionPath;
  }
  public void setOrgEclipseJettyServletSessionPath(ConfigNodePropertyString orgEclipseJettyServletSessionPath) {
    this.orgEclipseJettyServletSessionPath = orgEclipseJettyServletSessionPath;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.eclipse.jetty.servlet.MaxAge")
  public ConfigNodePropertyInteger getOrgEclipseJettyServletMaxAge() {
    return orgEclipseJettyServletMaxAge;
  }
  public void setOrgEclipseJettyServletMaxAge(ConfigNodePropertyInteger orgEclipseJettyServletMaxAge) {
    this.orgEclipseJettyServletMaxAge = orgEclipseJettyServletMaxAge;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.name")
  public ConfigNodePropertyString getOrgApacheFelixHttpName() {
    return orgApacheFelixHttpName;
  }
  public void setOrgApacheFelixHttpName(ConfigNodePropertyString orgApacheFelixHttpName) {
    this.orgApacheFelixHttpName = orgApacheFelixHttpName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.jetty.gziphandler.enable")
  public ConfigNodePropertyBoolean getOrgApacheFelixJettyGziphandlerEnable() {
    return orgApacheFelixJettyGziphandlerEnable;
  }
  public void setOrgApacheFelixJettyGziphandlerEnable(ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable) {
    this.orgApacheFelixJettyGziphandlerEnable = orgApacheFelixJettyGziphandlerEnable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.jetty.gzip.minGzipSize")
  public ConfigNodePropertyInteger getOrgApacheFelixJettyGzipMinGzipSize() {
    return orgApacheFelixJettyGzipMinGzipSize;
  }
  public void setOrgApacheFelixJettyGzipMinGzipSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize) {
    this.orgApacheFelixJettyGzipMinGzipSize = orgApacheFelixJettyGzipMinGzipSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.jetty.gzip.compressionLevel")
  public ConfigNodePropertyInteger getOrgApacheFelixJettyGzipCompressionLevel() {
    return orgApacheFelixJettyGzipCompressionLevel;
  }
  public void setOrgApacheFelixJettyGzipCompressionLevel(ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel) {
    this.orgApacheFelixJettyGzipCompressionLevel = orgApacheFelixJettyGzipCompressionLevel;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.jetty.gzip.inflateBufferSize")
  public ConfigNodePropertyInteger getOrgApacheFelixJettyGzipInflateBufferSize() {
    return orgApacheFelixJettyGzipInflateBufferSize;
  }
  public void setOrgApacheFelixJettyGzipInflateBufferSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize) {
    this.orgApacheFelixJettyGzipInflateBufferSize = orgApacheFelixJettyGzipInflateBufferSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.jetty.gzip.syncFlush")
  public ConfigNodePropertyBoolean getOrgApacheFelixJettyGzipSyncFlush() {
    return orgApacheFelixJettyGzipSyncFlush;
  }
  public void setOrgApacheFelixJettyGzipSyncFlush(ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush) {
    this.orgApacheFelixJettyGzipSyncFlush = orgApacheFelixJettyGzipSyncFlush;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.jetty.gzip.excludedUserAgents")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedUserAgents() {
    return orgApacheFelixJettyGzipExcludedUserAgents;
  }
  public void setOrgApacheFelixJettyGzipExcludedUserAgents(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents) {
    this.orgApacheFelixJettyGzipExcludedUserAgents = orgApacheFelixJettyGzipExcludedUserAgents;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.jetty.gzip.includedMethods")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedMethods() {
    return orgApacheFelixJettyGzipIncludedMethods;
  }
  public void setOrgApacheFelixJettyGzipIncludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods) {
    this.orgApacheFelixJettyGzipIncludedMethods = orgApacheFelixJettyGzipIncludedMethods;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.jetty.gzip.excludedMethods")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedMethods() {
    return orgApacheFelixJettyGzipExcludedMethods;
  }
  public void setOrgApacheFelixJettyGzipExcludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods) {
    this.orgApacheFelixJettyGzipExcludedMethods = orgApacheFelixJettyGzipExcludedMethods;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.jetty.gzip.includedPaths")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedPaths() {
    return orgApacheFelixJettyGzipIncludedPaths;
  }
  public void setOrgApacheFelixJettyGzipIncludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths) {
    this.orgApacheFelixJettyGzipIncludedPaths = orgApacheFelixJettyGzipIncludedPaths;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.jetty.gzip.excludedPaths")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedPaths() {
    return orgApacheFelixJettyGzipExcludedPaths;
  }
  public void setOrgApacheFelixJettyGzipExcludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths) {
    this.orgApacheFelixJettyGzipExcludedPaths = orgApacheFelixJettyGzipExcludedPaths;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.jetty.gzip.includedMimeTypes")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedMimeTypes() {
    return orgApacheFelixJettyGzipIncludedMimeTypes;
  }
  public void setOrgApacheFelixJettyGzipIncludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes) {
    this.orgApacheFelixJettyGzipIncludedMimeTypes = orgApacheFelixJettyGzipIncludedMimeTypes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.jetty.gzip.excludedMimeTypes")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedMimeTypes() {
    return orgApacheFelixJettyGzipExcludedMimeTypes;
  }
  public void setOrgApacheFelixJettyGzipExcludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes) {
    this.orgApacheFelixJettyGzipExcludedMimeTypes = orgApacheFelixJettyGzipExcludedMimeTypes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.session.invalidate")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpSessionInvalidate() {
    return orgApacheFelixHttpSessionInvalidate;
  }
  public void setOrgApacheFelixHttpSessionInvalidate(ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate) {
    this.orgApacheFelixHttpSessionInvalidate = orgApacheFelixHttpSessionInvalidate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.session.uniqueid")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpSessionUniqueid() {
    return orgApacheFelixHttpSessionUniqueid;
  }
  public void setOrgApacheFelixHttpSessionUniqueid(ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid) {
    this.orgApacheFelixHttpSessionUniqueid = orgApacheFelixHttpSessionUniqueid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixHttpProperties orgApacheFelixHttpProperties = (OrgApacheFelixHttpProperties) o;
    return Objects.equals(orgApacheFelixHttpHost, orgApacheFelixHttpProperties.orgApacheFelixHttpHost) &&
        Objects.equals(orgApacheFelixHttpEnable, orgApacheFelixHttpProperties.orgApacheFelixHttpEnable) &&
        Objects.equals(orgOsgiServiceHttpPort, orgApacheFelixHttpProperties.orgOsgiServiceHttpPort) &&
        Objects.equals(orgApacheFelixHttpTimeout, orgApacheFelixHttpProperties.orgApacheFelixHttpTimeout) &&
        Objects.equals(orgApacheFelixHttpsEnable, orgApacheFelixHttpProperties.orgApacheFelixHttpsEnable) &&
        Objects.equals(orgOsgiServiceHttpPortSecure, orgApacheFelixHttpProperties.orgOsgiServiceHttpPortSecure) &&
        Objects.equals(orgApacheFelixHttpsKeystore, orgApacheFelixHttpProperties.orgApacheFelixHttpsKeystore) &&
        Objects.equals(orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpProperties.orgApacheFelixHttpsKeystorePassword) &&
        Objects.equals(orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpProperties.orgApacheFelixHttpsKeystoreKeyPassword) &&
        Objects.equals(orgApacheFelixHttpsTruststore, orgApacheFelixHttpProperties.orgApacheFelixHttpsTruststore) &&
        Objects.equals(orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpProperties.orgApacheFelixHttpsTruststorePassword) &&
        Objects.equals(orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpProperties.orgApacheFelixHttpsClientcertificate) &&
        Objects.equals(orgApacheFelixHttpContextPath, orgApacheFelixHttpProperties.orgApacheFelixHttpContextPath) &&
        Objects.equals(orgApacheFelixHttpMbeans, orgApacheFelixHttpProperties.orgApacheFelixHttpMbeans) &&
        Objects.equals(orgApacheFelixHttpSessionTimeout, orgApacheFelixHttpProperties.orgApacheFelixHttpSessionTimeout) &&
        Objects.equals(orgApacheFelixHttpJettyThreadpoolMax, orgApacheFelixHttpProperties.orgApacheFelixHttpJettyThreadpoolMax) &&
        Objects.equals(orgApacheFelixHttpJettyAcceptors, orgApacheFelixHttpProperties.orgApacheFelixHttpJettyAcceptors) &&
        Objects.equals(orgApacheFelixHttpJettySelectors, orgApacheFelixHttpProperties.orgApacheFelixHttpJettySelectors) &&
        Objects.equals(orgApacheFelixHttpJettyHeaderBufferSize, orgApacheFelixHttpProperties.orgApacheFelixHttpJettyHeaderBufferSize) &&
        Objects.equals(orgApacheFelixHttpJettyRequestBufferSize, orgApacheFelixHttpProperties.orgApacheFelixHttpJettyRequestBufferSize) &&
        Objects.equals(orgApacheFelixHttpJettyResponseBufferSize, orgApacheFelixHttpProperties.orgApacheFelixHttpJettyResponseBufferSize) &&
        Objects.equals(orgApacheFelixHttpJettyMaxFormSize, orgApacheFelixHttpProperties.orgApacheFelixHttpJettyMaxFormSize) &&
        Objects.equals(orgApacheFelixHttpPathExclusions, orgApacheFelixHttpProperties.orgApacheFelixHttpPathExclusions) &&
        Objects.equals(orgApacheFelixHttpsJettyCiphersuitesExcluded, orgApacheFelixHttpProperties.orgApacheFelixHttpsJettyCiphersuitesExcluded) &&
        Objects.equals(orgApacheFelixHttpsJettyCiphersuitesIncluded, orgApacheFelixHttpProperties.orgApacheFelixHttpsJettyCiphersuitesIncluded) &&
        Objects.equals(orgApacheFelixHttpJettySendServerHeader, orgApacheFelixHttpProperties.orgApacheFelixHttpJettySendServerHeader) &&
        Objects.equals(orgApacheFelixHttpsJettyProtocolsIncluded, orgApacheFelixHttpProperties.orgApacheFelixHttpsJettyProtocolsIncluded) &&
        Objects.equals(orgApacheFelixHttpsJettyProtocolsExcluded, orgApacheFelixHttpProperties.orgApacheFelixHttpsJettyProtocolsExcluded) &&
        Objects.equals(orgApacheFelixProxyLoadBalancerConnectionEnable, orgApacheFelixHttpProperties.orgApacheFelixProxyLoadBalancerConnectionEnable) &&
        Objects.equals(orgApacheFelixHttpsJettyRenegotiateAllowed, orgApacheFelixHttpProperties.orgApacheFelixHttpsJettyRenegotiateAllowed) &&
        Objects.equals(orgApacheFelixHttpsJettySessionCookieHttpOnly, orgApacheFelixHttpProperties.orgApacheFelixHttpsJettySessionCookieHttpOnly) &&
        Objects.equals(orgApacheFelixHttpsJettySessionCookieSecure, orgApacheFelixHttpProperties.orgApacheFelixHttpsJettySessionCookieSecure) &&
        Objects.equals(orgEclipseJettyServletSessionIdPathParameterName, orgApacheFelixHttpProperties.orgEclipseJettyServletSessionIdPathParameterName) &&
        Objects.equals(orgEclipseJettyServletCheckingRemoteSessionIdEncoding, orgApacheFelixHttpProperties.orgEclipseJettyServletCheckingRemoteSessionIdEncoding) &&
        Objects.equals(orgEclipseJettyServletSessionCookie, orgApacheFelixHttpProperties.orgEclipseJettyServletSessionCookie) &&
        Objects.equals(orgEclipseJettyServletSessionDomain, orgApacheFelixHttpProperties.orgEclipseJettyServletSessionDomain) &&
        Objects.equals(orgEclipseJettyServletSessionPath, orgApacheFelixHttpProperties.orgEclipseJettyServletSessionPath) &&
        Objects.equals(orgEclipseJettyServletMaxAge, orgApacheFelixHttpProperties.orgEclipseJettyServletMaxAge) &&
        Objects.equals(orgApacheFelixHttpName, orgApacheFelixHttpProperties.orgApacheFelixHttpName) &&
        Objects.equals(orgApacheFelixJettyGziphandlerEnable, orgApacheFelixHttpProperties.orgApacheFelixJettyGziphandlerEnable) &&
        Objects.equals(orgApacheFelixJettyGzipMinGzipSize, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipMinGzipSize) &&
        Objects.equals(orgApacheFelixJettyGzipCompressionLevel, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipCompressionLevel) &&
        Objects.equals(orgApacheFelixJettyGzipInflateBufferSize, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipInflateBufferSize) &&
        Objects.equals(orgApacheFelixJettyGzipSyncFlush, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipSyncFlush) &&
        Objects.equals(orgApacheFelixJettyGzipExcludedUserAgents, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipExcludedUserAgents) &&
        Objects.equals(orgApacheFelixJettyGzipIncludedMethods, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipIncludedMethods) &&
        Objects.equals(orgApacheFelixJettyGzipExcludedMethods, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipExcludedMethods) &&
        Objects.equals(orgApacheFelixJettyGzipIncludedPaths, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipIncludedPaths) &&
        Objects.equals(orgApacheFelixJettyGzipExcludedPaths, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipExcludedPaths) &&
        Objects.equals(orgApacheFelixJettyGzipIncludedMimeTypes, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipIncludedMimeTypes) &&
        Objects.equals(orgApacheFelixJettyGzipExcludedMimeTypes, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipExcludedMimeTypes) &&
        Objects.equals(orgApacheFelixHttpSessionInvalidate, orgApacheFelixHttpProperties.orgApacheFelixHttpSessionInvalidate) &&
        Objects.equals(orgApacheFelixHttpSessionUniqueid, orgApacheFelixHttpProperties.orgApacheFelixHttpSessionUniqueid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheFelixHttpHost, orgApacheFelixHttpEnable, orgOsgiServiceHttpPort, orgApacheFelixHttpTimeout, orgApacheFelixHttpsEnable, orgOsgiServiceHttpPortSecure, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpContextPath, orgApacheFelixHttpMbeans, orgApacheFelixHttpSessionTimeout, orgApacheFelixHttpJettyThreadpoolMax, orgApacheFelixHttpJettyAcceptors, orgApacheFelixHttpJettySelectors, orgApacheFelixHttpJettyHeaderBufferSize, orgApacheFelixHttpJettyRequestBufferSize, orgApacheFelixHttpJettyResponseBufferSize, orgApacheFelixHttpJettyMaxFormSize, orgApacheFelixHttpPathExclusions, orgApacheFelixHttpsJettyCiphersuitesExcluded, orgApacheFelixHttpsJettyCiphersuitesIncluded, orgApacheFelixHttpJettySendServerHeader, orgApacheFelixHttpsJettyProtocolsIncluded, orgApacheFelixHttpsJettyProtocolsExcluded, orgApacheFelixProxyLoadBalancerConnectionEnable, orgApacheFelixHttpsJettyRenegotiateAllowed, orgApacheFelixHttpsJettySessionCookieHttpOnly, orgApacheFelixHttpsJettySessionCookieSecure, orgEclipseJettyServletSessionIdPathParameterName, orgEclipseJettyServletCheckingRemoteSessionIdEncoding, orgEclipseJettyServletSessionCookie, orgEclipseJettyServletSessionDomain, orgEclipseJettyServletSessionPath, orgEclipseJettyServletMaxAge, orgApacheFelixHttpName, orgApacheFelixJettyGziphandlerEnable, orgApacheFelixJettyGzipMinGzipSize, orgApacheFelixJettyGzipCompressionLevel, orgApacheFelixJettyGzipInflateBufferSize, orgApacheFelixJettyGzipSyncFlush, orgApacheFelixJettyGzipExcludedUserAgents, orgApacheFelixJettyGzipIncludedMethods, orgApacheFelixJettyGzipExcludedMethods, orgApacheFelixJettyGzipIncludedPaths, orgApacheFelixJettyGzipExcludedPaths, orgApacheFelixJettyGzipIncludedMimeTypes, orgApacheFelixJettyGzipExcludedMimeTypes, orgApacheFelixHttpSessionInvalidate, orgApacheFelixHttpSessionUniqueid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixHttpProperties {\n");
    
    sb.append("    orgApacheFelixHttpHost: ").append(toIndentedString(orgApacheFelixHttpHost)).append("\n");
    sb.append("    orgApacheFelixHttpEnable: ").append(toIndentedString(orgApacheFelixHttpEnable)).append("\n");
    sb.append("    orgOsgiServiceHttpPort: ").append(toIndentedString(orgOsgiServiceHttpPort)).append("\n");
    sb.append("    orgApacheFelixHttpTimeout: ").append(toIndentedString(orgApacheFelixHttpTimeout)).append("\n");
    sb.append("    orgApacheFelixHttpsEnable: ").append(toIndentedString(orgApacheFelixHttpsEnable)).append("\n");
    sb.append("    orgOsgiServiceHttpPortSecure: ").append(toIndentedString(orgOsgiServiceHttpPortSecure)).append("\n");
    sb.append("    orgApacheFelixHttpsKeystore: ").append(toIndentedString(orgApacheFelixHttpsKeystore)).append("\n");
    sb.append("    orgApacheFelixHttpsKeystorePassword: ").append(toIndentedString(orgApacheFelixHttpsKeystorePassword)).append("\n");
    sb.append("    orgApacheFelixHttpsKeystoreKeyPassword: ").append(toIndentedString(orgApacheFelixHttpsKeystoreKeyPassword)).append("\n");
    sb.append("    orgApacheFelixHttpsTruststore: ").append(toIndentedString(orgApacheFelixHttpsTruststore)).append("\n");
    sb.append("    orgApacheFelixHttpsTruststorePassword: ").append(toIndentedString(orgApacheFelixHttpsTruststorePassword)).append("\n");
    sb.append("    orgApacheFelixHttpsClientcertificate: ").append(toIndentedString(orgApacheFelixHttpsClientcertificate)).append("\n");
    sb.append("    orgApacheFelixHttpContextPath: ").append(toIndentedString(orgApacheFelixHttpContextPath)).append("\n");
    sb.append("    orgApacheFelixHttpMbeans: ").append(toIndentedString(orgApacheFelixHttpMbeans)).append("\n");
    sb.append("    orgApacheFelixHttpSessionTimeout: ").append(toIndentedString(orgApacheFelixHttpSessionTimeout)).append("\n");
    sb.append("    orgApacheFelixHttpJettyThreadpoolMax: ").append(toIndentedString(orgApacheFelixHttpJettyThreadpoolMax)).append("\n");
    sb.append("    orgApacheFelixHttpJettyAcceptors: ").append(toIndentedString(orgApacheFelixHttpJettyAcceptors)).append("\n");
    sb.append("    orgApacheFelixHttpJettySelectors: ").append(toIndentedString(orgApacheFelixHttpJettySelectors)).append("\n");
    sb.append("    orgApacheFelixHttpJettyHeaderBufferSize: ").append(toIndentedString(orgApacheFelixHttpJettyHeaderBufferSize)).append("\n");
    sb.append("    orgApacheFelixHttpJettyRequestBufferSize: ").append(toIndentedString(orgApacheFelixHttpJettyRequestBufferSize)).append("\n");
    sb.append("    orgApacheFelixHttpJettyResponseBufferSize: ").append(toIndentedString(orgApacheFelixHttpJettyResponseBufferSize)).append("\n");
    sb.append("    orgApacheFelixHttpJettyMaxFormSize: ").append(toIndentedString(orgApacheFelixHttpJettyMaxFormSize)).append("\n");
    sb.append("    orgApacheFelixHttpPathExclusions: ").append(toIndentedString(orgApacheFelixHttpPathExclusions)).append("\n");
    sb.append("    orgApacheFelixHttpsJettyCiphersuitesExcluded: ").append(toIndentedString(orgApacheFelixHttpsJettyCiphersuitesExcluded)).append("\n");
    sb.append("    orgApacheFelixHttpsJettyCiphersuitesIncluded: ").append(toIndentedString(orgApacheFelixHttpsJettyCiphersuitesIncluded)).append("\n");
    sb.append("    orgApacheFelixHttpJettySendServerHeader: ").append(toIndentedString(orgApacheFelixHttpJettySendServerHeader)).append("\n");
    sb.append("    orgApacheFelixHttpsJettyProtocolsIncluded: ").append(toIndentedString(orgApacheFelixHttpsJettyProtocolsIncluded)).append("\n");
    sb.append("    orgApacheFelixHttpsJettyProtocolsExcluded: ").append(toIndentedString(orgApacheFelixHttpsJettyProtocolsExcluded)).append("\n");
    sb.append("    orgApacheFelixProxyLoadBalancerConnectionEnable: ").append(toIndentedString(orgApacheFelixProxyLoadBalancerConnectionEnable)).append("\n");
    sb.append("    orgApacheFelixHttpsJettyRenegotiateAllowed: ").append(toIndentedString(orgApacheFelixHttpsJettyRenegotiateAllowed)).append("\n");
    sb.append("    orgApacheFelixHttpsJettySessionCookieHttpOnly: ").append(toIndentedString(orgApacheFelixHttpsJettySessionCookieHttpOnly)).append("\n");
    sb.append("    orgApacheFelixHttpsJettySessionCookieSecure: ").append(toIndentedString(orgApacheFelixHttpsJettySessionCookieSecure)).append("\n");
    sb.append("    orgEclipseJettyServletSessionIdPathParameterName: ").append(toIndentedString(orgEclipseJettyServletSessionIdPathParameterName)).append("\n");
    sb.append("    orgEclipseJettyServletCheckingRemoteSessionIdEncoding: ").append(toIndentedString(orgEclipseJettyServletCheckingRemoteSessionIdEncoding)).append("\n");
    sb.append("    orgEclipseJettyServletSessionCookie: ").append(toIndentedString(orgEclipseJettyServletSessionCookie)).append("\n");
    sb.append("    orgEclipseJettyServletSessionDomain: ").append(toIndentedString(orgEclipseJettyServletSessionDomain)).append("\n");
    sb.append("    orgEclipseJettyServletSessionPath: ").append(toIndentedString(orgEclipseJettyServletSessionPath)).append("\n");
    sb.append("    orgEclipseJettyServletMaxAge: ").append(toIndentedString(orgEclipseJettyServletMaxAge)).append("\n");
    sb.append("    orgApacheFelixHttpName: ").append(toIndentedString(orgApacheFelixHttpName)).append("\n");
    sb.append("    orgApacheFelixJettyGziphandlerEnable: ").append(toIndentedString(orgApacheFelixJettyGziphandlerEnable)).append("\n");
    sb.append("    orgApacheFelixJettyGzipMinGzipSize: ").append(toIndentedString(orgApacheFelixJettyGzipMinGzipSize)).append("\n");
    sb.append("    orgApacheFelixJettyGzipCompressionLevel: ").append(toIndentedString(orgApacheFelixJettyGzipCompressionLevel)).append("\n");
    sb.append("    orgApacheFelixJettyGzipInflateBufferSize: ").append(toIndentedString(orgApacheFelixJettyGzipInflateBufferSize)).append("\n");
    sb.append("    orgApacheFelixJettyGzipSyncFlush: ").append(toIndentedString(orgApacheFelixJettyGzipSyncFlush)).append("\n");
    sb.append("    orgApacheFelixJettyGzipExcludedUserAgents: ").append(toIndentedString(orgApacheFelixJettyGzipExcludedUserAgents)).append("\n");
    sb.append("    orgApacheFelixJettyGzipIncludedMethods: ").append(toIndentedString(orgApacheFelixJettyGzipIncludedMethods)).append("\n");
    sb.append("    orgApacheFelixJettyGzipExcludedMethods: ").append(toIndentedString(orgApacheFelixJettyGzipExcludedMethods)).append("\n");
    sb.append("    orgApacheFelixJettyGzipIncludedPaths: ").append(toIndentedString(orgApacheFelixJettyGzipIncludedPaths)).append("\n");
    sb.append("    orgApacheFelixJettyGzipExcludedPaths: ").append(toIndentedString(orgApacheFelixJettyGzipExcludedPaths)).append("\n");
    sb.append("    orgApacheFelixJettyGzipIncludedMimeTypes: ").append(toIndentedString(orgApacheFelixJettyGzipIncludedMimeTypes)).append("\n");
    sb.append("    orgApacheFelixJettyGzipExcludedMimeTypes: ").append(toIndentedString(orgApacheFelixJettyGzipExcludedMimeTypes)).append("\n");
    sb.append("    orgApacheFelixHttpSessionInvalidate: ").append(toIndentedString(orgApacheFelixHttpSessionInvalidate)).append("\n");
    sb.append("    orgApacheFelixHttpSessionUniqueid: ").append(toIndentedString(orgApacheFelixHttpSessionUniqueid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

