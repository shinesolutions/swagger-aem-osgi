-module(openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory_properties/0]).

-type openapi_com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory_properties() ::
    #{ 'cq_analytics_adapterfactory_contextstores' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'cq_analytics_adapterfactory_contextstores' := CqAnalyticsAdapterfactoryContextstores
        }) ->
    #{ 'cq.analytics.adapterfactory.contextstores' => CqAnalyticsAdapterfactoryContextstores
     }.
