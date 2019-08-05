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
  public class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {
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
    /// Gets or Sets OrgApacheSlingCommonsLogFileBuffered
    /// </summary>
    [DataMember(Name="org.apache.sling.commons.log.file.buffered", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.commons.log.file.buffered")]
    public ConfigNodePropertyBoolean OrgApacheSlingCommonsLogFileBuffered { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {\n");
      sb.Append("  OrgApacheSlingCommonsLogFile: ").Append(OrgApacheSlingCommonsLogFile).Append("\n");
      sb.Append("  OrgApacheSlingCommonsLogFileNumber: ").Append(OrgApacheSlingCommonsLogFileNumber).Append("\n");
      sb.Append("  OrgApacheSlingCommonsLogFileSize: ").Append(OrgApacheSlingCommonsLogFileSize).Append("\n");
      sb.Append("  OrgApacheSlingCommonsLogFileBuffered: ").Append(OrgApacheSlingCommonsLogFileBuffered).Append("\n");
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
