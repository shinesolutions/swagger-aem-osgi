-module(openapi_org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi_properties/0]).

-type openapi_org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'serviceName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'nuggetsPath' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'name' := Name,
          'path' := Path,
          'serviceName' := ServiceName,
          'nuggetsPath' := NuggetsPath
        }) ->
    #{ 'name' => Name,
       'path' => Path,
       'serviceName' => ServiceName,
       'nuggetsPath' => NuggetsPath
     }.
