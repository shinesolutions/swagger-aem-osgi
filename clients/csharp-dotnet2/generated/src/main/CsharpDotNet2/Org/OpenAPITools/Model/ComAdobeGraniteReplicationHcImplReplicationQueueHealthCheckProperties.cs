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
  public class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties {
    /// <summary>
    /// Gets or Sets NumberOfRetriesAllowed
    /// </summary>
    [DataMember(Name="number.of.retries.allowed", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "number.of.retries.allowed")]
    public ConfigNodePropertyInteger NumberOfRetriesAllowed { get; set; }

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
      sb.Append("class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties {\n");
      sb.Append("  NumberOfRetriesAllowed: ").Append(NumberOfRetriesAllowed).Append("\n");
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
