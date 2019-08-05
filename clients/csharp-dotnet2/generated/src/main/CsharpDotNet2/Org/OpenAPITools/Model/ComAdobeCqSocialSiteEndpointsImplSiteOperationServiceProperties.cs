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
  public class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties {
    /// <summary>
    /// Gets or Sets FieldWhitelist
    /// </summary>
    [DataMember(Name="fieldWhitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fieldWhitelist")]
    public ConfigNodePropertyArray FieldWhitelist { get; set; }

    /// <summary>
    /// Gets or Sets SitePathFilters
    /// </summary>
    [DataMember(Name="sitePathFilters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sitePathFilters")]
    public ConfigNodePropertyArray SitePathFilters { get; set; }

    /// <summary>
    /// Gets or Sets SitePackageGroup
    /// </summary>
    [DataMember(Name="sitePackageGroup", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sitePackageGroup")]
    public ConfigNodePropertyString SitePackageGroup { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties {\n");
      sb.Append("  FieldWhitelist: ").Append(FieldWhitelist).Append("\n");
      sb.Append("  SitePathFilters: ").Append(SitePathFilters).Append("\n");
      sb.Append("  SitePackageGroup: ").Append(SitePackageGroup).Append("\n");
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
