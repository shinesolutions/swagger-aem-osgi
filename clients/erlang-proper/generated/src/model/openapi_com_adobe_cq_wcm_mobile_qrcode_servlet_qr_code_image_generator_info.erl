-module(openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_info/0]).

-export([openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_info/1]).

-export_type([openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_info/0]).

-type openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties:openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties() }
  ].


openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_info() ->
    openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_info([]).

openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties:openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

