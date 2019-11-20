# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties import ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties  # noqa: F401,E501
from openapi_server import util


class ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties=None):  # noqa: E501
        """ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo - a model defined in OpenAPI

        :param pid: The pid of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.  # noqa: E501
        :type properties: ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties
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
    def from_dict(cls, dikt) -> 'ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeCqDamMacSyncImplDAMSyncServiceImplInfo of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.  # noqa: E501
        :rtype: ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.


        :return: The pid of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.


        :param pid: The pid of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.


        :return: The title of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.


        :param title: The title of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.


        :return: The description of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.


        :param description: The description of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties:
        """Gets the properties of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.


        :return: The properties of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.
        :rtype: ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties):
        """Sets the properties of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.


        :param properties: The properties of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.
        :type properties: ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties
        """

        self._properties = properties