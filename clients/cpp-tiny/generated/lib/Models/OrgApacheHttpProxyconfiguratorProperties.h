
/*
 * OrgApacheHttpProxyconfiguratorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheHttpProxyconfiguratorProperties_H_
#define TINY_CPP_CLIENT_OrgApacheHttpProxyconfiguratorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheHttpProxyconfiguratorProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheHttpProxyconfiguratorProperties();
    OrgApacheHttpProxyconfiguratorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheHttpProxyconfiguratorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getProxyenabled();

	/*! \brief Set 
	 */
	void setProxyenabled(ConfigNodePropertyBoolean proxyenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getProxyhost();

	/*! \brief Set 
	 */
	void setProxyhost(ConfigNodePropertyString proxyhost);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getProxyport();

	/*! \brief Set 
	 */
	void setProxyport(ConfigNodePropertyInteger proxyport);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getProxyuser();

	/*! \brief Set 
	 */
	void setProxyuser(ConfigNodePropertyString proxyuser);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getProxypassword();

	/*! \brief Set 
	 */
	void setProxypassword(ConfigNodePropertyString proxypassword);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getProxyexceptions();

	/*! \brief Set 
	 */
	void setProxyexceptions(ConfigNodePropertyArray proxyexceptions);


    private:
    ConfigNodePropertyBoolean proxyenabled;
    ConfigNodePropertyString proxyhost;
    ConfigNodePropertyInteger proxyport;
    ConfigNodePropertyString proxyuser;
    ConfigNodePropertyString proxypassword;
    ConfigNodePropertyArray proxyexceptions;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheHttpProxyconfiguratorProperties_H_ */
