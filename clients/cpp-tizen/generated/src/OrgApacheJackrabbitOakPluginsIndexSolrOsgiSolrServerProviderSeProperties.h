/*
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties_H_
#define _OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties_H_


#include <string>
#include "ConfigNodePropertyDropDown.h"
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

class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties();
	OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getServertype();

	/*! \brief Set 
	 */
	void setServertype(ConfigNodePropertyDropDown  servertype);

private:
	ConfigNodePropertyDropDown servertype;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties_H_ */
