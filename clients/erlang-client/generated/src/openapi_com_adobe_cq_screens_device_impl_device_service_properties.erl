-module(openapi_com_adobe_cq_screens_device_impl_device_service_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_screens_device_impl_device_service_properties/0]).

-type openapi_com_adobe_cq_screens_device_impl_device_service_properties() ::
    #{ 'com_adobe_aem_screens_player_pingfrequency' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'com_adobe_aem_screens_device_pasword_specialchars' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'com_adobe_aem_screens_device_pasword_minlowercasechars' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'com_adobe_aem_screens_device_pasword_minuppercasechars' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'com_adobe_aem_screens_device_pasword_minnumberchars' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'com_adobe_aem_screens_device_pasword_minspecialchars' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'com_adobe_aem_screens_device_pasword_minlength' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'com_adobe_aem_screens_player_pingfrequency' := ComAdobeAemScreensPlayerPingfrequency,
          'com_adobe_aem_screens_device_pasword_specialchars' := ComAdobeAemScreensDevicePaswordSpecialchars,
          'com_adobe_aem_screens_device_pasword_minlowercasechars' := ComAdobeAemScreensDevicePaswordMinlowercasechars,
          'com_adobe_aem_screens_device_pasword_minuppercasechars' := ComAdobeAemScreensDevicePaswordMinuppercasechars,
          'com_adobe_aem_screens_device_pasword_minnumberchars' := ComAdobeAemScreensDevicePaswordMinnumberchars,
          'com_adobe_aem_screens_device_pasword_minspecialchars' := ComAdobeAemScreensDevicePaswordMinspecialchars,
          'com_adobe_aem_screens_device_pasword_minlength' := ComAdobeAemScreensDevicePaswordMinlength
        }) ->
    #{ 'com.adobe.aem.screens.player.pingfrequency' => ComAdobeAemScreensPlayerPingfrequency,
       'com.adobe.aem.screens.device.pasword.specialchars' => ComAdobeAemScreensDevicePaswordSpecialchars,
       'com.adobe.aem.screens.device.pasword.minlowercasechars' => ComAdobeAemScreensDevicePaswordMinlowercasechars,
       'com.adobe.aem.screens.device.pasword.minuppercasechars' => ComAdobeAemScreensDevicePaswordMinuppercasechars,
       'com.adobe.aem.screens.device.pasword.minnumberchars' => ComAdobeAemScreensDevicePaswordMinnumberchars,
       'com.adobe.aem.screens.device.pasword.minspecialchars' => ComAdobeAemScreensDevicePaswordMinspecialchars,
       'com.adobe.aem.screens.device.pasword.minlength' => ComAdobeAemScreensDevicePaswordMinlength
     }.
