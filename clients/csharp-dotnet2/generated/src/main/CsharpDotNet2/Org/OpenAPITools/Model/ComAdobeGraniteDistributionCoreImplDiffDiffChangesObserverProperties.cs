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
  public class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties {
    /// <summary>
    /// Gets or Sets Enabled
    /// </summary>
    [DataMember(Name="enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enabled")]
    public ConfigNodePropertyBoolean Enabled { get; set; }

    /// <summary>
    /// Gets or Sets AgentName
    /// </summary>
    [DataMember(Name="agentName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "agentName")]
    public ConfigNodePropertyString AgentName { get; set; }

    /// <summary>
    /// Gets or Sets DiffPath
    /// </summary>
    [DataMember(Name="diffPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "diffPath")]
    public ConfigNodePropertyString DiffPath { get; set; }

    /// <summary>
    /// Gets or Sets ObservedPath
    /// </summary>
    [DataMember(Name="observedPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "observedPath")]
    public ConfigNodePropertyString ObservedPath { get; set; }

    /// <summary>
    /// Gets or Sets ServiceName
    /// </summary>
    [DataMember(Name="serviceName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "serviceName")]
    public ConfigNodePropertyString ServiceName { get; set; }

    /// <summary>
    /// Gets or Sets PropertyNames
    /// </summary>
    [DataMember(Name="propertyNames", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "propertyNames")]
    public ConfigNodePropertyString PropertyNames { get; set; }

    /// <summary>
    /// Gets or Sets DistributionDelay
    /// </summary>
    [DataMember(Name="distributionDelay", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "distributionDelay")]
    public ConfigNodePropertyInteger DistributionDelay { get; set; }

    /// <summary>
    /// Gets or Sets ServiceUserTarget
    /// </summary>
    [DataMember(Name="serviceUser.target", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "serviceUser.target")]
    public ConfigNodePropertyString ServiceUserTarget { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties {\n");
      sb.Append("  Enabled: ").Append(Enabled).Append("\n");
      sb.Append("  AgentName: ").Append(AgentName).Append("\n");
      sb.Append("  DiffPath: ").Append(DiffPath).Append("\n");
      sb.Append("  ObservedPath: ").Append(ObservedPath).Append("\n");
      sb.Append("  ServiceName: ").Append(ServiceName).Append("\n");
      sb.Append("  PropertyNames: ").Append(PropertyNames).Append("\n");
      sb.Append("  DistributionDelay: ").Append(DistributionDelay).Append("\n");
      sb.Append("  ServiceUserTarget: ").Append(ServiceUserTarget).Append("\n");
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
