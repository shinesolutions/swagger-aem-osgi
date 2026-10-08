-module(openapi_com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties/0]).

-export([openapi_com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties/1]).

-export_type([openapi_com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties/0]).

-type openapi_com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties() ::
  [ {'cq_analytics_testandtarget_api_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_analytics_testandtarget_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_analytics_testandtarget_sockettimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_analytics_testandtarget_recommendations_url_replace', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_analytics_testandtarget_recommendations_url_replacewith', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties() ->
    openapi_com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties([]).

openapi_com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties(Fields) ->
  Default = [ {'cq.analytics.testandtarget.api.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.analytics.testandtarget.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.analytics.testandtarget.sockettimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.analytics.testandtarget.recommendations.url.replace', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.analytics.testandtarget.recommendations.url.replacewith', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

