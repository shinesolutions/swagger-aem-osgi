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



#include "ComAdobeGraniteFragsImplRandomFeatureProperties.h"

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

ComAdobeGraniteFragsImplRandomFeatureProperties::ComAdobeGraniteFragsImplRandomFeatureProperties()
{
    
}

ComAdobeGraniteFragsImplRandomFeatureProperties::~ComAdobeGraniteFragsImplRandomFeatureProperties()
{
}

std::string ComAdobeGraniteFragsImplRandomFeatureProperties::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	write_json(ss, pt, false);
	return ss.str();
}

void ComAdobeGraniteFragsImplRandomFeatureProperties::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
}

std::shared_ptr<ConfigNodePropertyString> ComAdobeGraniteFragsImplRandomFeatureProperties::getFeatureName() const
{
    return m_Feature_name;
}
void ComAdobeGraniteFragsImplRandomFeatureProperties::setFeatureName(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Feature_name = value;
}
std::shared_ptr<ConfigNodePropertyString> ComAdobeGraniteFragsImplRandomFeatureProperties::getFeatureDescription() const
{
    return m_Feature_description;
}
void ComAdobeGraniteFragsImplRandomFeatureProperties::setFeatureDescription(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Feature_description = value;
}
std::shared_ptr<ConfigNodePropertyString> ComAdobeGraniteFragsImplRandomFeatureProperties::getActivePercentage() const
{
    return m_Active_percentage;
}
void ComAdobeGraniteFragsImplRandomFeatureProperties::setActivePercentage(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Active_percentage = value;
}
std::shared_ptr<ConfigNodePropertyString> ComAdobeGraniteFragsImplRandomFeatureProperties::getCookieName() const
{
    return m_Cookie_name;
}
void ComAdobeGraniteFragsImplRandomFeatureProperties::setCookieName(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Cookie_name = value;
}
std::shared_ptr<ConfigNodePropertyInteger> ComAdobeGraniteFragsImplRandomFeatureProperties::getCookieMaxAge() const
{
    return m_Cookie_maxAge;
}
void ComAdobeGraniteFragsImplRandomFeatureProperties::setCookieMaxAge(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Cookie_maxAge = value;
}

}
}
}
}
