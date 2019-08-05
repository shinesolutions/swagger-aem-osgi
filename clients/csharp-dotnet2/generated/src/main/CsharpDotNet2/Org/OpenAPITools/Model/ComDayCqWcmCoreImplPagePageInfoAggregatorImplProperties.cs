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
  public class ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties {
    /// <summary>
    /// Gets or Sets PageInfoProviderPropertyRegexDefault
    /// </summary>
    [DataMember(Name="page.info.provider.property.regex.default", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "page.info.provider.property.regex.default")]
    public ConfigNodePropertyString PageInfoProviderPropertyRegexDefault { get; set; }

    /// <summary>
    /// Gets or Sets PageInfoProviderPropertyName
    /// </summary>
    [DataMember(Name="page.info.provider.property.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "page.info.provider.property.name")]
    public ConfigNodePropertyString PageInfoProviderPropertyName { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties {\n");
      sb.Append("  PageInfoProviderPropertyRegexDefault: ").Append(PageInfoProviderPropertyRegexDefault).Append("\n");
      sb.Append("  PageInfoProviderPropertyName: ").Append(PageInfoProviderPropertyName).Append("\n");
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
