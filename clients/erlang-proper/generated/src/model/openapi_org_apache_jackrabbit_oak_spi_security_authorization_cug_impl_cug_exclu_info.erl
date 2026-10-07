-module(openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_info).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_info/0]).

-export([openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_info/1]).

-export_type([openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_info/0]).

-type openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_properties:openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_properties() }
  ].


openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_info() ->
    openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_info([]).

openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_properties:openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

