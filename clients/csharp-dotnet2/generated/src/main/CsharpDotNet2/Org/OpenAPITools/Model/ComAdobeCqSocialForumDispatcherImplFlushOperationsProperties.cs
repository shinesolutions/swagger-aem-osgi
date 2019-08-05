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
  public class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties {
    /// <summary>
    /// Gets or Sets ExtensionOrder
    /// </summary>
    [DataMember(Name="extension.order", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "extension.order")]
    public ConfigNodePropertyInteger ExtensionOrder { get; set; }

    /// <summary>
    /// Gets or Sets FlushForumontopic
    /// </summary>
    [DataMember(Name="flush.forumontopic", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "flush.forumontopic")]
    public ConfigNodePropertyBoolean FlushForumontopic { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties {\n");
      sb.Append("  ExtensionOrder: ").Append(ExtensionOrder).Append("\n");
      sb.Append("  FlushForumontopic: ").Append(FlushForumontopic).Append("\n");
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
