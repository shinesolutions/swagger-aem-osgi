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
  public class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties {
    /// <summary>
    /// Gets or Sets GroupListingPaginationEnable
    /// </summary>
    [DataMember(Name="group.listing.pagination.enable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group.listing.pagination.enable")]
    public ConfigNodePropertyBoolean GroupListingPaginationEnable { get; set; }

    /// <summary>
    /// Gets or Sets GroupListingLazyloadingEnable
    /// </summary>
    [DataMember(Name="group.listing.lazyloading.enable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "group.listing.lazyloading.enable")]
    public ConfigNodePropertyBoolean GroupListingLazyloadingEnable { get; set; }

    /// <summary>
    /// Gets or Sets PageSize
    /// </summary>
    [DataMember(Name="page.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "page.size")]
    public ConfigNodePropertyInteger PageSize { get; set; }

    /// <summary>
    /// Gets or Sets Priority
    /// </summary>
    [DataMember(Name="priority", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "priority")]
    public ConfigNodePropertyInteger Priority { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties {\n");
      sb.Append("  GroupListingPaginationEnable: ").Append(GroupListingPaginationEnable).Append("\n");
      sb.Append("  GroupListingLazyloadingEnable: ").Append(GroupListingLazyloadingEnable).Append("\n");
      sb.Append("  PageSize: ").Append(PageSize).Append("\n");
      sb.Append("  Priority: ").Append(Priority).Append("\n");
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
