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
  public class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties {
    /// <summary>
    /// Gets or Sets TimeoutInMs
    /// </summary>
    [DataMember(Name="timeoutInMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timeoutInMs")]
    public ConfigNodePropertyInteger TimeoutInMs { get; set; }

    /// <summary>
    /// Gets or Sets LongRunningFutureThresholdForCriticalMs
    /// </summary>
    [DataMember(Name="longRunningFutureThresholdForCriticalMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "longRunningFutureThresholdForCriticalMs")]
    public ConfigNodePropertyInteger LongRunningFutureThresholdForCriticalMs { get; set; }

    /// <summary>
    /// Gets or Sets ResultCacheTtlInMs
    /// </summary>
    [DataMember(Name="resultCacheTtlInMs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resultCacheTtlInMs")]
    public ConfigNodePropertyInteger ResultCacheTtlInMs { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties {\n");
      sb.Append("  TimeoutInMs: ").Append(TimeoutInMs).Append("\n");
      sb.Append("  LongRunningFutureThresholdForCriticalMs: ").Append(LongRunningFutureThresholdForCriticalMs).Append("\n");
      sb.Append("  ResultCacheTtlInMs: ").Append(ResultCacheTtlInMs).Append("\n");
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
