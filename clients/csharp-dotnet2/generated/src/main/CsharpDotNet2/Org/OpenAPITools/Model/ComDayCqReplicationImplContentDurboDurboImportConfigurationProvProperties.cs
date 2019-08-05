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
  public class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties {
    /// <summary>
    /// Gets or Sets PreserveHierarchyNodes
    /// </summary>
    [DataMember(Name="preserve.hierarchy.nodes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "preserve.hierarchy.nodes")]
    public ConfigNodePropertyBoolean PreserveHierarchyNodes { get; set; }

    /// <summary>
    /// Gets or Sets IgnoreVersioning
    /// </summary>
    [DataMember(Name="ignore.versioning", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ignore.versioning")]
    public ConfigNodePropertyBoolean IgnoreVersioning { get; set; }

    /// <summary>
    /// Gets or Sets ImportAcl
    /// </summary>
    [DataMember(Name="import.acl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "import.acl")]
    public ConfigNodePropertyBoolean ImportAcl { get; set; }

    /// <summary>
    /// Gets or Sets SaveThreshold
    /// </summary>
    [DataMember(Name="save.threshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "save.threshold")]
    public ConfigNodePropertyInteger SaveThreshold { get; set; }

    /// <summary>
    /// Gets or Sets PreserveUserPaths
    /// </summary>
    [DataMember(Name="preserve.user.paths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "preserve.user.paths")]
    public ConfigNodePropertyBoolean PreserveUserPaths { get; set; }

    /// <summary>
    /// Gets or Sets PreserveUuid
    /// </summary>
    [DataMember(Name="preserve.uuid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "preserve.uuid")]
    public ConfigNodePropertyBoolean PreserveUuid { get; set; }

    /// <summary>
    /// Gets or Sets PreserveUuidNodetypes
    /// </summary>
    [DataMember(Name="preserve.uuid.nodetypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "preserve.uuid.nodetypes")]
    public ConfigNodePropertyArray PreserveUuidNodetypes { get; set; }

    /// <summary>
    /// Gets or Sets PreserveUuidSubtrees
    /// </summary>
    [DataMember(Name="preserve.uuid.subtrees", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "preserve.uuid.subtrees")]
    public ConfigNodePropertyArray PreserveUuidSubtrees { get; set; }

    /// <summary>
    /// Gets or Sets AutoCommit
    /// </summary>
    [DataMember(Name="auto.commit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "auto.commit")]
    public ConfigNodePropertyBoolean AutoCommit { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties {\n");
      sb.Append("  PreserveHierarchyNodes: ").Append(PreserveHierarchyNodes).Append("\n");
      sb.Append("  IgnoreVersioning: ").Append(IgnoreVersioning).Append("\n");
      sb.Append("  ImportAcl: ").Append(ImportAcl).Append("\n");
      sb.Append("  SaveThreshold: ").Append(SaveThreshold).Append("\n");
      sb.Append("  PreserveUserPaths: ").Append(PreserveUserPaths).Append("\n");
      sb.Append("  PreserveUuid: ").Append(PreserveUuid).Append("\n");
      sb.Append("  PreserveUuidNodetypes: ").Append(PreserveUuidNodetypes).Append("\n");
      sb.Append("  PreserveUuidSubtrees: ").Append(PreserveUuidSubtrees).Append("\n");
      sb.Append("  AutoCommit: ").Append(AutoCommit).Append("\n");
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
