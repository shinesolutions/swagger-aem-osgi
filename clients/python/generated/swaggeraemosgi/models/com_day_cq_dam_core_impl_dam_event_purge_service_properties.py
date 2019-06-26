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


class ComDayCqDamCoreImplDamEventPurgeServiceProperties(object):
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
        'scheduler_expression': 'ConfigNodePropertyString',
        'max_saved_activities': 'ConfigNodePropertyInteger',
        'save_interval': 'ConfigNodePropertyInteger',
        'enable_activity_purge': 'ConfigNodePropertyBoolean',
        'event_types': 'ConfigNodePropertyDropDown'
    }

    attribute_map = {
        'scheduler_expression': 'scheduler.expression',
        'max_saved_activities': 'maxSavedActivities',
        'save_interval': 'saveInterval',
        'enable_activity_purge': 'enableActivityPurge',
        'event_types': 'eventTypes'
    }

    def __init__(self, scheduler_expression=None, max_saved_activities=None, save_interval=None, enable_activity_purge=None, event_types=None):  # noqa: E501
        """ComDayCqDamCoreImplDamEventPurgeServiceProperties - a model defined in OpenAPI"""  # noqa: E501

        self._scheduler_expression = None
        self._max_saved_activities = None
        self._save_interval = None
        self._enable_activity_purge = None
        self._event_types = None
        self.discriminator = None

        if scheduler_expression is not None:
            self.scheduler_expression = scheduler_expression
        if max_saved_activities is not None:
            self.max_saved_activities = max_saved_activities
        if save_interval is not None:
            self.save_interval = save_interval
        if enable_activity_purge is not None:
            self.enable_activity_purge = enable_activity_purge
        if event_types is not None:
            self.event_types = event_types

    @property
    def scheduler_expression(self):
        """Gets the scheduler_expression of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.  # noqa: E501


        :return: The scheduler_expression of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._scheduler_expression

    @scheduler_expression.setter
    def scheduler_expression(self, scheduler_expression):
        """Sets the scheduler_expression of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.


        :param scheduler_expression: The scheduler_expression of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._scheduler_expression = scheduler_expression

    @property
    def max_saved_activities(self):
        """Gets the max_saved_activities of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.  # noqa: E501


        :return: The max_saved_activities of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._max_saved_activities

    @max_saved_activities.setter
    def max_saved_activities(self, max_saved_activities):
        """Sets the max_saved_activities of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.


        :param max_saved_activities: The max_saved_activities of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._max_saved_activities = max_saved_activities

    @property
    def save_interval(self):
        """Gets the save_interval of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.  # noqa: E501


        :return: The save_interval of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._save_interval

    @save_interval.setter
    def save_interval(self, save_interval):
        """Sets the save_interval of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.


        :param save_interval: The save_interval of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._save_interval = save_interval

    @property
    def enable_activity_purge(self):
        """Gets the enable_activity_purge of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.  # noqa: E501


        :return: The enable_activity_purge of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._enable_activity_purge

    @enable_activity_purge.setter
    def enable_activity_purge(self, enable_activity_purge):
        """Sets the enable_activity_purge of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.


        :param enable_activity_purge: The enable_activity_purge of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._enable_activity_purge = enable_activity_purge

    @property
    def event_types(self):
        """Gets the event_types of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.  # noqa: E501


        :return: The event_types of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._event_types

    @event_types.setter
    def event_types(self, event_types):
        """Sets the event_types of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.


        :param event_types: The event_types of this ComDayCqDamCoreImplDamEventPurgeServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._event_types = event_types

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
        if not isinstance(other, ComDayCqDamCoreImplDamEventPurgeServiceProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other