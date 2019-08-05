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
  public class ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties {
    /// <summary>
    /// Gets or Sets ComAdobeGraniteHttpcacheUrlPaths
    /// </summary>
    [DataMember(Name="com.adobe.granite.httpcache.url.paths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.granite.httpcache.url.paths")]
    public ConfigNodePropertyArray ComAdobeGraniteHttpcacheUrlPaths { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties {\n");
      sb.Append("  ComAdobeGraniteHttpcacheUrlPaths: ").Append(ComAdobeGraniteHttpcacheUrlPaths).Append("\n");
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
