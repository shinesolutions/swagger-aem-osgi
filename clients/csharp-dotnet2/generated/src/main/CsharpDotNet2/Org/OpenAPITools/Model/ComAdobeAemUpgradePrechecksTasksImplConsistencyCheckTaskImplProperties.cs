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
  public class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties {
    /// <summary>
    /// Gets or Sets RootPath
    /// </summary>
    [DataMember(Name="root.path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "root.path")]
    public ConfigNodePropertyString RootPath { get; set; }

    /// <summary>
    /// Gets or Sets FixInconsistencies
    /// </summary>
    [DataMember(Name="fix.inconsistencies", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fix.inconsistencies")]
    public ConfigNodePropertyBoolean FixInconsistencies { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties {\n");
      sb.Append("  RootPath: ").Append(RootPath).Append("\n");
      sb.Append("  FixInconsistencies: ").Append(FixInconsistencies).Append("\n");
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
