-module(openapi_org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties/0]).

-type openapi_org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties() ::
  [ {'permissionsJr2', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'importBehavior', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'readPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'administrativePrincipals', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'configurationRanking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties() ->
    openapi_org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties([]).

openapi_org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties(Fields) ->
  Default = [ {'permissionsJr2', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'importBehavior', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'readPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'administrativePrincipals', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'configurationRanking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

