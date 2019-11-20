# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_array import ConfigNodePropertyArray  # noqa: F401,E501
from openapi_server.models.config_node_property_drop_down import ConfigNodePropertyDropDown  # noqa: F401,E501
from openapi_server.models.config_node_property_integer import ConfigNodePropertyInteger  # noqa: F401,E501
from openapi_server.models.config_node_property_string import ConfigNodePropertyString  # noqa: F401,E501
from openapi_server import util


class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, com_adobe_granite_jetty_ssl_port: ConfigNodePropertyInteger=None, com_adobe_granite_jetty_ssl_keystore_user: ConfigNodePropertyString=None, com_adobe_granite_jetty_ssl_keystore_password: ConfigNodePropertyString=None, com_adobe_granite_jetty_ssl_ciphersuites_excluded: ConfigNodePropertyArray=None, com_adobe_granite_jetty_ssl_ciphersuites_included: ConfigNodePropertyArray=None, com_adobe_granite_jetty_ssl_client_certificate: ConfigNodePropertyDropDown=None):  # noqa: E501
        """ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties - a model defined in OpenAPI

        :param com_adobe_granite_jetty_ssl_port: The com_adobe_granite_jetty_ssl_port of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.  # noqa: E501
        :type com_adobe_granite_jetty_ssl_port: ConfigNodePropertyInteger
        :param com_adobe_granite_jetty_ssl_keystore_user: The com_adobe_granite_jetty_ssl_keystore_user of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.  # noqa: E501
        :type com_adobe_granite_jetty_ssl_keystore_user: ConfigNodePropertyString
        :param com_adobe_granite_jetty_ssl_keystore_password: The com_adobe_granite_jetty_ssl_keystore_password of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.  # noqa: E501
        :type com_adobe_granite_jetty_ssl_keystore_password: ConfigNodePropertyString
        :param com_adobe_granite_jetty_ssl_ciphersuites_excluded: The com_adobe_granite_jetty_ssl_ciphersuites_excluded of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.  # noqa: E501
        :type com_adobe_granite_jetty_ssl_ciphersuites_excluded: ConfigNodePropertyArray
        :param com_adobe_granite_jetty_ssl_ciphersuites_included: The com_adobe_granite_jetty_ssl_ciphersuites_included of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.  # noqa: E501
        :type com_adobe_granite_jetty_ssl_ciphersuites_included: ConfigNodePropertyArray
        :param com_adobe_granite_jetty_ssl_client_certificate: The com_adobe_granite_jetty_ssl_client_certificate of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.  # noqa: E501
        :type com_adobe_granite_jetty_ssl_client_certificate: ConfigNodePropertyDropDown
        """
        self.openapi_types = {
            'com_adobe_granite_jetty_ssl_port': ConfigNodePropertyInteger,
            'com_adobe_granite_jetty_ssl_keystore_user': ConfigNodePropertyString,
            'com_adobe_granite_jetty_ssl_keystore_password': ConfigNodePropertyString,
            'com_adobe_granite_jetty_ssl_ciphersuites_excluded': ConfigNodePropertyArray,
            'com_adobe_granite_jetty_ssl_ciphersuites_included': ConfigNodePropertyArray,
            'com_adobe_granite_jetty_ssl_client_certificate': ConfigNodePropertyDropDown
        }

        self.attribute_map = {
            'com_adobe_granite_jetty_ssl_port': 'com.adobe.granite.jetty.ssl.port',
            'com_adobe_granite_jetty_ssl_keystore_user': 'com.adobe.granite.jetty.ssl.keystore.user',
            'com_adobe_granite_jetty_ssl_keystore_password': 'com.adobe.granite.jetty.ssl.keystore.password',
            'com_adobe_granite_jetty_ssl_ciphersuites_excluded': 'com.adobe.granite.jetty.ssl.ciphersuites.excluded',
            'com_adobe_granite_jetty_ssl_ciphersuites_included': 'com.adobe.granite.jetty.ssl.ciphersuites.included',
            'com_adobe_granite_jetty_ssl_client_certificate': 'com.adobe.granite.jetty.ssl.client.certificate'
        }

        self._com_adobe_granite_jetty_ssl_port = com_adobe_granite_jetty_ssl_port
        self._com_adobe_granite_jetty_ssl_keystore_user = com_adobe_granite_jetty_ssl_keystore_user
        self._com_adobe_granite_jetty_ssl_keystore_password = com_adobe_granite_jetty_ssl_keystore_password
        self._com_adobe_granite_jetty_ssl_ciphersuites_excluded = com_adobe_granite_jetty_ssl_ciphersuites_excluded
        self._com_adobe_granite_jetty_ssl_ciphersuites_included = com_adobe_granite_jetty_ssl_ciphersuites_included
        self._com_adobe_granite_jetty_ssl_client_certificate = com_adobe_granite_jetty_ssl_client_certificate

    @classmethod
    def from_dict(cls, dikt) -> 'ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.  # noqa: E501
        :rtype: ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def com_adobe_granite_jetty_ssl_port(self) -> ConfigNodePropertyInteger:
        """Gets the com_adobe_granite_jetty_ssl_port of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.


        :return: The com_adobe_granite_jetty_ssl_port of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._com_adobe_granite_jetty_ssl_port

    @com_adobe_granite_jetty_ssl_port.setter
    def com_adobe_granite_jetty_ssl_port(self, com_adobe_granite_jetty_ssl_port: ConfigNodePropertyInteger):
        """Sets the com_adobe_granite_jetty_ssl_port of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.


        :param com_adobe_granite_jetty_ssl_port: The com_adobe_granite_jetty_ssl_port of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
        :type com_adobe_granite_jetty_ssl_port: ConfigNodePropertyInteger
        """

        self._com_adobe_granite_jetty_ssl_port = com_adobe_granite_jetty_ssl_port

    @property
    def com_adobe_granite_jetty_ssl_keystore_user(self) -> ConfigNodePropertyString:
        """Gets the com_adobe_granite_jetty_ssl_keystore_user of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.


        :return: The com_adobe_granite_jetty_ssl_keystore_user of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
        :rtype: ConfigNodePropertyString
        """
        return self._com_adobe_granite_jetty_ssl_keystore_user

    @com_adobe_granite_jetty_ssl_keystore_user.setter
    def com_adobe_granite_jetty_ssl_keystore_user(self, com_adobe_granite_jetty_ssl_keystore_user: ConfigNodePropertyString):
        """Sets the com_adobe_granite_jetty_ssl_keystore_user of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.


        :param com_adobe_granite_jetty_ssl_keystore_user: The com_adobe_granite_jetty_ssl_keystore_user of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
        :type com_adobe_granite_jetty_ssl_keystore_user: ConfigNodePropertyString
        """

        self._com_adobe_granite_jetty_ssl_keystore_user = com_adobe_granite_jetty_ssl_keystore_user

    @property
    def com_adobe_granite_jetty_ssl_keystore_password(self) -> ConfigNodePropertyString:
        """Gets the com_adobe_granite_jetty_ssl_keystore_password of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.


        :return: The com_adobe_granite_jetty_ssl_keystore_password of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
        :rtype: ConfigNodePropertyString
        """
        return self._com_adobe_granite_jetty_ssl_keystore_password

    @com_adobe_granite_jetty_ssl_keystore_password.setter
    def com_adobe_granite_jetty_ssl_keystore_password(self, com_adobe_granite_jetty_ssl_keystore_password: ConfigNodePropertyString):
        """Sets the com_adobe_granite_jetty_ssl_keystore_password of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.


        :param com_adobe_granite_jetty_ssl_keystore_password: The com_adobe_granite_jetty_ssl_keystore_password of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
        :type com_adobe_granite_jetty_ssl_keystore_password: ConfigNodePropertyString
        """

        self._com_adobe_granite_jetty_ssl_keystore_password = com_adobe_granite_jetty_ssl_keystore_password

    @property
    def com_adobe_granite_jetty_ssl_ciphersuites_excluded(self) -> ConfigNodePropertyArray:
        """Gets the com_adobe_granite_jetty_ssl_ciphersuites_excluded of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.


        :return: The com_adobe_granite_jetty_ssl_ciphersuites_excluded of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
        :rtype: ConfigNodePropertyArray
        """
        return self._com_adobe_granite_jetty_ssl_ciphersuites_excluded

    @com_adobe_granite_jetty_ssl_ciphersuites_excluded.setter
    def com_adobe_granite_jetty_ssl_ciphersuites_excluded(self, com_adobe_granite_jetty_ssl_ciphersuites_excluded: ConfigNodePropertyArray):
        """Sets the com_adobe_granite_jetty_ssl_ciphersuites_excluded of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.


        :param com_adobe_granite_jetty_ssl_ciphersuites_excluded: The com_adobe_granite_jetty_ssl_ciphersuites_excluded of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
        :type com_adobe_granite_jetty_ssl_ciphersuites_excluded: ConfigNodePropertyArray
        """

        self._com_adobe_granite_jetty_ssl_ciphersuites_excluded = com_adobe_granite_jetty_ssl_ciphersuites_excluded

    @property
    def com_adobe_granite_jetty_ssl_ciphersuites_included(self) -> ConfigNodePropertyArray:
        """Gets the com_adobe_granite_jetty_ssl_ciphersuites_included of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.


        :return: The com_adobe_granite_jetty_ssl_ciphersuites_included of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
        :rtype: ConfigNodePropertyArray
        """
        return self._com_adobe_granite_jetty_ssl_ciphersuites_included

    @com_adobe_granite_jetty_ssl_ciphersuites_included.setter
    def com_adobe_granite_jetty_ssl_ciphersuites_included(self, com_adobe_granite_jetty_ssl_ciphersuites_included: ConfigNodePropertyArray):
        """Sets the com_adobe_granite_jetty_ssl_ciphersuites_included of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.


        :param com_adobe_granite_jetty_ssl_ciphersuites_included: The com_adobe_granite_jetty_ssl_ciphersuites_included of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
        :type com_adobe_granite_jetty_ssl_ciphersuites_included: ConfigNodePropertyArray
        """

        self._com_adobe_granite_jetty_ssl_ciphersuites_included = com_adobe_granite_jetty_ssl_ciphersuites_included

    @property
    def com_adobe_granite_jetty_ssl_client_certificate(self) -> ConfigNodePropertyDropDown:
        """Gets the com_adobe_granite_jetty_ssl_client_certificate of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.


        :return: The com_adobe_granite_jetty_ssl_client_certificate of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
        :rtype: ConfigNodePropertyDropDown
        """
        return self._com_adobe_granite_jetty_ssl_client_certificate

    @com_adobe_granite_jetty_ssl_client_certificate.setter
    def com_adobe_granite_jetty_ssl_client_certificate(self, com_adobe_granite_jetty_ssl_client_certificate: ConfigNodePropertyDropDown):
        """Sets the com_adobe_granite_jetty_ssl_client_certificate of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.


        :param com_adobe_granite_jetty_ssl_client_certificate: The com_adobe_granite_jetty_ssl_client_certificate of this ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
        :type com_adobe_granite_jetty_ssl_client_certificate: ConfigNodePropertyDropDown
        """

        self._com_adobe_granite_jetty_ssl_client_certificate = com_adobe_granite_jetty_ssl_client_certificate