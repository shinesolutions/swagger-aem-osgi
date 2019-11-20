# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_adobe_granite_auth_oauth_impl_github_provider_impl_properties import ComAdobeGraniteAuthOauthImplGithubProviderImplProperties  # noqa: F401,E501
from openapi_server import util


class ComAdobeGraniteAuthOauthImplGithubProviderImplInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComAdobeGraniteAuthOauthImplGithubProviderImplProperties=None):  # noqa: E501
        """ComAdobeGraniteAuthOauthImplGithubProviderImplInfo - a model defined in OpenAPI

        :param pid: The pid of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.  # noqa: E501
        :type properties: ComAdobeGraniteAuthOauthImplGithubProviderImplProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComAdobeGraniteAuthOauthImplGithubProviderImplProperties
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
    def from_dict(cls, dikt) -> 'ComAdobeGraniteAuthOauthImplGithubProviderImplInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeGraniteAuthOauthImplGithubProviderImplInfo of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.  # noqa: E501
        :rtype: ComAdobeGraniteAuthOauthImplGithubProviderImplInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.


        :return: The pid of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.


        :param pid: The pid of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.


        :return: The title of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.


        :param title: The title of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.


        :return: The description of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.


        :param description: The description of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComAdobeGraniteAuthOauthImplGithubProviderImplProperties:
        """Gets the properties of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.


        :return: The properties of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.
        :rtype: ComAdobeGraniteAuthOauthImplGithubProviderImplProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComAdobeGraniteAuthOauthImplGithubProviderImplProperties):
        """Sets the properties of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.


        :param properties: The properties of this ComAdobeGraniteAuthOauthImplGithubProviderImplInfo.
        :type properties: ComAdobeGraniteAuthOauthImplGithubProviderImplProperties
        """

        self._properties = properties