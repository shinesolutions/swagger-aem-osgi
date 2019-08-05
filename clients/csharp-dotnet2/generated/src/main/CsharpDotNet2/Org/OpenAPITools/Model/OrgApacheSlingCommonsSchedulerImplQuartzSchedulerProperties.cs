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
  public class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties {
    /// <summary>
    /// Gets or Sets PoolName
    /// </summary>
    [DataMember(Name="poolName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "poolName")]
    public ConfigNodePropertyString PoolName { get; set; }

    /// <summary>
    /// Gets or Sets AllowedPoolNames
    /// </summary>
    [DataMember(Name="allowedPoolNames", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "allowedPoolNames")]
    public ConfigNodePropertyArray AllowedPoolNames { get; set; }

    /// <summary>
    /// Gets or Sets SchedulerUseleaderforsingle
    /// </summary>
    [DataMember(Name="scheduler.useleaderforsingle", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduler.useleaderforsingle")]
    public ConfigNodePropertyBoolean SchedulerUseleaderforsingle { get; set; }

    /// <summary>
    /// Gets or Sets MetricsFilters
    /// </summary>
    [DataMember(Name="metrics.filters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "metrics.filters")]
    public ConfigNodePropertyArray MetricsFilters { get; set; }

    /// <summary>
    /// Gets or Sets SlowThresholdMillis
    /// </summary>
    [DataMember(Name="slowThresholdMillis", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "slowThresholdMillis")]
    public ConfigNodePropertyInteger SlowThresholdMillis { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties {\n");
      sb.Append("  PoolName: ").Append(PoolName).Append("\n");
      sb.Append("  AllowedPoolNames: ").Append(AllowedPoolNames).Append("\n");
      sb.Append("  SchedulerUseleaderforsingle: ").Append(SchedulerUseleaderforsingle).Append("\n");
      sb.Append("  MetricsFilters: ").Append(MetricsFilters).Append("\n");
      sb.Append("  SlowThresholdMillis: ").Append(SlowThresholdMillis).Append("\n");
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
