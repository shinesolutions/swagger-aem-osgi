-module(openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_info/0]).

-export([openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_info/1]).

-export_type([openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_info/0]).

-type openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties:openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties() }
  ].


openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_info() ->
    openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_info([]).

openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties:openapi_org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

