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


class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties(object):
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
        'com_day_cq_dam_core_impl_io_special_files_handler_filepatters': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'com_day_cq_dam_core_impl_io_special_files_handler_filepatters': 'com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters'
    }

    def __init__(self, com_day_cq_dam_core_impl_io_special_files_handler_filepatters=None):  # noqa: E501
        """ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties - a model defined in OpenAPI"""  # noqa: E501

        self._com_day_cq_dam_core_impl_io_special_files_handler_filepatters = None
        self.discriminator = None

        if com_day_cq_dam_core_impl_io_special_files_handler_filepatters is not None:
            self.com_day_cq_dam_core_impl_io_special_files_handler_filepatters = com_day_cq_dam_core_impl_io_special_files_handler_filepatters

    @property
    def com_day_cq_dam_core_impl_io_special_files_handler_filepatters(self):
        """Gets the com_day_cq_dam_core_impl_io_special_files_handler_filepatters of this ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.  # noqa: E501


        :return: The com_day_cq_dam_core_impl_io_special_files_handler_filepatters of this ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._com_day_cq_dam_core_impl_io_special_files_handler_filepatters

    @com_day_cq_dam_core_impl_io_special_files_handler_filepatters.setter
    def com_day_cq_dam_core_impl_io_special_files_handler_filepatters(self, com_day_cq_dam_core_impl_io_special_files_handler_filepatters):
        """Sets the com_day_cq_dam_core_impl_io_special_files_handler_filepatters of this ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.


        :param com_day_cq_dam_core_impl_io_special_files_handler_filepatters: The com_day_cq_dam_core_impl_io_special_files_handler_filepatters of this ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._com_day_cq_dam_core_impl_io_special_files_handler_filepatters = com_day_cq_dam_core_impl_io_special_files_handler_filepatters

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
        if not isinstance(other, ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
