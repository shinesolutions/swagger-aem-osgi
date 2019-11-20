# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_properties import ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties  # noqa: F401,E501
from openapi_server import util


class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties=None):  # noqa: E501
        """ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo - a model defined in OpenAPI

        :param pid: The pid of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.  # noqa: E501
        :type properties: ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties
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
    def from_dict(cls, dikt) -> 'ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.  # noqa: E501
        :rtype: ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.


        :return: The pid of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.


        :param pid: The pid of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.


        :return: The title of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.


        :param title: The title of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.


        :return: The description of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.


        :param description: The description of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties:
        """Gets the properties of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.


        :return: The properties of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.
        :rtype: ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties):
        """Sets the properties of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.


        :param properties: The properties of this ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo.
        :type properties: ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties
        """

        self._properties = properties