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
  public class ComDayCqMcmImplMCMConfigurationProperties {
    /// <summary>
    /// Gets or Sets ExperienceIndirection
    /// </summary>
    [DataMember(Name="experience.indirection", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "experience.indirection")]
    public ConfigNodePropertyArray ExperienceIndirection { get; set; }

    /// <summary>
    /// Gets or Sets TouchpointIndirection
    /// </summary>
    [DataMember(Name="touchpoint.indirection", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "touchpoint.indirection")]
    public ConfigNodePropertyArray TouchpointIndirection { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqMcmImplMCMConfigurationProperties {\n");
      sb.Append("  ExperienceIndirection: ").Append(ExperienceIndirection).Append("\n");
      sb.Append("  TouchpointIndirection: ").Append(TouchpointIndirection).Append("\n");
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
