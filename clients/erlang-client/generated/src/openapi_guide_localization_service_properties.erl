-module(openapi_guide_localization_service_properties).

-export([encode/1]).

-export_type([openapi_guide_localization_service_properties/0]).

-type openapi_guide_localization_service_properties() ::
    #{ 'supportedLocales' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'Localizable_Properties' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'supportedLocales' := SupportedLocales,
          'Localizable_Properties' := LocalizableProperties
        }) ->
    #{ 'supportedLocales' => SupportedLocales,
       'Localizable Properties' => LocalizableProperties
     }.
