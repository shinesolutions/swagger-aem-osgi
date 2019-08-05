/*
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties_H_
#define _OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties();
	OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSolrhttpurl();

	/*! \brief Set 
	 */
	void setSolrhttpurl(ConfigNodePropertyString  solrhttpurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSolrzkhost();

	/*! \brief Set 
	 */
	void setSolrzkhost(ConfigNodePropertyString  solrzkhost);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSolrcollection();

	/*! \brief Set 
	 */
	void setSolrcollection(ConfigNodePropertyString  solrcollection);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSolrsockettimeout();

	/*! \brief Set 
	 */
	void setSolrsockettimeout(ConfigNodePropertyInteger  solrsockettimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSolrconnectiontimeout();

	/*! \brief Set 
	 */
	void setSolrconnectiontimeout(ConfigNodePropertyInteger  solrconnectiontimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSolrshardsno();

	/*! \brief Set 
	 */
	void setSolrshardsno(ConfigNodePropertyInteger  solrshardsno);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSolrreplicationfactor();

	/*! \brief Set 
	 */
	void setSolrreplicationfactor(ConfigNodePropertyInteger  solrreplicationfactor);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSolrconfdir();

	/*! \brief Set 
	 */
	void setSolrconfdir(ConfigNodePropertyString  solrconfdir);

private:
	ConfigNodePropertyString solrhttpurl;
	ConfigNodePropertyString solrzkhost;
	ConfigNodePropertyString solrcollection;
	ConfigNodePropertyInteger solrsockettimeout;
	ConfigNodePropertyInteger solrconnectiontimeout;
	ConfigNodePropertyInteger solrshardsno;
	ConfigNodePropertyInteger solrreplicationfactor;
	ConfigNodePropertyString solrconfdir;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties_H_ */
