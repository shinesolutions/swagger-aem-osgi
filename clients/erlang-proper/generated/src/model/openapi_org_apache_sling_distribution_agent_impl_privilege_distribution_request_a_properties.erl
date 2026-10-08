-module(openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties/0]).

-export([openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties/1]).

-export_type([openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties/0]).

-type openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jcrPrivilege', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties() ->
    openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties([]).

openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jcrPrivilege', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

