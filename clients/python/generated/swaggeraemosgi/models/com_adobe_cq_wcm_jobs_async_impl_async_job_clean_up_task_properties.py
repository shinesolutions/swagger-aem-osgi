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


class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties(object):
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
        'scheduler_expression': 'ConfigNodePropertyString',
        'job_purge_threshold': 'ConfigNodePropertyInteger',
        'job_purge_max_jobs': 'ConfigNodePropertyInteger'
    }

    attribute_map = {
        'scheduler_expression': 'scheduler.expression',
        'job_purge_threshold': 'job.purge.threshold',
        'job_purge_max_jobs': 'job.purge.max.jobs'
    }

    def __init__(self, scheduler_expression=None, job_purge_threshold=None, job_purge_max_jobs=None):  # noqa: E501
        """ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties - a model defined in OpenAPI"""  # noqa: E501

        self._scheduler_expression = None
        self._job_purge_threshold = None
        self._job_purge_max_jobs = None
        self.discriminator = None

        if scheduler_expression is not None:
            self.scheduler_expression = scheduler_expression
        if job_purge_threshold is not None:
            self.job_purge_threshold = job_purge_threshold
        if job_purge_max_jobs is not None:
            self.job_purge_max_jobs = job_purge_max_jobs

    @property
    def scheduler_expression(self):
        """Gets the scheduler_expression of this ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.  # noqa: E501


        :return: The scheduler_expression of this ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._scheduler_expression

    @scheduler_expression.setter
    def scheduler_expression(self, scheduler_expression):
        """Sets the scheduler_expression of this ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.


        :param scheduler_expression: The scheduler_expression of this ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._scheduler_expression = scheduler_expression

    @property
    def job_purge_threshold(self):
        """Gets the job_purge_threshold of this ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.  # noqa: E501


        :return: The job_purge_threshold of this ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._job_purge_threshold

    @job_purge_threshold.setter
    def job_purge_threshold(self, job_purge_threshold):
        """Sets the job_purge_threshold of this ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.


        :param job_purge_threshold: The job_purge_threshold of this ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._job_purge_threshold = job_purge_threshold

    @property
    def job_purge_max_jobs(self):
        """Gets the job_purge_max_jobs of this ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.  # noqa: E501


        :return: The job_purge_max_jobs of this ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._job_purge_max_jobs

    @job_purge_max_jobs.setter
    def job_purge_max_jobs(self, job_purge_max_jobs):
        """Sets the job_purge_max_jobs of this ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.


        :param job_purge_max_jobs: The job_purge_max_jobs of this ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._job_purge_max_jobs = job_purge_max_jobs

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
        if not isinstance(other, ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
