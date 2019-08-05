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
  public class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties {
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
    /// Gets or Sets OrgApacheSlingCommonsLogPattern
    /// </summary>
    [DataMember(Name="org.apache.sling.commons.log.pattern", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.commons.log.pattern")]
    public ConfigNodePropertyString OrgApacheSlingCommonsLogPattern { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheSlingCommonsLogNames
    /// </summary>
    [DataMember(Name="org.apache.sling.commons.log.names", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.commons.log.names")]
    public ConfigNodePropertyArray OrgApacheSlingCommonsLogNames { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheSlingCommonsLogAdditiv
    /// </summary>
    [DataMember(Name="org.apache.sling.commons.log.additiv", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.commons.log.additiv")]
    public ConfigNodePropertyBoolean OrgApacheSlingCommonsLogAdditiv { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties {\n");
      sb.Append("  OrgApacheSlingCommonsLogLevel: ").Append(OrgApacheSlingCommonsLogLevel).Append("\n");
      sb.Append("  OrgApacheSlingCommonsLogFile: ").Append(OrgApacheSlingCommonsLogFile).Append("\n");
      sb.Append("  OrgApacheSlingCommonsLogPattern: ").Append(OrgApacheSlingCommonsLogPattern).Append("\n");
      sb.Append("  OrgApacheSlingCommonsLogNames: ").Append(OrgApacheSlingCommonsLogNames).Append("\n");
      sb.Append("  OrgApacheSlingCommonsLogAdditiv: ").Append(OrgApacheSlingCommonsLogAdditiv).Append("\n");
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
