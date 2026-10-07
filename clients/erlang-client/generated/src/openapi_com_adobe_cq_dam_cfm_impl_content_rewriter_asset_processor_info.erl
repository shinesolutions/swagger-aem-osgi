-module(openapi_com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_info/0]).

-type openapi_com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_properties:openapi_com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_properties()
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
