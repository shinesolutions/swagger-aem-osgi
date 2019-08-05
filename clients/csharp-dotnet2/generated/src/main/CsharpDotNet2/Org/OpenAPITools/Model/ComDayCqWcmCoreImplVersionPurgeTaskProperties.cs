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
  public class ComDayCqWcmCoreImplVersionPurgeTaskProperties {
    /// <summary>
    /// Gets or Sets VersionpurgePaths
    /// </summary>
    [DataMember(Name="versionpurge.paths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "versionpurge.paths")]
    public ConfigNodePropertyArray VersionpurgePaths { get; set; }

    /// <summary>
    /// Gets or Sets VersionpurgeRecursive
    /// </summary>
    [DataMember(Name="versionpurge.recursive", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "versionpurge.recursive")]
    public ConfigNodePropertyBoolean VersionpurgeRecursive { get; set; }

    /// <summary>
    /// Gets or Sets VersionpurgeMaxVersions
    /// </summary>
    [DataMember(Name="versionpurge.maxVersions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "versionpurge.maxVersions")]
    public ConfigNodePropertyInteger VersionpurgeMaxVersions { get; set; }

    /// <summary>
    /// Gets or Sets VersionpurgeMinVersions
    /// </summary>
    [DataMember(Name="versionpurge.minVersions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "versionpurge.minVersions")]
    public ConfigNodePropertyInteger VersionpurgeMinVersions { get; set; }

    /// <summary>
    /// Gets or Sets VersionpurgeMaxAgeDays
    /// </summary>
    [DataMember(Name="versionpurge.maxAgeDays", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "versionpurge.maxAgeDays")]
    public ConfigNodePropertyInteger VersionpurgeMaxAgeDays { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmCoreImplVersionPurgeTaskProperties {\n");
      sb.Append("  VersionpurgePaths: ").Append(VersionpurgePaths).Append("\n");
      sb.Append("  VersionpurgeRecursive: ").Append(VersionpurgeRecursive).Append("\n");
      sb.Append("  VersionpurgeMaxVersions: ").Append(VersionpurgeMaxVersions).Append("\n");
      sb.Append("  VersionpurgeMinVersions: ").Append(VersionpurgeMinVersions).Append("\n");
      sb.Append("  VersionpurgeMaxAgeDays: ").Append(VersionpurgeMaxAgeDays).Append("\n");
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
