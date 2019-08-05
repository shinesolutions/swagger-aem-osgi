-module(openapi_org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties/0]).

-type openapi_org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'seconds' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'serviceName' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'name' := Name,
          'path' := Path,
          'seconds' := Seconds,
          'serviceName' := ServiceName
        }) ->
    #{ 'name' => Name,
       'path' => Path,
       'seconds' => Seconds,
       'serviceName' => ServiceName
     }.
