# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_adobe_granite_monitoring_impl_script_config_impl_properties import ComAdobeGraniteMonitoringImplScriptConfigImplProperties  # noqa: F401,E501
from openapi_server import util


class ComAdobeGraniteMonitoringImplScriptConfigImplInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComAdobeGraniteMonitoringImplScriptConfigImplProperties=None):  # noqa: E501
        """ComAdobeGraniteMonitoringImplScriptConfigImplInfo - a model defined in OpenAPI

        :param pid: The pid of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.  # noqa: E501
        :type properties: ComAdobeGraniteMonitoringImplScriptConfigImplProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComAdobeGraniteMonitoringImplScriptConfigImplProperties
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
    def from_dict(cls, dikt) -> 'ComAdobeGraniteMonitoringImplScriptConfigImplInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeGraniteMonitoringImplScriptConfigImplInfo of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.  # noqa: E501
        :rtype: ComAdobeGraniteMonitoringImplScriptConfigImplInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.


        :return: The pid of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.


        :param pid: The pid of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.


        :return: The title of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.


        :param title: The title of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.


        :return: The description of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.


        :param description: The description of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComAdobeGraniteMonitoringImplScriptConfigImplProperties:
        """Gets the properties of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.


        :return: The properties of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.
        :rtype: ComAdobeGraniteMonitoringImplScriptConfigImplProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComAdobeGraniteMonitoringImplScriptConfigImplProperties):
        """Sets the properties of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.


        :param properties: The properties of this ComAdobeGraniteMonitoringImplScriptConfigImplInfo.
        :type properties: ComAdobeGraniteMonitoringImplScriptConfigImplProperties
        """

        self._properties = properties