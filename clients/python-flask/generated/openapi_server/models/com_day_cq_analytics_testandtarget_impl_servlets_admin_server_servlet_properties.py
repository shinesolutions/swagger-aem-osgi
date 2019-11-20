# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_string import ConfigNodePropertyString  # noqa: F401,E501
from openapi_server import util


class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, testandtarget_endpoint_url: ConfigNodePropertyString=None):  # noqa: E501
        """ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties - a model defined in OpenAPI

        :param testandtarget_endpoint_url: The testandtarget_endpoint_url of this ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.  # noqa: E501
        :type testandtarget_endpoint_url: ConfigNodePropertyString
        """
        self.openapi_types = {
            'testandtarget_endpoint_url': ConfigNodePropertyString
        }

        self.attribute_map = {
            'testandtarget_endpoint_url': 'testandtarget.endpoint.url'
        }

        self._testandtarget_endpoint_url = testandtarget_endpoint_url

    @classmethod
    def from_dict(cls, dikt) -> 'ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties of this ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.  # noqa: E501
        :rtype: ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def testandtarget_endpoint_url(self) -> ConfigNodePropertyString:
        """Gets the testandtarget_endpoint_url of this ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.


        :return: The testandtarget_endpoint_url of this ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.
        :rtype: ConfigNodePropertyString
        """
        return self._testandtarget_endpoint_url

    @testandtarget_endpoint_url.setter
    def testandtarget_endpoint_url(self, testandtarget_endpoint_url: ConfigNodePropertyString):
        """Sets the testandtarget_endpoint_url of this ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.


        :param testandtarget_endpoint_url: The testandtarget_endpoint_url of this ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.
        :type testandtarget_endpoint_url: ConfigNodePropertyString
        """

        self._testandtarget_endpoint_url = testandtarget_endpoint_url