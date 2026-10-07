-module(openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_info/0]).

-export([openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_info/1]).

-export_type([openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_info/0]).

-type openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties:openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties() }
  ].


openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_info() ->
    openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_info([]).

openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties:openapi_org_apache_sling_distribution_packaging_impl_importer_repository_distri_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

