-module(openapi_org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties).

-export([encode/1]).

-export_type([openapi_org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties/0]).

-type openapi_org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties() ::
    #{ 'felix_memoryusage_dump_threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'felix_memoryusage_dump_interval' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'felix_memoryusage_dump_location' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'felix_memoryusage_dump_threshold' := FelixMemoryusageDumpThreshold,
          'felix_memoryusage_dump_interval' := FelixMemoryusageDumpInterval,
          'felix_memoryusage_dump_location' := FelixMemoryusageDumpLocation
        }) ->
    #{ 'felix.memoryusage.dump.threshold' => FelixMemoryusageDumpThreshold,
       'felix.memoryusage.dump.interval' => FelixMemoryusageDumpInterval,
       'felix.memoryusage.dump.location' => FelixMemoryusageDumpLocation
     }.
