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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
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

  /**
   **/
  public OrgApacheFelixHttpProperties orgApacheFelixHttpHost(ConfigNodePropertyString orgApacheFelixHttpHost) {
    this.orgApacheFelixHttpHost = orgApacheFelixHttpHost;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpEnable(ConfigNodePropertyBoolean orgApacheFelixHttpEnable) {
    this.orgApacheFelixHttpEnable = orgApacheFelixHttpEnable;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgOsgiServiceHttpPort(ConfigNodePropertyInteger orgOsgiServiceHttpPort) {
    this.orgOsgiServiceHttpPort = orgOsgiServiceHttpPort;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpTimeout(ConfigNodePropertyInteger orgApacheFelixHttpTimeout) {
    this.orgApacheFelixHttpTimeout = orgApacheFelixHttpTimeout;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsEnable(ConfigNodePropertyBoolean orgApacheFelixHttpsEnable) {
    this.orgApacheFelixHttpsEnable = orgApacheFelixHttpsEnable;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgOsgiServiceHttpPortSecure(ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure) {
    this.orgOsgiServiceHttpPortSecure = orgOsgiServiceHttpPortSecure;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsKeystore(ConfigNodePropertyString orgApacheFelixHttpsKeystore) {
    this.orgApacheFelixHttpsKeystore = orgApacheFelixHttpsKeystore;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsKeystorePassword(ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword) {
    this.orgApacheFelixHttpsKeystorePassword = orgApacheFelixHttpsKeystorePassword;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsKeystoreKeyPassword(ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword) {
    this.orgApacheFelixHttpsKeystoreKeyPassword = orgApacheFelixHttpsKeystoreKeyPassword;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsTruststore(ConfigNodePropertyString orgApacheFelixHttpsTruststore) {
    this.orgApacheFelixHttpsTruststore = orgApacheFelixHttpsTruststore;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsTruststorePassword(ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword) {
    this.orgApacheFelixHttpsTruststorePassword = orgApacheFelixHttpsTruststorePassword;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsClientcertificate(ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate) {
    this.orgApacheFelixHttpsClientcertificate = orgApacheFelixHttpsClientcertificate;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpContextPath(ConfigNodePropertyString orgApacheFelixHttpContextPath) {
    this.orgApacheFelixHttpContextPath = orgApacheFelixHttpContextPath;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpMbeans(ConfigNodePropertyBoolean orgApacheFelixHttpMbeans) {
    this.orgApacheFelixHttpMbeans = orgApacheFelixHttpMbeans;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpSessionTimeout(ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout) {
    this.orgApacheFelixHttpSessionTimeout = orgApacheFelixHttpSessionTimeout;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyThreadpoolMax(ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax) {
    this.orgApacheFelixHttpJettyThreadpoolMax = orgApacheFelixHttpJettyThreadpoolMax;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyAcceptors(ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors) {
    this.orgApacheFelixHttpJettyAcceptors = orgApacheFelixHttpJettyAcceptors;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettySelectors(ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors) {
    this.orgApacheFelixHttpJettySelectors = orgApacheFelixHttpJettySelectors;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyHeaderBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize) {
    this.orgApacheFelixHttpJettyHeaderBufferSize = orgApacheFelixHttpJettyHeaderBufferSize;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyRequestBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize) {
    this.orgApacheFelixHttpJettyRequestBufferSize = orgApacheFelixHttpJettyRequestBufferSize;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyResponseBufferSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize) {
    this.orgApacheFelixHttpJettyResponseBufferSize = orgApacheFelixHttpJettyResponseBufferSize;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyMaxFormSize(ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize) {
    this.orgApacheFelixHttpJettyMaxFormSize = orgApacheFelixHttpJettyMaxFormSize;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpPathExclusions(ConfigNodePropertyArray orgApacheFelixHttpPathExclusions) {
    this.orgApacheFelixHttpPathExclusions = orgApacheFelixHttpPathExclusions;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyCiphersuitesExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesExcluded = orgApacheFelixHttpsJettyCiphersuitesExcluded;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyCiphersuitesIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesIncluded = orgApacheFelixHttpsJettyCiphersuitesIncluded;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettySendServerHeader(ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader) {
    this.orgApacheFelixHttpJettySendServerHeader = orgApacheFelixHttpJettySendServerHeader;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyProtocolsIncluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded) {
    this.orgApacheFelixHttpsJettyProtocolsIncluded = orgApacheFelixHttpsJettyProtocolsIncluded;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyProtocolsExcluded(ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded) {
    this.orgApacheFelixHttpsJettyProtocolsExcluded = orgApacheFelixHttpsJettyProtocolsExcluded;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixProxyLoadBalancerConnectionEnable(ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable) {
    this.orgApacheFelixProxyLoadBalancerConnectionEnable = orgApacheFelixProxyLoadBalancerConnectionEnable;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyRenegotiateAllowed(ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed) {
    this.orgApacheFelixHttpsJettyRenegotiateAllowed = orgApacheFelixHttpsJettyRenegotiateAllowed;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettySessionCookieHttpOnly(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly) {
    this.orgApacheFelixHttpsJettySessionCookieHttpOnly = orgApacheFelixHttpsJettySessionCookieHttpOnly;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettySessionCookieSecure(ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure) {
    this.orgApacheFelixHttpsJettySessionCookieSecure = orgApacheFelixHttpsJettySessionCookieSecure;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionIdPathParameterName(ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName) {
    this.orgEclipseJettyServletSessionIdPathParameterName = orgEclipseJettyServletSessionIdPathParameterName;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgEclipseJettyServletCheckingRemoteSessionIdEncoding(ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding) {
    this.orgEclipseJettyServletCheckingRemoteSessionIdEncoding = orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionCookie(ConfigNodePropertyString orgEclipseJettyServletSessionCookie) {
    this.orgEclipseJettyServletSessionCookie = orgEclipseJettyServletSessionCookie;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionDomain(ConfigNodePropertyString orgEclipseJettyServletSessionDomain) {
    this.orgEclipseJettyServletSessionDomain = orgEclipseJettyServletSessionDomain;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionPath(ConfigNodePropertyString orgEclipseJettyServletSessionPath) {
    this.orgEclipseJettyServletSessionPath = orgEclipseJettyServletSessionPath;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgEclipseJettyServletMaxAge(ConfigNodePropertyInteger orgEclipseJettyServletMaxAge) {
    this.orgEclipseJettyServletMaxAge = orgEclipseJettyServletMaxAge;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpName(ConfigNodePropertyString orgApacheFelixHttpName) {
    this.orgApacheFelixHttpName = orgApacheFelixHttpName;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGziphandlerEnable(ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable) {
    this.orgApacheFelixJettyGziphandlerEnable = orgApacheFelixJettyGziphandlerEnable;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipMinGzipSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize) {
    this.orgApacheFelixJettyGzipMinGzipSize = orgApacheFelixJettyGzipMinGzipSize;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipCompressionLevel(ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel) {
    this.orgApacheFelixJettyGzipCompressionLevel = orgApacheFelixJettyGzipCompressionLevel;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipInflateBufferSize(ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize) {
    this.orgApacheFelixJettyGzipInflateBufferSize = orgApacheFelixJettyGzipInflateBufferSize;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipSyncFlush(ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush) {
    this.orgApacheFelixJettyGzipSyncFlush = orgApacheFelixJettyGzipSyncFlush;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedUserAgents(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents) {
    this.orgApacheFelixJettyGzipExcludedUserAgents = orgApacheFelixJettyGzipExcludedUserAgents;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipIncludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods) {
    this.orgApacheFelixJettyGzipIncludedMethods = orgApacheFelixJettyGzipIncludedMethods;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedMethods(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods) {
    this.orgApacheFelixJettyGzipExcludedMethods = orgApacheFelixJettyGzipExcludedMethods;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipIncludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths) {
    this.orgApacheFelixJettyGzipIncludedPaths = orgApacheFelixJettyGzipIncludedPaths;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedPaths(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths) {
    this.orgApacheFelixJettyGzipExcludedPaths = orgApacheFelixJettyGzipExcludedPaths;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipIncludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes) {
    this.orgApacheFelixJettyGzipIncludedMimeTypes = orgApacheFelixJettyGzipIncludedMimeTypes;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedMimeTypes(ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes) {
    this.orgApacheFelixJettyGzipExcludedMimeTypes = orgApacheFelixJettyGzipExcludedMimeTypes;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpSessionInvalidate(ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate) {
    this.orgApacheFelixHttpSessionInvalidate = orgApacheFelixHttpSessionInvalidate;
    return this;
  }

  
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
  public OrgApacheFelixHttpProperties orgApacheFelixHttpSessionUniqueid(ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid) {
    this.orgApacheFelixHttpSessionUniqueid = orgApacheFelixHttpSessionUniqueid;
    return this;
  }

  
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

