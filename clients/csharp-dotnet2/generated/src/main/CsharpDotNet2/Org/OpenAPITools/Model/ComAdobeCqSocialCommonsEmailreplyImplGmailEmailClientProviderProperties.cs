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
  public class ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties {
    /// <summary>
    /// Gets or Sets PriorityOrder
    /// </summary>
    [DataMember(Name="priorityOrder", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "priorityOrder")]
    public ConfigNodePropertyInteger PriorityOrder { get; set; }

    /// <summary>
    /// Gets or Sets ReplyEmailPatterns
    /// </summary>
    [DataMember(Name="replyEmailPatterns", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "replyEmailPatterns")]
    public ConfigNodePropertyArray ReplyEmailPatterns { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties {\n");
      sb.Append("  PriorityOrder: ").Append(PriorityOrder).Append("\n");
      sb.Append("  ReplyEmailPatterns: ").Append(ReplyEmailPatterns).Append("\n");
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
