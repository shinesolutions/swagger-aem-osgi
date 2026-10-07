-module(openapi_com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties/0]).

-export([openapi_com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties/1]).

-export_type([openapi_com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties/0]).

-type openapi_com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties() ::
  [ {'legacyCloudUGCPathMapping', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties() ->
    openapi_com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties([]).

openapi_com_adobe_cq_social_ugcbase_impl_social_utils_impl_properties(Fields) ->
  Default = [ {'legacyCloudUGCPathMapping', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

