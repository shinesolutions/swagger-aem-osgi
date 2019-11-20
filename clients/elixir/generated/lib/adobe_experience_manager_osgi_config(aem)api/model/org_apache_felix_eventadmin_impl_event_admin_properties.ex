# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.OrgApacheFelixEventadminImplEventAdminProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"org.apache.felix.eventadmin.ThreadPoolSize",
    :"org.apache.felix.eventadmin.AsyncToSyncThreadRatio",
    :"org.apache.felix.eventadmin.Timeout",
    :"org.apache.felix.eventadmin.RequireTopic",
    :"org.apache.felix.eventadmin.IgnoreTimeout",
    :"org.apache.felix.eventadmin.IgnoreTopic"
  ]

  @type t :: %__MODULE__{
    :"org.apache.felix.eventadmin.ThreadPoolSize" => ConfigNodePropertyInteger,
    :"org.apache.felix.eventadmin.AsyncToSyncThreadRatio" => ConfigNodePropertyFloat,
    :"org.apache.felix.eventadmin.Timeout" => ConfigNodePropertyInteger,
    :"org.apache.felix.eventadmin.RequireTopic" => ConfigNodePropertyBoolean,
    :"org.apache.felix.eventadmin.IgnoreTimeout" => ConfigNodePropertyArray,
    :"org.apache.felix.eventadmin.IgnoreTopic" => ConfigNodePropertyArray
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.OrgApacheFelixEventadminImplEventAdminProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"org.apache.felix.eventadmin.ThreadPoolSize", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
    |> deserialize(:"org.apache.felix.eventadmin.AsyncToSyncThreadRatio", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyFloat, options)
    |> deserialize(:"org.apache.felix.eventadmin.Timeout", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
    |> deserialize(:"org.apache.felix.eventadmin.RequireTopic", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
    |> deserialize(:"org.apache.felix.eventadmin.IgnoreTimeout", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
    |> deserialize(:"org.apache.felix.eventadmin.IgnoreTopic", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyArray, options)
  end
end
