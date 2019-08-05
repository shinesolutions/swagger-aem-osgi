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
  public class OrgApacheSlingDiscoveryOakConfigProperties {
    /// <summary>
    /// Gets or Sets ConnectorPingTimeout
    /// </summary>
    [DataMember(Name="connectorPingTimeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "connectorPingTimeout")]
    public ConfigNodePropertyInteger ConnectorPingTimeout { get; set; }

    /// <summary>
    /// Gets or Sets ConnectorPingInterval
    /// </summary>
    [DataMember(Name="connectorPingInterval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "connectorPingInterval")]
    public ConfigNodePropertyInteger ConnectorPingInterval { get; set; }

    /// <summary>
    /// Gets or Sets DiscoveryLiteCheckInterval
    /// </summary>
    [DataMember(Name="discoveryLiteCheckInterval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "discoveryLiteCheckInterval")]
    public ConfigNodePropertyInteger DiscoveryLiteCheckInterval { get; set; }

    /// <summary>
    /// Gets or Sets ClusterSyncServiceTimeout
    /// </summary>
    [DataMember(Name="clusterSyncServiceTimeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "clusterSyncServiceTimeout")]
    public ConfigNodePropertyInteger ClusterSyncServiceTimeout { get; set; }

    /// <summary>
    /// Gets or Sets ClusterSyncServiceInterval
    /// </summary>
    [DataMember(Name="clusterSyncServiceInterval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "clusterSyncServiceInterval")]
    public ConfigNodePropertyInteger ClusterSyncServiceInterval { get; set; }

    /// <summary>
    /// Gets or Sets EnableSyncToken
    /// </summary>
    [DataMember(Name="enableSyncToken", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enableSyncToken")]
    public ConfigNodePropertyBoolean EnableSyncToken { get; set; }

    /// <summary>
    /// Gets or Sets MinEventDelay
    /// </summary>
    [DataMember(Name="minEventDelay", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "minEventDelay")]
    public ConfigNodePropertyInteger MinEventDelay { get; set; }

    /// <summary>
    /// Gets or Sets SocketConnectTimeout
    /// </summary>
    [DataMember(Name="socketConnectTimeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "socketConnectTimeout")]
    public ConfigNodePropertyInteger SocketConnectTimeout { get; set; }

    /// <summary>
    /// Gets or Sets SoTimeout
    /// </summary>
    [DataMember(Name="soTimeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "soTimeout")]
    public ConfigNodePropertyInteger SoTimeout { get; set; }

    /// <summary>
    /// Gets or Sets TopologyConnectorUrls
    /// </summary>
    [DataMember(Name="topologyConnectorUrls", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "topologyConnectorUrls")]
    public ConfigNodePropertyArray TopologyConnectorUrls { get; set; }

    /// <summary>
    /// Gets or Sets TopologyConnectorWhitelist
    /// </summary>
    [DataMember(Name="topologyConnectorWhitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "topologyConnectorWhitelist")]
    public ConfigNodePropertyArray TopologyConnectorWhitelist { get; set; }

    /// <summary>
    /// Gets or Sets AutoStopLocalLoopEnabled
    /// </summary>
    [DataMember(Name="autoStopLocalLoopEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "autoStopLocalLoopEnabled")]
    public ConfigNodePropertyBoolean AutoStopLocalLoopEnabled { get; set; }

    /// <summary>
    /// Gets or Sets GzipConnectorRequestsEnabled
    /// </summary>
    [DataMember(Name="gzipConnectorRequestsEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "gzipConnectorRequestsEnabled")]
    public ConfigNodePropertyBoolean GzipConnectorRequestsEnabled { get; set; }

    /// <summary>
    /// Gets or Sets HmacEnabled
    /// </summary>
    [DataMember(Name="hmacEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "hmacEnabled")]
    public ConfigNodePropertyBoolean HmacEnabled { get; set; }

    /// <summary>
    /// Gets or Sets EnableEncryption
    /// </summary>
    [DataMember(Name="enableEncryption", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enableEncryption")]
    public ConfigNodePropertyBoolean EnableEncryption { get; set; }

    /// <summary>
    /// Gets or Sets SharedKey
    /// </summary>
    [DataMember(Name="sharedKey", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sharedKey")]
    public ConfigNodePropertyString SharedKey { get; set; }

    /// <summary>
    /// Gets or Sets HmacSharedKeyTTL
    /// </summary>
    [DataMember(Name="hmacSharedKeyTTL", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "hmacSharedKeyTTL")]
    public ConfigNodePropertyInteger HmacSharedKeyTTL { get; set; }

    /// <summary>
    /// Gets or Sets BackoffStandbyFactor
    /// </summary>
    [DataMember(Name="backoffStandbyFactor", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "backoffStandbyFactor")]
    public ConfigNodePropertyString BackoffStandbyFactor { get; set; }

    /// <summary>
    /// Gets or Sets BackoffStableFactor
    /// </summary>
    [DataMember(Name="backoffStableFactor", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "backoffStableFactor")]
    public ConfigNodePropertyString BackoffStableFactor { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingDiscoveryOakConfigProperties {\n");
      sb.Append("  ConnectorPingTimeout: ").Append(ConnectorPingTimeout).Append("\n");
      sb.Append("  ConnectorPingInterval: ").Append(ConnectorPingInterval).Append("\n");
      sb.Append("  DiscoveryLiteCheckInterval: ").Append(DiscoveryLiteCheckInterval).Append("\n");
      sb.Append("  ClusterSyncServiceTimeout: ").Append(ClusterSyncServiceTimeout).Append("\n");
      sb.Append("  ClusterSyncServiceInterval: ").Append(ClusterSyncServiceInterval).Append("\n");
      sb.Append("  EnableSyncToken: ").Append(EnableSyncToken).Append("\n");
      sb.Append("  MinEventDelay: ").Append(MinEventDelay).Append("\n");
      sb.Append("  SocketConnectTimeout: ").Append(SocketConnectTimeout).Append("\n");
      sb.Append("  SoTimeout: ").Append(SoTimeout).Append("\n");
      sb.Append("  TopologyConnectorUrls: ").Append(TopologyConnectorUrls).Append("\n");
      sb.Append("  TopologyConnectorWhitelist: ").Append(TopologyConnectorWhitelist).Append("\n");
      sb.Append("  AutoStopLocalLoopEnabled: ").Append(AutoStopLocalLoopEnabled).Append("\n");
      sb.Append("  GzipConnectorRequestsEnabled: ").Append(GzipConnectorRequestsEnabled).Append("\n");
      sb.Append("  HmacEnabled: ").Append(HmacEnabled).Append("\n");
      sb.Append("  EnableEncryption: ").Append(EnableEncryption).Append("\n");
      sb.Append("  SharedKey: ").Append(SharedKey).Append("\n");
      sb.Append("  HmacSharedKeyTTL: ").Append(HmacSharedKeyTTL).Append("\n");
      sb.Append("  BackoffStandbyFactor: ").Append(BackoffStandbyFactor).Append("\n");
      sb.Append("  BackoffStableFactor: ").Append(BackoffStableFactor).Append("\n");
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
