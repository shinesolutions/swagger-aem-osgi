-module(openapi_org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_properties() ::
    #{ 'providerType' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down()
     }.

encode(#{ 'providerType' := ProviderType
        }) ->
    #{ 'providerType' => ProviderType
     }.
