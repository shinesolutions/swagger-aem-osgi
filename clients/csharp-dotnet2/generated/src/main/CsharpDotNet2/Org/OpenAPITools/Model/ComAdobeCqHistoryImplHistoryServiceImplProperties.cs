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
  public class ComAdobeCqHistoryImplHistoryServiceImplProperties {
    /// <summary>
    /// Gets or Sets HistoryServiceResourceTypes
    /// </summary>
    [DataMember(Name="history.service.resourceTypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "history.service.resourceTypes")]
    public ConfigNodePropertyArray HistoryServiceResourceTypes { get; set; }

    /// <summary>
    /// Gets or Sets HistoryServicePathFilter
    /// </summary>
    [DataMember(Name="history.service.pathFilter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "history.service.pathFilter")]
    public ConfigNodePropertyArray HistoryServicePathFilter { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqHistoryImplHistoryServiceImplProperties {\n");
      sb.Append("  HistoryServiceResourceTypes: ").Append(HistoryServiceResourceTypes).Append("\n");
      sb.Append("  HistoryServicePathFilter: ").Append(HistoryServicePathFilter).Append("\n");
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
