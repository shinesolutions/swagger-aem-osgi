/*
 * OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties_H_
#define _OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
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

class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties();
	OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardcontextselect();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardcontextselect(ConfigNodePropertyString  osgihttpwhiteboardcontextselect);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardlistener();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardlistener(ConfigNodePropertyString  osgihttpwhiteboardlistener);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthsudocookie();

	/*! \brief Set 
	 */
	void setAuthsudocookie(ConfigNodePropertyString  authsudocookie);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthsudoparameter();

	/*! \brief Set 
	 */
	void setAuthsudoparameter(ConfigNodePropertyString  authsudoparameter);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAuthannonymous();

	/*! \brief Set 
	 */
	void setAuthannonymous(ConfigNodePropertyBoolean  authannonymous);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingauthrequirements();

	/*! \brief Set 
	 */
	void setSlingauthrequirements(ConfigNodePropertyArray  slingauthrequirements);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingauthanonymoususer();

	/*! \brief Set 
	 */
	void setSlingauthanonymoususer(ConfigNodePropertyString  slingauthanonymoususer);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingauthanonymouspassword();

	/*! \brief Set 
	 */
	void setSlingauthanonymouspassword(ConfigNodePropertyString  slingauthanonymouspassword);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getAuthhttp();

	/*! \brief Set 
	 */
	void setAuthhttp(ConfigNodePropertyDropDown  authhttp);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthhttprealm();

	/*! \brief Set 
	 */
	void setAuthhttprealm(ConfigNodePropertyString  authhttprealm);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAuthurisuffix();

	/*! \brief Set 
	 */
	void setAuthurisuffix(ConfigNodePropertyArray  authurisuffix);

private:
	ConfigNodePropertyString osgihttpwhiteboardcontextselect;
	ConfigNodePropertyString osgihttpwhiteboardlistener;
	ConfigNodePropertyString authsudocookie;
	ConfigNodePropertyString authsudoparameter;
	ConfigNodePropertyBoolean authannonymous;
	ConfigNodePropertyArray slingauthrequirements;
	ConfigNodePropertyString slingauthanonymoususer;
	ConfigNodePropertyString slingauthanonymouspassword;
	ConfigNodePropertyDropDown authhttp;
	ConfigNodePropertyString authhttprealm;
	ConfigNodePropertyArray authurisuffix;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties_H_ */
