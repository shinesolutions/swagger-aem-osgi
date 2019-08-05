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
  public class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties {
    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public ConfigNodePropertyString Name { get; set; }

    /// <summary>
    /// Gets or Sets Path
    /// </summary>
    [DataMember(Name="path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "path")]
    public ConfigNodePropertyString Path { get; set; }

    /// <summary>
    /// Gets or Sets IgnoredPathsPatterns
    /// </summary>
    [DataMember(Name="ignoredPathsPatterns", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ignoredPathsPatterns")]
    public ConfigNodePropertyArray IgnoredPathsPatterns { get; set; }

    /// <summary>
    /// Gets or Sets ServiceName
    /// </summary>
    [DataMember(Name="serviceName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "serviceName")]
    public ConfigNodePropertyString ServiceName { get; set; }

    /// <summary>
    /// Gets or Sets Deep
    /// </summary>
    [DataMember(Name="deep", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "deep")]
    public ConfigNodePropertyBoolean Deep { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Path: ").Append(Path).Append("\n");
      sb.Append("  IgnoredPathsPatterns: ").Append(IgnoredPathsPatterns).Append("\n");
      sb.Append("  ServiceName: ").Append(ServiceName).Append("\n");
      sb.Append("  Deep: ").Append(Deep).Append("\n");
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
