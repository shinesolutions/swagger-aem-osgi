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
  public class ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties {
    /// <summary>
    /// Gets or Sets JobTopics
    /// </summary>
    [DataMember(Name="job.topics", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "job.topics")]
    public ConfigNodePropertyString JobTopics { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties {\n");
      sb.Append("  JobTopics: ").Append(JobTopics).Append("\n");
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
