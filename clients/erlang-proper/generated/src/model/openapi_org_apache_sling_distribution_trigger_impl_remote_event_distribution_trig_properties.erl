-module(openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties/0]).

-export([openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties/1]).

-export_type([openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties/0]).

-type openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'endpoint', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'transportSecretProvider_target', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties() ->
    openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties([]).

openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'endpoint', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'transportSecretProvider.target', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

