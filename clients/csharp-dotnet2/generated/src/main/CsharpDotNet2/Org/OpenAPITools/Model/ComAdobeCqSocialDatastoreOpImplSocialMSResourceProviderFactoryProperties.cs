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
  public class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties {
    /// <summary>
    /// Gets or Sets SolrZkTimeout
    /// </summary>
    [DataMember(Name="solr.zk.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "solr.zk.timeout")]
    public ConfigNodePropertyString SolrZkTimeout { get; set; }

    /// <summary>
    /// Gets or Sets SolrCommit
    /// </summary>
    [DataMember(Name="solr.commit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "solr.commit")]
    public ConfigNodePropertyString SolrCommit { get; set; }

    /// <summary>
    /// Gets or Sets CacheOn
    /// </summary>
    [DataMember(Name="cache.on", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cache.on")]
    public ConfigNodePropertyBoolean CacheOn { get; set; }

    /// <summary>
    /// Gets or Sets ConcurrencyLevel
    /// </summary>
    [DataMember(Name="concurrency.level", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "concurrency.level")]
    public ConfigNodePropertyInteger ConcurrencyLevel { get; set; }

    /// <summary>
    /// Gets or Sets CacheStartSize
    /// </summary>
    [DataMember(Name="cache.start.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cache.start.size")]
    public ConfigNodePropertyInteger CacheStartSize { get; set; }

    /// <summary>
    /// Gets or Sets CacheTtl
    /// </summary>
    [DataMember(Name="cache.ttl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cache.ttl")]
    public ConfigNodePropertyInteger CacheTtl { get; set; }

    /// <summary>
    /// Gets or Sets CacheSize
    /// </summary>
    [DataMember(Name="cache.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cache.size")]
    public ConfigNodePropertyInteger CacheSize { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties {\n");
      sb.Append("  SolrZkTimeout: ").Append(SolrZkTimeout).Append("\n");
      sb.Append("  SolrCommit: ").Append(SolrCommit).Append("\n");
      sb.Append("  CacheOn: ").Append(CacheOn).Append("\n");
      sb.Append("  ConcurrencyLevel: ").Append(ConcurrencyLevel).Append("\n");
      sb.Append("  CacheStartSize: ").Append(CacheStartSize).Append("\n");
      sb.Append("  CacheTtl: ").Append(CacheTtl).Append("\n");
      sb.Append("  CacheSize: ").Append(CacheSize).Append("\n");
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
