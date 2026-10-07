-module(openapi_com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet_properties() ::
    #{ 'cq_dam_drm_enable' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'cq_dam_drm_enable' := CqDamDrmEnable
        }) ->
    #{ 'cq.dam.drm.enable' => CqDamDrmEnable
     }.
