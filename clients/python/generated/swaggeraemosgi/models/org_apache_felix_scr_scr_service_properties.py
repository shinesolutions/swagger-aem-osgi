# coding: utf-8

"""
    Adobe Experience Manager OSGI config (AEM) API

    Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: opensource@shinesolutions.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six


class OrgApacheFelixScrScrServiceProperties(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'ds_loglevel': 'ConfigNodePropertyDropDown',
        'ds_factory_enabled': 'ConfigNodePropertyBoolean',
        'ds_delayed_keep_instances': 'ConfigNodePropertyBoolean',
        'ds_lock_timeout_milliseconds': 'ConfigNodePropertyInteger',
        'ds_stop_timeout_milliseconds': 'ConfigNodePropertyInteger',
        'ds_global_extender': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'ds_loglevel': 'ds.loglevel',
        'ds_factory_enabled': 'ds.factory.enabled',
        'ds_delayed_keep_instances': 'ds.delayed.keepInstances',
        'ds_lock_timeout_milliseconds': 'ds.lock.timeout.milliseconds',
        'ds_stop_timeout_milliseconds': 'ds.stop.timeout.milliseconds',
        'ds_global_extender': 'ds.global.extender'
    }

    def __init__(self, ds_loglevel=None, ds_factory_enabled=None, ds_delayed_keep_instances=None, ds_lock_timeout_milliseconds=None, ds_stop_timeout_milliseconds=None, ds_global_extender=None):  # noqa: E501
        """OrgApacheFelixScrScrServiceProperties - a model defined in OpenAPI"""  # noqa: E501

        self._ds_loglevel = None
        self._ds_factory_enabled = None
        self._ds_delayed_keep_instances = None
        self._ds_lock_timeout_milliseconds = None
        self._ds_stop_timeout_milliseconds = None
        self._ds_global_extender = None
        self.discriminator = None

        if ds_loglevel is not None:
            self.ds_loglevel = ds_loglevel
        if ds_factory_enabled is not None:
            self.ds_factory_enabled = ds_factory_enabled
        if ds_delayed_keep_instances is not None:
            self.ds_delayed_keep_instances = ds_delayed_keep_instances
        if ds_lock_timeout_milliseconds is not None:
            self.ds_lock_timeout_milliseconds = ds_lock_timeout_milliseconds
        if ds_stop_timeout_milliseconds is not None:
            self.ds_stop_timeout_milliseconds = ds_stop_timeout_milliseconds
        if ds_global_extender is not None:
            self.ds_global_extender = ds_global_extender

    @property
    def ds_loglevel(self):
        """Gets the ds_loglevel of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501


        :return: The ds_loglevel of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._ds_loglevel

    @ds_loglevel.setter
    def ds_loglevel(self, ds_loglevel):
        """Sets the ds_loglevel of this OrgApacheFelixScrScrServiceProperties.


        :param ds_loglevel: The ds_loglevel of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._ds_loglevel = ds_loglevel

    @property
    def ds_factory_enabled(self):
        """Gets the ds_factory_enabled of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501


        :return: The ds_factory_enabled of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._ds_factory_enabled

    @ds_factory_enabled.setter
    def ds_factory_enabled(self, ds_factory_enabled):
        """Sets the ds_factory_enabled of this OrgApacheFelixScrScrServiceProperties.


        :param ds_factory_enabled: The ds_factory_enabled of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._ds_factory_enabled = ds_factory_enabled

    @property
    def ds_delayed_keep_instances(self):
        """Gets the ds_delayed_keep_instances of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501


        :return: The ds_delayed_keep_instances of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._ds_delayed_keep_instances

    @ds_delayed_keep_instances.setter
    def ds_delayed_keep_instances(self, ds_delayed_keep_instances):
        """Sets the ds_delayed_keep_instances of this OrgApacheFelixScrScrServiceProperties.


        :param ds_delayed_keep_instances: The ds_delayed_keep_instances of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._ds_delayed_keep_instances = ds_delayed_keep_instances

    @property
    def ds_lock_timeout_milliseconds(self):
        """Gets the ds_lock_timeout_milliseconds of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501


        :return: The ds_lock_timeout_milliseconds of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._ds_lock_timeout_milliseconds

    @ds_lock_timeout_milliseconds.setter
    def ds_lock_timeout_milliseconds(self, ds_lock_timeout_milliseconds):
        """Sets the ds_lock_timeout_milliseconds of this OrgApacheFelixScrScrServiceProperties.


        :param ds_lock_timeout_milliseconds: The ds_lock_timeout_milliseconds of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._ds_lock_timeout_milliseconds = ds_lock_timeout_milliseconds

    @property
    def ds_stop_timeout_milliseconds(self):
        """Gets the ds_stop_timeout_milliseconds of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501


        :return: The ds_stop_timeout_milliseconds of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._ds_stop_timeout_milliseconds

    @ds_stop_timeout_milliseconds.setter
    def ds_stop_timeout_milliseconds(self, ds_stop_timeout_milliseconds):
        """Sets the ds_stop_timeout_milliseconds of this OrgApacheFelixScrScrServiceProperties.


        :param ds_stop_timeout_milliseconds: The ds_stop_timeout_milliseconds of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._ds_stop_timeout_milliseconds = ds_stop_timeout_milliseconds

    @property
    def ds_global_extender(self):
        """Gets the ds_global_extender of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501


        :return: The ds_global_extender of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._ds_global_extender

    @ds_global_extender.setter
    def ds_global_extender(self, ds_global_extender):
        """Sets the ds_global_extender of this OrgApacheFelixScrScrServiceProperties.


        :param ds_global_extender: The ds_global_extender of this OrgApacheFelixScrScrServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._ds_global_extender = ds_global_extender

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, OrgApacheFelixScrScrServiceProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
