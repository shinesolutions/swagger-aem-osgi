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


class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties(object):
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
        'event_filter': 'ConfigNodePropertyString',
        'launches_eventhandler_threadpool_maxsize': 'ConfigNodePropertyInteger',
        'launches_eventhandler_threadpool_priority': 'ConfigNodePropertyDropDown',
        'launches_eventhandler_updatelastmodification': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'event_filter': 'event.filter',
        'launches_eventhandler_threadpool_maxsize': 'launches.eventhandler.threadpool.maxsize',
        'launches_eventhandler_threadpool_priority': 'launches.eventhandler.threadpool.priority',
        'launches_eventhandler_updatelastmodification': 'launches.eventhandler.updatelastmodification'
    }

    def __init__(self, event_filter=None, launches_eventhandler_threadpool_maxsize=None, launches_eventhandler_threadpool_priority=None, launches_eventhandler_updatelastmodification=None):  # noqa: E501
        """ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties - a model defined in OpenAPI"""  # noqa: E501

        self._event_filter = None
        self._launches_eventhandler_threadpool_maxsize = None
        self._launches_eventhandler_threadpool_priority = None
        self._launches_eventhandler_updatelastmodification = None
        self.discriminator = None

        if event_filter is not None:
            self.event_filter = event_filter
        if launches_eventhandler_threadpool_maxsize is not None:
            self.launches_eventhandler_threadpool_maxsize = launches_eventhandler_threadpool_maxsize
        if launches_eventhandler_threadpool_priority is not None:
            self.launches_eventhandler_threadpool_priority = launches_eventhandler_threadpool_priority
        if launches_eventhandler_updatelastmodification is not None:
            self.launches_eventhandler_updatelastmodification = launches_eventhandler_updatelastmodification

    @property
    def event_filter(self):
        """Gets the event_filter of this ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.  # noqa: E501


        :return: The event_filter of this ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._event_filter

    @event_filter.setter
    def event_filter(self, event_filter):
        """Sets the event_filter of this ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.


        :param event_filter: The event_filter of this ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._event_filter = event_filter

    @property
    def launches_eventhandler_threadpool_maxsize(self):
        """Gets the launches_eventhandler_threadpool_maxsize of this ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.  # noqa: E501


        :return: The launches_eventhandler_threadpool_maxsize of this ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._launches_eventhandler_threadpool_maxsize

    @launches_eventhandler_threadpool_maxsize.setter
    def launches_eventhandler_threadpool_maxsize(self, launches_eventhandler_threadpool_maxsize):
        """Sets the launches_eventhandler_threadpool_maxsize of this ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.


        :param launches_eventhandler_threadpool_maxsize: The launches_eventhandler_threadpool_maxsize of this ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._launches_eventhandler_threadpool_maxsize = launches_eventhandler_threadpool_maxsize

    @property
    def launches_eventhandler_threadpool_priority(self):
        """Gets the launches_eventhandler_threadpool_priority of this ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.  # noqa: E501


        :return: The launches_eventhandler_threadpool_priority of this ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._launches_eventhandler_threadpool_priority

    @launches_eventhandler_threadpool_priority.setter
    def launches_eventhandler_threadpool_priority(self, launches_eventhandler_threadpool_priority):
        """Sets the launches_eventhandler_threadpool_priority of this ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.


        :param launches_eventhandler_threadpool_priority: The launches_eventhandler_threadpool_priority of this ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._launches_eventhandler_threadpool_priority = launches_eventhandler_threadpool_priority

    @property
    def launches_eventhandler_updatelastmodification(self):
        """Gets the launches_eventhandler_updatelastmodification of this ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.  # noqa: E501


        :return: The launches_eventhandler_updatelastmodification of this ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._launches_eventhandler_updatelastmodification

    @launches_eventhandler_updatelastmodification.setter
    def launches_eventhandler_updatelastmodification(self, launches_eventhandler_updatelastmodification):
        """Sets the launches_eventhandler_updatelastmodification of this ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.


        :param launches_eventhandler_updatelastmodification: The launches_eventhandler_updatelastmodification of this ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._launches_eventhandler_updatelastmodification = launches_eventhandler_updatelastmodification

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
        if not isinstance(other, ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
