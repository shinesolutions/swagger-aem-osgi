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
  public class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties {
    /// <summary>
    /// Gets or Sets EventFilter
    /// </summary>
    [DataMember(Name="event.filter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "event.filter")]
    public ConfigNodePropertyString EventFilter { get; set; }

    /// <summary>
    /// Gets or Sets LaunchesEventhandlerThreadpoolMaxsize
    /// </summary>
    [DataMember(Name="launches.eventhandler.threadpool.maxsize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "launches.eventhandler.threadpool.maxsize")]
    public ConfigNodePropertyInteger LaunchesEventhandlerThreadpoolMaxsize { get; set; }

    /// <summary>
    /// Gets or Sets LaunchesEventhandlerThreadpoolPriority
    /// </summary>
    [DataMember(Name="launches.eventhandler.threadpool.priority", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "launches.eventhandler.threadpool.priority")]
    public ConfigNodePropertyDropDown LaunchesEventhandlerThreadpoolPriority { get; set; }

    /// <summary>
    /// Gets or Sets LaunchesEventhandlerUpdatelastmodification
    /// </summary>
    [DataMember(Name="launches.eventhandler.updatelastmodification", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "launches.eventhandler.updatelastmodification")]
    public ConfigNodePropertyBoolean LaunchesEventhandlerUpdatelastmodification { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties {\n");
      sb.Append("  EventFilter: ").Append(EventFilter).Append("\n");
      sb.Append("  LaunchesEventhandlerThreadpoolMaxsize: ").Append(LaunchesEventhandlerThreadpoolMaxsize).Append("\n");
      sb.Append("  LaunchesEventhandlerThreadpoolPriority: ").Append(LaunchesEventhandlerThreadpoolPriority).Append("\n");
      sb.Append("  LaunchesEventhandlerUpdatelastmodification: ").Append(LaunchesEventhandlerUpdatelastmodification).Append("\n");
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
