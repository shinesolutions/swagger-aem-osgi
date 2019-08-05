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
  public class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties {
    /// <summary>
    /// Gets or Sets ReplicationContentUseFileStorage
    /// </summary>
    [DataMember(Name="replication.content.useFileStorage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "replication.content.useFileStorage")]
    public ConfigNodePropertyBoolean ReplicationContentUseFileStorage { get; set; }

    /// <summary>
    /// Gets or Sets ReplicationContentMaxCommitAttempts
    /// </summary>
    [DataMember(Name="replication.content.maxCommitAttempts", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "replication.content.maxCommitAttempts")]
    public ConfigNodePropertyInteger ReplicationContentMaxCommitAttempts { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties {\n");
      sb.Append("  ReplicationContentUseFileStorage: ").Append(ReplicationContentUseFileStorage).Append("\n");
      sb.Append("  ReplicationContentMaxCommitAttempts: ").Append(ReplicationContentMaxCommitAttempts).Append("\n");
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
