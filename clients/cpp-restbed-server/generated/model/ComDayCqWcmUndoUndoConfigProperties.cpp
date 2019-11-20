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



#include "ComDayCqWcmUndoUndoConfigProperties.h"

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

ComDayCqWcmUndoUndoConfigProperties::ComDayCqWcmUndoUndoConfigProperties()
{
    
}

ComDayCqWcmUndoUndoConfigProperties::~ComDayCqWcmUndoUndoConfigProperties()
{
}

std::string ComDayCqWcmUndoUndoConfigProperties::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	write_json(ss, pt, false);
	return ss.str();
}

void ComDayCqWcmUndoUndoConfigProperties::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
}

std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqWcmUndoUndoConfigProperties::getCqWcmUndoEnabled() const
{
    return m_Cq_wcm_undo_enabled;
}
void ComDayCqWcmUndoUndoConfigProperties::setCqWcmUndoEnabled(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Cq_wcm_undo_enabled = value;
}
std::shared_ptr<ConfigNodePropertyString> ComDayCqWcmUndoUndoConfigProperties::getCqWcmUndoPath() const
{
    return m_Cq_wcm_undo_path;
}
void ComDayCqWcmUndoUndoConfigProperties::setCqWcmUndoPath(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Cq_wcm_undo_path = value;
}
std::shared_ptr<ConfigNodePropertyInteger> ComDayCqWcmUndoUndoConfigProperties::getCqWcmUndoValidity() const
{
    return m_Cq_wcm_undo_validity;
}
void ComDayCqWcmUndoUndoConfigProperties::setCqWcmUndoValidity(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Cq_wcm_undo_validity = value;
}
std::shared_ptr<ConfigNodePropertyInteger> ComDayCqWcmUndoUndoConfigProperties::getCqWcmUndoSteps() const
{
    return m_Cq_wcm_undo_steps;
}
void ComDayCqWcmUndoUndoConfigProperties::setCqWcmUndoSteps(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Cq_wcm_undo_steps = value;
}
std::shared_ptr<ConfigNodePropertyString> ComDayCqWcmUndoUndoConfigProperties::getCqWcmUndoPersistence() const
{
    return m_Cq_wcm_undo_persistence;
}
void ComDayCqWcmUndoUndoConfigProperties::setCqWcmUndoPersistence(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Cq_wcm_undo_persistence = value;
}
std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqWcmUndoUndoConfigProperties::getCqWcmUndoPersistenceMode() const
{
    return m_Cq_wcm_undo_persistence_mode;
}
void ComDayCqWcmUndoUndoConfigProperties::setCqWcmUndoPersistenceMode(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Cq_wcm_undo_persistence_mode = value;
}
std::shared_ptr<ConfigNodePropertyString> ComDayCqWcmUndoUndoConfigProperties::getCqWcmUndoMarkermode() const
{
    return m_Cq_wcm_undo_markermode;
}
void ComDayCqWcmUndoUndoConfigProperties::setCqWcmUndoMarkermode(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Cq_wcm_undo_markermode = value;
}
std::shared_ptr<ConfigNodePropertyArray> ComDayCqWcmUndoUndoConfigProperties::getCqWcmUndoWhitelist() const
{
    return m_Cq_wcm_undo_whitelist;
}
void ComDayCqWcmUndoUndoConfigProperties::setCqWcmUndoWhitelist(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Cq_wcm_undo_whitelist = value;
}
std::shared_ptr<ConfigNodePropertyArray> ComDayCqWcmUndoUndoConfigProperties::getCqWcmUndoBlacklist() const
{
    return m_Cq_wcm_undo_blacklist;
}
void ComDayCqWcmUndoUndoConfigProperties::setCqWcmUndoBlacklist(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Cq_wcm_undo_blacklist = value;
}

}
}
}
}
