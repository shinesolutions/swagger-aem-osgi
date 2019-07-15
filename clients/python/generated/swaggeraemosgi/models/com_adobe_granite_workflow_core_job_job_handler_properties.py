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


class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties(object):
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
        'job_topics': 'ConfigNodePropertyArray',
        'allow_self_process_termination': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'job_topics': 'job.topics',
        'allow_self_process_termination': 'allow.self.process.termination'
    }

    def __init__(self, job_topics=None, allow_self_process_termination=None):  # noqa: E501
        """ComAdobeGraniteWorkflowCoreJobJobHandlerProperties - a model defined in OpenAPI"""  # noqa: E501

        self._job_topics = None
        self._allow_self_process_termination = None
        self.discriminator = None

        if job_topics is not None:
            self.job_topics = job_topics
        if allow_self_process_termination is not None:
            self.allow_self_process_termination = allow_self_process_termination

    @property
    def job_topics(self):
        """Gets the job_topics of this ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.  # noqa: E501


        :return: The job_topics of this ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._job_topics

    @job_topics.setter
    def job_topics(self, job_topics):
        """Sets the job_topics of this ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.


        :param job_topics: The job_topics of this ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._job_topics = job_topics

    @property
    def allow_self_process_termination(self):
        """Gets the allow_self_process_termination of this ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.  # noqa: E501


        :return: The allow_self_process_termination of this ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._allow_self_process_termination

    @allow_self_process_termination.setter
    def allow_self_process_termination(self, allow_self_process_termination):
        """Sets the allow_self_process_termination of this ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.


        :param allow_self_process_termination: The allow_self_process_termination of this ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._allow_self_process_termination = allow_self_process_termination

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
        if not isinstance(other, ComAdobeGraniteWorkflowCoreJobJobHandlerProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
