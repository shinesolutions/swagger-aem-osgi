
/*
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties();
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSolrhttpurl();

	/*! \brief Set 
	 */
	void setSolrhttpurl(ConfigNodePropertyString solrhttpurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSolrzkhost();

	/*! \brief Set 
	 */
	void setSolrzkhost(ConfigNodePropertyString solrzkhost);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSolrcollection();

	/*! \brief Set 
	 */
	void setSolrcollection(ConfigNodePropertyString solrcollection);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSolrsockettimeout();

	/*! \brief Set 
	 */
	void setSolrsockettimeout(ConfigNodePropertyInteger solrsockettimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSolrconnectiontimeout();

	/*! \brief Set 
	 */
	void setSolrconnectiontimeout(ConfigNodePropertyInteger solrconnectiontimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSolrshardsno();

	/*! \brief Set 
	 */
	void setSolrshardsno(ConfigNodePropertyInteger solrshardsno);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSolrreplicationfactor();

	/*! \brief Set 
	 */
	void setSolrreplicationfactor(ConfigNodePropertyInteger solrreplicationfactor);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSolrconfdir();

	/*! \brief Set 
	 */
	void setSolrconfdir(ConfigNodePropertyString solrconfdir);


    private:
    ConfigNodePropertyString solrhttpurl;
    ConfigNodePropertyString solrzkhost;
    ConfigNodePropertyString solrcollection;
    ConfigNodePropertyInteger solrsockettimeout;
    ConfigNodePropertyInteger solrconnectiontimeout;
    ConfigNodePropertyInteger solrshardsno;
    ConfigNodePropertyInteger solrreplicationfactor;
    ConfigNodePropertyString solrconfdir;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties_H_ */
