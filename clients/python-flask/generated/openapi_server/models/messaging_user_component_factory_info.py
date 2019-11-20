# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.messaging_user_component_factory_properties import MessagingUserComponentFactoryProperties  # noqa: F401,E501
from openapi_server import util


class MessagingUserComponentFactoryInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: MessagingUserComponentFactoryProperties=None):  # noqa: E501
        """MessagingUserComponentFactoryInfo - a model defined in OpenAPI

        :param pid: The pid of this MessagingUserComponentFactoryInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this MessagingUserComponentFactoryInfo.  # noqa: E501
        :type title: str
        :param description: The description of this MessagingUserComponentFactoryInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this MessagingUserComponentFactoryInfo.  # noqa: E501
        :type properties: MessagingUserComponentFactoryProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': MessagingUserComponentFactoryProperties
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
    def from_dict(cls, dikt) -> 'MessagingUserComponentFactoryInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MessagingUserComponentFactoryInfo of this MessagingUserComponentFactoryInfo.  # noqa: E501
        :rtype: MessagingUserComponentFactoryInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this MessagingUserComponentFactoryInfo.


        :return: The pid of this MessagingUserComponentFactoryInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this MessagingUserComponentFactoryInfo.


        :param pid: The pid of this MessagingUserComponentFactoryInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this MessagingUserComponentFactoryInfo.


        :return: The title of this MessagingUserComponentFactoryInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this MessagingUserComponentFactoryInfo.


        :param title: The title of this MessagingUserComponentFactoryInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this MessagingUserComponentFactoryInfo.


        :return: The description of this MessagingUserComponentFactoryInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this MessagingUserComponentFactoryInfo.


        :param description: The description of this MessagingUserComponentFactoryInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> MessagingUserComponentFactoryProperties:
        """Gets the properties of this MessagingUserComponentFactoryInfo.


        :return: The properties of this MessagingUserComponentFactoryInfo.
        :rtype: MessagingUserComponentFactoryProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: MessagingUserComponentFactoryProperties):
        """Sets the properties of this MessagingUserComponentFactoryInfo.


        :param properties: The properties of this MessagingUserComponentFactoryInfo.
        :type properties: MessagingUserComponentFactoryProperties
        """

        self._properties = properties