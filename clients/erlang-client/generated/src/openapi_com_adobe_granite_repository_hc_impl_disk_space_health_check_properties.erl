-module(openapi_com_adobe_granite_repository_hc_impl_disk_space_health_check_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_repository_hc_impl_disk_space_health_check_properties/0]).

-type openapi_com_adobe_granite_repository_hc_impl_disk_space_health_check_properties() ::
    #{ 'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'disk_space_warn_threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'disk_space_error_threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'hc_tags' := HcTags,
          'disk_space_warn_threshold' := DiskSpaceWarnThreshold,
          'disk_space_error_threshold' := DiskSpaceErrorThreshold
        }) ->
    #{ 'hc.tags' => HcTags,
       'disk.space.warn.threshold' => DiskSpaceWarnThreshold,
       'disk.space.error.threshold' => DiskSpaceErrorThreshold
     }.
