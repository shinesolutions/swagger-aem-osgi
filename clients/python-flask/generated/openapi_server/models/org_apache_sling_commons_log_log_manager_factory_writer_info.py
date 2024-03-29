# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.org_apache_sling_commons_log_log_manager_factory_writer_properties import OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties  # noqa: F401,E501
from openapi_server import util


class OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties=None):  # noqa: E501
        """OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo - a model defined in OpenAPI

        :param pid: The pid of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.  # noqa: E501
        :type title: str
        :param description: The description of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.  # noqa: E501
        :type properties: OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties
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
    def from_dict(cls, dikt) -> 'OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The orgApacheSlingCommonsLogLogManagerFactoryWriterInfo of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.  # noqa: E501
        :rtype: OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.


        :return: The pid of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.


        :param pid: The pid of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.


        :return: The title of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.


        :param title: The title of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.


        :return: The description of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.


        :param description: The description of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties:
        """Gets the properties of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.


        :return: The properties of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.
        :rtype: OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties):
        """Sets the properties of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.


        :param properties: The properties of this OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo.
        :type properties: OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties
        """

        self._properties = properties
