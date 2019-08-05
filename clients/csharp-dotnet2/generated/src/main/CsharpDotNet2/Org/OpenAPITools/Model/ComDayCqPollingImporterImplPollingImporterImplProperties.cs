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
  public class ComDayCqPollingImporterImplPollingImporterImplProperties {
    /// <summary>
    /// Gets or Sets ImporterMinInterval
    /// </summary>
    [DataMember(Name="importer.min.interval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "importer.min.interval")]
    public ConfigNodePropertyInteger ImporterMinInterval { get; set; }

    /// <summary>
    /// Gets or Sets ImporterUser
    /// </summary>
    [DataMember(Name="importer.user", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "importer.user")]
    public ConfigNodePropertyString ImporterUser { get; set; }

    /// <summary>
    /// Gets or Sets ExcludePaths
    /// </summary>
    [DataMember(Name="exclude.paths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "exclude.paths")]
    public ConfigNodePropertyArray ExcludePaths { get; set; }

    /// <summary>
    /// Gets or Sets IncludePaths
    /// </summary>
    [DataMember(Name="include.paths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "include.paths")]
    public ConfigNodePropertyArray IncludePaths { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqPollingImporterImplPollingImporterImplProperties {\n");
      sb.Append("  ImporterMinInterval: ").Append(ImporterMinInterval).Append("\n");
      sb.Append("  ImporterUser: ").Append(ImporterUser).Append("\n");
      sb.Append("  ExcludePaths: ").Append(ExcludePaths).Append("\n");
      sb.Append("  IncludePaths: ").Append(IncludePaths).Append("\n");
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
