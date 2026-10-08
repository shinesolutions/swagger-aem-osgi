-module(openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties/0]).

-export([openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties/1]).

-export_type([openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties/0]).

-type openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'ignoredPathsPatterns', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'serviceName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'deep', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties() ->
    openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties([]).

openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'ignoredPathsPatterns', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'serviceName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'deep', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

