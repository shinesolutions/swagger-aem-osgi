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



#include "ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.h"

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

ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties()
{
    
}

ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::~ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties()
{
}

std::string ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	write_json(ss, pt, false);
	return ss.str();
}

void ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
}

std::shared_ptr<ConfigNodePropertyString> ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::getEventFilter() const
{
    return m_Event_filter;
}
void ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::setEventFilter(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Event_filter = value;
}
std::shared_ptr<ConfigNodePropertyInteger> ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::getMinThreadPoolSize() const
{
    return m_MinThreadPoolSize;
}
void ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::setMinThreadPoolSize(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_MinThreadPoolSize = value;
}
std::shared_ptr<ConfigNodePropertyInteger> ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::getMaxThreadPoolSize() const
{
    return m_MaxThreadPoolSize;
}
void ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::setMaxThreadPoolSize(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_MaxThreadPoolSize = value;
}
std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::getCqWcmWorkflowTerminateOnActivate() const
{
    return m_Cq_wcm_workflow_terminate_on_activate;
}
void ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::setCqWcmWorkflowTerminateOnActivate(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Cq_wcm_workflow_terminate_on_activate = value;
}
std::shared_ptr<ConfigNodePropertyArray> ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::getCqWcmWorklfowTerminateExclusionList() const
{
    return m_Cq_wcm_worklfow_terminate_exclusion_list;
}
void ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::setCqWcmWorklfowTerminateExclusionList(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Cq_wcm_worklfow_terminate_exclusion_list = value;
}

}
}
}
}
