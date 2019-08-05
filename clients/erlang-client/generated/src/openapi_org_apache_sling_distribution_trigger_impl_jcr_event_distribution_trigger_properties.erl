-module(openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties/0]).

-type openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'ignoredPathsPatterns' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'serviceName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'deep' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'name' := Name,
          'path' := Path,
          'ignoredPathsPatterns' := IgnoredPathsPatterns,
          'serviceName' := ServiceName,
          'deep' := Deep
        }) ->
    #{ 'name' => Name,
       'path' => Path,
       'ignoredPathsPatterns' => IgnoredPathsPatterns,
       'serviceName' => ServiceName,
       'deep' => Deep
     }.
