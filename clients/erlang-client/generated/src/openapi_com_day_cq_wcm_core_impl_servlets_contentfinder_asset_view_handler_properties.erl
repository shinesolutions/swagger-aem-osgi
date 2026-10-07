-module(openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_properties() ::
    #{ 'dam_showexpired' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'dam_showhidden' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'tagTitleSearch' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'guessTotal' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'dam_expiryProperty' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'dam_showexpired' := DamShowexpired,
          'dam_showhidden' := DamShowhidden,
          'tagTitleSearch' := TagTitleSearch,
          'guessTotal' := GuessTotal,
          'dam_expiryProperty' := DamExpiryProperty
        }) ->
    #{ 'dam.showexpired' => DamShowexpired,
       'dam.showhidden' => DamShowhidden,
       'tagTitleSearch' => TagTitleSearch,
       'guessTotal' => GuessTotal,
       'dam.expiryProperty' => DamExpiryProperty
     }.
