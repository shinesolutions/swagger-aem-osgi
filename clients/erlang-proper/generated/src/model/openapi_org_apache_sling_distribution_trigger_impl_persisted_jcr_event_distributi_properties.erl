-module(openapi_org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi_properties/0]).

-export([openapi_org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi_properties/1]).

-export_type([openapi_org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi_properties/0]).

-type openapi_org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'serviceName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'nuggetsPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi_properties() ->
    openapi_org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi_properties([]).

openapi_org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'serviceName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'nuggetsPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

