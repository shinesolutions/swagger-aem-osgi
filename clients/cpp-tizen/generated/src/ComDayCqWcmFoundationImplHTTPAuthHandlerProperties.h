/*
 * ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmFoundationImplHTTPAuthHandlerProperties_H_
#define _ComDayCqWcmFoundationImplHTTPAuthHandlerProperties_H_


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

class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmFoundationImplHTTPAuthHandlerProperties();
	ComDayCqWcmFoundationImplHTTPAuthHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmFoundationImplHTTPAuthHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString  path);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAuthhttpnologin();

	/*! \brief Set 
	 */
	void setAuthhttpnologin(ConfigNodePropertyBoolean  authhttpnologin);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthhttprealm();

	/*! \brief Set 
	 */
	void setAuthhttprealm(ConfigNodePropertyString  authhttprealm);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthdefaultloginpage();

	/*! \brief Set 
	 */
	void setAuthdefaultloginpage(ConfigNodePropertyString  authdefaultloginpage);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAuthcredform();

	/*! \brief Set 
	 */
	void setAuthcredform(ConfigNodePropertyArray  authcredform);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAuthcredutf8();

	/*! \brief Set 
	 */
	void setAuthcredutf8(ConfigNodePropertyArray  authcredutf8);

private:
	ConfigNodePropertyString path;
	ConfigNodePropertyBoolean authhttpnologin;
	ConfigNodePropertyString authhttprealm;
	ConfigNodePropertyString authdefaultloginpage;
	ConfigNodePropertyArray authcredform;
	ConfigNodePropertyArray authcredutf8;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmFoundationImplHTTPAuthHandlerProperties_H_ */
