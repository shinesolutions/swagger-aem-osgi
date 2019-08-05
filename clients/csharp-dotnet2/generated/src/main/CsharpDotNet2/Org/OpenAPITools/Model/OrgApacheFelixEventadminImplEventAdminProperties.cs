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
  public class OrgApacheFelixEventadminImplEventAdminProperties {
    /// <summary>
    /// Gets or Sets OrgApacheFelixEventadminThreadPoolSize
    /// </summary>
    [DataMember(Name="org.apache.felix.eventadmin.ThreadPoolSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.eventadmin.ThreadPoolSize")]
    public ConfigNodePropertyInteger OrgApacheFelixEventadminThreadPoolSize { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixEventadminAsyncToSyncThreadRatio
    /// </summary>
    [DataMember(Name="org.apache.felix.eventadmin.AsyncToSyncThreadRatio", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.eventadmin.AsyncToSyncThreadRatio")]
    public ConfigNodePropertyFloat OrgApacheFelixEventadminAsyncToSyncThreadRatio { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixEventadminTimeout
    /// </summary>
    [DataMember(Name="org.apache.felix.eventadmin.Timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.eventadmin.Timeout")]
    public ConfigNodePropertyInteger OrgApacheFelixEventadminTimeout { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixEventadminRequireTopic
    /// </summary>
    [DataMember(Name="org.apache.felix.eventadmin.RequireTopic", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.eventadmin.RequireTopic")]
    public ConfigNodePropertyBoolean OrgApacheFelixEventadminRequireTopic { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixEventadminIgnoreTimeout
    /// </summary>
    [DataMember(Name="org.apache.felix.eventadmin.IgnoreTimeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.eventadmin.IgnoreTimeout")]
    public ConfigNodePropertyArray OrgApacheFelixEventadminIgnoreTimeout { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheFelixEventadminIgnoreTopic
    /// </summary>
    [DataMember(Name="org.apache.felix.eventadmin.IgnoreTopic", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.felix.eventadmin.IgnoreTopic")]
    public ConfigNodePropertyArray OrgApacheFelixEventadminIgnoreTopic { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheFelixEventadminImplEventAdminProperties {\n");
      sb.Append("  OrgApacheFelixEventadminThreadPoolSize: ").Append(OrgApacheFelixEventadminThreadPoolSize).Append("\n");
      sb.Append("  OrgApacheFelixEventadminAsyncToSyncThreadRatio: ").Append(OrgApacheFelixEventadminAsyncToSyncThreadRatio).Append("\n");
      sb.Append("  OrgApacheFelixEventadminTimeout: ").Append(OrgApacheFelixEventadminTimeout).Append("\n");
      sb.Append("  OrgApacheFelixEventadminRequireTopic: ").Append(OrgApacheFelixEventadminRequireTopic).Append("\n");
      sb.Append("  OrgApacheFelixEventadminIgnoreTimeout: ").Append(OrgApacheFelixEventadminIgnoreTimeout).Append("\n");
      sb.Append("  OrgApacheFelixEventadminIgnoreTopic: ").Append(OrgApacheFelixEventadminIgnoreTopic).Append("\n");
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
