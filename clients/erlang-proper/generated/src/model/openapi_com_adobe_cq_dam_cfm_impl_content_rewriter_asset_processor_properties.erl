-module(openapi_com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_properties/0]).

-export([openapi_com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_properties/1]).

-export_type([openapi_com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_properties/0]).

-type openapi_com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_properties() ::
  [ {'pipeline_type', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_properties() ->
    openapi_com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_properties([]).

openapi_com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_properties(Fields) ->
  Default = [ {'pipeline.type', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

