/*
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties_H_
#define _OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties_H_


#include <string>
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties();
	OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSolrhomepath();

	/*! \brief Set 
	 */
	void setSolrhomepath(ConfigNodePropertyString  solrhomepath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSolrcorename();

	/*! \brief Set 
	 */
	void setSolrcorename(ConfigNodePropertyString  solrcorename);

private:
	ConfigNodePropertyString solrhomepath;
	ConfigNodePropertyString solrcorename;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties_H_ */
