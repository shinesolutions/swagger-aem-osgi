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
  public class ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties {
    /// <summary>
    /// Gets or Sets Threshold
    /// </summary>
    [DataMember(Name="threshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "threshold")]
    public ConfigNodePropertyInteger Threshold { get; set; }

    /// <summary>
    /// Gets or Sets JobTopicName
    /// </summary>
    [DataMember(Name="jobTopicName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jobTopicName")]
    public ConfigNodePropertyString JobTopicName { get; set; }

    /// <summary>
    /// Gets or Sets EmailEnabled
    /// </summary>
    [DataMember(Name="emailEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "emailEnabled")]
    public ConfigNodePropertyBoolean EmailEnabled { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties {\n");
      sb.Append("  Threshold: ").Append(Threshold).Append("\n");
      sb.Append("  JobTopicName: ").Append(JobTopicName).Append("\n");
      sb.Append("  EmailEnabled: ").Append(EmailEnabled).Append("\n");
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
