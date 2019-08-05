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
  public class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties {
    /// <summary>
    /// Gets or Sets BrightedgeUrl
    /// </summary>
    [DataMember(Name="brightedge.url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "brightedge.url")]
    public ConfigNodePropertyString BrightedgeUrl { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties {\n");
      sb.Append("  BrightedgeUrl: ").Append(BrightedgeUrl).Append("\n");
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
