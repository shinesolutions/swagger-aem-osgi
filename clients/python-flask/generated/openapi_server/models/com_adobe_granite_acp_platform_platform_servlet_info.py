# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_adobe_granite_acp_platform_platform_servlet_properties import ComAdobeGraniteAcpPlatformPlatformServletProperties  # noqa: F401,E501
from openapi_server import util


class ComAdobeGraniteAcpPlatformPlatformServletInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComAdobeGraniteAcpPlatformPlatformServletProperties=None):  # noqa: E501
        """ComAdobeGraniteAcpPlatformPlatformServletInfo - a model defined in OpenAPI

        :param pid: The pid of this ComAdobeGraniteAcpPlatformPlatformServletInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComAdobeGraniteAcpPlatformPlatformServletInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComAdobeGraniteAcpPlatformPlatformServletInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComAdobeGraniteAcpPlatformPlatformServletInfo.  # noqa: E501
        :type properties: ComAdobeGraniteAcpPlatformPlatformServletProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComAdobeGraniteAcpPlatformPlatformServletProperties
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
    def from_dict(cls, dikt) -> 'ComAdobeGraniteAcpPlatformPlatformServletInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeGraniteAcpPlatformPlatformServletInfo of this ComAdobeGraniteAcpPlatformPlatformServletInfo.  # noqa: E501
        :rtype: ComAdobeGraniteAcpPlatformPlatformServletInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComAdobeGraniteAcpPlatformPlatformServletInfo.


        :return: The pid of this ComAdobeGraniteAcpPlatformPlatformServletInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComAdobeGraniteAcpPlatformPlatformServletInfo.


        :param pid: The pid of this ComAdobeGraniteAcpPlatformPlatformServletInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComAdobeGraniteAcpPlatformPlatformServletInfo.


        :return: The title of this ComAdobeGraniteAcpPlatformPlatformServletInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComAdobeGraniteAcpPlatformPlatformServletInfo.


        :param title: The title of this ComAdobeGraniteAcpPlatformPlatformServletInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComAdobeGraniteAcpPlatformPlatformServletInfo.


        :return: The description of this ComAdobeGraniteAcpPlatformPlatformServletInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComAdobeGraniteAcpPlatformPlatformServletInfo.


        :param description: The description of this ComAdobeGraniteAcpPlatformPlatformServletInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComAdobeGraniteAcpPlatformPlatformServletProperties:
        """Gets the properties of this ComAdobeGraniteAcpPlatformPlatformServletInfo.


        :return: The properties of this ComAdobeGraniteAcpPlatformPlatformServletInfo.
        :rtype: ComAdobeGraniteAcpPlatformPlatformServletProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComAdobeGraniteAcpPlatformPlatformServletProperties):
        """Sets the properties of this ComAdobeGraniteAcpPlatformPlatformServletInfo.


        :param properties: The properties of this ComAdobeGraniteAcpPlatformPlatformServletInfo.
        :type properties: ComAdobeGraniteAcpPlatformPlatformServletProperties
        """

        self._properties = properties