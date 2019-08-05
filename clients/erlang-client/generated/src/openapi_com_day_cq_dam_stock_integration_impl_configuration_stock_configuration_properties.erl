-module(openapi_com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties/0]).

-type openapi_com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'locale' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'imsConfig' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'name' := Name,
          'locale' := Locale,
          'imsConfig' := ImsConfig
        }) ->
    #{ 'name' => Name,
       'locale' => Locale,
       'imsConfig' => ImsConfig
     }.
