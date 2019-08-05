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
  public class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties {
    /// <summary>
    /// Gets or Sets Enable
    /// </summary>
    [DataMember(Name="enable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enable")]
    public ConfigNodePropertyBoolean Enable { get; set; }

    /// <summary>
    /// Gets or Sets Ttl1
    /// </summary>
    [DataMember(Name="ttl1", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ttl1")]
    public ConfigNodePropertyInteger Ttl1 { get; set; }

    /// <summary>
    /// Gets or Sets Ttl2
    /// </summary>
    [DataMember(Name="ttl2", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ttl2")]
    public ConfigNodePropertyInteger Ttl2 { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties {\n");
      sb.Append("  Enable: ").Append(Enable).Append("\n");
      sb.Append("  Ttl1: ").Append(Ttl1).Append("\n");
      sb.Append("  Ttl2: ").Append(Ttl2).Append("\n");
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
