
/*
 * OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties();
    OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapacheslingscriptingjavascriptrhinooptLevel();

	/*! \brief Set 
	 */
	void setOrgapacheslingscriptingjavascriptrhinooptLevel(ConfigNodePropertyInteger orgapacheslingscriptingjavascriptrhinooptLevel);


    private:
    ConfigNodePropertyInteger orgapacheslingscriptingjavascriptrhinooptLevel;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties_H_ */
