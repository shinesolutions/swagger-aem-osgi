# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_drop_down import ConfigNodePropertyDropDown  # noqa: F401,E501
from openapi_server.models.config_node_property_string import ConfigNodePropertyString  # noqa: F401,E501
from openapi_server import util


class OrgApacheFelixJaasConfigurationSpiProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, jaas_default_realm_name: ConfigNodePropertyString=None, jaas_config_provider_name: ConfigNodePropertyString=None, jaas_global_config_policy: ConfigNodePropertyDropDown=None):  # noqa: E501
        """OrgApacheFelixJaasConfigurationSpiProperties - a model defined in OpenAPI

        :param jaas_default_realm_name: The jaas_default_realm_name of this OrgApacheFelixJaasConfigurationSpiProperties.  # noqa: E501
        :type jaas_default_realm_name: ConfigNodePropertyString
        :param jaas_config_provider_name: The jaas_config_provider_name of this OrgApacheFelixJaasConfigurationSpiProperties.  # noqa: E501
        :type jaas_config_provider_name: ConfigNodePropertyString
        :param jaas_global_config_policy: The jaas_global_config_policy of this OrgApacheFelixJaasConfigurationSpiProperties.  # noqa: E501
        :type jaas_global_config_policy: ConfigNodePropertyDropDown
        """
        self.openapi_types = {
            'jaas_default_realm_name': ConfigNodePropertyString,
            'jaas_config_provider_name': ConfigNodePropertyString,
            'jaas_global_config_policy': ConfigNodePropertyDropDown
        }

        self.attribute_map = {
            'jaas_default_realm_name': 'jaas.defaultRealmName',
            'jaas_config_provider_name': 'jaas.configProviderName',
            'jaas_global_config_policy': 'jaas.globalConfigPolicy'
        }

        self._jaas_default_realm_name = jaas_default_realm_name
        self._jaas_config_provider_name = jaas_config_provider_name
        self._jaas_global_config_policy = jaas_global_config_policy

    @classmethod
    def from_dict(cls, dikt) -> 'OrgApacheFelixJaasConfigurationSpiProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The orgApacheFelixJaasConfigurationSpiProperties of this OrgApacheFelixJaasConfigurationSpiProperties.  # noqa: E501
        :rtype: OrgApacheFelixJaasConfigurationSpiProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def jaas_default_realm_name(self) -> ConfigNodePropertyString:
        """Gets the jaas_default_realm_name of this OrgApacheFelixJaasConfigurationSpiProperties.


        :return: The jaas_default_realm_name of this OrgApacheFelixJaasConfigurationSpiProperties.
        :rtype: ConfigNodePropertyString
        """
        return self._jaas_default_realm_name

    @jaas_default_realm_name.setter
    def jaas_default_realm_name(self, jaas_default_realm_name: ConfigNodePropertyString):
        """Sets the jaas_default_realm_name of this OrgApacheFelixJaasConfigurationSpiProperties.


        :param jaas_default_realm_name: The jaas_default_realm_name of this OrgApacheFelixJaasConfigurationSpiProperties.
        :type jaas_default_realm_name: ConfigNodePropertyString
        """

        self._jaas_default_realm_name = jaas_default_realm_name

    @property
    def jaas_config_provider_name(self) -> ConfigNodePropertyString:
        """Gets the jaas_config_provider_name of this OrgApacheFelixJaasConfigurationSpiProperties.


        :return: The jaas_config_provider_name of this OrgApacheFelixJaasConfigurationSpiProperties.
        :rtype: ConfigNodePropertyString
        """
        return self._jaas_config_provider_name

    @jaas_config_provider_name.setter
    def jaas_config_provider_name(self, jaas_config_provider_name: ConfigNodePropertyString):
        """Sets the jaas_config_provider_name of this OrgApacheFelixJaasConfigurationSpiProperties.


        :param jaas_config_provider_name: The jaas_config_provider_name of this OrgApacheFelixJaasConfigurationSpiProperties.
        :type jaas_config_provider_name: ConfigNodePropertyString
        """

        self._jaas_config_provider_name = jaas_config_provider_name

    @property
    def jaas_global_config_policy(self) -> ConfigNodePropertyDropDown:
        """Gets the jaas_global_config_policy of this OrgApacheFelixJaasConfigurationSpiProperties.


        :return: The jaas_global_config_policy of this OrgApacheFelixJaasConfigurationSpiProperties.
        :rtype: ConfigNodePropertyDropDown
        """
        return self._jaas_global_config_policy

    @jaas_global_config_policy.setter
    def jaas_global_config_policy(self, jaas_global_config_policy: ConfigNodePropertyDropDown):
        """Sets the jaas_global_config_policy of this OrgApacheFelixJaasConfigurationSpiProperties.


        :param jaas_global_config_policy: The jaas_global_config_policy of this OrgApacheFelixJaasConfigurationSpiProperties.
        :type jaas_global_config_policy: ConfigNodePropertyDropDown
        """

        self._jaas_global_config_policy = jaas_global_config_policy