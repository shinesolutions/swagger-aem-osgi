-module(openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties/0]).

-type openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties() ::
  [ {'cugSupportedPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cugEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'configurationRanking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties() ->
    openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties([]).

openapi_org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties(Fields) ->
  Default = [ {'cugSupportedPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cugEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'configurationRanking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

