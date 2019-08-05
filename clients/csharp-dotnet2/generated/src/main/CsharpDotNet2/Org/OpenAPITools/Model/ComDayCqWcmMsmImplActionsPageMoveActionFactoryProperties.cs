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
  public class ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties {
    /// <summary>
    /// Gets or Sets CqWcmMsmActionExcludednodetypes
    /// </summary>
    [DataMember(Name="cq.wcm.msm.action.excludednodetypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.wcm.msm.action.excludednodetypes")]
    public ConfigNodePropertyArray CqWcmMsmActionExcludednodetypes { get; set; }

    /// <summary>
    /// Gets or Sets CqWcmMsmActionExcludedparagraphitems
    /// </summary>
    [DataMember(Name="cq.wcm.msm.action.excludedparagraphitems", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.wcm.msm.action.excludedparagraphitems")]
    public ConfigNodePropertyArray CqWcmMsmActionExcludedparagraphitems { get; set; }

    /// <summary>
    /// Gets or Sets CqWcmMsmActionExcludedprops
    /// </summary>
    [DataMember(Name="cq.wcm.msm.action.excludedprops", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.wcm.msm.action.excludedprops")]
    public ConfigNodePropertyArray CqWcmMsmActionExcludedprops { get; set; }

    /// <summary>
    /// Gets or Sets CqWcmMsmImplActionsPagemovePropReferenceUpdate
    /// </summary>
    [DataMember(Name="cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate")]
    public ConfigNodePropertyBoolean CqWcmMsmImplActionsPagemovePropReferenceUpdate { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties {\n");
      sb.Append("  CqWcmMsmActionExcludednodetypes: ").Append(CqWcmMsmActionExcludednodetypes).Append("\n");
      sb.Append("  CqWcmMsmActionExcludedparagraphitems: ").Append(CqWcmMsmActionExcludedparagraphitems).Append("\n");
      sb.Append("  CqWcmMsmActionExcludedprops: ").Append(CqWcmMsmActionExcludedprops).Append("\n");
      sb.Append("  CqWcmMsmImplActionsPagemovePropReferenceUpdate: ").Append(CqWcmMsmImplActionsPagemovePropReferenceUpdate).Append("\n");
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
