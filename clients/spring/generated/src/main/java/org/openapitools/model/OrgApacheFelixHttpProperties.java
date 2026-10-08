package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheFelixHttpProperties
 */

@JsonTypeName("orgApacheFelixHttpProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixHttpProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheFelixHttpHost;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgApacheFelixHttpEnable;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgOsgiServiceHttpPort;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgApacheFelixHttpTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgApacheFelixHttpsEnable;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheFelixHttpsKeystore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheFelixHttpsTruststore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheFelixHttpContextPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgApacheFelixHttpMbeans;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheFelixHttpPathExclusions;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgEclipseJettyServletSessionCookie;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgEclipseJettyServletSessionDomain;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgEclipseJettyServletSessionPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgEclipseJettyServletMaxAge;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheFelixHttpName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid;

  public OrgApacheFelixHttpProperties orgApacheFelixHttpHost(@Nullable ConfigNodePropertyString orgApacheFelixHttpHost) {
    this.orgApacheFelixHttpHost = orgApacheFelixHttpHost;
    return this;
  }

  /**
   * Get orgApacheFelixHttpHost
   * @return orgApacheFelixHttpHost
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.host", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.host")
  public @Nullable ConfigNodePropertyString getOrgApacheFelixHttpHost() {
    return orgApacheFelixHttpHost;
  }

  @JsonProperty("org.apache.felix.http.host")
  public void setOrgApacheFelixHttpHost(@Nullable ConfigNodePropertyString orgApacheFelixHttpHost) {
    this.orgApacheFelixHttpHost = orgApacheFelixHttpHost;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpEnable(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpEnable) {
    this.orgApacheFelixHttpEnable = orgApacheFelixHttpEnable;
    return this;
  }

  /**
   * Get orgApacheFelixHttpEnable
   * @return orgApacheFelixHttpEnable
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.enable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.enable")
  public @Nullable ConfigNodePropertyBoolean getOrgApacheFelixHttpEnable() {
    return orgApacheFelixHttpEnable;
  }

  @JsonProperty("org.apache.felix.http.enable")
  public void setOrgApacheFelixHttpEnable(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpEnable) {
    this.orgApacheFelixHttpEnable = orgApacheFelixHttpEnable;
  }

  public OrgApacheFelixHttpProperties orgOsgiServiceHttpPort(@Nullable ConfigNodePropertyInteger orgOsgiServiceHttpPort) {
    this.orgOsgiServiceHttpPort = orgOsgiServiceHttpPort;
    return this;
  }

  /**
   * Get orgOsgiServiceHttpPort
   * @return orgOsgiServiceHttpPort
   */
  @Valid 
  @Schema(name = "org.osgi.service.http.port", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.osgi.service.http.port")
  public @Nullable ConfigNodePropertyInteger getOrgOsgiServiceHttpPort() {
    return orgOsgiServiceHttpPort;
  }

  @JsonProperty("org.osgi.service.http.port")
  public void setOrgOsgiServiceHttpPort(@Nullable ConfigNodePropertyInteger orgOsgiServiceHttpPort) {
    this.orgOsgiServiceHttpPort = orgOsgiServiceHttpPort;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpTimeout(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpTimeout) {
    this.orgApacheFelixHttpTimeout = orgApacheFelixHttpTimeout;
    return this;
  }

  /**
   * Get orgApacheFelixHttpTimeout
   * @return orgApacheFelixHttpTimeout
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.timeout")
  public @Nullable ConfigNodePropertyInteger getOrgApacheFelixHttpTimeout() {
    return orgApacheFelixHttpTimeout;
  }

  @JsonProperty("org.apache.felix.http.timeout")
  public void setOrgApacheFelixHttpTimeout(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpTimeout) {
    this.orgApacheFelixHttpTimeout = orgApacheFelixHttpTimeout;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsEnable(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpsEnable) {
    this.orgApacheFelixHttpsEnable = orgApacheFelixHttpsEnable;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsEnable
   * @return orgApacheFelixHttpsEnable
   */
  @Valid 
  @Schema(name = "org.apache.felix.https.enable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.https.enable")
  public @Nullable ConfigNodePropertyBoolean getOrgApacheFelixHttpsEnable() {
    return orgApacheFelixHttpsEnable;
  }

  @JsonProperty("org.apache.felix.https.enable")
  public void setOrgApacheFelixHttpsEnable(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpsEnable) {
    this.orgApacheFelixHttpsEnable = orgApacheFelixHttpsEnable;
  }

  public OrgApacheFelixHttpProperties orgOsgiServiceHttpPortSecure(@Nullable ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure) {
    this.orgOsgiServiceHttpPortSecure = orgOsgiServiceHttpPortSecure;
    return this;
  }

  /**
   * Get orgOsgiServiceHttpPortSecure
   * @return orgOsgiServiceHttpPortSecure
   */
  @Valid 
  @Schema(name = "org.osgi.service.http.port.secure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.osgi.service.http.port.secure")
  public @Nullable ConfigNodePropertyInteger getOrgOsgiServiceHttpPortSecure() {
    return orgOsgiServiceHttpPortSecure;
  }

  @JsonProperty("org.osgi.service.http.port.secure")
  public void setOrgOsgiServiceHttpPortSecure(@Nullable ConfigNodePropertyInteger orgOsgiServiceHttpPortSecure) {
    this.orgOsgiServiceHttpPortSecure = orgOsgiServiceHttpPortSecure;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsKeystore(@Nullable ConfigNodePropertyString orgApacheFelixHttpsKeystore) {
    this.orgApacheFelixHttpsKeystore = orgApacheFelixHttpsKeystore;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsKeystore
   * @return orgApacheFelixHttpsKeystore
   */
  @Valid 
  @Schema(name = "org.apache.felix.https.keystore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.https.keystore")
  public @Nullable ConfigNodePropertyString getOrgApacheFelixHttpsKeystore() {
    return orgApacheFelixHttpsKeystore;
  }

  @JsonProperty("org.apache.felix.https.keystore")
  public void setOrgApacheFelixHttpsKeystore(@Nullable ConfigNodePropertyString orgApacheFelixHttpsKeystore) {
    this.orgApacheFelixHttpsKeystore = orgApacheFelixHttpsKeystore;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsKeystorePassword(@Nullable ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword) {
    this.orgApacheFelixHttpsKeystorePassword = orgApacheFelixHttpsKeystorePassword;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsKeystorePassword
   * @return orgApacheFelixHttpsKeystorePassword
   */
  @Valid 
  @Schema(name = "org.apache.felix.https.keystore.password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.https.keystore.password")
  public @Nullable ConfigNodePropertyString getOrgApacheFelixHttpsKeystorePassword() {
    return orgApacheFelixHttpsKeystorePassword;
  }

  @JsonProperty("org.apache.felix.https.keystore.password")
  public void setOrgApacheFelixHttpsKeystorePassword(@Nullable ConfigNodePropertyString orgApacheFelixHttpsKeystorePassword) {
    this.orgApacheFelixHttpsKeystorePassword = orgApacheFelixHttpsKeystorePassword;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsKeystoreKeyPassword(@Nullable ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword) {
    this.orgApacheFelixHttpsKeystoreKeyPassword = orgApacheFelixHttpsKeystoreKeyPassword;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsKeystoreKeyPassword
   * @return orgApacheFelixHttpsKeystoreKeyPassword
   */
  @Valid 
  @Schema(name = "org.apache.felix.https.keystore.key.password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.https.keystore.key.password")
  public @Nullable ConfigNodePropertyString getOrgApacheFelixHttpsKeystoreKeyPassword() {
    return orgApacheFelixHttpsKeystoreKeyPassword;
  }

  @JsonProperty("org.apache.felix.https.keystore.key.password")
  public void setOrgApacheFelixHttpsKeystoreKeyPassword(@Nullable ConfigNodePropertyString orgApacheFelixHttpsKeystoreKeyPassword) {
    this.orgApacheFelixHttpsKeystoreKeyPassword = orgApacheFelixHttpsKeystoreKeyPassword;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsTruststore(@Nullable ConfigNodePropertyString orgApacheFelixHttpsTruststore) {
    this.orgApacheFelixHttpsTruststore = orgApacheFelixHttpsTruststore;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsTruststore
   * @return orgApacheFelixHttpsTruststore
   */
  @Valid 
  @Schema(name = "org.apache.felix.https.truststore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.https.truststore")
  public @Nullable ConfigNodePropertyString getOrgApacheFelixHttpsTruststore() {
    return orgApacheFelixHttpsTruststore;
  }

  @JsonProperty("org.apache.felix.https.truststore")
  public void setOrgApacheFelixHttpsTruststore(@Nullable ConfigNodePropertyString orgApacheFelixHttpsTruststore) {
    this.orgApacheFelixHttpsTruststore = orgApacheFelixHttpsTruststore;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsTruststorePassword(@Nullable ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword) {
    this.orgApacheFelixHttpsTruststorePassword = orgApacheFelixHttpsTruststorePassword;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsTruststorePassword
   * @return orgApacheFelixHttpsTruststorePassword
   */
  @Valid 
  @Schema(name = "org.apache.felix.https.truststore.password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.https.truststore.password")
  public @Nullable ConfigNodePropertyString getOrgApacheFelixHttpsTruststorePassword() {
    return orgApacheFelixHttpsTruststorePassword;
  }

  @JsonProperty("org.apache.felix.https.truststore.password")
  public void setOrgApacheFelixHttpsTruststorePassword(@Nullable ConfigNodePropertyString orgApacheFelixHttpsTruststorePassword) {
    this.orgApacheFelixHttpsTruststorePassword = orgApacheFelixHttpsTruststorePassword;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsClientcertificate(@Nullable ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate) {
    this.orgApacheFelixHttpsClientcertificate = orgApacheFelixHttpsClientcertificate;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsClientcertificate
   * @return orgApacheFelixHttpsClientcertificate
   */
  @Valid 
  @Schema(name = "org.apache.felix.https.clientcertificate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.https.clientcertificate")
  public @Nullable ConfigNodePropertyDropDown getOrgApacheFelixHttpsClientcertificate() {
    return orgApacheFelixHttpsClientcertificate;
  }

  @JsonProperty("org.apache.felix.https.clientcertificate")
  public void setOrgApacheFelixHttpsClientcertificate(@Nullable ConfigNodePropertyDropDown orgApacheFelixHttpsClientcertificate) {
    this.orgApacheFelixHttpsClientcertificate = orgApacheFelixHttpsClientcertificate;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpContextPath(@Nullable ConfigNodePropertyString orgApacheFelixHttpContextPath) {
    this.orgApacheFelixHttpContextPath = orgApacheFelixHttpContextPath;
    return this;
  }

  /**
   * Get orgApacheFelixHttpContextPath
   * @return orgApacheFelixHttpContextPath
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.context_path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.context_path")
  public @Nullable ConfigNodePropertyString getOrgApacheFelixHttpContextPath() {
    return orgApacheFelixHttpContextPath;
  }

  @JsonProperty("org.apache.felix.http.context_path")
  public void setOrgApacheFelixHttpContextPath(@Nullable ConfigNodePropertyString orgApacheFelixHttpContextPath) {
    this.orgApacheFelixHttpContextPath = orgApacheFelixHttpContextPath;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpMbeans(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpMbeans) {
    this.orgApacheFelixHttpMbeans = orgApacheFelixHttpMbeans;
    return this;
  }

  /**
   * Get orgApacheFelixHttpMbeans
   * @return orgApacheFelixHttpMbeans
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.mbeans", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.mbeans")
  public @Nullable ConfigNodePropertyBoolean getOrgApacheFelixHttpMbeans() {
    return orgApacheFelixHttpMbeans;
  }

  @JsonProperty("org.apache.felix.http.mbeans")
  public void setOrgApacheFelixHttpMbeans(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpMbeans) {
    this.orgApacheFelixHttpMbeans = orgApacheFelixHttpMbeans;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpSessionTimeout(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout) {
    this.orgApacheFelixHttpSessionTimeout = orgApacheFelixHttpSessionTimeout;
    return this;
  }

  /**
   * Get orgApacheFelixHttpSessionTimeout
   * @return orgApacheFelixHttpSessionTimeout
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.session.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.session.timeout")
  public @Nullable ConfigNodePropertyInteger getOrgApacheFelixHttpSessionTimeout() {
    return orgApacheFelixHttpSessionTimeout;
  }

  @JsonProperty("org.apache.felix.http.session.timeout")
  public void setOrgApacheFelixHttpSessionTimeout(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpSessionTimeout) {
    this.orgApacheFelixHttpSessionTimeout = orgApacheFelixHttpSessionTimeout;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyThreadpoolMax(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax) {
    this.orgApacheFelixHttpJettyThreadpoolMax = orgApacheFelixHttpJettyThreadpoolMax;
    return this;
  }

  /**
   * Get orgApacheFelixHttpJettyThreadpoolMax
   * @return orgApacheFelixHttpJettyThreadpoolMax
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.jetty.threadpool.max", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.jetty.threadpool.max")
  public @Nullable ConfigNodePropertyInteger getOrgApacheFelixHttpJettyThreadpoolMax() {
    return orgApacheFelixHttpJettyThreadpoolMax;
  }

  @JsonProperty("org.apache.felix.http.jetty.threadpool.max")
  public void setOrgApacheFelixHttpJettyThreadpoolMax(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyThreadpoolMax) {
    this.orgApacheFelixHttpJettyThreadpoolMax = orgApacheFelixHttpJettyThreadpoolMax;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyAcceptors(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors) {
    this.orgApacheFelixHttpJettyAcceptors = orgApacheFelixHttpJettyAcceptors;
    return this;
  }

  /**
   * Get orgApacheFelixHttpJettyAcceptors
   * @return orgApacheFelixHttpJettyAcceptors
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.jetty.acceptors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.jetty.acceptors")
  public @Nullable ConfigNodePropertyInteger getOrgApacheFelixHttpJettyAcceptors() {
    return orgApacheFelixHttpJettyAcceptors;
  }

  @JsonProperty("org.apache.felix.http.jetty.acceptors")
  public void setOrgApacheFelixHttpJettyAcceptors(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyAcceptors) {
    this.orgApacheFelixHttpJettyAcceptors = orgApacheFelixHttpJettyAcceptors;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettySelectors(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors) {
    this.orgApacheFelixHttpJettySelectors = orgApacheFelixHttpJettySelectors;
    return this;
  }

  /**
   * Get orgApacheFelixHttpJettySelectors
   * @return orgApacheFelixHttpJettySelectors
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.jetty.selectors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.jetty.selectors")
  public @Nullable ConfigNodePropertyInteger getOrgApacheFelixHttpJettySelectors() {
    return orgApacheFelixHttpJettySelectors;
  }

  @JsonProperty("org.apache.felix.http.jetty.selectors")
  public void setOrgApacheFelixHttpJettySelectors(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettySelectors) {
    this.orgApacheFelixHttpJettySelectors = orgApacheFelixHttpJettySelectors;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyHeaderBufferSize(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize) {
    this.orgApacheFelixHttpJettyHeaderBufferSize = orgApacheFelixHttpJettyHeaderBufferSize;
    return this;
  }

  /**
   * Get orgApacheFelixHttpJettyHeaderBufferSize
   * @return orgApacheFelixHttpJettyHeaderBufferSize
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.jetty.headerBufferSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.jetty.headerBufferSize")
  public @Nullable ConfigNodePropertyInteger getOrgApacheFelixHttpJettyHeaderBufferSize() {
    return orgApacheFelixHttpJettyHeaderBufferSize;
  }

  @JsonProperty("org.apache.felix.http.jetty.headerBufferSize")
  public void setOrgApacheFelixHttpJettyHeaderBufferSize(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyHeaderBufferSize) {
    this.orgApacheFelixHttpJettyHeaderBufferSize = orgApacheFelixHttpJettyHeaderBufferSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyRequestBufferSize(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize) {
    this.orgApacheFelixHttpJettyRequestBufferSize = orgApacheFelixHttpJettyRequestBufferSize;
    return this;
  }

  /**
   * Get orgApacheFelixHttpJettyRequestBufferSize
   * @return orgApacheFelixHttpJettyRequestBufferSize
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.jetty.requestBufferSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.jetty.requestBufferSize")
  public @Nullable ConfigNodePropertyInteger getOrgApacheFelixHttpJettyRequestBufferSize() {
    return orgApacheFelixHttpJettyRequestBufferSize;
  }

  @JsonProperty("org.apache.felix.http.jetty.requestBufferSize")
  public void setOrgApacheFelixHttpJettyRequestBufferSize(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyRequestBufferSize) {
    this.orgApacheFelixHttpJettyRequestBufferSize = orgApacheFelixHttpJettyRequestBufferSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyResponseBufferSize(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize) {
    this.orgApacheFelixHttpJettyResponseBufferSize = orgApacheFelixHttpJettyResponseBufferSize;
    return this;
  }

  /**
   * Get orgApacheFelixHttpJettyResponseBufferSize
   * @return orgApacheFelixHttpJettyResponseBufferSize
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.jetty.responseBufferSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.jetty.responseBufferSize")
  public @Nullable ConfigNodePropertyInteger getOrgApacheFelixHttpJettyResponseBufferSize() {
    return orgApacheFelixHttpJettyResponseBufferSize;
  }

  @JsonProperty("org.apache.felix.http.jetty.responseBufferSize")
  public void setOrgApacheFelixHttpJettyResponseBufferSize(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyResponseBufferSize) {
    this.orgApacheFelixHttpJettyResponseBufferSize = orgApacheFelixHttpJettyResponseBufferSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettyMaxFormSize(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize) {
    this.orgApacheFelixHttpJettyMaxFormSize = orgApacheFelixHttpJettyMaxFormSize;
    return this;
  }

  /**
   * Get orgApacheFelixHttpJettyMaxFormSize
   * @return orgApacheFelixHttpJettyMaxFormSize
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.jetty.maxFormSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.jetty.maxFormSize")
  public @Nullable ConfigNodePropertyInteger getOrgApacheFelixHttpJettyMaxFormSize() {
    return orgApacheFelixHttpJettyMaxFormSize;
  }

  @JsonProperty("org.apache.felix.http.jetty.maxFormSize")
  public void setOrgApacheFelixHttpJettyMaxFormSize(@Nullable ConfigNodePropertyInteger orgApacheFelixHttpJettyMaxFormSize) {
    this.orgApacheFelixHttpJettyMaxFormSize = orgApacheFelixHttpJettyMaxFormSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpPathExclusions(@Nullable ConfigNodePropertyArray orgApacheFelixHttpPathExclusions) {
    this.orgApacheFelixHttpPathExclusions = orgApacheFelixHttpPathExclusions;
    return this;
  }

  /**
   * Get orgApacheFelixHttpPathExclusions
   * @return orgApacheFelixHttpPathExclusions
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.path_exclusions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.path_exclusions")
  public @Nullable ConfigNodePropertyArray getOrgApacheFelixHttpPathExclusions() {
    return orgApacheFelixHttpPathExclusions;
  }

  @JsonProperty("org.apache.felix.http.path_exclusions")
  public void setOrgApacheFelixHttpPathExclusions(@Nullable ConfigNodePropertyArray orgApacheFelixHttpPathExclusions) {
    this.orgApacheFelixHttpPathExclusions = orgApacheFelixHttpPathExclusions;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyCiphersuitesExcluded(@Nullable ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesExcluded = orgApacheFelixHttpsJettyCiphersuitesExcluded;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsJettyCiphersuitesExcluded
   * @return orgApacheFelixHttpsJettyCiphersuitesExcluded
   */
  @Valid 
  @Schema(name = "org.apache.felix.https.jetty.ciphersuites.excluded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.https.jetty.ciphersuites.excluded")
  public @Nullable ConfigNodePropertyArray getOrgApacheFelixHttpsJettyCiphersuitesExcluded() {
    return orgApacheFelixHttpsJettyCiphersuitesExcluded;
  }

  @JsonProperty("org.apache.felix.https.jetty.ciphersuites.excluded")
  public void setOrgApacheFelixHttpsJettyCiphersuitesExcluded(@Nullable ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesExcluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesExcluded = orgApacheFelixHttpsJettyCiphersuitesExcluded;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyCiphersuitesIncluded(@Nullable ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesIncluded = orgApacheFelixHttpsJettyCiphersuitesIncluded;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsJettyCiphersuitesIncluded
   * @return orgApacheFelixHttpsJettyCiphersuitesIncluded
   */
  @Valid 
  @Schema(name = "org.apache.felix.https.jetty.ciphersuites.included", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.https.jetty.ciphersuites.included")
  public @Nullable ConfigNodePropertyArray getOrgApacheFelixHttpsJettyCiphersuitesIncluded() {
    return orgApacheFelixHttpsJettyCiphersuitesIncluded;
  }

  @JsonProperty("org.apache.felix.https.jetty.ciphersuites.included")
  public void setOrgApacheFelixHttpsJettyCiphersuitesIncluded(@Nullable ConfigNodePropertyArray orgApacheFelixHttpsJettyCiphersuitesIncluded) {
    this.orgApacheFelixHttpsJettyCiphersuitesIncluded = orgApacheFelixHttpsJettyCiphersuitesIncluded;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpJettySendServerHeader(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader) {
    this.orgApacheFelixHttpJettySendServerHeader = orgApacheFelixHttpJettySendServerHeader;
    return this;
  }

  /**
   * Get orgApacheFelixHttpJettySendServerHeader
   * @return orgApacheFelixHttpJettySendServerHeader
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.jetty.sendServerHeader", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.jetty.sendServerHeader")
  public @Nullable ConfigNodePropertyBoolean getOrgApacheFelixHttpJettySendServerHeader() {
    return orgApacheFelixHttpJettySendServerHeader;
  }

  @JsonProperty("org.apache.felix.http.jetty.sendServerHeader")
  public void setOrgApacheFelixHttpJettySendServerHeader(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpJettySendServerHeader) {
    this.orgApacheFelixHttpJettySendServerHeader = orgApacheFelixHttpJettySendServerHeader;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyProtocolsIncluded(@Nullable ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded) {
    this.orgApacheFelixHttpsJettyProtocolsIncluded = orgApacheFelixHttpsJettyProtocolsIncluded;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsJettyProtocolsIncluded
   * @return orgApacheFelixHttpsJettyProtocolsIncluded
   */
  @Valid 
  @Schema(name = "org.apache.felix.https.jetty.protocols.included", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.https.jetty.protocols.included")
  public @Nullable ConfigNodePropertyArray getOrgApacheFelixHttpsJettyProtocolsIncluded() {
    return orgApacheFelixHttpsJettyProtocolsIncluded;
  }

  @JsonProperty("org.apache.felix.https.jetty.protocols.included")
  public void setOrgApacheFelixHttpsJettyProtocolsIncluded(@Nullable ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsIncluded) {
    this.orgApacheFelixHttpsJettyProtocolsIncluded = orgApacheFelixHttpsJettyProtocolsIncluded;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyProtocolsExcluded(@Nullable ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded) {
    this.orgApacheFelixHttpsJettyProtocolsExcluded = orgApacheFelixHttpsJettyProtocolsExcluded;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsJettyProtocolsExcluded
   * @return orgApacheFelixHttpsJettyProtocolsExcluded
   */
  @Valid 
  @Schema(name = "org.apache.felix.https.jetty.protocols.excluded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.https.jetty.protocols.excluded")
  public @Nullable ConfigNodePropertyArray getOrgApacheFelixHttpsJettyProtocolsExcluded() {
    return orgApacheFelixHttpsJettyProtocolsExcluded;
  }

  @JsonProperty("org.apache.felix.https.jetty.protocols.excluded")
  public void setOrgApacheFelixHttpsJettyProtocolsExcluded(@Nullable ConfigNodePropertyArray orgApacheFelixHttpsJettyProtocolsExcluded) {
    this.orgApacheFelixHttpsJettyProtocolsExcluded = orgApacheFelixHttpsJettyProtocolsExcluded;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixProxyLoadBalancerConnectionEnable(@Nullable ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable) {
    this.orgApacheFelixProxyLoadBalancerConnectionEnable = orgApacheFelixProxyLoadBalancerConnectionEnable;
    return this;
  }

  /**
   * Get orgApacheFelixProxyLoadBalancerConnectionEnable
   * @return orgApacheFelixProxyLoadBalancerConnectionEnable
   */
  @Valid 
  @Schema(name = "org.apache.felix.proxy.load.balancer.connection.enable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.proxy.load.balancer.connection.enable")
  public @Nullable ConfigNodePropertyBoolean getOrgApacheFelixProxyLoadBalancerConnectionEnable() {
    return orgApacheFelixProxyLoadBalancerConnectionEnable;
  }

  @JsonProperty("org.apache.felix.proxy.load.balancer.connection.enable")
  public void setOrgApacheFelixProxyLoadBalancerConnectionEnable(@Nullable ConfigNodePropertyBoolean orgApacheFelixProxyLoadBalancerConnectionEnable) {
    this.orgApacheFelixProxyLoadBalancerConnectionEnable = orgApacheFelixProxyLoadBalancerConnectionEnable;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettyRenegotiateAllowed(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed) {
    this.orgApacheFelixHttpsJettyRenegotiateAllowed = orgApacheFelixHttpsJettyRenegotiateAllowed;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsJettyRenegotiateAllowed
   * @return orgApacheFelixHttpsJettyRenegotiateAllowed
   */
  @Valid 
  @Schema(name = "org.apache.felix.https.jetty.renegotiateAllowed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.https.jetty.renegotiateAllowed")
  public @Nullable ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettyRenegotiateAllowed() {
    return orgApacheFelixHttpsJettyRenegotiateAllowed;
  }

  @JsonProperty("org.apache.felix.https.jetty.renegotiateAllowed")
  public void setOrgApacheFelixHttpsJettyRenegotiateAllowed(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpsJettyRenegotiateAllowed) {
    this.orgApacheFelixHttpsJettyRenegotiateAllowed = orgApacheFelixHttpsJettyRenegotiateAllowed;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettySessionCookieHttpOnly(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly) {
    this.orgApacheFelixHttpsJettySessionCookieHttpOnly = orgApacheFelixHttpsJettySessionCookieHttpOnly;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsJettySessionCookieHttpOnly
   * @return orgApacheFelixHttpsJettySessionCookieHttpOnly
   */
  @Valid 
  @Schema(name = "org.apache.felix.https.jetty.session.cookie.httpOnly", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.https.jetty.session.cookie.httpOnly")
  public @Nullable ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettySessionCookieHttpOnly() {
    return orgApacheFelixHttpsJettySessionCookieHttpOnly;
  }

  @JsonProperty("org.apache.felix.https.jetty.session.cookie.httpOnly")
  public void setOrgApacheFelixHttpsJettySessionCookieHttpOnly(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieHttpOnly) {
    this.orgApacheFelixHttpsJettySessionCookieHttpOnly = orgApacheFelixHttpsJettySessionCookieHttpOnly;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpsJettySessionCookieSecure(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure) {
    this.orgApacheFelixHttpsJettySessionCookieSecure = orgApacheFelixHttpsJettySessionCookieSecure;
    return this;
  }

  /**
   * Get orgApacheFelixHttpsJettySessionCookieSecure
   * @return orgApacheFelixHttpsJettySessionCookieSecure
   */
  @Valid 
  @Schema(name = "org.apache.felix.https.jetty.session.cookie.secure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.https.jetty.session.cookie.secure")
  public @Nullable ConfigNodePropertyBoolean getOrgApacheFelixHttpsJettySessionCookieSecure() {
    return orgApacheFelixHttpsJettySessionCookieSecure;
  }

  @JsonProperty("org.apache.felix.https.jetty.session.cookie.secure")
  public void setOrgApacheFelixHttpsJettySessionCookieSecure(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpsJettySessionCookieSecure) {
    this.orgApacheFelixHttpsJettySessionCookieSecure = orgApacheFelixHttpsJettySessionCookieSecure;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionIdPathParameterName(@Nullable ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName) {
    this.orgEclipseJettyServletSessionIdPathParameterName = orgEclipseJettyServletSessionIdPathParameterName;
    return this;
  }

  /**
   * Get orgEclipseJettyServletSessionIdPathParameterName
   * @return orgEclipseJettyServletSessionIdPathParameterName
   */
  @Valid 
  @Schema(name = "org.eclipse.jetty.servlet.SessionIdPathParameterName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.eclipse.jetty.servlet.SessionIdPathParameterName")
  public @Nullable ConfigNodePropertyString getOrgEclipseJettyServletSessionIdPathParameterName() {
    return orgEclipseJettyServletSessionIdPathParameterName;
  }

  @JsonProperty("org.eclipse.jetty.servlet.SessionIdPathParameterName")
  public void setOrgEclipseJettyServletSessionIdPathParameterName(@Nullable ConfigNodePropertyString orgEclipseJettyServletSessionIdPathParameterName) {
    this.orgEclipseJettyServletSessionIdPathParameterName = orgEclipseJettyServletSessionIdPathParameterName;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletCheckingRemoteSessionIdEncoding(@Nullable ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding) {
    this.orgEclipseJettyServletCheckingRemoteSessionIdEncoding = orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
    return this;
  }

  /**
   * Get orgEclipseJettyServletCheckingRemoteSessionIdEncoding
   * @return orgEclipseJettyServletCheckingRemoteSessionIdEncoding
   */
  @Valid 
  @Schema(name = "org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding")
  public @Nullable ConfigNodePropertyBoolean getOrgEclipseJettyServletCheckingRemoteSessionIdEncoding() {
    return orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
  }

  @JsonProperty("org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding")
  public void setOrgEclipseJettyServletCheckingRemoteSessionIdEncoding(@Nullable ConfigNodePropertyBoolean orgEclipseJettyServletCheckingRemoteSessionIdEncoding) {
    this.orgEclipseJettyServletCheckingRemoteSessionIdEncoding = orgEclipseJettyServletCheckingRemoteSessionIdEncoding;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionCookie(@Nullable ConfigNodePropertyString orgEclipseJettyServletSessionCookie) {
    this.orgEclipseJettyServletSessionCookie = orgEclipseJettyServletSessionCookie;
    return this;
  }

  /**
   * Get orgEclipseJettyServletSessionCookie
   * @return orgEclipseJettyServletSessionCookie
   */
  @Valid 
  @Schema(name = "org.eclipse.jetty.servlet.SessionCookie", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.eclipse.jetty.servlet.SessionCookie")
  public @Nullable ConfigNodePropertyString getOrgEclipseJettyServletSessionCookie() {
    return orgEclipseJettyServletSessionCookie;
  }

  @JsonProperty("org.eclipse.jetty.servlet.SessionCookie")
  public void setOrgEclipseJettyServletSessionCookie(@Nullable ConfigNodePropertyString orgEclipseJettyServletSessionCookie) {
    this.orgEclipseJettyServletSessionCookie = orgEclipseJettyServletSessionCookie;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionDomain(@Nullable ConfigNodePropertyString orgEclipseJettyServletSessionDomain) {
    this.orgEclipseJettyServletSessionDomain = orgEclipseJettyServletSessionDomain;
    return this;
  }

  /**
   * Get orgEclipseJettyServletSessionDomain
   * @return orgEclipseJettyServletSessionDomain
   */
  @Valid 
  @Schema(name = "org.eclipse.jetty.servlet.SessionDomain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.eclipse.jetty.servlet.SessionDomain")
  public @Nullable ConfigNodePropertyString getOrgEclipseJettyServletSessionDomain() {
    return orgEclipseJettyServletSessionDomain;
  }

  @JsonProperty("org.eclipse.jetty.servlet.SessionDomain")
  public void setOrgEclipseJettyServletSessionDomain(@Nullable ConfigNodePropertyString orgEclipseJettyServletSessionDomain) {
    this.orgEclipseJettyServletSessionDomain = orgEclipseJettyServletSessionDomain;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletSessionPath(@Nullable ConfigNodePropertyString orgEclipseJettyServletSessionPath) {
    this.orgEclipseJettyServletSessionPath = orgEclipseJettyServletSessionPath;
    return this;
  }

  /**
   * Get orgEclipseJettyServletSessionPath
   * @return orgEclipseJettyServletSessionPath
   */
  @Valid 
  @Schema(name = "org.eclipse.jetty.servlet.SessionPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.eclipse.jetty.servlet.SessionPath")
  public @Nullable ConfigNodePropertyString getOrgEclipseJettyServletSessionPath() {
    return orgEclipseJettyServletSessionPath;
  }

  @JsonProperty("org.eclipse.jetty.servlet.SessionPath")
  public void setOrgEclipseJettyServletSessionPath(@Nullable ConfigNodePropertyString orgEclipseJettyServletSessionPath) {
    this.orgEclipseJettyServletSessionPath = orgEclipseJettyServletSessionPath;
  }

  public OrgApacheFelixHttpProperties orgEclipseJettyServletMaxAge(@Nullable ConfigNodePropertyInteger orgEclipseJettyServletMaxAge) {
    this.orgEclipseJettyServletMaxAge = orgEclipseJettyServletMaxAge;
    return this;
  }

  /**
   * Get orgEclipseJettyServletMaxAge
   * @return orgEclipseJettyServletMaxAge
   */
  @Valid 
  @Schema(name = "org.eclipse.jetty.servlet.MaxAge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.eclipse.jetty.servlet.MaxAge")
  public @Nullable ConfigNodePropertyInteger getOrgEclipseJettyServletMaxAge() {
    return orgEclipseJettyServletMaxAge;
  }

  @JsonProperty("org.eclipse.jetty.servlet.MaxAge")
  public void setOrgEclipseJettyServletMaxAge(@Nullable ConfigNodePropertyInteger orgEclipseJettyServletMaxAge) {
    this.orgEclipseJettyServletMaxAge = orgEclipseJettyServletMaxAge;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpName(@Nullable ConfigNodePropertyString orgApacheFelixHttpName) {
    this.orgApacheFelixHttpName = orgApacheFelixHttpName;
    return this;
  }

  /**
   * Get orgApacheFelixHttpName
   * @return orgApacheFelixHttpName
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.name")
  public @Nullable ConfigNodePropertyString getOrgApacheFelixHttpName() {
    return orgApacheFelixHttpName;
  }

  @JsonProperty("org.apache.felix.http.name")
  public void setOrgApacheFelixHttpName(@Nullable ConfigNodePropertyString orgApacheFelixHttpName) {
    this.orgApacheFelixHttpName = orgApacheFelixHttpName;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGziphandlerEnable(@Nullable ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable) {
    this.orgApacheFelixJettyGziphandlerEnable = orgApacheFelixJettyGziphandlerEnable;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGziphandlerEnable
   * @return orgApacheFelixJettyGziphandlerEnable
   */
  @Valid 
  @Schema(name = "org.apache.felix.jetty.gziphandler.enable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.jetty.gziphandler.enable")
  public @Nullable ConfigNodePropertyBoolean getOrgApacheFelixJettyGziphandlerEnable() {
    return orgApacheFelixJettyGziphandlerEnable;
  }

  @JsonProperty("org.apache.felix.jetty.gziphandler.enable")
  public void setOrgApacheFelixJettyGziphandlerEnable(@Nullable ConfigNodePropertyBoolean orgApacheFelixJettyGziphandlerEnable) {
    this.orgApacheFelixJettyGziphandlerEnable = orgApacheFelixJettyGziphandlerEnable;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipMinGzipSize(@Nullable ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize) {
    this.orgApacheFelixJettyGzipMinGzipSize = orgApacheFelixJettyGzipMinGzipSize;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipMinGzipSize
   * @return orgApacheFelixJettyGzipMinGzipSize
   */
  @Valid 
  @Schema(name = "org.apache.felix.jetty.gzip.minGzipSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.jetty.gzip.minGzipSize")
  public @Nullable ConfigNodePropertyInteger getOrgApacheFelixJettyGzipMinGzipSize() {
    return orgApacheFelixJettyGzipMinGzipSize;
  }

  @JsonProperty("org.apache.felix.jetty.gzip.minGzipSize")
  public void setOrgApacheFelixJettyGzipMinGzipSize(@Nullable ConfigNodePropertyInteger orgApacheFelixJettyGzipMinGzipSize) {
    this.orgApacheFelixJettyGzipMinGzipSize = orgApacheFelixJettyGzipMinGzipSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipCompressionLevel(@Nullable ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel) {
    this.orgApacheFelixJettyGzipCompressionLevel = orgApacheFelixJettyGzipCompressionLevel;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipCompressionLevel
   * @return orgApacheFelixJettyGzipCompressionLevel
   */
  @Valid 
  @Schema(name = "org.apache.felix.jetty.gzip.compressionLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.jetty.gzip.compressionLevel")
  public @Nullable ConfigNodePropertyInteger getOrgApacheFelixJettyGzipCompressionLevel() {
    return orgApacheFelixJettyGzipCompressionLevel;
  }

  @JsonProperty("org.apache.felix.jetty.gzip.compressionLevel")
  public void setOrgApacheFelixJettyGzipCompressionLevel(@Nullable ConfigNodePropertyInteger orgApacheFelixJettyGzipCompressionLevel) {
    this.orgApacheFelixJettyGzipCompressionLevel = orgApacheFelixJettyGzipCompressionLevel;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipInflateBufferSize(@Nullable ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize) {
    this.orgApacheFelixJettyGzipInflateBufferSize = orgApacheFelixJettyGzipInflateBufferSize;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipInflateBufferSize
   * @return orgApacheFelixJettyGzipInflateBufferSize
   */
  @Valid 
  @Schema(name = "org.apache.felix.jetty.gzip.inflateBufferSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.jetty.gzip.inflateBufferSize")
  public @Nullable ConfigNodePropertyInteger getOrgApacheFelixJettyGzipInflateBufferSize() {
    return orgApacheFelixJettyGzipInflateBufferSize;
  }

  @JsonProperty("org.apache.felix.jetty.gzip.inflateBufferSize")
  public void setOrgApacheFelixJettyGzipInflateBufferSize(@Nullable ConfigNodePropertyInteger orgApacheFelixJettyGzipInflateBufferSize) {
    this.orgApacheFelixJettyGzipInflateBufferSize = orgApacheFelixJettyGzipInflateBufferSize;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipSyncFlush(@Nullable ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush) {
    this.orgApacheFelixJettyGzipSyncFlush = orgApacheFelixJettyGzipSyncFlush;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipSyncFlush
   * @return orgApacheFelixJettyGzipSyncFlush
   */
  @Valid 
  @Schema(name = "org.apache.felix.jetty.gzip.syncFlush", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.jetty.gzip.syncFlush")
  public @Nullable ConfigNodePropertyBoolean getOrgApacheFelixJettyGzipSyncFlush() {
    return orgApacheFelixJettyGzipSyncFlush;
  }

  @JsonProperty("org.apache.felix.jetty.gzip.syncFlush")
  public void setOrgApacheFelixJettyGzipSyncFlush(@Nullable ConfigNodePropertyBoolean orgApacheFelixJettyGzipSyncFlush) {
    this.orgApacheFelixJettyGzipSyncFlush = orgApacheFelixJettyGzipSyncFlush;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedUserAgents(@Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents) {
    this.orgApacheFelixJettyGzipExcludedUserAgents = orgApacheFelixJettyGzipExcludedUserAgents;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipExcludedUserAgents
   * @return orgApacheFelixJettyGzipExcludedUserAgents
   */
  @Valid 
  @Schema(name = "org.apache.felix.jetty.gzip.excludedUserAgents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.jetty.gzip.excludedUserAgents")
  public @Nullable ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedUserAgents() {
    return orgApacheFelixJettyGzipExcludedUserAgents;
  }

  @JsonProperty("org.apache.felix.jetty.gzip.excludedUserAgents")
  public void setOrgApacheFelixJettyGzipExcludedUserAgents(@Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedUserAgents) {
    this.orgApacheFelixJettyGzipExcludedUserAgents = orgApacheFelixJettyGzipExcludedUserAgents;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipIncludedMethods(@Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods) {
    this.orgApacheFelixJettyGzipIncludedMethods = orgApacheFelixJettyGzipIncludedMethods;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipIncludedMethods
   * @return orgApacheFelixJettyGzipIncludedMethods
   */
  @Valid 
  @Schema(name = "org.apache.felix.jetty.gzip.includedMethods", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.jetty.gzip.includedMethods")
  public @Nullable ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedMethods() {
    return orgApacheFelixJettyGzipIncludedMethods;
  }

  @JsonProperty("org.apache.felix.jetty.gzip.includedMethods")
  public void setOrgApacheFelixJettyGzipIncludedMethods(@Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMethods) {
    this.orgApacheFelixJettyGzipIncludedMethods = orgApacheFelixJettyGzipIncludedMethods;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedMethods(@Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods) {
    this.orgApacheFelixJettyGzipExcludedMethods = orgApacheFelixJettyGzipExcludedMethods;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipExcludedMethods
   * @return orgApacheFelixJettyGzipExcludedMethods
   */
  @Valid 
  @Schema(name = "org.apache.felix.jetty.gzip.excludedMethods", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.jetty.gzip.excludedMethods")
  public @Nullable ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedMethods() {
    return orgApacheFelixJettyGzipExcludedMethods;
  }

  @JsonProperty("org.apache.felix.jetty.gzip.excludedMethods")
  public void setOrgApacheFelixJettyGzipExcludedMethods(@Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMethods) {
    this.orgApacheFelixJettyGzipExcludedMethods = orgApacheFelixJettyGzipExcludedMethods;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipIncludedPaths(@Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths) {
    this.orgApacheFelixJettyGzipIncludedPaths = orgApacheFelixJettyGzipIncludedPaths;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipIncludedPaths
   * @return orgApacheFelixJettyGzipIncludedPaths
   */
  @Valid 
  @Schema(name = "org.apache.felix.jetty.gzip.includedPaths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.jetty.gzip.includedPaths")
  public @Nullable ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedPaths() {
    return orgApacheFelixJettyGzipIncludedPaths;
  }

  @JsonProperty("org.apache.felix.jetty.gzip.includedPaths")
  public void setOrgApacheFelixJettyGzipIncludedPaths(@Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedPaths) {
    this.orgApacheFelixJettyGzipIncludedPaths = orgApacheFelixJettyGzipIncludedPaths;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedPaths(@Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths) {
    this.orgApacheFelixJettyGzipExcludedPaths = orgApacheFelixJettyGzipExcludedPaths;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipExcludedPaths
   * @return orgApacheFelixJettyGzipExcludedPaths
   */
  @Valid 
  @Schema(name = "org.apache.felix.jetty.gzip.excludedPaths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.jetty.gzip.excludedPaths")
  public @Nullable ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedPaths() {
    return orgApacheFelixJettyGzipExcludedPaths;
  }

  @JsonProperty("org.apache.felix.jetty.gzip.excludedPaths")
  public void setOrgApacheFelixJettyGzipExcludedPaths(@Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedPaths) {
    this.orgApacheFelixJettyGzipExcludedPaths = orgApacheFelixJettyGzipExcludedPaths;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipIncludedMimeTypes(@Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes) {
    this.orgApacheFelixJettyGzipIncludedMimeTypes = orgApacheFelixJettyGzipIncludedMimeTypes;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipIncludedMimeTypes
   * @return orgApacheFelixJettyGzipIncludedMimeTypes
   */
  @Valid 
  @Schema(name = "org.apache.felix.jetty.gzip.includedMimeTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.jetty.gzip.includedMimeTypes")
  public @Nullable ConfigNodePropertyArray getOrgApacheFelixJettyGzipIncludedMimeTypes() {
    return orgApacheFelixJettyGzipIncludedMimeTypes;
  }

  @JsonProperty("org.apache.felix.jetty.gzip.includedMimeTypes")
  public void setOrgApacheFelixJettyGzipIncludedMimeTypes(@Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipIncludedMimeTypes) {
    this.orgApacheFelixJettyGzipIncludedMimeTypes = orgApacheFelixJettyGzipIncludedMimeTypes;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixJettyGzipExcludedMimeTypes(@Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes) {
    this.orgApacheFelixJettyGzipExcludedMimeTypes = orgApacheFelixJettyGzipExcludedMimeTypes;
    return this;
  }

  /**
   * Get orgApacheFelixJettyGzipExcludedMimeTypes
   * @return orgApacheFelixJettyGzipExcludedMimeTypes
   */
  @Valid 
  @Schema(name = "org.apache.felix.jetty.gzip.excludedMimeTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.jetty.gzip.excludedMimeTypes")
  public @Nullable ConfigNodePropertyArray getOrgApacheFelixJettyGzipExcludedMimeTypes() {
    return orgApacheFelixJettyGzipExcludedMimeTypes;
  }

  @JsonProperty("org.apache.felix.jetty.gzip.excludedMimeTypes")
  public void setOrgApacheFelixJettyGzipExcludedMimeTypes(@Nullable ConfigNodePropertyArray orgApacheFelixJettyGzipExcludedMimeTypes) {
    this.orgApacheFelixJettyGzipExcludedMimeTypes = orgApacheFelixJettyGzipExcludedMimeTypes;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpSessionInvalidate(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate) {
    this.orgApacheFelixHttpSessionInvalidate = orgApacheFelixHttpSessionInvalidate;
    return this;
  }

  /**
   * Get orgApacheFelixHttpSessionInvalidate
   * @return orgApacheFelixHttpSessionInvalidate
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.session.invalidate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.session.invalidate")
  public @Nullable ConfigNodePropertyBoolean getOrgApacheFelixHttpSessionInvalidate() {
    return orgApacheFelixHttpSessionInvalidate;
  }

  @JsonProperty("org.apache.felix.http.session.invalidate")
  public void setOrgApacheFelixHttpSessionInvalidate(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpSessionInvalidate) {
    this.orgApacheFelixHttpSessionInvalidate = orgApacheFelixHttpSessionInvalidate;
  }

  public OrgApacheFelixHttpProperties orgApacheFelixHttpSessionUniqueid(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid) {
    this.orgApacheFelixHttpSessionUniqueid = orgApacheFelixHttpSessionUniqueid;
    return this;
  }

  /**
   * Get orgApacheFelixHttpSessionUniqueid
   * @return orgApacheFelixHttpSessionUniqueid
   */
  @Valid 
  @Schema(name = "org.apache.felix.http.session.uniqueid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.felix.http.session.uniqueid")
  public @Nullable ConfigNodePropertyBoolean getOrgApacheFelixHttpSessionUniqueid() {
    return orgApacheFelixHttpSessionUniqueid;
  }

  @JsonProperty("org.apache.felix.http.session.uniqueid")
  public void setOrgApacheFelixHttpSessionUniqueid(@Nullable ConfigNodePropertyBoolean orgApacheFelixHttpSessionUniqueid) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

