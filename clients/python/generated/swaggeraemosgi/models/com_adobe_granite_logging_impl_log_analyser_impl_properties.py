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


class ComAdobeGraniteLoggingImplLogAnalyserImplProperties(object):
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
        'messages_queue_size': 'ConfigNodePropertyInteger',
        'logger_config': 'ConfigNodePropertyArray',
        'messages_size': 'ConfigNodePropertyInteger'
    }

    attribute_map = {
        'messages_queue_size': 'messages.queue.size',
        'logger_config': 'logger.config',
        'messages_size': 'messages.size'
    }

    def __init__(self, messages_queue_size=None, logger_config=None, messages_size=None):  # noqa: E501
        """ComAdobeGraniteLoggingImplLogAnalyserImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._messages_queue_size = None
        self._logger_config = None
        self._messages_size = None
        self.discriminator = None

        if messages_queue_size is not None:
            self.messages_queue_size = messages_queue_size
        if logger_config is not None:
            self.logger_config = logger_config
        if messages_size is not None:
            self.messages_size = messages_size

    @property
    def messages_queue_size(self):
        """Gets the messages_queue_size of this ComAdobeGraniteLoggingImplLogAnalyserImplProperties.  # noqa: E501


        :return: The messages_queue_size of this ComAdobeGraniteLoggingImplLogAnalyserImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._messages_queue_size

    @messages_queue_size.setter
    def messages_queue_size(self, messages_queue_size):
        """Sets the messages_queue_size of this ComAdobeGraniteLoggingImplLogAnalyserImplProperties.


        :param messages_queue_size: The messages_queue_size of this ComAdobeGraniteLoggingImplLogAnalyserImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._messages_queue_size = messages_queue_size

    @property
    def logger_config(self):
        """Gets the logger_config of this ComAdobeGraniteLoggingImplLogAnalyserImplProperties.  # noqa: E501


        :return: The logger_config of this ComAdobeGraniteLoggingImplLogAnalyserImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._logger_config

    @logger_config.setter
    def logger_config(self, logger_config):
        """Sets the logger_config of this ComAdobeGraniteLoggingImplLogAnalyserImplProperties.


        :param logger_config: The logger_config of this ComAdobeGraniteLoggingImplLogAnalyserImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._logger_config = logger_config

    @property
    def messages_size(self):
        """Gets the messages_size of this ComAdobeGraniteLoggingImplLogAnalyserImplProperties.  # noqa: E501


        :return: The messages_size of this ComAdobeGraniteLoggingImplLogAnalyserImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._messages_size

    @messages_size.setter
    def messages_size(self, messages_size):
        """Sets the messages_size of this ComAdobeGraniteLoggingImplLogAnalyserImplProperties.


        :param messages_size: The messages_size of this ComAdobeGraniteLoggingImplLogAnalyserImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._messages_size = messages_size

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
        if not isinstance(other, ComAdobeGraniteLoggingImplLogAnalyserImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
