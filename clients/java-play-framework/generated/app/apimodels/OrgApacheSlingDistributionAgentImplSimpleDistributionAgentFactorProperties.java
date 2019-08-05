package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name = null;

  @JsonProperty("title")
  private ConfigNodePropertyString title = null;

  @JsonProperty("details")
  private ConfigNodePropertyString details = null;

  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled = null;

  @JsonProperty("serviceName")
  private ConfigNodePropertyString serviceName = null;

  @JsonProperty("log.level")
  private ConfigNodePropertyDropDown logLevel = null;

  @JsonProperty("queue.processing.enabled")
  private ConfigNodePropertyBoolean queueProcessingEnabled = null;

  @JsonProperty("packageExporter.target")
  private ConfigNodePropertyString packageExporterTarget = null;

  @JsonProperty("packageImporter.target")
  private ConfigNodePropertyString packageImporterTarget = null;

  @JsonProperty("requestAuthorizationStrategy.target")
  private ConfigNodePropertyString requestAuthorizationStrategyTarget = null;

  @JsonProperty("triggers.target")
  private ConfigNodePropertyString triggersTarget = null;

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Valid
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties title(ConfigNodePropertyString title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Valid
  public ConfigNodePropertyString getTitle() {
    return title;
  }

  public void setTitle(ConfigNodePropertyString title) {
    this.title = title;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties details(ConfigNodePropertyString details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @Valid
  public ConfigNodePropertyString getDetails() {
    return details;
  }

  public void setDetails(ConfigNodePropertyString details) {
    this.details = details;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @Valid
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties logLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
    return this;
  }

   /**
   * Get logLevel
   * @return logLevel
  **/
  @Valid
  public ConfigNodePropertyDropDown getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties queueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
    return this;
  }

   /**
   * Get queueProcessingEnabled
   * @return queueProcessingEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getQueueProcessingEnabled() {
    return queueProcessingEnabled;
  }

  public void setQueueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties packageExporterTarget(ConfigNodePropertyString packageExporterTarget) {
    this.packageExporterTarget = packageExporterTarget;
    return this;
  }

   /**
   * Get packageExporterTarget
   * @return packageExporterTarget
  **/
  @Valid
  public ConfigNodePropertyString getPackageExporterTarget() {
    return packageExporterTarget;
  }

  public void setPackageExporterTarget(ConfigNodePropertyString packageExporterTarget) {
    this.packageExporterTarget = packageExporterTarget;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties packageImporterTarget(ConfigNodePropertyString packageImporterTarget) {
    this.packageImporterTarget = packageImporterTarget;
    return this;
  }

   /**
   * Get packageImporterTarget
   * @return packageImporterTarget
  **/
  @Valid
  public ConfigNodePropertyString getPackageImporterTarget() {
    return packageImporterTarget;
  }

  public void setPackageImporterTarget(ConfigNodePropertyString packageImporterTarget) {
    this.packageImporterTarget = packageImporterTarget;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties requestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
    return this;
  }

   /**
   * Get requestAuthorizationStrategyTarget
   * @return requestAuthorizationStrategyTarget
  **/
  @Valid
  public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }

  public void setRequestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }

  public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties triggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
    return this;
  }

   /**
   * Get triggersTarget
   * @return triggersTarget
  **/
  @Valid
  public ConfigNodePropertyString getTriggersTarget() {
    return triggersTarget;
  }

  public void setTriggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties = (OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.name) &&
        Objects.equals(title, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.title) &&
        Objects.equals(details, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.details) &&
        Objects.equals(enabled, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.enabled) &&
        Objects.equals(serviceName, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.serviceName) &&
        Objects.equals(logLevel, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.logLevel) &&
        Objects.equals(queueProcessingEnabled, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.queueProcessingEnabled) &&
        Objects.equals(packageExporterTarget, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.packageExporterTarget) &&
        Objects.equals(packageImporterTarget, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.packageImporterTarget) &&
        Objects.equals(requestAuthorizationStrategyTarget, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.requestAuthorizationStrategyTarget) &&
        Objects.equals(triggersTarget, orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.triggersTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title, details, enabled, serviceName, logLevel, queueProcessingEnabled, packageExporterTarget, packageImporterTarget, requestAuthorizationStrategyTarget, triggersTarget);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    queueProcessingEnabled: ").append(toIndentedString(queueProcessingEnabled)).append("\n");
    sb.append("    packageExporterTarget: ").append(toIndentedString(packageExporterTarget)).append("\n");
    sb.append("    packageImporterTarget: ").append(toIndentedString(packageImporterTarget)).append("\n");
    sb.append("    requestAuthorizationStrategyTarget: ").append(toIndentedString(requestAuthorizationStrategyTarget)).append("\n");
    sb.append("    triggersTarget: ").append(toIndentedString(triggersTarget)).append("\n");
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

