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
  public class ComAdobeCqHistoryImplHistoryRequestFilterProperties {
    /// <summary>
    /// Gets or Sets HistoryRequestFilterExcludedSelectors
    /// </summary>
    [DataMember(Name="history.requestFilter.excludedSelectors", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "history.requestFilter.excludedSelectors")]
    public ConfigNodePropertyArray HistoryRequestFilterExcludedSelectors { get; set; }

    /// <summary>
    /// Gets or Sets HistoryRequestFilterExcludedExtensions
    /// </summary>
    [DataMember(Name="history.requestFilter.excludedExtensions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "history.requestFilter.excludedExtensions")]
    public ConfigNodePropertyArray HistoryRequestFilterExcludedExtensions { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqHistoryImplHistoryRequestFilterProperties {\n");
      sb.Append("  HistoryRequestFilterExcludedSelectors: ").Append(HistoryRequestFilterExcludedSelectors).Append("\n");
      sb.Append("  HistoryRequestFilterExcludedExtensions: ").Append(HistoryRequestFilterExcludedExtensions).Append("\n");
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
