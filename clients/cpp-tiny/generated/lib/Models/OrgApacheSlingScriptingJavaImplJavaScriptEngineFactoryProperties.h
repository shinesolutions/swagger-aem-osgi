
/*
 * OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties();
    OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJavaclassdebuginfo();

	/*! \brief Set 
	 */
	void setJavaclassdebuginfo(ConfigNodePropertyBoolean javaclassdebuginfo);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJavajavaEncoding();

	/*! \brief Set 
	 */
	void setJavajavaEncoding(ConfigNodePropertyString javajavaEncoding);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJavacompilerSourceVM();

	/*! \brief Set 
	 */
	void setJavacompilerSourceVM(ConfigNodePropertyString javacompilerSourceVM);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJavacompilerTargetVM();

	/*! \brief Set 
	 */
	void setJavacompilerTargetVM(ConfigNodePropertyString javacompilerTargetVM);


    private:
    ConfigNodePropertyBoolean javaclassdebuginfo;
    ConfigNodePropertyString javajavaEncoding;
    ConfigNodePropertyString javacompilerSourceVM;
    ConfigNodePropertyString javacompilerTargetVM;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties_H_ */
