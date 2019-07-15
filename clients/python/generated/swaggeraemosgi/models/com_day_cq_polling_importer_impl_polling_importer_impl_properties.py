# coding: utf-8

"""
    Adobe Experience Manager OSGI config (AEM) API

    Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API  # noqa: E501

    The version of the OpenAPI document: 1.0.0-pre.0
    Contact: opensource@shinesolutions.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six


class ComDayCqPollingImporterImplPollingImporterImplProperties(object):
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
        'importer_min_interval': 'ConfigNodePropertyInteger',
        'importer_user': 'ConfigNodePropertyString',
        'exclude_paths': 'ConfigNodePropertyArray',
        'include_paths': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'importer_min_interval': 'importer.min.interval',
        'importer_user': 'importer.user',
        'exclude_paths': 'exclude.paths',
        'include_paths': 'include.paths'
    }

    def __init__(self, importer_min_interval=None, importer_user=None, exclude_paths=None, include_paths=None):  # noqa: E501
        """ComDayCqPollingImporterImplPollingImporterImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._importer_min_interval = None
        self._importer_user = None
        self._exclude_paths = None
        self._include_paths = None
        self.discriminator = None

        if importer_min_interval is not None:
            self.importer_min_interval = importer_min_interval
        if importer_user is not None:
            self.importer_user = importer_user
        if exclude_paths is not None:
            self.exclude_paths = exclude_paths
        if include_paths is not None:
            self.include_paths = include_paths

    @property
    def importer_min_interval(self):
        """Gets the importer_min_interval of this ComDayCqPollingImporterImplPollingImporterImplProperties.  # noqa: E501


        :return: The importer_min_interval of this ComDayCqPollingImporterImplPollingImporterImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._importer_min_interval

    @importer_min_interval.setter
    def importer_min_interval(self, importer_min_interval):
        """Sets the importer_min_interval of this ComDayCqPollingImporterImplPollingImporterImplProperties.


        :param importer_min_interval: The importer_min_interval of this ComDayCqPollingImporterImplPollingImporterImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._importer_min_interval = importer_min_interval

    @property
    def importer_user(self):
        """Gets the importer_user of this ComDayCqPollingImporterImplPollingImporterImplProperties.  # noqa: E501


        :return: The importer_user of this ComDayCqPollingImporterImplPollingImporterImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._importer_user

    @importer_user.setter
    def importer_user(self, importer_user):
        """Sets the importer_user of this ComDayCqPollingImporterImplPollingImporterImplProperties.


        :param importer_user: The importer_user of this ComDayCqPollingImporterImplPollingImporterImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._importer_user = importer_user

    @property
    def exclude_paths(self):
        """Gets the exclude_paths of this ComDayCqPollingImporterImplPollingImporterImplProperties.  # noqa: E501


        :return: The exclude_paths of this ComDayCqPollingImporterImplPollingImporterImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._exclude_paths

    @exclude_paths.setter
    def exclude_paths(self, exclude_paths):
        """Sets the exclude_paths of this ComDayCqPollingImporterImplPollingImporterImplProperties.


        :param exclude_paths: The exclude_paths of this ComDayCqPollingImporterImplPollingImporterImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._exclude_paths = exclude_paths

    @property
    def include_paths(self):
        """Gets the include_paths of this ComDayCqPollingImporterImplPollingImporterImplProperties.  # noqa: E501


        :return: The include_paths of this ComDayCqPollingImporterImplPollingImporterImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._include_paths

    @include_paths.setter
    def include_paths(self, include_paths):
        """Sets the include_paths of this ComDayCqPollingImporterImplPollingImporterImplProperties.


        :param include_paths: The include_paths of this ComDayCqPollingImporterImplPollingImporterImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._include_paths = include_paths

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
        if not isinstance(other, ComDayCqPollingImporterImplPollingImporterImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
