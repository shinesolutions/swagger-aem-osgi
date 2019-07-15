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


class ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties(object):
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
        'endpoint_uri': 'ConfigNodePropertyString',
        'connection_timeout': 'ConfigNodePropertyInteger',
        'socket_timeout': 'ConfigNodePropertyInteger'
    }

    attribute_map = {
        'endpoint_uri': 'endpointUri',
        'connection_timeout': 'connectionTimeout',
        'socket_timeout': 'socketTimeout'
    }

    def __init__(self, endpoint_uri=None, connection_timeout=None, socket_timeout=None):  # noqa: E501
        """ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._endpoint_uri = None
        self._connection_timeout = None
        self._socket_timeout = None
        self.discriminator = None

        if endpoint_uri is not None:
            self.endpoint_uri = endpoint_uri
        if connection_timeout is not None:
            self.connection_timeout = connection_timeout
        if socket_timeout is not None:
            self.socket_timeout = socket_timeout

    @property
    def endpoint_uri(self):
        """Gets the endpoint_uri of this ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.  # noqa: E501


        :return: The endpoint_uri of this ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._endpoint_uri

    @endpoint_uri.setter
    def endpoint_uri(self, endpoint_uri):
        """Sets the endpoint_uri of this ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.


        :param endpoint_uri: The endpoint_uri of this ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._endpoint_uri = endpoint_uri

    @property
    def connection_timeout(self):
        """Gets the connection_timeout of this ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.  # noqa: E501


        :return: The connection_timeout of this ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._connection_timeout

    @connection_timeout.setter
    def connection_timeout(self, connection_timeout):
        """Sets the connection_timeout of this ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.


        :param connection_timeout: The connection_timeout of this ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._connection_timeout = connection_timeout

    @property
    def socket_timeout(self):
        """Gets the socket_timeout of this ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.  # noqa: E501


        :return: The socket_timeout of this ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._socket_timeout

    @socket_timeout.setter
    def socket_timeout(self, socket_timeout):
        """Sets the socket_timeout of this ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.


        :param socket_timeout: The socket_timeout of this ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._socket_timeout = socket_timeout

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
        if not isinstance(other, ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
