-module(openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties/0]).

-export([openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties/1]).

-export_type([openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties/0]).

-type openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties() ::
  [ {'com_adobe_cq_screens_analytics_impl_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'com_adobe_cq_screens_analytics_impl_apikey', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'com_adobe_cq_screens_analytics_impl_project', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'com_adobe_cq_screens_analytics_impl_environment', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'com_adobe_cq_screens_analytics_impl_sendFrequency', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties() ->
    openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties([]).

openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties(Fields) ->
  Default = [ {'com.adobe.cq.screens.analytics.impl.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'com.adobe.cq.screens.analytics.impl.apikey', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'com.adobe.cq.screens.analytics.impl.project', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'com.adobe.cq.screens.analytics.impl.environment', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'com.adobe.cq.screens.analytics.impl.sendFrequency', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

