-module(openapi_com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor_info/0]).

-export([openapi_com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor_info/1]).

-export_type([openapi_com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor_info/0]).

-type openapi_com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor_properties:openapi_com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor_properties() }
  ].


openapi_com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor_info() ->
    openapi_com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor_info([]).

openapi_com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor_properties:openapi_com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

