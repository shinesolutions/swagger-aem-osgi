-module(openapi_org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties/0]).

-type openapi_org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties() ::
    #{ 'accountName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'containerName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'accessKey' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'rootPath' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'connectionURL' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'accountName' := AccountName,
          'containerName' := ContainerName,
          'accessKey' := AccessKey,
          'rootPath' := RootPath,
          'connectionURL' := ConnectionURL
        }) ->
    #{ 'accountName' => AccountName,
       'containerName' => ContainerName,
       'accessKey' => AccessKey,
       'rootPath' => RootPath,
       'connectionURL' => ConnectionURL
     }.
