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



#include "ComDayCqWcmCoreImplWarpTimeWarpFilterInfo.h"

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

ComDayCqWcmCoreImplWarpTimeWarpFilterInfo::ComDayCqWcmCoreImplWarpTimeWarpFilterInfo()
{
    m_Pid = "";
    m_Title = "";
    m_Description = "";
    m_Bundle_location = "";
    m_Service_location = "";
    
}

ComDayCqWcmCoreImplWarpTimeWarpFilterInfo::~ComDayCqWcmCoreImplWarpTimeWarpFilterInfo()
{
}

std::string ComDayCqWcmCoreImplWarpTimeWarpFilterInfo::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	pt.put("Pid", m_Pid);
	pt.put("Title", m_Title);
	pt.put("Description", m_Description);
	pt.put("Bundle_location", m_Bundle_location);
	pt.put("Service_location", m_Service_location);
	write_json(ss, pt, false);
	return ss.str();
}

void ComDayCqWcmCoreImplWarpTimeWarpFilterInfo::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	m_Pid = pt.get("Pid", "");
	m_Title = pt.get("Title", "");
	m_Description = pt.get("Description", "");
	m_Bundle_location = pt.get("Bundle_location", "");
	m_Service_location = pt.get("Service_location", "");
}

std::string ComDayCqWcmCoreImplWarpTimeWarpFilterInfo::getPid() const
{
    return m_Pid;
}
void ComDayCqWcmCoreImplWarpTimeWarpFilterInfo::setPid(std::string value)
{
    m_Pid = value;
}
std::string ComDayCqWcmCoreImplWarpTimeWarpFilterInfo::getTitle() const
{
    return m_Title;
}
void ComDayCqWcmCoreImplWarpTimeWarpFilterInfo::setTitle(std::string value)
{
    m_Title = value;
}
std::string ComDayCqWcmCoreImplWarpTimeWarpFilterInfo::getDescription() const
{
    return m_Description;
}
void ComDayCqWcmCoreImplWarpTimeWarpFilterInfo::setDescription(std::string value)
{
    m_Description = value;
}
std::shared_ptr<ComDayCqWcmCoreImplWarpTimeWarpFilterProperties> ComDayCqWcmCoreImplWarpTimeWarpFilterInfo::getProperties() const
{
    return m_Properties;
}
void ComDayCqWcmCoreImplWarpTimeWarpFilterInfo::setProperties(std::shared_ptr<ComDayCqWcmCoreImplWarpTimeWarpFilterProperties> value)
{
    m_Properties = value;
}
std::string ComDayCqWcmCoreImplWarpTimeWarpFilterInfo::getBundleLocation() const
{
    return m_Bundle_location;
}
void ComDayCqWcmCoreImplWarpTimeWarpFilterInfo::setBundleLocation(std::string value)
{
    m_Bundle_location = value;
}
std::string ComDayCqWcmCoreImplWarpTimeWarpFilterInfo::getServiceLocation() const
{
    return m_Service_location;
}
void ComDayCqWcmCoreImplWarpTimeWarpFilterInfo::setServiceLocation(std::string value)
{
    m_Service_location = value;
}

}
}
}
}
