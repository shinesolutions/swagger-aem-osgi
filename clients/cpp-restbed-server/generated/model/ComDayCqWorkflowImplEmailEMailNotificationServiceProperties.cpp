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



#include "ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.h"

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

ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::ComDayCqWorkflowImplEmailEMailNotificationServiceProperties()
{
    
}

ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::~ComDayCqWorkflowImplEmailEMailNotificationServiceProperties()
{
}

std::string ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	write_json(ss, pt, false);
	return ss.str();
}

void ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
}

std::shared_ptr<ConfigNodePropertyString> ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getFromAddress() const
{
    return m_From_address;
}
void ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setFromAddress(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_From_address = value;
}
std::shared_ptr<ConfigNodePropertyString> ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getHostPrefix() const
{
    return m_Host_prefix;
}
void ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setHostPrefix(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Host_prefix = value;
}
std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getNotifyOnabort() const
{
    return m_Notify_onabort;
}
void ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setNotifyOnabort(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Notify_onabort = value;
}
std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getNotifyOncomplete() const
{
    return m_Notify_oncomplete;
}
void ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setNotifyOncomplete(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Notify_oncomplete = value;
}
std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getNotifyOncontainercomplete() const
{
    return m_Notify_oncontainercomplete;
}
void ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setNotifyOncontainercomplete(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Notify_oncontainercomplete = value;
}
std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getNotifyUseronly() const
{
    return m_Notify_useronly;
}
void ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setNotifyUseronly(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Notify_useronly = value;
}

}
}
}
}
