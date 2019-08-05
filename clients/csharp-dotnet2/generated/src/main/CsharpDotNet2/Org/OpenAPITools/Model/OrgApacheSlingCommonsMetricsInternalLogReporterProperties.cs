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
  public class OrgApacheSlingCommonsMetricsInternalLogReporterProperties {
    /// <summary>
    /// Gets or Sets Period
    /// </summary>
    [DataMember(Name="period", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "period")]
    public ConfigNodePropertyInteger Period { get; set; }

    /// <summary>
    /// Gets or Sets TimeUnit
    /// </summary>
    [DataMember(Name="timeUnit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timeUnit")]
    public ConfigNodePropertyDropDown TimeUnit { get; set; }

    /// <summary>
    /// Gets or Sets Level
    /// </summary>
    [DataMember(Name="level", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "level")]
    public ConfigNodePropertyDropDown Level { get; set; }

    /// <summary>
    /// Gets or Sets LoggerName
    /// </summary>
    [DataMember(Name="loggerName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "loggerName")]
    public ConfigNodePropertyString LoggerName { get; set; }

    /// <summary>
    /// Gets or Sets Prefix
    /// </summary>
    [DataMember(Name="prefix", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "prefix")]
    public ConfigNodePropertyString Prefix { get; set; }

    /// <summary>
    /// Gets or Sets Pattern
    /// </summary>
    [DataMember(Name="pattern", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pattern")]
    public ConfigNodePropertyString Pattern { get; set; }

    /// <summary>
    /// Gets or Sets RegistryName
    /// </summary>
    [DataMember(Name="registryName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "registryName")]
    public ConfigNodePropertyString RegistryName { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingCommonsMetricsInternalLogReporterProperties {\n");
      sb.Append("  Period: ").Append(Period).Append("\n");
      sb.Append("  TimeUnit: ").Append(TimeUnit).Append("\n");
      sb.Append("  Level: ").Append(Level).Append("\n");
      sb.Append("  LoggerName: ").Append(LoggerName).Append("\n");
      sb.Append("  Prefix: ").Append(Prefix).Append("\n");
      sb.Append("  Pattern: ").Append(Pattern).Append("\n");
      sb.Append("  RegistryName: ").Append(RegistryName).Append("\n");
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
