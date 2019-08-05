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
  public class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties {
    /// <summary>
    /// Gets or Sets Enable
    /// </summary>
    [DataMember(Name="enable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enable")]
    public ConfigNodePropertyBoolean Enable { get; set; }

    /// <summary>
    /// Gets or Sets UGCLimit
    /// </summary>
    [DataMember(Name="UGCLimit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "UGCLimit")]
    public ConfigNodePropertyInteger UGCLimit { get; set; }

    /// <summary>
    /// Gets or Sets UgcLimitDuration
    /// </summary>
    [DataMember(Name="ugcLimitDuration", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ugcLimitDuration")]
    public ConfigNodePropertyInteger UgcLimitDuration { get; set; }

    /// <summary>
    /// Gets or Sets Domains
    /// </summary>
    [DataMember(Name="domains", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "domains")]
    public ConfigNodePropertyArray Domains { get; set; }

    /// <summary>
    /// Gets or Sets ToList
    /// </summary>
    [DataMember(Name="toList", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "toList")]
    public ConfigNodePropertyArray ToList { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties {\n");
      sb.Append("  Enable: ").Append(Enable).Append("\n");
      sb.Append("  UGCLimit: ").Append(UGCLimit).Append("\n");
      sb.Append("  UgcLimitDuration: ").Append(UgcLimitDuration).Append("\n");
      sb.Append("  Domains: ").Append(Domains).Append("\n");
      sb.Append("  ToList: ").Append(ToList).Append("\n");
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
