-module(openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info/0]).

-export([openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info/1]).

-export_type([openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info/0]).

-type openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties:openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties() }
  ].


openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info() ->
    openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info([]).

openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties:openapi_org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

