-module(openapi_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_info/0]).

-type openapi_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_properties:openapi_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_properties()
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
