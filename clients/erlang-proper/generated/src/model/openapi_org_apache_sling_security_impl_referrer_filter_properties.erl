-module(openapi_org_apache_sling_security_impl_referrer_filter_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_security_impl_referrer_filter_properties/0]).

-export([openapi_org_apache_sling_security_impl_referrer_filter_properties/1]).

-export_type([openapi_org_apache_sling_security_impl_referrer_filter_properties/0]).

-type openapi_org_apache_sling_security_impl_referrer_filter_properties() ::
  [ {'allow_empty', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'allow_hosts', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'allow_hosts_regexp', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'filter_methods', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'exclude_agents_regexp', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_security_impl_referrer_filter_properties() ->
    openapi_org_apache_sling_security_impl_referrer_filter_properties([]).

openapi_org_apache_sling_security_impl_referrer_filter_properties(Fields) ->
  Default = [ {'allow.empty', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'allow.hosts', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'allow.hosts.regexp', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'filter.methods', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'exclude.agents.regexp', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

