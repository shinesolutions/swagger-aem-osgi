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
  public class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties {
    /// <summary>
    /// Gets or Sets GraniteWorkflowWorkflowPublishEventServiceEnabled
    /// </summary>
    [DataMember(Name="granite.workflow.WorkflowPublishEventService.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granite.workflow.WorkflowPublishEventService.enabled")]
    public ConfigNodePropertyBoolean GraniteWorkflowWorkflowPublishEventServiceEnabled { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties {\n");
      sb.Append("  GraniteWorkflowWorkflowPublishEventServiceEnabled: ").Append(GraniteWorkflowWorkflowPublishEventServiceEnabled).Append("\n");
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
