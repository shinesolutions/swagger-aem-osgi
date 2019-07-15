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


class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties(object):
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
        'org_apache_jackrabbit_oak_authentication_app_name': 'ConfigNodePropertyString',
        'org_apache_jackrabbit_oak_authentication_config_spi_name': 'ConfigNodePropertyString'
    }

    attribute_map = {
        'org_apache_jackrabbit_oak_authentication_app_name': 'org.apache.jackrabbit.oak.authentication.appName',
        'org_apache_jackrabbit_oak_authentication_config_spi_name': 'org.apache.jackrabbit.oak.authentication.configSpiName'
    }

    def __init__(self, org_apache_jackrabbit_oak_authentication_app_name=None, org_apache_jackrabbit_oak_authentication_config_spi_name=None):  # noqa: E501
        """OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties - a model defined in OpenAPI"""  # noqa: E501

        self._org_apache_jackrabbit_oak_authentication_app_name = None
        self._org_apache_jackrabbit_oak_authentication_config_spi_name = None
        self.discriminator = None

        if org_apache_jackrabbit_oak_authentication_app_name is not None:
            self.org_apache_jackrabbit_oak_authentication_app_name = org_apache_jackrabbit_oak_authentication_app_name
        if org_apache_jackrabbit_oak_authentication_config_spi_name is not None:
            self.org_apache_jackrabbit_oak_authentication_config_spi_name = org_apache_jackrabbit_oak_authentication_config_spi_name

    @property
    def org_apache_jackrabbit_oak_authentication_app_name(self):
        """Gets the org_apache_jackrabbit_oak_authentication_app_name of this OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.  # noqa: E501


        :return: The org_apache_jackrabbit_oak_authentication_app_name of this OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._org_apache_jackrabbit_oak_authentication_app_name

    @org_apache_jackrabbit_oak_authentication_app_name.setter
    def org_apache_jackrabbit_oak_authentication_app_name(self, org_apache_jackrabbit_oak_authentication_app_name):
        """Sets the org_apache_jackrabbit_oak_authentication_app_name of this OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.


        :param org_apache_jackrabbit_oak_authentication_app_name: The org_apache_jackrabbit_oak_authentication_app_name of this OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._org_apache_jackrabbit_oak_authentication_app_name = org_apache_jackrabbit_oak_authentication_app_name

    @property
    def org_apache_jackrabbit_oak_authentication_config_spi_name(self):
        """Gets the org_apache_jackrabbit_oak_authentication_config_spi_name of this OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.  # noqa: E501


        :return: The org_apache_jackrabbit_oak_authentication_config_spi_name of this OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._org_apache_jackrabbit_oak_authentication_config_spi_name

    @org_apache_jackrabbit_oak_authentication_config_spi_name.setter
    def org_apache_jackrabbit_oak_authentication_config_spi_name(self, org_apache_jackrabbit_oak_authentication_config_spi_name):
        """Sets the org_apache_jackrabbit_oak_authentication_config_spi_name of this OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.


        :param org_apache_jackrabbit_oak_authentication_config_spi_name: The org_apache_jackrabbit_oak_authentication_config_spi_name of this OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._org_apache_jackrabbit_oak_authentication_config_spi_name = org_apache_jackrabbit_oak_authentication_config_spi_name

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
        if not isinstance(other, OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
