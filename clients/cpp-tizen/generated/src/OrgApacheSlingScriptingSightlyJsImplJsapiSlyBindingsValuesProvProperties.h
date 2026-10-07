/*
 * OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties_H_
#define _OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties();
	OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapacheslingscriptingsightlyjsbindings();

	/*! \brief Set 
	 */
	void setOrgapacheslingscriptingsightlyjsbindings(ConfigNodePropertyArray  orgapacheslingscriptingsightlyjsbindings);

private:
	ConfigNodePropertyArray orgapacheslingscriptingsightlyjsbindings;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties_H_ */
