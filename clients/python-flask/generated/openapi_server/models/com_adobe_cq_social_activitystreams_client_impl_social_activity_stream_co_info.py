# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_properties import ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties  # noqa: F401,E501
from openapi_server import util


class ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties=None):  # noqa: E501
        """ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo - a model defined in OpenAPI

        :param pid: The pid of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.  # noqa: E501
        :type properties: ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties
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
    def from_dict(cls, dikt) -> 'ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.  # noqa: E501
        :rtype: ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.


        :return: The pid of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.


        :param pid: The pid of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.


        :return: The title of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.


        :param title: The title of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.


        :return: The description of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.


        :param description: The description of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties:
        """Gets the properties of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.


        :return: The properties of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.
        :rtype: ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties):
        """Sets the properties of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.


        :param properties: The properties of this ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.
        :type properties: ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties
        """

        self._properties = properties