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
  public class ComDayCqWcmUndoUndoConfigProperties {
    /// <summary>
    /// Gets or Sets CqWcmUndoEnabled
    /// </summary>
    [DataMember(Name="cq.wcm.undo.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.wcm.undo.enabled")]
    public ConfigNodePropertyBoolean CqWcmUndoEnabled { get; set; }

    /// <summary>
    /// Gets or Sets CqWcmUndoPath
    /// </summary>
    [DataMember(Name="cq.wcm.undo.path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.wcm.undo.path")]
    public ConfigNodePropertyString CqWcmUndoPath { get; set; }

    /// <summary>
    /// Gets or Sets CqWcmUndoValidity
    /// </summary>
    [DataMember(Name="cq.wcm.undo.validity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.wcm.undo.validity")]
    public ConfigNodePropertyInteger CqWcmUndoValidity { get; set; }

    /// <summary>
    /// Gets or Sets CqWcmUndoSteps
    /// </summary>
    [DataMember(Name="cq.wcm.undo.steps", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.wcm.undo.steps")]
    public ConfigNodePropertyInteger CqWcmUndoSteps { get; set; }

    /// <summary>
    /// Gets or Sets CqWcmUndoPersistence
    /// </summary>
    [DataMember(Name="cq.wcm.undo.persistence", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.wcm.undo.persistence")]
    public ConfigNodePropertyString CqWcmUndoPersistence { get; set; }

    /// <summary>
    /// Gets or Sets CqWcmUndoPersistenceMode
    /// </summary>
    [DataMember(Name="cq.wcm.undo.persistence.mode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.wcm.undo.persistence.mode")]
    public ConfigNodePropertyBoolean CqWcmUndoPersistenceMode { get; set; }

    /// <summary>
    /// Gets or Sets CqWcmUndoMarkermode
    /// </summary>
    [DataMember(Name="cq.wcm.undo.markermode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.wcm.undo.markermode")]
    public ConfigNodePropertyString CqWcmUndoMarkermode { get; set; }

    /// <summary>
    /// Gets or Sets CqWcmUndoWhitelist
    /// </summary>
    [DataMember(Name="cq.wcm.undo.whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.wcm.undo.whitelist")]
    public ConfigNodePropertyArray CqWcmUndoWhitelist { get; set; }

    /// <summary>
    /// Gets or Sets CqWcmUndoBlacklist
    /// </summary>
    [DataMember(Name="cq.wcm.undo.blacklist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.wcm.undo.blacklist")]
    public ConfigNodePropertyArray CqWcmUndoBlacklist { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmUndoUndoConfigProperties {\n");
      sb.Append("  CqWcmUndoEnabled: ").Append(CqWcmUndoEnabled).Append("\n");
      sb.Append("  CqWcmUndoPath: ").Append(CqWcmUndoPath).Append("\n");
      sb.Append("  CqWcmUndoValidity: ").Append(CqWcmUndoValidity).Append("\n");
      sb.Append("  CqWcmUndoSteps: ").Append(CqWcmUndoSteps).Append("\n");
      sb.Append("  CqWcmUndoPersistence: ").Append(CqWcmUndoPersistence).Append("\n");
      sb.Append("  CqWcmUndoPersistenceMode: ").Append(CqWcmUndoPersistenceMode).Append("\n");
      sb.Append("  CqWcmUndoMarkermode: ").Append(CqWcmUndoMarkermode).Append("\n");
      sb.Append("  CqWcmUndoWhitelist: ").Append(CqWcmUndoWhitelist).Append("\n");
      sb.Append("  CqWcmUndoBlacklist: ").Append(CqWcmUndoBlacklist).Append("\n");
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
