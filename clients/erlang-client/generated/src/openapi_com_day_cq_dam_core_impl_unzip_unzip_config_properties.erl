-module(openapi_com_day_cq_dam_core_impl_unzip_unzip_config_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_unzip_unzip_config_properties/0]).

-type openapi_com_day_cq_dam_core_impl_unzip_unzip_config_properties() ::
    #{ 'cq_dam_config_unzip_maxuncompressedsize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_dam_config_unzip_encoding' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'cq_dam_config_unzip_maxuncompressedsize' := CqDamConfigUnzipMaxuncompressedsize,
          'cq_dam_config_unzip_encoding' := CqDamConfigUnzipEncoding
        }) ->
    #{ 'cq.dam.config.unzip.maxuncompressedsize' => CqDamConfigUnzipMaxuncompressedsize,
       'cq.dam.config.unzip.encoding' => CqDamConfigUnzipEncoding
     }.
