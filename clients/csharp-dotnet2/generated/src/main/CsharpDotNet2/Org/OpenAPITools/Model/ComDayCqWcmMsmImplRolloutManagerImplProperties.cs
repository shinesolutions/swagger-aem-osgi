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
  public class ComDayCqWcmMsmImplRolloutManagerImplProperties {
    /// <summary>
    /// Gets or Sets EventFilter
    /// </summary>
    [DataMember(Name="event.filter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "event.filter")]
    public ConfigNodePropertyString EventFilter { get; set; }

    /// <summary>
    /// Gets or Sets RolloutmgrExcludedpropsDefault
    /// </summary>
    [DataMember(Name="rolloutmgr.excludedprops.default", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rolloutmgr.excludedprops.default")]
    public ConfigNodePropertyArray RolloutmgrExcludedpropsDefault { get; set; }

    /// <summary>
    /// Gets or Sets RolloutmgrExcludedparagraphpropsDefault
    /// </summary>
    [DataMember(Name="rolloutmgr.excludedparagraphprops.default", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rolloutmgr.excludedparagraphprops.default")]
    public ConfigNodePropertyArray RolloutmgrExcludedparagraphpropsDefault { get; set; }

    /// <summary>
    /// Gets or Sets RolloutmgrExcludednodetypesDefault
    /// </summary>
    [DataMember(Name="rolloutmgr.excludednodetypes.default", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rolloutmgr.excludednodetypes.default")]
    public ConfigNodePropertyArray RolloutmgrExcludednodetypesDefault { get; set; }

    /// <summary>
    /// Gets or Sets RolloutmgrThreadpoolMaxsize
    /// </summary>
    [DataMember(Name="rolloutmgr.threadpool.maxsize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rolloutmgr.threadpool.maxsize")]
    public ConfigNodePropertyInteger RolloutmgrThreadpoolMaxsize { get; set; }

    /// <summary>
    /// Gets or Sets RolloutmgrThreadpoolMaxshutdowntime
    /// </summary>
    [DataMember(Name="rolloutmgr.threadpool.maxshutdowntime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rolloutmgr.threadpool.maxshutdowntime")]
    public ConfigNodePropertyInteger RolloutmgrThreadpoolMaxshutdowntime { get; set; }

    /// <summary>
    /// Gets or Sets RolloutmgrThreadpoolPriority
    /// </summary>
    [DataMember(Name="rolloutmgr.threadpool.priority", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rolloutmgr.threadpool.priority")]
    public ConfigNodePropertyDropDown RolloutmgrThreadpoolPriority { get; set; }

    /// <summary>
    /// Gets or Sets RolloutmgrCommitSize
    /// </summary>
    [DataMember(Name="rolloutmgr.commit.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rolloutmgr.commit.size")]
    public ConfigNodePropertyInteger RolloutmgrCommitSize { get; set; }

    /// <summary>
    /// Gets or Sets RolloutmgrConflicthandlingEnabled
    /// </summary>
    [DataMember(Name="rolloutmgr.conflicthandling.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rolloutmgr.conflicthandling.enabled")]
    public ConfigNodePropertyBoolean RolloutmgrConflicthandlingEnabled { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmMsmImplRolloutManagerImplProperties {\n");
      sb.Append("  EventFilter: ").Append(EventFilter).Append("\n");
      sb.Append("  RolloutmgrExcludedpropsDefault: ").Append(RolloutmgrExcludedpropsDefault).Append("\n");
      sb.Append("  RolloutmgrExcludedparagraphpropsDefault: ").Append(RolloutmgrExcludedparagraphpropsDefault).Append("\n");
      sb.Append("  RolloutmgrExcludednodetypesDefault: ").Append(RolloutmgrExcludednodetypesDefault).Append("\n");
      sb.Append("  RolloutmgrThreadpoolMaxsize: ").Append(RolloutmgrThreadpoolMaxsize).Append("\n");
      sb.Append("  RolloutmgrThreadpoolMaxshutdowntime: ").Append(RolloutmgrThreadpoolMaxshutdowntime).Append("\n");
      sb.Append("  RolloutmgrThreadpoolPriority: ").Append(RolloutmgrThreadpoolPriority).Append("\n");
      sb.Append("  RolloutmgrCommitSize: ").Append(RolloutmgrCommitSize).Append("\n");
      sb.Append("  RolloutmgrConflicthandlingEnabled: ").Append(RolloutmgrConflicthandlingEnabled).Append("\n");
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
