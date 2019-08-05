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
  public class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties {
    /// <summary>
    /// Gets or Sets Operation
    /// </summary>
    [DataMember(Name="operation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "operation")]
    public ConfigNodePropertyString Operation { get; set; }

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
      sb.Append("class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties {\n");
      sb.Append("  Operation: ").Append(Operation).Append("\n");
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
