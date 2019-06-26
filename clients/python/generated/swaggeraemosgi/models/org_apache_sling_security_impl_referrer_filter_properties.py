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


class OrgApacheSlingSecurityImplReferrerFilterProperties(object):
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
        'allow_empty': 'ConfigNodePropertyBoolean',
        'allow_hosts': 'ConfigNodePropertyArray',
        'allow_hosts_regexp': 'ConfigNodePropertyArray',
        'filter_methods': 'ConfigNodePropertyArray',
        'exclude_agents_regexp': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'allow_empty': 'allow.empty',
        'allow_hosts': 'allow.hosts',
        'allow_hosts_regexp': 'allow.hosts.regexp',
        'filter_methods': 'filter.methods',
        'exclude_agents_regexp': 'exclude.agents.regexp'
    }

    def __init__(self, allow_empty=None, allow_hosts=None, allow_hosts_regexp=None, filter_methods=None, exclude_agents_regexp=None):  # noqa: E501
        """OrgApacheSlingSecurityImplReferrerFilterProperties - a model defined in OpenAPI"""  # noqa: E501

        self._allow_empty = None
        self._allow_hosts = None
        self._allow_hosts_regexp = None
        self._filter_methods = None
        self._exclude_agents_regexp = None
        self.discriminator = None

        if allow_empty is not None:
            self.allow_empty = allow_empty
        if allow_hosts is not None:
            self.allow_hosts = allow_hosts
        if allow_hosts_regexp is not None:
            self.allow_hosts_regexp = allow_hosts_regexp
        if filter_methods is not None:
            self.filter_methods = filter_methods
        if exclude_agents_regexp is not None:
            self.exclude_agents_regexp = exclude_agents_regexp

    @property
    def allow_empty(self):
        """Gets the allow_empty of this OrgApacheSlingSecurityImplReferrerFilterProperties.  # noqa: E501


        :return: The allow_empty of this OrgApacheSlingSecurityImplReferrerFilterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._allow_empty

    @allow_empty.setter
    def allow_empty(self, allow_empty):
        """Sets the allow_empty of this OrgApacheSlingSecurityImplReferrerFilterProperties.


        :param allow_empty: The allow_empty of this OrgApacheSlingSecurityImplReferrerFilterProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._allow_empty = allow_empty

    @property
    def allow_hosts(self):
        """Gets the allow_hosts of this OrgApacheSlingSecurityImplReferrerFilterProperties.  # noqa: E501


        :return: The allow_hosts of this OrgApacheSlingSecurityImplReferrerFilterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._allow_hosts

    @allow_hosts.setter
    def allow_hosts(self, allow_hosts):
        """Sets the allow_hosts of this OrgApacheSlingSecurityImplReferrerFilterProperties.


        :param allow_hosts: The allow_hosts of this OrgApacheSlingSecurityImplReferrerFilterProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._allow_hosts = allow_hosts

    @property
    def allow_hosts_regexp(self):
        """Gets the allow_hosts_regexp of this OrgApacheSlingSecurityImplReferrerFilterProperties.  # noqa: E501


        :return: The allow_hosts_regexp of this OrgApacheSlingSecurityImplReferrerFilterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._allow_hosts_regexp

    @allow_hosts_regexp.setter
    def allow_hosts_regexp(self, allow_hosts_regexp):
        """Sets the allow_hosts_regexp of this OrgApacheSlingSecurityImplReferrerFilterProperties.


        :param allow_hosts_regexp: The allow_hosts_regexp of this OrgApacheSlingSecurityImplReferrerFilterProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._allow_hosts_regexp = allow_hosts_regexp

    @property
    def filter_methods(self):
        """Gets the filter_methods of this OrgApacheSlingSecurityImplReferrerFilterProperties.  # noqa: E501


        :return: The filter_methods of this OrgApacheSlingSecurityImplReferrerFilterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._filter_methods

    @filter_methods.setter
    def filter_methods(self, filter_methods):
        """Sets the filter_methods of this OrgApacheSlingSecurityImplReferrerFilterProperties.


        :param filter_methods: The filter_methods of this OrgApacheSlingSecurityImplReferrerFilterProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._filter_methods = filter_methods

    @property
    def exclude_agents_regexp(self):
        """Gets the exclude_agents_regexp of this OrgApacheSlingSecurityImplReferrerFilterProperties.  # noqa: E501


        :return: The exclude_agents_regexp of this OrgApacheSlingSecurityImplReferrerFilterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._exclude_agents_regexp

    @exclude_agents_regexp.setter
    def exclude_agents_regexp(self, exclude_agents_regexp):
        """Sets the exclude_agents_regexp of this OrgApacheSlingSecurityImplReferrerFilterProperties.


        :param exclude_agents_regexp: The exclude_agents_regexp of this OrgApacheSlingSecurityImplReferrerFilterProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._exclude_agents_regexp = exclude_agents_regexp

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
        if not isinstance(other, OrgApacheSlingSecurityImplReferrerFilterProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other