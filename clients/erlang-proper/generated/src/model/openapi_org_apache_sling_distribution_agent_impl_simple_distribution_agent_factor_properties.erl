-module(openapi_org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties/0]).

-export([openapi_org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties/1]).

-export_type([openapi_org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties/0]).

-type openapi_org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'title', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'details', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'serviceName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'log_level', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'queue_processing_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'packageExporter_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'packageImporter_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'requestAuthorizationStrategy_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'triggers_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties() ->
    openapi_org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties([]).

openapi_org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'title', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'details', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'serviceName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'log.level', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'queue.processing.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'packageExporter.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'packageImporter.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'requestAuthorizationStrategy.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'triggers.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

