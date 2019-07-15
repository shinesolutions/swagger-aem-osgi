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


class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties(object):
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
        'cug_supported_paths': 'ConfigNodePropertyArray',
        'cug_enabled': 'ConfigNodePropertyBoolean',
        'configuration_ranking': 'ConfigNodePropertyInteger'
    }

    attribute_map = {
        'cug_supported_paths': 'cugSupportedPaths',
        'cug_enabled': 'cugEnabled',
        'configuration_ranking': 'configurationRanking'
    }

    def __init__(self, cug_supported_paths=None, cug_enabled=None, configuration_ranking=None):  # noqa: E501
        """OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties - a model defined in OpenAPI"""  # noqa: E501

        self._cug_supported_paths = None
        self._cug_enabled = None
        self._configuration_ranking = None
        self.discriminator = None

        if cug_supported_paths is not None:
            self.cug_supported_paths = cug_supported_paths
        if cug_enabled is not None:
            self.cug_enabled = cug_enabled
        if configuration_ranking is not None:
            self.configuration_ranking = configuration_ranking

    @property
    def cug_supported_paths(self):
        """Gets the cug_supported_paths of this OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.  # noqa: E501


        :return: The cug_supported_paths of this OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._cug_supported_paths

    @cug_supported_paths.setter
    def cug_supported_paths(self, cug_supported_paths):
        """Sets the cug_supported_paths of this OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.


        :param cug_supported_paths: The cug_supported_paths of this OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._cug_supported_paths = cug_supported_paths

    @property
    def cug_enabled(self):
        """Gets the cug_enabled of this OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.  # noqa: E501


        :return: The cug_enabled of this OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._cug_enabled

    @cug_enabled.setter
    def cug_enabled(self, cug_enabled):
        """Sets the cug_enabled of this OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.


        :param cug_enabled: The cug_enabled of this OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._cug_enabled = cug_enabled

    @property
    def configuration_ranking(self):
        """Gets the configuration_ranking of this OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.  # noqa: E501


        :return: The configuration_ranking of this OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._configuration_ranking

    @configuration_ranking.setter
    def configuration_ranking(self, configuration_ranking):
        """Sets the configuration_ranking of this OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.


        :param configuration_ranking: The configuration_ranking of this OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._configuration_ranking = configuration_ranking

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
        if not isinstance(other, OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
