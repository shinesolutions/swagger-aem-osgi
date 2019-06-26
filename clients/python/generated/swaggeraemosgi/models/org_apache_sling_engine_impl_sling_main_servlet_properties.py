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


class OrgApacheSlingEngineImplSlingMainServletProperties(object):
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
        'sling_max_calls': 'ConfigNodePropertyInteger',
        'sling_max_inclusions': 'ConfigNodePropertyInteger',
        'sling_trace_allow': 'ConfigNodePropertyBoolean',
        'sling_max_record_requests': 'ConfigNodePropertyInteger',
        'sling_store_pattern_requests': 'ConfigNodePropertyArray',
        'sling_serverinfo': 'ConfigNodePropertyString',
        'sling_additional_response_headers': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'sling_max_calls': 'sling.max.calls',
        'sling_max_inclusions': 'sling.max.inclusions',
        'sling_trace_allow': 'sling.trace.allow',
        'sling_max_record_requests': 'sling.max.record.requests',
        'sling_store_pattern_requests': 'sling.store.pattern.requests',
        'sling_serverinfo': 'sling.serverinfo',
        'sling_additional_response_headers': 'sling.additional.response.headers'
    }

    def __init__(self, sling_max_calls=None, sling_max_inclusions=None, sling_trace_allow=None, sling_max_record_requests=None, sling_store_pattern_requests=None, sling_serverinfo=None, sling_additional_response_headers=None):  # noqa: E501
        """OrgApacheSlingEngineImplSlingMainServletProperties - a model defined in OpenAPI"""  # noqa: E501

        self._sling_max_calls = None
        self._sling_max_inclusions = None
        self._sling_trace_allow = None
        self._sling_max_record_requests = None
        self._sling_store_pattern_requests = None
        self._sling_serverinfo = None
        self._sling_additional_response_headers = None
        self.discriminator = None

        if sling_max_calls is not None:
            self.sling_max_calls = sling_max_calls
        if sling_max_inclusions is not None:
            self.sling_max_inclusions = sling_max_inclusions
        if sling_trace_allow is not None:
            self.sling_trace_allow = sling_trace_allow
        if sling_max_record_requests is not None:
            self.sling_max_record_requests = sling_max_record_requests
        if sling_store_pattern_requests is not None:
            self.sling_store_pattern_requests = sling_store_pattern_requests
        if sling_serverinfo is not None:
            self.sling_serverinfo = sling_serverinfo
        if sling_additional_response_headers is not None:
            self.sling_additional_response_headers = sling_additional_response_headers

    @property
    def sling_max_calls(self):
        """Gets the sling_max_calls of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501


        :return: The sling_max_calls of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._sling_max_calls

    @sling_max_calls.setter
    def sling_max_calls(self, sling_max_calls):
        """Sets the sling_max_calls of this OrgApacheSlingEngineImplSlingMainServletProperties.


        :param sling_max_calls: The sling_max_calls of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._sling_max_calls = sling_max_calls

    @property
    def sling_max_inclusions(self):
        """Gets the sling_max_inclusions of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501


        :return: The sling_max_inclusions of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._sling_max_inclusions

    @sling_max_inclusions.setter
    def sling_max_inclusions(self, sling_max_inclusions):
        """Sets the sling_max_inclusions of this OrgApacheSlingEngineImplSlingMainServletProperties.


        :param sling_max_inclusions: The sling_max_inclusions of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._sling_max_inclusions = sling_max_inclusions

    @property
    def sling_trace_allow(self):
        """Gets the sling_trace_allow of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501


        :return: The sling_trace_allow of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._sling_trace_allow

    @sling_trace_allow.setter
    def sling_trace_allow(self, sling_trace_allow):
        """Sets the sling_trace_allow of this OrgApacheSlingEngineImplSlingMainServletProperties.


        :param sling_trace_allow: The sling_trace_allow of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._sling_trace_allow = sling_trace_allow

    @property
    def sling_max_record_requests(self):
        """Gets the sling_max_record_requests of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501


        :return: The sling_max_record_requests of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._sling_max_record_requests

    @sling_max_record_requests.setter
    def sling_max_record_requests(self, sling_max_record_requests):
        """Sets the sling_max_record_requests of this OrgApacheSlingEngineImplSlingMainServletProperties.


        :param sling_max_record_requests: The sling_max_record_requests of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._sling_max_record_requests = sling_max_record_requests

    @property
    def sling_store_pattern_requests(self):
        """Gets the sling_store_pattern_requests of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501


        :return: The sling_store_pattern_requests of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._sling_store_pattern_requests

    @sling_store_pattern_requests.setter
    def sling_store_pattern_requests(self, sling_store_pattern_requests):
        """Sets the sling_store_pattern_requests of this OrgApacheSlingEngineImplSlingMainServletProperties.


        :param sling_store_pattern_requests: The sling_store_pattern_requests of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._sling_store_pattern_requests = sling_store_pattern_requests

    @property
    def sling_serverinfo(self):
        """Gets the sling_serverinfo of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501


        :return: The sling_serverinfo of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._sling_serverinfo

    @sling_serverinfo.setter
    def sling_serverinfo(self, sling_serverinfo):
        """Sets the sling_serverinfo of this OrgApacheSlingEngineImplSlingMainServletProperties.


        :param sling_serverinfo: The sling_serverinfo of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._sling_serverinfo = sling_serverinfo

    @property
    def sling_additional_response_headers(self):
        """Gets the sling_additional_response_headers of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501


        :return: The sling_additional_response_headers of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._sling_additional_response_headers

    @sling_additional_response_headers.setter
    def sling_additional_response_headers(self, sling_additional_response_headers):
        """Sets the sling_additional_response_headers of this OrgApacheSlingEngineImplSlingMainServletProperties.


        :param sling_additional_response_headers: The sling_additional_response_headers of this OrgApacheSlingEngineImplSlingMainServletProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._sling_additional_response_headers = sling_additional_response_headers

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
        if not isinstance(other, OrgApacheSlingEngineImplSlingMainServletProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
