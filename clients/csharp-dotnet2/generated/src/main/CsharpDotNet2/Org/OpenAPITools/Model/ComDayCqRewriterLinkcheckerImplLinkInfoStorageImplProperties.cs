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
  public class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties {
    /// <summary>
    /// Gets or Sets ServiceMaxLinksPerHost
    /// </summary>
    [DataMember(Name="service.max_links_per_host", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.max_links_per_host")]
    public ConfigNodePropertyInteger ServiceMaxLinksPerHost { get; set; }

    /// <summary>
    /// Gets or Sets ServiceSaveExternalLinkReferences
    /// </summary>
    [DataMember(Name="service.save_external_link_references", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.save_external_link_references")]
    public ConfigNodePropertyBoolean ServiceSaveExternalLinkReferences { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties {\n");
      sb.Append("  ServiceMaxLinksPerHost: ").Append(ServiceMaxLinksPerHost).Append("\n");
      sb.Append("  ServiceSaveExternalLinkReferences: ").Append(ServiceSaveExternalLinkReferences).Append("\n");
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
