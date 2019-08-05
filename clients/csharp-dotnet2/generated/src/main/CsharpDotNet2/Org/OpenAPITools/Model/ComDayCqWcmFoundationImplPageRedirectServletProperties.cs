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
  public class ComDayCqWcmFoundationImplPageRedirectServletProperties {
    /// <summary>
    /// Gets or Sets ExcludedResourceTypes
    /// </summary>
    [DataMember(Name="excluded.resource.types", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "excluded.resource.types")]
    public ConfigNodePropertyArray ExcludedResourceTypes { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmFoundationImplPageRedirectServletProperties {\n");
      sb.Append("  ExcludedResourceTypes: ").Append(ExcludedResourceTypes).Append("\n");
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
