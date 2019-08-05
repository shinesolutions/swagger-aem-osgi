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
  public class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties {
    /// <summary>
    /// Gets or Sets CqDamAdhocAssetSharePrezipMaxcontentsize
    /// </summary>
    [DataMember(Name="cq.dam.adhoc.asset.share.prezip.maxcontentsize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.adhoc.asset.share.prezip.maxcontentsize")]
    public ConfigNodePropertyInteger CqDamAdhocAssetSharePrezipMaxcontentsize { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties {\n");
      sb.Append("  CqDamAdhocAssetSharePrezipMaxcontentsize: ").Append(CqDamAdhocAssetSharePrezipMaxcontentsize).Append("\n");
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
