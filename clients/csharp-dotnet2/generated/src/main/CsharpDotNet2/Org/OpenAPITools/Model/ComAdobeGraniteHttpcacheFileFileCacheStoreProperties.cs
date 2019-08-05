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
  public class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties {
    /// <summary>
    /// Gets or Sets ComAdobeGraniteHttpcacheFileDocumentRoot
    /// </summary>
    [DataMember(Name="com.adobe.granite.httpcache.file.documentRoot", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.granite.httpcache.file.documentRoot")]
    public ConfigNodePropertyString ComAdobeGraniteHttpcacheFileDocumentRoot { get; set; }

    /// <summary>
    /// Gets or Sets ComAdobeGraniteHttpcacheFileIncludeHost
    /// </summary>
    [DataMember(Name="com.adobe.granite.httpcache.file.includeHost", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.adobe.granite.httpcache.file.includeHost")]
    public ConfigNodePropertyString ComAdobeGraniteHttpcacheFileIncludeHost { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties {\n");
      sb.Append("  ComAdobeGraniteHttpcacheFileDocumentRoot: ").Append(ComAdobeGraniteHttpcacheFileDocumentRoot).Append("\n");
      sb.Append("  ComAdobeGraniteHttpcacheFileIncludeHost: ").Append(ComAdobeGraniteHttpcacheFileIncludeHost).Append("\n");
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
