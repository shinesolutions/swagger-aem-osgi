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
  public class ComDayCqDamCoreImplDamEventRecorderImplProperties {
    /// <summary>
    /// Gets or Sets EventFilter
    /// </summary>
    [DataMember(Name="event.filter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "event.filter")]
    public ConfigNodePropertyString EventFilter { get; set; }

    /// <summary>
    /// Gets or Sets EventQueueLength
    /// </summary>
    [DataMember(Name="event.queue.length", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "event.queue.length")]
    public ConfigNodePropertyInteger EventQueueLength { get; set; }

    /// <summary>
    /// Gets or Sets EventrecorderEnabled
    /// </summary>
    [DataMember(Name="eventrecorder.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "eventrecorder.enabled")]
    public ConfigNodePropertyBoolean EventrecorderEnabled { get; set; }

    /// <summary>
    /// Gets or Sets EventrecorderBlacklist
    /// </summary>
    [DataMember(Name="eventrecorder.blacklist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "eventrecorder.blacklist")]
    public ConfigNodePropertyArray EventrecorderBlacklist { get; set; }

    /// <summary>
    /// Gets or Sets EventrecorderEventtypes
    /// </summary>
    [DataMember(Name="eventrecorder.eventtypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "eventrecorder.eventtypes")]
    public ConfigNodePropertyDropDown EventrecorderEventtypes { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplDamEventRecorderImplProperties {\n");
      sb.Append("  EventFilter: ").Append(EventFilter).Append("\n");
      sb.Append("  EventQueueLength: ").Append(EventQueueLength).Append("\n");
      sb.Append("  EventrecorderEnabled: ").Append(EventrecorderEnabled).Append("\n");
      sb.Append("  EventrecorderBlacklist: ").Append(EventrecorderBlacklist).Append("\n");
      sb.Append("  EventrecorderEventtypes: ").Append(EventrecorderEventtypes).Append("\n");
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
