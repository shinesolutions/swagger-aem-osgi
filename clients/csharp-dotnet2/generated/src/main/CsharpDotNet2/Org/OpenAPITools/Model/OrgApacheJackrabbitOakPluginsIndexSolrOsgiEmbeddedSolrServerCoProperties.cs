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
  public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties {
    /// <summary>
    /// Gets or Sets SolrHomePath
    /// </summary>
    [DataMember(Name="solr.home.path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "solr.home.path")]
    public ConfigNodePropertyString SolrHomePath { get; set; }

    /// <summary>
    /// Gets or Sets SolrCoreName
    /// </summary>
    [DataMember(Name="solr.core.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "solr.core.name")]
    public ConfigNodePropertyString SolrCoreName { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties {\n");
      sb.Append("  SolrHomePath: ").Append(SolrHomePath).Append("\n");
      sb.Append("  SolrCoreName: ").Append(SolrCoreName).Append("\n");
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
