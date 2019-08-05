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
  public class OrgApacheFelixScrScrServiceProperties {
    /// <summary>
    /// Gets or Sets DsLoglevel
    /// </summary>
    [DataMember(Name="ds.loglevel", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ds.loglevel")]
    public ConfigNodePropertyDropDown DsLoglevel { get; set; }

    /// <summary>
    /// Gets or Sets DsFactoryEnabled
    /// </summary>
    [DataMember(Name="ds.factory.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ds.factory.enabled")]
    public ConfigNodePropertyBoolean DsFactoryEnabled { get; set; }

    /// <summary>
    /// Gets or Sets DsDelayedKeepInstances
    /// </summary>
    [DataMember(Name="ds.delayed.keepInstances", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ds.delayed.keepInstances")]
    public ConfigNodePropertyBoolean DsDelayedKeepInstances { get; set; }

    /// <summary>
    /// Gets or Sets DsLockTimeoutMilliseconds
    /// </summary>
    [DataMember(Name="ds.lock.timeout.milliseconds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ds.lock.timeout.milliseconds")]
    public ConfigNodePropertyInteger DsLockTimeoutMilliseconds { get; set; }

    /// <summary>
    /// Gets or Sets DsStopTimeoutMilliseconds
    /// </summary>
    [DataMember(Name="ds.stop.timeout.milliseconds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ds.stop.timeout.milliseconds")]
    public ConfigNodePropertyInteger DsStopTimeoutMilliseconds { get; set; }

    /// <summary>
    /// Gets or Sets DsGlobalExtender
    /// </summary>
    [DataMember(Name="ds.global.extender", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ds.global.extender")]
    public ConfigNodePropertyBoolean DsGlobalExtender { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheFelixScrScrServiceProperties {\n");
      sb.Append("  DsLoglevel: ").Append(DsLoglevel).Append("\n");
      sb.Append("  DsFactoryEnabled: ").Append(DsFactoryEnabled).Append("\n");
      sb.Append("  DsDelayedKeepInstances: ").Append(DsDelayedKeepInstances).Append("\n");
      sb.Append("  DsLockTimeoutMilliseconds: ").Append(DsLockTimeoutMilliseconds).Append("\n");
      sb.Append("  DsStopTimeoutMilliseconds: ").Append(DsStopTimeoutMilliseconds).Append("\n");
      sb.Append("  DsGlobalExtender: ").Append(DsGlobalExtender).Append("\n");
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
