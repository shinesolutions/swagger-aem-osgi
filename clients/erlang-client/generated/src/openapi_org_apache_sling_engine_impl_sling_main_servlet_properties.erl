-module(openapi_org_apache_sling_engine_impl_sling_main_servlet_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_engine_impl_sling_main_servlet_properties/0]).

-type openapi_org_apache_sling_engine_impl_sling_main_servlet_properties() ::
    #{ 'sling_max_calls' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'sling_max_inclusions' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'sling_trace_allow' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'sling_max_record_requests' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'sling_store_pattern_requests' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'sling_serverinfo' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_additional_response_headers' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'sling_max_calls' := SlingMaxCalls,
          'sling_max_inclusions' := SlingMaxInclusions,
          'sling_trace_allow' := SlingTraceAllow,
          'sling_max_record_requests' := SlingMaxRecordRequests,
          'sling_store_pattern_requests' := SlingStorePatternRequests,
          'sling_serverinfo' := SlingServerinfo,
          'sling_additional_response_headers' := SlingAdditionalResponseHeaders
        }) ->
    #{ 'sling.max.calls' => SlingMaxCalls,
       'sling.max.inclusions' => SlingMaxInclusions,
       'sling.trace.allow' => SlingTraceAllow,
       'sling.max.record.requests' => SlingMaxRecordRequests,
       'sling.store.pattern.requests' => SlingStorePatternRequests,
       'sling.serverinfo' => SlingServerinfo,
       'sling.additional.response.headers' => SlingAdditionalResponseHeaders
     }.
