# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_boolean import ConfigNodePropertyBoolean  # noqa: F401,E501
from openapi_server.models.config_node_property_integer import ConfigNodePropertyInteger  # noqa: F401,E501
from openapi_server.models.config_node_property_string import ConfigNodePropertyString  # noqa: F401,E501
from openapi_server import util


class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, solr_zk_timeout: ConfigNodePropertyString=None, solr_commit: ConfigNodePropertyString=None, cache_on: ConfigNodePropertyBoolean=None, concurrency_level: ConfigNodePropertyInteger=None, cache_start_size: ConfigNodePropertyInteger=None, cache_ttl: ConfigNodePropertyInteger=None, cache_size: ConfigNodePropertyInteger=None):  # noqa: E501
        """ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties - a model defined in OpenAPI

        :param solr_zk_timeout: The solr_zk_timeout of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :type solr_zk_timeout: ConfigNodePropertyString
        :param solr_commit: The solr_commit of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :type solr_commit: ConfigNodePropertyString
        :param cache_on: The cache_on of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :type cache_on: ConfigNodePropertyBoolean
        :param concurrency_level: The concurrency_level of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :type concurrency_level: ConfigNodePropertyInteger
        :param cache_start_size: The cache_start_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :type cache_start_size: ConfigNodePropertyInteger
        :param cache_ttl: The cache_ttl of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :type cache_ttl: ConfigNodePropertyInteger
        :param cache_size: The cache_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :type cache_size: ConfigNodePropertyInteger
        """
        self.openapi_types = {
            'solr_zk_timeout': ConfigNodePropertyString,
            'solr_commit': ConfigNodePropertyString,
            'cache_on': ConfigNodePropertyBoolean,
            'concurrency_level': ConfigNodePropertyInteger,
            'cache_start_size': ConfigNodePropertyInteger,
            'cache_ttl': ConfigNodePropertyInteger,
            'cache_size': ConfigNodePropertyInteger
        }

        self.attribute_map = {
            'solr_zk_timeout': 'solr.zk.timeout',
            'solr_commit': 'solr.commit',
            'cache_on': 'cache.on',
            'concurrency_level': 'concurrency.level',
            'cache_start_size': 'cache.start.size',
            'cache_ttl': 'cache.ttl',
            'cache_size': 'cache.size'
        }

        self._solr_zk_timeout = solr_zk_timeout
        self._solr_commit = solr_commit
        self._cache_on = cache_on
        self._concurrency_level = concurrency_level
        self._cache_start_size = cache_start_size
        self._cache_ttl = cache_ttl
        self._cache_size = cache_size

    @classmethod
    def from_dict(cls, dikt) -> 'ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.  # noqa: E501
        :rtype: ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def solr_zk_timeout(self) -> ConfigNodePropertyString:
        """Gets the solr_zk_timeout of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :return: The solr_zk_timeout of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        :rtype: ConfigNodePropertyString
        """
        return self._solr_zk_timeout

    @solr_zk_timeout.setter
    def solr_zk_timeout(self, solr_zk_timeout: ConfigNodePropertyString):
        """Sets the solr_zk_timeout of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :param solr_zk_timeout: The solr_zk_timeout of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        :type solr_zk_timeout: ConfigNodePropertyString
        """

        self._solr_zk_timeout = solr_zk_timeout

    @property
    def solr_commit(self) -> ConfigNodePropertyString:
        """Gets the solr_commit of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :return: The solr_commit of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        :rtype: ConfigNodePropertyString
        """
        return self._solr_commit

    @solr_commit.setter
    def solr_commit(self, solr_commit: ConfigNodePropertyString):
        """Sets the solr_commit of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :param solr_commit: The solr_commit of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        :type solr_commit: ConfigNodePropertyString
        """

        self._solr_commit = solr_commit

    @property
    def cache_on(self) -> ConfigNodePropertyBoolean:
        """Gets the cache_on of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :return: The cache_on of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        :rtype: ConfigNodePropertyBoolean
        """
        return self._cache_on

    @cache_on.setter
    def cache_on(self, cache_on: ConfigNodePropertyBoolean):
        """Sets the cache_on of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :param cache_on: The cache_on of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        :type cache_on: ConfigNodePropertyBoolean
        """

        self._cache_on = cache_on

    @property
    def concurrency_level(self) -> ConfigNodePropertyInteger:
        """Gets the concurrency_level of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :return: The concurrency_level of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._concurrency_level

    @concurrency_level.setter
    def concurrency_level(self, concurrency_level: ConfigNodePropertyInteger):
        """Sets the concurrency_level of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :param concurrency_level: The concurrency_level of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        :type concurrency_level: ConfigNodePropertyInteger
        """

        self._concurrency_level = concurrency_level

    @property
    def cache_start_size(self) -> ConfigNodePropertyInteger:
        """Gets the cache_start_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :return: The cache_start_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._cache_start_size

    @cache_start_size.setter
    def cache_start_size(self, cache_start_size: ConfigNodePropertyInteger):
        """Sets the cache_start_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :param cache_start_size: The cache_start_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        :type cache_start_size: ConfigNodePropertyInteger
        """

        self._cache_start_size = cache_start_size

    @property
    def cache_ttl(self) -> ConfigNodePropertyInteger:
        """Gets the cache_ttl of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :return: The cache_ttl of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._cache_ttl

    @cache_ttl.setter
    def cache_ttl(self, cache_ttl: ConfigNodePropertyInteger):
        """Sets the cache_ttl of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :param cache_ttl: The cache_ttl of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        :type cache_ttl: ConfigNodePropertyInteger
        """

        self._cache_ttl = cache_ttl

    @property
    def cache_size(self) -> ConfigNodePropertyInteger:
        """Gets the cache_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :return: The cache_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._cache_size

    @cache_size.setter
    def cache_size(self, cache_size: ConfigNodePropertyInteger):
        """Sets the cache_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.


        :param cache_size: The cache_size of this ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
        :type cache_size: ConfigNodePropertyInteger
        """

        self._cache_size = cache_size