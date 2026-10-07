-module(openapi_org_apache_felix_jaas_configuration_factory_properties).

-include("openapi.hrl").

-export([openapi_org_apache_felix_jaas_configuration_factory_properties/0]).

-export([openapi_org_apache_felix_jaas_configuration_factory_properties/1]).

-export_type([openapi_org_apache_felix_jaas_configuration_factory_properties/0]).

-type openapi_org_apache_felix_jaas_configuration_factory_properties() ::
  [ {'jaas_controlFlag', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'jaas_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'jaas_realmName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jaas_classname', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jaas_options', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_felix_jaas_configuration_factory_properties() ->
    openapi_org_apache_felix_jaas_configuration_factory_properties([]).

openapi_org_apache_felix_jaas_configuration_factory_properties(Fields) ->
  Default = [ {'jaas.controlFlag', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'jaas.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'jaas.realmName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jaas.classname', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jaas.options', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

