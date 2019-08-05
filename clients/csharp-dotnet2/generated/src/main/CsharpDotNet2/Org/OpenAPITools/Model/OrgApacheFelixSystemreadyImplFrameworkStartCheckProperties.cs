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
  public class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties {
    /// <summary>
    /// Gets or Sets Timeout
    /// </summary>
    [DataMember(Name="timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timeout")]
    public ConfigNodePropertyInteger Timeout { get; set; }

    /// <summary>
    /// Gets or Sets TargetStartLevel
    /// </summary>
    [DataMember(Name="target.start.level", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "target.start.level")]
    public ConfigNodePropertyInteger TargetStartLevel { get; set; }

    /// <summary>
    /// Gets or Sets TargetStartLevelPropName
    /// </summary>
    [DataMember(Name="target.start.level.prop.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "target.start.level.prop.name")]
    public ConfigNodePropertyString TargetStartLevelPropName { get; set; }

    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public ConfigNodePropertyDropDown Type { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties {\n");
      sb.Append("  Timeout: ").Append(Timeout).Append("\n");
      sb.Append("  TargetStartLevel: ").Append(TargetStartLevel).Append("\n");
      sb.Append("  TargetStartLevelPropName: ").Append(TargetStartLevelPropName).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
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
