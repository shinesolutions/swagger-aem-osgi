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
  public class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties {
    /// <summary>
    /// Gets or Sets CdnConfigDistributionDomain
    /// </summary>
    [DataMember(Name="cdn.config.distribution.domain", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cdn.config.distribution.domain")]
    public ConfigNodePropertyString CdnConfigDistributionDomain { get; set; }

    /// <summary>
    /// Gets or Sets CdnConfigEnableRewriting
    /// </summary>
    [DataMember(Name="cdn.config.enable.rewriting", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cdn.config.enable.rewriting")]
    public ConfigNodePropertyBoolean CdnConfigEnableRewriting { get; set; }

    /// <summary>
    /// Gets or Sets CdnConfigPathPrefixes
    /// </summary>
    [DataMember(Name="cdn.config.path.prefixes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cdn.config.path.prefixes")]
    public ConfigNodePropertyArray CdnConfigPathPrefixes { get; set; }

    /// <summary>
    /// Gets or Sets CdnConfigCdnttl
    /// </summary>
    [DataMember(Name="cdn.config.cdnttl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cdn.config.cdnttl")]
    public ConfigNodePropertyInteger CdnConfigCdnttl { get; set; }

    /// <summary>
    /// Gets or Sets CdnConfigApplicationProtocol
    /// </summary>
    [DataMember(Name="cdn.config.application.protocol", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cdn.config.application.protocol")]
    public ConfigNodePropertyString CdnConfigApplicationProtocol { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties {\n");
      sb.Append("  CdnConfigDistributionDomain: ").Append(CdnConfigDistributionDomain).Append("\n");
      sb.Append("  CdnConfigEnableRewriting: ").Append(CdnConfigEnableRewriting).Append("\n");
      sb.Append("  CdnConfigPathPrefixes: ").Append(CdnConfigPathPrefixes).Append("\n");
      sb.Append("  CdnConfigCdnttl: ").Append(CdnConfigCdnttl).Append("\n");
      sb.Append("  CdnConfigApplicationProtocol: ").Append(CdnConfigApplicationProtocol).Append("\n");
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
