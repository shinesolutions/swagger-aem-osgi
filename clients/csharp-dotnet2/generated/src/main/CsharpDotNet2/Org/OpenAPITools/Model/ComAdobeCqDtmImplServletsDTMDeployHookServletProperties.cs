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
  public class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties {
    /// <summary>
    /// Gets or Sets DtmStagingIpWhitelist
    /// </summary>
    [DataMember(Name="dtm.staging.ip.whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dtm.staging.ip.whitelist")]
    public ConfigNodePropertyArray DtmStagingIpWhitelist { get; set; }

    /// <summary>
    /// Gets or Sets DtmProductionIpWhitelist
    /// </summary>
    [DataMember(Name="dtm.production.ip.whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dtm.production.ip.whitelist")]
    public ConfigNodePropertyArray DtmProductionIpWhitelist { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties {\n");
      sb.Append("  DtmStagingIpWhitelist: ").Append(DtmStagingIpWhitelist).Append("\n");
      sb.Append("  DtmProductionIpWhitelist: ").Append(DtmProductionIpWhitelist).Append("\n");
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
