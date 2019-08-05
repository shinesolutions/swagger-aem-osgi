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
  public class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties {
    /// <summary>
    /// Gets or Sets CreatePreviewEnabled
    /// </summary>
    [DataMember(Name="createPreviewEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "createPreviewEnabled")]
    public ConfigNodePropertyBoolean CreatePreviewEnabled { get; set; }

    /// <summary>
    /// Gets or Sets UpdatePreviewEnabled
    /// </summary>
    [DataMember(Name="updatePreviewEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "updatePreviewEnabled")]
    public ConfigNodePropertyBoolean UpdatePreviewEnabled { get; set; }

    /// <summary>
    /// Gets or Sets QueueSize
    /// </summary>
    [DataMember(Name="queueSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queueSize")]
    public ConfigNodePropertyInteger QueueSize { get; set; }

    /// <summary>
    /// Gets or Sets FolderPreviewRenditionRegex
    /// </summary>
    [DataMember(Name="folderPreviewRenditionRegex", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "folderPreviewRenditionRegex")]
    public ConfigNodePropertyString FolderPreviewRenditionRegex { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties {\n");
      sb.Append("  CreatePreviewEnabled: ").Append(CreatePreviewEnabled).Append("\n");
      sb.Append("  UpdatePreviewEnabled: ").Append(UpdatePreviewEnabled).Append("\n");
      sb.Append("  QueueSize: ").Append(QueueSize).Append("\n");
      sb.Append("  FolderPreviewRenditionRegex: ").Append(FolderPreviewRenditionRegex).Append("\n");
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
