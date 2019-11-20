# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties import ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties  # noqa: F401,E501
from openapi_server import util


class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties=None):  # noqa: E501
        """ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo - a model defined in OpenAPI

        :param pid: The pid of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.  # noqa: E501
        :type properties: ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties
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
    def from_dict(cls, dikt) -> 'ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.  # noqa: E501
        :rtype: ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.


        :return: The pid of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.


        :param pid: The pid of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.


        :return: The title of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.


        :param title: The title of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.


        :return: The description of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.


        :param description: The description of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties:
        """Gets the properties of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.


        :return: The properties of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.
        :rtype: ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties):
        """Sets the properties of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.


        :param properties: The properties of this ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.
        :type properties: ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties
        """

        self._properties = properties