/*
 * OrgApacheHttpProxyconfiguratorProperties.h
 *
 * 
 */

#ifndef _OrgApacheHttpProxyconfiguratorProperties_H_
#define _OrgApacheHttpProxyconfiguratorProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class OrgApacheHttpProxyconfiguratorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheHttpProxyconfiguratorProperties();
	OrgApacheHttpProxyconfiguratorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheHttpProxyconfiguratorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getProxyenabled();

	/*! \brief Set 
	 */
	void setProxyenabled(ConfigNodePropertyBoolean  proxyenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getProxyhost();

	/*! \brief Set 
	 */
	void setProxyhost(ConfigNodePropertyString  proxyhost);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getProxyport();

	/*! \brief Set 
	 */
	void setProxyport(ConfigNodePropertyInteger  proxyport);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getProxyuser();

	/*! \brief Set 
	 */
	void setProxyuser(ConfigNodePropertyString  proxyuser);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getProxypassword();

	/*! \brief Set 
	 */
	void setProxypassword(ConfigNodePropertyString  proxypassword);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getProxyexceptions();

	/*! \brief Set 
	 */
	void setProxyexceptions(ConfigNodePropertyArray  proxyexceptions);

private:
	ConfigNodePropertyBoolean proxyenabled;
	ConfigNodePropertyString proxyhost;
	ConfigNodePropertyInteger proxyport;
	ConfigNodePropertyString proxyuser;
	ConfigNodePropertyString proxypassword;
	ConfigNodePropertyArray proxyexceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheHttpProxyconfiguratorProperties_H_ */
