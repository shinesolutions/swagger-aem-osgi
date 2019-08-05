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
  public class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties {
    /// <summary>
    /// Gets or Sets AsyncConfigs
    /// </summary>
    [DataMember(Name="asyncConfigs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "asyncConfigs")]
    public ConfigNodePropertyArray AsyncConfigs { get; set; }

    /// <summary>
    /// Gets or Sets LeaseTimeOutMinutes
    /// </summary>
    [DataMember(Name="leaseTimeOutMinutes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "leaseTimeOutMinutes")]
    public ConfigNodePropertyInteger LeaseTimeOutMinutes { get; set; }

    /// <summary>
    /// Gets or Sets FailingIndexTimeoutSeconds
    /// </summary>
    [DataMember(Name="failingIndexTimeoutSeconds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "failingIndexTimeoutSeconds")]
    public ConfigNodePropertyInteger FailingIndexTimeoutSeconds { get; set; }

    /// <summary>
    /// Gets or Sets ErrorWarnIntervalSeconds
    /// </summary>
    [DataMember(Name="errorWarnIntervalSeconds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "errorWarnIntervalSeconds")]
    public ConfigNodePropertyInteger ErrorWarnIntervalSeconds { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties {\n");
      sb.Append("  AsyncConfigs: ").Append(AsyncConfigs).Append("\n");
      sb.Append("  LeaseTimeOutMinutes: ").Append(LeaseTimeOutMinutes).Append("\n");
      sb.Append("  FailingIndexTimeoutSeconds: ").Append(FailingIndexTimeoutSeconds).Append("\n");
      sb.Append("  ErrorWarnIntervalSeconds: ").Append(ErrorWarnIntervalSeconds).Append("\n");
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
