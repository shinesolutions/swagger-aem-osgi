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
  public class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties {
    /// <summary>
    /// Gets or Sets ReportingservicesProxyWhitelist
    /// </summary>
    [DataMember(Name="reportingservices.proxy.whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "reportingservices.proxy.whitelist")]
    public ConfigNodePropertyArray ReportingservicesProxyWhitelist { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties {\n");
      sb.Append("  ReportingservicesProxyWhitelist: ").Append(ReportingservicesProxyWhitelist).Append("\n");
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
