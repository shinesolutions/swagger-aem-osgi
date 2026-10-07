-module(openapi_com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties() ::
    #{ 'wcmcommandservlet_delete_whitelist' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'wcmcommandservlet_delete_whitelist' := WcmcommandservletDeleteWhitelist
        }) ->
    #{ 'wcmcommandservlet.delete_whitelist' => WcmcommandservletDeleteWhitelist
     }.
