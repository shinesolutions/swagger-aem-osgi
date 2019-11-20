# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_adobe_cq_projects_impl_servlet_project_image_servlet_properties import ComAdobeCqProjectsImplServletProjectImageServletProperties  # noqa: F401,E501
from openapi_server import util


class ComAdobeCqProjectsImplServletProjectImageServletInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComAdobeCqProjectsImplServletProjectImageServletProperties=None):  # noqa: E501
        """ComAdobeCqProjectsImplServletProjectImageServletInfo - a model defined in OpenAPI

        :param pid: The pid of this ComAdobeCqProjectsImplServletProjectImageServletInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComAdobeCqProjectsImplServletProjectImageServletInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComAdobeCqProjectsImplServletProjectImageServletInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComAdobeCqProjectsImplServletProjectImageServletInfo.  # noqa: E501
        :type properties: ComAdobeCqProjectsImplServletProjectImageServletProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComAdobeCqProjectsImplServletProjectImageServletProperties
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
    def from_dict(cls, dikt) -> 'ComAdobeCqProjectsImplServletProjectImageServletInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeCqProjectsImplServletProjectImageServletInfo of this ComAdobeCqProjectsImplServletProjectImageServletInfo.  # noqa: E501
        :rtype: ComAdobeCqProjectsImplServletProjectImageServletInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComAdobeCqProjectsImplServletProjectImageServletInfo.


        :return: The pid of this ComAdobeCqProjectsImplServletProjectImageServletInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComAdobeCqProjectsImplServletProjectImageServletInfo.


        :param pid: The pid of this ComAdobeCqProjectsImplServletProjectImageServletInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComAdobeCqProjectsImplServletProjectImageServletInfo.


        :return: The title of this ComAdobeCqProjectsImplServletProjectImageServletInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComAdobeCqProjectsImplServletProjectImageServletInfo.


        :param title: The title of this ComAdobeCqProjectsImplServletProjectImageServletInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComAdobeCqProjectsImplServletProjectImageServletInfo.


        :return: The description of this ComAdobeCqProjectsImplServletProjectImageServletInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComAdobeCqProjectsImplServletProjectImageServletInfo.


        :param description: The description of this ComAdobeCqProjectsImplServletProjectImageServletInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComAdobeCqProjectsImplServletProjectImageServletProperties:
        """Gets the properties of this ComAdobeCqProjectsImplServletProjectImageServletInfo.


        :return: The properties of this ComAdobeCqProjectsImplServletProjectImageServletInfo.
        :rtype: ComAdobeCqProjectsImplServletProjectImageServletProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComAdobeCqProjectsImplServletProjectImageServletProperties):
        """Sets the properties of this ComAdobeCqProjectsImplServletProjectImageServletInfo.


        :param properties: The properties of this ComAdobeCqProjectsImplServletProjectImageServletInfo.
        :type properties: ComAdobeCqProjectsImplServletProjectImageServletProperties
        """

        self._properties = properties