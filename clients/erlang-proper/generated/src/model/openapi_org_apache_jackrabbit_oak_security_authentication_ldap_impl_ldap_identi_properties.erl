-module(openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties/0]).

-type openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties() ::
  [ {'provider_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'host_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'host_port', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'host_ssl', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'host_tls', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'host_noCertCheck', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'bind_dn', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'bind_password', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'searchTimeout', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'adminPool_maxActive', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'adminPool_lookupOnValidate', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'userPool_maxActive', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'userPool_lookupOnValidate', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'user_baseDN', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'user_objectclass', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'user_idAttribute', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'user_extraFilter', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'user_makeDnPath', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'group_baseDN', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'group_objectclass', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'group_nameAttribute', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'group_extraFilter', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'group_makeDnPath', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'group_memberAttribute', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'useUidForExtId', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'customattributes', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties() ->
    openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties([]).

openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties(Fields) ->
  Default = [ {'provider.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'host.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'host.port', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'host.ssl', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'host.tls', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'host.noCertCheck', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'bind.dn', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'bind.password', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'searchTimeout', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'adminPool.maxActive', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'adminPool.lookupOnValidate', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'userPool.maxActive', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'userPool.lookupOnValidate', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'user.baseDN', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'user.objectclass', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'user.idAttribute', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'user.extraFilter', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'user.makeDnPath', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'group.baseDN', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'group.objectclass', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'group.nameAttribute', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'group.extraFilter', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'group.makeDnPath', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'group.memberAttribute', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'useUidForExtId', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'customattributes', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

