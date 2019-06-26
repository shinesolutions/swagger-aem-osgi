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


class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties(object):
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
        'whitelist_name': 'ConfigNodePropertyString',
        'whitelist_bundles': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'whitelist_name': 'whitelist.name',
        'whitelist_bundles': 'whitelist.bundles'
    }

    def __init__(self, whitelist_name=None, whitelist_bundles=None):  # noqa: E501
        """OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties - a model defined in OpenAPI"""  # noqa: E501

        self._whitelist_name = None
        self._whitelist_bundles = None
        self.discriminator = None

        if whitelist_name is not None:
            self.whitelist_name = whitelist_name
        if whitelist_bundles is not None:
            self.whitelist_bundles = whitelist_bundles

    @property
    def whitelist_name(self):
        """Gets the whitelist_name of this OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.  # noqa: E501


        :return: The whitelist_name of this OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._whitelist_name

    @whitelist_name.setter
    def whitelist_name(self, whitelist_name):
        """Sets the whitelist_name of this OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.


        :param whitelist_name: The whitelist_name of this OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._whitelist_name = whitelist_name

    @property
    def whitelist_bundles(self):
        """Gets the whitelist_bundles of this OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.  # noqa: E501


        :return: The whitelist_bundles of this OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._whitelist_bundles

    @whitelist_bundles.setter
    def whitelist_bundles(self, whitelist_bundles):
        """Sets the whitelist_bundles of this OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.


        :param whitelist_bundles: The whitelist_bundles of this OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._whitelist_bundles = whitelist_bundles

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
        if not isinstance(other, OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other