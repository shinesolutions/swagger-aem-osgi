-module(openapi_org_apache_sling_datasource_jndi_data_source_factory_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_datasource_jndi_data_source_factory_properties/0]).

-type openapi_org_apache_sling_datasource_jndi_data_source_factory_properties() ::
    #{ 'datasource_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'datasource_svc_prop_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'datasource_jndi_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jndi_properties' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'datasource_name' := DatasourceName,
          'datasource_svc_prop_name' := DatasourceSvcPropName,
          'datasource_jndi_name' := DatasourceJndiName,
          'jndi_properties' := JndiProperties
        }) ->
    #{ 'datasource.name' => DatasourceName,
       'datasource.svc.prop.name' => DatasourceSvcPropName,
       'datasource.jndi.name' => DatasourceJndiName,
       'jndi.properties' => JndiProperties
     }.
