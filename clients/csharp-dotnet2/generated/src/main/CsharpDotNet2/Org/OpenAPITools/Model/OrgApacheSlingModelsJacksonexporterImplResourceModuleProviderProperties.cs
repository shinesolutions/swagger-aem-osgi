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
  public class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties {
    /// <summary>
    /// Gets or Sets MaxRecursionLevels
    /// </summary>
    [DataMember(Name="max.recursion.levels", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "max.recursion.levels")]
    public ConfigNodePropertyInteger MaxRecursionLevels { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties {\n");
      sb.Append("  MaxRecursionLevels: ").Append(MaxRecursionLevels).Append("\n");
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
