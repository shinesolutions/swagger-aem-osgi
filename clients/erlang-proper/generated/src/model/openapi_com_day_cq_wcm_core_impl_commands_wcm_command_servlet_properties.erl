-module(openapi_com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties() ::
  [ {'wcmcommandservlet_delete_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties() ->
    openapi_com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties([]).

openapi_com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties(Fields) ->
  Default = [ {'wcmcommandservlet.delete_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

