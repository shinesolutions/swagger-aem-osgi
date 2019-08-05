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
  public class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties {
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
    /// Gets or Sets GoodLinkTestInterval
    /// </summary>
    [DataMember(Name="good_link_test_interval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "good_link_test_interval")]
    public ConfigNodePropertyInteger GoodLinkTestInterval { get; set; }

    /// <summary>
    /// Gets or Sets BadLinkTestInterval
    /// </summary>
    [DataMember(Name="bad_link_test_interval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "bad_link_test_interval")]
    public ConfigNodePropertyInteger BadLinkTestInterval { get; set; }

    /// <summary>
    /// Gets or Sets LinkUnusedInterval
    /// </summary>
    [DataMember(Name="link_unused_interval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "link_unused_interval")]
    public ConfigNodePropertyInteger LinkUnusedInterval { get; set; }

    /// <summary>
    /// Gets or Sets ConnectionTimeout
    /// </summary>
    [DataMember(Name="connection.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "connection.timeout")]
    public ConfigNodePropertyInteger ConnectionTimeout { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties {\n");
      sb.Append("  SchedulerPeriod: ").Append(SchedulerPeriod).Append("\n");
      sb.Append("  SchedulerConcurrent: ").Append(SchedulerConcurrent).Append("\n");
      sb.Append("  GoodLinkTestInterval: ").Append(GoodLinkTestInterval).Append("\n");
      sb.Append("  BadLinkTestInterval: ").Append(BadLinkTestInterval).Append("\n");
      sb.Append("  LinkUnusedInterval: ").Append(LinkUnusedInterval).Append("\n");
      sb.Append("  ConnectionTimeout: ").Append(ConnectionTimeout).Append("\n");
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
