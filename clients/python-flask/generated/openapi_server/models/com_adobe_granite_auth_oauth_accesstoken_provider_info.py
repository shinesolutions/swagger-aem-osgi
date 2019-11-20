# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_adobe_granite_auth_oauth_accesstoken_provider_properties import ComAdobeGraniteAuthOauthAccesstokenProviderProperties  # noqa: F401,E501
from openapi_server import util


class ComAdobeGraniteAuthOauthAccesstokenProviderInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComAdobeGraniteAuthOauthAccesstokenProviderProperties=None):  # noqa: E501
        """ComAdobeGraniteAuthOauthAccesstokenProviderInfo - a model defined in OpenAPI

        :param pid: The pid of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.  # noqa: E501
        :type properties: ComAdobeGraniteAuthOauthAccesstokenProviderProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComAdobeGraniteAuthOauthAccesstokenProviderProperties
        }

        self.attribute_map = {
            'pid': 'pid',
            'title': 'title',
            'description': 'description',
            'properties': 'properties'
        }

        self._pid = pid
        self._title = title
        self._description = description
        self._properties = properties

    @classmethod
    def from_dict(cls, dikt) -> 'ComAdobeGraniteAuthOauthAccesstokenProviderInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeGraniteAuthOauthAccesstokenProviderInfo of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.  # noqa: E501
        :rtype: ComAdobeGraniteAuthOauthAccesstokenProviderInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.


        :return: The pid of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.


        :param pid: The pid of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.


        :return: The title of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.


        :param title: The title of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.


        :return: The description of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.


        :param description: The description of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComAdobeGraniteAuthOauthAccesstokenProviderProperties:
        """Gets the properties of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.


        :return: The properties of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.
        :rtype: ComAdobeGraniteAuthOauthAccesstokenProviderProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComAdobeGraniteAuthOauthAccesstokenProviderProperties):
        """Sets the properties of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.


        :param properties: The properties of this ComAdobeGraniteAuthOauthAccesstokenProviderInfo.
        :type properties: ComAdobeGraniteAuthOauthAccesstokenProviderProperties
        """

        self._properties = properties