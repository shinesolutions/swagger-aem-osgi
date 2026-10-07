-module(openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties/0]).

-type openapi_org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_properties() ::
    #{ 'extensions' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'minDurationMs' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'maxDurationMs' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'compactLogFormat' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'extensions' := Extensions,
          'minDurationMs' := MinDurationMs,
          'maxDurationMs' := MaxDurationMs,
          'compactLogFormat' := CompactLogFormat
        }) ->
    #{ 'extensions' => Extensions,
       'minDurationMs' => MinDurationMs,
       'maxDurationMs' => MaxDurationMs,
       'compactLogFormat' => CompactLogFormat
     }.
