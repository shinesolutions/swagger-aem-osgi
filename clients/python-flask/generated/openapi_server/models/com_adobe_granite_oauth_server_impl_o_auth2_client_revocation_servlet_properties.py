# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_boolean import ConfigNodePropertyBoolean  # noqa: F401,E501
from openapi_server import util


class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, oauth_client_revocation_active: ConfigNodePropertyBoolean=None):  # noqa: E501
        """ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties - a model defined in OpenAPI

        :param oauth_client_revocation_active: The oauth_client_revocation_active of this ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.  # noqa: E501
        :type oauth_client_revocation_active: ConfigNodePropertyBoolean
        """
        self.openapi_types = {
            'oauth_client_revocation_active': ConfigNodePropertyBoolean
        }

        self.attribute_map = {
            'oauth_client_revocation_active': 'oauth.client.revocation.active'
        }

        self._oauth_client_revocation_active = oauth_client_revocation_active

    @classmethod
    def from_dict(cls, dikt) -> 'ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties of this ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.  # noqa: E501
        :rtype: ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def oauth_client_revocation_active(self) -> ConfigNodePropertyBoolean:
        """Gets the oauth_client_revocation_active of this ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.


        :return: The oauth_client_revocation_active of this ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.
        :rtype: ConfigNodePropertyBoolean
        """
        return self._oauth_client_revocation_active

    @oauth_client_revocation_active.setter
    def oauth_client_revocation_active(self, oauth_client_revocation_active: ConfigNodePropertyBoolean):
        """Sets the oauth_client_revocation_active of this ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.


        :param oauth_client_revocation_active: The oauth_client_revocation_active of this ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.
        :type oauth_client_revocation_active: ConfigNodePropertyBoolean
        """

        self._oauth_client_revocation_active = oauth_client_revocation_active