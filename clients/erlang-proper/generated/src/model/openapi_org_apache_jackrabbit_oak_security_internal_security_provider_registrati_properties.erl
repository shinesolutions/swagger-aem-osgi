-module(openapi_org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties/0]).

-type openapi_org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties() ::
  [ {'requiredServicePids', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'authorizationCompositionType', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties() ->
    openapi_org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties([]).

openapi_org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties(Fields) ->
  Default = [ {'requiredServicePids', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'authorizationCompositionType', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

