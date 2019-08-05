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
  public class OrgApacheSlingTenantInternalTenantProviderImplProperties {
    /// <summary>
    /// Gets or Sets TenantRoot
    /// </summary>
    [DataMember(Name="tenant.root", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tenant.root")]
    public ConfigNodePropertyString TenantRoot { get; set; }

    /// <summary>
    /// Gets or Sets TenantPathMatcher
    /// </summary>
    [DataMember(Name="tenant.path.matcher", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tenant.path.matcher")]
    public ConfigNodePropertyArray TenantPathMatcher { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingTenantInternalTenantProviderImplProperties {\n");
      sb.Append("  TenantRoot: ").Append(TenantRoot).Append("\n");
      sb.Append("  TenantPathMatcher: ").Append(TenantPathMatcher).Append("\n");
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
