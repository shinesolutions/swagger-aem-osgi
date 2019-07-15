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


class OrgApacheSlingServletsGetDefaultGetServletProperties(object):
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
        'aliases': 'ConfigNodePropertyArray',
        'index': 'ConfigNodePropertyBoolean',
        'index_files': 'ConfigNodePropertyArray',
        'enable_html': 'ConfigNodePropertyBoolean',
        'enable_json': 'ConfigNodePropertyBoolean',
        'enable_txt': 'ConfigNodePropertyBoolean',
        'enable_xml': 'ConfigNodePropertyBoolean',
        'json_maximumresults': 'ConfigNodePropertyInteger',
        'ecma_suport': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'aliases': 'aliases',
        'index': 'index',
        'index_files': 'index.files',
        'enable_html': 'enable.html',
        'enable_json': 'enable.json',
        'enable_txt': 'enable.txt',
        'enable_xml': 'enable.xml',
        'json_maximumresults': 'json.maximumresults',
        'ecma_suport': 'ecmaSuport'
    }

    def __init__(self, aliases=None, index=None, index_files=None, enable_html=None, enable_json=None, enable_txt=None, enable_xml=None, json_maximumresults=None, ecma_suport=None):  # noqa: E501
        """OrgApacheSlingServletsGetDefaultGetServletProperties - a model defined in OpenAPI"""  # noqa: E501

        self._aliases = None
        self._index = None
        self._index_files = None
        self._enable_html = None
        self._enable_json = None
        self._enable_txt = None
        self._enable_xml = None
        self._json_maximumresults = None
        self._ecma_suport = None
        self.discriminator = None

        if aliases is not None:
            self.aliases = aliases
        if index is not None:
            self.index = index
        if index_files is not None:
            self.index_files = index_files
        if enable_html is not None:
            self.enable_html = enable_html
        if enable_json is not None:
            self.enable_json = enable_json
        if enable_txt is not None:
            self.enable_txt = enable_txt
        if enable_xml is not None:
            self.enable_xml = enable_xml
        if json_maximumresults is not None:
            self.json_maximumresults = json_maximumresults
        if ecma_suport is not None:
            self.ecma_suport = ecma_suport

    @property
    def aliases(self):
        """Gets the aliases of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501


        :return: The aliases of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._aliases

    @aliases.setter
    def aliases(self, aliases):
        """Sets the aliases of this OrgApacheSlingServletsGetDefaultGetServletProperties.


        :param aliases: The aliases of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._aliases = aliases

    @property
    def index(self):
        """Gets the index of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501


        :return: The index of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._index

    @index.setter
    def index(self, index):
        """Sets the index of this OrgApacheSlingServletsGetDefaultGetServletProperties.


        :param index: The index of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._index = index

    @property
    def index_files(self):
        """Gets the index_files of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501


        :return: The index_files of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._index_files

    @index_files.setter
    def index_files(self, index_files):
        """Sets the index_files of this OrgApacheSlingServletsGetDefaultGetServletProperties.


        :param index_files: The index_files of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._index_files = index_files

    @property
    def enable_html(self):
        """Gets the enable_html of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501


        :return: The enable_html of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._enable_html

    @enable_html.setter
    def enable_html(self, enable_html):
        """Sets the enable_html of this OrgApacheSlingServletsGetDefaultGetServletProperties.


        :param enable_html: The enable_html of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._enable_html = enable_html

    @property
    def enable_json(self):
        """Gets the enable_json of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501


        :return: The enable_json of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._enable_json

    @enable_json.setter
    def enable_json(self, enable_json):
        """Sets the enable_json of this OrgApacheSlingServletsGetDefaultGetServletProperties.


        :param enable_json: The enable_json of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._enable_json = enable_json

    @property
    def enable_txt(self):
        """Gets the enable_txt of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501


        :return: The enable_txt of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._enable_txt

    @enable_txt.setter
    def enable_txt(self, enable_txt):
        """Sets the enable_txt of this OrgApacheSlingServletsGetDefaultGetServletProperties.


        :param enable_txt: The enable_txt of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._enable_txt = enable_txt

    @property
    def enable_xml(self):
        """Gets the enable_xml of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501


        :return: The enable_xml of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._enable_xml

    @enable_xml.setter
    def enable_xml(self, enable_xml):
        """Sets the enable_xml of this OrgApacheSlingServletsGetDefaultGetServletProperties.


        :param enable_xml: The enable_xml of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._enable_xml = enable_xml

    @property
    def json_maximumresults(self):
        """Gets the json_maximumresults of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501


        :return: The json_maximumresults of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._json_maximumresults

    @json_maximumresults.setter
    def json_maximumresults(self, json_maximumresults):
        """Sets the json_maximumresults of this OrgApacheSlingServletsGetDefaultGetServletProperties.


        :param json_maximumresults: The json_maximumresults of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._json_maximumresults = json_maximumresults

    @property
    def ecma_suport(self):
        """Gets the ecma_suport of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501


        :return: The ecma_suport of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._ecma_suport

    @ecma_suport.setter
    def ecma_suport(self, ecma_suport):
        """Sets the ecma_suport of this OrgApacheSlingServletsGetDefaultGetServletProperties.


        :param ecma_suport: The ecma_suport of this OrgApacheSlingServletsGetDefaultGetServletProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._ecma_suport = ecma_suport

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
        if not isinstance(other, OrgApacheSlingServletsGetDefaultGetServletProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
