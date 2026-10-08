
/*
 * ComDayCommonsHttpclientProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCommonsHttpclientProperties_H_
#define TINY_CPP_CLIENT_ComDayCommonsHttpclientProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCommonsHttpclientProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCommonsHttpclientProperties();
    ComDayCommonsHttpclientProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCommonsHttpclientProperties();


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
	ConfigNodePropertyString getProxyntlmhost();

	/*! \brief Set 
	 */
	void setProxyntlmhost(ConfigNodePropertyString proxyntlmhost);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getProxyntlmdomain();

	/*! \brief Set 
	 */
	void setProxyntlmdomain(ConfigNodePropertyString proxyntlmdomain);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getProxyexceptions();

	/*! \brief Set 
	 */
	void setProxyexceptions(ConfigNodePropertyArray proxyexceptions);


    private:
    ConfigNodePropertyBoolean proxyenabled;
    ConfigNodePropertyString proxyhost;
    ConfigNodePropertyString proxyuser;
    ConfigNodePropertyString proxypassword;
    ConfigNodePropertyString proxyntlmhost;
    ConfigNodePropertyString proxyntlmdomain;
    ConfigNodePropertyArray proxyexceptions;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCommonsHttpclientProperties_H_ */
