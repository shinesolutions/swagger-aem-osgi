-module(openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties/0]).

-export([openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties/1]).

-export_type([openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties/0]).

-type openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties() ::
  [ {'cq_wcm_qrcode_servlet_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties() ->
    openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties([]).

openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties(Fields) ->
  Default = [ {'cq.wcm.qrcode.servlet.whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

