-module(openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_info).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_info/0]).

-export([openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_info/1]).

-export_type([openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_info/0]).

-type openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties:openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties() }
  | {'bundle_location', binary() }
  | {'service_location', binary() }
  ].


openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_info() ->
    openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_info([]).

openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties:openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties() }
            , {'bundle_location', binary() }
            , {'service_location', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

