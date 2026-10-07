-module(openapi_com_day_cq_polling_importer_impl_managed_poll_config_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_polling_importer_impl_managed_poll_config_impl_properties/0]).

-type openapi_com_day_cq_polling_importer_impl_managed_poll_config_impl_properties() ::
    #{ 'id' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'reference' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'interval' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'expression' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'source' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'target' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'login' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'password' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'id' := Id,
          'enabled' := Enabled,
          'reference' := Reference,
          'interval' := Interval,
          'expression' := Expression,
          'source' := Source,
          'target' := Target,
          'login' := Login,
          'password' := Password
        }) ->
    #{ 'id' => Id,
       'enabled' => Enabled,
       'reference' => Reference,
       'interval' => Interval,
       'expression' => Expression,
       'source' => Source,
       'target' => Target,
       'login' => Login,
       'password' => Password
     }.
