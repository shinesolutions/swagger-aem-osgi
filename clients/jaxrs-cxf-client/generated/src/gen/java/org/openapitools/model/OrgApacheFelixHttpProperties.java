package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheFelixHttpProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString orgApacheFelixHttpHost = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean orgApacheFelixHttpEnable = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger orgOsgiServiceHttpPort = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger orgApacheFelixHttpTimeout = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean orgApacheFelixHttpsEnable = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString orgApacheFelixHttpsKeystore = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString orgApacheFelixHttpsTruststore = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString orgApacheFelixHttpContextPath = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean orgApacheFelixHttpMbeans = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray orgApacheFelixHttpPathExclusions = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString orgEclipseJettyServletSessionCookie = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString orgEclipseJettyServletSessionDomain = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString orgEclipseJettyServletSessionPath = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger orgEclipseJettyServletMaxAge = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString orgApacheFelixHttpName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid = null;
 /**
   * Get orgApacheFelixHttpHost
   * @return orgApacheFelixHttpHost
  **/
  @JsonProperty("org.apache.felix.http.host")
  public ConfigNodePropertyString getOrgApacheFelixHttpHost() {
    return orgApacheFelixHttpHost;
  }

  public void setOrgApacheFelixHttpHost(ConfigNodePropertyString orgApacheFelixHttpHost) {
    this.orgApacheFelixHttpHost = orgApacheFelixHttpHost;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpHost(ConfigNodePropertyString orgApacheFelixHttpHost) {
    this.orgApacheFelixHttpHost = orgApacheFelixHttpHost;
    return this;
  }

 /**
   * Get orgApacheFelixHttpEnable
   * @return orgApacheFelixHttpEnable
  **/
  @JsonProperty("org.apache.felix.http.enable")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpEnable() {
    return orgApacheFelixHttpEnable;
  }

  public void setOrgApacheFelixHttpEnable(ConfigNodePropertyBoolean orgApacheFelixHttpEnable) {
    this.orgApacheFelixHttpEnable = orgApacheFelixHttpEnable;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpEnable(ConfigNodePropertyBoolean orgApacheFelixHttpEnable) {
    this.orgApacheFelixHttpEnable = orgApacheFelixHttpEnable;
    return this;
  }

 /**
   * Get orgOsgiServiceHttpPort
   * @return orgOsgiServiceHttpPort
  **/
  @JsonProperty("org.osgi.service.http.port")
  public ConfigNodePropertyInteger getOrgOsgiServiceHttpPort() {
    return orgOsgiServiceHttpPort;
  }

  public void setOrgOsgiServiceHttpPort(ConfigNodePropertyInteger orgOsgiServiceHttpPort) {
    this.orgOsgiServiceHttpPort = orgOsgiServiceHttpPort;
  }

  public OrgApacheFelixHttpProperties orgOsgiServiceHttpPort(ConfigNodePropertyInteger orgOsgiServiceHttpPort) {
    this.orgOsgiServiceHttpPort = orgOsgiServiceHttpPort;
    return this;
  }

 /**
   * Get orgApacheFelixHttpTimeout
   * @return orgApacheFelixHttpTimeout
  **/
  @JsonProperty("org.apache.felix.http.timeout")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpTimeout() {
    return orgApacheFelixHttpTimeout;
  }

  public void setOrgApacheFelixHttpTimeout(ConfigNodePropertyInteger orgApacheFelixHttpTimeout) {
    this.orgApacheFelixHttpTimeout = orgApacheFelixHttpTimeout;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpTimeout(ConfigNodePropertyInteger orgApacheFelixHttpTimeout) {
    this.orgApacheFelixHttpTimeout = orgApacheFelixHttpTimeout;
    return this;
  }

 /**
   * Get orgApacheFelixHttpsEnable
   * @return orgApacheFelixHttpsEnable
  **/
  @JsonProperty("org.apache.felix.https.enable")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpsEnable() {
    return orgApacheFelixHttpsEnable;
  }

  public void setOrgApacheFelixHttpsEnable(ConfigNodePropertyBoolean orgApacheFelixHttpsEnable) {
    this.orgApacheFelixHttpsEnable = orgApacheFelixHttpsEnable;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsEnable(ConfigNodePropertyBoolean orgApacheFelixHttpsEnable) {
    this.orgApacheFelixHttpsEnable = orgApacheFelixHttpsEnable;
    return this;
  }

 /**
   * Get orgOsgiServiceHttpPortSecure
   * @return orgOsgiServiceHttpPortSecure
  **/
  @JsonProperty("org.osgi.service.http.port.secure")
  public ConfigNodePropertyInteger getOrgOsgiServiceHttpPortSecure() {
    return orgOsgiServiceHttpPortSecure;
  }

  public void setOrgOsgiServiceHttpPortSecure(ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure) {
    this.orgOsgiServiceHttpPortSecure = orgOsgiServiceHttpPortSecure;
  }

  public OrgApacheFelixHttpProperties orgOsgiServiceHttpPortSecure(ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure) {
    this.orgOsgiServiceHttpPortSecure = orgOsgiServiceHttpPortSecure;
    return this;
  }

 /**
   * Get orgApacheFelixHttpsKeystore
   * @return orgApacheFelixHttpsKeystore
  **/
  @JsonProperty("org.apache.felix.https.keystore")
  public ConfigNodePropertyString getOrgApacheFelixHttpsKeystore() {
    return orgApacheFelixHttpsKeystore;
  }

  public void setOrgApacheFelixHttpsKeystore(ConfigNodePropertyString orgApacheFelixHttpsKeystore) {
    this.orgApacheFelixHttpsKeystore = orgApacheFelixHttpsKeystore;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsKeystore(ConfigNodePropertyString orgApacheFelixHttpsKeystore) {
    this.orgApacheFelixHttpsKeystore = orgApacheFelixHttpsKeystore;
    return this;
  }

 /**
   * Get orgApacheFelixHttpsKeystorePassword
   * @return orgApacheFelixHttpsKeystorePassword
  **/
  @JsonProperty("org.apache.felix.https.keystore.password")
  public ConfigNodePropertyString getOrgApacheFelixHttpsKeystorePassword() {
    return orgApacheFelixHttpsKeystorePassword;
  }

  public void setOrgApacheFelixHttpsKeystorePassword(ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword) {
    this.orgApacheFelixHttpsKeystorePassword = orgApacheFelixHttpsKeystorePassword;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsKeystorePassword(ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword) {
    this.orgApacheFelixHttpsKeystorePassword = orgApacheFelixHttpsKeystorePassword;
    return this;
  }

 /**
   * Get orgApacheFelixHttpsKeystoreKeyPassword
   * @return orgApacheFelixHttpsKeystoreKeyPassword
  **/
  @JsonProperty("org.apache.felix.https.keystore.key.password")
  public ConfigNodePropertyString getOrgApacheFelixHttpsKeystoreKeyPassword() {
    return orgApacheFelixHttpsKeystoreKeyPassword;
  }

  public void setOrgApacheFelixHttpsKeystoreKeyPassword(ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword) {
    this.orgApacheFelixHttpsKeystoreKeyPassword = orgApacheFelixHttpsKeystoreKeyPassword;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsKeystoreKeyPassword(ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword) {
    this.orgApacheFelixHttpsKeystoreKeyPassword = orgApacheFelixHttpsKeystoreKeyPassword;
    return this;
  }

 /**
   * Get orgApacheFelixHttpsTruststore
   * @return orgApacheFelixHttpsTruststore
  **/
  @JsonProperty("org.apache.felix.https.truststore")
  public ConfigNodePropertyString getOrgApacheFelixHttpsTruststore() {
    return orgApacheFelixHttpsTruststore;
  }

  public void setOrgApacheFelixHttpsTruststore(ConfigNodePropertyString orgApacheFelixHttpsTruststore) {
    this.orgApacheFelixHttpsTruststore = orgApacheFelixHttpsTruststore;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsTruststore(ConfigNodePropertyString orgApacheFelixHttpsTruststore) {
    this.orgApacheFelixHttpsTruststore = orgApacheFelixHttpsTruststore;
    return this;
  }

 /**
   * Get orgApacheFelixHttpsTruststorePassword
   * @return orgApacheFelixHttpsTruststorePassword
  **/
  @JsonProperty("org.apache.felix.https.truststore.password")
  public ConfigNodePropertyString getOrgApacheFelixHttpsTruststorePassword() {
    return orgApacheFelixHttpsTruststorePassword;
  }

  public void setOrgApacheFelixHttpsTruststorePassword(ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword) {
    this.orgApacheFelixHttpsTruststorePassword = orgApacheFelixHttpsTruststorePassword;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsTruststorePassword(ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword) {
    this.orgApacheFelixHttpsTruststorePassword = orgApacheFelixHttpsTruststorePassword;
    return this;
  }

 /**
   * Get orgApacheFelixHttpsClientcertificate
   * @return orgApacheFelixHttpsClientcertificate
  **/
  @JsonProperty("org.apache.felix.https.clientcertificate")
  public ConfigNodePropertyDropDown getOrgApacheFelixHttpsClientcertificate() {
    return orgApacheFelixHttpsClientcertificate;
  }

  public void setOrgApacheFelixHttpsClientcertificate(ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate) {
    this.orgApacheFelixHttpsClientcertificate = orgApacheFelixHttpsClientcertificate;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsClientcertificate(ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate) {
    this.orgApacheFelixHttpsClientcertificate = orgApacheFelixHttpsClientcertificate;
    return this;
  }

 /**
   * Get orgApacheFelixHttpContextPath
   * @return orgApacheFelixHttpContextPath
  **/
  @JsonProperty("org.apache.felix.http.context_path")
  public ConfigNodePropertyString getOrgApacheFelixHttpContextPath() {
    return orgApacheFelixHttpContextPath;
  }

  public void setOrgApacheFelixHttpContextPath(ConfigNodePropertyString orgApacheFelixHttpContextPath) {
    this.orgApacheFelixHttpContextPath = orgApacheFelixHttpContextPath;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpContextPath(ConfigNodePropertyString orgApacheFelixHttpContextPath) {
    this.orgApacheFelixHttpContextPath = orgApacheFelixHttpContextPath;
    return this;
  }

 /**
   * Get orgApacheFelixHttpMbeans
   * @return orgApacheFelixHttpMbeans
  **/
  @JsonProperty("org.apache.felix.http.mbeans")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpMbeans() {
    return orgApacheFelixHttpMbeans;
  }

  public void setOrgApacheFelixHttpMbeans(ConfigNodePropertyBoolean orgApacheFelixHttpMbeans) {
    this.orgApacheFelixHttpMbeans = orgApacheFelixHttpMbeans;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpMbeans(ConfigNodePropertyBoolean orgApacheFelixHttpMbeans) {
    this.orgApacheFelixHttpMbeans = orgApacheFelixHttpMbeans;
    return this;
  }

 /**
   * Get orgApacheFelixHttpSessionTimeout
   * @return orgApacheFelixHttpSessionTimeout
  **/
  @JsonProperty("org.apache.felix.http.session.timeout")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpSessionTimeout() {
    return orgApacheFelixHttpSessionTimeout;
  }

  public void setOrgApacheFelixHttpSessionTimeout(ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout) {
    this.orgApacheFelixHttpSessionTimeout = orgApacheFelixHttpSessionTimeout;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpSessionTimeout(ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout) {
    this.orgApacheFelixHttpSessionTimeout = orgApacheFelixHttpSessionTimeout;
    return this;
  }

 /**
   * Get orgApacheFelixHttpJettyThreadpoolMax
   * @return orgApacheFelixHttpJettyThreadpoolMax
  **/
  @JsonProperty("org.apache.felix.http.jetty.threadpool.max")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyThreadpoolMax() {
    return orgApacheFelixHttpJettyThreadpoolMax;
  }

  public void setOrgApacheFelixHttpJettyThreadpoolMax(ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax) {
    this.orgApacheFelixHttpJettyThreadpoolMax = orgApacheFelixHttpJettyThreadpoolMax;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyThreadpoolMax(ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax) {
    this.orgApacheFelixHttpJettyThreadpoolMax = orgApacheFelixHttpJettyThreadpoolMax;
    return this;
  }

 /**
   * Get orgApacheFelixHttpJettyAcceptors
   * @return orgApacheFelixHttpJettyAcceptors
  **/
  @JsonProperty("org.apache.felix.http.jetty.acceptors")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyAcceptors() {
    return orgApacheFelixHttpJettyAcceptors;
  }

  public void setOrgApacheFelixHttpJettyAcceptors(ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors) {
    this.orgApacheFelixHttpJettyAcceptors = orgApacheFelixHttpJettyAcceptors;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyAcceptors(ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors) {
    this.orgApacheFelixHttpJettyAcceptors = orgApacheFelixHttpJettyAcceptors;
    return this;
  }

 /**
   * Get orgApacheFelixHttpJettySelectors
   * @return orgApacheFelixHttpJettySelectors
  **/
  @JsonProperty("org.apache.felix.http.jetty.selectors")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettySelectors() {
    return orgApacheFelixHttpJettySelectors;
  }

  public void setOrgApacheFelixHttpJettySelectors(ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors) {
    this.orgApacheFelixHttpJettySelectors = orgApacheFelixHttpJettySelectors;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettySelectors(ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors) {
    this.orgApacheFelixHttpJettySelectors = orgApacheFelixHttpJettySelectors;
    return this;
  }

 /**
   * Get orgApacheFelixHttpJettyHeaderBufferSize
   * @return orgApacheFelixHttpJettyHeaderBufferSize
  **/
  @JsonProperty("org.apache.felix.http.jetty.headerBufferSize")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyHeaderBufferSize() {
    return orgApacheFelixHttpJettyHeaderBufferSize;
  }

  public void setOrgApacheFelixHttpJettyHeaderBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize) {
    this.orgApacheFelixHttpJettyHeaderBufferSize = orgApacheFelixHttpJettyHeaderBufferSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyHeaderBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize) {
    this.orgApacheFelixHttpJettyHeaderBufferSize = orgApacheFelixHttpJettyHeaderBufferSize;
    return this;
  }

 /**
   * Get orgApacheFelixHttpJettyRequestBufferSize
   * @return orgApacheFelixHttpJettyRequestBufferSize
  **/
  @JsonProperty("org.apache.felix.http.jetty.requestBufferSize")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyRequestBufferSize() {
    return orgApacheFelixHttpJettyRequestBufferSize;
  }

  public void setOrgApacheFelixHttpJettyRequestBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize) {
    this.orgApacheFelixHttpJettyRequestBufferSize = orgApacheFelixHttpJettyRequestBufferSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyRequestBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize) {
    this.orgApacheFelixHttpJettyRequestBufferSize = orgApacheFelixHttpJettyRequestBufferSize;
    return this;
  }

 /**
   * Get orgApacheFelixHttpJettyResponseBufferSize
   * @return orgApacheFelixHttpJettyResponseBufferSize
  **/
  @JsonProperty("org.apache.felix.http.jetty.responseBufferSize")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyResponseBufferSize() {
    return orgApacheFelixHttpJettyResponseBufferSize;
  }

  public void setOrgApacheFelixHttpJettyResponseBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize) {
    this.orgApacheFelixHttpJettyResponseBufferSize = orgApacheFelixHttpJettyResponseBufferSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyResponseBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize) {
    this.orgApacheFelixHttpJettyResponseBufferSize = orgApacheFelixHttpJettyResponseBufferSize;
    return this;
  }

 /**
   * Get orgApacheFelixHttpJettyMaxFormSize
   * @return orgApacheFelixHttpJettyMaxFormSize
  **/
  @JsonProperty("org.apache.felix.http.jetty.maxFormSize")
  public ConfigNodePropertyInteger getOrgApacheFelixHttpJettyMaxFormSize() {
    return orgApacheFelixHttpJettyMaxFormSize;
  }

  public void setOrgApacheFelixHttpJettyMaxFormSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize) {
    this.orgApacheFelixHttpJettyMaxFormSize = orgApacheFelixHttpJettyMaxFormSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyMaxFormSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize) {
    this.orgApacheFelixHttpJettyMaxFormSize = orgApacheFelixHttpJettyMaxFormSize;
    return this;
  }

 /**
   * Get orgApacheFelixHttpPathExclusions
   * @return orgApacheFelixHttpPathExclusions
  **/
  @JsonProperty("org.apache.felix.http.path_exclusions")
  public ConfigNodePropertyArray getOrgApacheFelixHttpPathExclusions() {
    return orgApacheFelixHttpPathExclusions;
  }

  public void setOrgApacheFelixHttpPathExclusions(ConfigNodePropertyArray orgApacheFelixHttpPathExclusions) {
    this.orgApacheFelixHttpPathExclusions = orgApacheFelixHttpPathExclusions;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpPathExclusions(ConfigNodePropertyArray orgApacheFelixHttpPathExclusions) {
    this.orgApacheFelixHttpPathExclusions = orgApacheFelixHttpPathExclusions;
    return this;
  }

 /**
   * Get orgApacheFelixHttpsJettyCiphersuitesExcluded
   * @return orgApacheFelixHttpsJettyCiphersuitesExcluded
  **/
  @JsonProperty("org.apache.felix.https.jetty.ciphersuites.excluded")
  public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyCiphersuitesExcluded() {
    return orgApacheFelixHttpsJettyCiphersuitesExcluded;
  }

  public void setOrgApacheFelixHttpsJettyCiphersuitesExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesExcluded = orgApacheFelixHttpsJettyCiphersuitesExcluded;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyCiphersuitesExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesExcluded = orgApacheFelixHttpsJettyCiphersuitesExcluded;
    return this;
  }

 /**
   * Get orgApacheFelixHttpsJettyCiphersuitesIncluded
   * @return orgApacheFelixHttpsJettyCiphersuitesIncluded
  **/
  @JsonProperty("org.apache.felix.https.jetty.ciphersuites.included")
  public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyCiphersuitesIncluded() {
    return orgApacheFelixHttpsJettyCiphersuitesIncluded;
  }

  public void setOrgApacheFelixHttpsJettyCiphersuitesIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesIncluded = orgApacheFelixHttpsJettyCiphersuitesIncluded;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyCiphersuitesIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesIncluded = orgApacheFelixHttpsJettyCiphersuitesIncluded;
    return this;
  }

 /**
   * Get orgApacheFelixHttpJettySendServerHeader
   * @return orgApacheFelixHttpJettySendServerHeader
  **/
  @JsonProperty("org.apache.felix.http.jetty.sendServerHeader")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpJettySendServerHeader() {
    return orgApacheFelixHttpJettySendServerHeader;
  }

  public void setOrgApacheFelixHttpJettySendServerHeader(ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader) {
    this.orgApacheFelixHttpJettySendServerHeader = orgApacheFelixHttpJettySendServerHeader;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettySendServerHeader(ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader) {
    this.orgApacheFelixHttpJettySendServerHeader = orgApacheFelixHttpJettySendServerHeader;
    return this;
  }

 /**
   * Get orgApacheFelixHttpsJettyProtocolsIncluded
   * @return orgApacheFelixHttpsJettyProtocolsIncluded
  **/
  @JsonProperty("org.apache.felix.https.jetty.protocols.included")
  public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyProtocolsIncluded() {
    return orgApacheFelixHttpsJettyProtocolsIncluded;
  }

  public void setOrgApacheFelixHttpsJettyProtocolsIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded) {
    this.orgApacheFelixHttpsJettyProtocolsIncluded = orgApacheFelixHttpsJettyProtocolsIncluded;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyProtocolsIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded) {
    this.orgApacheFelixHttpsJettyProtocolsIncluded = orgApacheFelixHttpsJettyProtocolsIncluded;
    return this;
  }

 /**
   * Get orgApacheFelixHttpsJettyProtocolsExcluded
   * @return orgApacheFelixHttpsJettyProtocolsExcluded
  **/
  @JsonProperty("org.apache.felix.https.jetty.protocols.excluded")
  public ConfigNodePropertyArray getOrgApacheFelixHttpsJettyProtocolsExcluded() {
    return orgApacheFelixHttpsJettyProtocolsExcluded;
  }

  public void setOrgApacheFelixHttpsJettyProtocolsExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded) {
    this.orgApacheFelixHttpsJettyProtocolsExcluded = orgApacheFelixHttpsJettyProtocolsExcluded;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyProtocolsExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded) {
    this.orgApacheFelixHttpsJettyProtocolsExcluded = orgApacheFelixHttpsJettyProtocolsExcluded;
    return this;
  }

 /**
   * Get orgApacheFelixProxyLoadBalancerConnectionEnable
   * @return orgApacheFelixProxyLoadBalancerConnectionEnable
  **/
  @JsonProperty("org.apache.felix.proxy.load.balancer.connection.enable")
  public ConfigNodePropertyBoolean getOrgApacheFelixProxyLoadBalancerConnectionEnable() {
    return orgApacheFelixProxyLoadBalancerConnectionEnable;
  }

  public void setOrgApacheFelixProxyLoadBalancerConnectionEnable(ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable) {
    this.orgApacheFelixProxyLoadBalancerConnectionEnable = orgApacheFelixProxyLoadBalancerConnectionEnable;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixProxyLoadBalancerConnectionEnable(ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable) {
    this.orgApacheFelixProxyLoadBalancerConnectionEnable = orgApacheFelixProxyLoadBalancerConnectionEnable;
    return this;
  }

 /**
   * Get orgApacheFelixHttpsJettyRenegotiateAllowed
   * @return orgApacheFelixHttpsJettyRenegotiateAllowed
  **/
  @JsonProperty("org.apache.felix.https.jetty.renegotiateAllowed")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettyRenegotiateAllowed() {
    return orgApacheFelixHttpsJettyRenegotiateAllowed;
  }

  public void setOrgApacheFelixHttpsJettyRenegotiateAllowed(ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed) {
    this.orgApacheFelixHttpsJettyRenegotiateAllowed = orgApacheFelixHttpsJettyRenegotiateAllowed;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyRenegotiateAllowed(ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed) {
    this.orgApacheFelixHttpsJettyRenegotiateAllowed = orgApacheFelixHttpsJettyRenegotiateAllowed;
    return this;
  }

 /**
   * Get orgApacheFelixHttpsJettySessionCookieHttpOnly
   * @return orgApacheFelixHttpsJettySessionCookieHttpOnly
  **/
  @JsonProperty("org.apache.felix.https.jetty.session.cookie.httpOnly")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettySessionCookieHttpOnly() {
    return orgApacheFelixHttpsJettySessionCookieHttpOnly;
  }

  public void setOrgApacheFelixHttpsJettySessionCookieHttpOnly(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly) {
    this.orgApacheFelixHttpsJettySessionCookieHttpOnly = orgApacheFelixHttpsJettySessionCookieHttpOnly;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettySessionCookieHttpOnly(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly) {
    this.orgApacheFelixHttpsJettySessionCookieHttpOnly = orgApacheFelixHttpsJettySessionCookieHttpOnly;
    return this;
  }

 /**
   * Get orgApacheFelixHttpsJettySessionCookieSecure
   * @return orgApacheFelixHttpsJettySessionCookieSecure
  **/
  @JsonProperty("org.apache.felix.https.jetty.session.cookie.secure")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettySessionCookieSecure() {
    return orgApacheFelixHttpsJettySessionCookieSecure;
  }

  public void setOrgApacheFelixHttpsJettySessionCookieSecure(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure) {
    this.orgApacheFelixHttpsJettySessionCookieSecure = orgApacheFelixHttpsJettySessionCookieSecure;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettySessionCookieSecure(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure) {
    this.orgApacheFelixHttpsJettySessionCookieSecure = orgApacheFelixHttpsJettySessionCookieSecure;
    return this;
  }

 /**
   * Get orgEclipseJettyServletSessionIdPathParameterName
   * @return orgEclipseJettyServletSessionIdPathParameterName
  **/
  @JsonProperty("org.eclipse.jetty.servlet.SessionIdPathParameterName")
  public ConfigNodePropertyString getOrgEclipseJettyServletSessionIdPathParameterName() {
    return orgEclipseJettyServletSessionIdPathParameterName;
  }

  public void setOrgEclipseJettyServletSessionIdPathParameterName(ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName) {
    this.orgEclipseJettyServletSessionIdPathParameterName = orgEclipseJettyServletSessionIdPathParameterName;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionIdPathParameterName(ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName) {
    this.orgEclipseJettyServletSessionIdPathParameterName = orgEclipseJettyServletSessionIdPathParameterName;
    return this;
  }

 /**
   * Get orgEclipseJettyServletCheckingRemoteSessionIdEncoding
   * @return orgEclipseJettyServletCheckingRemoteSessionIdEncoding
  **/
  @JsonProperty("org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding")
  public ConfigNodePropertyBoolean getOrgEclipseJettyServletCheckingRemoteSessionIdEncoding() {
    return orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
  }

  public void setOrgEclipseJettyServletCheckingRemoteSessionIdEncoding(ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding) {
    this.orgEclipseJettyServletCheckingRemoteSessionIdEncoding = orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletCheckingRemoteSessionIdEncoding(ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding) {
    this.orgEclipseJettyServletCheckingRemoteSessionIdEncoding = orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
    return this;
  }

 /**
   * Get orgEclipseJettyServletSessionCookie
   * @return orgEclipseJettyServletSessionCookie
  **/
  @JsonProperty("org.eclipse.jetty.servlet.SessionCookie")
  public ConfigNodePropertyString getOrgEclipseJettyServletSessionCookie() {
    return orgEclipseJettyServletSessionCookie;
  }

  public void setOrgEclipseJettyServletSessionCookie(ConfigNodePropertyString orgEclipseJettyServletSessionCookie) {
    this.orgEclipseJettyServletSessionCookie = orgEclipseJettyServletSessionCookie;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionCookie(ConfigNodePropertyString orgEclipseJettyServletSessionCookie) {
    this.orgEclipseJettyServletSessionCookie = orgEclipseJettyServletSessionCookie;
    return this;
  }

 /**
   * Get orgEclipseJettyServletSessionDomain
   * @return orgEclipseJettyServletSessionDomain
  **/
  @JsonProperty("org.eclipse.jetty.servlet.SessionDomain")
  public ConfigNodePropertyString getOrgEclipseJettyServletSessionDomain() {
    return orgEclipseJettyServletSessionDomain;
  }

  public void setOrgEclipseJettyServletSessionDomain(ConfigNodePropertyString orgEclipseJettyServletSessionDomain) {
    this.orgEclipseJettyServletSessionDomain = orgEclipseJettyServletSessionDomain;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionDomain(ConfigNodePropertyString orgEclipseJettyServletSessionDomain) {
    this.orgEclipseJettyServletSessionDomain = orgEclipseJettyServletSessionDomain;
    return this;
  }

 /**
   * Get orgEclipseJettyServletSessionPath
   * @return orgEclipseJettyServletSessionPath
  **/
  @JsonProperty("org.eclipse.jetty.servlet.SessionPath")
  public ConfigNodePropertyString getOrgEclipseJettyServletSessionPath() {
    return orgEclipseJettyServletSessionPath;
  }

  public void setOrgEclipseJettyServletSessionPath(ConfigNodePropertyString orgEclipseJettyServletSessionPath) {
    this.orgEclipseJettyServletSessionPath = orgEclipseJettyServletSessionPath;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionPath(ConfigNodePropertyString orgEclipseJettyServletSessionPath) {
    this.orgEclipseJettyServletSessionPath = orgEclipseJettyServletSessionPath;
    return this;
  }

 /**
   * Get orgEclipseJettyServletMaxAge
   * @return orgEclipseJettyServletMaxAge
  **/
  @JsonProperty("org.eclipse.jetty.servlet.MaxAge")
  public ConfigNodePropertyInteger getOrgEclipseJettyServletMaxAge() {
    return orgEclipseJettyServletMaxAge;
  }

  public void setOrgEclipseJettyServletMaxAge(ConfigNodePropertyInteger orgEclipseJettyServletMaxAge) {
    this.orgEclipseJettyServletMaxAge = orgEclipseJettyServletMaxAge;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletMaxAge(ConfigNodePropertyInteger orgEclipseJettyServletMaxAge) {
    this.orgEclipseJettyServletMaxAge = orgEclipseJettyServletMaxAge;
    return this;
  }

 /**
   * Get orgApacheFelixHttpName
   * @return orgApacheFelixHttpName
  **/
  @JsonProperty("org.apache.felix.http.name")
  public ConfigNodePropertyString getOrgApacheFelixHttpName() {
    return orgApacheFelixHttpName;
  }

  public void setOrgApacheFelixHttpName(ConfigNodePropertyString orgApacheFelixHttpName) {
    this.orgApacheFelixHttpName = orgApacheFelixHttpName;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpName(ConfigNodePropertyString orgApacheFelixHttpName) {
    this.orgApacheFelixHttpName = orgApacheFelixHttpName;
    return this;
  }

 /**
   * Get orgApacheFelixJettyGziphandlerEnable
   * @return orgApacheFelixJettyGziphandlerEnable
  **/
  @JsonProperty("org.apache.felix.jetty.gziphandler.enable")
  public ConfigNodePropertyBoolean getOrgApacheFelixJettyGziphandlerEnable() {
    return orgApacheFelixJettyGziphandlerEnable;
  }

  public void setOrgApacheFelixJettyGziphandlerEnable(ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable) {
    this.orgApacheFelixJettyGziphandlerEnable = orgApacheFelixJettyGziphandlerEnable;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGziphandlerEnable(ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable) {
    this.orgApacheFelixJettyGziphandlerEnable = orgApacheFelixJettyGziphandlerEnable;
    return this;
  }

 /**
   * Get orgApacheFelixJettyGzipMinGzipSize
   * @return orgApacheFelixJettyGzipMinGzipSize
  **/
  @JsonProperty("org.apache.felix.jetty.gzip.minGzipSize")
  public ConfigNodePropertyInteger getOrgApacheFelixJettyGzipMinGzipSize() {
    return orgApacheFelixJettyGzipMinGzipSize;
  }

  public void setOrgApacheFelixJettyGzipMinGzipSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize) {
    this.orgApacheFelixJettyGzipMinGzipSize = orgApacheFelixJettyGzipMinGzipSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipMinGzipSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize) {
    this.orgApacheFelixJettyGzipMinGzipSize = orgApacheFelixJettyGzipMinGzipSize;
    return this;
  }

 /**
   * Get orgApacheFelixJettyGzipCompressionLevel
   * @return orgApacheFelixJettyGzipCompressionLevel
  **/
  @JsonProperty("org.apache.felix.jetty.gzip.compressionLevel")
  public ConfigNodePropertyInteger getOrgApacheFelixJettyGzipCompressionLevel() {
    return orgApacheFelixJettyGzipCompressionLevel;
  }

  public void setOrgApacheFelixJettyGzipCompressionLevel(ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel) {
    this.orgApacheFelixJettyGzipCompressionLevel = orgApacheFelixJettyGzipCompressionLevel;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipCompressionLevel(ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel) {
    this.orgApacheFelixJettyGzipCompressionLevel = orgApacheFelixJettyGzipCompressionLevel;
    return this;
  }

 /**
   * Get orgApacheFelixJettyGzipInflateBufferSize
   * @return orgApacheFelixJettyGzipInflateBufferSize
  **/
  @JsonProperty("org.apache.felix.jetty.gzip.inflateBufferSize")
  public ConfigNodePropertyInteger getOrgApacheFelixJettyGzipInflateBufferSize() {
    return orgApacheFelixJettyGzipInflateBufferSize;
  }

  public void setOrgApacheFelixJettyGzipInflateBufferSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize) {
    this.orgApacheFelixJettyGzipInflateBufferSize = orgApacheFelixJettyGzipInflateBufferSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipInflateBufferSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize) {
    this.orgApacheFelixJettyGzipInflateBufferSize = orgApacheFelixJettyGzipInflateBufferSize;
    return this;
  }

 /**
   * Get orgApacheFelixJettyGzipSyncFlush
   * @return orgApacheFelixJettyGzipSyncFlush
  **/
  @JsonProperty("org.apache.felix.jetty.gzip.syncFlush")
  public ConfigNodePropertyBoolean getOrgApacheFelixJettyGzipSyncFlush() {
    return orgApacheFelixJettyGzipSyncFlush;
  }

  public void setOrgApacheFelixJettyGzipSyncFlush(ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush) {
    this.orgApacheFelixJettyGzipSyncFlush = orgApacheFelixJettyGzipSyncFlush;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipSyncFlush(ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush) {
    this.orgApacheFelixJettyGzipSyncFlush = orgApacheFelixJettyGzipSyncFlush;
    return this;
  }

 /**
   * Get orgApacheFelixJettyGzipExcludedUserAgents
   * @return orgApacheFelixJettyGzipExcludedUserAgents
  **/
  @JsonProperty("org.apache.felix.jetty.gzip.excludedUserAgents")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedUserAgents() {
    return orgApacheFelixJettyGzipExcludedUserAgents;
  }

  public void setOrgApacheFelixJettyGzipExcludedUserAgents(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents) {
    this.orgApacheFelixJettyGzipExcludedUserAgents = orgApacheFelixJettyGzipExcludedUserAgents;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedUserAgents(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents) {
    this.orgApacheFelixJettyGzipExcludedUserAgents = orgApacheFelixJettyGzipExcludedUserAgents;
    return this;
  }

 /**
   * Get orgApacheFelixJettyGzipIncludedMethods
   * @return orgApacheFelixJettyGzipIncludedMethods
  **/
  @JsonProperty("org.apache.felix.jetty.gzip.includedMethods")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedMethods() {
    return orgApacheFelixJettyGzipIncludedMethods;
  }

  public void setOrgApacheFelixJettyGzipIncludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods) {
    this.orgApacheFelixJettyGzipIncludedMethods = orgApacheFelixJettyGzipIncludedMethods;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipIncludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods) {
    this.orgApacheFelixJettyGzipIncludedMethods = orgApacheFelixJettyGzipIncludedMethods;
    return this;
  }

 /**
   * Get orgApacheFelixJettyGzipExcludedMethods
   * @return orgApacheFelixJettyGzipExcludedMethods
  **/
  @JsonProperty("org.apache.felix.jetty.gzip.excludedMethods")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedMethods() {
    return orgApacheFelixJettyGzipExcludedMethods;
  }

  public void setOrgApacheFelixJettyGzipExcludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods) {
    this.orgApacheFelixJettyGzipExcludedMethods = orgApacheFelixJettyGzipExcludedMethods;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods) {
    this.orgApacheFelixJettyGzipExcludedMethods = orgApacheFelixJettyGzipExcludedMethods;
    return this;
  }

 /**
   * Get orgApacheFelixJettyGzipIncludedPaths
   * @return orgApacheFelixJettyGzipIncludedPaths
  **/
  @JsonProperty("org.apache.felix.jetty.gzip.includedPaths")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedPaths() {
    return orgApacheFelixJettyGzipIncludedPaths;
  }

  public void setOrgApacheFelixJettyGzipIncludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths) {
    this.orgApacheFelixJettyGzipIncludedPaths = orgApacheFelixJettyGzipIncludedPaths;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipIncludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths) {
    this.orgApacheFelixJettyGzipIncludedPaths = orgApacheFelixJettyGzipIncludedPaths;
    return this;
  }

 /**
   * Get orgApacheFelixJettyGzipExcludedPaths
   * @return orgApacheFelixJettyGzipExcludedPaths
  **/
  @JsonProperty("org.apache.felix.jetty.gzip.excludedPaths")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedPaths() {
    return orgApacheFelixJettyGzipExcludedPaths;
  }

  public void setOrgApacheFelixJettyGzipExcludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths) {
    this.orgApacheFelixJettyGzipExcludedPaths = orgApacheFelixJettyGzipExcludedPaths;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths) {
    this.orgApacheFelixJettyGzipExcludedPaths = orgApacheFelixJettyGzipExcludedPaths;
    return this;
  }

 /**
   * Get orgApacheFelixJettyGzipIncludedMimeTypes
   * @return orgApacheFelixJettyGzipIncludedMimeTypes
  **/
  @JsonProperty("org.apache.felix.jetty.gzip.includedMimeTypes")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedMimeTypes() {
    return orgApacheFelixJettyGzipIncludedMimeTypes;
  }

  public void setOrgApacheFelixJettyGzipIncludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes) {
    this.orgApacheFelixJettyGzipIncludedMimeTypes = orgApacheFelixJettyGzipIncludedMimeTypes;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipIncludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes) {
    this.orgApacheFelixJettyGzipIncludedMimeTypes = orgApacheFelixJettyGzipIncludedMimeTypes;
    return this;
  }

 /**
   * Get orgApacheFelixJettyGzipExcludedMimeTypes
   * @return orgApacheFelixJettyGzipExcludedMimeTypes
  **/
  @JsonProperty("org.apache.felix.jetty.gzip.excludedMimeTypes")
  public ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedMimeTypes() {
    return orgApacheFelixJettyGzipExcludedMimeTypes;
  }

  public void setOrgApacheFelixJettyGzipExcludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes) {
    this.orgApacheFelixJettyGzipExcludedMimeTypes = orgApacheFelixJettyGzipExcludedMimeTypes;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes) {
    this.orgApacheFelixJettyGzipExcludedMimeTypes = orgApacheFelixJettyGzipExcludedMimeTypes;
    return this;
  }

 /**
   * Get orgApacheFelixHttpSessionInvalidate
   * @return orgApacheFelixHttpSessionInvalidate
  **/
  @JsonProperty("org.apache.felix.http.session.invalidate")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpSessionInvalidate() {
    return orgApacheFelixHttpSessionInvalidate;
  }

  public void setOrgApacheFelixHttpSessionInvalidate(ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate) {
    this.orgApacheFelixHttpSessionInvalidate = orgApacheFelixHttpSessionInvalidate;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpSessionInvalidate(ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate) {
    this.orgApacheFelixHttpSessionInvalidate = orgApacheFelixHttpSessionInvalidate;
    return this;
  }

 /**
   * Get orgApacheFelixHttpSessionUniqueid
   * @return orgApacheFelixHttpSessionUniqueid
  **/
  @JsonProperty("org.apache.felix.http.session.uniqueid")
  public ConfigNodePropertyBoolean getOrgApacheFelixHttpSessionUniqueid() {
    return orgApacheFelixHttpSessionUniqueid;
  }

  public void setOrgApacheFelixHttpSessionUniqueid(ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid) {
    this.orgApacheFelixHttpSessionUniqueid = orgApacheFelixHttpSessionUniqueid;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpSessionUniqueid(ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid) {
    this.orgApacheFelixHttpSessionUniqueid = orgApacheFelixHttpSessionUniqueid;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

