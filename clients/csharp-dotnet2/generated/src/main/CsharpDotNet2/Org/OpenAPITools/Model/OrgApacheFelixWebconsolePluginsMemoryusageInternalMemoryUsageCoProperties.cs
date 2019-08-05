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
  public class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties {
    /// <summary>
    /// Gets or Sets FelixMemoryusageDumpThreshold
    /// </summary>
    [DataMember(Name="felix.memoryusage.dump.threshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "felix.memoryusage.dump.threshold")]
    public ConfigNodePropertyInteger FelixMemoryusageDumpThreshold { get; set; }

    /// <summary>
    /// Gets or Sets FelixMemoryusageDumpInterval
    /// </summary>
    [DataMember(Name="felix.memoryusage.dump.interval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "felix.memoryusage.dump.interval")]
    public ConfigNodePropertyInteger FelixMemoryusageDumpInterval { get; set; }

    /// <summary>
    /// Gets or Sets FelixMemoryusageDumpLocation
    /// </summary>
    [DataMember(Name="felix.memoryusage.dump.location", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "felix.memoryusage.dump.location")]
    public ConfigNodePropertyString FelixMemoryusageDumpLocation { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties {\n");
      sb.Append("  FelixMemoryusageDumpThreshold: ").Append(FelixMemoryusageDumpThreshold).Append("\n");
      sb.Append("  FelixMemoryusageDumpInterval: ").Append(FelixMemoryusageDumpInterval).Append("\n");
      sb.Append("  FelixMemoryusageDumpLocation: ").Append(FelixMemoryusageDumpLocation).Append("\n");
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
