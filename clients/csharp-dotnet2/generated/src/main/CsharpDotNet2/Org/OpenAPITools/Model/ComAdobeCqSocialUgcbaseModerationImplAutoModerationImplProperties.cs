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
  public class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties {
    /// <summary>
    /// Gets or Sets AutomoderationSequence
    /// </summary>
    [DataMember(Name="automoderation.sequence", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "automoderation.sequence")]
    public ConfigNodePropertyArray AutomoderationSequence { get; set; }

    /// <summary>
    /// Gets or Sets AutomoderationOnfailurestop
    /// </summary>
    [DataMember(Name="automoderation.onfailurestop", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "automoderation.onfailurestop")]
    public ConfigNodePropertyBoolean AutomoderationOnfailurestop { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties {\n");
      sb.Append("  AutomoderationSequence: ").Append(AutomoderationSequence).Append("\n");
      sb.Append("  AutomoderationOnfailurestop: ").Append(AutomoderationOnfailurestop).Append("\n");
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
