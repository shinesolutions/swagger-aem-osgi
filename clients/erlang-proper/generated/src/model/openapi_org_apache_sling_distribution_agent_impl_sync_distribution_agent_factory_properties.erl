-module(openapi_org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties/0]).

-export([openapi_org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties/1]).

-export_type([openapi_org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties/0]).

-type openapi_org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'title', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'details', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'serviceName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'log_level', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'queue_processing_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'passiveQueues', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'packageExporter_endpoints', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'packageImporter_endpoints', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'retry_strategy', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'retry_attempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'pull_items', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'http_conn_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'requestAuthorizationStrategy_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'transportSecretProvider_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'packageBuilder_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'triggers_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties() ->
    openapi_org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties([]).

openapi_org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'title', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'details', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'serviceName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'log.level', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'queue.processing.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'passiveQueues', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'packageExporter.endpoints', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'packageImporter.endpoints', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'retry.strategy', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'retry.attempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'pull.items', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'http.conn.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'requestAuthorizationStrategy.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'transportSecretProvider.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'packageBuilder.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'triggers.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

