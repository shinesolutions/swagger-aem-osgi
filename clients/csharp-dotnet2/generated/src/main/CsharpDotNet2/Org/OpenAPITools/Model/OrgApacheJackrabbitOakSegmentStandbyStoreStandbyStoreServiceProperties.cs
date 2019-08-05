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
  public class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties {
    /// <summary>
    /// Gets or Sets OrgApacheSlingInstallerConfigurationPersist
    /// </summary>
    [DataMember(Name="org.apache.sling.installer.configuration.persist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.installer.configuration.persist")]
    public ConfigNodePropertyBoolean OrgApacheSlingInstallerConfigurationPersist { get; set; }

    /// <summary>
    /// Gets or Sets Mode
    /// </summary>
    [DataMember(Name="mode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mode")]
    public ConfigNodePropertyDropDown Mode { get; set; }

    /// <summary>
    /// Gets or Sets Port
    /// </summary>
    [DataMember(Name="port", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "port")]
    public ConfigNodePropertyInteger Port { get; set; }

    /// <summary>
    /// Gets or Sets PrimaryHost
    /// </summary>
    [DataMember(Name="primary.host", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "primary.host")]
    public ConfigNodePropertyString PrimaryHost { get; set; }

    /// <summary>
    /// Gets or Sets Interval
    /// </summary>
    [DataMember(Name="interval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "interval")]
    public ConfigNodePropertyInteger Interval { get; set; }

    /// <summary>
    /// Gets or Sets PrimaryAllowedClientIpRanges
    /// </summary>
    [DataMember(Name="primary.allowed-client-ip-ranges", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "primary.allowed-client-ip-ranges")]
    public ConfigNodePropertyArray PrimaryAllowedClientIpRanges { get; set; }

    /// <summary>
    /// Gets or Sets Secure
    /// </summary>
    [DataMember(Name="secure", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "secure")]
    public ConfigNodePropertyBoolean Secure { get; set; }

    /// <summary>
    /// Gets or Sets StandbyReadtimeout
    /// </summary>
    [DataMember(Name="standby.readtimeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "standby.readtimeout")]
    public ConfigNodePropertyInteger StandbyReadtimeout { get; set; }

    /// <summary>
    /// Gets or Sets StandbyAutoclean
    /// </summary>
    [DataMember(Name="standby.autoclean", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "standby.autoclean")]
    public ConfigNodePropertyBoolean StandbyAutoclean { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties {\n");
      sb.Append("  OrgApacheSlingInstallerConfigurationPersist: ").Append(OrgApacheSlingInstallerConfigurationPersist).Append("\n");
      sb.Append("  Mode: ").Append(Mode).Append("\n");
      sb.Append("  Port: ").Append(Port).Append("\n");
      sb.Append("  PrimaryHost: ").Append(PrimaryHost).Append("\n");
      sb.Append("  Interval: ").Append(Interval).Append("\n");
      sb.Append("  PrimaryAllowedClientIpRanges: ").Append(PrimaryAllowedClientIpRanges).Append("\n");
      sb.Append("  Secure: ").Append(Secure).Append("\n");
      sb.Append("  StandbyReadtimeout: ").Append(StandbyReadtimeout).Append("\n");
      sb.Append("  StandbyAutoclean: ").Append(StandbyAutoclean).Append("\n");
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
