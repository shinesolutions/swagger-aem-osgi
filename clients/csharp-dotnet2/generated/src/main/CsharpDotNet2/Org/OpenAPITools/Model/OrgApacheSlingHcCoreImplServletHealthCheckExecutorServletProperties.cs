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
  public class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties {
    /// <summary>
    /// Gets or Sets ServletPath
    /// </summary>
    [DataMember(Name="servletPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "servletPath")]
    public ConfigNodePropertyString ServletPath { get; set; }

    /// <summary>
    /// Gets or Sets Disabled
    /// </summary>
    [DataMember(Name="disabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disabled")]
    public ConfigNodePropertyBoolean Disabled { get; set; }

    /// <summary>
    /// Gets or Sets CorsAccessControlAllowOrigin
    /// </summary>
    [DataMember(Name="cors.accessControlAllowOrigin", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cors.accessControlAllowOrigin")]
    public ConfigNodePropertyString CorsAccessControlAllowOrigin { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties {\n");
      sb.Append("  ServletPath: ").Append(ServletPath).Append("\n");
      sb.Append("  Disabled: ").Append(Disabled).Append("\n");
      sb.Append("  CorsAccessControlAllowOrigin: ").Append(CorsAccessControlAllowOrigin).Append("\n");
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
