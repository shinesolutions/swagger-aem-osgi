# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han_properties import ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties  # noqa: F401,E501
from openapi_server import util


class ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties=None):  # noqa: E501
        """ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo - a model defined in OpenAPI

        :param pid: The pid of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.  # noqa: E501
        :type properties: ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties
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
    def from_dict(cls, dikt) -> 'ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.  # noqa: E501
        :rtype: ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.


        :return: The pid of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.


        :param pid: The pid of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.


        :return: The title of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.


        :param title: The title of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.


        :return: The description of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.


        :param description: The description of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties:
        """Gets the properties of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.


        :return: The properties of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.
        :rtype: ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties):
        """Sets the properties of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.


        :param properties: The properties of this ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo.
        :type properties: ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties
        """

        self._properties = properties