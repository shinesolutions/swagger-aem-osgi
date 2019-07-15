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


class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties(object):
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
        'attachment_type_blacklist': 'ConfigNodePropertyString',
        'extension_order': 'ConfigNodePropertyInteger'
    }

    attribute_map = {
        'attachment_type_blacklist': 'attachmentTypeBlacklist',
        'extension_order': 'extension.order'
    }

    def __init__(self, attachment_type_blacklist=None, extension_order=None):  # noqa: E501
        """ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties - a model defined in OpenAPI"""  # noqa: E501

        self._attachment_type_blacklist = None
        self._extension_order = None
        self.discriminator = None

        if attachment_type_blacklist is not None:
            self.attachment_type_blacklist = attachment_type_blacklist
        if extension_order is not None:
            self.extension_order = extension_order

    @property
    def attachment_type_blacklist(self):
        """Gets the attachment_type_blacklist of this ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.  # noqa: E501


        :return: The attachment_type_blacklist of this ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._attachment_type_blacklist

    @attachment_type_blacklist.setter
    def attachment_type_blacklist(self, attachment_type_blacklist):
        """Sets the attachment_type_blacklist of this ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.


        :param attachment_type_blacklist: The attachment_type_blacklist of this ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._attachment_type_blacklist = attachment_type_blacklist

    @property
    def extension_order(self):
        """Gets the extension_order of this ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.  # noqa: E501


        :return: The extension_order of this ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._extension_order

    @extension_order.setter
    def extension_order(self, extension_order):
        """Sets the extension_order of this ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.


        :param extension_order: The extension_order of this ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._extension_order = extension_order

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
        if not isinstance(other, ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
