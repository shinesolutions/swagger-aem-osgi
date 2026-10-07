/*
 * OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties_H_
#define _OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties_H_


#include <string>
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

class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties();
	OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJavaclassdebuginfo();

	/*! \brief Set 
	 */
	void setJavaclassdebuginfo(ConfigNodePropertyBoolean  javaclassdebuginfo);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJavajavaEncoding();

	/*! \brief Set 
	 */
	void setJavajavaEncoding(ConfigNodePropertyString  javajavaEncoding);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJavacompilerSourceVM();

	/*! \brief Set 
	 */
	void setJavacompilerSourceVM(ConfigNodePropertyString  javacompilerSourceVM);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJavacompilerTargetVM();

	/*! \brief Set 
	 */
	void setJavacompilerTargetVM(ConfigNodePropertyString  javacompilerTargetVM);

private:
	ConfigNodePropertyBoolean javaclassdebuginfo;
	ConfigNodePropertyString javajavaEncoding;
	ConfigNodePropertyString javacompilerSourceVM;
	ConfigNodePropertyString javacompilerTargetVM;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties_H_ */
