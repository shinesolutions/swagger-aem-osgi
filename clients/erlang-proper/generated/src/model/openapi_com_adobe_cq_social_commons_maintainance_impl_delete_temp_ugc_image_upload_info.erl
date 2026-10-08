-module(openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_info/0]).

-export([openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_info/1]).

-export_type([openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_info/0]).

-type openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties:openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties() }
  ].


openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_info() ->
    openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_info([]).

openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties:openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

