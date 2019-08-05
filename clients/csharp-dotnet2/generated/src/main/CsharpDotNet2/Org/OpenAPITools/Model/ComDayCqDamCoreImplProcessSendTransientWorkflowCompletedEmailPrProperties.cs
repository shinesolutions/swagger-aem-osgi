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
  public class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties {
    /// <summary>
    /// Gets or Sets ProcessLabel
    /// </summary>
    [DataMember(Name="process.label", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "process.label")]
    public ConfigNodePropertyString ProcessLabel { get; set; }

    /// <summary>
    /// Gets or Sets NotifyOnComplete
    /// </summary>
    [DataMember(Name="Notify on Complete", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "Notify on Complete")]
    public ConfigNodePropertyBoolean NotifyOnComplete { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties {\n");
      sb.Append("  ProcessLabel: ").Append(ProcessLabel).Append("\n");
      sb.Append("  NotifyOnComplete: ").Append(NotifyOnComplete).Append("\n");
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
