-module(openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info/0]).

-type openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties:openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
