-module(openapi_com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties/0]).

-export([openapi_com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties/1]).

-export_type([openapi_com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties/0]).

-type openapi_com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties() ::
  [ {'scheduler_expression', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jmx_objectname', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties() ->
    openapi_com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties([]).

openapi_com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties(Fields) ->
  Default = [ {'scheduler.expression', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jmx.objectname', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

