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


class ComDayCqWcmUndoUndoConfigProperties(object):
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
        'cq_wcm_undo_enabled': 'ConfigNodePropertyBoolean',
        'cq_wcm_undo_path': 'ConfigNodePropertyString',
        'cq_wcm_undo_validity': 'ConfigNodePropertyInteger',
        'cq_wcm_undo_steps': 'ConfigNodePropertyInteger',
        'cq_wcm_undo_persistence': 'ConfigNodePropertyString',
        'cq_wcm_undo_persistence_mode': 'ConfigNodePropertyBoolean',
        'cq_wcm_undo_markermode': 'ConfigNodePropertyString',
        'cq_wcm_undo_whitelist': 'ConfigNodePropertyArray',
        'cq_wcm_undo_blacklist': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'cq_wcm_undo_enabled': 'cq.wcm.undo.enabled',
        'cq_wcm_undo_path': 'cq.wcm.undo.path',
        'cq_wcm_undo_validity': 'cq.wcm.undo.validity',
        'cq_wcm_undo_steps': 'cq.wcm.undo.steps',
        'cq_wcm_undo_persistence': 'cq.wcm.undo.persistence',
        'cq_wcm_undo_persistence_mode': 'cq.wcm.undo.persistence.mode',
        'cq_wcm_undo_markermode': 'cq.wcm.undo.markermode',
        'cq_wcm_undo_whitelist': 'cq.wcm.undo.whitelist',
        'cq_wcm_undo_blacklist': 'cq.wcm.undo.blacklist'
    }

    def __init__(self, cq_wcm_undo_enabled=None, cq_wcm_undo_path=None, cq_wcm_undo_validity=None, cq_wcm_undo_steps=None, cq_wcm_undo_persistence=None, cq_wcm_undo_persistence_mode=None, cq_wcm_undo_markermode=None, cq_wcm_undo_whitelist=None, cq_wcm_undo_blacklist=None):  # noqa: E501
        """ComDayCqWcmUndoUndoConfigProperties - a model defined in OpenAPI"""  # noqa: E501

        self._cq_wcm_undo_enabled = None
        self._cq_wcm_undo_path = None
        self._cq_wcm_undo_validity = None
        self._cq_wcm_undo_steps = None
        self._cq_wcm_undo_persistence = None
        self._cq_wcm_undo_persistence_mode = None
        self._cq_wcm_undo_markermode = None
        self._cq_wcm_undo_whitelist = None
        self._cq_wcm_undo_blacklist = None
        self.discriminator = None

        if cq_wcm_undo_enabled is not None:
            self.cq_wcm_undo_enabled = cq_wcm_undo_enabled
        if cq_wcm_undo_path is not None:
            self.cq_wcm_undo_path = cq_wcm_undo_path
        if cq_wcm_undo_validity is not None:
            self.cq_wcm_undo_validity = cq_wcm_undo_validity
        if cq_wcm_undo_steps is not None:
            self.cq_wcm_undo_steps = cq_wcm_undo_steps
        if cq_wcm_undo_persistence is not None:
            self.cq_wcm_undo_persistence = cq_wcm_undo_persistence
        if cq_wcm_undo_persistence_mode is not None:
            self.cq_wcm_undo_persistence_mode = cq_wcm_undo_persistence_mode
        if cq_wcm_undo_markermode is not None:
            self.cq_wcm_undo_markermode = cq_wcm_undo_markermode
        if cq_wcm_undo_whitelist is not None:
            self.cq_wcm_undo_whitelist = cq_wcm_undo_whitelist
        if cq_wcm_undo_blacklist is not None:
            self.cq_wcm_undo_blacklist = cq_wcm_undo_blacklist

    @property
    def cq_wcm_undo_enabled(self):
        """Gets the cq_wcm_undo_enabled of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501


        :return: The cq_wcm_undo_enabled of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._cq_wcm_undo_enabled

    @cq_wcm_undo_enabled.setter
    def cq_wcm_undo_enabled(self, cq_wcm_undo_enabled):
        """Sets the cq_wcm_undo_enabled of this ComDayCqWcmUndoUndoConfigProperties.


        :param cq_wcm_undo_enabled: The cq_wcm_undo_enabled of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._cq_wcm_undo_enabled = cq_wcm_undo_enabled

    @property
    def cq_wcm_undo_path(self):
        """Gets the cq_wcm_undo_path of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501


        :return: The cq_wcm_undo_path of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._cq_wcm_undo_path

    @cq_wcm_undo_path.setter
    def cq_wcm_undo_path(self, cq_wcm_undo_path):
        """Sets the cq_wcm_undo_path of this ComDayCqWcmUndoUndoConfigProperties.


        :param cq_wcm_undo_path: The cq_wcm_undo_path of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._cq_wcm_undo_path = cq_wcm_undo_path

    @property
    def cq_wcm_undo_validity(self):
        """Gets the cq_wcm_undo_validity of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501


        :return: The cq_wcm_undo_validity of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._cq_wcm_undo_validity

    @cq_wcm_undo_validity.setter
    def cq_wcm_undo_validity(self, cq_wcm_undo_validity):
        """Sets the cq_wcm_undo_validity of this ComDayCqWcmUndoUndoConfigProperties.


        :param cq_wcm_undo_validity: The cq_wcm_undo_validity of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._cq_wcm_undo_validity = cq_wcm_undo_validity

    @property
    def cq_wcm_undo_steps(self):
        """Gets the cq_wcm_undo_steps of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501


        :return: The cq_wcm_undo_steps of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._cq_wcm_undo_steps

    @cq_wcm_undo_steps.setter
    def cq_wcm_undo_steps(self, cq_wcm_undo_steps):
        """Sets the cq_wcm_undo_steps of this ComDayCqWcmUndoUndoConfigProperties.


        :param cq_wcm_undo_steps: The cq_wcm_undo_steps of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._cq_wcm_undo_steps = cq_wcm_undo_steps

    @property
    def cq_wcm_undo_persistence(self):
        """Gets the cq_wcm_undo_persistence of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501


        :return: The cq_wcm_undo_persistence of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._cq_wcm_undo_persistence

    @cq_wcm_undo_persistence.setter
    def cq_wcm_undo_persistence(self, cq_wcm_undo_persistence):
        """Sets the cq_wcm_undo_persistence of this ComDayCqWcmUndoUndoConfigProperties.


        :param cq_wcm_undo_persistence: The cq_wcm_undo_persistence of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._cq_wcm_undo_persistence = cq_wcm_undo_persistence

    @property
    def cq_wcm_undo_persistence_mode(self):
        """Gets the cq_wcm_undo_persistence_mode of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501


        :return: The cq_wcm_undo_persistence_mode of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._cq_wcm_undo_persistence_mode

    @cq_wcm_undo_persistence_mode.setter
    def cq_wcm_undo_persistence_mode(self, cq_wcm_undo_persistence_mode):
        """Sets the cq_wcm_undo_persistence_mode of this ComDayCqWcmUndoUndoConfigProperties.


        :param cq_wcm_undo_persistence_mode: The cq_wcm_undo_persistence_mode of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._cq_wcm_undo_persistence_mode = cq_wcm_undo_persistence_mode

    @property
    def cq_wcm_undo_markermode(self):
        """Gets the cq_wcm_undo_markermode of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501


        :return: The cq_wcm_undo_markermode of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._cq_wcm_undo_markermode

    @cq_wcm_undo_markermode.setter
    def cq_wcm_undo_markermode(self, cq_wcm_undo_markermode):
        """Sets the cq_wcm_undo_markermode of this ComDayCqWcmUndoUndoConfigProperties.


        :param cq_wcm_undo_markermode: The cq_wcm_undo_markermode of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._cq_wcm_undo_markermode = cq_wcm_undo_markermode

    @property
    def cq_wcm_undo_whitelist(self):
        """Gets the cq_wcm_undo_whitelist of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501


        :return: The cq_wcm_undo_whitelist of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._cq_wcm_undo_whitelist

    @cq_wcm_undo_whitelist.setter
    def cq_wcm_undo_whitelist(self, cq_wcm_undo_whitelist):
        """Sets the cq_wcm_undo_whitelist of this ComDayCqWcmUndoUndoConfigProperties.


        :param cq_wcm_undo_whitelist: The cq_wcm_undo_whitelist of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._cq_wcm_undo_whitelist = cq_wcm_undo_whitelist

    @property
    def cq_wcm_undo_blacklist(self):
        """Gets the cq_wcm_undo_blacklist of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501


        :return: The cq_wcm_undo_blacklist of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._cq_wcm_undo_blacklist

    @cq_wcm_undo_blacklist.setter
    def cq_wcm_undo_blacklist(self, cq_wcm_undo_blacklist):
        """Sets the cq_wcm_undo_blacklist of this ComDayCqWcmUndoUndoConfigProperties.


        :param cq_wcm_undo_blacklist: The cq_wcm_undo_blacklist of this ComDayCqWcmUndoUndoConfigProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._cq_wcm_undo_blacklist = cq_wcm_undo_blacklist

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
        if not isinstance(other, ComDayCqWcmUndoUndoConfigProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
