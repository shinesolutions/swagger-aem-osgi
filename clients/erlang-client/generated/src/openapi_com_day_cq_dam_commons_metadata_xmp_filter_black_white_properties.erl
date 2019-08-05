-module(openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties/0]).

-type openapi_com_day_cq_dam_commons_metadata_xmp_filter_black_white_properties() ::
    #{ 'xmp_filter_apply_whitelist' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'xmp_filter_whitelist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'xmp_filter_apply_blacklist' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'xmp_filter_blacklist' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'xmp_filter_apply_whitelist' := XmpFilterApplyWhitelist,
          'xmp_filter_whitelist' := XmpFilterWhitelist,
          'xmp_filter_apply_blacklist' := XmpFilterApplyBlacklist,
          'xmp_filter_blacklist' := XmpFilterBlacklist
        }) ->
    #{ 'xmp.filter.apply_whitelist' => XmpFilterApplyWhitelist,
       'xmp.filter.whitelist' => XmpFilterWhitelist,
       'xmp.filter.apply_blacklist' => XmpFilterApplyBlacklist,
       'xmp.filter.blacklist' => XmpFilterBlacklist
     }.
