-module(openapi_org_apache_sling_featureflags_feature_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_featureflags_feature_properties/0]).

-export([openapi_org_apache_sling_featureflags_feature_properties/1]).

-export_type([openapi_org_apache_sling_featureflags_feature_properties/0]).

-type openapi_org_apache_sling_featureflags_feature_properties() ::
  [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'description', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_featureflags_feature_properties() ->
    openapi_org_apache_sling_featureflags_feature_properties([]).

openapi_org_apache_sling_featureflags_feature_properties(Fields) ->
  Default = [ {'name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'description', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

