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
  public class OrgApacheSlingServletsResolverSlingServletResolverProperties {
    /// <summary>
    /// Gets or Sets ServletresolverServletRoot
    /// </summary>
    [DataMember(Name="servletresolver.servletRoot", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "servletresolver.servletRoot")]
    public ConfigNodePropertyString ServletresolverServletRoot { get; set; }

    /// <summary>
    /// Gets or Sets ServletresolverCacheSize
    /// </summary>
    [DataMember(Name="servletresolver.cacheSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "servletresolver.cacheSize")]
    public ConfigNodePropertyInteger ServletresolverCacheSize { get; set; }

    /// <summary>
    /// Gets or Sets ServletresolverPaths
    /// </summary>
    [DataMember(Name="servletresolver.paths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "servletresolver.paths")]
    public ConfigNodePropertyArray ServletresolverPaths { get; set; }

    /// <summary>
    /// Gets or Sets ServletresolverDefaultExtensions
    /// </summary>
    [DataMember(Name="servletresolver.defaultExtensions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "servletresolver.defaultExtensions")]
    public ConfigNodePropertyArray ServletresolverDefaultExtensions { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingServletsResolverSlingServletResolverProperties {\n");
      sb.Append("  ServletresolverServletRoot: ").Append(ServletresolverServletRoot).Append("\n");
      sb.Append("  ServletresolverCacheSize: ").Append(ServletresolverCacheSize).Append("\n");
      sb.Append("  ServletresolverPaths: ").Append(ServletresolverPaths).Append("\n");
      sb.Append("  ServletresolverDefaultExtensions: ").Append(ServletresolverDefaultExtensions).Append("\n");
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
