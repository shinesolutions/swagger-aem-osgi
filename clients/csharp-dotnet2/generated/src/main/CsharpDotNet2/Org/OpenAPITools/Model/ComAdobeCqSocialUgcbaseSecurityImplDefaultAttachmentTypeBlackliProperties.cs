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
  public class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties {
    /// <summary>
    /// Gets or Sets DefaultAttachmentTypeBlacklist
    /// </summary>
    [DataMember(Name="default.attachment.type.blacklist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default.attachment.type.blacklist")]
    public ConfigNodePropertyArray DefaultAttachmentTypeBlacklist { get; set; }

    /// <summary>
    /// Gets or Sets BaselineAttachmentTypeBlacklist
    /// </summary>
    [DataMember(Name="baseline.attachment.type.blacklist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "baseline.attachment.type.blacklist")]
    public ConfigNodePropertyArray BaselineAttachmentTypeBlacklist { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties {\n");
      sb.Append("  DefaultAttachmentTypeBlacklist: ").Append(DefaultAttachmentTypeBlacklist).Append("\n");
      sb.Append("  BaselineAttachmentTypeBlacklist: ").Append(BaselineAttachmentTypeBlacklist).Append("\n");
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
