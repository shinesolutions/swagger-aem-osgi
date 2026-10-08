-module(openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties/0]).

-export([openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties/1]).

-export_type([openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties/0]).

-type openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties() ::
  [ {'reportingservices_proxy_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties() ->
    openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties([]).

openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties(Fields) ->
  Default = [ {'reportingservices.proxy.whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

