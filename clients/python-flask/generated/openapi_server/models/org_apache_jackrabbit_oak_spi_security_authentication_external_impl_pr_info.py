# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_properties import OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties  # noqa: F401,E501
from openapi_server import util


class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties=None):  # noqa: E501
        """OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo - a model defined in OpenAPI

        :param pid: The pid of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.  # noqa: E501
        :type title: str
        :param description: The description of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.  # noqa: E501
        :type properties: OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties
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
    def from_dict(cls, dikt) -> 'OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.  # noqa: E501
        :rtype: OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.


        :return: The pid of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.


        :param pid: The pid of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.


        :return: The title of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.


        :param title: The title of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.


        :return: The description of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.


        :param description: The description of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties:
        """Gets the properties of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.


        :return: The properties of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.
        :rtype: OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties):
        """Sets the properties of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.


        :param properties: The properties of this OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo.
        :type properties: OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties
        """

        self._properties = properties