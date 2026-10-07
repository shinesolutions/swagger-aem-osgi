-module(openapi_org_apache_sling_tracer_internal_log_tracer_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_tracer_internal_log_tracer_properties/0]).

-export([openapi_org_apache_sling_tracer_internal_log_tracer_properties/1]).

-export_type([openapi_org_apache_sling_tracer_internal_log_tracer_properties/0]).

-type openapi_org_apache_sling_tracer_internal_log_tracer_properties() ::
  [ {'tracerSets', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'servletEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'recordingCacheSizeInMB', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'recordingCacheDurationInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'recordingCompressionEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'gzipResponse', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_tracer_internal_log_tracer_properties() ->
    openapi_org_apache_sling_tracer_internal_log_tracer_properties([]).

openapi_org_apache_sling_tracer_internal_log_tracer_properties(Fields) ->
  Default = [ {'tracerSets', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'servletEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'recordingCacheSizeInMB', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'recordingCacheDurationInSecs', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'recordingCompressionEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'gzipResponse', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

