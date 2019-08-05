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
  public class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties {
    /// <summary>
    /// Gets or Sets EnableTokenCleanupTask
    /// </summary>
    [DataMember(Name="enable.token.cleanup.task", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enable.token.cleanup.task")]
    public ConfigNodePropertyBoolean EnableTokenCleanupTask { get; set; }

    /// <summary>
    /// Gets or Sets SchedulerExpression
    /// </summary>
    [DataMember(Name="scheduler.expression", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduler.expression")]
    public ConfigNodePropertyString SchedulerExpression { get; set; }

    /// <summary>
    /// Gets or Sets BatchSize
    /// </summary>
    [DataMember(Name="batch.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "batch.size")]
    public ConfigNodePropertyInteger BatchSize { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties {\n");
      sb.Append("  EnableTokenCleanupTask: ").Append(EnableTokenCleanupTask).Append("\n");
      sb.Append("  SchedulerExpression: ").Append(SchedulerExpression).Append("\n");
      sb.Append("  BatchSize: ").Append(BatchSize).Append("\n");
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
