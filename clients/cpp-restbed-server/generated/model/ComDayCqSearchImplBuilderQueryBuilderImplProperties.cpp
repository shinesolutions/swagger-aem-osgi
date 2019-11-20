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



#include "ComDayCqSearchImplBuilderQueryBuilderImplProperties.h"

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

ComDayCqSearchImplBuilderQueryBuilderImplProperties::ComDayCqSearchImplBuilderQueryBuilderImplProperties()
{
    
}

ComDayCqSearchImplBuilderQueryBuilderImplProperties::~ComDayCqSearchImplBuilderQueryBuilderImplProperties()
{
}

std::string ComDayCqSearchImplBuilderQueryBuilderImplProperties::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	write_json(ss, pt, false);
	return ss.str();
}

void ComDayCqSearchImplBuilderQueryBuilderImplProperties::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
}

std::shared_ptr<ConfigNodePropertyArray> ComDayCqSearchImplBuilderQueryBuilderImplProperties::getExcerptProperties() const
{
    return m_Excerpt_properties;
}
void ComDayCqSearchImplBuilderQueryBuilderImplProperties::setExcerptProperties(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Excerpt_properties = value;
}
std::shared_ptr<ConfigNodePropertyInteger> ComDayCqSearchImplBuilderQueryBuilderImplProperties::getCacheMaxEntries() const
{
    return m_Cache_max_entries;
}
void ComDayCqSearchImplBuilderQueryBuilderImplProperties::setCacheMaxEntries(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Cache_max_entries = value;
}
std::shared_ptr<ConfigNodePropertyInteger> ComDayCqSearchImplBuilderQueryBuilderImplProperties::getCacheEntryLifetime() const
{
    return m_Cache_entry_lifetime;
}
void ComDayCqSearchImplBuilderQueryBuilderImplProperties::setCacheEntryLifetime(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_Cache_entry_lifetime = value;
}
std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqSearchImplBuilderQueryBuilderImplProperties::getXpathUnion() const
{
    return m_Xpath_union;
}
void ComDayCqSearchImplBuilderQueryBuilderImplProperties::setXpathUnion(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Xpath_union = value;
}

}
}
}
}
