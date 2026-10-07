/*
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo_H_
#define _OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo_H_


#include <string>
#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.h"
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

class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo();
	OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string  pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo_H_ */
