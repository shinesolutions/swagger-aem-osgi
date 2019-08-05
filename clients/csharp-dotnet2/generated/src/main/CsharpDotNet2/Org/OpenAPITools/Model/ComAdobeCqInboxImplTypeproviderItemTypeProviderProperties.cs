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
  public class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties {
    /// <summary>
    /// Gets or Sets InboxImplTypeproviderRegistrypaths
    /// </summary>
    [DataMember(Name="inbox.impl.typeprovider.registrypaths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "inbox.impl.typeprovider.registrypaths")]
    public ConfigNodePropertyArray InboxImplTypeproviderRegistrypaths { get; set; }

    /// <summary>
    /// Gets or Sets InboxImplTypeproviderLegacypaths
    /// </summary>
    [DataMember(Name="inbox.impl.typeprovider.legacypaths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "inbox.impl.typeprovider.legacypaths")]
    public ConfigNodePropertyArray InboxImplTypeproviderLegacypaths { get; set; }

    /// <summary>
    /// Gets or Sets InboxImplTypeproviderDefaulturlFailureitem
    /// </summary>
    [DataMember(Name="inbox.impl.typeprovider.defaulturl.failureitem", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "inbox.impl.typeprovider.defaulturl.failureitem")]
    public ConfigNodePropertyString InboxImplTypeproviderDefaulturlFailureitem { get; set; }

    /// <summary>
    /// Gets or Sets InboxImplTypeproviderDefaulturlWorkitem
    /// </summary>
    [DataMember(Name="inbox.impl.typeprovider.defaulturl.workitem", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "inbox.impl.typeprovider.defaulturl.workitem")]
    public ConfigNodePropertyString InboxImplTypeproviderDefaulturlWorkitem { get; set; }

    /// <summary>
    /// Gets or Sets InboxImplTypeproviderDefaulturlTask
    /// </summary>
    [DataMember(Name="inbox.impl.typeprovider.defaulturl.task", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "inbox.impl.typeprovider.defaulturl.task")]
    public ConfigNodePropertyString InboxImplTypeproviderDefaulturlTask { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties {\n");
      sb.Append("  InboxImplTypeproviderRegistrypaths: ").Append(InboxImplTypeproviderRegistrypaths).Append("\n");
      sb.Append("  InboxImplTypeproviderLegacypaths: ").Append(InboxImplTypeproviderLegacypaths).Append("\n");
      sb.Append("  InboxImplTypeproviderDefaulturlFailureitem: ").Append(InboxImplTypeproviderDefaulturlFailureitem).Append("\n");
      sb.Append("  InboxImplTypeproviderDefaulturlWorkitem: ").Append(InboxImplTypeproviderDefaulturlWorkitem).Append("\n");
      sb.Append("  InboxImplTypeproviderDefaulturlTask: ").Append(InboxImplTypeproviderDefaulturlTask).Append("\n");
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
