-module(openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_info/0]).

-type openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties:openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties()
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
