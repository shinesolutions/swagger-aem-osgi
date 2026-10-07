-module(openapi_com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter_properties/0]).

-type openapi_com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter_properties() ::
    #{ 'pipeline_type' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'pipeline_type' := PipelineType
        }) ->
    #{ 'pipeline.type' => PipelineType
     }.
