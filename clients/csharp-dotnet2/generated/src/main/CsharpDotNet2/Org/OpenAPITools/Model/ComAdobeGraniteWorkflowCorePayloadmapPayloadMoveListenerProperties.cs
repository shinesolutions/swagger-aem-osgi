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
  public class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties {
    /// <summary>
    /// Gets or Sets PayloadMoveWhiteList
    /// </summary>
    [DataMember(Name="payload.move.white.list", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "payload.move.white.list")]
    public ConfigNodePropertyArray PayloadMoveWhiteList { get; set; }

    /// <summary>
    /// Gets or Sets PayloadMoveHandleFromWorkflowProcess
    /// </summary>
    [DataMember(Name="payload.move.handle.from.workflow.process", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "payload.move.handle.from.workflow.process")]
    public ConfigNodePropertyBoolean PayloadMoveHandleFromWorkflowProcess { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties {\n");
      sb.Append("  PayloadMoveWhiteList: ").Append(PayloadMoveWhiteList).Append("\n");
      sb.Append("  PayloadMoveHandleFromWorkflowProcess: ").Append(PayloadMoveHandleFromWorkflowProcess).Append("\n");
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
