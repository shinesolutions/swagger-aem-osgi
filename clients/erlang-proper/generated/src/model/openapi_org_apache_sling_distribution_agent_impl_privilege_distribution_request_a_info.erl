-module(openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_info/0]).

-export([openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_info/1]).

-export_type([openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_info/0]).

-type openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties:openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties() }
  ].


openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_info() ->
    openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_info([]).

openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties:openapi_org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

