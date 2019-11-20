# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComAdobeGraniteHttpcacheFileFileCacheStoreProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"com.adobe.granite.httpcache.file.documentRoot",
    :"com.adobe.granite.httpcache.file.includeHost"
  ]

  @type t :: %__MODULE__{
    :"com.adobe.granite.httpcache.file.documentRoot" => ConfigNodePropertyString,
    :"com.adobe.granite.httpcache.file.includeHost" => ConfigNodePropertyString
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComAdobeGraniteHttpcacheFileFileCacheStoreProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"com.adobe.granite.httpcache.file.documentRoot", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
    |> deserialize(:"com.adobe.granite.httpcache.file.includeHost", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyString, options)
  end
end
