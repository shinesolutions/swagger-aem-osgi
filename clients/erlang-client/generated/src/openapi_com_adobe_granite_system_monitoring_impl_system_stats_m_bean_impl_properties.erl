-module(openapi_com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties/0]).

-type openapi_com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties() ::
    #{ 'scheduler_expression' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jmx_objectname' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'scheduler_expression' := SchedulerExpression,
          'jmx_objectname' := JmxObjectname
        }) ->
    #{ 'scheduler.expression' => SchedulerExpression,
       'jmx.objectname' => JmxObjectname
     }.
