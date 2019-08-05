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
  public class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties {
    /// <summary>
    /// Gets or Sets EventFilter
    /// </summary>
    [DataMember(Name="event.filter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "event.filter")]
    public ConfigNodePropertyString EventFilter { get; set; }

    /// <summary>
    /// Gets or Sets MinThreadPoolSize
    /// </summary>
    [DataMember(Name="minThreadPoolSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "minThreadPoolSize")]
    public ConfigNodePropertyInteger MinThreadPoolSize { get; set; }

    /// <summary>
    /// Gets or Sets MaxThreadPoolSize
    /// </summary>
    [DataMember(Name="maxThreadPoolSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxThreadPoolSize")]
    public ConfigNodePropertyInteger MaxThreadPoolSize { get; set; }

    /// <summary>
    /// Gets or Sets CqWcmWorkflowTerminateOnActivate
    /// </summary>
    [DataMember(Name="cq.wcm.workflow.terminate.on.activate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.wcm.workflow.terminate.on.activate")]
    public ConfigNodePropertyBoolean CqWcmWorkflowTerminateOnActivate { get; set; }

    /// <summary>
    /// Gets or Sets CqWcmWorklfowTerminateExclusionList
    /// </summary>
    [DataMember(Name="cq.wcm.worklfow.terminate.exclusion.list", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.wcm.worklfow.terminate.exclusion.list")]
    public ConfigNodePropertyArray CqWcmWorklfowTerminateExclusionList { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties {\n");
      sb.Append("  EventFilter: ").Append(EventFilter).Append("\n");
      sb.Append("  MinThreadPoolSize: ").Append(MinThreadPoolSize).Append("\n");
      sb.Append("  MaxThreadPoolSize: ").Append(MaxThreadPoolSize).Append("\n");
      sb.Append("  CqWcmWorkflowTerminateOnActivate: ").Append(CqWcmWorkflowTerminateOnActivate).Append("\n");
      sb.Append("  CqWcmWorklfowTerminateExclusionList: ").Append(CqWcmWorklfowTerminateExclusionList).Append("\n");
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
