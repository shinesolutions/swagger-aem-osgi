# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_adobe_cq_social_commons_cors_cors_authentication_filter_properties import ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties  # noqa: F401,E501
from openapi_server import util


class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties=None):  # noqa: E501
        """ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo - a model defined in OpenAPI

        :param pid: The pid of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.  # noqa: E501
        :type properties: ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties
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
    def from_dict(cls, dikt) -> 'ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.  # noqa: E501
        :rtype: ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.


        :return: The pid of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.


        :param pid: The pid of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.


        :return: The title of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.


        :param title: The title of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.


        :return: The description of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.


        :param description: The description of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties:
        """Gets the properties of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.


        :return: The properties of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.
        :rtype: ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties):
        """Sets the properties of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.


        :param properties: The properties of this ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo.
        :type properties: ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties
        """

        self._properties = properties