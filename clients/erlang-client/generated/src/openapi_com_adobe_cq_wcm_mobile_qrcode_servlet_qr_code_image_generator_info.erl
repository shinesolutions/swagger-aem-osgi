-module(openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_info/0]).

-type openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties:openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties()
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
