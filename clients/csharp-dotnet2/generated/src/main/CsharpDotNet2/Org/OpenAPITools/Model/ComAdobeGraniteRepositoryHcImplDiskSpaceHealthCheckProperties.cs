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
  public class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties {
    /// <summary>
    /// Gets or Sets HcTags
    /// </summary>
    [DataMember(Name="hc.tags", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "hc.tags")]
    public ConfigNodePropertyArray HcTags { get; set; }

    /// <summary>
    /// Gets or Sets DiskSpaceWarnThreshold
    /// </summary>
    [DataMember(Name="disk.space.warn.threshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disk.space.warn.threshold")]
    public ConfigNodePropertyInteger DiskSpaceWarnThreshold { get; set; }

    /// <summary>
    /// Gets or Sets DiskSpaceErrorThreshold
    /// </summary>
    [DataMember(Name="disk.space.error.threshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disk.space.error.threshold")]
    public ConfigNodePropertyInteger DiskSpaceErrorThreshold { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties {\n");
      sb.Append("  HcTags: ").Append(HcTags).Append("\n");
      sb.Append("  DiskSpaceWarnThreshold: ").Append(DiskSpaceWarnThreshold).Append("\n");
      sb.Append("  DiskSpaceErrorThreshold: ").Append(DiskSpaceErrorThreshold).Append("\n");
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
