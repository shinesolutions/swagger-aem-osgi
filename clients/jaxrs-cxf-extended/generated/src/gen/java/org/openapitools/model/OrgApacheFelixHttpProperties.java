package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheFelixHttpProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString orgApacheFelixHttpHost;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean orgApacheFelixHttpEnable;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgOsgiServiceHttpPort;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheFelixHttpTimeout;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean orgApacheFelixHttpsEnable;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString orgApacheFelixHttpsKeystore;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString orgApacheFelixHttpsTruststore;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString orgApacheFelixHttpContextPath;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean orgApacheFelixHttpMbeans;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray orgApacheFelixHttpPathExclusions;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString orgEclipseJettyServletSessionCookie;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString orgEclipseJettyServletSessionDomain;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString orgEclipseJettyServletSessionPath;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgEclipseJettyServletMaxAge;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString orgApacheFelixHttpName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid;
 /**
  * Get orgApacheFelixHttpHost
  * @return orgApacheFelixHttpHost
  */
  @JsonProperty("org.apache.felix.http.host")
  public ConfigNodePropertyString getOrgApacheFelixHttpHost() {
    return orgApacheFelixHttpHost;
  }

  /**
   * Sets the <code>orgApacheFelixHttpHost</code> property.
   */
 public void setOrgApacheFelixHttpHost(ConfigNodePropertyString orgApacheFelixHttpHost) {
    this.orgApacheFelixHttpHost = orgApacheFelixHttpHost;
  }

  /**
   * Sets the <code>orgApacheFelixHttpHost</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpHost(ConfigNodePropertyString orgApacheFelixHttpHost) {
    this.orgApacheFelixHttpHost = orgApacheFelixHttpHost;
    return this;
  }

 /**
  * Get orgApacheFelixHttpEnable
  * @return orgApacheFelixHttpEnable
  */
  @JsonProperty("org.apache.felix.http.enable")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpEnable() {
    return orgApacheFelixHttpEnable;
  }

  /**
   * Sets the <code>orgApacheFelixHttpEnable</code> property.
   */
 public void setOrgApacheFelixHttpEnable(ConfigNodePropertyBoolean orgApacheFelixHttpEnable) {
    this.orgApacheFelixHttpEnable = orgApacheFelixHttpEnable;
  }

  /**
   * Sets the <code>orgApacheFelixHttpEnable</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpEnable(ConfigNodePropertyBoolean orgApacheFelixHttpEnable) {
    this.orgApacheFelixHttpEnable = orgApacheFelixHttpEnable;
    return this;
  }

 /**
  * Get orgOsgiServiceHttpPort
  * @return orgOsgiServiceHttpPort
  */
  @JsonProperty("org.osgi.service.http.port")
  public ConfigNodePropertyInteger getOrgOsgiServiceHttpPort() {
    return orgOsgiServiceHttpPort;
  }

  /**
   * Sets the <code>orgOsgiServiceHttpPort</code> property.
   */
 public void setOrgOsgiServiceHttpPort(ConfigNodePropertyInteger orgOsgiServiceHttpPort) {
    this.orgOsgiServiceHttpPort = orgOsgiServiceHttpPort;
  }

  /**
   * Sets the <code>orgOsgiServiceHttpPort</code> property.
   */
  public OrgApacheFelixHttpProperties orgOsgiServiceHttpPort(ConfigNodePropertyInteger orgOsgiServiceHttpPort) {
    this.orgOsgiServiceHttpPort = orgOsgiServiceHttpPort;
    return this;
  }

 /**
  * Get orgApacheFelixHttpTimeout
  * @return orgApacheFelixHttpTimeout
  */
  @JsonProperty("org.apache.felix.http.timeout")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpTimeout() {
    return orgApacheFelixHttpTimeout;
  }

  /**
   * Sets the <code>orgApacheFelixHttpTimeout</code> property.
   */
 public void setOrgApacheFelixHttpTimeout(ConfigNodePropertyInteger orgApacheFelixHttpTimeout) {
    this.orgApacheFelixHttpTimeout = orgApacheFelixHttpTimeout;
  }

  /**
   * Sets the <code>orgApacheFelixHttpTimeout</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpTimeout(ConfigNodePropertyInteger orgApacheFelixHttpTimeout) {
    this.orgApacheFelixHttpTimeout = orgApacheFelixHttpTimeout;
    return this;
  }

 /**
  * Get orgApacheFelixHttpsEnable
  * @return orgApacheFelixHttpsEnable
  */
  @JsonProperty("org.apache.felix.https.enable")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpsEnable() {
    return orgApacheFelixHttpsEnable;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsEnable</code> property.
   */
 public void setOrgApacheFelixHttpsEnable(ConfigNodePropertyBoolean orgApacheFelixHttpsEnable) {
    this.orgApacheFelixHttpsEnable = orgApacheFelixHttpsEnable;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsEnable</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsEnable(ConfigNodePropertyBoolean orgApacheFelixHttpsEnable) {
    this.orgApacheFelixHttpsEnable = orgApacheFelixHttpsEnable;
    return this;
  }

 /**
  * Get orgOsgiServiceHttpPortSecure
  * @return orgOsgiServiceHttpPortSecure
  */
  @JsonProperty("org.osgi.service.http.port.secure")
  public ConfigNodePropertyInteger getOrgOsgiServiceHttpPortSecure() {
    return orgOsgiServiceHttpPortSecure;
  }

  /**
   * Sets the <code>orgOsgiServiceHttpPortSecure</code> property.
   */
 public void setOrgOsgiServiceHttpPortSecure(ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure) {
    this.orgOsgiServiceHttpPortSecure = orgOsgiServiceHttpPortSecure;
  }

  /**
   * Sets the <code>orgOsgiServiceHttpPortSecure</code> property.
   */
  public OrgApacheFelixHttpProperties orgOsgiServiceHttpPortSecure(ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure) {
    this.orgOsgiServiceHttpPortSecure = orgOsgiServiceHttpPortSecure;
    return this;
  }

 /**
  * Get orgApacheFelixHttpsKeystore
  * @return orgApacheFelixHttpsKeystore
  */
  @JsonProperty("org.apache.felix.https.keystore")
  public ConfigNodePropertyString getOrgApacheFelixHttpsKeystore() {
    return orgApacheFelixHttpsKeystore;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsKeystore</code> property.
   */
 public void setOrgApacheFelixHttpsKeystore(ConfigNodePropertyString orgApacheFelixHttpsKeystore) {
    this.orgApacheFelixHttpsKeystore = orgApacheFelixHttpsKeystore;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsKeystore</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsKeystore(ConfigNodePropertyString orgApacheFelixHttpsKeystore) {
    this.orgApacheFelixHttpsKeystore = orgApacheFelixHttpsKeystore;
    return this;
  }

 /**
  * Get orgApacheFelixHttpsKeystorePassword
  * @return orgApacheFelixHttpsKeystorePassword
  */
  @JsonProperty("org.apache.felix.https.keystore.password")
  public ConfigNodePropertyString getOrgApacheFelixHttpsKeystorePassword() {
    return orgApacheFelixHttpsKeystorePassword;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsKeystorePassword</code> property.
   */
 public void setOrgApacheFelixHttpsKeystorePassword(ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword) {
    this.orgApacheFelixHttpsKeystorePassword = orgApacheFelixHttpsKeystorePassword;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsKeystorePassword</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsKeystorePassword(ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword) {
    this.orgApacheFelixHttpsKeystorePassword = orgApacheFelixHttpsKeystorePassword;
    return this;
  }

 /**
  * Get orgApacheFelixHttpsKeystoreKeyPassword
  * @return orgApacheFelixHttpsKeystoreKeyPassword
  */
  @JsonProperty("org.apache.felix.https.keystore.key.password")
  public ConfigNodePropertyString getOrgApacheFelixHttpsKeystoreKeyPassword() {
    return orgApacheFelixHttpsKeystoreKeyPassword;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsKeystoreKeyPassword</code> property.
   */
 public void setOrgApacheFelixHttpsKeystoreKeyPassword(ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword) {
    this.orgApacheFelixHttpsKeystoreKeyPassword = orgApacheFelixHttpsKeystoreKeyPassword;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsKeystoreKeyPassword</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsKeystoreKeyPassword(ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword) {
    this.orgApacheFelixHttpsKeystoreKeyPassword = orgApacheFelixHttpsKeystoreKeyPassword;
    return this;
  }

 /**
  * Get orgApacheFelixHttpsTruststore
  * @return orgApacheFelixHttpsTruststore
  */
  @JsonProperty("org.apache.felix.https.truststore")
  public ConfigNodePropertyString getOrgApacheFelixHttpsTruststore() {
    return orgApacheFelixHttpsTruststore;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsTruststore</code> property.
   */
 public void setOrgApacheFelixHttpsTruststore(ConfigNodePropertyString orgApacheFelixHttpsTruststore) {
    this.orgApacheFelixHttpsTruststore = orgApacheFelixHttpsTruststore;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsTruststore</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsTruststore(ConfigNodePropertyString orgApacheFelixHttpsTruststore) {
    this.orgApacheFelixHttpsTruststore = orgApacheFelixHttpsTruststore;
    return this;
  }

 /**
  * Get orgApacheFelixHttpsTruststorePassword
  * @return orgApacheFelixHttpsTruststorePassword
  */
  @JsonProperty("org.apache.felix.https.truststore.password")
  public ConfigNodePropertyString getOrgApacheFelixHttpsTruststorePassword() {
    return orgApacheFelixHttpsTruststorePassword;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsTruststorePassword</code> property.
   */
 public void setOrgApacheFelixHttpsTruststorePassword(ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword) {
    this.orgApacheFelixHttpsTruststorePassword = orgApacheFelixHttpsTruststorePassword;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsTruststorePassword</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsTruststorePassword(ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword) {
    this.orgApacheFelixHttpsTruststorePassword = orgApacheFelixHttpsTruststorePassword;
    return this;
  }

 /**
  * Get orgApacheFelixHttpsClientcertificate
  * @return orgApacheFelixHttpsClientcertificate
  */
  @JsonProperty("org.apache.felix.https.clientcertificate")
  public ConfigNodePropertyDropDown getOrgApacheFelixHttpsClientcertificate() {
    return orgApacheFelixHttpsClientcertificate;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsClientcertificate</code> property.
   */
 public void setOrgApacheFelixHttpsClientcertificate(ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate) {
    this.orgApacheFelixHttpsClientcertificate = orgApacheFelixHttpsClientcertificate;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsClientcertificate</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsClientcertificate(ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate) {
    this.orgApacheFelixHttpsClientcertificate = orgApacheFelixHttpsClientcertificate;
    return this;
  }

 /**
  * Get orgApacheFelixHttpContextPath
  * @return orgApacheFelixHttpContextPath
  */
  @JsonProperty("org.apache.felix.http.context_path")
  public ConfigNodePropertyString getOrgApacheFelixHttpContextPath() {
    return orgApacheFelixHttpContextPath;
  }

  /**
   * Sets the <code>orgApacheFelixHttpContextPath</code> property.
   */
 public void setOrgApacheFelixHttpContextPath(ConfigNodePropertyString orgApacheFelixHttpContextPath) {
    this.orgApacheFelixHttpContextPath = orgApacheFelixHttpContextPath;
  }

  /**
   * Sets the <code>orgApacheFelixHttpContextPath</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpContextPath(ConfigNodePropertyString orgApacheFelixHttpContextPath) {
    this.orgApacheFelixHttpContextPath = orgApacheFelixHttpContextPath;
    return this;
  }

 /**
  * Get orgApacheFelixHttpMbeans
  * @return orgApacheFelixHttpMbeans
  */
  @JsonProperty("org.apache.felix.http.mbeans")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpMbeans() {
    return orgApacheFelixHttpMbeans;
  }

  /**
   * Sets the <code>orgApacheFelixHttpMbeans</code> property.
   */
 public void setOrgApacheFelixHttpMbeans(ConfigNodePropertyBoolean orgApacheFelixHttpMbeans) {
    this.orgApacheFelixHttpMbeans = orgApacheFelixHttpMbeans;
  }

  /**
   * Sets the <code>orgApacheFelixHttpMbeans</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpMbeans(ConfigNodePropertyBoolean orgApacheFelixHttpMbeans) {
    this.orgApacheFelixHttpMbeans = orgApacheFelixHttpMbeans;
    return this;
  }

 /**
  * Get orgApacheFelixHttpSessionTimeout
  * @return orgApacheFelixHttpSessionTimeout
  */
  @JsonProperty("org.apache.felix.http.session.timeout")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpSessionTimeout() {
    return orgApacheFelixHttpSessionTimeout;
  }

  /**
   * Sets the <code>orgApacheFelixHttpSessionTimeout</code> property.
   */
 public void setOrgApacheFelixHttpSessionTimeout(ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout) {
    this.orgApacheFelixHttpSessionTimeout = orgApacheFelixHttpSessionTimeout;
  }

  /**
   * Sets the <code>orgApacheFelixHttpSessionTimeout</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpSessionTimeout(ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout) {
    this.orgApacheFelixHttpSessionTimeout = orgApacheFelixHttpSessionTimeout;
    return this;
  }

 /**
  * Get orgApacheFelixHttpJettyThreadpoolMax
  * @return orgApacheFelixHttpJettyThreadpoolMax
  */
  @JsonProperty("org.apache.felix.http.jetty.threadpool.max")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyThreadpoolMax() {
    return orgApacheFelixHttpJettyThreadpoolMax;
  }

  /**
   * Sets the <code>orgApacheFelixHttpJettyThreadpoolMax</code> property.
   */
 public void setOrgApacheFelixHttpJettyThreadpoolMax(ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax) {
    this.orgApacheFelixHttpJettyThreadpoolMax = orgApacheFelixHttpJettyThreadpoolMax;
  }

  /**
   * Sets the <code>orgApacheFelixHttpJettyThreadpoolMax</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyThreadpoolMax(ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax) {
    this.orgApacheFelixHttpJettyThreadpoolMax = orgApacheFelixHttpJettyThreadpoolMax;
    return this;
  }

 /**
  * Get orgApacheFelixHttpJettyAcceptors
  * @return orgApacheFelixHttpJettyAcceptors
  */
  @JsonProperty("org.apache.felix.http.jetty.acceptors")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyAcceptors() {
    return orgApacheFelixHttpJettyAcceptors;
  }

  /**
   * Sets the <code>orgApacheFelixHttpJettyAcceptors</code> property.
   */
 public void setOrgApacheFelixHttpJettyAcceptors(ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors) {
    this.orgApacheFelixHttpJettyAcceptors = orgApacheFelixHttpJettyAcceptors;
  }

  /**
   * Sets the <code>orgApacheFelixHttpJettyAcceptors</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyAcceptors(ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors) {
    this.orgApacheFelixHttpJettyAcceptors = orgApacheFelixHttpJettyAcceptors;
    return this;
  }

 /**
  * Get orgApacheFelixHttpJettySelectors
  * @return orgApacheFelixHttpJettySelectors
  */
  @JsonProperty("org.apache.felix.http.jetty.selectors")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettySelectors() {
    return orgApacheFelixHttpJettySelectors;
  }

  /**
   * Sets the <code>orgApacheFelixHttpJettySelectors</code> property.
   */
 public void setOrgApacheFelixHttpJettySelectors(ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors) {
    this.orgApacheFelixHttpJettySelectors = orgApacheFelixHttpJettySelectors;
  }

  /**
   * Sets the <code>orgApacheFelixHttpJettySelectors</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettySelectors(ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors) {
    this.orgApacheFelixHttpJettySelectors = orgApacheFelixHttpJettySelectors;
    return this;
  }

 /**
  * Get orgApacheFelixHttpJettyHeaderBufferSize
  * @return orgApacheFelixHttpJettyHeaderBufferSize
  */
  @JsonProperty("org.apache.felix.http.jetty.headerBufferSize")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyHeaderBufferSize() {
    return orgApacheFelixHttpJettyHeaderBufferSize;
  }

  /**
   * Sets the <code>orgApacheFelixHttpJettyHeaderBufferSize</code> property.
   */
 public void setOrgApacheFelixHttpJettyHeaderBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize) {
    this.orgApacheFelixHttpJettyHeaderBufferSize = orgApacheFelixHttpJettyHeaderBufferSize;
  }

  /**
   * Sets the <code>orgApacheFelixHttpJettyHeaderBufferSize</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyHeaderBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize) {
    this.orgApacheFelixHttpJettyHeaderBufferSize = orgApacheFelixHttpJettyHeaderBufferSize;
    return this;
  }

 /**
  * Get orgApacheFelixHttpJettyRequestBufferSize
  * @return orgApacheFelixHttpJettyRequestBufferSize
  */
  @JsonProperty("org.apache.felix.http.jetty.requestBufferSize")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyRequestBufferSize() {
    return orgApacheFelixHttpJettyRequestBufferSize;
  }

  /**
   * Sets the <code>orgApacheFelixHttpJettyRequestBufferSize</code> property.
   */
 public void setOrgApacheFelixHttpJettyRequestBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize) {
    this.orgApacheFelixHttpJettyRequestBufferSize = orgApacheFelixHttpJettyRequestBufferSize;
  }

  /**
   * Sets the <code>orgApacheFelixHttpJettyRequestBufferSize</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyRequestBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize) {
    this.orgApacheFelixHttpJettyRequestBufferSize = orgApacheFelixHttpJettyRequestBufferSize;
    return this;
  }

 /**
  * Get orgApacheFelixHttpJettyResponseBufferSize
  * @return orgApacheFelixHttpJettyResponseBufferSize
  */
  @JsonProperty("org.apache.felix.http.jetty.responseBufferSize")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyResponseBufferSize() {
    return orgApacheFelixHttpJettyResponseBufferSize;
  }

  /**
   * Sets the <code>orgApacheFelixHttpJettyResponseBufferSize</code> property.
   */
 public void setOrgApacheFelixHttpJettyResponseBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize) {
    this.orgApacheFelixHttpJettyResponseBufferSize = orgApacheFelixHttpJettyResponseBufferSize;
  }

  /**
   * Sets the <code>orgApacheFelixHttpJettyResponseBufferSize</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyResponseBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize) {
    this.orgApacheFelixHttpJettyResponseBufferSize = orgApacheFelixHttpJettyResponseBufferSize;
    return this;
  }

 /**
  * Get orgApacheFelixHttpJettyMaxFormSize
  * @return orgApacheFelixHttpJettyMaxFormSize
  */
  @JsonProperty("org.apache.felix.http.jetty.maxFormSize")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyMaxFormSize() {
    return orgApacheFelixHttpJettyMaxFormSize;
  }

  /**
   * Sets the <code>orgApacheFelixHttpJettyMaxFormSize</code> property.
   */
 public void setOrgApacheFelixHttpJettyMaxFormSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize) {
    this.orgApacheFelixHttpJettyMaxFormSize = orgApacheFelixHttpJettyMaxFormSize;
  }

  /**
   * Sets the <code>orgApacheFelixHttpJettyMaxFormSize</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyMaxFormSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize) {
    this.orgApacheFelixHttpJettyMaxFormSize = orgApacheFelixHttpJettyMaxFormSize;
    return this;
  }

 /**
  * Get orgApacheFelixHttpPathExclusions
  * @return orgApacheFelixHttpPathExclusions
  */
  @JsonProperty("org.apache.felix.http.path_exclusions")
  public ConfigNodePropertyArray getOrgApacheFelixHttpPathExclusions() {
    return orgApacheFelixHttpPathExclusions;
  }

  /**
   * Sets the <code>orgApacheFelixHttpPathExclusions</code> property.
   */
 public void setOrgApacheFelixHttpPathExclusions(ConfigNodePropertyArray orgApacheFelixHttpPathExclusions) {
    this.orgApacheFelixHttpPathExclusions = orgApacheFelixHttpPathExclusions;
  }

  /**
   * Sets the <code>orgApacheFelixHttpPathExclusions</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpPathExclusions(ConfigNodePropertyArray orgApacheFelixHttpPathExclusions) {
    this.orgApacheFelixHttpPathExclusions = orgApacheFelixHttpPathExclusions;
    return this;
  }

 /**
  * Get orgApacheFelixHttpsJettyCiphersuitesExcluded
  * @return orgApacheFelixHttpsJettyCiphersuitesExcluded
  */
  @JsonProperty("org.apache.felix.https.jetty.ciphersuites.excluded")
  public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyCiphersuitesExcluded() {
    return orgApacheFelixHttpsJettyCiphersuitesExcluded;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsJettyCiphersuitesExcluded</code> property.
   */
 public void setOrgApacheFelixHttpsJettyCiphersuitesExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesExcluded = orgApacheFelixHttpsJettyCiphersuitesExcluded;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsJettyCiphersuitesExcluded</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyCiphersuitesExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesExcluded = orgApacheFelixHttpsJettyCiphersuitesExcluded;
    return this;
  }

 /**
  * Get orgApacheFelixHttpsJettyCiphersuitesIncluded
  * @return orgApacheFelixHttpsJettyCiphersuitesIncluded
  */
  @JsonProperty("org.apache.felix.https.jetty.ciphersuites.included")
  public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyCiphersuitesIncluded() {
    return orgApacheFelixHttpsJettyCiphersuitesIncluded;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsJettyCiphersuitesIncluded</code> property.
   */
 public void setOrgApacheFelixHttpsJettyCiphersuitesIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesIncluded = orgApacheFelixHttpsJettyCiphersuitesIncluded;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsJettyCiphersuitesIncluded</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyCiphersuitesIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesIncluded = orgApacheFelixHttpsJettyCiphersuitesIncluded;
    return this;
  }

 /**
  * Get orgApacheFelixHttpJettySendServerHeader
  * @return orgApacheFelixHttpJettySendServerHeader
  */
  @JsonProperty("org.apache.felix.http.jetty.sendServerHeader")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpJettySendServerHeader() {
    return orgApacheFelixHttpJettySendServerHeader;
  }

  /**
   * Sets the <code>orgApacheFelixHttpJettySendServerHeader</code> property.
   */
 public void setOrgApacheFelixHttpJettySendServerHeader(ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader) {
    this.orgApacheFelixHttpJettySendServerHeader = orgApacheFelixHttpJettySendServerHeader;
  }

  /**
   * Sets the <code>orgApacheFelixHttpJettySendServerHeader</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettySendServerHeader(ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader) {
    this.orgApacheFelixHttpJettySendServerHeader = orgApacheFelixHttpJettySendServerHeader;
    return this;
  }

 /**
  * Get orgApacheFelixHttpsJettyProtocolsIncluded
  * @return orgApacheFelixHttpsJettyProtocolsIncluded
  */
  @JsonProperty("org.apache.felix.https.jetty.protocols.included")
  public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyProtocolsIncluded() {
    return orgApacheFelixHttpsJettyProtocolsIncluded;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsJettyProtocolsIncluded</code> property.
   */
 public void setOrgApacheFelixHttpsJettyProtocolsIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded) {
    this.orgApacheFelixHttpsJettyProtocolsIncluded = orgApacheFelixHttpsJettyProtocolsIncluded;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsJettyProtocolsIncluded</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyProtocolsIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded) {
    this.orgApacheFelixHttpsJettyProtocolsIncluded = orgApacheFelixHttpsJettyProtocolsIncluded;
    return this;
  }

 /**
  * Get orgApacheFelixHttpsJettyProtocolsExcluded
  * @return orgApacheFelixHttpsJettyProtocolsExcluded
  */
  @JsonProperty("org.apache.felix.https.jetty.protocols.excluded")
  public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyProtocolsExcluded() {
    return orgApacheFelixHttpsJettyProtocolsExcluded;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsJettyProtocolsExcluded</code> property.
   */
 public void setOrgApacheFelixHttpsJettyProtocolsExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded) {
    this.orgApacheFelixHttpsJettyProtocolsExcluded = orgApacheFelixHttpsJettyProtocolsExcluded;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsJettyProtocolsExcluded</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyProtocolsExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded) {
    this.orgApacheFelixHttpsJettyProtocolsExcluded = orgApacheFelixHttpsJettyProtocolsExcluded;
    return this;
  }

 /**
  * Get orgApacheFelixProxyLoadBalancerConnectionEnable
  * @return orgApacheFelixProxyLoadBalancerConnectionEnable
  */
  @JsonProperty("org.apache.felix.proxy.load.balancer.connection.enable")
  public ConfigNodePropertyBoolean getOrgApacheFelixProxyLoadBalancerConnectionEnable() {
    return orgApacheFelixProxyLoadBalancerConnectionEnable;
  }

  /**
   * Sets the <code>orgApacheFelixProxyLoadBalancerConnectionEnable</code> property.
   */
 public void setOrgApacheFelixProxyLoadBalancerConnectionEnable(ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable) {
    this.orgApacheFelixProxyLoadBalancerConnectionEnable = orgApacheFelixProxyLoadBalancerConnectionEnable;
  }

  /**
   * Sets the <code>orgApacheFelixProxyLoadBalancerConnectionEnable</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixProxyLoadBalancerConnectionEnable(ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable) {
    this.orgApacheFelixProxyLoadBalancerConnectionEnable = orgApacheFelixProxyLoadBalancerConnectionEnable;
    return this;
  }

 /**
  * Get orgApacheFelixHttpsJettyRenegotiateAllowed
  * @return orgApacheFelixHttpsJettyRenegotiateAllowed
  */
  @JsonProperty("org.apache.felix.https.jetty.renegotiateAllowed")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettyRenegotiateAllowed() {
    return orgApacheFelixHttpsJettyRenegotiateAllowed;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsJettyRenegotiateAllowed</code> property.
   */
 public void setOrgApacheFelixHttpsJettyRenegotiateAllowed(ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed) {
    this.orgApacheFelixHttpsJettyRenegotiateAllowed = orgApacheFelixHttpsJettyRenegotiateAllowed;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsJettyRenegotiateAllowed</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyRenegotiateAllowed(ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed) {
    this.orgApacheFelixHttpsJettyRenegotiateAllowed = orgApacheFelixHttpsJettyRenegotiateAllowed;
    return this;
  }

 /**
  * Get orgApacheFelixHttpsJettySessionCookieHttpOnly
  * @return orgApacheFelixHttpsJettySessionCookieHttpOnly
  */
  @JsonProperty("org.apache.felix.https.jetty.session.cookie.httpOnly")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettySessionCookieHttpOnly() {
    return orgApacheFelixHttpsJettySessionCookieHttpOnly;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsJettySessionCookieHttpOnly</code> property.
   */
 public void setOrgApacheFelixHttpsJettySessionCookieHttpOnly(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly) {
    this.orgApacheFelixHttpsJettySessionCookieHttpOnly = orgApacheFelixHttpsJettySessionCookieHttpOnly;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsJettySessionCookieHttpOnly</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettySessionCookieHttpOnly(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly) {
    this.orgApacheFelixHttpsJettySessionCookieHttpOnly = orgApacheFelixHttpsJettySessionCookieHttpOnly;
    return this;
  }

 /**
  * Get orgApacheFelixHttpsJettySessionCookieSecure
  * @return orgApacheFelixHttpsJettySessionCookieSecure
  */
  @JsonProperty("org.apache.felix.https.jetty.session.cookie.secure")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettySessionCookieSecure() {
    return orgApacheFelixHttpsJettySessionCookieSecure;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsJettySessionCookieSecure</code> property.
   */
 public void setOrgApacheFelixHttpsJettySessionCookieSecure(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure) {
    this.orgApacheFelixHttpsJettySessionCookieSecure = orgApacheFelixHttpsJettySessionCookieSecure;
  }

  /**
   * Sets the <code>orgApacheFelixHttpsJettySessionCookieSecure</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettySessionCookieSecure(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure) {
    this.orgApacheFelixHttpsJettySessionCookieSecure = orgApacheFelixHttpsJettySessionCookieSecure;
    return this;
  }

 /**
  * Get orgEclipseJettyServletSessionIdPathParameterName
  * @return orgEclipseJettyServletSessionIdPathParameterName
  */
  @JsonProperty("org.eclipse.jetty.servlet.SessionIdPathParameterName")
  public ConfigNodePropertyString getOrgEclipseJettyServletSessionIdPathParameterName() {
    return orgEclipseJettyServletSessionIdPathParameterName;
  }

  /**
   * Sets the <code>orgEclipseJettyServletSessionIdPathParameterName</code> property.
   */
 public void setOrgEclipseJettyServletSessionIdPathParameterName(ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName) {
    this.orgEclipseJettyServletSessionIdPathParameterName = orgEclipseJettyServletSessionIdPathParameterName;
  }

  /**
   * Sets the <code>orgEclipseJettyServletSessionIdPathParameterName</code> property.
   */
  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionIdPathParameterName(ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName) {
    this.orgEclipseJettyServletSessionIdPathParameterName = orgEclipseJettyServletSessionIdPathParameterName;
    return this;
  }

 /**
  * Get orgEclipseJettyServletCheckingRemoteSessionIdEncoding
  * @return orgEclipseJettyServletCheckingRemoteSessionIdEncoding
  */
  @JsonProperty("org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding")
  public ConfigNodePropertyBoolean getOrgEclipseJettyServletCheckingRemoteSessionIdEncoding() {
    return orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
  }

  /**
   * Sets the <code>orgEclipseJettyServletCheckingRemoteSessionIdEncoding</code> property.
   */
 public void setOrgEclipseJettyServletCheckingRemoteSessionIdEncoding(ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding) {
    this.orgEclipseJettyServletCheckingRemoteSessionIdEncoding = orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
  }

  /**
   * Sets the <code>orgEclipseJettyServletCheckingRemoteSessionIdEncoding</code> property.
   */
  public OrgApacheFelixHttpProperties orgEclipseJettyServletCheckingRemoteSessionIdEncoding(ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding) {
    this.orgEclipseJettyServletCheckingRemoteSessionIdEncoding = orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
    return this;
  }

 /**
  * Get orgEclipseJettyServletSessionCookie
  * @return orgEclipseJettyServletSessionCookie
  */
  @JsonProperty("org.eclipse.jetty.servlet.SessionCookie")
  public ConfigNodePropertyString getOrgEclipseJettyServletSessionCookie() {
    return orgEclipseJettyServletSessionCookie;
  }

  /**
   * Sets the <code>orgEclipseJettyServletSessionCookie</code> property.
   */
 public void setOrgEclipseJettyServletSessionCookie(ConfigNodePropertyString orgEclipseJettyServletSessionCookie) {
    this.orgEclipseJettyServletSessionCookie = orgEclipseJettyServletSessionCookie;
  }

  /**
   * Sets the <code>orgEclipseJettyServletSessionCookie</code> property.
   */
  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionCookie(ConfigNodePropertyString orgEclipseJettyServletSessionCookie) {
    this.orgEclipseJettyServletSessionCookie = orgEclipseJettyServletSessionCookie;
    return this;
  }

 /**
  * Get orgEclipseJettyServletSessionDomain
  * @return orgEclipseJettyServletSessionDomain
  */
  @JsonProperty("org.eclipse.jetty.servlet.SessionDomain")
  public ConfigNodePropertyString getOrgEclipseJettyServletSessionDomain() {
    return orgEclipseJettyServletSessionDomain;
  }

  /**
   * Sets the <code>orgEclipseJettyServletSessionDomain</code> property.
   */
 public void setOrgEclipseJettyServletSessionDomain(ConfigNodePropertyString orgEclipseJettyServletSessionDomain) {
    this.orgEclipseJettyServletSessionDomain = orgEclipseJettyServletSessionDomain;
  }

  /**
   * Sets the <code>orgEclipseJettyServletSessionDomain</code> property.
   */
  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionDomain(ConfigNodePropertyString orgEclipseJettyServletSessionDomain) {
    this.orgEclipseJettyServletSessionDomain = orgEclipseJettyServletSessionDomain;
    return this;
  }

 /**
  * Get orgEclipseJettyServletSessionPath
  * @return orgEclipseJettyServletSessionPath
  */
  @JsonProperty("org.eclipse.jetty.servlet.SessionPath")
  public ConfigNodePropertyString getOrgEclipseJettyServletSessionPath() {
    return orgEclipseJettyServletSessionPath;
  }

  /**
   * Sets the <code>orgEclipseJettyServletSessionPath</code> property.
   */
 public void setOrgEclipseJettyServletSessionPath(ConfigNodePropertyString orgEclipseJettyServletSessionPath) {
    this.orgEclipseJettyServletSessionPath = orgEclipseJettyServletSessionPath;
  }

  /**
   * Sets the <code>orgEclipseJettyServletSessionPath</code> property.
   */
  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionPath(ConfigNodePropertyString orgEclipseJettyServletSessionPath) {
    this.orgEclipseJettyServletSessionPath = orgEclipseJettyServletSessionPath;
    return this;
  }

 /**
  * Get orgEclipseJettyServletMaxAge
  * @return orgEclipseJettyServletMaxAge
  */
  @JsonProperty("org.eclipse.jetty.servlet.MaxAge")
  public ConfigNodePropertyInteger getOrgEclipseJettyServletMaxAge() {
    return orgEclipseJettyServletMaxAge;
  }

  /**
   * Sets the <code>orgEclipseJettyServletMaxAge</code> property.
   */
 public void setOrgEclipseJettyServletMaxAge(ConfigNodePropertyInteger orgEclipseJettyServletMaxAge) {
    this.orgEclipseJettyServletMaxAge = orgEclipseJettyServletMaxAge;
  }

  /**
   * Sets the <code>orgEclipseJettyServletMaxAge</code> property.
   */
  public OrgApacheFelixHttpProperties orgEclipseJettyServletMaxAge(ConfigNodePropertyInteger orgEclipseJettyServletMaxAge) {
    this.orgEclipseJettyServletMaxAge = orgEclipseJettyServletMaxAge;
    return this;
  }

 /**
  * Get orgApacheFelixHttpName
  * @return orgApacheFelixHttpName
  */
  @JsonProperty("org.apache.felix.http.name")
  public ConfigNodePropertyString getOrgApacheFelixHttpName() {
    return orgApacheFelixHttpName;
  }

  /**
   * Sets the <code>orgApacheFelixHttpName</code> property.
   */
 public void setOrgApacheFelixHttpName(ConfigNodePropertyString orgApacheFelixHttpName) {
    this.orgApacheFelixHttpName = orgApacheFelixHttpName;
  }

  /**
   * Sets the <code>orgApacheFelixHttpName</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpName(ConfigNodePropertyString orgApacheFelixHttpName) {
    this.orgApacheFelixHttpName = orgApacheFelixHttpName;
    return this;
  }

 /**
  * Get orgApacheFelixJettyGziphandlerEnable
  * @return orgApacheFelixJettyGziphandlerEnable
  */
  @JsonProperty("org.apache.felix.jetty.gziphandler.enable")
  public ConfigNodePropertyBoolean getOrgApacheFelixJettyGziphandlerEnable() {
    return orgApacheFelixJettyGziphandlerEnable;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGziphandlerEnable</code> property.
   */
 public void setOrgApacheFelixJettyGziphandlerEnable(ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable) {
    this.orgApacheFelixJettyGziphandlerEnable = orgApacheFelixJettyGziphandlerEnable;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGziphandlerEnable</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGziphandlerEnable(ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable) {
    this.orgApacheFelixJettyGziphandlerEnable = orgApacheFelixJettyGziphandlerEnable;
    return this;
  }

 /**
  * Get orgApacheFelixJettyGzipMinGzipSize
  * @return orgApacheFelixJettyGzipMinGzipSize
  */
  @JsonProperty("org.apache.felix.jetty.gzip.minGzipSize")
  public ConfigNodePropertyInteger getOrgApacheFelixJettyGzipMinGzipSize() {
    return orgApacheFelixJettyGzipMinGzipSize;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipMinGzipSize</code> property.
   */
 public void setOrgApacheFelixJettyGzipMinGzipSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize) {
    this.orgApacheFelixJettyGzipMinGzipSize = orgApacheFelixJettyGzipMinGzipSize;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipMinGzipSize</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipMinGzipSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize) {
    this.orgApacheFelixJettyGzipMinGzipSize = orgApacheFelixJettyGzipMinGzipSize;
    return this;
  }

 /**
  * Get orgApacheFelixJettyGzipCompressionLevel
  * @return orgApacheFelixJettyGzipCompressionLevel
  */
  @JsonProperty("org.apache.felix.jetty.gzip.compressionLevel")
  public ConfigNodePropertyInteger getOrgApacheFelixJettyGzipCompressionLevel() {
    return orgApacheFelixJettyGzipCompressionLevel;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipCompressionLevel</code> property.
   */
 public void setOrgApacheFelixJettyGzipCompressionLevel(ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel) {
    this.orgApacheFelixJettyGzipCompressionLevel = orgApacheFelixJettyGzipCompressionLevel;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipCompressionLevel</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipCompressionLevel(ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel) {
    this.orgApacheFelixJettyGzipCompressionLevel = orgApacheFelixJettyGzipCompressionLevel;
    return this;
  }

 /**
  * Get orgApacheFelixJettyGzipInflateBufferSize
  * @return orgApacheFelixJettyGzipInflateBufferSize
  */
  @JsonProperty("org.apache.felix.jetty.gzip.inflateBufferSize")
  public ConfigNodePropertyInteger getOrgApacheFelixJettyGzipInflateBufferSize() {
    return orgApacheFelixJettyGzipInflateBufferSize;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipInflateBufferSize</code> property.
   */
 public void setOrgApacheFelixJettyGzipInflateBufferSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize) {
    this.orgApacheFelixJettyGzipInflateBufferSize = orgApacheFelixJettyGzipInflateBufferSize;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipInflateBufferSize</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipInflateBufferSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize) {
    this.orgApacheFelixJettyGzipInflateBufferSize = orgApacheFelixJettyGzipInflateBufferSize;
    return this;
  }

 /**
  * Get orgApacheFelixJettyGzipSyncFlush
  * @return orgApacheFelixJettyGzipSyncFlush
  */
  @JsonProperty("org.apache.felix.jetty.gzip.syncFlush")
  public ConfigNodePropertyBoolean getOrgApacheFelixJettyGzipSyncFlush() {
    return orgApacheFelixJettyGzipSyncFlush;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipSyncFlush</code> property.
   */
 public void setOrgApacheFelixJettyGzipSyncFlush(ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush) {
    this.orgApacheFelixJettyGzipSyncFlush = orgApacheFelixJettyGzipSyncFlush;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipSyncFlush</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipSyncFlush(ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush) {
    this.orgApacheFelixJettyGzipSyncFlush = orgApacheFelixJettyGzipSyncFlush;
    return this;
  }

 /**
  * Get orgApacheFelixJettyGzipExcludedUserAgents
  * @return orgApacheFelixJettyGzipExcludedUserAgents
  */
  @JsonProperty("org.apache.felix.jetty.gzip.excludedUserAgents")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedUserAgents() {
    return orgApacheFelixJettyGzipExcludedUserAgents;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipExcludedUserAgents</code> property.
   */
 public void setOrgApacheFelixJettyGzipExcludedUserAgents(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents) {
    this.orgApacheFelixJettyGzipExcludedUserAgents = orgApacheFelixJettyGzipExcludedUserAgents;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipExcludedUserAgents</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedUserAgents(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents) {
    this.orgApacheFelixJettyGzipExcludedUserAgents = orgApacheFelixJettyGzipExcludedUserAgents;
    return this;
  }

 /**
  * Get orgApacheFelixJettyGzipIncludedMethods
  * @return orgApacheFelixJettyGzipIncludedMethods
  */
  @JsonProperty("org.apache.felix.jetty.gzip.includedMethods")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedMethods() {
    return orgApacheFelixJettyGzipIncludedMethods;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipIncludedMethods</code> property.
   */
 public void setOrgApacheFelixJettyGzipIncludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods) {
    this.orgApacheFelixJettyGzipIncludedMethods = orgApacheFelixJettyGzipIncludedMethods;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipIncludedMethods</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipIncludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods) {
    this.orgApacheFelixJettyGzipIncludedMethods = orgApacheFelixJettyGzipIncludedMethods;
    return this;
  }

 /**
  * Get orgApacheFelixJettyGzipExcludedMethods
  * @return orgApacheFelixJettyGzipExcludedMethods
  */
  @JsonProperty("org.apache.felix.jetty.gzip.excludedMethods")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedMethods() {
    return orgApacheFelixJettyGzipExcludedMethods;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipExcludedMethods</code> property.
   */
 public void setOrgApacheFelixJettyGzipExcludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods) {
    this.orgApacheFelixJettyGzipExcludedMethods = orgApacheFelixJettyGzipExcludedMethods;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipExcludedMethods</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods) {
    this.orgApacheFelixJettyGzipExcludedMethods = orgApacheFelixJettyGzipExcludedMethods;
    return this;
  }

 /**
  * Get orgApacheFelixJettyGzipIncludedPaths
  * @return orgApacheFelixJettyGzipIncludedPaths
  */
  @JsonProperty("org.apache.felix.jetty.gzip.includedPaths")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedPaths() {
    return orgApacheFelixJettyGzipIncludedPaths;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipIncludedPaths</code> property.
   */
 public void setOrgApacheFelixJettyGzipIncludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths) {
    this.orgApacheFelixJettyGzipIncludedPaths = orgApacheFelixJettyGzipIncludedPaths;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipIncludedPaths</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipIncludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths) {
    this.orgApacheFelixJettyGzipIncludedPaths = orgApacheFelixJettyGzipIncludedPaths;
    return this;
  }

 /**
  * Get orgApacheFelixJettyGzipExcludedPaths
  * @return orgApacheFelixJettyGzipExcludedPaths
  */
  @JsonProperty("org.apache.felix.jetty.gzip.excludedPaths")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedPaths() {
    return orgApacheFelixJettyGzipExcludedPaths;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipExcludedPaths</code> property.
   */
 public void setOrgApacheFelixJettyGzipExcludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths) {
    this.orgApacheFelixJettyGzipExcludedPaths = orgApacheFelixJettyGzipExcludedPaths;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipExcludedPaths</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths) {
    this.orgApacheFelixJettyGzipExcludedPaths = orgApacheFelixJettyGzipExcludedPaths;
    return this;
  }

 /**
  * Get orgApacheFelixJettyGzipIncludedMimeTypes
  * @return orgApacheFelixJettyGzipIncludedMimeTypes
  */
  @JsonProperty("org.apache.felix.jetty.gzip.includedMimeTypes")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedMimeTypes() {
    return orgApacheFelixJettyGzipIncludedMimeTypes;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipIncludedMimeTypes</code> property.
   */
 public void setOrgApacheFelixJettyGzipIncludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes) {
    this.orgApacheFelixJettyGzipIncludedMimeTypes = orgApacheFelixJettyGzipIncludedMimeTypes;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipIncludedMimeTypes</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipIncludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes) {
    this.orgApacheFelixJettyGzipIncludedMimeTypes = orgApacheFelixJettyGzipIncludedMimeTypes;
    return this;
  }

 /**
  * Get orgApacheFelixJettyGzipExcludedMimeTypes
  * @return orgApacheFelixJettyGzipExcludedMimeTypes
  */
  @JsonProperty("org.apache.felix.jetty.gzip.excludedMimeTypes")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedMimeTypes() {
    return orgApacheFelixJettyGzipExcludedMimeTypes;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipExcludedMimeTypes</code> property.
   */
 public void setOrgApacheFelixJettyGzipExcludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes) {
    this.orgApacheFelixJettyGzipExcludedMimeTypes = orgApacheFelixJettyGzipExcludedMimeTypes;
  }

  /**
   * Sets the <code>orgApacheFelixJettyGzipExcludedMimeTypes</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes) {
    this.orgApacheFelixJettyGzipExcludedMimeTypes = orgApacheFelixJettyGzipExcludedMimeTypes;
    return this;
  }

 /**
  * Get orgApacheFelixHttpSessionInvalidate
  * @return orgApacheFelixHttpSessionInvalidate
  */
  @JsonProperty("org.apache.felix.http.session.invalidate")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpSessionInvalidate() {
    return orgApacheFelixHttpSessionInvalidate;
  }

  /**
   * Sets the <code>orgApacheFelixHttpSessionInvalidate</code> property.
   */
 public void setOrgApacheFelixHttpSessionInvalidate(ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate) {
    this.orgApacheFelixHttpSessionInvalidate = orgApacheFelixHttpSessionInvalidate;
  }

  /**
   * Sets the <code>orgApacheFelixHttpSessionInvalidate</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpSessionInvalidate(ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate) {
    this.orgApacheFelixHttpSessionInvalidate = orgApacheFelixHttpSessionInvalidate;
    return this;
  }

 /**
  * Get orgApacheFelixHttpSessionUniqueid
  * @return orgApacheFelixHttpSessionUniqueid
  */
  @JsonProperty("org.apache.felix.http.session.uniqueid")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpSessionUniqueid() {
    return orgApacheFelixHttpSessionUniqueid;
  }

  /**
   * Sets the <code>orgApacheFelixHttpSessionUniqueid</code> property.
   */
 public void setOrgApacheFelixHttpSessionUniqueid(ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid) {
    this.orgApacheFelixHttpSessionUniqueid = orgApacheFelixHttpSessionUniqueid;
  }

  /**
   * Sets the <code>orgApacheFelixHttpSessionUniqueid</code> property.
   */
  public OrgApacheFelixHttpProperties orgApacheFelixHttpSessionUniqueid(ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid) {
    this.orgApacheFelixHttpSessionUniqueid = orgApacheFelixHttpSessionUniqueid;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

