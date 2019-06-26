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


class ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistServiceProperties(object):
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
        'default_attachment_type_blacklist': 'ConfigNodePropertyArray',
        'baseline_attachment_type_blacklist': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'default_attachment_type_blacklist': 'default.attachment.type.blacklist',
        'baseline_attachment_type_blacklist': 'baseline.attachment.type.blacklist'
    }

    def __init__(self, default_attachment_type_blacklist=None, baseline_attachment_type_blacklist=None):  # noqa: E501
        """ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistServiceProperties - a model defined in OpenAPI"""  # noqa: E501

        self._default_attachment_type_blacklist = None
        self._baseline_attachment_type_blacklist = None
        self.discriminator = None

        if default_attachment_type_blacklist is not None:
            self.default_attachment_type_blacklist = default_attachment_type_blacklist
        if baseline_attachment_type_blacklist is not None:
            self.baseline_attachment_type_blacklist = baseline_attachment_type_blacklist

    @property
    def default_attachment_type_blacklist(self):
        """Gets the default_attachment_type_blacklist of this ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistServiceProperties.  # noqa: E501


        :return: The default_attachment_type_blacklist of this ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._default_attachment_type_blacklist

    @default_attachment_type_blacklist.setter
    def default_attachment_type_blacklist(self, default_attachment_type_blacklist):
        """Sets the default_attachment_type_blacklist of this ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistServiceProperties.


        :param default_attachment_type_blacklist: The default_attachment_type_blacklist of this ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._default_attachment_type_blacklist = default_attachment_type_blacklist

    @property
    def baseline_attachment_type_blacklist(self):
        """Gets the baseline_attachment_type_blacklist of this ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistServiceProperties.  # noqa: E501


        :return: The baseline_attachment_type_blacklist of this ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._baseline_attachment_type_blacklist

    @baseline_attachment_type_blacklist.setter
    def baseline_attachment_type_blacklist(self, baseline_attachment_type_blacklist):
        """Sets the baseline_attachment_type_blacklist of this ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistServiceProperties.


        :param baseline_attachment_type_blacklist: The baseline_attachment_type_blacklist of this ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._baseline_attachment_type_blacklist = baseline_attachment_type_blacklist

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
        if not isinstance(other, ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistServiceProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
