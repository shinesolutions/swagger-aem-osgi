# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_string import ConfigNodePropertyString  # noqa: F401,E501
from openapi_server import util


class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, auth_ims_client_secret: ConfigNodePropertyString=None, customizer_type: ConfigNodePropertyString=None):  # noqa: E501
        """ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties - a model defined in OpenAPI

        :param auth_ims_client_secret: The auth_ims_client_secret of this ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.  # noqa: E501
        :type auth_ims_client_secret: ConfigNodePropertyString
        :param customizer_type: The customizer_type of this ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.  # noqa: E501
        :type customizer_type: ConfigNodePropertyString
        """
        self.openapi_types = {
            'auth_ims_client_secret': ConfigNodePropertyString,
            'customizer_type': ConfigNodePropertyString
        }

        self.attribute_map = {
            'auth_ims_client_secret': 'auth.ims.client.secret',
            'customizer_type': 'customizer.type'
        }

        self._auth_ims_client_secret = auth_ims_client_secret
        self._customizer_type = customizer_type

    @classmethod
    def from_dict(cls, dikt) -> 'ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties of this ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.  # noqa: E501
        :rtype: ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def auth_ims_client_secret(self) -> ConfigNodePropertyString:
        """Gets the auth_ims_client_secret of this ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.


        :return: The auth_ims_client_secret of this ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.
        :rtype: ConfigNodePropertyString
        """
        return self._auth_ims_client_secret

    @auth_ims_client_secret.setter
    def auth_ims_client_secret(self, auth_ims_client_secret: ConfigNodePropertyString):
        """Sets the auth_ims_client_secret of this ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.


        :param auth_ims_client_secret: The auth_ims_client_secret of this ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.
        :type auth_ims_client_secret: ConfigNodePropertyString
        """

        self._auth_ims_client_secret = auth_ims_client_secret

    @property
    def customizer_type(self) -> ConfigNodePropertyString:
        """Gets the customizer_type of this ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.


        :return: The customizer_type of this ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.
        :rtype: ConfigNodePropertyString
        """
        return self._customizer_type

    @customizer_type.setter
    def customizer_type(self, customizer_type: ConfigNodePropertyString):
        """Sets the customizer_type of this ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.


        :param customizer_type: The customizer_type of this ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.
        :type customizer_type: ConfigNodePropertyString
        """

        self._customizer_type = customizer_type