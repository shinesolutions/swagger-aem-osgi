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
  public class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties {
    /// <summary>
    /// Gets or Sets Enabled
    /// </summary>
    [DataMember(Name="enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enabled")]
    public ConfigNodePropertyBoolean Enabled { get; set; }

    /// <summary>
    /// Gets or Sets DisabledForGroups
    /// </summary>
    [DataMember(Name="disabledForGroups", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disabledForGroups")]
    public ConfigNodePropertyArray DisabledForGroups { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties {\n");
      sb.Append("  Enabled: ").Append(Enabled).Append("\n");
      sb.Append("  DisabledForGroups: ").Append(DisabledForGroups).Append("\n");
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
