# coding: utf-8

"""
    Adobe Experience Manager OSGI config (AEM) API

    Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: opensource@shinesolutions.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six


class ComAdobeGraniteCsrfImplCSRFFilterProperties(object):
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
        'filter_methods': 'ConfigNodePropertyArray',
        'filter_enable_safe_user_agents': 'ConfigNodePropertyBoolean',
        'filter_safe_user_agents': 'ConfigNodePropertyArray',
        'filter_excluded_paths': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'filter_methods': 'filter.methods',
        'filter_enable_safe_user_agents': 'filter.enable.safe.user.agents',
        'filter_safe_user_agents': 'filter.safe.user.agents',
        'filter_excluded_paths': 'filter.excluded.paths'
    }

    def __init__(self, filter_methods=None, filter_enable_safe_user_agents=None, filter_safe_user_agents=None, filter_excluded_paths=None):  # noqa: E501
        """ComAdobeGraniteCsrfImplCSRFFilterProperties - a model defined in OpenAPI"""  # noqa: E501

        self._filter_methods = None
        self._filter_enable_safe_user_agents = None
        self._filter_safe_user_agents = None
        self._filter_excluded_paths = None
        self.discriminator = None

        if filter_methods is not None:
            self.filter_methods = filter_methods
        if filter_enable_safe_user_agents is not None:
            self.filter_enable_safe_user_agents = filter_enable_safe_user_agents
        if filter_safe_user_agents is not None:
            self.filter_safe_user_agents = filter_safe_user_agents
        if filter_excluded_paths is not None:
            self.filter_excluded_paths = filter_excluded_paths

    @property
    def filter_methods(self):
        """Gets the filter_methods of this ComAdobeGraniteCsrfImplCSRFFilterProperties.  # noqa: E501


        :return: The filter_methods of this ComAdobeGraniteCsrfImplCSRFFilterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._filter_methods

    @filter_methods.setter
    def filter_methods(self, filter_methods):
        """Sets the filter_methods of this ComAdobeGraniteCsrfImplCSRFFilterProperties.


        :param filter_methods: The filter_methods of this ComAdobeGraniteCsrfImplCSRFFilterProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._filter_methods = filter_methods

    @property
    def filter_enable_safe_user_agents(self):
        """Gets the filter_enable_safe_user_agents of this ComAdobeGraniteCsrfImplCSRFFilterProperties.  # noqa: E501


        :return: The filter_enable_safe_user_agents of this ComAdobeGraniteCsrfImplCSRFFilterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._filter_enable_safe_user_agents

    @filter_enable_safe_user_agents.setter
    def filter_enable_safe_user_agents(self, filter_enable_safe_user_agents):
        """Sets the filter_enable_safe_user_agents of this ComAdobeGraniteCsrfImplCSRFFilterProperties.


        :param filter_enable_safe_user_agents: The filter_enable_safe_user_agents of this ComAdobeGraniteCsrfImplCSRFFilterProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._filter_enable_safe_user_agents = filter_enable_safe_user_agents

    @property
    def filter_safe_user_agents(self):
        """Gets the filter_safe_user_agents of this ComAdobeGraniteCsrfImplCSRFFilterProperties.  # noqa: E501


        :return: The filter_safe_user_agents of this ComAdobeGraniteCsrfImplCSRFFilterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._filter_safe_user_agents

    @filter_safe_user_agents.setter
    def filter_safe_user_agents(self, filter_safe_user_agents):
        """Sets the filter_safe_user_agents of this ComAdobeGraniteCsrfImplCSRFFilterProperties.


        :param filter_safe_user_agents: The filter_safe_user_agents of this ComAdobeGraniteCsrfImplCSRFFilterProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._filter_safe_user_agents = filter_safe_user_agents

    @property
    def filter_excluded_paths(self):
        """Gets the filter_excluded_paths of this ComAdobeGraniteCsrfImplCSRFFilterProperties.  # noqa: E501


        :return: The filter_excluded_paths of this ComAdobeGraniteCsrfImplCSRFFilterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._filter_excluded_paths

    @filter_excluded_paths.setter
    def filter_excluded_paths(self, filter_excluded_paths):
        """Sets the filter_excluded_paths of this ComAdobeGraniteCsrfImplCSRFFilterProperties.


        :param filter_excluded_paths: The filter_excluded_paths of this ComAdobeGraniteCsrfImplCSRFFilterProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._filter_excluded_paths = filter_excluded_paths

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
        if not isinstance(other, ComAdobeGraniteCsrfImplCSRFFilterProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
