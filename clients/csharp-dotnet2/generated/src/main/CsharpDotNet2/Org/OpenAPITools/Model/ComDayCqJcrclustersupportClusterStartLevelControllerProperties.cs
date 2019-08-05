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
  public class ComDayCqJcrclustersupportClusterStartLevelControllerProperties {
    /// <summary>
    /// Gets or Sets ClusterLevelEnable
    /// </summary>
    [DataMember(Name="cluster.level.enable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.level.enable")]
    public ConfigNodePropertyBoolean ClusterLevelEnable { get; set; }

    /// <summary>
    /// Gets or Sets ClusterMasterLevel
    /// </summary>
    [DataMember(Name="cluster.master.level", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.master.level")]
    public ConfigNodePropertyInteger ClusterMasterLevel { get; set; }

    /// <summary>
    /// Gets or Sets ClusterSlaveLevel
    /// </summary>
    [DataMember(Name="cluster.slave.level", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cluster.slave.level")]
    public ConfigNodePropertyInteger ClusterSlaveLevel { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqJcrclustersupportClusterStartLevelControllerProperties {\n");
      sb.Append("  ClusterLevelEnable: ").Append(ClusterLevelEnable).Append("\n");
      sb.Append("  ClusterMasterLevel: ").Append(ClusterMasterLevel).Append("\n");
      sb.Append("  ClusterSlaveLevel: ").Append(ClusterSlaveLevel).Append("\n");
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
