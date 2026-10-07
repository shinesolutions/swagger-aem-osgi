
/*
 * OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties();
    OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapacheslingscriptingsightlyjsbindings();

	/*! \brief Set 
	 */
	void setOrgapacheslingscriptingsightlyjsbindings(ConfigNodePropertyArray orgapacheslingscriptingsightlyjsbindings);


    private:
    ConfigNodePropertyArray orgapacheslingscriptingsightlyjsbindings;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties_H_ */
