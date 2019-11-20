# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties import ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties  # noqa: F401,E501
from openapi_server import util


class ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties=None):  # noqa: E501
        """ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo - a model defined in OpenAPI

        :param pid: The pid of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.  # noqa: E501
        :type properties: ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties
        }

        self.attribute_map = {
            'pid': 'pid',
            'title': 'title',
            'description': 'description',
            'properties': 'properties'
        }

        self._pid = pid
        self._title = title
        self._description = description
        self._properties = properties

    @classmethod
    def from_dict(cls, dikt) -> 'ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeGraniteI18nImplBundlePseudoTranslationsInfo of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.  # noqa: E501
        :rtype: ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.


        :return: The pid of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.


        :param pid: The pid of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.


        :return: The title of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.


        :param title: The title of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.


        :return: The description of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.


        :param description: The description of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties:
        """Gets the properties of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.


        :return: The properties of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.
        :rtype: ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties):
        """Sets the properties of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.


        :param properties: The properties of this ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo.
        :type properties: ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties
        """

        self._properties = properties