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
  public class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties {
    /// <summary>
    /// Gets or Sets DefaultTransportAgentToWorkerPrefix
    /// </summary>
    [DataMember(Name="default.transport.agent-to-worker.prefix", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default.transport.agent-to-worker.prefix")]
    public ConfigNodePropertyString DefaultTransportAgentToWorkerPrefix { get; set; }

    /// <summary>
    /// Gets or Sets DefaultTransportAgentToMasterPrefix
    /// </summary>
    [DataMember(Name="default.transport.agent-to-master.prefix", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default.transport.agent-to-master.prefix")]
    public ConfigNodePropertyString DefaultTransportAgentToMasterPrefix { get; set; }

    /// <summary>
    /// Gets or Sets DefaultTransportInputPackage
    /// </summary>
    [DataMember(Name="default.transport.input.package", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default.transport.input.package")]
    public ConfigNodePropertyString DefaultTransportInputPackage { get; set; }

    /// <summary>
    /// Gets or Sets DefaultTransportOutputPackage
    /// </summary>
    [DataMember(Name="default.transport.output.package", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default.transport.output.package")]
    public ConfigNodePropertyString DefaultTransportOutputPackage { get; set; }

    /// <summary>
    /// Gets or Sets DefaultTransportReplicationSynchronous
    /// </summary>
    [DataMember(Name="default.transport.replication.synchronous", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default.transport.replication.synchronous")]
    public ConfigNodePropertyBoolean DefaultTransportReplicationSynchronous { get; set; }

    /// <summary>
    /// Gets or Sets DefaultTransportContentpackage
    /// </summary>
    [DataMember(Name="default.transport.contentpackage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default.transport.contentpackage")]
    public ConfigNodePropertyBoolean DefaultTransportContentpackage { get; set; }

    /// <summary>
    /// Gets or Sets OffloadingTransporterDefaultEnabled
    /// </summary>
    [DataMember(Name="offloading.transporter.default.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "offloading.transporter.default.enabled")]
    public ConfigNodePropertyBoolean OffloadingTransporterDefaultEnabled { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties {\n");
      sb.Append("  DefaultTransportAgentToWorkerPrefix: ").Append(DefaultTransportAgentToWorkerPrefix).Append("\n");
      sb.Append("  DefaultTransportAgentToMasterPrefix: ").Append(DefaultTransportAgentToMasterPrefix).Append("\n");
      sb.Append("  DefaultTransportInputPackage: ").Append(DefaultTransportInputPackage).Append("\n");
      sb.Append("  DefaultTransportOutputPackage: ").Append(DefaultTransportOutputPackage).Append("\n");
      sb.Append("  DefaultTransportReplicationSynchronous: ").Append(DefaultTransportReplicationSynchronous).Append("\n");
      sb.Append("  DefaultTransportContentpackage: ").Append(DefaultTransportContentpackage).Append("\n");
      sb.Append("  OffloadingTransporterDefaultEnabled: ").Append(OffloadingTransporterDefaultEnabled).Append("\n");
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
