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
  public class ComAdobeFormsCommonServletTempCleanUpTaskProperties {
    /// <summary>
    /// Gets or Sets SchedulerExpression
    /// </summary>
    [DataMember(Name="scheduler.expression", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduler.expression")]
    public ConfigNodePropertyString SchedulerExpression { get; set; }

    /// <summary>
    /// Gets or Sets DurationForTemporaryStorage
    /// </summary>
    [DataMember(Name="Duration for Temporary Storage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Duration for Temporary Storage")]
    public ConfigNodePropertyString DurationForTemporaryStorage { get; set; }

    /// <summary>
    /// Gets or Sets DurationForAnonymousStorage
    /// </summary>
    [DataMember(Name="Duration for Anonymous Storage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Duration for Anonymous Storage")]
    public ConfigNodePropertyString DurationForAnonymousStorage { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeFormsCommonServletTempCleanUpTaskProperties {\n");
      sb.Append("  SchedulerExpression: ").Append(SchedulerExpression).Append("\n");
      sb.Append("  DurationForTemporaryStorage: ").Append(DurationForTemporaryStorage).Append("\n");
      sb.Append("  DurationForAnonymousStorage: ").Append(DurationForAnonymousStorage).Append("\n");
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
