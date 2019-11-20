# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties import ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties  # noqa: F401,E501
from openapi_server import util


class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties=None):  # noqa: E501
        """ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo - a model defined in OpenAPI

        :param pid: The pid of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.  # noqa: E501
        :type properties: ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties
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
    def from_dict(cls, dikt) -> 'ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.  # noqa: E501
        :rtype: ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.


        :return: The pid of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.


        :param pid: The pid of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.


        :return: The title of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.


        :param title: The title of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.


        :return: The description of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.


        :param description: The description of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties:
        """Gets the properties of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.


        :return: The properties of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.
        :rtype: ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties):
        """Sets the properties of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.


        :param properties: The properties of this ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.
        :type properties: ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties
        """

        self._properties = properties