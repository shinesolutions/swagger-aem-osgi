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
  public class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties {
    /// <summary>
    /// Gets or Sets IndexingCriticalThreshold
    /// </summary>
    [DataMember(Name="indexing.critical.threshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "indexing.critical.threshold")]
    public ConfigNodePropertyInteger IndexingCriticalThreshold { get; set; }

    /// <summary>
    /// Gets or Sets IndexingWarnThreshold
    /// </summary>
    [DataMember(Name="indexing.warn.threshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "indexing.warn.threshold")]
    public ConfigNodePropertyInteger IndexingWarnThreshold { get; set; }

    /// <summary>
    /// Gets or Sets HcTags
    /// </summary>
    [DataMember(Name="hc.tags", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "hc.tags")]
    public ConfigNodePropertyArray HcTags { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties {\n");
      sb.Append("  IndexingCriticalThreshold: ").Append(IndexingCriticalThreshold).Append("\n");
      sb.Append("  IndexingWarnThreshold: ").Append(IndexingWarnThreshold).Append("\n");
      sb.Append("  HcTags: ").Append(HcTags).Append("\n");
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
