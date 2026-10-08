
/*
 * OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties();
    OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardcontextselect();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardcontextselect(ConfigNodePropertyString osgihttpwhiteboardcontextselect);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardlistener();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardlistener(ConfigNodePropertyString osgihttpwhiteboardlistener);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthsudocookie();

	/*! \brief Set 
	 */
	void setAuthsudocookie(ConfigNodePropertyString authsudocookie);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthsudoparameter();

	/*! \brief Set 
	 */
	void setAuthsudoparameter(ConfigNodePropertyString authsudoparameter);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAuthannonymous();

	/*! \brief Set 
	 */
	void setAuthannonymous(ConfigNodePropertyBoolean authannonymous);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingauthrequirements();

	/*! \brief Set 
	 */
	void setSlingauthrequirements(ConfigNodePropertyArray slingauthrequirements);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingauthanonymoususer();

	/*! \brief Set 
	 */
	void setSlingauthanonymoususer(ConfigNodePropertyString slingauthanonymoususer);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingauthanonymouspassword();

	/*! \brief Set 
	 */
	void setSlingauthanonymouspassword(ConfigNodePropertyString slingauthanonymouspassword);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getAuthhttp();

	/*! \brief Set 
	 */
	void setAuthhttp(ConfigNodePropertyDropDown authhttp);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthhttprealm();

	/*! \brief Set 
	 */
	void setAuthhttprealm(ConfigNodePropertyString authhttprealm);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAuthurisuffix();

	/*! \brief Set 
	 */
	void setAuthurisuffix(ConfigNodePropertyArray authurisuffix);


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
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties_H_ */
