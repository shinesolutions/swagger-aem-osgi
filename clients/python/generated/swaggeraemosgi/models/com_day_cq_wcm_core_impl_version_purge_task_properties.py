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


class ComDayCqWcmCoreImplVersionPurgeTaskProperties(object):
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
        'versionpurge_paths': 'ConfigNodePropertyArray',
        'versionpurge_recursive': 'ConfigNodePropertyBoolean',
        'versionpurge_max_versions': 'ConfigNodePropertyInteger',
        'versionpurge_min_versions': 'ConfigNodePropertyInteger',
        'versionpurge_max_age_days': 'ConfigNodePropertyInteger'
    }

    attribute_map = {
        'versionpurge_paths': 'versionpurge.paths',
        'versionpurge_recursive': 'versionpurge.recursive',
        'versionpurge_max_versions': 'versionpurge.maxVersions',
        'versionpurge_min_versions': 'versionpurge.minVersions',
        'versionpurge_max_age_days': 'versionpurge.maxAgeDays'
    }

    def __init__(self, versionpurge_paths=None, versionpurge_recursive=None, versionpurge_max_versions=None, versionpurge_min_versions=None, versionpurge_max_age_days=None):  # noqa: E501
        """ComDayCqWcmCoreImplVersionPurgeTaskProperties - a model defined in OpenAPI"""  # noqa: E501

        self._versionpurge_paths = None
        self._versionpurge_recursive = None
        self._versionpurge_max_versions = None
        self._versionpurge_min_versions = None
        self._versionpurge_max_age_days = None
        self.discriminator = None

        if versionpurge_paths is not None:
            self.versionpurge_paths = versionpurge_paths
        if versionpurge_recursive is not None:
            self.versionpurge_recursive = versionpurge_recursive
        if versionpurge_max_versions is not None:
            self.versionpurge_max_versions = versionpurge_max_versions
        if versionpurge_min_versions is not None:
            self.versionpurge_min_versions = versionpurge_min_versions
        if versionpurge_max_age_days is not None:
            self.versionpurge_max_age_days = versionpurge_max_age_days

    @property
    def versionpurge_paths(self):
        """Gets the versionpurge_paths of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.  # noqa: E501


        :return: The versionpurge_paths of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._versionpurge_paths

    @versionpurge_paths.setter
    def versionpurge_paths(self, versionpurge_paths):
        """Sets the versionpurge_paths of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.


        :param versionpurge_paths: The versionpurge_paths of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._versionpurge_paths = versionpurge_paths

    @property
    def versionpurge_recursive(self):
        """Gets the versionpurge_recursive of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.  # noqa: E501


        :return: The versionpurge_recursive of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._versionpurge_recursive

    @versionpurge_recursive.setter
    def versionpurge_recursive(self, versionpurge_recursive):
        """Sets the versionpurge_recursive of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.


        :param versionpurge_recursive: The versionpurge_recursive of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._versionpurge_recursive = versionpurge_recursive

    @property
    def versionpurge_max_versions(self):
        """Gets the versionpurge_max_versions of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.  # noqa: E501


        :return: The versionpurge_max_versions of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._versionpurge_max_versions

    @versionpurge_max_versions.setter
    def versionpurge_max_versions(self, versionpurge_max_versions):
        """Sets the versionpurge_max_versions of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.


        :param versionpurge_max_versions: The versionpurge_max_versions of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._versionpurge_max_versions = versionpurge_max_versions

    @property
    def versionpurge_min_versions(self):
        """Gets the versionpurge_min_versions of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.  # noqa: E501


        :return: The versionpurge_min_versions of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._versionpurge_min_versions

    @versionpurge_min_versions.setter
    def versionpurge_min_versions(self, versionpurge_min_versions):
        """Sets the versionpurge_min_versions of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.


        :param versionpurge_min_versions: The versionpurge_min_versions of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._versionpurge_min_versions = versionpurge_min_versions

    @property
    def versionpurge_max_age_days(self):
        """Gets the versionpurge_max_age_days of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.  # noqa: E501


        :return: The versionpurge_max_age_days of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._versionpurge_max_age_days

    @versionpurge_max_age_days.setter
    def versionpurge_max_age_days(self, versionpurge_max_age_days):
        """Sets the versionpurge_max_age_days of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.


        :param versionpurge_max_age_days: The versionpurge_max_age_days of this ComDayCqWcmCoreImplVersionPurgeTaskProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._versionpurge_max_age_days = versionpurge_max_age_days

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
        if not isinstance(other, ComDayCqWcmCoreImplVersionPurgeTaskProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
