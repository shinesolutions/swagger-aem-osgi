-module(openapi_com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties/0]).

-export([openapi_com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties/1]).

-export_type([openapi_com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties/0]).

-type openapi_com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties() ::
  [ {'firewall_deserialization_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'firewall_deserialization_blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'firewall_deserialization_diagnostics', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties() ->
    openapi_com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties([]).

openapi_com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties(Fields) ->
  Default = [ {'firewall.deserialization.whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'firewall.deserialization.blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'firewall.deserialization.diagnostics', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

