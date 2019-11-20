# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_integer import ConfigNodePropertyInteger  # noqa: F401,E501
from openapi_server import util


class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, min_thread_pool_size: ConfigNodePropertyInteger=None, max_thread_pool_size: ConfigNodePropertyInteger=None):  # noqa: E501
        """ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties - a model defined in OpenAPI

        :param min_thread_pool_size: The min_thread_pool_size of this ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.  # noqa: E501
        :type min_thread_pool_size: ConfigNodePropertyInteger
        :param max_thread_pool_size: The max_thread_pool_size of this ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.  # noqa: E501
        :type max_thread_pool_size: ConfigNodePropertyInteger
        """
        self.openapi_types = {
            'min_thread_pool_size': ConfigNodePropertyInteger,
            'max_thread_pool_size': ConfigNodePropertyInteger
        }

        self.attribute_map = {
            'min_thread_pool_size': 'minThreadPoolSize',
            'max_thread_pool_size': 'maxThreadPoolSize'
        }

        self._min_thread_pool_size = min_thread_pool_size
        self._max_thread_pool_size = max_thread_pool_size

    @classmethod
    def from_dict(cls, dikt) -> 'ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties of this ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.  # noqa: E501
        :rtype: ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def min_thread_pool_size(self) -> ConfigNodePropertyInteger:
        """Gets the min_thread_pool_size of this ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.


        :return: The min_thread_pool_size of this ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._min_thread_pool_size

    @min_thread_pool_size.setter
    def min_thread_pool_size(self, min_thread_pool_size: ConfigNodePropertyInteger):
        """Sets the min_thread_pool_size of this ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.


        :param min_thread_pool_size: The min_thread_pool_size of this ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.
        :type min_thread_pool_size: ConfigNodePropertyInteger
        """

        self._min_thread_pool_size = min_thread_pool_size

    @property
    def max_thread_pool_size(self) -> ConfigNodePropertyInteger:
        """Gets the max_thread_pool_size of this ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.


        :return: The max_thread_pool_size of this ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._max_thread_pool_size

    @max_thread_pool_size.setter
    def max_thread_pool_size(self, max_thread_pool_size: ConfigNodePropertyInteger):
        """Sets the max_thread_pool_size of this ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.


        :param max_thread_pool_size: The max_thread_pool_size of this ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.
        :type max_thread_pool_size: ConfigNodePropertyInteger
        """

        self._max_thread_pool_size = max_thread_pool_size