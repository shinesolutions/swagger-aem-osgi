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
  public class ComDayCqTaggingImplJcrTagManagerFactoryImplProperties {
    /// <summary>
    /// Gets or Sets ValidationEnabled
    /// </summary>
    [DataMember(Name="validation.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "validation.enabled")]
    public ConfigNodePropertyBoolean ValidationEnabled { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqTaggingImplJcrTagManagerFactoryImplProperties {\n");
      sb.Append("  ValidationEnabled: ").Append(ValidationEnabled).Append("\n");
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
