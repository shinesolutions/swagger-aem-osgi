-module(openapi_com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties/0]).

-export([openapi_com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties/1]).

-export_type([openapi_com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties/0]).

-type openapi_com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties() ::
  [ {'enableDataTriggeredContent', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties() ->
    openapi_com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties([]).

openapi_com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_properties(Fields) ->
  Default = [ {'enableDataTriggeredContent', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

