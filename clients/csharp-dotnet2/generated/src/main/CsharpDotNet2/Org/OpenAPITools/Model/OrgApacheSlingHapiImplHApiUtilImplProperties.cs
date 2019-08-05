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
  public class OrgApacheSlingHapiImplHApiUtilImplProperties {
    /// <summary>
    /// Gets or Sets OrgApacheSlingHapiToolsResourcetype
    /// </summary>
    [DataMember(Name="org.apache.sling.hapi.tools.resourcetype", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.hapi.tools.resourcetype")]
    public ConfigNodePropertyString OrgApacheSlingHapiToolsResourcetype { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheSlingHapiToolsCollectionresourcetype
    /// </summary>
    [DataMember(Name="org.apache.sling.hapi.tools.collectionresourcetype", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.hapi.tools.collectionresourcetype")]
    public ConfigNodePropertyString OrgApacheSlingHapiToolsCollectionresourcetype { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheSlingHapiToolsSearchpaths
    /// </summary>
    [DataMember(Name="org.apache.sling.hapi.tools.searchpaths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.hapi.tools.searchpaths")]
    public ConfigNodePropertyArray OrgApacheSlingHapiToolsSearchpaths { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheSlingHapiToolsExternalurl
    /// </summary>
    [DataMember(Name="org.apache.sling.hapi.tools.externalurl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.hapi.tools.externalurl")]
    public ConfigNodePropertyString OrgApacheSlingHapiToolsExternalurl { get; set; }

    /// <summary>
    /// Gets or Sets OrgApacheSlingHapiToolsEnabled
    /// </summary>
    [DataMember(Name="org.apache.sling.hapi.tools.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "org.apache.sling.hapi.tools.enabled")]
    public ConfigNodePropertyBoolean OrgApacheSlingHapiToolsEnabled { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingHapiImplHApiUtilImplProperties {\n");
      sb.Append("  OrgApacheSlingHapiToolsResourcetype: ").Append(OrgApacheSlingHapiToolsResourcetype).Append("\n");
      sb.Append("  OrgApacheSlingHapiToolsCollectionresourcetype: ").Append(OrgApacheSlingHapiToolsCollectionresourcetype).Append("\n");
      sb.Append("  OrgApacheSlingHapiToolsSearchpaths: ").Append(OrgApacheSlingHapiToolsSearchpaths).Append("\n");
      sb.Append("  OrgApacheSlingHapiToolsExternalurl: ").Append(OrgApacheSlingHapiToolsExternalurl).Append("\n");
      sb.Append("  OrgApacheSlingHapiToolsEnabled: ").Append(OrgApacheSlingHapiToolsEnabled).Append("\n");
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
