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
  public class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties {
    /// <summary>
    /// Gets or Sets Datasources
    /// </summary>
    [DataMember(Name="datasources", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "datasources")]
    public ConfigNodePropertyArray Datasources { get; set; }

    /// <summary>
    /// Gets or Sets Step
    /// </summary>
    [DataMember(Name="step", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "step")]
    public ConfigNodePropertyInteger Step { get; set; }

    /// <summary>
    /// Gets or Sets Archives
    /// </summary>
    [DataMember(Name="archives", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "archives")]
    public ConfigNodePropertyArray Archives { get; set; }

    /// <summary>
    /// Gets or Sets Path
    /// </summary>
    [DataMember(Name="path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "path")]
    public ConfigNodePropertyString Path { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties {\n");
      sb.Append("  Datasources: ").Append(Datasources).Append("\n");
      sb.Append("  Step: ").Append(Step).Append("\n");
      sb.Append("  Archives: ").Append(Archives).Append("\n");
      sb.Append("  Path: ").Append(Path).Append("\n");
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
