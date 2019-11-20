# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_boolean import ConfigNodePropertyBoolean  # noqa: F401,E501
from openapi_server import util


class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, log_stacktrace_onclose: ConfigNodePropertyBoolean=None):  # noqa: E501
        """OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties - a model defined in OpenAPI

        :param log_stacktrace_onclose: The log_stacktrace_onclose of this OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.  # noqa: E501
        :type log_stacktrace_onclose: ConfigNodePropertyBoolean
        """
        self.openapi_types = {
            'log_stacktrace_onclose': ConfigNodePropertyBoolean
        }

        self.attribute_map = {
            'log_stacktrace_onclose': 'log.stacktrace.onclose'
        }

        self._log_stacktrace_onclose = log_stacktrace_onclose

    @classmethod
    def from_dict(cls, dikt) -> 'OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties of this OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.  # noqa: E501
        :rtype: OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def log_stacktrace_onclose(self) -> ConfigNodePropertyBoolean:
        """Gets the log_stacktrace_onclose of this OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.


        :return: The log_stacktrace_onclose of this OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.
        :rtype: ConfigNodePropertyBoolean
        """
        return self._log_stacktrace_onclose

    @log_stacktrace_onclose.setter
    def log_stacktrace_onclose(self, log_stacktrace_onclose: ConfigNodePropertyBoolean):
        """Sets the log_stacktrace_onclose of this OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.


        :param log_stacktrace_onclose: The log_stacktrace_onclose of this OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.
        :type log_stacktrace_onclose: ConfigNodePropertyBoolean
        """

        self._log_stacktrace_onclose = log_stacktrace_onclose