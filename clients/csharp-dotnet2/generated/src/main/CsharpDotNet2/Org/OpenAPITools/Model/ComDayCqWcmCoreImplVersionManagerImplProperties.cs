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
  public class ComDayCqWcmCoreImplVersionManagerImplProperties {
    /// <summary>
    /// Gets or Sets VersionmanagerCreateVersionOnActivation
    /// </summary>
    [DataMember(Name="versionmanager.createVersionOnActivation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "versionmanager.createVersionOnActivation")]
    public ConfigNodePropertyBoolean VersionmanagerCreateVersionOnActivation { get; set; }

    /// <summary>
    /// Gets or Sets VersionmanagerPurgingEnabled
    /// </summary>
    [DataMember(Name="versionmanager.purgingEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "versionmanager.purgingEnabled")]
    public ConfigNodePropertyBoolean VersionmanagerPurgingEnabled { get; set; }

    /// <summary>
    /// Gets or Sets VersionmanagerPurgePaths
    /// </summary>
    [DataMember(Name="versionmanager.purgePaths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "versionmanager.purgePaths")]
    public ConfigNodePropertyArray VersionmanagerPurgePaths { get; set; }

    /// <summary>
    /// Gets or Sets VersionmanagerIvPaths
    /// </summary>
    [DataMember(Name="versionmanager.ivPaths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "versionmanager.ivPaths")]
    public ConfigNodePropertyArray VersionmanagerIvPaths { get; set; }

    /// <summary>
    /// Gets or Sets VersionmanagerMaxAgeDays
    /// </summary>
    [DataMember(Name="versionmanager.maxAgeDays", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "versionmanager.maxAgeDays")]
    public ConfigNodePropertyInteger VersionmanagerMaxAgeDays { get; set; }

    /// <summary>
    /// Gets or Sets VersionmanagerMaxNumberVersions
    /// </summary>
    [DataMember(Name="versionmanager.maxNumberVersions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "versionmanager.maxNumberVersions")]
    public ConfigNodePropertyInteger VersionmanagerMaxNumberVersions { get; set; }

    /// <summary>
    /// Gets or Sets VersionmanagerMinNumberVersions
    /// </summary>
    [DataMember(Name="versionmanager.minNumberVersions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "versionmanager.minNumberVersions")]
    public ConfigNodePropertyInteger VersionmanagerMinNumberVersions { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmCoreImplVersionManagerImplProperties {\n");
      sb.Append("  VersionmanagerCreateVersionOnActivation: ").Append(VersionmanagerCreateVersionOnActivation).Append("\n");
      sb.Append("  VersionmanagerPurgingEnabled: ").Append(VersionmanagerPurgingEnabled).Append("\n");
      sb.Append("  VersionmanagerPurgePaths: ").Append(VersionmanagerPurgePaths).Append("\n");
      sb.Append("  VersionmanagerIvPaths: ").Append(VersionmanagerIvPaths).Append("\n");
      sb.Append("  VersionmanagerMaxAgeDays: ").Append(VersionmanagerMaxAgeDays).Append("\n");
      sb.Append("  VersionmanagerMaxNumberVersions: ").Append(VersionmanagerMaxNumberVersions).Append("\n");
      sb.Append("  VersionmanagerMinNumberVersions: ").Append(VersionmanagerMinNumberVersions).Append("\n");
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
