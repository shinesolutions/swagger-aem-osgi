package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixHttpProperties   {
  
  private ConfigNodePropertyString orgApacheFelixHttpHost;
  private ConfigNodePropertyBoolean orgApacheFelixHttpEnable;
  private ConfigNodePropertyInteger orgOsgiServiceHttpPort;
  private ConfigNodePropertyInteger orgApacheFelixHttpTimeout;
  private ConfigNodePropertyBoolean orgApacheFelixHttpsEnable;
  private ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure;
  private ConfigNodePropertyString orgApacheFelixHttpsKeystore;
  private ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword;
  private ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword;
  private ConfigNodePropertyString orgApacheFelixHttpsTruststore;
  private ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword;
  private ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate;
  private ConfigNodePropertyString orgApacheFelixHttpContextPath;
  private ConfigNodePropertyBoolean orgApacheFelixHttpMbeans;
  private ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout;
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax;
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors;
  private ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors;
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize;
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize;
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize;
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize;
  private ConfigNodePropertyArray orgApacheFelixHttpPathExclusions;
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded;
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded;
  private ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader;
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded;
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded;
  private ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable;
  private ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed;
  private ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly;
  private ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure;
  private ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName;
  private ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
  private ConfigNodePropertyString orgEclipseJettyServletSessionCookie;
  private ConfigNodePropertyString orgEclipseJettyServletSessionDomain;
  private ConfigNodePropertyString orgEclipseJettyServletSessionPath;
  private ConfigNodePropertyInteger orgEclipseJettyServletMaxAge;
  private ConfigNodePropertyString orgApacheFelixHttpName;
  private ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable;
  private ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize;
  private ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel;
  private ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize;
  private ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush;
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents;
  private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods;
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods;
  private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths;
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths;
  private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes;
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes;
  private ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate;
  private ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.felix.http.host")
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpSessionUniqueid() {
    return orgApacheFelixHttpSessionUniqueid;
  }
  public void setOrgApacheFelixHttpSessionUniqueid(ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid) {
    this.orgApacheFelixHttpSessionUniqueid = orgApacheFelixHttpSessionUniqueid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixHttpProperties orgApacheFelixHttpProperties = (OrgApacheFelixHttpProperties) o;
    return Objects.equals(this.orgApacheFelixHttpHost, orgApacheFelixHttpProperties.orgApacheFelixHttpHost) &&
        Objects.equals(this.orgApacheFelixHttpEnable, orgApacheFelixHttpProperties.orgApacheFelixHttpEnable) &&
        Objects.equals(this.orgOsgiServiceHttpPort, orgApacheFelixHttpProperties.orgOsgiServiceHttpPort) &&
        Objects.equals(this.orgApacheFelixHttpTimeout, orgApacheFelixHttpProperties.orgApacheFelixHttpTimeout) &&
        Objects.equals(this.orgApacheFelixHttpsEnable, orgApacheFelixHttpProperties.orgApacheFelixHttpsEnable) &&
        Objects.equals(this.orgOsgiServiceHttpPortSecure, orgApacheFelixHttpProperties.orgOsgiServiceHttpPortSecure) &&
        Objects.equals(this.orgApacheFelixHttpsKeystore, orgApacheFelixHttpProperties.orgApacheFelixHttpsKeystore) &&
        Objects.equals(this.orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpProperties.orgApacheFelixHttpsKeystorePassword) &&
        Objects.equals(this.orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpProperties.orgApacheFelixHttpsKeystoreKeyPassword) &&
        Objects.equals(this.orgApacheFelixHttpsTruststore, orgApacheFelixHttpProperties.orgApacheFelixHttpsTruststore) &&
        Objects.equals(this.orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpProperties.orgApacheFelixHttpsTruststorePassword) &&
        Objects.equals(this.orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpProperties.orgApacheFelixHttpsClientcertificate) &&
        Objects.equals(this.orgApacheFelixHttpContextPath, orgApacheFelixHttpProperties.orgApacheFelixHttpContextPath) &&
        Objects.equals(this.orgApacheFelixHttpMbeans, orgApacheFelixHttpProperties.orgApacheFelixHttpMbeans) &&
        Objects.equals(this.orgApacheFelixHttpSessionTimeout, orgApacheFelixHttpProperties.orgApacheFelixHttpSessionTimeout) &&
        Objects.equals(this.orgApacheFelixHttpJettyThreadpoolMax, orgApacheFelixHttpProperties.orgApacheFelixHttpJettyThreadpoolMax) &&
        Objects.equals(this.orgApacheFelixHttpJettyAcceptors, orgApacheFelixHttpProperties.orgApacheFelixHttpJettyAcceptors) &&
        Objects.equals(this.orgApacheFelixHttpJettySelectors, orgApacheFelixHttpProperties.orgApacheFelixHttpJettySelectors) &&
        Objects.equals(this.orgApacheFelixHttpJettyHeaderBufferSize, orgApacheFelixHttpProperties.orgApacheFelixHttpJettyHeaderBufferSize) &&
        Objects.equals(this.orgApacheFelixHttpJettyRequestBufferSize, orgApacheFelixHttpProperties.orgApacheFelixHttpJettyRequestBufferSize) &&
        Objects.equals(this.orgApacheFelixHttpJettyResponseBufferSize, orgApacheFelixHttpProperties.orgApacheFelixHttpJettyResponseBufferSize) &&
        Objects.equals(this.orgApacheFelixHttpJettyMaxFormSize, orgApacheFelixHttpProperties.orgApacheFelixHttpJettyMaxFormSize) &&
        Objects.equals(this.orgApacheFelixHttpPathExclusions, orgApacheFelixHttpProperties.orgApacheFelixHttpPathExclusions) &&
        Objects.equals(this.orgApacheFelixHttpsJettyCiphersuitesExcluded, orgApacheFelixHttpProperties.orgApacheFelixHttpsJettyCiphersuitesExcluded) &&
        Objects.equals(this.orgApacheFelixHttpsJettyCiphersuitesIncluded, orgApacheFelixHttpProperties.orgApacheFelixHttpsJettyCiphersuitesIncluded) &&
        Objects.equals(this.orgApacheFelixHttpJettySendServerHeader, orgApacheFelixHttpProperties.orgApacheFelixHttpJettySendServerHeader) &&
        Objects.equals(this.orgApacheFelixHttpsJettyProtocolsIncluded, orgApacheFelixHttpProperties.orgApacheFelixHttpsJettyProtocolsIncluded) &&
        Objects.equals(this.orgApacheFelixHttpsJettyProtocolsExcluded, orgApacheFelixHttpProperties.orgApacheFelixHttpsJettyProtocolsExcluded) &&
        Objects.equals(this.orgApacheFelixProxyLoadBalancerConnectionEnable, orgApacheFelixHttpProperties.orgApacheFelixProxyLoadBalancerConnectionEnable) &&
        Objects.equals(this.orgApacheFelixHttpsJettyRenegotiateAllowed, orgApacheFelixHttpProperties.orgApacheFelixHttpsJettyRenegotiateAllowed) &&
        Objects.equals(this.orgApacheFelixHttpsJettySessionCookieHttpOnly, orgApacheFelixHttpProperties.orgApacheFelixHttpsJettySessionCookieHttpOnly) &&
        Objects.equals(this.orgApacheFelixHttpsJettySessionCookieSecure, orgApacheFelixHttpProperties.orgApacheFelixHttpsJettySessionCookieSecure) &&
        Objects.equals(this.orgEclipseJettyServletSessionIdPathParameterName, orgApacheFelixHttpProperties.orgEclipseJettyServletSessionIdPathParameterName) &&
        Objects.equals(this.orgEclipseJettyServletCheckingRemoteSessionIdEncoding, orgApacheFelixHttpProperties.orgEclipseJettyServletCheckingRemoteSessionIdEncoding) &&
        Objects.equals(this.orgEclipseJettyServletSessionCookie, orgApacheFelixHttpProperties.orgEclipseJettyServletSessionCookie) &&
        Objects.equals(this.orgEclipseJettyServletSessionDomain, orgApacheFelixHttpProperties.orgEclipseJettyServletSessionDomain) &&
        Objects.equals(this.orgEclipseJettyServletSessionPath, orgApacheFelixHttpProperties.orgEclipseJettyServletSessionPath) &&
        Objects.equals(this.orgEclipseJettyServletMaxAge, orgApacheFelixHttpProperties.orgEclipseJettyServletMaxAge) &&
        Objects.equals(this.orgApacheFelixHttpName, orgApacheFelixHttpProperties.orgApacheFelixHttpName) &&
        Objects.equals(this.orgApacheFelixJettyGziphandlerEnable, orgApacheFelixHttpProperties.orgApacheFelixJettyGziphandlerEnable) &&
        Objects.equals(this.orgApacheFelixJettyGzipMinGzipSize, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipMinGzipSize) &&
        Objects.equals(this.orgApacheFelixJettyGzipCompressionLevel, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipCompressionLevel) &&
        Objects.equals(this.orgApacheFelixJettyGzipInflateBufferSize, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipInflateBufferSize) &&
        Objects.equals(this.orgApacheFelixJettyGzipSyncFlush, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipSyncFlush) &&
        Objects.equals(this.orgApacheFelixJettyGzipExcludedUserAgents, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipExcludedUserAgents) &&
        Objects.equals(this.orgApacheFelixJettyGzipIncludedMethods, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipIncludedMethods) &&
        Objects.equals(this.orgApacheFelixJettyGzipExcludedMethods, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipExcludedMethods) &&
        Objects.equals(this.orgApacheFelixJettyGzipIncludedPaths, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipIncludedPaths) &&
        Objects.equals(this.orgApacheFelixJettyGzipExcludedPaths, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipExcludedPaths) &&
        Objects.equals(this.orgApacheFelixJettyGzipIncludedMimeTypes, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipIncludedMimeTypes) &&
        Objects.equals(this.orgApacheFelixJettyGzipExcludedMimeTypes, orgApacheFelixHttpProperties.orgApacheFelixJettyGzipExcludedMimeTypes) &&
        Objects.equals(this.orgApacheFelixHttpSessionInvalidate, orgApacheFelixHttpProperties.orgApacheFelixHttpSessionInvalidate) &&
        Objects.equals(this.orgApacheFelixHttpSessionUniqueid, orgApacheFelixHttpProperties.orgApacheFelixHttpSessionUniqueid);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

