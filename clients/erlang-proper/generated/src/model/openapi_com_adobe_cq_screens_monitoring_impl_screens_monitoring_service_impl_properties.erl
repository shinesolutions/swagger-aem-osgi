-module(openapi_com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties/0]).

-export([openapi_com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties/1]).

-export_type([openapi_com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties/0]).

-type openapi_com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties() ::
  [ {'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_projectPath', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_scheduleFrequency', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_pingTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_recipients', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_smtpserver', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_smtpport', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_usetls', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_username', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_password', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties() ->
    openapi_com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties([]).

openapi_com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties(Fields) ->
  Default = [ {'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

