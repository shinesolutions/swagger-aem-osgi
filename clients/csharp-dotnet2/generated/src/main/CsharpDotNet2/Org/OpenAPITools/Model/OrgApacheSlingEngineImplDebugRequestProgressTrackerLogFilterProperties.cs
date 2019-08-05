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
  public class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties {
    /// <summary>
    /// Gets or Sets Extensions
    /// </summary>
    [DataMember(Name="extensions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "extensions")]
    public ConfigNodePropertyArray Extensions { get; set; }

    /// <summary>
    /// Gets or Sets MinDurationMs
    /// </summary>
    [DataMember(Name="minDurationMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "minDurationMs")]
    public ConfigNodePropertyInteger MinDurationMs { get; set; }

    /// <summary>
    /// Gets or Sets MaxDurationMs
    /// </summary>
    [DataMember(Name="maxDurationMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxDurationMs")]
    public ConfigNodePropertyInteger MaxDurationMs { get; set; }

    /// <summary>
    /// Gets or Sets CompactLogFormat
    /// </summary>
    [DataMember(Name="compactLogFormat", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "compactLogFormat")]
    public ConfigNodePropertyBoolean CompactLogFormat { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties {\n");
      sb.Append("  Extensions: ").Append(Extensions).Append("\n");
      sb.Append("  MinDurationMs: ").Append(MinDurationMs).Append("\n");
      sb.Append("  MaxDurationMs: ").Append(MaxDurationMs).Append("\n");
      sb.Append("  CompactLogFormat: ").Append(CompactLogFormat).Append("\n");
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
