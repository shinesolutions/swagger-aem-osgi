-module(openapi_org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties/0]).

-type openapi_org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties() ::
  [ {'usersPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'groupsPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'systemRelativePath', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'defaultDepth', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'importBehavior', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'passwordHashAlgorithm', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'passwordHashIterations', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'passwordSaltSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'omitAdminPw', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'supportAutoSave', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'passwordMaxAge', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'initialPasswordChange', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'passwordHistorySize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'passwordExpiryForAdmin', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cacheExpiration', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'enableRFC7613UsercaseMappedProfile', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties() ->
    openapi_org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties([]).

openapi_org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties(Fields) ->
  Default = [ {'usersPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'groupsPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'systemRelativePath', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'defaultDepth', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'importBehavior', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'passwordHashAlgorithm', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'passwordHashIterations', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'passwordSaltSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'omitAdminPw', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'supportAutoSave', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'passwordMaxAge', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'initialPasswordChange', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'passwordHistorySize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'passwordExpiryForAdmin', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cacheExpiration', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'enableRFC7613UsercaseMappedProfile', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

