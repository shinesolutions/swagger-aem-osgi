# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_properties import ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties  # noqa: F401,E501
from openapi_server import util


class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties=None):  # noqa: E501
        """ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo - a model defined in OpenAPI

        :param pid: The pid of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.  # noqa: E501
        :type properties: ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties
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
    def from_dict(cls, dikt) -> 'ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.  # noqa: E501
        :rtype: ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.


        :return: The pid of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.


        :param pid: The pid of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.


        :return: The title of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.


        :param title: The title of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.


        :return: The description of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.


        :param description: The description of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties:
        """Gets the properties of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.


        :return: The properties of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.
        :rtype: ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties):
        """Sets the properties of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.


        :param properties: The properties of this ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo.
        :type properties: ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties
        """

        self._properties = properties