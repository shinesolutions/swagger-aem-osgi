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
  public class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties {
    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public ConfigNodePropertyString Name { get; set; }

    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public ConfigNodePropertyDropDown Type { get; set; }

    /// <summary>
    /// Gets or Sets FormatTarget
    /// </summary>
    [DataMember(Name="format.target", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "format.target")]
    public ConfigNodePropertyString FormatTarget { get; set; }

    /// <summary>
    /// Gets or Sets TempFsFolder
    /// </summary>
    [DataMember(Name="tempFsFolder", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tempFsFolder")]
    public ConfigNodePropertyString TempFsFolder { get; set; }

    /// <summary>
    /// Gets or Sets FileThreshold
    /// </summary>
    [DataMember(Name="fileThreshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fileThreshold")]
    public ConfigNodePropertyInteger FileThreshold { get; set; }

    /// <summary>
    /// Gets or Sets MemoryUnit
    /// </summary>
    [DataMember(Name="memoryUnit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "memoryUnit")]
    public ConfigNodePropertyDropDown MemoryUnit { get; set; }

    /// <summary>
    /// Gets or Sets UseOffHeapMemory
    /// </summary>
    [DataMember(Name="useOffHeapMemory", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "useOffHeapMemory")]
    public ConfigNodePropertyBoolean UseOffHeapMemory { get; set; }

    /// <summary>
    /// Gets or Sets DigestAlgorithm
    /// </summary>
    [DataMember(Name="digestAlgorithm", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "digestAlgorithm")]
    public ConfigNodePropertyDropDown DigestAlgorithm { get; set; }

    /// <summary>
    /// Gets or Sets MonitoringQueueSize
    /// </summary>
    [DataMember(Name="monitoringQueueSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "monitoringQueueSize")]
    public ConfigNodePropertyInteger MonitoringQueueSize { get; set; }

    /// <summary>
    /// Gets or Sets CleanupDelay
    /// </summary>
    [DataMember(Name="cleanupDelay", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cleanupDelay")]
    public ConfigNodePropertyInteger CleanupDelay { get; set; }

    /// <summary>
    /// Gets or Sets PackageFilters
    /// </summary>
    [DataMember(Name="package.filters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "package.filters")]
    public ConfigNodePropertyArray PackageFilters { get; set; }

    /// <summary>
    /// Gets or Sets PropertyFilters
    /// </summary>
    [DataMember(Name="property.filters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "property.filters")]
    public ConfigNodePropertyArray PropertyFilters { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  FormatTarget: ").Append(FormatTarget).Append("\n");
      sb.Append("  TempFsFolder: ").Append(TempFsFolder).Append("\n");
      sb.Append("  FileThreshold: ").Append(FileThreshold).Append("\n");
      sb.Append("  MemoryUnit: ").Append(MemoryUnit).Append("\n");
      sb.Append("  UseOffHeapMemory: ").Append(UseOffHeapMemory).Append("\n");
      sb.Append("  DigestAlgorithm: ").Append(DigestAlgorithm).Append("\n");
      sb.Append("  MonitoringQueueSize: ").Append(MonitoringQueueSize).Append("\n");
      sb.Append("  CleanupDelay: ").Append(CleanupDelay).Append("\n");
      sb.Append("  PackageFilters: ").Append(PackageFilters).Append("\n");
      sb.Append("  PropertyFilters: ").Append(PropertyFilters).Append("\n");
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
