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
  public class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties {
    /// <summary>
    /// Gets or Sets Accepted
    /// </summary>
    [DataMember(Name="accepted", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accepted")]
    public ConfigNodePropertyBoolean Accepted { get; set; }

    /// <summary>
    /// Gets or Sets Ranked
    /// </summary>
    [DataMember(Name="ranked", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ranked")]
    public ConfigNodePropertyInteger Ranked { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties {\n");
      sb.Append("  Accepted: ").Append(Accepted).Append("\n");
      sb.Append("  Ranked: ").Append(Ranked).Append("\n");
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
