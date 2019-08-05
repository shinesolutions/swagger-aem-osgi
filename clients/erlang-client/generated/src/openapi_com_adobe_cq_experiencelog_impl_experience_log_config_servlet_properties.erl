-module(openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties/0]).

-type openapi_com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties() ::
    #{ 'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'disabledForGroups' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'enabled' := Enabled,
          'disabledForGroups' := DisabledForGroups
        }) ->
    #{ 'enabled' => Enabled,
       'disabledForGroups' => DisabledForGroups
     }.
