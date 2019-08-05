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
  public class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties {
    /// <summary>
    /// Gets or Sets CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName
    /// </summary>
    [DataMember(Name="cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name")]
    public ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName { get; set; }

    /// <summary>
    /// Gets or Sets CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName
    /// </summary>
    [DataMember(Name="cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name")]
    public ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName { get; set; }

    /// <summary>
    /// Gets or Sets CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName
    /// </summary>
    [DataMember(Name="cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name")]
    public ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName { get; set; }

    /// <summary>
    /// Gets or Sets CqDamS7damVideoproxyclientserviceHttpReadtimeoutName
    /// </summary>
    [DataMember(Name="cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name")]
    public ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceHttpReadtimeoutName { get; set; }

    /// <summary>
    /// Gets or Sets CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName
    /// </summary>
    [DataMember(Name="cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name")]
    public ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName { get; set; }

    /// <summary>
    /// Gets or Sets CqDamS7damVideoproxyclientserviceHttpMaxretrycountName
    /// </summary>
    [DataMember(Name="cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name")]
    public ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceHttpMaxretrycountName { get; set; }

    /// <summary>
    /// Gets or Sets CqDamS7damVideoproxyclientserviceUploadprogressIntervalName
    /// </summary>
    [DataMember(Name="cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name")]
    public ConfigNodePropertyInteger CqDamS7damVideoproxyclientserviceUploadprogressIntervalName { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties {\n");
      sb.Append("  CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName: ").Append(CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName).Append("\n");
      sb.Append("  CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName: ").Append(CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName).Append("\n");
      sb.Append("  CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName: ").Append(CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName).Append("\n");
      sb.Append("  CqDamS7damVideoproxyclientserviceHttpReadtimeoutName: ").Append(CqDamS7damVideoproxyclientserviceHttpReadtimeoutName).Append("\n");
      sb.Append("  CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName: ").Append(CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName).Append("\n");
      sb.Append("  CqDamS7damVideoproxyclientserviceHttpMaxretrycountName: ").Append(CqDamS7damVideoproxyclientserviceHttpMaxretrycountName).Append("\n");
      sb.Append("  CqDamS7damVideoproxyclientserviceUploadprogressIntervalName: ").Append(CqDamS7damVideoproxyclientserviceUploadprogressIntervalName).Append("\n");
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
