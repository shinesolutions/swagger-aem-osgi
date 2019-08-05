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
  public class OrgApacheSlingEngineParametersProperties {
    /// <summary>
    /// Gets or Sets SlingDefaultParameterEncoding
    /// </summary>
    [DataMember(Name="sling.default.parameter.encoding", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.default.parameter.encoding")]
    public ConfigNodePropertyString SlingDefaultParameterEncoding { get; set; }

    /// <summary>
    /// Gets or Sets SlingDefaultMaxParameters
    /// </summary>
    [DataMember(Name="sling.default.max.parameters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.default.max.parameters")]
    public ConfigNodePropertyInteger SlingDefaultMaxParameters { get; set; }

    /// <summary>
    /// Gets or Sets FileLocation
    /// </summary>
    [DataMember(Name="file.location", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "file.location")]
    public ConfigNodePropertyString FileLocation { get; set; }

    /// <summary>
    /// Gets or Sets FileThreshold
    /// </summary>
    [DataMember(Name="file.threshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "file.threshold")]
    public ConfigNodePropertyInteger FileThreshold { get; set; }

    /// <summary>
    /// Gets or Sets FileMax
    /// </summary>
    [DataMember(Name="file.max", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "file.max")]
    public ConfigNodePropertyInteger FileMax { get; set; }

    /// <summary>
    /// Gets or Sets RequestMax
    /// </summary>
    [DataMember(Name="request.max", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "request.max")]
    public ConfigNodePropertyInteger RequestMax { get; set; }

    /// <summary>
    /// Gets or Sets SlingDefaultParameterCheckForAdditionalContainerParameters
    /// </summary>
    [DataMember(Name="sling.default.parameter.checkForAdditionalContainerParameters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.default.parameter.checkForAdditionalContainerParameters")]
    public ConfigNodePropertyBoolean SlingDefaultParameterCheckForAdditionalContainerParameters { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingEngineParametersProperties {\n");
      sb.Append("  SlingDefaultParameterEncoding: ").Append(SlingDefaultParameterEncoding).Append("\n");
      sb.Append("  SlingDefaultMaxParameters: ").Append(SlingDefaultMaxParameters).Append("\n");
      sb.Append("  FileLocation: ").Append(FileLocation).Append("\n");
      sb.Append("  FileThreshold: ").Append(FileThreshold).Append("\n");
      sb.Append("  FileMax: ").Append(FileMax).Append("\n");
      sb.Append("  RequestMax: ").Append(RequestMax).Append("\n");
      sb.Append("  SlingDefaultParameterCheckForAdditionalContainerParameters: ").Append(SlingDefaultParameterCheckForAdditionalContainerParameters).Append("\n");
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
