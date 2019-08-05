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
  public class ComDayCqDamCoreImplReportsReportPurgeServiceProperties {
    /// <summary>
    /// Gets or Sets SchedulerExpression
    /// </summary>
    [DataMember(Name="scheduler.expression", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduler.expression")]
    public ConfigNodePropertyString SchedulerExpression { get; set; }

    /// <summary>
    /// Gets or Sets MaxSavedReports
    /// </summary>
    [DataMember(Name="maxSavedReports", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxSavedReports")]
    public ConfigNodePropertyInteger MaxSavedReports { get; set; }

    /// <summary>
    /// Gets or Sets TimeDuration
    /// </summary>
    [DataMember(Name="timeDuration", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timeDuration")]
    public ConfigNodePropertyInteger TimeDuration { get; set; }

    /// <summary>
    /// Gets or Sets EnableReportPurge
    /// </summary>
    [DataMember(Name="enableReportPurge", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enableReportPurge")]
    public ConfigNodePropertyBoolean EnableReportPurge { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplReportsReportPurgeServiceProperties {\n");
      sb.Append("  SchedulerExpression: ").Append(SchedulerExpression).Append("\n");
      sb.Append("  MaxSavedReports: ").Append(MaxSavedReports).Append("\n");
      sb.Append("  TimeDuration: ").Append(TimeDuration).Append("\n");
      sb.Append("  EnableReportPurge: ").Append(EnableReportPurge).Append("\n");
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
