-module(openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_info).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_info/0]).

-export([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_info/1]).

-export_type([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_info/0]).

-type openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties:openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties() }
  ].


openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_info() ->
    openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_info([]).

openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties:openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

