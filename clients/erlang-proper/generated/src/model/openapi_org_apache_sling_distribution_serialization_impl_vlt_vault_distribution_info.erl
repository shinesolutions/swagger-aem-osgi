-module(openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_info/0]).

-export([openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_info/1]).

-export_type([openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_info/0]).

-type openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties:openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties() }
  ].


openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_info() ->
    openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_info([]).

openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties:openapi_org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

