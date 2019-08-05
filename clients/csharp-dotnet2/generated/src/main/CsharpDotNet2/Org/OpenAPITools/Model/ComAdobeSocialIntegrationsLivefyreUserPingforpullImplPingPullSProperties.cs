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
  public class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties {
    /// <summary>
    /// Gets or Sets CommunitiesIntegrationLivefyreSlingEventFilter
    /// </summary>
    [DataMember(Name="communities.integration.livefyre.sling.event.filter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "communities.integration.livefyre.sling.event.filter")]
    public ConfigNodePropertyString CommunitiesIntegrationLivefyreSlingEventFilter { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties {\n");
      sb.Append("  CommunitiesIntegrationLivefyreSlingEventFilter: ").Append(CommunitiesIntegrationLivefyreSlingEventFilter).Append("\n");
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
