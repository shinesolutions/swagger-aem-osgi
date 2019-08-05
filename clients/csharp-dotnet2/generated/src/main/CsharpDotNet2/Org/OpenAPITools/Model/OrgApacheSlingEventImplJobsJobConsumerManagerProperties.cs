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
  public class OrgApacheSlingEventImplJobsJobConsumerManagerProperties {
    /// <summary>
    /// Gets or Sets OrgApacheSlingInstallerConfigurationPersist
    /// </summary>
    [DataMember(Name="org.apache.sling.installer.configuration.persist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.installer.configuration.persist")]
    public ConfigNodePropertyBoolean OrgApacheSlingInstallerConfigurationPersist { get; set; }

    /// <summary>
    /// Gets or Sets JobConsumermanagerWhitelist
    /// </summary>
    [DataMember(Name="job.consumermanager.whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "job.consumermanager.whitelist")]
    public ConfigNodePropertyArray JobConsumermanagerWhitelist { get; set; }

    /// <summary>
    /// Gets or Sets JobConsumermanagerBlacklist
    /// </summary>
    [DataMember(Name="job.consumermanager.blacklist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "job.consumermanager.blacklist")]
    public ConfigNodePropertyArray JobConsumermanagerBlacklist { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingEventImplJobsJobConsumerManagerProperties {\n");
      sb.Append("  OrgApacheSlingInstallerConfigurationPersist: ").Append(OrgApacheSlingInstallerConfigurationPersist).Append("\n");
      sb.Append("  JobConsumermanagerWhitelist: ").Append(JobConsumermanagerWhitelist).Append("\n");
      sb.Append("  JobConsumermanagerBlacklist: ").Append(JobConsumermanagerBlacklist).Append("\n");
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
