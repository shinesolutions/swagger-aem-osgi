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
  public class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties {
    /// <summary>
    /// Gets or Sets Codeupgradetasks
    /// </summary>
    [DataMember(Name="codeupgradetasks", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "codeupgradetasks")]
    public ConfigNodePropertyArray Codeupgradetasks { get; set; }

    /// <summary>
    /// Gets or Sets Codeupgradetaskfilters
    /// </summary>
    [DataMember(Name="codeupgradetaskfilters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "codeupgradetaskfilters")]
    public ConfigNodePropertyArray Codeupgradetaskfilters { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties {\n");
      sb.Append("  Codeupgradetasks: ").Append(Codeupgradetasks).Append("\n");
      sb.Append("  Codeupgradetaskfilters: ").Append(Codeupgradetaskfilters).Append("\n");
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
