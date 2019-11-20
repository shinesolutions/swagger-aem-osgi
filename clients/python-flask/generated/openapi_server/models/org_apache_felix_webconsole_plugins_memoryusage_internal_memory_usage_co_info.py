# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties import OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties  # noqa: F401,E501
from openapi_server import util


class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties=None):  # noqa: E501
        """OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo - a model defined in OpenAPI

        :param pid: The pid of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.  # noqa: E501
        :type title: str
        :param description: The description of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.  # noqa: E501
        :type properties: OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties
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
    def from_dict(cls, dikt) -> 'OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.  # noqa: E501
        :rtype: OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.


        :return: The pid of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.


        :param pid: The pid of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.


        :return: The title of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.


        :param title: The title of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.


        :return: The description of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.


        :param description: The description of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties:
        """Gets the properties of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.


        :return: The properties of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.
        :rtype: OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties):
        """Sets the properties of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.


        :param properties: The properties of this OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo.
        :type properties: OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties
        """

        self._properties = properties