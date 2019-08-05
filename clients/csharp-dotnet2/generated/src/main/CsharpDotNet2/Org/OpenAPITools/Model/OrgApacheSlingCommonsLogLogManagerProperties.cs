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
  public class OrgApacheSlingCommonsLogLogManagerProperties {
    /// <summary>
    /// Gets or Sets OrgApacheSlingCommonsLogLevel
    /// </summary>
    [DataMember(Name="org.apache.sling.commons.log.level", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.commons.log.level")]
    public ConfigNodePropertyDropDown OrgApacheSlingCommonsLogLevel { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheSlingCommonsLogFile
    /// </summary>
    [DataMember(Name="org.apache.sling.commons.log.file", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.commons.log.file")]
    public ConfigNodePropertyString OrgApacheSlingCommonsLogFile { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheSlingCommonsLogFileNumber
    /// </summary>
    [DataMember(Name="org.apache.sling.commons.log.file.number", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.commons.log.file.number")]
    public ConfigNodePropertyInteger OrgApacheSlingCommonsLogFileNumber { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheSlingCommonsLogFileSize
    /// </summary>
    [DataMember(Name="org.apache.sling.commons.log.file.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.commons.log.file.size")]
    public ConfigNodePropertyString OrgApacheSlingCommonsLogFileSize { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheSlingCommonsLogPattern
    /// </summary>
    [DataMember(Name="org.apache.sling.commons.log.pattern", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.commons.log.pattern")]
    public ConfigNodePropertyString OrgApacheSlingCommonsLogPattern { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheSlingCommonsLogConfigurationFile
    /// </summary>
    [DataMember(Name="org.apache.sling.commons.log.configurationFile", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.commons.log.configurationFile")]
    public ConfigNodePropertyString OrgApacheSlingCommonsLogConfigurationFile { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheSlingCommonsLogPackagingDataEnabled
    /// </summary>
    [DataMember(Name="org.apache.sling.commons.log.packagingDataEnabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.commons.log.packagingDataEnabled")]
    public ConfigNodePropertyBoolean OrgApacheSlingCommonsLogPackagingDataEnabled { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheSlingCommonsLogMaxCallerDataDepth
    /// </summary>
    [DataMember(Name="org.apache.sling.commons.log.maxCallerDataDepth", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.commons.log.maxCallerDataDepth")]
    public ConfigNodePropertyInteger OrgApacheSlingCommonsLogMaxCallerDataDepth { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheSlingCommonsLogMaxOldFileCountInDump
    /// </summary>
    [DataMember(Name="org.apache.sling.commons.log.maxOldFileCountInDump", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.commons.log.maxOldFileCountInDump")]
    public ConfigNodePropertyInteger OrgApacheSlingCommonsLogMaxOldFileCountInDump { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheSlingCommonsLogNumOfLines
    /// </summary>
    [DataMember(Name="org.apache.sling.commons.log.numOfLines", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.commons.log.numOfLines")]
    public ConfigNodePropertyInteger OrgApacheSlingCommonsLogNumOfLines { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingCommonsLogLogManagerProperties {\n");
      sb.Append("  OrgApacheSlingCommonsLogLevel: ").Append(OrgApacheSlingCommonsLogLevel).Append("\n");
      sb.Append("  OrgApacheSlingCommonsLogFile: ").Append(OrgApacheSlingCommonsLogFile).Append("\n");
      sb.Append("  OrgApacheSlingCommonsLogFileNumber: ").Append(OrgApacheSlingCommonsLogFileNumber).Append("\n");
      sb.Append("  OrgApacheSlingCommonsLogFileSize: ").Append(OrgApacheSlingCommonsLogFileSize).Append("\n");
      sb.Append("  OrgApacheSlingCommonsLogPattern: ").Append(OrgApacheSlingCommonsLogPattern).Append("\n");
      sb.Append("  OrgApacheSlingCommonsLogConfigurationFile: ").Append(OrgApacheSlingCommonsLogConfigurationFile).Append("\n");
      sb.Append("  OrgApacheSlingCommonsLogPackagingDataEnabled: ").Append(OrgApacheSlingCommonsLogPackagingDataEnabled).Append("\n");
      sb.Append("  OrgApacheSlingCommonsLogMaxCallerDataDepth: ").Append(OrgApacheSlingCommonsLogMaxCallerDataDepth).Append("\n");
      sb.Append("  OrgApacheSlingCommonsLogMaxOldFileCountInDump: ").Append(OrgApacheSlingCommonsLogMaxOldFileCountInDump).Append("\n");
      sb.Append("  OrgApacheSlingCommonsLogNumOfLines: ").Append(OrgApacheSlingCommonsLogNumOfLines).Append("\n");
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
