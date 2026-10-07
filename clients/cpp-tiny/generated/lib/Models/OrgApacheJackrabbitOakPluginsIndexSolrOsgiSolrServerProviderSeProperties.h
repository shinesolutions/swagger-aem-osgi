
/*
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyDropDown.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties();
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getServertype();

	/*! \brief Set 
	 */
	void setServertype(ConfigNodePropertyDropDown servertype);


    private:
    ConfigNodePropertyDropDown servertype;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties_H_ */
