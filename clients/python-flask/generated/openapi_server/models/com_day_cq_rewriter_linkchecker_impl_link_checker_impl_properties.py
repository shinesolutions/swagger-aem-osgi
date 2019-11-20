# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_array import ConfigNodePropertyArray  # noqa: F401,E501
from openapi_server.models.config_node_property_boolean import ConfigNodePropertyBoolean  # noqa: F401,E501
from openapi_server.models.config_node_property_integer import ConfigNodePropertyInteger  # noqa: F401,E501
from openapi_server import util


class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, scheduler_period: ConfigNodePropertyInteger=None, scheduler_concurrent: ConfigNodePropertyBoolean=None, service_bad_link_tolerance_interval: ConfigNodePropertyInteger=None, service_check_override_patterns: ConfigNodePropertyArray=None, service_cache_broken_internal_links: ConfigNodePropertyBoolean=None, service_special_link_prefix: ConfigNodePropertyArray=None, service_special_link_patterns: ConfigNodePropertyArray=None):  # noqa: E501
        """ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties - a model defined in OpenAPI

        :param scheduler_period: The scheduler_period of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.  # noqa: E501
        :type scheduler_period: ConfigNodePropertyInteger
        :param scheduler_concurrent: The scheduler_concurrent of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.  # noqa: E501
        :type scheduler_concurrent: ConfigNodePropertyBoolean
        :param service_bad_link_tolerance_interval: The service_bad_link_tolerance_interval of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.  # noqa: E501
        :type service_bad_link_tolerance_interval: ConfigNodePropertyInteger
        :param service_check_override_patterns: The service_check_override_patterns of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.  # noqa: E501
        :type service_check_override_patterns: ConfigNodePropertyArray
        :param service_cache_broken_internal_links: The service_cache_broken_internal_links of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.  # noqa: E501
        :type service_cache_broken_internal_links: ConfigNodePropertyBoolean
        :param service_special_link_prefix: The service_special_link_prefix of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.  # noqa: E501
        :type service_special_link_prefix: ConfigNodePropertyArray
        :param service_special_link_patterns: The service_special_link_patterns of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.  # noqa: E501
        :type service_special_link_patterns: ConfigNodePropertyArray
        """
        self.openapi_types = {
            'scheduler_period': ConfigNodePropertyInteger,
            'scheduler_concurrent': ConfigNodePropertyBoolean,
            'service_bad_link_tolerance_interval': ConfigNodePropertyInteger,
            'service_check_override_patterns': ConfigNodePropertyArray,
            'service_cache_broken_internal_links': ConfigNodePropertyBoolean,
            'service_special_link_prefix': ConfigNodePropertyArray,
            'service_special_link_patterns': ConfigNodePropertyArray
        }

        self.attribute_map = {
            'scheduler_period': 'scheduler.period',
            'scheduler_concurrent': 'scheduler.concurrent',
            'service_bad_link_tolerance_interval': 'service.bad_link_tolerance_interval',
            'service_check_override_patterns': 'service.check_override_patterns',
            'service_cache_broken_internal_links': 'service.cache_broken_internal_links',
            'service_special_link_prefix': 'service.special_link_prefix',
            'service_special_link_patterns': 'service.special_link_patterns'
        }

        self._scheduler_period = scheduler_period
        self._scheduler_concurrent = scheduler_concurrent
        self._service_bad_link_tolerance_interval = service_bad_link_tolerance_interval
        self._service_check_override_patterns = service_check_override_patterns
        self._service_cache_broken_internal_links = service_cache_broken_internal_links
        self._service_special_link_prefix = service_special_link_prefix
        self._service_special_link_patterns = service_special_link_patterns

    @classmethod
    def from_dict(cls, dikt) -> 'ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.  # noqa: E501
        :rtype: ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def scheduler_period(self) -> ConfigNodePropertyInteger:
        """Gets the scheduler_period of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.


        :return: The scheduler_period of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._scheduler_period

    @scheduler_period.setter
    def scheduler_period(self, scheduler_period: ConfigNodePropertyInteger):
        """Sets the scheduler_period of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.


        :param scheduler_period: The scheduler_period of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        :type scheduler_period: ConfigNodePropertyInteger
        """

        self._scheduler_period = scheduler_period

    @property
    def scheduler_concurrent(self) -> ConfigNodePropertyBoolean:
        """Gets the scheduler_concurrent of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.


        :return: The scheduler_concurrent of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        :rtype: ConfigNodePropertyBoolean
        """
        return self._scheduler_concurrent

    @scheduler_concurrent.setter
    def scheduler_concurrent(self, scheduler_concurrent: ConfigNodePropertyBoolean):
        """Sets the scheduler_concurrent of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.


        :param scheduler_concurrent: The scheduler_concurrent of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        :type scheduler_concurrent: ConfigNodePropertyBoolean
        """

        self._scheduler_concurrent = scheduler_concurrent

    @property
    def service_bad_link_tolerance_interval(self) -> ConfigNodePropertyInteger:
        """Gets the service_bad_link_tolerance_interval of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.


        :return: The service_bad_link_tolerance_interval of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._service_bad_link_tolerance_interval

    @service_bad_link_tolerance_interval.setter
    def service_bad_link_tolerance_interval(self, service_bad_link_tolerance_interval: ConfigNodePropertyInteger):
        """Sets the service_bad_link_tolerance_interval of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.


        :param service_bad_link_tolerance_interval: The service_bad_link_tolerance_interval of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        :type service_bad_link_tolerance_interval: ConfigNodePropertyInteger
        """

        self._service_bad_link_tolerance_interval = service_bad_link_tolerance_interval

    @property
    def service_check_override_patterns(self) -> ConfigNodePropertyArray:
        """Gets the service_check_override_patterns of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.


        :return: The service_check_override_patterns of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        :rtype: ConfigNodePropertyArray
        """
        return self._service_check_override_patterns

    @service_check_override_patterns.setter
    def service_check_override_patterns(self, service_check_override_patterns: ConfigNodePropertyArray):
        """Sets the service_check_override_patterns of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.


        :param service_check_override_patterns: The service_check_override_patterns of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        :type service_check_override_patterns: ConfigNodePropertyArray
        """

        self._service_check_override_patterns = service_check_override_patterns

    @property
    def service_cache_broken_internal_links(self) -> ConfigNodePropertyBoolean:
        """Gets the service_cache_broken_internal_links of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.


        :return: The service_cache_broken_internal_links of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        :rtype: ConfigNodePropertyBoolean
        """
        return self._service_cache_broken_internal_links

    @service_cache_broken_internal_links.setter
    def service_cache_broken_internal_links(self, service_cache_broken_internal_links: ConfigNodePropertyBoolean):
        """Sets the service_cache_broken_internal_links of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.


        :param service_cache_broken_internal_links: The service_cache_broken_internal_links of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        :type service_cache_broken_internal_links: ConfigNodePropertyBoolean
        """

        self._service_cache_broken_internal_links = service_cache_broken_internal_links

    @property
    def service_special_link_prefix(self) -> ConfigNodePropertyArray:
        """Gets the service_special_link_prefix of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.


        :return: The service_special_link_prefix of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        :rtype: ConfigNodePropertyArray
        """
        return self._service_special_link_prefix

    @service_special_link_prefix.setter
    def service_special_link_prefix(self, service_special_link_prefix: ConfigNodePropertyArray):
        """Sets the service_special_link_prefix of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.


        :param service_special_link_prefix: The service_special_link_prefix of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        :type service_special_link_prefix: ConfigNodePropertyArray
        """

        self._service_special_link_prefix = service_special_link_prefix

    @property
    def service_special_link_patterns(self) -> ConfigNodePropertyArray:
        """Gets the service_special_link_patterns of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.


        :return: The service_special_link_patterns of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        :rtype: ConfigNodePropertyArray
        """
        return self._service_special_link_patterns

    @service_special_link_patterns.setter
    def service_special_link_patterns(self, service_special_link_patterns: ConfigNodePropertyArray):
        """Sets the service_special_link_patterns of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.


        :param service_special_link_patterns: The service_special_link_patterns of this ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        :type service_special_link_patterns: ConfigNodePropertyArray
        """

        self._service_special_link_patterns = service_special_link_patterns