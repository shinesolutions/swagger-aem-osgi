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
  public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties {
    /// <summary>
    /// Gets or Sets SolrHttpUrl
    /// </summary>
    [DataMember(Name="solr.http.url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "solr.http.url")]
    public ConfigNodePropertyString SolrHttpUrl { get; set; }

    /// <summary>
    /// Gets or Sets SolrZkHost
    /// </summary>
    [DataMember(Name="solr.zk.host", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "solr.zk.host")]
    public ConfigNodePropertyString SolrZkHost { get; set; }

    /// <summary>
    /// Gets or Sets SolrCollection
    /// </summary>
    [DataMember(Name="solr.collection", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "solr.collection")]
    public ConfigNodePropertyString SolrCollection { get; set; }

    /// <summary>
    /// Gets or Sets SolrSocketTimeout
    /// </summary>
    [DataMember(Name="solr.socket.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "solr.socket.timeout")]
    public ConfigNodePropertyInteger SolrSocketTimeout { get; set; }

    /// <summary>
    /// Gets or Sets SolrConnectionTimeout
    /// </summary>
    [DataMember(Name="solr.connection.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "solr.connection.timeout")]
    public ConfigNodePropertyInteger SolrConnectionTimeout { get; set; }

    /// <summary>
    /// Gets or Sets SolrShardsNo
    /// </summary>
    [DataMember(Name="solr.shards.no", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "solr.shards.no")]
    public ConfigNodePropertyInteger SolrShardsNo { get; set; }

    /// <summary>
    /// Gets or Sets SolrReplicationFactor
    /// </summary>
    [DataMember(Name="solr.replication.factor", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "solr.replication.factor")]
    public ConfigNodePropertyInteger SolrReplicationFactor { get; set; }

    /// <summary>
    /// Gets or Sets SolrConfDir
    /// </summary>
    [DataMember(Name="solr.conf.dir", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "solr.conf.dir")]
    public ConfigNodePropertyString SolrConfDir { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties {\n");
      sb.Append("  SolrHttpUrl: ").Append(SolrHttpUrl).Append("\n");
      sb.Append("  SolrZkHost: ").Append(SolrZkHost).Append("\n");
      sb.Append("  SolrCollection: ").Append(SolrCollection).Append("\n");
      sb.Append("  SolrSocketTimeout: ").Append(SolrSocketTimeout).Append("\n");
      sb.Append("  SolrConnectionTimeout: ").Append(SolrConnectionTimeout).Append("\n");
      sb.Append("  SolrShardsNo: ").Append(SolrShardsNo).Append("\n");
      sb.Append("  SolrReplicationFactor: ").Append(SolrReplicationFactor).Append("\n");
      sb.Append("  SolrConfDir: ").Append(SolrConfDir).Append("\n");
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
