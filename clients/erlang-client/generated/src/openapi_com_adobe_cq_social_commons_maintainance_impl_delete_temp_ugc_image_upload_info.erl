-module(openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_info/0]).

-type openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties:openapi_com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_properties()
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
