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
  public class ComDayCqDamCoreImplServletHealthCheckServletProperties {
    /// <summary>
    /// Gets or Sets CqDamSyncWorkflowId
    /// </summary>
    [DataMember(Name="cq.dam.sync.workflow.id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.sync.workflow.id")]
    public ConfigNodePropertyString CqDamSyncWorkflowId { get; set; }

    /// <summary>
    /// Gets or Sets CqDamSyncFolderTypes
    /// </summary>
    [DataMember(Name="cq.dam.sync.folder.types", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.sync.folder.types")]
    public ConfigNodePropertyArray CqDamSyncFolderTypes { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplServletHealthCheckServletProperties {\n");
      sb.Append("  CqDamSyncWorkflowId: ").Append(CqDamSyncWorkflowId).Append("\n");
      sb.Append("  CqDamSyncFolderTypes: ").Append(CqDamSyncFolderTypes).Append("\n");
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
