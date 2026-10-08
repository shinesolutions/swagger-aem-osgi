-module(openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties/0]).

-type openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties() ::
  [ {'handler_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'user_expirationTime', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'user_autoMembership', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'user_propertyMapping', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'user_pathPrefix', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'user_membershipExpTime', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'user_membershipNestingDepth', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'user_dynamicMembership', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'user_disableMissing', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'group_expirationTime', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'group_autoMembership', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'group_propertyMapping', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'group_pathPrefix', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'enableRFC7613UsercaseMappedProfile', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties() ->
    openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties([]).

openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties(Fields) ->
  Default = [ {'handler.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'user.expirationTime', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'user.autoMembership', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'user.propertyMapping', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'user.pathPrefix', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'user.membershipExpTime', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'user.membershipNestingDepth', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'user.dynamicMembership', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'user.disableMissing', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'group.expirationTime', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'group.autoMembership', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'group.propertyMapping', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'group.pathPrefix', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'enableRFC7613UsercaseMappedProfile', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

