-module(openapi_com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties/0]).

-type openapi_com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties() ::
    #{ 'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'pathPrefix' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'createVersion' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'service_ranking' := ServiceRanking,
          'pathPrefix' := PathPrefix,
          'createVersion' := CreateVersion
        }) ->
    #{ 'service.ranking' => ServiceRanking,
       'pathPrefix' => PathPrefix,
       'createVersion' => CreateVersion
     }.
