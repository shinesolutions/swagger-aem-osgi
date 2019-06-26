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


class ComAdobeCqAccountApiAccountManagementServiceInfo(object):
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
        'pid': 'str',
        'title': 'str',
        'description': 'str',
        'properties': 'ComAdobeCqAccountApiAccountManagementServiceProperties',
        'additional_properties': 'str',
        'bundle_location': 'str',
        'service_location': 'str'
    }

    attribute_map = {
        'pid': 'pid',
        'title': 'title',
        'description': 'description',
        'properties': 'properties',
        'additional_properties': 'additionalProperties',
        'bundle_location': 'bundle_location',
        'service_location': 'service_location'
    }

    def __init__(self, pid=None, title=None, description=None, properties=None, additional_properties=None, bundle_location=None, service_location=None):  # noqa: E501
        """ComAdobeCqAccountApiAccountManagementServiceInfo - a model defined in OpenAPI"""  # noqa: E501

        self._pid = None
        self._title = None
        self._description = None
        self._properties = None
        self._additional_properties = None
        self._bundle_location = None
        self._service_location = None
        self.discriminator = None

        if pid is not None:
            self.pid = pid
        if title is not None:
            self.title = title
        if description is not None:
            self.description = description
        if properties is not None:
            self.properties = properties
        if additional_properties is not None:
            self.additional_properties = additional_properties
        if bundle_location is not None:
            self.bundle_location = bundle_location
        if service_location is not None:
            self.service_location = service_location

    @property
    def pid(self):
        """Gets the pid of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501


        :return: The pid of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid):
        """Sets the pid of this ComAdobeCqAccountApiAccountManagementServiceInfo.


        :param pid: The pid of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501
        :type: str
        """

        self._pid = pid

    @property
    def title(self):
        """Gets the title of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501


        :return: The title of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title):
        """Sets the title of this ComAdobeCqAccountApiAccountManagementServiceInfo.


        :param title: The title of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501
        :type: str
        """

        self._title = title

    @property
    def description(self):
        """Gets the description of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501


        :return: The description of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this ComAdobeCqAccountApiAccountManagementServiceInfo.


        :param description: The description of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def properties(self):
        """Gets the properties of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501


        :return: The properties of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501
        :rtype: ComAdobeCqAccountApiAccountManagementServiceProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """Sets the properties of this ComAdobeCqAccountApiAccountManagementServiceInfo.


        :param properties: The properties of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501
        :type: ComAdobeCqAccountApiAccountManagementServiceProperties
        """

        self._properties = properties

    @property
    def additional_properties(self):
        """Gets the additional_properties of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501


        :return: The additional_properties of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501
        :rtype: str
        """
        return self._additional_properties

    @additional_properties.setter
    def additional_properties(self, additional_properties):
        """Sets the additional_properties of this ComAdobeCqAccountApiAccountManagementServiceInfo.


        :param additional_properties: The additional_properties of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501
        :type: str
        """

        self._additional_properties = additional_properties

    @property
    def bundle_location(self):
        """Gets the bundle_location of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501


        :return: The bundle_location of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501
        :rtype: str
        """
        return self._bundle_location

    @bundle_location.setter
    def bundle_location(self, bundle_location):
        """Sets the bundle_location of this ComAdobeCqAccountApiAccountManagementServiceInfo.


        :param bundle_location: The bundle_location of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501
        :type: str
        """

        self._bundle_location = bundle_location

    @property
    def service_location(self):
        """Gets the service_location of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501


        :return: The service_location of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501
        :rtype: str
        """
        return self._service_location

    @service_location.setter
    def service_location(self, service_location):
        """Sets the service_location of this ComAdobeCqAccountApiAccountManagementServiceInfo.


        :param service_location: The service_location of this ComAdobeCqAccountApiAccountManagementServiceInfo.  # noqa: E501
        :type: str
        """

        self._service_location = service_location

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
        if not isinstance(other, ComAdobeCqAccountApiAccountManagementServiceInfo):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
