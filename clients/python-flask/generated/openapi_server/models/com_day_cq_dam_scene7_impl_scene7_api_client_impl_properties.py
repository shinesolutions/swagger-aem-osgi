# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_integer import ConfigNodePropertyInteger  # noqa: F401,E501
from openapi_server import util


class ComDayCqDamScene7ImplScene7APIClientImplProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, cq_dam_scene7_apiclient_recordsperpage_nofilter_name: ConfigNodePropertyInteger=None, cq_dam_scene7_apiclient_recordsperpage_withfilter_name: ConfigNodePropertyInteger=None):  # noqa: E501
        """ComDayCqDamScene7ImplScene7APIClientImplProperties - a model defined in OpenAPI

        :param cq_dam_scene7_apiclient_recordsperpage_nofilter_name: The cq_dam_scene7_apiclient_recordsperpage_nofilter_name of this ComDayCqDamScene7ImplScene7APIClientImplProperties.  # noqa: E501
        :type cq_dam_scene7_apiclient_recordsperpage_nofilter_name: ConfigNodePropertyInteger
        :param cq_dam_scene7_apiclient_recordsperpage_withfilter_name: The cq_dam_scene7_apiclient_recordsperpage_withfilter_name of this ComDayCqDamScene7ImplScene7APIClientImplProperties.  # noqa: E501
        :type cq_dam_scene7_apiclient_recordsperpage_withfilter_name: ConfigNodePropertyInteger
        """
        self.openapi_types = {
            'cq_dam_scene7_apiclient_recordsperpage_nofilter_name': ConfigNodePropertyInteger,
            'cq_dam_scene7_apiclient_recordsperpage_withfilter_name': ConfigNodePropertyInteger
        }

        self.attribute_map = {
            'cq_dam_scene7_apiclient_recordsperpage_nofilter_name': 'cq.dam.scene7.apiclient.recordsperpage.nofilter.name',
            'cq_dam_scene7_apiclient_recordsperpage_withfilter_name': 'cq.dam.scene7.apiclient.recordsperpage.withfilter.name'
        }

        self._cq_dam_scene7_apiclient_recordsperpage_nofilter_name = cq_dam_scene7_apiclient_recordsperpage_nofilter_name
        self._cq_dam_scene7_apiclient_recordsperpage_withfilter_name = cq_dam_scene7_apiclient_recordsperpage_withfilter_name

    @classmethod
    def from_dict(cls, dikt) -> 'ComDayCqDamScene7ImplScene7APIClientImplProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comDayCqDamScene7ImplScene7APIClientImplProperties of this ComDayCqDamScene7ImplScene7APIClientImplProperties.  # noqa: E501
        :rtype: ComDayCqDamScene7ImplScene7APIClientImplProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def cq_dam_scene7_apiclient_recordsperpage_nofilter_name(self) -> ConfigNodePropertyInteger:
        """Gets the cq_dam_scene7_apiclient_recordsperpage_nofilter_name of this ComDayCqDamScene7ImplScene7APIClientImplProperties.


        :return: The cq_dam_scene7_apiclient_recordsperpage_nofilter_name of this ComDayCqDamScene7ImplScene7APIClientImplProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._cq_dam_scene7_apiclient_recordsperpage_nofilter_name

    @cq_dam_scene7_apiclient_recordsperpage_nofilter_name.setter
    def cq_dam_scene7_apiclient_recordsperpage_nofilter_name(self, cq_dam_scene7_apiclient_recordsperpage_nofilter_name: ConfigNodePropertyInteger):
        """Sets the cq_dam_scene7_apiclient_recordsperpage_nofilter_name of this ComDayCqDamScene7ImplScene7APIClientImplProperties.


        :param cq_dam_scene7_apiclient_recordsperpage_nofilter_name: The cq_dam_scene7_apiclient_recordsperpage_nofilter_name of this ComDayCqDamScene7ImplScene7APIClientImplProperties.
        :type cq_dam_scene7_apiclient_recordsperpage_nofilter_name: ConfigNodePropertyInteger
        """

        self._cq_dam_scene7_apiclient_recordsperpage_nofilter_name = cq_dam_scene7_apiclient_recordsperpage_nofilter_name

    @property
    def cq_dam_scene7_apiclient_recordsperpage_withfilter_name(self) -> ConfigNodePropertyInteger:
        """Gets the cq_dam_scene7_apiclient_recordsperpage_withfilter_name of this ComDayCqDamScene7ImplScene7APIClientImplProperties.


        :return: The cq_dam_scene7_apiclient_recordsperpage_withfilter_name of this ComDayCqDamScene7ImplScene7APIClientImplProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._cq_dam_scene7_apiclient_recordsperpage_withfilter_name

    @cq_dam_scene7_apiclient_recordsperpage_withfilter_name.setter
    def cq_dam_scene7_apiclient_recordsperpage_withfilter_name(self, cq_dam_scene7_apiclient_recordsperpage_withfilter_name: ConfigNodePropertyInteger):
        """Sets the cq_dam_scene7_apiclient_recordsperpage_withfilter_name of this ComDayCqDamScene7ImplScene7APIClientImplProperties.


        :param cq_dam_scene7_apiclient_recordsperpage_withfilter_name: The cq_dam_scene7_apiclient_recordsperpage_withfilter_name of this ComDayCqDamScene7ImplScene7APIClientImplProperties.
        :type cq_dam_scene7_apiclient_recordsperpage_withfilter_name: ConfigNodePropertyInteger
        """

        self._cq_dam_scene7_apiclient_recordsperpage_withfilter_name = cq_dam_scene7_apiclient_recordsperpage_withfilter_name