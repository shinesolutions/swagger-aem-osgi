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



#include "ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.h"

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

ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo()
{
    m_Pid = "";
    m_Title = "";
    m_Description = "";
    m_Bundle_location = "";
    m_Service_location = "";
    
}

ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::~ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo()
{
}

std::string ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::toJsonString()
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

void ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::fromJsonString(std::string const& jsonString)
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

std::string ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::getPid() const
{
    return m_Pid;
}
void ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::setPid(std::string value)
{
    m_Pid = value;
}
std::string ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::getTitle() const
{
    return m_Title;
}
void ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::setTitle(std::string value)
{
    m_Title = value;
}
std::string ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::getDescription() const
{
    return m_Description;
}
void ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::setDescription(std::string value)
{
    m_Description = value;
}
std::shared_ptr<ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties> ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::getProperties() const
{
    return m_Properties;
}
void ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::setProperties(std::shared_ptr<ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties> value)
{
    m_Properties = value;
}
std::string ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::getBundleLocation() const
{
    return m_Bundle_location;
}
void ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::setBundleLocation(std::string value)
{
    m_Bundle_location = value;
}
std::string ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::getServiceLocation() const
{
    return m_Service_location;
}
void ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo::setServiceLocation(std::string value)
{
    m_Service_location = value;
}

}
}
}
}
