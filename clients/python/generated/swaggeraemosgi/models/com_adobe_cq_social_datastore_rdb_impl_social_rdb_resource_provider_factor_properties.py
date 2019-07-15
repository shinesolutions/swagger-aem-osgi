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


class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties(object):
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
        'solr_zk_timeout': 'ConfigNodePropertyString',
        'solr_commit': 'ConfigNodePropertyString',
        'cache_on': 'ConfigNodePropertyBoolean',
        'concurrency_level': 'ConfigNodePropertyInteger',
        'cache_start_size': 'ConfigNodePropertyInteger',
        'cache_ttl': 'ConfigNodePropertyInteger',
        'cache_size': 'ConfigNodePropertyInteger'
    }

    attribute_map = {
        'solr_zk_timeout': 'solr.zk.timeout',
        'solr_commit': 'solr.commit',
        'cache_on': 'cache.on',
        'concurrency_level': 'concurrency.level',
        'cache_start_size': 'cache.start.size',
        'cache_ttl': 'cache.ttl',
        'cache_size': 'cache.size'
    }

    def __init__(self, solr_zk_timeout=None, solr_commit=None, cache_on=None, concurrency_level=None, cache_start_size=None, cache_ttl=None, cache_size=None):  # noqa: E501
        """ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties - a model defined in OpenAPI"""  # noqa: E501

        self._solr_zk_timeout = None
        self._solr_commit = None
        self._cache_on = None
        self._concurrency_level = None
        self._cache_start_size = None
        self._cache_ttl = None
        self._cache_size = None
        self.discriminator = None

        if solr_zk_timeout is not None:
            self.solr_zk_timeout = solr_zk_timeout
        if solr_commit is not None:
            self.solr_commit = solr_commit
        if cache_on is not None:
            self.cache_on = cache_on
        if concurrency_level is not None:
            self.concurrency_level = concurrency_level
        if cache_start_size is not None:
            self.cache_start_size = cache_start_size
        if cache_ttl is not None:
            self.cache_ttl = cache_ttl
        if cache_size is not None:
            self.cache_size = cache_size

    @property
    def solr_zk_timeout(self):
        """Gets the solr_zk_timeout of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501


        :return: The solr_zk_timeout of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._solr_zk_timeout

    @solr_zk_timeout.setter
    def solr_zk_timeout(self, solr_zk_timeout):
        """Sets the solr_zk_timeout of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :param solr_zk_timeout: The solr_zk_timeout of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._solr_zk_timeout = solr_zk_timeout

    @property
    def solr_commit(self):
        """Gets the solr_commit of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501


        :return: The solr_commit of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._solr_commit

    @solr_commit.setter
    def solr_commit(self, solr_commit):
        """Sets the solr_commit of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :param solr_commit: The solr_commit of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._solr_commit = solr_commit

    @property
    def cache_on(self):
        """Gets the cache_on of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501


        :return: The cache_on of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._cache_on

    @cache_on.setter
    def cache_on(self, cache_on):
        """Sets the cache_on of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :param cache_on: The cache_on of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._cache_on = cache_on

    @property
    def concurrency_level(self):
        """Gets the concurrency_level of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501


        :return: The concurrency_level of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._concurrency_level

    @concurrency_level.setter
    def concurrency_level(self, concurrency_level):
        """Sets the concurrency_level of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :param concurrency_level: The concurrency_level of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._concurrency_level = concurrency_level

    @property
    def cache_start_size(self):
        """Gets the cache_start_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501


        :return: The cache_start_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._cache_start_size

    @cache_start_size.setter
    def cache_start_size(self, cache_start_size):
        """Sets the cache_start_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :param cache_start_size: The cache_start_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._cache_start_size = cache_start_size

    @property
    def cache_ttl(self):
        """Gets the cache_ttl of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501


        :return: The cache_ttl of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._cache_ttl

    @cache_ttl.setter
    def cache_ttl(self, cache_ttl):
        """Sets the cache_ttl of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :param cache_ttl: The cache_ttl of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._cache_ttl = cache_ttl

    @property
    def cache_size(self):
        """Gets the cache_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501


        :return: The cache_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._cache_size

    @cache_size.setter
    def cache_size(self, cache_size):
        """Sets the cache_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :param cache_size: The cache_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._cache_size = cache_size

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
        if not isinstance(other, ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
