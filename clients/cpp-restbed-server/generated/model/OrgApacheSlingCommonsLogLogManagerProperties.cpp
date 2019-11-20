/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.2.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "OrgApacheSlingCommonsLogLogManagerProperties.h"

#include <string>
#include <sstream>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

OrgApacheSlingCommonsLogLogManagerProperties::OrgApacheSlingCommonsLogLogManagerProperties()
{
    
}

OrgApacheSlingCommonsLogLogManagerProperties::~OrgApacheSlingCommonsLogLogManagerProperties()
{
}

std::string OrgApacheSlingCommonsLogLogManagerProperties::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	write_json(ss, pt, false);
	return ss.str();
}

void OrgApacheSlingCommonsLogLogManagerProperties::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
}

std::shared_ptr<ConfigNodePropertyDropDown> OrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogLevel() const
{
    return m_Org_apache_sling_commons_log_level;
}
void OrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogLevel(std::shared_ptr<ConfigNodePropertyDropDown> value)
{
    m_Org_apache_sling_commons_log_level = value;
}
std::shared_ptr<ConfigNodePropertyString> OrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogFile() const
{
    return m_Org_apache_sling_commons_log_file;
}
void OrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogFile(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Org_apache_sling_commons_log_file = value;
}
std::shared_ptr<ConfigNodePropertyInteger> OrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogFileNumber() const
{
    return m_Org_apache_sling_commons_log_file_number;
}
void OrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogFileNumber(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Org_apache_sling_commons_log_file_number = value;
}
std::shared_ptr<ConfigNodePropertyString> OrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogFileSize() const
{
    return m_Org_apache_sling_commons_log_file_size;
}
void OrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogFileSize(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Org_apache_sling_commons_log_file_size = value;
}
std::shared_ptr<ConfigNodePropertyString> OrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogPattern() const
{
    return m_Org_apache_sling_commons_log_pattern;
}
void OrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogPattern(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Org_apache_sling_commons_log_pattern = value;
}
std::shared_ptr<ConfigNodePropertyString> OrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogConfigurationFile() const
{
    return m_Org_apache_sling_commons_log_configurationFile;
}
void OrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogConfigurationFile(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Org_apache_sling_commons_log_configurationFile = value;
}
std::shared_ptr<ConfigNodePropertyBoolean> OrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogPackagingDataEnabled() const
{
    return m_Org_apache_sling_commons_log_packagingDataEnabled;
}
void OrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogPackagingDataEnabled(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Org_apache_sling_commons_log_packagingDataEnabled = value;
}
std::shared_ptr<ConfigNodePropertyInteger> OrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogMaxCallerDataDepth() const
{
    return m_Org_apache_sling_commons_log_maxCallerDataDepth;
}
void OrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogMaxCallerDataDepth(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Org_apache_sling_commons_log_maxCallerDataDepth = value;
}
std::shared_ptr<ConfigNodePropertyInteger> OrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogMaxOldFileCountInDump() const
{
    return m_Org_apache_sling_commons_log_maxOldFileCountInDump;
}
void OrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogMaxOldFileCountInDump(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Org_apache_sling_commons_log_maxOldFileCountInDump = value;
}
std::shared_ptr<ConfigNodePropertyInteger> OrgApacheSlingCommonsLogLogManagerProperties::getOrgApacheSlingCommonsLogNumOfLines() const
{
    return m_Org_apache_sling_commons_log_numOfLines;
}
void OrgApacheSlingCommonsLogLogManagerProperties::setOrgApacheSlingCommonsLogNumOfLines(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Org_apache_sling_commons_log_numOfLines = value;
}

}
}
}
}
