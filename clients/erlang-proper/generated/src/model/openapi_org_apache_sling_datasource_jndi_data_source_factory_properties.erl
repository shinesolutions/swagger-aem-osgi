-module(openapi_org_apache_sling_datasource_jndi_data_source_factory_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_datasource_jndi_data_source_factory_properties/0]).

-export([openapi_org_apache_sling_datasource_jndi_data_source_factory_properties/1]).

-export_type([openapi_org_apache_sling_datasource_jndi_data_source_factory_properties/0]).

-type openapi_org_apache_sling_datasource_jndi_data_source_factory_properties() ::
  [ {'datasource_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'datasource_svc_prop_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'datasource_jndi_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jndi_properties', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_datasource_jndi_data_source_factory_properties() ->
    openapi_org_apache_sling_datasource_jndi_data_source_factory_properties([]).

openapi_org_apache_sling_datasource_jndi_data_source_factory_properties(Fields) ->
  Default = [ {'datasource.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'datasource.svc.prop.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'datasource.jndi.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jndi.properties', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

