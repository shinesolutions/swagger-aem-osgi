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
  public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties {
    /// <summary>
    /// Gets or Sets ServerType
    /// </summary>
    [DataMember(Name="server.type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "server.type")]
    public ConfigNodePropertyDropDown ServerType { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties {\n");
      sb.Append("  ServerType: ").Append(ServerType).Append("\n");
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
