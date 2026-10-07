-module(openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties/0]).

-export([openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties/1]).

-export_type([openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties/0]).

-type openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties() ::
  [ {'numberOfDays', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'ageOfFile', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties() ->
    openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties([]).

openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties(Fields) ->
  Default = [ {'numberOfDays', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'ageOfFile', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

