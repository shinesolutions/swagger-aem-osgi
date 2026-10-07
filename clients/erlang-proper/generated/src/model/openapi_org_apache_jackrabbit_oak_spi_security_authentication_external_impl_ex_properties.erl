-module(openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties/0]).

-type openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties() ::
  [ {'jaas_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'jaas_controlFlag', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jaas_realmName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'idp_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sync_handlerName', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties() ->
    openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties([]).

openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_properties(Fields) ->
  Default = [ {'jaas.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'jaas.controlFlag', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jaas.realmName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'idp.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sync.handlerName', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

