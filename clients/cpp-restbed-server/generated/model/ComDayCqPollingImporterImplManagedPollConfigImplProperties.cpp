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



#include "ComDayCqPollingImporterImplManagedPollConfigImplProperties.h"

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

ComDayCqPollingImporterImplManagedPollConfigImplProperties::ComDayCqPollingImporterImplManagedPollConfigImplProperties()
{
    
}

ComDayCqPollingImporterImplManagedPollConfigImplProperties::~ComDayCqPollingImporterImplManagedPollConfigImplProperties()
{
}

std::string ComDayCqPollingImporterImplManagedPollConfigImplProperties::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	write_json(ss, pt, false);
	return ss.str();
}

void ComDayCqPollingImporterImplManagedPollConfigImplProperties::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
}

std::shared_ptr<ConfigNodePropertyString> ComDayCqPollingImporterImplManagedPollConfigImplProperties::getId() const
{
    return m_Id;
}
void ComDayCqPollingImporterImplManagedPollConfigImplProperties::setId(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Id = value;
}
std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqPollingImporterImplManagedPollConfigImplProperties::getEnabled() const
{
    return m_Enabled;
}
void ComDayCqPollingImporterImplManagedPollConfigImplProperties::setEnabled(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Enabled = value;
}
std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqPollingImporterImplManagedPollConfigImplProperties::getReference() const
{
    return m_Reference;
}
void ComDayCqPollingImporterImplManagedPollConfigImplProperties::setReference(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Reference = value;
}
std::shared_ptr<ConfigNodePropertyInteger> ComDayCqPollingImporterImplManagedPollConfigImplProperties::getInterval() const
{
    return m_Interval;
}
void ComDayCqPollingImporterImplManagedPollConfigImplProperties::setInterval(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Interval = value;
}
std::shared_ptr<ConfigNodePropertyString> ComDayCqPollingImporterImplManagedPollConfigImplProperties::getExpression() const
{
    return m_Expression;
}
void ComDayCqPollingImporterImplManagedPollConfigImplProperties::setExpression(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Expression = value;
}
std::shared_ptr<ConfigNodePropertyString> ComDayCqPollingImporterImplManagedPollConfigImplProperties::getSource() const
{
    return m_Source;
}
void ComDayCqPollingImporterImplManagedPollConfigImplProperties::setSource(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Source = value;
}
std::shared_ptr<ConfigNodePropertyString> ComDayCqPollingImporterImplManagedPollConfigImplProperties::getTarget() const
{
    return m_Target;
}
void ComDayCqPollingImporterImplManagedPollConfigImplProperties::setTarget(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Target = value;
}
std::shared_ptr<ConfigNodePropertyString> ComDayCqPollingImporterImplManagedPollConfigImplProperties::getLogin() const
{
    return m_Login;
}
void ComDayCqPollingImporterImplManagedPollConfigImplProperties::setLogin(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Login = value;
}
std::shared_ptr<ConfigNodePropertyString> ComDayCqPollingImporterImplManagedPollConfigImplProperties::getPassword() const
{
    return m_Password;
}
void ComDayCqPollingImporterImplManagedPollConfigImplProperties::setPassword(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Password = value;
}

}
}
}
}
