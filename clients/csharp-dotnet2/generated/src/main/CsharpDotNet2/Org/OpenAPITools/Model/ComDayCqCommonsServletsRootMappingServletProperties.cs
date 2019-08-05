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
  public class ComDayCqCommonsServletsRootMappingServletProperties {
    /// <summary>
    /// Gets or Sets RootmappingTarget
    /// </summary>
    [DataMember(Name="rootmapping.target", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rootmapping.target")]
    public ConfigNodePropertyString RootmappingTarget { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqCommonsServletsRootMappingServletProperties {\n");
      sb.Append("  RootmappingTarget: ").Append(RootmappingTarget).Append("\n");
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
