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
  public class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {
    /// <summary>
    /// Gets or Sets Operation
    /// </summary>
    [DataMember(Name="operation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "operation")]
    public ConfigNodePropertyString Operation { get; set; }

    /// <summary>
    /// Gets or Sets OperationIcon
    /// </summary>
    [DataMember(Name="operationIcon", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "operationIcon")]
    public ConfigNodePropertyString OperationIcon { get; set; }

    /// <summary>
    /// Gets or Sets TopicName
    /// </summary>
    [DataMember(Name="topicName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "topicName")]
    public ConfigNodePropertyString TopicName { get; set; }

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
      sb.Append("class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {\n");
      sb.Append("  Operation: ").Append(Operation).Append("\n");
      sb.Append("  OperationIcon: ").Append(OperationIcon).Append("\n");
      sb.Append("  TopicName: ").Append(TopicName).Append("\n");
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
