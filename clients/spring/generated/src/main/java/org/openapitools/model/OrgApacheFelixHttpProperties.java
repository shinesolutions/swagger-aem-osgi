package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheFelixHttpProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheFelixHttpProperties   {
  @JsonProperty("org.apache.felix.http.host")
  private ConfigNodePropertyString orgApacheFelixHttpHost = null;

  @JsonProperty("org.apache.felix.http.enable")
  private ConfigNodePropertyBoolean orgApacheFelixHttpEnable = null;

  @JsonProperty("org.osgi.service.http.port")
  private ConfigNodePropertyInteger orgOsgiServiceHttpPort = null;

  @JsonProperty("org.apache.felix.http.timeout")
  private ConfigNodePropertyInteger orgApacheFelixHttpTimeout = null;

  @JsonProperty("org.apache.felix.https.enable")
  private ConfigNodePropertyBoolean orgApacheFelixHttpsEnable = null;

  @JsonProperty("org.osgi.service.http.port.secure")
  private ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure = null;

  @JsonProperty("org.apache.felix.https.keystore")
  private ConfigNodePropertyString orgApacheFelixHttpsKeystore = null;

  @JsonProperty("org.apache.felix.https.keystore.password")
  private ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword = null;

  @JsonProperty("org.apache.felix.https.keystore.key.password")
  private ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword = null;

  @JsonProperty("org.apache.felix.https.truststore")
  private ConfigNodePropertyString orgApacheFelixHttpsTruststore = null;

  @JsonProperty("org.apache.felix.https.truststore.password")
  private ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword = null;

  @JsonProperty("org.apache.felix.https.clientcertificate")
  private ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate = null;

  @JsonProperty("org.apache.felix.http.context_path")
  private ConfigNodePropertyString orgApacheFelixHttpContextPath = null;

  @JsonProperty("org.apache.felix.http.mbeans")
  private ConfigNodePropertyBoolean orgApacheFelixHttpMbeans = null;

  @JsonProperty("org.apache.felix.http.session.timeout")
  private ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout = null;

  @JsonProperty("org.apache.felix.http.jetty.threadpool.max")
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax = null;

  @JsonProperty("org.apache.felix.http.jetty.acceptors")
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors = null;

  @JsonProperty("org.apache.felix.http.jetty.selectors")
  private ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors = null;

  @JsonProperty("org.apache.felix.http.jetty.headerBufferSize")
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize = null;

  @JsonProperty("org.apache.felix.http.jetty.requestBufferSize")
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize = null;

  @JsonProperty("org.apache.felix.http.jetty.responseBufferSize")
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize = null;

  @JsonProperty("org.apache.felix.http.jetty.maxFormSize")
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize = null;

  @JsonProperty("org.apache.felix.http.path_exclusions")
  private ConfigNodePropertyArray orgApacheFelixHttpPathExclusions = null;

  @JsonProperty("org.apache.felix.https.jetty.ciphersuites.excluded")
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded = null;

  @JsonProperty("org.apache.felix.https.jetty.ciphersuites.included")
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded = null;

  @JsonProperty("org.apache.felix.http.jetty.sendServerHeader")
  private ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader = null;

  @JsonProperty("org.apache.felix.https.jetty.protocols.included")
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded = null;

  @JsonProperty("org.apache.felix.https.jetty.protocols.excluded")
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded = null;

  @JsonProperty("org.apache.felix.proxy.load.balancer.connection.enable")
  private ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable = null;

  @JsonProperty("org.apache.felix.https.jetty.renegotiateAllowed")
  private ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed = null;

  @JsonProperty("org.apache.felix.https.jetty.session.cookie.httpOnly")
  private ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly = null;

  @JsonProperty("org.apache.felix.https.jetty.session.cookie.secure")
  private ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure = null;

  @JsonProperty("org.eclipse.jetty.servlet.SessionIdPathParameterName")
  private ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName = null;

  @JsonProperty("org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding")
  private ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding = null;

  @JsonProperty("org.eclipse.jetty.servlet.SessionCookie")
  private ConfigNodePropertyString orgEclipseJettyServletSessionCookie = null;

  @JsonProperty("org.eclipse.jetty.servlet.SessionDomain")
  private ConfigNodePropertyString orgEclipseJettyServletSessionDomain = null;

  @JsonProperty("org.eclipse.jetty.servlet.SessionPath")
  private ConfigNodePropertyString orgEclipseJettyServletSessionPath = null;

  @JsonProperty("org.eclipse.jetty.servlet.MaxAge")
  private ConfigNodePropertyInteger orgEclipseJettyServletMaxAge = null;

  @JsonProperty("org.apache.felix.http.name")
  private ConfigNodePropertyString orgApacheFelixHttpName = null;

  @JsonProperty("org.apache.felix.jetty.gziphandler.enable")
  private ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable = null;

  @JsonProperty("org.apache.felix.jetty.gzip.minGzipSize")
  private ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize = null;

  @JsonProperty("org.apache.felix.jetty.gzip.compressionLevel")
  private ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel = null;

  @JsonProperty("org.apache.felix.jetty.gzip.inflateBufferSize")
  private ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize = null;

  @JsonProperty("org.apache.felix.jetty.gzip.syncFlush")
  private ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush = null;

  @JsonProperty("org.apache.felix.jetty.gzip.excludedUserAgents")
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents = null;

  @JsonProperty("org.apache.felix.jetty.gzip.includedMethods")
  private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods = null;

  @JsonProperty("org.apache.felix.jetty.gzip.excludedMethods")
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods = null;

  @JsonProperty("org.apache.felix.jetty.gzip.includedPaths")
  private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths = null;

  @JsonProperty("org.apache.felix.jetty.gzip.excludedPaths")
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths = null;

  @JsonProperty("org.apache.felix.jetty.gzip.includedMimeTypes")
  private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes = null;

  @JsonProperty("org.apache.felix.jetty.gzip.excludedMimeTypes")
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes = null;

  @JsonProperty("org.apache.felix.http.session.invalidate")
  private ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate = null;

  @JsonProperty("org.apache.felix.http.session.uniqueid")
  private ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid = null;

  public OrgApacheFelixHttpProperties orgApacheFelixHttpHost(ConfigNodePropertyString orgApacheFelixHttpHost) {
    this.orgApacheFelixHttpHost = orgApacheFelixHttpHost;
    return this;
  }

  /**
   * Get orgApacheFelixHttpHost
   * @return orgApacheFelixHttpHost
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getOrgApacheFelixHttpHost() {
    return orgApacheFelixHttpHost;
  }

  public void setOrgApacheFelixHttpHost(ConfigNodePropertyString orgApacheFelixHttpHost) {
    this.orgApacheFelixHttpHost = orgApacheFelixHttpHost;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpEnable(ConfigNodePropertyBoolean orgApacheFelixHttpEnable) {
    this.orgApacheFelixHttpEnable = orgApacheFelixHttpEnable;
    return this;
  }

  /**
   * Get orgApacheFelixHttpEnable
   * @return orgApacheFelixHttpEnable
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getOrgApacheFelixHttpEnable() {
    return orgApacheFelixHttpEnable;
  }

  public void setOrgApacheFelixHttpEnable(ConfigNodePropertyBoolean orgApacheFelixHttpEnable) {
    this.orgApacheFelixHttpEnable = orgApacheFelixHttpEnable;
  }

  public OrgApacheFelixHttpProperties orgOsgiServiceHttpPort(ConfigNodePropertyInteger orgOsgiServiceHttpPort) {
    this.orgOsgiServiceHttpPort = orgOsgiServiceHttpPort;
    return this;
  }

  /**
   * Get orgOsgiServiceHttpPort
   * @return orgOsgiServiceHttpPort
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getOrgOsgiServiceHttpPort() {
    return orgOsgiServiceHttpPort;
  }

  public void setOrgOsgiServiceHttpPort(ConfigNodePropertyInteger orgOsgiServiceHttpPort) {
    this.orgOsgiServiceHttpPort = orgOsgiServiceHttpPort;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpTimeout(ConfigNodePropertyInteger orgApacheFelixHttpTimeout) {
    this.orgApacheFelixHttpTimeout = orgApacheFelixHttpTimeout;
    return this;
  }

  /**
   * Get orgApacheFelixHttpTimeout
   * @return orgApacheFelixHttpTimeout
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getOrgApacheFelixHttpTimeout() {
    return orgApacheFelixHttpTimeout;
  }

  public void setOrgApacheFelixHttpTimeout(ConfigNodePropertyInteger orgApacheFelixHttpTimeout) {
    this.orgApacheFelixHttpTimeout = orgApacheFelixHttpTimeout;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsEnable(ConfigNodePropertyBoolean orgApacheFelixHttpsEnable) {
    this.orgApacheFelixHttpsEnable = orgApacheFelixHttpsEnable;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsEnable
   * @return orgApacheFelixHttpsEnable
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getOrgApacheFelixHttpsEnable() {
    return orgApacheFelixHttpsEnable;
  }

  public void setOrgApacheFelixHttpsEnable(ConfigNodePropertyBoolean orgApacheFelixHttpsEnable) {
    this.orgApacheFelixHttpsEnable = orgApacheFelixHttpsEnable;
  }

  public OrgApacheFelixHttpProperties orgOsgiServiceHttpPortSecure(ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure) {
    this.orgOsgiServiceHttpPortSecure = orgOsgiServiceHttpPortSecure;
    return this;
  }

  /**
   * Get orgOsgiServiceHttpPortSecure
   * @return orgOsgiServiceHttpPortSecure
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getOrgOsgiServiceHttpPortSecure() {
    return orgOsgiServiceHttpPortSecure;
  }

  public void setOrgOsgiServiceHttpPortSecure(ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure) {
    this.orgOsgiServiceHttpPortSecure = orgOsgiServiceHttpPortSecure;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsKeystore(ConfigNodePropertyString orgApacheFelixHttpsKeystore) {
    this.orgApacheFelixHttpsKeystore = orgApacheFelixHttpsKeystore;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsKeystore
   * @return orgApacheFelixHttpsKeystore
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getOrgApacheFelixHttpsKeystore() {
    return orgApacheFelixHttpsKeystore;
  }

  public void setOrgApacheFelixHttpsKeystore(ConfigNodePropertyString orgApacheFelixHttpsKeystore) {
    this.orgApacheFelixHttpsKeystore = orgApacheFelixHttpsKeystore;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsKeystorePassword(ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword) {
    this.orgApacheFelixHttpsKeystorePassword = orgApacheFelixHttpsKeystorePassword;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsKeystorePassword
   * @return orgApacheFelixHttpsKeystorePassword
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getOrgApacheFelixHttpsKeystorePassword() {
    return orgApacheFelixHttpsKeystorePassword;
  }

  public void setOrgApacheFelixHttpsKeystorePassword(ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword) {
    this.orgApacheFelixHttpsKeystorePassword = orgApacheFelixHttpsKeystorePassword;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsKeystoreKeyPassword(ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword) {
    this.orgApacheFelixHttpsKeystoreKeyPassword = orgApacheFelixHttpsKeystoreKeyPassword;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsKeystoreKeyPassword
   * @return orgApacheFelixHttpsKeystoreKeyPassword
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getOrgApacheFelixHttpsKeystoreKeyPassword() {
    return orgApacheFelixHttpsKeystoreKeyPassword;
  }

  public void setOrgApacheFelixHttpsKeystoreKeyPassword(ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword) {
    this.orgApacheFelixHttpsKeystoreKeyPassword = orgApacheFelixHttpsKeystoreKeyPassword;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsTruststore(ConfigNodePropertyString orgApacheFelixHttpsTruststore) {
    this.orgApacheFelixHttpsTruststore = orgApacheFelixHttpsTruststore;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsTruststore
   * @return orgApacheFelixHttpsTruststore
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getOrgApacheFelixHttpsTruststore() {
    return orgApacheFelixHttpsTruststore;
  }

  public void setOrgApacheFelixHttpsTruststore(ConfigNodePropertyString orgApacheFelixHttpsTruststore) {
    this.orgApacheFelixHttpsTruststore = orgApacheFelixHttpsTruststore;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsTruststorePassword(ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword) {
    this.orgApacheFelixHttpsTruststorePassword = orgApacheFelixHttpsTruststorePassword;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsTruststorePassword
   * @return orgApacheFelixHttpsTruststorePassword
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getOrgApacheFelixHttpsTruststorePassword() {
    return orgApacheFelixHttpsTruststorePassword;
  }

  public void setOrgApacheFelixHttpsTruststorePassword(ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword) {
    this.orgApacheFelixHttpsTruststorePassword = orgApacheFelixHttpsTruststorePassword;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsClientcertificate(ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate) {
    this.orgApacheFelixHttpsClientcertificate = orgApacheFelixHttpsClientcertificate;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsClientcertificate
   * @return orgApacheFelixHttpsClientcertificate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyDropDown getOrgApacheFelixHttpsClientcertificate() {
    return orgApacheFelixHttpsClientcertificate;
  }

  public void setOrgApacheFelixHttpsClientcertificate(ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate) {
    this.orgApacheFelixHttpsClientcertificate = orgApacheFelixHttpsClientcertificate;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpContextPath(ConfigNodePropertyString orgApacheFelixHttpContextPath) {
    this.orgApacheFelixHttpContextPath = orgApacheFelixHttpContextPath;
    return this;
  }

  /**
   * Get orgApacheFelixHttpContextPath
   * @return orgApacheFelixHttpContextPath
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getOrgApacheFelixHttpContextPath() {
    return orgApacheFelixHttpContextPath;
  }

  public void setOrgApacheFelixHttpContextPath(ConfigNodePropertyString orgApacheFelixHttpContextPath) {
    this.orgApacheFelixHttpContextPath = orgApacheFelixHttpContextPath;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpMbeans(ConfigNodePropertyBoolean orgApacheFelixHttpMbeans) {
    this.orgApacheFelixHttpMbeans = orgApacheFelixHttpMbeans;
    return this;
  }

  /**
   * Get orgApacheFelixHttpMbeans
   * @return orgApacheFelixHttpMbeans
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getOrgApacheFelixHttpMbeans() {
    return orgApacheFelixHttpMbeans;
  }

  public void setOrgApacheFelixHttpMbeans(ConfigNodePropertyBoolean orgApacheFelixHttpMbeans) {
    this.orgApacheFelixHttpMbeans = orgApacheFelixHttpMbeans;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpSessionTimeout(ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout) {
    this.orgApacheFelixHttpSessionTimeout = orgApacheFelixHttpSessionTimeout;
    return this;
  }

  /**
   * Get orgApacheFelixHttpSessionTimeout
   * @return orgApacheFelixHttpSessionTimeout
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getOrgApacheFelixHttpSessionTimeout() {
    return orgApacheFelixHttpSessionTimeout;
  }

  public void setOrgApacheFelixHttpSessionTimeout(ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout) {
    this.orgApacheFelixHttpSessionTimeout = orgApacheFelixHttpSessionTimeout;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyThreadpoolMax(ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax) {
    this.orgApacheFelixHttpJettyThreadpoolMax = orgApacheFelixHttpJettyThreadpoolMax;
    return this;
  }

  /**
   * Get orgApacheFelixHttpJettyThreadpoolMax
   * @return orgApacheFelixHttpJettyThreadpoolMax
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyThreadpoolMax() {
    return orgApacheFelixHttpJettyThreadpoolMax;
  }

  public void setOrgApacheFelixHttpJettyThreadpoolMax(ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax) {
    this.orgApacheFelixHttpJettyThreadpoolMax = orgApacheFelixHttpJettyThreadpoolMax;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyAcceptors(ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors) {
    this.orgApacheFelixHttpJettyAcceptors = orgApacheFelixHttpJettyAcceptors;
    return this;
  }

  /**
   * Get orgApacheFelixHttpJettyAcceptors
   * @return orgApacheFelixHttpJettyAcceptors
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyAcceptors() {
    return orgApacheFelixHttpJettyAcceptors;
  }

  public void setOrgApacheFelixHttpJettyAcceptors(ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors) {
    this.orgApacheFelixHttpJettyAcceptors = orgApacheFelixHttpJettyAcceptors;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettySelectors(ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors) {
    this.orgApacheFelixHttpJettySelectors = orgApacheFelixHttpJettySelectors;
    return this;
  }

  /**
   * Get orgApacheFelixHttpJettySelectors
   * @return orgApacheFelixHttpJettySelectors
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettySelectors() {
    return orgApacheFelixHttpJettySelectors;
  }

  public void setOrgApacheFelixHttpJettySelectors(ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors) {
    this.orgApacheFelixHttpJettySelectors = orgApacheFelixHttpJettySelectors;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyHeaderBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize) {
    this.orgApacheFelixHttpJettyHeaderBufferSize = orgApacheFelixHttpJettyHeaderBufferSize;
    return this;
  }

  /**
   * Get orgApacheFelixHttpJettyHeaderBufferSize
   * @return orgApacheFelixHttpJettyHeaderBufferSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyHeaderBufferSize() {
    return orgApacheFelixHttpJettyHeaderBufferSize;
  }

  public void setOrgApacheFelixHttpJettyHeaderBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize) {
    this.orgApacheFelixHttpJettyHeaderBufferSize = orgApacheFelixHttpJettyHeaderBufferSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyRequestBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize) {
    this.orgApacheFelixHttpJettyRequestBufferSize = orgApacheFelixHttpJettyRequestBufferSize;
    return this;
  }

  /**
   * Get orgApacheFelixHttpJettyRequestBufferSize
   * @return orgApacheFelixHttpJettyRequestBufferSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyRequestBufferSize() {
    return orgApacheFelixHttpJettyRequestBufferSize;
  }

  public void setOrgApacheFelixHttpJettyRequestBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize) {
    this.orgApacheFelixHttpJettyRequestBufferSize = orgApacheFelixHttpJettyRequestBufferSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyResponseBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize) {
    this.orgApacheFelixHttpJettyResponseBufferSize = orgApacheFelixHttpJettyResponseBufferSize;
    return this;
  }

  /**
   * Get orgApacheFelixHttpJettyResponseBufferSize
   * @return orgApacheFelixHttpJettyResponseBufferSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyResponseBufferSize() {
    return orgApacheFelixHttpJettyResponseBufferSize;
  }

  public void setOrgApacheFelixHttpJettyResponseBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize) {
    this.orgApacheFelixHttpJettyResponseBufferSize = orgApacheFelixHttpJettyResponseBufferSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyMaxFormSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize) {
    this.orgApacheFelixHttpJettyMaxFormSize = orgApacheFelixHttpJettyMaxFormSize;
    return this;
  }

  /**
   * Get orgApacheFelixHttpJettyMaxFormSize
   * @return orgApacheFelixHttpJettyMaxFormSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyMaxFormSize() {
    return orgApacheFelixHttpJettyMaxFormSize;
  }

  public void setOrgApacheFelixHttpJettyMaxFormSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize) {
    this.orgApacheFelixHttpJettyMaxFormSize = orgApacheFelixHttpJettyMaxFormSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpPathExclusions(ConfigNodePropertyArray orgApacheFelixHttpPathExclusions) {
    this.orgApacheFelixHttpPathExclusions = orgApacheFelixHttpPathExclusions;
    return this;
  }

  /**
   * Get orgApacheFelixHttpPathExclusions
   * @return orgApacheFelixHttpPathExclusions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getOrgApacheFelixHttpPathExclusions() {
    return orgApacheFelixHttpPathExclusions;
  }

  public void setOrgApacheFelixHttpPathExclusions(ConfigNodePropertyArray orgApacheFelixHttpPathExclusions) {
    this.orgApacheFelixHttpPathExclusions = orgApacheFelixHttpPathExclusions;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyCiphersuitesExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesExcluded = orgApacheFelixHttpsJettyCiphersuitesExcluded;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsJettyCiphersuitesExcluded
   * @return orgApacheFelixHttpsJettyCiphersuitesExcluded
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyCiphersuitesExcluded() {
    return orgApacheFelixHttpsJettyCiphersuitesExcluded;
  }

  public void setOrgApacheFelixHttpsJettyCiphersuitesExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesExcluded = orgApacheFelixHttpsJettyCiphersuitesExcluded;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyCiphersuitesIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesIncluded = orgApacheFelixHttpsJettyCiphersuitesIncluded;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsJettyCiphersuitesIncluded
   * @return orgApacheFelixHttpsJettyCiphersuitesIncluded
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyCiphersuitesIncluded() {
    return orgApacheFelixHttpsJettyCiphersuitesIncluded;
  }

  public void setOrgApacheFelixHttpsJettyCiphersuitesIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesIncluded = orgApacheFelixHttpsJettyCiphersuitesIncluded;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettySendServerHeader(ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader) {
    this.orgApacheFelixHttpJettySendServerHeader = orgApacheFelixHttpJettySendServerHeader;
    return this;
  }

  /**
   * Get orgApacheFelixHttpJettySendServerHeader
   * @return orgApacheFelixHttpJettySendServerHeader
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getOrgApacheFelixHttpJettySendServerHeader() {
    return orgApacheFelixHttpJettySendServerHeader;
  }

  public void setOrgApacheFelixHttpJettySendServerHeader(ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader) {
    this.orgApacheFelixHttpJettySendServerHeader = orgApacheFelixHttpJettySendServerHeader;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyProtocolsIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded) {
    this.orgApacheFelixHttpsJettyProtocolsIncluded = orgApacheFelixHttpsJettyProtocolsIncluded;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsJettyProtocolsIncluded
   * @return orgApacheFelixHttpsJettyProtocolsIncluded
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyProtocolsIncluded() {
    return orgApacheFelixHttpsJettyProtocolsIncluded;
  }

  public void setOrgApacheFelixHttpsJettyProtocolsIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded) {
    this.orgApacheFelixHttpsJettyProtocolsIncluded = orgApacheFelixHttpsJettyProtocolsIncluded;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyProtocolsExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded) {
    this.orgApacheFelixHttpsJettyProtocolsExcluded = orgApacheFelixHttpsJettyProtocolsExcluded;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsJettyProtocolsExcluded
   * @return orgApacheFelixHttpsJettyProtocolsExcluded
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyProtocolsExcluded() {
    return orgApacheFelixHttpsJettyProtocolsExcluded;
  }

  public void setOrgApacheFelixHttpsJettyProtocolsExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded) {
    this.orgApacheFelixHttpsJettyProtocolsExcluded = orgApacheFelixHttpsJettyProtocolsExcluded;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixProxyLoadBalancerConnectionEnable(ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable) {
    this.orgApacheFelixProxyLoadBalancerConnectionEnable = orgApacheFelixProxyLoadBalancerConnectionEnable;
    return this;
  }

  /**
   * Get orgApacheFelixProxyLoadBalancerConnectionEnable
   * @return orgApacheFelixProxyLoadBalancerConnectionEnable
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getOrgApacheFelixProxyLoadBalancerConnectionEnable() {
    return orgApacheFelixProxyLoadBalancerConnectionEnable;
  }

  public void setOrgApacheFelixProxyLoadBalancerConnectionEnable(ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable) {
    this.orgApacheFelixProxyLoadBalancerConnectionEnable = orgApacheFelixProxyLoadBalancerConnectionEnable;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyRenegotiateAllowed(ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed) {
    this.orgApacheFelixHttpsJettyRenegotiateAllowed = orgApacheFelixHttpsJettyRenegotiateAllowed;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsJettyRenegotiateAllowed
   * @return orgApacheFelixHttpsJettyRenegotiateAllowed
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettyRenegotiateAllowed() {
    return orgApacheFelixHttpsJettyRenegotiateAllowed;
  }

  public void setOrgApacheFelixHttpsJettyRenegotiateAllowed(ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed) {
    this.orgApacheFelixHttpsJettyRenegotiateAllowed = orgApacheFelixHttpsJettyRenegotiateAllowed;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettySessionCookieHttpOnly(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly) {
    this.orgApacheFelixHttpsJettySessionCookieHttpOnly = orgApacheFelixHttpsJettySessionCookieHttpOnly;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsJettySessionCookieHttpOnly
   * @return orgApacheFelixHttpsJettySessionCookieHttpOnly
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettySessionCookieHttpOnly() {
    return orgApacheFelixHttpsJettySessionCookieHttpOnly;
  }

  public void setOrgApacheFelixHttpsJettySessionCookieHttpOnly(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly) {
    this.orgApacheFelixHttpsJettySessionCookieHttpOnly = orgApacheFelixHttpsJettySessionCookieHttpOnly;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettySessionCookieSecure(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure) {
    this.orgApacheFelixHttpsJettySessionCookieSecure = orgApacheFelixHttpsJettySessionCookieSecure;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsJettySessionCookieSecure
   * @return orgApacheFelixHttpsJettySessionCookieSecure
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettySessionCookieSecure() {
    return orgApacheFelixHttpsJettySessionCookieSecure;
  }

  public void setOrgApacheFelixHttpsJettySessionCookieSecure(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure) {
    this.orgApacheFelixHttpsJettySessionCookieSecure = orgApacheFelixHttpsJettySessionCookieSecure;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionIdPathParameterName(ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName) {
    this.orgEclipseJettyServletSessionIdPathParameterName = orgEclipseJettyServletSessionIdPathParameterName;
    return this;
  }

  /**
   * Get orgEclipseJettyServletSessionIdPathParameterName
   * @return orgEclipseJettyServletSessionIdPathParameterName
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getOrgEclipseJettyServletSessionIdPathParameterName() {
    return orgEclipseJettyServletSessionIdPathParameterName;
  }

  public void setOrgEclipseJettyServletSessionIdPathParameterName(ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName) {
    this.orgEclipseJettyServletSessionIdPathParameterName = orgEclipseJettyServletSessionIdPathParameterName;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletCheckingRemoteSessionIdEncoding(ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding) {
    this.orgEclipseJettyServletCheckingRemoteSessionIdEncoding = orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
    return this;
  }

  /**
   * Get orgEclipseJettyServletCheckingRemoteSessionIdEncoding
   * @return orgEclipseJettyServletCheckingRemoteSessionIdEncoding
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getOrgEclipseJettyServletCheckingRemoteSessionIdEncoding() {
    return orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
  }

  public void setOrgEclipseJettyServletCheckingRemoteSessionIdEncoding(ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding) {
    this.orgEclipseJettyServletCheckingRemoteSessionIdEncoding = orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionCookie(ConfigNodePropertyString orgEclipseJettyServletSessionCookie) {
    this.orgEclipseJettyServletSessionCookie = orgEclipseJettyServletSessionCookie;
    return this;
  }

  /**
   * Get orgEclipseJettyServletSessionCookie
   * @return orgEclipseJettyServletSessionCookie
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getOrgEclipseJettyServletSessionCookie() {
    return orgEclipseJettyServletSessionCookie;
  }

  public void setOrgEclipseJettyServletSessionCookie(ConfigNodePropertyString orgEclipseJettyServletSessionCookie) {
    this.orgEclipseJettyServletSessionCookie = orgEclipseJettyServletSessionCookie;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionDomain(ConfigNodePropertyString orgEclipseJettyServletSessionDomain) {
    this.orgEclipseJettyServletSessionDomain = orgEclipseJettyServletSessionDomain;
    return this;
  }

  /**
   * Get orgEclipseJettyServletSessionDomain
   * @return orgEclipseJettyServletSessionDomain
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getOrgEclipseJettyServletSessionDomain() {
    return orgEclipseJettyServletSessionDomain;
  }

  public void setOrgEclipseJettyServletSessionDomain(ConfigNodePropertyString orgEclipseJettyServletSessionDomain) {
    this.orgEclipseJettyServletSessionDomain = orgEclipseJettyServletSessionDomain;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionPath(ConfigNodePropertyString orgEclipseJettyServletSessionPath) {
    this.orgEclipseJettyServletSessionPath = orgEclipseJettyServletSessionPath;
    return this;
  }

  /**
   * Get orgEclipseJettyServletSessionPath
   * @return orgEclipseJettyServletSessionPath
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getOrgEclipseJettyServletSessionPath() {
    return orgEclipseJettyServletSessionPath;
  }

  public void setOrgEclipseJettyServletSessionPath(ConfigNodePropertyString orgEclipseJettyServletSessionPath) {
    this.orgEclipseJettyServletSessionPath = orgEclipseJettyServletSessionPath;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletMaxAge(ConfigNodePropertyInteger orgEclipseJettyServletMaxAge) {
    this.orgEclipseJettyServletMaxAge = orgEclipseJettyServletMaxAge;
    return this;
  }

  /**
   * Get orgEclipseJettyServletMaxAge
   * @return orgEclipseJettyServletMaxAge
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getOrgEclipseJettyServletMaxAge() {
    return orgEclipseJettyServletMaxAge;
  }

  public void setOrgEclipseJettyServletMaxAge(ConfigNodePropertyInteger orgEclipseJettyServletMaxAge) {
    this.orgEclipseJettyServletMaxAge = orgEclipseJettyServletMaxAge;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpName(ConfigNodePropertyString orgApacheFelixHttpName) {
    this.orgApacheFelixHttpName = orgApacheFelixHttpName;
    return this;
  }

  /**
   * Get orgApacheFelixHttpName
   * @return orgApacheFelixHttpName
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getOrgApacheFelixHttpName() {
    return orgApacheFelixHttpName;
  }

  public void setOrgApacheFelixHttpName(ConfigNodePropertyString orgApacheFelixHttpName) {
    this.orgApacheFelixHttpName = orgApacheFelixHttpName;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGziphandlerEnable(ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable) {
    this.orgApacheFelixJettyGziphandlerEnable = orgApacheFelixJettyGziphandlerEnable;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGziphandlerEnable
   * @return orgApacheFelixJettyGziphandlerEnable
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getOrgApacheFelixJettyGziphandlerEnable() {
    return orgApacheFelixJettyGziphandlerEnable;
  }

  public void setOrgApacheFelixJettyGziphandlerEnable(ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable) {
    this.orgApacheFelixJettyGziphandlerEnable = orgApacheFelixJettyGziphandlerEnable;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipMinGzipSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize) {
    this.orgApacheFelixJettyGzipMinGzipSize = orgApacheFelixJettyGzipMinGzipSize;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipMinGzipSize
   * @return orgApacheFelixJettyGzipMinGzipSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getOrgApacheFelixJettyGzipMinGzipSize() {
    return orgApacheFelixJettyGzipMinGzipSize;
  }

  public void setOrgApacheFelixJettyGzipMinGzipSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize) {
    this.orgApacheFelixJettyGzipMinGzipSize = orgApacheFelixJettyGzipMinGzipSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipCompressionLevel(ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel) {
    this.orgApacheFelixJettyGzipCompressionLevel = orgApacheFelixJettyGzipCompressionLevel;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipCompressionLevel
   * @return orgApacheFelixJettyGzipCompressionLevel
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getOrgApacheFelixJettyGzipCompressionLevel() {
    return orgApacheFelixJettyGzipCompressionLevel;
  }

  public void setOrgApacheFelixJettyGzipCompressionLevel(ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel) {
    this.orgApacheFelixJettyGzipCompressionLevel = orgApacheFelixJettyGzipCompressionLevel;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipInflateBufferSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize) {
    this.orgApacheFelixJettyGzipInflateBufferSize = orgApacheFelixJettyGzipInflateBufferSize;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipInflateBufferSize
   * @return orgApacheFelixJettyGzipInflateBufferSize
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getOrgApacheFelixJettyGzipInflateBufferSize() {
    return orgApacheFelixJettyGzipInflateBufferSize;
  }

  public void setOrgApacheFelixJettyGzipInflateBufferSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize) {
    this.orgApacheFelixJettyGzipInflateBufferSize = orgApacheFelixJettyGzipInflateBufferSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipSyncFlush(ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush) {
    this.orgApacheFelixJettyGzipSyncFlush = orgApacheFelixJettyGzipSyncFlush;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipSyncFlush
   * @return orgApacheFelixJettyGzipSyncFlush
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getOrgApacheFelixJettyGzipSyncFlush() {
    return orgApacheFelixJettyGzipSyncFlush;
  }

  public void setOrgApacheFelixJettyGzipSyncFlush(ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush) {
    this.orgApacheFelixJettyGzipSyncFlush = orgApacheFelixJettyGzipSyncFlush;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedUserAgents(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents) {
    this.orgApacheFelixJettyGzipExcludedUserAgents = orgApacheFelixJettyGzipExcludedUserAgents;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipExcludedUserAgents
   * @return orgApacheFelixJettyGzipExcludedUserAgents
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedUserAgents() {
    return orgApacheFelixJettyGzipExcludedUserAgents;
  }

  public void setOrgApacheFelixJettyGzipExcludedUserAgents(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents) {
    this.orgApacheFelixJettyGzipExcludedUserAgents = orgApacheFelixJettyGzipExcludedUserAgents;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipIncludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods) {
    this.orgApacheFelixJettyGzipIncludedMethods = orgApacheFelixJettyGzipIncludedMethods;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipIncludedMethods
   * @return orgApacheFelixJettyGzipIncludedMethods
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedMethods() {
    return orgApacheFelixJettyGzipIncludedMethods;
  }

  public void setOrgApacheFelixJettyGzipIncludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods) {
    this.orgApacheFelixJettyGzipIncludedMethods = orgApacheFelixJettyGzipIncludedMethods;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods) {
    this.orgApacheFelixJettyGzipExcludedMethods = orgApacheFelixJettyGzipExcludedMethods;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipExcludedMethods
   * @return orgApacheFelixJettyGzipExcludedMethods
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedMethods() {
    return orgApacheFelixJettyGzipExcludedMethods;
  }

  public void setOrgApacheFelixJettyGzipExcludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods) {
    this.orgApacheFelixJettyGzipExcludedMethods = orgApacheFelixJettyGzipExcludedMethods;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipIncludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths) {
    this.orgApacheFelixJettyGzipIncludedPaths = orgApacheFelixJettyGzipIncludedPaths;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipIncludedPaths
   * @return orgApacheFelixJettyGzipIncludedPaths
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedPaths() {
    return orgApacheFelixJettyGzipIncludedPaths;
  }

  public void setOrgApacheFelixJettyGzipIncludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths) {
    this.orgApacheFelixJettyGzipIncludedPaths = orgApacheFelixJettyGzipIncludedPaths;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths) {
    this.orgApacheFelixJettyGzipExcludedPaths = orgApacheFelixJettyGzipExcludedPaths;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipExcludedPaths
   * @return orgApacheFelixJettyGzipExcludedPaths
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedPaths() {
    return orgApacheFelixJettyGzipExcludedPaths;
  }

  public void setOrgApacheFelixJettyGzipExcludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths) {
    this.orgApacheFelixJettyGzipExcludedPaths = orgApacheFelixJettyGzipExcludedPaths;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipIncludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes) {
    this.orgApacheFelixJettyGzipIncludedMimeTypes = orgApacheFelixJettyGzipIncludedMimeTypes;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipIncludedMimeTypes
   * @return orgApacheFelixJettyGzipIncludedMimeTypes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedMimeTypes() {
    return orgApacheFelixJettyGzipIncludedMimeTypes;
  }

  public void setOrgApacheFelixJettyGzipIncludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes) {
    this.orgApacheFelixJettyGzipIncludedMimeTypes = orgApacheFelixJettyGzipIncludedMimeTypes;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes) {
    this.orgApacheFelixJettyGzipExcludedMimeTypes = orgApacheFelixJettyGzipExcludedMimeTypes;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipExcludedMimeTypes
   * @return orgApacheFelixJettyGzipExcludedMimeTypes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedMimeTypes() {
    return orgApacheFelixJettyGzipExcludedMimeTypes;
  }

  public void setOrgApacheFelixJettyGzipExcludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes) {
    this.orgApacheFelixJettyGzipExcludedMimeTypes = orgApacheFelixJettyGzipExcludedMimeTypes;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpSessionInvalidate(ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate) {
    this.orgApacheFelixHttpSessionInvalidate = orgApacheFelixHttpSessionInvalidate;
    return this;
  }

  /**
   * Get orgApacheFelixHttpSessionInvalidate
   * @return orgApacheFelixHttpSessionInvalidate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getOrgApacheFelixHttpSessionInvalidate() {
    return orgApacheFelixHttpSessionInvalidate;
  }

  public void setOrgApacheFelixHttpSessionInvalidate(ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate) {
    this.orgApacheFelixHttpSessionInvalidate = orgApacheFelixHttpSessionInvalidate;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpSessionUniqueid(ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid) {
    this.orgApacheFelixHttpSessionUniqueid = orgApacheFelixHttpSessionUniqueid;
    return this;
  }

  /**
   * Get orgApacheFelixHttpSessionUniqueid
   * @return orgApacheFelixHttpSessionUniqueid
  **/
  @ApiModelProperty(value = "")

  @Valid

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

