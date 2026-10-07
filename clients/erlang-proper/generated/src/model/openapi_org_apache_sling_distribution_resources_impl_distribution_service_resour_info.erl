-module(openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_info/0]).

-export([openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_info/1]).

-export_type([openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_info/0]).

-type openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_properties:openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_properties() }
  ].


openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_info() ->
    openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_info([]).

openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_properties:openapi_org_apache_sling_distribution_resources_impl_distribution_service_resour_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

