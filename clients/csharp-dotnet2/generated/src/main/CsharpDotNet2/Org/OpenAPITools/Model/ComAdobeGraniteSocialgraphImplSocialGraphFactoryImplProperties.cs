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
  public class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties {
    /// <summary>
    /// Gets or Sets Group2memberRelationshipOutgoing
    /// </summary>
    [DataMember(Name="group2member.relationship.outgoing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group2member.relationship.outgoing")]
    public ConfigNodePropertyString Group2memberRelationshipOutgoing { get; set; }

    /// <summary>
    /// Gets or Sets Group2memberExcludedOutgoing
    /// </summary>
    [DataMember(Name="group2member.excluded.outgoing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group2member.excluded.outgoing")]
    public ConfigNodePropertyArray Group2memberExcludedOutgoing { get; set; }

    /// <summary>
    /// Gets or Sets Group2memberRelationshipIncoming
    /// </summary>
    [DataMember(Name="group2member.relationship.incoming", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group2member.relationship.incoming")]
    public ConfigNodePropertyString Group2memberRelationshipIncoming { get; set; }

    /// <summary>
    /// Gets or Sets Group2memberExcludedIncoming
    /// </summary>
    [DataMember(Name="group2member.excluded.incoming", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group2member.excluded.incoming")]
    public ConfigNodePropertyArray Group2memberExcludedIncoming { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties {\n");
      sb.Append("  Group2memberRelationshipOutgoing: ").Append(Group2memberRelationshipOutgoing).Append("\n");
      sb.Append("  Group2memberExcludedOutgoing: ").Append(Group2memberExcludedOutgoing).Append("\n");
      sb.Append("  Group2memberRelationshipIncoming: ").Append(Group2memberRelationshipIncoming).Append("\n");
      sb.Append("  Group2memberExcludedIncoming: ").Append(Group2memberExcludedIncoming).Append("\n");
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
