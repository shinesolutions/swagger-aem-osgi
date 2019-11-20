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



#include "ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.h"

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

ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties()
{
    
}

ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::~ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties()
{
}

std::string ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	write_json(ss, pt, false);
	return ss.str();
}

void ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
}

std::shared_ptr<ConfigNodePropertyInteger> ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::getDefaultTimeout() const
{
    return m_Default_timeout;
}
void ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::setDefaultTimeout(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Default_timeout = value;
}
std::shared_ptr<ConfigNodePropertyInteger> ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::getMaxTimeout() const
{
    return m_Max_timeout;
}
void ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::setMaxTimeout(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Max_timeout = value;
}
std::shared_ptr<ConfigNodePropertyInteger> ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::getDefaultPeriod() const
{
    return m_Default_period;
}
void ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::setDefaultPeriod(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Default_period = value;
}

}
}
}
}
