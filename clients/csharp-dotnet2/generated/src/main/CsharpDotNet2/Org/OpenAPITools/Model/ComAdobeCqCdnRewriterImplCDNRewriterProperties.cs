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
  public class ComAdobeCqCdnRewriterImplCDNRewriterProperties {
    /// <summary>
    /// Gets or Sets ServiceRanking
    /// </summary>
    [DataMember(Name="service.ranking", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.ranking")]
    public ConfigNodePropertyInteger ServiceRanking { get; set; }

    /// <summary>
    /// Gets or Sets CdnrewriterAttributes
    /// </summary>
    [DataMember(Name="cdnrewriter.attributes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cdnrewriter.attributes")]
    public ConfigNodePropertyArray CdnrewriterAttributes { get; set; }

    /// <summary>
    /// Gets or Sets CdnRewriterDistributionDomain
    /// </summary>
    [DataMember(Name="cdn.rewriter.distribution.domain", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cdn.rewriter.distribution.domain")]
    public ConfigNodePropertyString CdnRewriterDistributionDomain { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqCdnRewriterImplCDNRewriterProperties {\n");
      sb.Append("  ServiceRanking: ").Append(ServiceRanking).Append("\n");
      sb.Append("  CdnrewriterAttributes: ").Append(CdnrewriterAttributes).Append("\n");
      sb.Append("  CdnRewriterDistributionDomain: ").Append(CdnRewriterDistributionDomain).Append("\n");
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
