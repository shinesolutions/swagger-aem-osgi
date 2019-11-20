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



#include "OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.h"

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

OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo()
{
    m_Pid = "";
    m_Title = "";
    m_Description = "";
    m_AdditionalProperties = "";
    m_Bundle_location = "";
    m_Service_location = "";
    
}

OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::~OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo()
{
}

std::string OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	pt.put("Pid", m_Pid);
	pt.put("Title", m_Title);
	pt.put("Description", m_Description);
	pt.put("AdditionalProperties", m_AdditionalProperties);
	pt.put("Bundle_location", m_Bundle_location);
	pt.put("Service_location", m_Service_location);
	write_json(ss, pt, false);
	return ss.str();
}

void OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	m_Pid = pt.get("Pid", "");
	m_Title = pt.get("Title", "");
	m_Description = pt.get("Description", "");
	m_AdditionalProperties = pt.get("AdditionalProperties", "");
	m_Bundle_location = pt.get("Bundle_location", "");
	m_Service_location = pt.get("Service_location", "");
}

std::string OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::getPid() const
{
    return m_Pid;
}
void OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::setPid(std::string value)
{
    m_Pid = value;
}
std::string OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::getTitle() const
{
    return m_Title;
}
void OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::setTitle(std::string value)
{
    m_Title = value;
}
std::string OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::getDescription() const
{
    return m_Description;
}
void OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::setDescription(std::string value)
{
    m_Description = value;
}
std::shared_ptr<OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties> OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::getProperties() const
{
    return m_Properties;
}
void OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::setProperties(std::shared_ptr<OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties> value)
{
    m_Properties = value;
}
std::string OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::getAdditionalProperties() const
{
    return m_AdditionalProperties;
}
void OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::setAdditionalProperties(std::string value)
{
    m_AdditionalProperties = value;
}
std::string OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::getBundleLocation() const
{
    return m_Bundle_location;
}
void OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::setBundleLocation(std::string value)
{
    m_Bundle_location = value;
}
std::string OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::getServiceLocation() const
{
    return m_Service_location;
}
void OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo::setServiceLocation(std::string value)
{
    m_Service_location = value;
}

}
}
}
}
