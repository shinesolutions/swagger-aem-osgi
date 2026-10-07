-module(openapi_com_adobe_granite_translation_core_impl_translation_manager_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_translation_core_impl_translation_manager_impl_properties/0]).

-type openapi_com_adobe_granite_translation_core_impl_translation_manager_impl_properties() ::
    #{ 'defaultConnectorName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'defaultCategory' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'defaultConnectorName' := DefaultConnectorName,
          'defaultCategory' := DefaultCategory
        }) ->
    #{ 'defaultConnectorName' => DefaultConnectorName,
       'defaultCategory' => DefaultCategory
     }.
