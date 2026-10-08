-module(openapi_com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties/0]).

-export([openapi_com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties/1]).

-export_type([openapi_com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties/0]).

-type openapi_com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties() ::
  [ {'threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'jobTopicName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'emailEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties() ->
    openapi_com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties([]).

openapi_com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties(Fields) ->
  Default = [ {'threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'jobTopicName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'emailEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

