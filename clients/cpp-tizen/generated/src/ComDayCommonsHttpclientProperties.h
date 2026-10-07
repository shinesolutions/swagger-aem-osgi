/*
 * ComDayCommonsHttpclientProperties.h
 *
 * 
 */

#ifndef _ComDayCommonsHttpclientProperties_H_
#define _ComDayCommonsHttpclientProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCommonsHttpclientProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCommonsHttpclientProperties();
	ComDayCommonsHttpclientProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCommonsHttpclientProperties();

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
	ConfigNodePropertyString getProxyntlmhost();

	/*! \brief Set 
	 */
	void setProxyntlmhost(ConfigNodePropertyString  proxyntlmhost);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getProxyntlmdomain();

	/*! \brief Set 
	 */
	void setProxyntlmdomain(ConfigNodePropertyString  proxyntlmdomain);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getProxyexceptions();

	/*! \brief Set 
	 */
	void setProxyexceptions(ConfigNodePropertyArray  proxyexceptions);

private:
	ConfigNodePropertyBoolean proxyenabled;
	ConfigNodePropertyString proxyhost;
	ConfigNodePropertyString proxyuser;
	ConfigNodePropertyString proxypassword;
	ConfigNodePropertyString proxyntlmhost;
	ConfigNodePropertyString proxyntlmdomain;
	ConfigNodePropertyArray proxyexceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCommonsHttpclientProperties_H_ */
