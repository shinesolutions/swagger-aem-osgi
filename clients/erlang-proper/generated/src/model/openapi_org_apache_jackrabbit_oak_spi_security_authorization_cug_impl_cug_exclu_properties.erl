-module(openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_properties/0]).

-type openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_properties() ::
  [ {'principalNames', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_properties() ->
    openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_properties([]).

openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_properties(Fields) ->
  Default = [ {'principalNames', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

