-module(openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties/0]).

-type openapi_com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties() ::
    #{ 'cq_wcm_qrcode_servlet_whitelist' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'cq_wcm_qrcode_servlet_whitelist' := CqWcmQrcodeServletWhitelist
        }) ->
    #{ 'cq.wcm.qrcode.servlet.whitelist' => CqWcmQrcodeServletWhitelist
     }.
