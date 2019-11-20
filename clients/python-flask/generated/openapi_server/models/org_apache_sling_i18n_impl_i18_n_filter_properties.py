# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_array import ConfigNodePropertyArray  # noqa: F401,E501
from openapi_server.models.config_node_property_integer import ConfigNodePropertyInteger  # noqa: F401,E501
from openapi_server import util


class OrgApacheSlingI18nImplI18NFilterProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, service_ranking: ConfigNodePropertyInteger=None, sling_filter_scope: ConfigNodePropertyArray=None):  # noqa: E501
        """OrgApacheSlingI18nImplI18NFilterProperties - a model defined in OpenAPI

        :param service_ranking: The service_ranking of this OrgApacheSlingI18nImplI18NFilterProperties.  # noqa: E501
        :type service_ranking: ConfigNodePropertyInteger
        :param sling_filter_scope: The sling_filter_scope of this OrgApacheSlingI18nImplI18NFilterProperties.  # noqa: E501
        :type sling_filter_scope: ConfigNodePropertyArray
        """
        self.openapi_types = {
            'service_ranking': ConfigNodePropertyInteger,
            'sling_filter_scope': ConfigNodePropertyArray
        }

        self.attribute_map = {
            'service_ranking': 'service.ranking',
            'sling_filter_scope': 'sling.filter.scope'
        }

        self._service_ranking = service_ranking
        self._sling_filter_scope = sling_filter_scope

    @classmethod
    def from_dict(cls, dikt) -> 'OrgApacheSlingI18nImplI18NFilterProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The orgApacheSlingI18nImplI18NFilterProperties of this OrgApacheSlingI18nImplI18NFilterProperties.  # noqa: E501
        :rtype: OrgApacheSlingI18nImplI18NFilterProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def service_ranking(self) -> ConfigNodePropertyInteger:
        """Gets the service_ranking of this OrgApacheSlingI18nImplI18NFilterProperties.


        :return: The service_ranking of this OrgApacheSlingI18nImplI18NFilterProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._service_ranking

    @service_ranking.setter
    def service_ranking(self, service_ranking: ConfigNodePropertyInteger):
        """Sets the service_ranking of this OrgApacheSlingI18nImplI18NFilterProperties.


        :param service_ranking: The service_ranking of this OrgApacheSlingI18nImplI18NFilterProperties.
        :type service_ranking: ConfigNodePropertyInteger
        """

        self._service_ranking = service_ranking

    @property
    def sling_filter_scope(self) -> ConfigNodePropertyArray:
        """Gets the sling_filter_scope of this OrgApacheSlingI18nImplI18NFilterProperties.


        :return: The sling_filter_scope of this OrgApacheSlingI18nImplI18NFilterProperties.
        :rtype: ConfigNodePropertyArray
        """
        return self._sling_filter_scope

    @sling_filter_scope.setter
    def sling_filter_scope(self, sling_filter_scope: ConfigNodePropertyArray):
        """Sets the sling_filter_scope of this OrgApacheSlingI18nImplI18NFilterProperties.


        :param sling_filter_scope: The sling_filter_scope of this OrgApacheSlingI18nImplI18NFilterProperties.
        :type sling_filter_scope: ConfigNodePropertyArray
        """

        self._sling_filter_scope = sling_filter_scope