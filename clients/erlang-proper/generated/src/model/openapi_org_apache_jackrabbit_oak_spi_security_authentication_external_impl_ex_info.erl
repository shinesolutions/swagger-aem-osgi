-module(openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_info).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_info/0]).

-export([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_info/1]).

-export_type([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_info/0]).

-type openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties:openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties() }
  ].


openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_info() ->
    openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_info([]).

openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties:openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

