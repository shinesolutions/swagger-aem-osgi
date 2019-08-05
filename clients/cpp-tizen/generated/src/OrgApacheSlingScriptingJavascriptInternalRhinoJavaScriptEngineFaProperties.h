/*
 * OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties_H_
#define _OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties();
	OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapacheslingscriptingjavascriptrhinooptLevel();

	/*! \brief Set 
	 */
	void setOrgapacheslingscriptingjavascriptrhinooptLevel(ConfigNodePropertyInteger  orgapacheslingscriptingjavascriptrhinooptLevel);

private:
	ConfigNodePropertyInteger orgapacheslingscriptingjavascriptrhinooptLevel;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties_H_ */
