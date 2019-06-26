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


class OrgApacheSlingTracerInternalLogTracerProperties(object):
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
        'tracer_sets': 'ConfigNodePropertyArray',
        'enabled': 'ConfigNodePropertyBoolean',
        'servlet_enabled': 'ConfigNodePropertyBoolean',
        'recording_cache_size_in_mb': 'ConfigNodePropertyInteger',
        'recording_cache_duration_in_secs': 'ConfigNodePropertyInteger',
        'recording_compression_enabled': 'ConfigNodePropertyBoolean',
        'gzip_response': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'tracer_sets': 'tracerSets',
        'enabled': 'enabled',
        'servlet_enabled': 'servletEnabled',
        'recording_cache_size_in_mb': 'recordingCacheSizeInMB',
        'recording_cache_duration_in_secs': 'recordingCacheDurationInSecs',
        'recording_compression_enabled': 'recordingCompressionEnabled',
        'gzip_response': 'gzipResponse'
    }

    def __init__(self, tracer_sets=None, enabled=None, servlet_enabled=None, recording_cache_size_in_mb=None, recording_cache_duration_in_secs=None, recording_compression_enabled=None, gzip_response=None):  # noqa: E501
        """OrgApacheSlingTracerInternalLogTracerProperties - a model defined in OpenAPI"""  # noqa: E501

        self._tracer_sets = None
        self._enabled = None
        self._servlet_enabled = None
        self._recording_cache_size_in_mb = None
        self._recording_cache_duration_in_secs = None
        self._recording_compression_enabled = None
        self._gzip_response = None
        self.discriminator = None

        if tracer_sets is not None:
            self.tracer_sets = tracer_sets
        if enabled is not None:
            self.enabled = enabled
        if servlet_enabled is not None:
            self.servlet_enabled = servlet_enabled
        if recording_cache_size_in_mb is not None:
            self.recording_cache_size_in_mb = recording_cache_size_in_mb
        if recording_cache_duration_in_secs is not None:
            self.recording_cache_duration_in_secs = recording_cache_duration_in_secs
        if recording_compression_enabled is not None:
            self.recording_compression_enabled = recording_compression_enabled
        if gzip_response is not None:
            self.gzip_response = gzip_response

    @property
    def tracer_sets(self):
        """Gets the tracer_sets of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501


        :return: The tracer_sets of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._tracer_sets

    @tracer_sets.setter
    def tracer_sets(self, tracer_sets):
        """Sets the tracer_sets of this OrgApacheSlingTracerInternalLogTracerProperties.


        :param tracer_sets: The tracer_sets of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._tracer_sets = tracer_sets

    @property
    def enabled(self):
        """Gets the enabled of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501


        :return: The enabled of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._enabled

    @enabled.setter
    def enabled(self, enabled):
        """Sets the enabled of this OrgApacheSlingTracerInternalLogTracerProperties.


        :param enabled: The enabled of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._enabled = enabled

    @property
    def servlet_enabled(self):
        """Gets the servlet_enabled of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501


        :return: The servlet_enabled of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._servlet_enabled

    @servlet_enabled.setter
    def servlet_enabled(self, servlet_enabled):
        """Sets the servlet_enabled of this OrgApacheSlingTracerInternalLogTracerProperties.


        :param servlet_enabled: The servlet_enabled of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._servlet_enabled = servlet_enabled

    @property
    def recording_cache_size_in_mb(self):
        """Gets the recording_cache_size_in_mb of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501


        :return: The recording_cache_size_in_mb of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._recording_cache_size_in_mb

    @recording_cache_size_in_mb.setter
    def recording_cache_size_in_mb(self, recording_cache_size_in_mb):
        """Sets the recording_cache_size_in_mb of this OrgApacheSlingTracerInternalLogTracerProperties.


        :param recording_cache_size_in_mb: The recording_cache_size_in_mb of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._recording_cache_size_in_mb = recording_cache_size_in_mb

    @property
    def recording_cache_duration_in_secs(self):
        """Gets the recording_cache_duration_in_secs of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501


        :return: The recording_cache_duration_in_secs of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._recording_cache_duration_in_secs

    @recording_cache_duration_in_secs.setter
    def recording_cache_duration_in_secs(self, recording_cache_duration_in_secs):
        """Sets the recording_cache_duration_in_secs of this OrgApacheSlingTracerInternalLogTracerProperties.


        :param recording_cache_duration_in_secs: The recording_cache_duration_in_secs of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._recording_cache_duration_in_secs = recording_cache_duration_in_secs

    @property
    def recording_compression_enabled(self):
        """Gets the recording_compression_enabled of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501


        :return: The recording_compression_enabled of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._recording_compression_enabled

    @recording_compression_enabled.setter
    def recording_compression_enabled(self, recording_compression_enabled):
        """Sets the recording_compression_enabled of this OrgApacheSlingTracerInternalLogTracerProperties.


        :param recording_compression_enabled: The recording_compression_enabled of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._recording_compression_enabled = recording_compression_enabled

    @property
    def gzip_response(self):
        """Gets the gzip_response of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501


        :return: The gzip_response of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._gzip_response

    @gzip_response.setter
    def gzip_response(self, gzip_response):
        """Sets the gzip_response of this OrgApacheSlingTracerInternalLogTracerProperties.


        :param gzip_response: The gzip_response of this OrgApacheSlingTracerInternalLogTracerProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._gzip_response = gzip_response

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
        if not isinstance(other, OrgApacheSlingTracerInternalLogTracerProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
