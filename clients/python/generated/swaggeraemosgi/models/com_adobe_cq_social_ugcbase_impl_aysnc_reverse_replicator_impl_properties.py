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


class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties(object):
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
        'pool_size': 'ConfigNodePropertyInteger',
        'max_pool_size': 'ConfigNodePropertyInteger',
        'queue_size': 'ConfigNodePropertyInteger',
        'keep_alive_time': 'ConfigNodePropertyInteger'
    }

    attribute_map = {
        'pool_size': 'poolSize',
        'max_pool_size': 'maxPoolSize',
        'queue_size': 'queueSize',
        'keep_alive_time': 'keepAliveTime'
    }

    def __init__(self, pool_size=None, max_pool_size=None, queue_size=None, keep_alive_time=None):  # noqa: E501
        """ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._pool_size = None
        self._max_pool_size = None
        self._queue_size = None
        self._keep_alive_time = None
        self.discriminator = None

        if pool_size is not None:
            self.pool_size = pool_size
        if max_pool_size is not None:
            self.max_pool_size = max_pool_size
        if queue_size is not None:
            self.queue_size = queue_size
        if keep_alive_time is not None:
            self.keep_alive_time = keep_alive_time

    @property
    def pool_size(self):
        """Gets the pool_size of this ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.  # noqa: E501


        :return: The pool_size of this ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._pool_size

    @pool_size.setter
    def pool_size(self, pool_size):
        """Sets the pool_size of this ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.


        :param pool_size: The pool_size of this ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._pool_size = pool_size

    @property
    def max_pool_size(self):
        """Gets the max_pool_size of this ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.  # noqa: E501


        :return: The max_pool_size of this ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._max_pool_size

    @max_pool_size.setter
    def max_pool_size(self, max_pool_size):
        """Sets the max_pool_size of this ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.


        :param max_pool_size: The max_pool_size of this ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._max_pool_size = max_pool_size

    @property
    def queue_size(self):
        """Gets the queue_size of this ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.  # noqa: E501


        :return: The queue_size of this ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._queue_size

    @queue_size.setter
    def queue_size(self, queue_size):
        """Sets the queue_size of this ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.


        :param queue_size: The queue_size of this ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._queue_size = queue_size

    @property
    def keep_alive_time(self):
        """Gets the keep_alive_time of this ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.  # noqa: E501


        :return: The keep_alive_time of this ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._keep_alive_time

    @keep_alive_time.setter
    def keep_alive_time(self, keep_alive_time):
        """Sets the keep_alive_time of this ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.


        :param keep_alive_time: The keep_alive_time of this ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._keep_alive_time = keep_alive_time

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
        if not isinstance(other, ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other