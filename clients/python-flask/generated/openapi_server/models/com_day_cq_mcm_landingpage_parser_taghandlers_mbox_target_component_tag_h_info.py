# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h_properties import ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties  # noqa: F401,E501
from openapi_server import util


class ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties=None):  # noqa: E501
        """ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo - a model defined in OpenAPI

        :param pid: The pid of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.  # noqa: E501
        :type properties: ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties
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
    def from_dict(cls, dikt) -> 'ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.  # noqa: E501
        :rtype: ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.


        :return: The pid of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.


        :param pid: The pid of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.


        :return: The title of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.


        :param title: The title of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.


        :return: The description of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.


        :param description: The description of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties:
        """Gets the properties of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.


        :return: The properties of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.
        :rtype: ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties):
        """Sets the properties of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.


        :param properties: The properties of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo.
        :type properties: ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties
        """

        self._properties = properties