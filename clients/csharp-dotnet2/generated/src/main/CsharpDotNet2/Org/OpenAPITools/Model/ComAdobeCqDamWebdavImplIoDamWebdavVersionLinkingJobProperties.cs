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
  public class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties {
    /// <summary>
    /// Gets or Sets CqDamWebdavVersionLinkingEnable
    /// </summary>
    [DataMember(Name="cq.dam.webdav.version.linking.enable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.webdav.version.linking.enable")]
    public ConfigNodePropertyBoolean CqDamWebdavVersionLinkingEnable { get; set; }

    /// <summary>
    /// Gets or Sets CqDamWebdavVersionLinkingSchedulerPeriod
    /// </summary>
    [DataMember(Name="cq.dam.webdav.version.linking.scheduler.period", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.webdav.version.linking.scheduler.period")]
    public ConfigNodePropertyInteger CqDamWebdavVersionLinkingSchedulerPeriod { get; set; }

    /// <summary>
    /// Gets or Sets CqDamWebdavVersionLinkingStagingTimeout
    /// </summary>
    [DataMember(Name="cq.dam.webdav.version.linking.staging.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.webdav.version.linking.staging.timeout")]
    public ConfigNodePropertyInteger CqDamWebdavVersionLinkingStagingTimeout { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties {\n");
      sb.Append("  CqDamWebdavVersionLinkingEnable: ").Append(CqDamWebdavVersionLinkingEnable).Append("\n");
      sb.Append("  CqDamWebdavVersionLinkingSchedulerPeriod: ").Append(CqDamWebdavVersionLinkingSchedulerPeriod).Append("\n");
      sb.Append("  CqDamWebdavVersionLinkingStagingTimeout: ").Append(CqDamWebdavVersionLinkingStagingTimeout).Append("\n");
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
