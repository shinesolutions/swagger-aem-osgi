-module(openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_info/0]).

-type openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties:openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
