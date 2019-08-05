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
  public class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties {
    /// <summary>
    /// Gets or Sets LargeIndexCriticalThreshold
    /// </summary>
    [DataMember(Name="large.index.critical.threshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "large.index.critical.threshold")]
    public ConfigNodePropertyInteger LargeIndexCriticalThreshold { get; set; }

    /// <summary>
    /// Gets or Sets LargeIndexWarnThreshold
    /// </summary>
    [DataMember(Name="large.index.warn.threshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "large.index.warn.threshold")]
    public ConfigNodePropertyInteger LargeIndexWarnThreshold { get; set; }

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
      sb.Append("class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties {\n");
      sb.Append("  LargeIndexCriticalThreshold: ").Append(LargeIndexCriticalThreshold).Append("\n");
      sb.Append("  LargeIndexWarnThreshold: ").Append(LargeIndexWarnThreshold).Append("\n");
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
