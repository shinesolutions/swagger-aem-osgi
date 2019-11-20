# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.org_apache_sling_datasource_jndi_data_source_factory_properties import OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties  # noqa: F401,E501
from openapi_server import util


class OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties=None):  # noqa: E501
        """OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo - a model defined in OpenAPI

        :param pid: The pid of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.  # noqa: E501
        :type title: str
        :param description: The description of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.  # noqa: E501
        :type properties: OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties
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
    def from_dict(cls, dikt) -> 'OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The orgApacheSlingDatasourceJNDIDataSourceFactoryInfo of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.  # noqa: E501
        :rtype: OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.


        :return: The pid of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.


        :param pid: The pid of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.


        :return: The title of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.


        :param title: The title of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.


        :return: The description of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.


        :param description: The description of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties:
        """Gets the properties of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.


        :return: The properties of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.
        :rtype: OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties):
        """Sets the properties of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.


        :param properties: The properties of this OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.
        :type properties: OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties
        """

        self._properties = properties