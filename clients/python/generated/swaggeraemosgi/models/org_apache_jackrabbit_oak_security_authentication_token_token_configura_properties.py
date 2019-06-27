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


class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties(object):
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
        'token_expiration': 'ConfigNodePropertyString',
        'token_length': 'ConfigNodePropertyString',
        'token_refresh': 'ConfigNodePropertyBoolean',
        'token_cleanup_threshold': 'ConfigNodePropertyInteger',
        'password_hash_algorithm': 'ConfigNodePropertyString',
        'password_hash_iterations': 'ConfigNodePropertyInteger',
        'password_salt_size': 'ConfigNodePropertyInteger'
    }

    attribute_map = {
        'token_expiration': 'tokenExpiration',
        'token_length': 'tokenLength',
        'token_refresh': 'tokenRefresh',
        'token_cleanup_threshold': 'tokenCleanupThreshold',
        'password_hash_algorithm': 'passwordHashAlgorithm',
        'password_hash_iterations': 'passwordHashIterations',
        'password_salt_size': 'passwordSaltSize'
    }

    def __init__(self, token_expiration=None, token_length=None, token_refresh=None, token_cleanup_threshold=None, password_hash_algorithm=None, password_hash_iterations=None, password_salt_size=None):  # noqa: E501
        """OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties - a model defined in OpenAPI"""  # noqa: E501

        self._token_expiration = None
        self._token_length = None
        self._token_refresh = None
        self._token_cleanup_threshold = None
        self._password_hash_algorithm = None
        self._password_hash_iterations = None
        self._password_salt_size = None
        self.discriminator = None

        if token_expiration is not None:
            self.token_expiration = token_expiration
        if token_length is not None:
            self.token_length = token_length
        if token_refresh is not None:
            self.token_refresh = token_refresh
        if token_cleanup_threshold is not None:
            self.token_cleanup_threshold = token_cleanup_threshold
        if password_hash_algorithm is not None:
            self.password_hash_algorithm = password_hash_algorithm
        if password_hash_iterations is not None:
            self.password_hash_iterations = password_hash_iterations
        if password_salt_size is not None:
            self.password_salt_size = password_salt_size

    @property
    def token_expiration(self):
        """Gets the token_expiration of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501


        :return: The token_expiration of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._token_expiration

    @token_expiration.setter
    def token_expiration(self, token_expiration):
        """Sets the token_expiration of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.


        :param token_expiration: The token_expiration of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._token_expiration = token_expiration

    @property
    def token_length(self):
        """Gets the token_length of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501


        :return: The token_length of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._token_length

    @token_length.setter
    def token_length(self, token_length):
        """Sets the token_length of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.


        :param token_length: The token_length of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._token_length = token_length

    @property
    def token_refresh(self):
        """Gets the token_refresh of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501


        :return: The token_refresh of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._token_refresh

    @token_refresh.setter
    def token_refresh(self, token_refresh):
        """Sets the token_refresh of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.


        :param token_refresh: The token_refresh of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._token_refresh = token_refresh

    @property
    def token_cleanup_threshold(self):
        """Gets the token_cleanup_threshold of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501


        :return: The token_cleanup_threshold of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._token_cleanup_threshold

    @token_cleanup_threshold.setter
    def token_cleanup_threshold(self, token_cleanup_threshold):
        """Sets the token_cleanup_threshold of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.


        :param token_cleanup_threshold: The token_cleanup_threshold of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._token_cleanup_threshold = token_cleanup_threshold

    @property
    def password_hash_algorithm(self):
        """Gets the password_hash_algorithm of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501


        :return: The password_hash_algorithm of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._password_hash_algorithm

    @password_hash_algorithm.setter
    def password_hash_algorithm(self, password_hash_algorithm):
        """Sets the password_hash_algorithm of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.


        :param password_hash_algorithm: The password_hash_algorithm of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._password_hash_algorithm = password_hash_algorithm

    @property
    def password_hash_iterations(self):
        """Gets the password_hash_iterations of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501


        :return: The password_hash_iterations of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._password_hash_iterations

    @password_hash_iterations.setter
    def password_hash_iterations(self, password_hash_iterations):
        """Sets the password_hash_iterations of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.


        :param password_hash_iterations: The password_hash_iterations of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._password_hash_iterations = password_hash_iterations

    @property
    def password_salt_size(self):
        """Gets the password_salt_size of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501


        :return: The password_salt_size of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._password_salt_size

    @password_salt_size.setter
    def password_salt_size(self, password_salt_size):
        """Sets the password_salt_size of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.


        :param password_salt_size: The password_salt_size of this OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._password_salt_size = password_salt_size

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
        if not isinstance(other, OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other