-module(openapi_com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl_properties/0]).

-export([openapi_com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl_properties/1]).

-export_type([openapi_com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl_properties/0]).

-type openapi_com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl_properties() ::
  [ {'enableFallback', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl_properties() ->
    openapi_com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl_properties([]).

openapi_com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl_properties(Fields) ->
  Default = [ {'enableFallback', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

