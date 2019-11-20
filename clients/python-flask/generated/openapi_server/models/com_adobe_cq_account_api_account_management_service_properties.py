# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_integer import ConfigNodePropertyInteger  # noqa: F401,E501
from openapi_server.models.config_node_property_string import ConfigNodePropertyString  # noqa: F401,E501
from openapi_server import util


class ComAdobeCqAccountApiAccountManagementServiceProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, cq_accountmanager_token_validity_period: ConfigNodePropertyInteger=None, cq_accountmanager_config_requestnewaccount_mail: ConfigNodePropertyString=None, cq_accountmanager_config_requestnewpwd_mail: ConfigNodePropertyString=None):  # noqa: E501
        """ComAdobeCqAccountApiAccountManagementServiceProperties - a model defined in OpenAPI

        :param cq_accountmanager_token_validity_period: The cq_accountmanager_token_validity_period of this ComAdobeCqAccountApiAccountManagementServiceProperties.  # noqa: E501
        :type cq_accountmanager_token_validity_period: ConfigNodePropertyInteger
        :param cq_accountmanager_config_requestnewaccount_mail: The cq_accountmanager_config_requestnewaccount_mail of this ComAdobeCqAccountApiAccountManagementServiceProperties.  # noqa: E501
        :type cq_accountmanager_config_requestnewaccount_mail: ConfigNodePropertyString
        :param cq_accountmanager_config_requestnewpwd_mail: The cq_accountmanager_config_requestnewpwd_mail of this ComAdobeCqAccountApiAccountManagementServiceProperties.  # noqa: E501
        :type cq_accountmanager_config_requestnewpwd_mail: ConfigNodePropertyString
        """
        self.openapi_types = {
            'cq_accountmanager_token_validity_period': ConfigNodePropertyInteger,
            'cq_accountmanager_config_requestnewaccount_mail': ConfigNodePropertyString,
            'cq_accountmanager_config_requestnewpwd_mail': ConfigNodePropertyString
        }

        self.attribute_map = {
            'cq_accountmanager_token_validity_period': 'cq.accountmanager.token.validity.period',
            'cq_accountmanager_config_requestnewaccount_mail': 'cq.accountmanager.config.requestnewaccount.mail',
            'cq_accountmanager_config_requestnewpwd_mail': 'cq.accountmanager.config.requestnewpwd.mail'
        }

        self._cq_accountmanager_token_validity_period = cq_accountmanager_token_validity_period
        self._cq_accountmanager_config_requestnewaccount_mail = cq_accountmanager_config_requestnewaccount_mail
        self._cq_accountmanager_config_requestnewpwd_mail = cq_accountmanager_config_requestnewpwd_mail

    @classmethod
    def from_dict(cls, dikt) -> 'ComAdobeCqAccountApiAccountManagementServiceProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeCqAccountApiAccountManagementServiceProperties of this ComAdobeCqAccountApiAccountManagementServiceProperties.  # noqa: E501
        :rtype: ComAdobeCqAccountApiAccountManagementServiceProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def cq_accountmanager_token_validity_period(self) -> ConfigNodePropertyInteger:
        """Gets the cq_accountmanager_token_validity_period of this ComAdobeCqAccountApiAccountManagementServiceProperties.


        :return: The cq_accountmanager_token_validity_period of this ComAdobeCqAccountApiAccountManagementServiceProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._cq_accountmanager_token_validity_period

    @cq_accountmanager_token_validity_period.setter
    def cq_accountmanager_token_validity_period(self, cq_accountmanager_token_validity_period: ConfigNodePropertyInteger):
        """Sets the cq_accountmanager_token_validity_period of this ComAdobeCqAccountApiAccountManagementServiceProperties.


        :param cq_accountmanager_token_validity_period: The cq_accountmanager_token_validity_period of this ComAdobeCqAccountApiAccountManagementServiceProperties.
        :type cq_accountmanager_token_validity_period: ConfigNodePropertyInteger
        """

        self._cq_accountmanager_token_validity_period = cq_accountmanager_token_validity_period

    @property
    def cq_accountmanager_config_requestnewaccount_mail(self) -> ConfigNodePropertyString:
        """Gets the cq_accountmanager_config_requestnewaccount_mail of this ComAdobeCqAccountApiAccountManagementServiceProperties.


        :return: The cq_accountmanager_config_requestnewaccount_mail of this ComAdobeCqAccountApiAccountManagementServiceProperties.
        :rtype: ConfigNodePropertyString
        """
        return self._cq_accountmanager_config_requestnewaccount_mail

    @cq_accountmanager_config_requestnewaccount_mail.setter
    def cq_accountmanager_config_requestnewaccount_mail(self, cq_accountmanager_config_requestnewaccount_mail: ConfigNodePropertyString):
        """Sets the cq_accountmanager_config_requestnewaccount_mail of this ComAdobeCqAccountApiAccountManagementServiceProperties.


        :param cq_accountmanager_config_requestnewaccount_mail: The cq_accountmanager_config_requestnewaccount_mail of this ComAdobeCqAccountApiAccountManagementServiceProperties.
        :type cq_accountmanager_config_requestnewaccount_mail: ConfigNodePropertyString
        """

        self._cq_accountmanager_config_requestnewaccount_mail = cq_accountmanager_config_requestnewaccount_mail

    @property
    def cq_accountmanager_config_requestnewpwd_mail(self) -> ConfigNodePropertyString:
        """Gets the cq_accountmanager_config_requestnewpwd_mail of this ComAdobeCqAccountApiAccountManagementServiceProperties.


        :return: The cq_accountmanager_config_requestnewpwd_mail of this ComAdobeCqAccountApiAccountManagementServiceProperties.
        :rtype: ConfigNodePropertyString
        """
        return self._cq_accountmanager_config_requestnewpwd_mail

    @cq_accountmanager_config_requestnewpwd_mail.setter
    def cq_accountmanager_config_requestnewpwd_mail(self, cq_accountmanager_config_requestnewpwd_mail: ConfigNodePropertyString):
        """Sets the cq_accountmanager_config_requestnewpwd_mail of this ComAdobeCqAccountApiAccountManagementServiceProperties.


        :param cq_accountmanager_config_requestnewpwd_mail: The cq_accountmanager_config_requestnewpwd_mail of this ComAdobeCqAccountApiAccountManagementServiceProperties.
        :type cq_accountmanager_config_requestnewpwd_mail: ConfigNodePropertyString
        """

        self._cq_accountmanager_config_requestnewpwd_mail = cq_accountmanager_config_requestnewpwd_mail