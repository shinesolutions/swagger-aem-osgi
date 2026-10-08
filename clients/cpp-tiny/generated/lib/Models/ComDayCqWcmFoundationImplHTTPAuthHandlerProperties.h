
/*
 * ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmFoundationImplHTTPAuthHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmFoundationImplHTTPAuthHandlerProperties_H_


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

class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmFoundationImplHTTPAuthHandlerProperties();
    ComDayCqWcmFoundationImplHTTPAuthHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmFoundationImplHTTPAuthHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString path);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAuthhttpnologin();

	/*! \brief Set 
	 */
	void setAuthhttpnologin(ConfigNodePropertyBoolean authhttpnologin);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthhttprealm();

	/*! \brief Set 
	 */
	void setAuthhttprealm(ConfigNodePropertyString authhttprealm);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthdefaultloginpage();

	/*! \brief Set 
	 */
	void setAuthdefaultloginpage(ConfigNodePropertyString authdefaultloginpage);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAuthcredform();

	/*! \brief Set 
	 */
	void setAuthcredform(ConfigNodePropertyArray authcredform);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAuthcredutf8();

	/*! \brief Set 
	 */
	void setAuthcredutf8(ConfigNodePropertyArray authcredutf8);


    private:
    ConfigNodePropertyString path;
    ConfigNodePropertyBoolean authhttpnologin;
    ConfigNodePropertyString authhttprealm;
    ConfigNodePropertyString authdefaultloginpage;
    ConfigNodePropertyArray authcredform;
    ConfigNodePropertyArray authcredutf8;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmFoundationImplHTTPAuthHandlerProperties_H_ */
