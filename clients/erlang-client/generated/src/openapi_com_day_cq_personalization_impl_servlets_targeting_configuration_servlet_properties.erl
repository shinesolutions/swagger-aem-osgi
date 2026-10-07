-module(openapi_com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_properties/0]).

-type openapi_com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_properties() ::
    #{ 'forcelocation' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'forcelocation' := Forcelocation
        }) ->
    #{ 'forcelocation' => Forcelocation
     }.
