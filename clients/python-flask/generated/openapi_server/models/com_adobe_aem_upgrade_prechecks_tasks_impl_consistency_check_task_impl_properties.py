# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_boolean import ConfigNodePropertyBoolean  # noqa: F401,E501
from openapi_server.models.config_node_property_string import ConfigNodePropertyString  # noqa: F401,E501
from openapi_server import util


class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, root_path: ConfigNodePropertyString=None, fix_inconsistencies: ConfigNodePropertyBoolean=None):  # noqa: E501
        """ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties - a model defined in OpenAPI

        :param root_path: The root_path of this ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.  # noqa: E501
        :type root_path: ConfigNodePropertyString
        :param fix_inconsistencies: The fix_inconsistencies of this ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.  # noqa: E501
        :type fix_inconsistencies: ConfigNodePropertyBoolean
        """
        self.openapi_types = {
            'root_path': ConfigNodePropertyString,
            'fix_inconsistencies': ConfigNodePropertyBoolean
        }

        self.attribute_map = {
            'root_path': 'root.path',
            'fix_inconsistencies': 'fix.inconsistencies'
        }

        self._root_path = root_path
        self._fix_inconsistencies = fix_inconsistencies

    @classmethod
    def from_dict(cls, dikt) -> 'ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties of this ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.  # noqa: E501
        :rtype: ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def root_path(self) -> ConfigNodePropertyString:
        """Gets the root_path of this ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.


        :return: The root_path of this ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.
        :rtype: ConfigNodePropertyString
        """
        return self._root_path

    @root_path.setter
    def root_path(self, root_path: ConfigNodePropertyString):
        """Sets the root_path of this ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.


        :param root_path: The root_path of this ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.
        :type root_path: ConfigNodePropertyString
        """

        self._root_path = root_path

    @property
    def fix_inconsistencies(self) -> ConfigNodePropertyBoolean:
        """Gets the fix_inconsistencies of this ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.


        :return: The fix_inconsistencies of this ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.
        :rtype: ConfigNodePropertyBoolean
        """
        return self._fix_inconsistencies

    @fix_inconsistencies.setter
    def fix_inconsistencies(self, fix_inconsistencies: ConfigNodePropertyBoolean):
        """Sets the fix_inconsistencies of this ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.


        :param fix_inconsistencies: The fix_inconsistencies of this ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.
        :type fix_inconsistencies: ConfigNodePropertyBoolean
        """

        self._fix_inconsistencies = fix_inconsistencies