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


class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties(object):
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
        'thread_pool_size': 'ConfigNodePropertyInteger',
        'delay_time': 'ConfigNodePropertyInteger',
        'worker_sleep_time': 'ConfigNodePropertyInteger'
    }

    attribute_map = {
        'thread_pool_size': 'threadPoolSize',
        'delay_time': 'delayTime',
        'worker_sleep_time': 'workerSleepTime'
    }

    def __init__(self, thread_pool_size=None, delay_time=None, worker_sleep_time=None):  # noqa: E501
        """ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._thread_pool_size = None
        self._delay_time = None
        self._worker_sleep_time = None
        self.discriminator = None

        if thread_pool_size is not None:
            self.thread_pool_size = thread_pool_size
        if delay_time is not None:
            self.delay_time = delay_time
        if worker_sleep_time is not None:
            self.worker_sleep_time = worker_sleep_time

    @property
    def thread_pool_size(self):
        """Gets the thread_pool_size of this ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.  # noqa: E501


        :return: The thread_pool_size of this ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._thread_pool_size

    @thread_pool_size.setter
    def thread_pool_size(self, thread_pool_size):
        """Sets the thread_pool_size of this ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.


        :param thread_pool_size: The thread_pool_size of this ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._thread_pool_size = thread_pool_size

    @property
    def delay_time(self):
        """Gets the delay_time of this ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.  # noqa: E501


        :return: The delay_time of this ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._delay_time

    @delay_time.setter
    def delay_time(self, delay_time):
        """Sets the delay_time of this ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.


        :param delay_time: The delay_time of this ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._delay_time = delay_time

    @property
    def worker_sleep_time(self):
        """Gets the worker_sleep_time of this ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.  # noqa: E501


        :return: The worker_sleep_time of this ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._worker_sleep_time

    @worker_sleep_time.setter
    def worker_sleep_time(self, worker_sleep_time):
        """Sets the worker_sleep_time of this ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.


        :param worker_sleep_time: The worker_sleep_time of this ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._worker_sleep_time = worker_sleep_time

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
        if not isinstance(other, ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
