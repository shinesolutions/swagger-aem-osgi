-module(openapi_org_apache_aries_jmx_framework_state_config_properties).

-include("openapi.hrl").

-export([openapi_org_apache_aries_jmx_framework_state_config_properties/0]).

-export([openapi_org_apache_aries_jmx_framework_state_config_properties/1]).

-export_type([openapi_org_apache_aries_jmx_framework_state_config_properties/0]).

-type openapi_org_apache_aries_jmx_framework_state_config_properties() ::
  [ {'attributeChangeNotificationEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_aries_jmx_framework_state_config_properties() ->
    openapi_org_apache_aries_jmx_framework_state_config_properties([]).

openapi_org_apache_aries_jmx_framework_state_config_properties(Fields) ->
  Default = [ {'attributeChangeNotificationEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

