-module(openapi_com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_info/0]).

-export([openapi_com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_info/1]).

-export_type([openapi_com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_info/0]).

-type openapi_com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties:openapi_com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties() }
  ].


openapi_com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_info() ->
    openapi_com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_info([]).

openapi_com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties:openapi_com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

