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
  public class OrgApacheSlingTracerInternalLogTracerProperties {
    /// <summary>
    /// Gets or Sets TracerSets
    /// </summary>
    [DataMember(Name="tracerSets", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tracerSets")]
    public ConfigNodePropertyArray TracerSets { get; set; }

    /// <summary>
    /// Gets or Sets Enabled
    /// </summary>
    [DataMember(Name="enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enabled")]
    public ConfigNodePropertyBoolean Enabled { get; set; }

    /// <summary>
    /// Gets or Sets ServletEnabled
    /// </summary>
    [DataMember(Name="servletEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "servletEnabled")]
    public ConfigNodePropertyBoolean ServletEnabled { get; set; }

    /// <summary>
    /// Gets or Sets RecordingCacheSizeInMB
    /// </summary>
    [DataMember(Name="recordingCacheSizeInMB", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "recordingCacheSizeInMB")]
    public ConfigNodePropertyInteger RecordingCacheSizeInMB { get; set; }

    /// <summary>
    /// Gets or Sets RecordingCacheDurationInSecs
    /// </summary>
    [DataMember(Name="recordingCacheDurationInSecs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "recordingCacheDurationInSecs")]
    public ConfigNodePropertyInteger RecordingCacheDurationInSecs { get; set; }

    /// <summary>
    /// Gets or Sets RecordingCompressionEnabled
    /// </summary>
    [DataMember(Name="recordingCompressionEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "recordingCompressionEnabled")]
    public ConfigNodePropertyBoolean RecordingCompressionEnabled { get; set; }

    /// <summary>
    /// Gets or Sets GzipResponse
    /// </summary>
    [DataMember(Name="gzipResponse", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "gzipResponse")]
    public ConfigNodePropertyBoolean GzipResponse { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingTracerInternalLogTracerProperties {\n");
      sb.Append("  TracerSets: ").Append(TracerSets).Append("\n");
      sb.Append("  Enabled: ").Append(Enabled).Append("\n");
      sb.Append("  ServletEnabled: ").Append(ServletEnabled).Append("\n");
      sb.Append("  RecordingCacheSizeInMB: ").Append(RecordingCacheSizeInMB).Append("\n");
      sb.Append("  RecordingCacheDurationInSecs: ").Append(RecordingCacheDurationInSecs).Append("\n");
      sb.Append("  RecordingCompressionEnabled: ").Append(RecordingCompressionEnabled).Append("\n");
      sb.Append("  GzipResponse: ").Append(GzipResponse).Append("\n");
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
