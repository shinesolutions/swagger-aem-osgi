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
  public class ComAdobeGraniteCsrfImplCSRFFilterProperties {
    /// <summary>
    /// Gets or Sets FilterMethods
    /// </summary>
    [DataMember(Name="filter.methods", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "filter.methods")]
    public ConfigNodePropertyArray FilterMethods { get; set; }

    /// <summary>
    /// Gets or Sets FilterEnableSafeUserAgents
    /// </summary>
    [DataMember(Name="filter.enable.safe.user.agents", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "filter.enable.safe.user.agents")]
    public ConfigNodePropertyBoolean FilterEnableSafeUserAgents { get; set; }

    /// <summary>
    /// Gets or Sets FilterSafeUserAgents
    /// </summary>
    [DataMember(Name="filter.safe.user.agents", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "filter.safe.user.agents")]
    public ConfigNodePropertyArray FilterSafeUserAgents { get; set; }

    /// <summary>
    /// Gets or Sets FilterExcludedPaths
    /// </summary>
    [DataMember(Name="filter.excluded.paths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "filter.excluded.paths")]
    public ConfigNodePropertyArray FilterExcludedPaths { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteCsrfImplCSRFFilterProperties {\n");
      sb.Append("  FilterMethods: ").Append(FilterMethods).Append("\n");
      sb.Append("  FilterEnableSafeUserAgents: ").Append(FilterEnableSafeUserAgents).Append("\n");
      sb.Append("  FilterSafeUserAgents: ").Append(FilterSafeUserAgents).Append("\n");
      sb.Append("  FilterExcludedPaths: ").Append(FilterExcludedPaths).Append("\n");
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
