# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties import OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties  # noqa: F401,E501
from openapi_server import util


class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties=None):  # noqa: E501
        """OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo - a model defined in OpenAPI

        :param pid: The pid of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.  # noqa: E501
        :type title: str
        :param description: The description of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.  # noqa: E501
        :type properties: OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties
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
    def from_dict(cls, dikt) -> 'OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.  # noqa: E501
        :rtype: OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.


        :return: The pid of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.


        :param pid: The pid of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.


        :return: The title of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.


        :param title: The title of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.


        :return: The description of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.


        :param description: The description of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties:
        """Gets the properties of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.


        :return: The properties of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.
        :rtype: OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties):
        """Sets the properties of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.


        :param properties: The properties of this OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.
        :type properties: OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties
        """

        self._properties = properties