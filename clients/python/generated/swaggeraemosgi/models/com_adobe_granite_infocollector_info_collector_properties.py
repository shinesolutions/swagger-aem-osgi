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


class ComAdobeGraniteInfocollectorInfoCollectorProperties(object):
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
        'granite_infocollector_include_thread_dumps': 'ConfigNodePropertyBoolean',
        'granite_infocollector_include_heap_dump': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'granite_infocollector_include_thread_dumps': 'granite.infocollector.includeThreadDumps',
        'granite_infocollector_include_heap_dump': 'granite.infocollector.includeHeapDump'
    }

    def __init__(self, granite_infocollector_include_thread_dumps=None, granite_infocollector_include_heap_dump=None):  # noqa: E501
        """ComAdobeGraniteInfocollectorInfoCollectorProperties - a model defined in OpenAPI"""  # noqa: E501

        self._granite_infocollector_include_thread_dumps = None
        self._granite_infocollector_include_heap_dump = None
        self.discriminator = None

        if granite_infocollector_include_thread_dumps is not None:
            self.granite_infocollector_include_thread_dumps = granite_infocollector_include_thread_dumps
        if granite_infocollector_include_heap_dump is not None:
            self.granite_infocollector_include_heap_dump = granite_infocollector_include_heap_dump

    @property
    def granite_infocollector_include_thread_dumps(self):
        """Gets the granite_infocollector_include_thread_dumps of this ComAdobeGraniteInfocollectorInfoCollectorProperties.  # noqa: E501


        :return: The granite_infocollector_include_thread_dumps of this ComAdobeGraniteInfocollectorInfoCollectorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._granite_infocollector_include_thread_dumps

    @granite_infocollector_include_thread_dumps.setter
    def granite_infocollector_include_thread_dumps(self, granite_infocollector_include_thread_dumps):
        """Sets the granite_infocollector_include_thread_dumps of this ComAdobeGraniteInfocollectorInfoCollectorProperties.


        :param granite_infocollector_include_thread_dumps: The granite_infocollector_include_thread_dumps of this ComAdobeGraniteInfocollectorInfoCollectorProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._granite_infocollector_include_thread_dumps = granite_infocollector_include_thread_dumps

    @property
    def granite_infocollector_include_heap_dump(self):
        """Gets the granite_infocollector_include_heap_dump of this ComAdobeGraniteInfocollectorInfoCollectorProperties.  # noqa: E501


        :return: The granite_infocollector_include_heap_dump of this ComAdobeGraniteInfocollectorInfoCollectorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._granite_infocollector_include_heap_dump

    @granite_infocollector_include_heap_dump.setter
    def granite_infocollector_include_heap_dump(self, granite_infocollector_include_heap_dump):
        """Sets the granite_infocollector_include_heap_dump of this ComAdobeGraniteInfocollectorInfoCollectorProperties.


        :param granite_infocollector_include_heap_dump: The granite_infocollector_include_heap_dump of this ComAdobeGraniteInfocollectorInfoCollectorProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._granite_infocollector_include_heap_dump = granite_infocollector_include_heap_dump

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
        if not isinstance(other, ComAdobeGraniteInfocollectorInfoCollectorProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other