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


class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties(object):
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
        'granite_maintenance_mandatory': 'ConfigNodePropertyBoolean',
        'job_topics': 'ConfigNodePropertyString'
    }

    attribute_map = {
        'granite_maintenance_mandatory': 'granite.maintenance.mandatory',
        'job_topics': 'job.topics'
    }

    def __init__(self, granite_maintenance_mandatory=None, job_topics=None):  # noqa: E501
        """ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties - a model defined in OpenAPI"""  # noqa: E501

        self._granite_maintenance_mandatory = None
        self._job_topics = None
        self.discriminator = None

        if granite_maintenance_mandatory is not None:
            self.granite_maintenance_mandatory = granite_maintenance_mandatory
        if job_topics is not None:
            self.job_topics = job_topics

    @property
    def granite_maintenance_mandatory(self):
        """Gets the granite_maintenance_mandatory of this ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.  # noqa: E501


        :return: The granite_maintenance_mandatory of this ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._granite_maintenance_mandatory

    @granite_maintenance_mandatory.setter
    def granite_maintenance_mandatory(self, granite_maintenance_mandatory):
        """Sets the granite_maintenance_mandatory of this ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.


        :param granite_maintenance_mandatory: The granite_maintenance_mandatory of this ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._granite_maintenance_mandatory = granite_maintenance_mandatory

    @property
    def job_topics(self):
        """Gets the job_topics of this ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.  # noqa: E501


        :return: The job_topics of this ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._job_topics

    @job_topics.setter
    def job_topics(self, job_topics):
        """Sets the job_topics of this ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.


        :param job_topics: The job_topics of this ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._job_topics = job_topics

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
        if not isinstance(other, ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
