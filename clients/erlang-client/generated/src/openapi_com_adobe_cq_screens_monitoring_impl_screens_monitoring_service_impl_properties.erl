-module(openapi_com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties/0]).

-type openapi_com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties() ::
    #{ 'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_projectPath' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_scheduleFrequency' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_pingTimeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_recipients' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_smtpserver' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_smtpport' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_usetls' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_username' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_password' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_projectPath' := ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath,
          'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_scheduleFrequency' := ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency,
          'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_pingTimeout' := ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout,
          'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_recipients' := ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients,
          'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_smtpserver' := ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver,
          'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_smtpport' := ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport,
          'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_usetls' := ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls,
          'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_username' := ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername,
          'com_adobe_cq_screens_monitoring_impl_ScreensMonitoringServiceImpl_password' := ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword
        }) ->
    #{ 'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath' => ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath,
       'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency' => ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency,
       'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout' => ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout,
       'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients' => ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients,
       'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver' => ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver,
       'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport' => ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport,
       'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls' => ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls,
       'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username' => ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername,
       'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password' => ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword
     }.
