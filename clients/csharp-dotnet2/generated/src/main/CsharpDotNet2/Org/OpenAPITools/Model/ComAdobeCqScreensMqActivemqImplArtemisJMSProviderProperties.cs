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
  public class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties {
    /// <summary>
    /// Gets or Sets ServiceRanking
    /// </summary>
    [DataMember(Name="service.ranking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.ranking")]
    public ConfigNodePropertyInteger ServiceRanking { get; set; }

    /// <summary>
    /// Gets or Sets GlobalSize
    /// </summary>
    [DataMember(Name="global.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "global.size")]
    public ConfigNodePropertyInteger GlobalSize { get; set; }

    /// <summary>
    /// Gets or Sets MaxDiskUsage
    /// </summary>
    [DataMember(Name="max.disk.usage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "max.disk.usage")]
    public ConfigNodePropertyInteger MaxDiskUsage { get; set; }

    /// <summary>
    /// Gets or Sets PersistenceEnabled
    /// </summary>
    [DataMember(Name="persistence.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "persistence.enabled")]
    public ConfigNodePropertyBoolean PersistenceEnabled { get; set; }

    /// <summary>
    /// Gets or Sets ThreadPoolMaxSize
    /// </summary>
    [DataMember(Name="thread.pool.max.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "thread.pool.max.size")]
    public ConfigNodePropertyInteger ThreadPoolMaxSize { get; set; }

    /// <summary>
    /// Gets or Sets ScheduledThreadPoolMaxSize
    /// </summary>
    [DataMember(Name="scheduled.thread.pool.max.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduled.thread.pool.max.size")]
    public ConfigNodePropertyInteger ScheduledThreadPoolMaxSize { get; set; }

    /// <summary>
    /// Gets or Sets GracefulShutdownTimeout
    /// </summary>
    [DataMember(Name="graceful.shutdown.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "graceful.shutdown.timeout")]
    public ConfigNodePropertyInteger GracefulShutdownTimeout { get; set; }

    /// <summary>
    /// Gets or Sets Queues
    /// </summary>
    [DataMember(Name="queues", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queues")]
    public ConfigNodePropertyArray Queues { get; set; }

    /// <summary>
    /// Gets or Sets Topics
    /// </summary>
    [DataMember(Name="topics", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "topics")]
    public ConfigNodePropertyArray Topics { get; set; }

    /// <summary>
    /// Gets or Sets AddressesMaxDeliveryAttempts
    /// </summary>
    [DataMember(Name="addresses.max.delivery.attempts", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "addresses.max.delivery.attempts")]
    public ConfigNodePropertyInteger AddressesMaxDeliveryAttempts { get; set; }

    /// <summary>
    /// Gets or Sets AddressesExpiryDelay
    /// </summary>
    [DataMember(Name="addresses.expiry.delay", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "addresses.expiry.delay")]
    public ConfigNodePropertyInteger AddressesExpiryDelay { get; set; }

    /// <summary>
    /// Gets or Sets AddressesAddressFullMessagePolicy
    /// </summary>
    [DataMember(Name="addresses.address.full.message.policy", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "addresses.address.full.message.policy")]
    public ConfigNodePropertyDropDown AddressesAddressFullMessagePolicy { get; set; }

    /// <summary>
    /// Gets or Sets AddressesMaxSizeBytes
    /// </summary>
    [DataMember(Name="addresses.max.size.bytes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "addresses.max.size.bytes")]
    public ConfigNodePropertyInteger AddressesMaxSizeBytes { get; set; }

    /// <summary>
    /// Gets or Sets AddressesPageSizeBytes
    /// </summary>
    [DataMember(Name="addresses.page.size.bytes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "addresses.page.size.bytes")]
    public ConfigNodePropertyInteger AddressesPageSizeBytes { get; set; }

    /// <summary>
    /// Gets or Sets AddressesPageCacheMaxSize
    /// </summary>
    [DataMember(Name="addresses.page.cache.max.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "addresses.page.cache.max.size")]
    public ConfigNodePropertyInteger AddressesPageCacheMaxSize { get; set; }

    /// <summary>
    /// Gets or Sets ClusterUser
    /// </summary>
    [DataMember(Name="cluster.user", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.user")]
    public ConfigNodePropertyString ClusterUser { get; set; }

    /// <summary>
    /// Gets or Sets ClusterPassword
    /// </summary>
    [DataMember(Name="cluster.password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.password")]
    public ConfigNodePropertyString ClusterPassword { get; set; }

    /// <summary>
    /// Gets or Sets ClusterCallTimeout
    /// </summary>
    [DataMember(Name="cluster.call.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.call.timeout")]
    public ConfigNodePropertyInteger ClusterCallTimeout { get; set; }

    /// <summary>
    /// Gets or Sets ClusterCallFailoverTimeout
    /// </summary>
    [DataMember(Name="cluster.call.failover.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.call.failover.timeout")]
    public ConfigNodePropertyInteger ClusterCallFailoverTimeout { get; set; }

    /// <summary>
    /// Gets or Sets ClusterClientFailureCheckPeriod
    /// </summary>
    [DataMember(Name="cluster.client.failure.check.period", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.client.failure.check.period")]
    public ConfigNodePropertyInteger ClusterClientFailureCheckPeriod { get; set; }

    /// <summary>
    /// Gets or Sets ClusterNotificationAttempts
    /// </summary>
    [DataMember(Name="cluster.notification.attempts", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.notification.attempts")]
    public ConfigNodePropertyInteger ClusterNotificationAttempts { get; set; }

    /// <summary>
    /// Gets or Sets ClusterNotificationInterval
    /// </summary>
    [DataMember(Name="cluster.notification.interval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.notification.interval")]
    public ConfigNodePropertyInteger ClusterNotificationInterval { get; set; }

    /// <summary>
    /// Gets or Sets IdCacheSize
    /// </summary>
    [DataMember(Name="id.cache.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id.cache.size")]
    public ConfigNodePropertyInteger IdCacheSize { get; set; }

    /// <summary>
    /// Gets or Sets ClusterConfirmationWindowSize
    /// </summary>
    [DataMember(Name="cluster.confirmation.window.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.confirmation.window.size")]
    public ConfigNodePropertyInteger ClusterConfirmationWindowSize { get; set; }

    /// <summary>
    /// Gets or Sets ClusterConnectionTtl
    /// </summary>
    [DataMember(Name="cluster.connection.ttl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.connection.ttl")]
    public ConfigNodePropertyInteger ClusterConnectionTtl { get; set; }

    /// <summary>
    /// Gets or Sets ClusterDuplicateDetection
    /// </summary>
    [DataMember(Name="cluster.duplicate.detection", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.duplicate.detection")]
    public ConfigNodePropertyBoolean ClusterDuplicateDetection { get; set; }

    /// <summary>
    /// Gets or Sets ClusterInitialConnectAttempts
    /// </summary>
    [DataMember(Name="cluster.initial.connect.attempts", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.initial.connect.attempts")]
    public ConfigNodePropertyInteger ClusterInitialConnectAttempts { get; set; }

    /// <summary>
    /// Gets or Sets ClusterMaxRetryInterval
    /// </summary>
    [DataMember(Name="cluster.max.retry.interval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.max.retry.interval")]
    public ConfigNodePropertyInteger ClusterMaxRetryInterval { get; set; }

    /// <summary>
    /// Gets or Sets ClusterMinLargeMessageSize
    /// </summary>
    [DataMember(Name="cluster.min.large.message.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.min.large.message.size")]
    public ConfigNodePropertyInteger ClusterMinLargeMessageSize { get; set; }

    /// <summary>
    /// Gets or Sets ClusterProducerWindowSize
    /// </summary>
    [DataMember(Name="cluster.producer.window.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.producer.window.size")]
    public ConfigNodePropertyInteger ClusterProducerWindowSize { get; set; }

    /// <summary>
    /// Gets or Sets ClusterReconnectAttempts
    /// </summary>
    [DataMember(Name="cluster.reconnect.attempts", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.reconnect.attempts")]
    public ConfigNodePropertyInteger ClusterReconnectAttempts { get; set; }

    /// <summary>
    /// Gets or Sets ClusterRetryInterval
    /// </summary>
    [DataMember(Name="cluster.retry.interval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.retry.interval")]
    public ConfigNodePropertyInteger ClusterRetryInterval { get; set; }

    /// <summary>
    /// Gets or Sets ClusterRetryIntervalMultiplier
    /// </summary>
    [DataMember(Name="cluster.retry.interval.multiplier", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.retry.interval.multiplier")]
    public ConfigNodePropertyFloat ClusterRetryIntervalMultiplier { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties {\n");
      sb.Append("  ServiceRanking: ").Append(ServiceRanking).Append("\n");
      sb.Append("  GlobalSize: ").Append(GlobalSize).Append("\n");
      sb.Append("  MaxDiskUsage: ").Append(MaxDiskUsage).Append("\n");
      sb.Append("  PersistenceEnabled: ").Append(PersistenceEnabled).Append("\n");
      sb.Append("  ThreadPoolMaxSize: ").Append(ThreadPoolMaxSize).Append("\n");
      sb.Append("  ScheduledThreadPoolMaxSize: ").Append(ScheduledThreadPoolMaxSize).Append("\n");
      sb.Append("  GracefulShutdownTimeout: ").Append(GracefulShutdownTimeout).Append("\n");
      sb.Append("  Queues: ").Append(Queues).Append("\n");
      sb.Append("  Topics: ").Append(Topics).Append("\n");
      sb.Append("  AddressesMaxDeliveryAttempts: ").Append(AddressesMaxDeliveryAttempts).Append("\n");
      sb.Append("  AddressesExpiryDelay: ").Append(AddressesExpiryDelay).Append("\n");
      sb.Append("  AddressesAddressFullMessagePolicy: ").Append(AddressesAddressFullMessagePolicy).Append("\n");
      sb.Append("  AddressesMaxSizeBytes: ").Append(AddressesMaxSizeBytes).Append("\n");
      sb.Append("  AddressesPageSizeBytes: ").Append(AddressesPageSizeBytes).Append("\n");
      sb.Append("  AddressesPageCacheMaxSize: ").Append(AddressesPageCacheMaxSize).Append("\n");
      sb.Append("  ClusterUser: ").Append(ClusterUser).Append("\n");
      sb.Append("  ClusterPassword: ").Append(ClusterPassword).Append("\n");
      sb.Append("  ClusterCallTimeout: ").Append(ClusterCallTimeout).Append("\n");
      sb.Append("  ClusterCallFailoverTimeout: ").Append(ClusterCallFailoverTimeout).Append("\n");
      sb.Append("  ClusterClientFailureCheckPeriod: ").Append(ClusterClientFailureCheckPeriod).Append("\n");
      sb.Append("  ClusterNotificationAttempts: ").Append(ClusterNotificationAttempts).Append("\n");
      sb.Append("  ClusterNotificationInterval: ").Append(ClusterNotificationInterval).Append("\n");
      sb.Append("  IdCacheSize: ").Append(IdCacheSize).Append("\n");
      sb.Append("  ClusterConfirmationWindowSize: ").Append(ClusterConfirmationWindowSize).Append("\n");
      sb.Append("  ClusterConnectionTtl: ").Append(ClusterConnectionTtl).Append("\n");
      sb.Append("  ClusterDuplicateDetection: ").Append(ClusterDuplicateDetection).Append("\n");
      sb.Append("  ClusterInitialConnectAttempts: ").Append(ClusterInitialConnectAttempts).Append("\n");
      sb.Append("  ClusterMaxRetryInterval: ").Append(ClusterMaxRetryInterval).Append("\n");
      sb.Append("  ClusterMinLargeMessageSize: ").Append(ClusterMinLargeMessageSize).Append("\n");
      sb.Append("  ClusterProducerWindowSize: ").Append(ClusterProducerWindowSize).Append("\n");
      sb.Append("  ClusterReconnectAttempts: ").Append(ClusterReconnectAttempts).Append("\n");
      sb.Append("  ClusterRetryInterval: ").Append(ClusterRetryInterval).Append("\n");
      sb.Append("  ClusterRetryIntervalMultiplier: ").Append(ClusterRetryIntervalMultiplier).Append("\n");
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
