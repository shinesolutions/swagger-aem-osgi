-module(openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties/0]).

-type openapi_com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties() ::
    #{ 'com_adobe_cq_screens_analytics_impl_url' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'com_adobe_cq_screens_analytics_impl_apikey' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'com_adobe_cq_screens_analytics_impl_project' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'com_adobe_cq_screens_analytics_impl_environment' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'com_adobe_cq_screens_analytics_impl_sendFrequency' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'com_adobe_cq_screens_analytics_impl_url' := ComAdobeCqScreensAnalyticsImplUrl,
          'com_adobe_cq_screens_analytics_impl_apikey' := ComAdobeCqScreensAnalyticsImplApikey,
          'com_adobe_cq_screens_analytics_impl_project' := ComAdobeCqScreensAnalyticsImplProject,
          'com_adobe_cq_screens_analytics_impl_environment' := ComAdobeCqScreensAnalyticsImplEnvironment,
          'com_adobe_cq_screens_analytics_impl_sendFrequency' := ComAdobeCqScreensAnalyticsImplSendFrequency
        }) ->
    #{ 'com.adobe.cq.screens.analytics.impl.url' => ComAdobeCqScreensAnalyticsImplUrl,
       'com.adobe.cq.screens.analytics.impl.apikey' => ComAdobeCqScreensAnalyticsImplApikey,
       'com.adobe.cq.screens.analytics.impl.project' => ComAdobeCqScreensAnalyticsImplProject,
       'com.adobe.cq.screens.analytics.impl.environment' => ComAdobeCqScreensAnalyticsImplEnvironment,
       'com.adobe.cq.screens.analytics.impl.sendFrequency' => ComAdobeCqScreensAnalyticsImplSendFrequency
     }.
