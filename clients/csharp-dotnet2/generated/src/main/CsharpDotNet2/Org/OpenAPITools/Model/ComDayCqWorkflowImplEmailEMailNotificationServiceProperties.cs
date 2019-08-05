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
  public class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties {
    /// <summary>
    /// Gets or Sets FromAddress
    /// </summary>
    [DataMember(Name="from.address", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "from.address")]
    public ConfigNodePropertyString FromAddress { get; set; }

    /// <summary>
    /// Gets or Sets HostPrefix
    /// </summary>
    [DataMember(Name="host.prefix", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "host.prefix")]
    public ConfigNodePropertyString HostPrefix { get; set; }

    /// <summary>
    /// Gets or Sets NotifyOnabort
    /// </summary>
    [DataMember(Name="notify.onabort", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "notify.onabort")]
    public ConfigNodePropertyBoolean NotifyOnabort { get; set; }

    /// <summary>
    /// Gets or Sets NotifyOncomplete
    /// </summary>
    [DataMember(Name="notify.oncomplete", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "notify.oncomplete")]
    public ConfigNodePropertyBoolean NotifyOncomplete { get; set; }

    /// <summary>
    /// Gets or Sets NotifyOncontainercomplete
    /// </summary>
    [DataMember(Name="notify.oncontainercomplete", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "notify.oncontainercomplete")]
    public ConfigNodePropertyBoolean NotifyOncontainercomplete { get; set; }

    /// <summary>
    /// Gets or Sets NotifyUseronly
    /// </summary>
    [DataMember(Name="notify.useronly", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "notify.useronly")]
    public ConfigNodePropertyBoolean NotifyUseronly { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties {\n");
      sb.Append("  FromAddress: ").Append(FromAddress).Append("\n");
      sb.Append("  HostPrefix: ").Append(HostPrefix).Append("\n");
      sb.Append("  NotifyOnabort: ").Append(NotifyOnabort).Append("\n");
      sb.Append("  NotifyOncomplete: ").Append(NotifyOncomplete).Append("\n");
      sb.Append("  NotifyOncontainercomplete: ").Append(NotifyOncontainercomplete).Append("\n");
      sb.Append("  NotifyUseronly: ").Append(NotifyUseronly).Append("\n");
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
