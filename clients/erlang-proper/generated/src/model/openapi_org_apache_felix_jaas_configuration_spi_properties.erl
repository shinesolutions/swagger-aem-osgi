-module(openapi_org_apache_felix_jaas_configuration_spi_properties).

-include("openapi.hrl").

-export([openapi_org_apache_felix_jaas_configuration_spi_properties/0]).

-export([openapi_org_apache_felix_jaas_configuration_spi_properties/1]).

-export_type([openapi_org_apache_felix_jaas_configuration_spi_properties/0]).

-type openapi_org_apache_felix_jaas_configuration_spi_properties() ::
  [ {'jaas_defaultRealmName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jaas_configProviderName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jaas_globalConfigPolicy', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_org_apache_felix_jaas_configuration_spi_properties() ->
    openapi_org_apache_felix_jaas_configuration_spi_properties([]).

openapi_org_apache_felix_jaas_configuration_spi_properties(Fields) ->
  Default = [ {'jaas.defaultRealmName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jaas.configProviderName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jaas.globalConfigPolicy', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

