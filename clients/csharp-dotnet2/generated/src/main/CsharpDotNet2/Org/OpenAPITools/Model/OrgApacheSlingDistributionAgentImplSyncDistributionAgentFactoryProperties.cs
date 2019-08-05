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
  public class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties {
    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public ConfigNodePropertyString Name { get; set; }

    /// <summary>
    /// Gets or Sets Title
    /// </summary>
    [DataMember(Name="title", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "title")]
    public ConfigNodePropertyString Title { get; set; }

    /// <summary>
    /// Gets or Sets Details
    /// </summary>
    [DataMember(Name="details", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "details")]
    public ConfigNodePropertyString Details { get; set; }

    /// <summary>
    /// Gets or Sets Enabled
    /// </summary>
    [DataMember(Name="enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enabled")]
    public ConfigNodePropertyBoolean Enabled { get; set; }

    /// <summary>
    /// Gets or Sets ServiceName
    /// </summary>
    [DataMember(Name="serviceName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "serviceName")]
    public ConfigNodePropertyString ServiceName { get; set; }

    /// <summary>
    /// Gets or Sets LogLevel
    /// </summary>
    [DataMember(Name="log.level", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "log.level")]
    public ConfigNodePropertyDropDown LogLevel { get; set; }

    /// <summary>
    /// Gets or Sets QueueProcessingEnabled
    /// </summary>
    [DataMember(Name="queue.processing.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queue.processing.enabled")]
    public ConfigNodePropertyBoolean QueueProcessingEnabled { get; set; }

    /// <summary>
    /// Gets or Sets PassiveQueues
    /// </summary>
    [DataMember(Name="passiveQueues", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "passiveQueues")]
    public ConfigNodePropertyArray PassiveQueues { get; set; }

    /// <summary>
    /// Gets or Sets PackageExporterEndpoints
    /// </summary>
    [DataMember(Name="packageExporter.endpoints", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "packageExporter.endpoints")]
    public ConfigNodePropertyArray PackageExporterEndpoints { get; set; }

    /// <summary>
    /// Gets or Sets PackageImporterEndpoints
    /// </summary>
    [DataMember(Name="packageImporter.endpoints", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "packageImporter.endpoints")]
    public ConfigNodePropertyArray PackageImporterEndpoints { get; set; }

    /// <summary>
    /// Gets or Sets RetryStrategy
    /// </summary>
    [DataMember(Name="retry.strategy", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "retry.strategy")]
    public ConfigNodePropertyDropDown RetryStrategy { get; set; }

    /// <summary>
    /// Gets or Sets RetryAttempts
    /// </summary>
    [DataMember(Name="retry.attempts", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "retry.attempts")]
    public ConfigNodePropertyInteger RetryAttempts { get; set; }

    /// <summary>
    /// Gets or Sets PullItems
    /// </summary>
    [DataMember(Name="pull.items", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pull.items")]
    public ConfigNodePropertyInteger PullItems { get; set; }

    /// <summary>
    /// Gets or Sets HttpConnTimeout
    /// </summary>
    [DataMember(Name="http.conn.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http.conn.timeout")]
    public ConfigNodePropertyInteger HttpConnTimeout { get; set; }

    /// <summary>
    /// Gets or Sets RequestAuthorizationStrategyTarget
    /// </summary>
    [DataMember(Name="requestAuthorizationStrategy.target", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "requestAuthorizationStrategy.target")]
    public ConfigNodePropertyString RequestAuthorizationStrategyTarget { get; set; }

    /// <summary>
    /// Gets or Sets TransportSecretProviderTarget
    /// </summary>
    [DataMember(Name="transportSecretProvider.target", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "transportSecretProvider.target")]
    public ConfigNodePropertyString TransportSecretProviderTarget { get; set; }

    /// <summary>
    /// Gets or Sets PackageBuilderTarget
    /// </summary>
    [DataMember(Name="packageBuilder.target", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "packageBuilder.target")]
    public ConfigNodePropertyString PackageBuilderTarget { get; set; }

    /// <summary>
    /// Gets or Sets TriggersTarget
    /// </summary>
    [DataMember(Name="triggers.target", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "triggers.target")]
    public ConfigNodePropertyString TriggersTarget { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Title: ").Append(Title).Append("\n");
      sb.Append("  Details: ").Append(Details).Append("\n");
      sb.Append("  Enabled: ").Append(Enabled).Append("\n");
      sb.Append("  ServiceName: ").Append(ServiceName).Append("\n");
      sb.Append("  LogLevel: ").Append(LogLevel).Append("\n");
      sb.Append("  QueueProcessingEnabled: ").Append(QueueProcessingEnabled).Append("\n");
      sb.Append("  PassiveQueues: ").Append(PassiveQueues).Append("\n");
      sb.Append("  PackageExporterEndpoints: ").Append(PackageExporterEndpoints).Append("\n");
      sb.Append("  PackageImporterEndpoints: ").Append(PackageImporterEndpoints).Append("\n");
      sb.Append("  RetryStrategy: ").Append(RetryStrategy).Append("\n");
      sb.Append("  RetryAttempts: ").Append(RetryAttempts).Append("\n");
      sb.Append("  PullItems: ").Append(PullItems).Append("\n");
      sb.Append("  HttpConnTimeout: ").Append(HttpConnTimeout).Append("\n");
      sb.Append("  RequestAuthorizationStrategyTarget: ").Append(RequestAuthorizationStrategyTarget).Append("\n");
      sb.Append("  TransportSecretProviderTarget: ").Append(TransportSecretProviderTarget).Append("\n");
      sb.Append("  PackageBuilderTarget: ").Append(PackageBuilderTarget).Append("\n");
      sb.Append("  TriggersTarget: ").Append(TriggersTarget).Append("\n");
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
