-module(openapi_com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties/0]).

-export([openapi_com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties/1]).

-export_type([openapi_com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties/0]).

-type openapi_com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties() ::
  [ {'reportingservices_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties() ->
    openapi_com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties([]).

openapi_com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_properties(Fields) ->
  Default = [ {'reportingservices.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

