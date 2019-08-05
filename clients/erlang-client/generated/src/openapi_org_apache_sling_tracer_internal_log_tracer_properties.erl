-module(openapi_org_apache_sling_tracer_internal_log_tracer_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_tracer_internal_log_tracer_properties/0]).

-type openapi_org_apache_sling_tracer_internal_log_tracer_properties() ::
    #{ 'tracerSets' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'servletEnabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'recordingCacheSizeInMB' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'recordingCacheDurationInSecs' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'recordingCompressionEnabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'gzipResponse' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'tracerSets' := TracerSets,
          'enabled' := Enabled,
          'servletEnabled' := ServletEnabled,
          'recordingCacheSizeInMB' := RecordingCacheSizeInMB,
          'recordingCacheDurationInSecs' := RecordingCacheDurationInSecs,
          'recordingCompressionEnabled' := RecordingCompressionEnabled,
          'gzipResponse' := GzipResponse
        }) ->
    #{ 'tracerSets' => TracerSets,
       'enabled' => Enabled,
       'servletEnabled' => ServletEnabled,
       'recordingCacheSizeInMB' => RecordingCacheSizeInMB,
       'recordingCacheDurationInSecs' => RecordingCacheDurationInSecs,
       'recordingCompressionEnabled' => RecordingCompressionEnabled,
       'gzipResponse' => GzipResponse
     }.
