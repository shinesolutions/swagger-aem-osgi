-module(openapi_org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties/0]).

-type openapi_org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties() ::
  [ {'enabledActions', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'userPrivilegeNames', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'groupPrivilegeNames', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'constraint', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties() ->
    openapi_org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties([]).

openapi_org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties(Fields) ->
  Default = [ {'enabledActions', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'userPrivilegeNames', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'groupPrivilegeNames', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'constraint', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

