# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_adobe_granite_auth_cert_impl_client_cert_auth_handler_properties import ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties  # noqa: F401,E501
from openapi_server import util


class ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties=None):  # noqa: E501
        """ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo - a model defined in OpenAPI

        :param pid: The pid of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.  # noqa: E501
        :type properties: ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties
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
    def from_dict(cls, dikt) -> 'ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeGraniteAuthCertImplClientCertAuthHandlerInfo of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.  # noqa: E501
        :rtype: ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.


        :return: The pid of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.


        :param pid: The pid of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.


        :return: The title of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.


        :param title: The title of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.


        :return: The description of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.


        :param description: The description of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties:
        """Gets the properties of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.


        :return: The properties of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.
        :rtype: ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties):
        """Sets the properties of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.


        :param properties: The properties of this ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo.
        :type properties: ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties
        """

        self._properties = properties