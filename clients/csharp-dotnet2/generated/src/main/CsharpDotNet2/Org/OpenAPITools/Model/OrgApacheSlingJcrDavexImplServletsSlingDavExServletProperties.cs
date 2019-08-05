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
  public class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties {
    /// <summary>
    /// Gets or Sets Alias
    /// </summary>
    [DataMember(Name="alias", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "alias")]
    public ConfigNodePropertyString Alias { get; set; }

    /// <summary>
    /// Gets or Sets DavCreateAbsoluteUri
    /// </summary>
    [DataMember(Name="dav.create-absolute-uri", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dav.create-absolute-uri")]
    public ConfigNodePropertyBoolean DavCreateAbsoluteUri { get; set; }

    /// <summary>
    /// Gets or Sets DavProtectedhandlers
    /// </summary>
    [DataMember(Name="dav.protectedhandlers", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dav.protectedhandlers")]
    public ConfigNodePropertyString DavProtectedhandlers { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties {\n");
      sb.Append("  Alias: ").Append(Alias).Append("\n");
      sb.Append("  DavCreateAbsoluteUri: ").Append(DavCreateAbsoluteUri).Append("\n");
      sb.Append("  DavProtectedhandlers: ").Append(DavProtectedhandlers).Append("\n");
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
