-module(openapi_org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties/0]).

-export([openapi_org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties/1]).

-export_type([openapi_org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties/0]).

-type openapi_org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'title', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'details', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'serviceName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'log_level', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'allowed_roots', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'queue_processing_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'packageImporter_endpoints', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'passiveQueues', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'priorityQueues', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'retry_strategy', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'retry_attempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'requestAuthorizationStrategy_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'transportSecretProvider_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'packageBuilder_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'triggers_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'queue_provider', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'async_delivery', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'http_conn_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties() ->
    openapi_org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties([]).

openapi_org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'title', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'details', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'serviceName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'log.level', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'allowed.roots', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'queue.processing.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'packageImporter.endpoints', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'passiveQueues', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'priorityQueues', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'retry.strategy', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'retry.attempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'requestAuthorizationStrategy.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'transportSecretProvider.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'packageBuilder.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'triggers.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'queue.provider', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'async.delivery', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'http.conn.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

