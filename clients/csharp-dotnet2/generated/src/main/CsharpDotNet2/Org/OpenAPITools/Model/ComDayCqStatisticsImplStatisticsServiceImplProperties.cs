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
  public class ComDayCqStatisticsImplStatisticsServiceImplProperties {
    /// <summary>
    /// Gets or Sets SchedulerPeriod
    /// </summary>
    [DataMember(Name="scheduler.period", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduler.period")]
    public ConfigNodePropertyInteger SchedulerPeriod { get; set; }

    /// <summary>
    /// Gets or Sets SchedulerConcurrent
    /// </summary>
    [DataMember(Name="scheduler.concurrent", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduler.concurrent")]
    public ConfigNodePropertyBoolean SchedulerConcurrent { get; set; }

    /// <summary>
    /// Gets or Sets Path
    /// </summary>
    [DataMember(Name="path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "path")]
    public ConfigNodePropertyString Path { get; set; }

    /// <summary>
    /// Gets or Sets Workspace
    /// </summary>
    [DataMember(Name="workspace", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "workspace")]
    public ConfigNodePropertyString Workspace { get; set; }

    /// <summary>
    /// Gets or Sets KeywordsPath
    /// </summary>
    [DataMember(Name="keywordsPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "keywordsPath")]
    public ConfigNodePropertyString KeywordsPath { get; set; }

    /// <summary>
    /// Gets or Sets AsyncEntries
    /// </summary>
    [DataMember(Name="asyncEntries", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "asyncEntries")]
    public ConfigNodePropertyBoolean AsyncEntries { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqStatisticsImplStatisticsServiceImplProperties {\n");
      sb.Append("  SchedulerPeriod: ").Append(SchedulerPeriod).Append("\n");
      sb.Append("  SchedulerConcurrent: ").Append(SchedulerConcurrent).Append("\n");
      sb.Append("  Path: ").Append(Path).Append("\n");
      sb.Append("  Workspace: ").Append(Workspace).Append("\n");
      sb.Append("  KeywordsPath: ").Append(KeywordsPath).Append("\n");
      sb.Append("  AsyncEntries: ").Append(AsyncEntries).Append("\n");
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
