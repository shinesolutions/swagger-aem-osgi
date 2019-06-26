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


class ComAdobeCqScreensDeviceImplDeviceServiceProperties(object):
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
        'com_adobe_aem_screens_player_pingfrequency': 'ConfigNodePropertyInteger',
        'com_adobe_aem_screens_device_pasword_specialchars': 'ConfigNodePropertyString',
        'com_adobe_aem_screens_device_pasword_minlowercasechars': 'ConfigNodePropertyInteger',
        'com_adobe_aem_screens_device_pasword_minuppercasechars': 'ConfigNodePropertyInteger',
        'com_adobe_aem_screens_device_pasword_minnumberchars': 'ConfigNodePropertyInteger',
        'com_adobe_aem_screens_device_pasword_minspecialchars': 'ConfigNodePropertyInteger',
        'com_adobe_aem_screens_device_pasword_minlength': 'ConfigNodePropertyInteger'
    }

    attribute_map = {
        'com_adobe_aem_screens_player_pingfrequency': 'com.adobe.aem.screens.player.pingfrequency',
        'com_adobe_aem_screens_device_pasword_specialchars': 'com.adobe.aem.screens.device.pasword.specialchars',
        'com_adobe_aem_screens_device_pasword_minlowercasechars': 'com.adobe.aem.screens.device.pasword.minlowercasechars',
        'com_adobe_aem_screens_device_pasword_minuppercasechars': 'com.adobe.aem.screens.device.pasword.minuppercasechars',
        'com_adobe_aem_screens_device_pasword_minnumberchars': 'com.adobe.aem.screens.device.pasword.minnumberchars',
        'com_adobe_aem_screens_device_pasword_minspecialchars': 'com.adobe.aem.screens.device.pasword.minspecialchars',
        'com_adobe_aem_screens_device_pasword_minlength': 'com.adobe.aem.screens.device.pasword.minlength'
    }

    def __init__(self, com_adobe_aem_screens_player_pingfrequency=None, com_adobe_aem_screens_device_pasword_specialchars=None, com_adobe_aem_screens_device_pasword_minlowercasechars=None, com_adobe_aem_screens_device_pasword_minuppercasechars=None, com_adobe_aem_screens_device_pasword_minnumberchars=None, com_adobe_aem_screens_device_pasword_minspecialchars=None, com_adobe_aem_screens_device_pasword_minlength=None):  # noqa: E501
        """ComAdobeCqScreensDeviceImplDeviceServiceProperties - a model defined in OpenAPI"""  # noqa: E501

        self._com_adobe_aem_screens_player_pingfrequency = None
        self._com_adobe_aem_screens_device_pasword_specialchars = None
        self._com_adobe_aem_screens_device_pasword_minlowercasechars = None
        self._com_adobe_aem_screens_device_pasword_minuppercasechars = None
        self._com_adobe_aem_screens_device_pasword_minnumberchars = None
        self._com_adobe_aem_screens_device_pasword_minspecialchars = None
        self._com_adobe_aem_screens_device_pasword_minlength = None
        self.discriminator = None

        if com_adobe_aem_screens_player_pingfrequency is not None:
            self.com_adobe_aem_screens_player_pingfrequency = com_adobe_aem_screens_player_pingfrequency
        if com_adobe_aem_screens_device_pasword_specialchars is not None:
            self.com_adobe_aem_screens_device_pasword_specialchars = com_adobe_aem_screens_device_pasword_specialchars
        if com_adobe_aem_screens_device_pasword_minlowercasechars is not None:
            self.com_adobe_aem_screens_device_pasword_minlowercasechars = com_adobe_aem_screens_device_pasword_minlowercasechars
        if com_adobe_aem_screens_device_pasword_minuppercasechars is not None:
            self.com_adobe_aem_screens_device_pasword_minuppercasechars = com_adobe_aem_screens_device_pasword_minuppercasechars
        if com_adobe_aem_screens_device_pasword_minnumberchars is not None:
            self.com_adobe_aem_screens_device_pasword_minnumberchars = com_adobe_aem_screens_device_pasword_minnumberchars
        if com_adobe_aem_screens_device_pasword_minspecialchars is not None:
            self.com_adobe_aem_screens_device_pasword_minspecialchars = com_adobe_aem_screens_device_pasword_minspecialchars
        if com_adobe_aem_screens_device_pasword_minlength is not None:
            self.com_adobe_aem_screens_device_pasword_minlength = com_adobe_aem_screens_device_pasword_minlength

    @property
    def com_adobe_aem_screens_player_pingfrequency(self):
        """Gets the com_adobe_aem_screens_player_pingfrequency of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501


        :return: The com_adobe_aem_screens_player_pingfrequency of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._com_adobe_aem_screens_player_pingfrequency

    @com_adobe_aem_screens_player_pingfrequency.setter
    def com_adobe_aem_screens_player_pingfrequency(self, com_adobe_aem_screens_player_pingfrequency):
        """Sets the com_adobe_aem_screens_player_pingfrequency of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.


        :param com_adobe_aem_screens_player_pingfrequency: The com_adobe_aem_screens_player_pingfrequency of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._com_adobe_aem_screens_player_pingfrequency = com_adobe_aem_screens_player_pingfrequency

    @property
    def com_adobe_aem_screens_device_pasword_specialchars(self):
        """Gets the com_adobe_aem_screens_device_pasword_specialchars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501


        :return: The com_adobe_aem_screens_device_pasword_specialchars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._com_adobe_aem_screens_device_pasword_specialchars

    @com_adobe_aem_screens_device_pasword_specialchars.setter
    def com_adobe_aem_screens_device_pasword_specialchars(self, com_adobe_aem_screens_device_pasword_specialchars):
        """Sets the com_adobe_aem_screens_device_pasword_specialchars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.


        :param com_adobe_aem_screens_device_pasword_specialchars: The com_adobe_aem_screens_device_pasword_specialchars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._com_adobe_aem_screens_device_pasword_specialchars = com_adobe_aem_screens_device_pasword_specialchars

    @property
    def com_adobe_aem_screens_device_pasword_minlowercasechars(self):
        """Gets the com_adobe_aem_screens_device_pasword_minlowercasechars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501


        :return: The com_adobe_aem_screens_device_pasword_minlowercasechars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._com_adobe_aem_screens_device_pasword_minlowercasechars

    @com_adobe_aem_screens_device_pasword_minlowercasechars.setter
    def com_adobe_aem_screens_device_pasword_minlowercasechars(self, com_adobe_aem_screens_device_pasword_minlowercasechars):
        """Sets the com_adobe_aem_screens_device_pasword_minlowercasechars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.


        :param com_adobe_aem_screens_device_pasword_minlowercasechars: The com_adobe_aem_screens_device_pasword_minlowercasechars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._com_adobe_aem_screens_device_pasword_minlowercasechars = com_adobe_aem_screens_device_pasword_minlowercasechars

    @property
    def com_adobe_aem_screens_device_pasword_minuppercasechars(self):
        """Gets the com_adobe_aem_screens_device_pasword_minuppercasechars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501


        :return: The com_adobe_aem_screens_device_pasword_minuppercasechars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._com_adobe_aem_screens_device_pasword_minuppercasechars

    @com_adobe_aem_screens_device_pasword_minuppercasechars.setter
    def com_adobe_aem_screens_device_pasword_minuppercasechars(self, com_adobe_aem_screens_device_pasword_minuppercasechars):
        """Sets the com_adobe_aem_screens_device_pasword_minuppercasechars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.


        :param com_adobe_aem_screens_device_pasword_minuppercasechars: The com_adobe_aem_screens_device_pasword_minuppercasechars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._com_adobe_aem_screens_device_pasword_minuppercasechars = com_adobe_aem_screens_device_pasword_minuppercasechars

    @property
    def com_adobe_aem_screens_device_pasword_minnumberchars(self):
        """Gets the com_adobe_aem_screens_device_pasword_minnumberchars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501


        :return: The com_adobe_aem_screens_device_pasword_minnumberchars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._com_adobe_aem_screens_device_pasword_minnumberchars

    @com_adobe_aem_screens_device_pasword_minnumberchars.setter
    def com_adobe_aem_screens_device_pasword_minnumberchars(self, com_adobe_aem_screens_device_pasword_minnumberchars):
        """Sets the com_adobe_aem_screens_device_pasword_minnumberchars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.


        :param com_adobe_aem_screens_device_pasword_minnumberchars: The com_adobe_aem_screens_device_pasword_minnumberchars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._com_adobe_aem_screens_device_pasword_minnumberchars = com_adobe_aem_screens_device_pasword_minnumberchars

    @property
    def com_adobe_aem_screens_device_pasword_minspecialchars(self):
        """Gets the com_adobe_aem_screens_device_pasword_minspecialchars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501


        :return: The com_adobe_aem_screens_device_pasword_minspecialchars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._com_adobe_aem_screens_device_pasword_minspecialchars

    @com_adobe_aem_screens_device_pasword_minspecialchars.setter
    def com_adobe_aem_screens_device_pasword_minspecialchars(self, com_adobe_aem_screens_device_pasword_minspecialchars):
        """Sets the com_adobe_aem_screens_device_pasword_minspecialchars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.


        :param com_adobe_aem_screens_device_pasword_minspecialchars: The com_adobe_aem_screens_device_pasword_minspecialchars of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._com_adobe_aem_screens_device_pasword_minspecialchars = com_adobe_aem_screens_device_pasword_minspecialchars

    @property
    def com_adobe_aem_screens_device_pasword_minlength(self):
        """Gets the com_adobe_aem_screens_device_pasword_minlength of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501


        :return: The com_adobe_aem_screens_device_pasword_minlength of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._com_adobe_aem_screens_device_pasword_minlength

    @com_adobe_aem_screens_device_pasword_minlength.setter
    def com_adobe_aem_screens_device_pasword_minlength(self, com_adobe_aem_screens_device_pasword_minlength):
        """Sets the com_adobe_aem_screens_device_pasword_minlength of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.


        :param com_adobe_aem_screens_device_pasword_minlength: The com_adobe_aem_screens_device_pasword_minlength of this ComAdobeCqScreensDeviceImplDeviceServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._com_adobe_aem_screens_device_pasword_minlength = com_adobe_aem_screens_device_pasword_minlength

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
        if not isinstance(other, ComAdobeCqScreensDeviceImplDeviceServiceProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
