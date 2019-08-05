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
  public class ComDayCqReportingImplConfigServiceImplProperties {
    /// <summary>
    /// Gets or Sets RepconfTimezone
    /// </summary>
    [DataMember(Name="repconf.timezone", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repconf.timezone")]
    public ConfigNodePropertyString RepconfTimezone { get; set; }

    /// <summary>
    /// Gets or Sets RepconfLocale
    /// </summary>
    [DataMember(Name="repconf.locale", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repconf.locale")]
    public ConfigNodePropertyString RepconfLocale { get; set; }

    /// <summary>
    /// Gets or Sets RepconfSnapshots
    /// </summary>
    [DataMember(Name="repconf.snapshots", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repconf.snapshots")]
    public ConfigNodePropertyString RepconfSnapshots { get; set; }

    /// <summary>
    /// Gets or Sets RepconfRepdir
    /// </summary>
    [DataMember(Name="repconf.repdir", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repconf.repdir")]
    public ConfigNodePropertyString RepconfRepdir { get; set; }

    /// <summary>
    /// Gets or Sets RepconfHourofday
    /// </summary>
    [DataMember(Name="repconf.hourofday", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repconf.hourofday")]
    public ConfigNodePropertyInteger RepconfHourofday { get; set; }

    /// <summary>
    /// Gets or Sets RepconfMinofhour
    /// </summary>
    [DataMember(Name="repconf.minofhour", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repconf.minofhour")]
    public ConfigNodePropertyInteger RepconfMinofhour { get; set; }

    /// <summary>
    /// Gets or Sets RepconfMaxrows
    /// </summary>
    [DataMember(Name="repconf.maxrows", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repconf.maxrows")]
    public ConfigNodePropertyInteger RepconfMaxrows { get; set; }

    /// <summary>
    /// Gets or Sets RepconfFakedata
    /// </summary>
    [DataMember(Name="repconf.fakedata", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repconf.fakedata")]
    public ConfigNodePropertyBoolean RepconfFakedata { get; set; }

    /// <summary>
    /// Gets or Sets RepconfSnapshotuser
    /// </summary>
    [DataMember(Name="repconf.snapshotuser", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repconf.snapshotuser")]
    public ConfigNodePropertyString RepconfSnapshotuser { get; set; }

    /// <summary>
    /// Gets or Sets RepconfEnforcesnapshotuser
    /// </summary>
    [DataMember(Name="repconf.enforcesnapshotuser", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repconf.enforcesnapshotuser")]
    public ConfigNodePropertyBoolean RepconfEnforcesnapshotuser { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqReportingImplConfigServiceImplProperties {\n");
      sb.Append("  RepconfTimezone: ").Append(RepconfTimezone).Append("\n");
      sb.Append("  RepconfLocale: ").Append(RepconfLocale).Append("\n");
      sb.Append("  RepconfSnapshots: ").Append(RepconfSnapshots).Append("\n");
      sb.Append("  RepconfRepdir: ").Append(RepconfRepdir).Append("\n");
      sb.Append("  RepconfHourofday: ").Append(RepconfHourofday).Append("\n");
      sb.Append("  RepconfMinofhour: ").Append(RepconfMinofhour).Append("\n");
      sb.Append("  RepconfMaxrows: ").Append(RepconfMaxrows).Append("\n");
      sb.Append("  RepconfFakedata: ").Append(RepconfFakedata).Append("\n");
      sb.Append("  RepconfSnapshotuser: ").Append(RepconfSnapshotuser).Append("\n");
      sb.Append("  RepconfEnforcesnapshotuser: ").Append(RepconfEnforcesnapshotuser).Append("\n");
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
