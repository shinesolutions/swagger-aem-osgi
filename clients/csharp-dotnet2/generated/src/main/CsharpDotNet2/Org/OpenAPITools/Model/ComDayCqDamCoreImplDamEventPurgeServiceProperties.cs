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
  public class ComDayCqDamCoreImplDamEventPurgeServiceProperties {
    /// <summary>
    /// Gets or Sets SchedulerExpression
    /// </summary>
    [DataMember(Name="scheduler.expression", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduler.expression")]
    public ConfigNodePropertyString SchedulerExpression { get; set; }

    /// <summary>
    /// Gets or Sets MaxSavedActivities
    /// </summary>
    [DataMember(Name="maxSavedActivities", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxSavedActivities")]
    public ConfigNodePropertyInteger MaxSavedActivities { get; set; }

    /// <summary>
    /// Gets or Sets SaveInterval
    /// </summary>
    [DataMember(Name="saveInterval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "saveInterval")]
    public ConfigNodePropertyInteger SaveInterval { get; set; }

    /// <summary>
    /// Gets or Sets EnableActivityPurge
    /// </summary>
    [DataMember(Name="enableActivityPurge", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enableActivityPurge")]
    public ConfigNodePropertyBoolean EnableActivityPurge { get; set; }

    /// <summary>
    /// Gets or Sets EventTypes
    /// </summary>
    [DataMember(Name="eventTypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "eventTypes")]
    public ConfigNodePropertyDropDown EventTypes { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplDamEventPurgeServiceProperties {\n");
      sb.Append("  SchedulerExpression: ").Append(SchedulerExpression).Append("\n");
      sb.Append("  MaxSavedActivities: ").Append(MaxSavedActivities).Append("\n");
      sb.Append("  SaveInterval: ").Append(SaveInterval).Append("\n");
      sb.Append("  EnableActivityPurge: ").Append(EnableActivityPurge).Append("\n");
      sb.Append("  EventTypes: ").Append(EventTypes).Append("\n");
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
