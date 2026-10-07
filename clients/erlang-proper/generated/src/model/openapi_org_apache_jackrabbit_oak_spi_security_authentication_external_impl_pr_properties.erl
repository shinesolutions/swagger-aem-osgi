-module(openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties/0]).

-type openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties() ::
  [ {'protectExternalId', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties() ->
    openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties([]).

openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties(Fields) ->
  Default = [ {'protectExternalId', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

