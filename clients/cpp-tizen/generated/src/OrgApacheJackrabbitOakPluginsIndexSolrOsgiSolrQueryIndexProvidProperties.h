/*
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties_H_
#define _OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties();
	OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getQueryaggregation();

	/*! \brief Set 
	 */
	void setQueryaggregation(ConfigNodePropertyBoolean  queryaggregation);

private:
	ConfigNodePropertyBoolean queryaggregation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties_H_ */
