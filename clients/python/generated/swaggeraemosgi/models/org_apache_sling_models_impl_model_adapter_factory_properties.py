# coding: utf-8

"""
    Adobe Experience Manager OSGI config (AEM) API

    Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API  # noqa: E501

    The version of the OpenAPI document: 1.0.0-pre.0
    Contact: opensource@shinesolutions.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six


class OrgApacheSlingModelsImplModelAdapterFactoryProperties(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'osgi_http_whiteboard_listener': 'ConfigNodePropertyString',
        'osgi_http_whiteboard_context_select': 'ConfigNodePropertyString',
        'max_recursion_depth': 'ConfigNodePropertyInteger',
        'cleanup_job_period': 'ConfigNodePropertyInteger'
    }

    attribute_map = {
        'osgi_http_whiteboard_listener': 'osgi.http.whiteboard.listener',
        'osgi_http_whiteboard_context_select': 'osgi.http.whiteboard.context.select',
        'max_recursion_depth': 'max.recursion.depth',
        'cleanup_job_period': 'cleanup.job.period'
    }

    def __init__(self, osgi_http_whiteboard_listener=None, osgi_http_whiteboard_context_select=None, max_recursion_depth=None, cleanup_job_period=None):  # noqa: E501
        """OrgApacheSlingModelsImplModelAdapterFactoryProperties - a model defined in OpenAPI"""  # noqa: E501

        self._osgi_http_whiteboard_listener = None
        self._osgi_http_whiteboard_context_select = None
        self._max_recursion_depth = None
        self._cleanup_job_period = None
        self.discriminator = None

        if osgi_http_whiteboard_listener is not None:
            self.osgi_http_whiteboard_listener = osgi_http_whiteboard_listener
        if osgi_http_whiteboard_context_select is not None:
            self.osgi_http_whiteboard_context_select = osgi_http_whiteboard_context_select
        if max_recursion_depth is not None:
            self.max_recursion_depth = max_recursion_depth
        if cleanup_job_period is not None:
            self.cleanup_job_period = cleanup_job_period

    @property
    def osgi_http_whiteboard_listener(self):
        """Gets the osgi_http_whiteboard_listener of this OrgApacheSlingModelsImplModelAdapterFactoryProperties.  # noqa: E501


        :return: The osgi_http_whiteboard_listener of this OrgApacheSlingModelsImplModelAdapterFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._osgi_http_whiteboard_listener

    @osgi_http_whiteboard_listener.setter
    def osgi_http_whiteboard_listener(self, osgi_http_whiteboard_listener):
        """Sets the osgi_http_whiteboard_listener of this OrgApacheSlingModelsImplModelAdapterFactoryProperties.


        :param osgi_http_whiteboard_listener: The osgi_http_whiteboard_listener of this OrgApacheSlingModelsImplModelAdapterFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._osgi_http_whiteboard_listener = osgi_http_whiteboard_listener

    @property
    def osgi_http_whiteboard_context_select(self):
        """Gets the osgi_http_whiteboard_context_select of this OrgApacheSlingModelsImplModelAdapterFactoryProperties.  # noqa: E501


        :return: The osgi_http_whiteboard_context_select of this OrgApacheSlingModelsImplModelAdapterFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._osgi_http_whiteboard_context_select

    @osgi_http_whiteboard_context_select.setter
    def osgi_http_whiteboard_context_select(self, osgi_http_whiteboard_context_select):
        """Sets the osgi_http_whiteboard_context_select of this OrgApacheSlingModelsImplModelAdapterFactoryProperties.


        :param osgi_http_whiteboard_context_select: The osgi_http_whiteboard_context_select of this OrgApacheSlingModelsImplModelAdapterFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._osgi_http_whiteboard_context_select = osgi_http_whiteboard_context_select

    @property
    def max_recursion_depth(self):
        """Gets the max_recursion_depth of this OrgApacheSlingModelsImplModelAdapterFactoryProperties.  # noqa: E501


        :return: The max_recursion_depth of this OrgApacheSlingModelsImplModelAdapterFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._max_recursion_depth

    @max_recursion_depth.setter
    def max_recursion_depth(self, max_recursion_depth):
        """Sets the max_recursion_depth of this OrgApacheSlingModelsImplModelAdapterFactoryProperties.


        :param max_recursion_depth: The max_recursion_depth of this OrgApacheSlingModelsImplModelAdapterFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._max_recursion_depth = max_recursion_depth

    @property
    def cleanup_job_period(self):
        """Gets the cleanup_job_period of this OrgApacheSlingModelsImplModelAdapterFactoryProperties.  # noqa: E501


        :return: The cleanup_job_period of this OrgApacheSlingModelsImplModelAdapterFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._cleanup_job_period

    @cleanup_job_period.setter
    def cleanup_job_period(self, cleanup_job_period):
        """Sets the cleanup_job_period of this OrgApacheSlingModelsImplModelAdapterFactoryProperties.


        :param cleanup_job_period: The cleanup_job_period of this OrgApacheSlingModelsImplModelAdapterFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._cleanup_job_period = cleanup_job_period

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, OrgApacheSlingModelsImplModelAdapterFactoryProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
