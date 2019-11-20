# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"purgeCompleted",
    :"completedAge",
    :"purgeActive",
    :"activeAge",
    :"saveThreshold"
  ]

  @type t :: %__MODULE__{
    :"purgeCompleted" => ConfigNodePropertyBoolean,
    :"completedAge" => ConfigNodePropertyInteger,
    :"purgeActive" => ConfigNodePropertyBoolean,
    :"activeAge" => ConfigNodePropertyInteger,
    :"saveThreshold" => ConfigNodePropertyInteger
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManagerOSGIConfig(AEM)API.Model.ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties do
  import AdobeExperienceManagerOSGIConfig(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"purgeCompleted", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
    |> deserialize(:"completedAge", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
    |> deserialize(:"purgeActive", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyBoolean, options)
    |> deserialize(:"activeAge", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
    |> deserialize(:"saveThreshold", :struct, AdobeExperienceManagerOSGIConfig(AEM)API.Model.ConfigNodePropertyInteger, options)
  end
end
