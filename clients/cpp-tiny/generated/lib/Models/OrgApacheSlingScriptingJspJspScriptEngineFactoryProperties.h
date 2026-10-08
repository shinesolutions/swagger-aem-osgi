
/*
 * OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties_H_


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

class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties();
    OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaspercompilerTargetVM();

	/*! \brief Set 
	 */
	void setJaspercompilerTargetVM(ConfigNodePropertyString jaspercompilerTargetVM);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaspercompilerSourceVM();

	/*! \brief Set 
	 */
	void setJaspercompilerSourceVM(ConfigNodePropertyString jaspercompilerSourceVM);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJasperclassdebuginfo();

	/*! \brief Set 
	 */
	void setJasperclassdebuginfo(ConfigNodePropertyBoolean jasperclassdebuginfo);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJasperenablePooling();

	/*! \brief Set 
	 */
	void setJasperenablePooling(ConfigNodePropertyBoolean jasperenablePooling);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJasperieClassId();

	/*! \brief Set 
	 */
	void setJasperieClassId(ConfigNodePropertyString jasperieClassId);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJaspergenStringAsCharArray();

	/*! \brief Set 
	 */
	void setJaspergenStringAsCharArray(ConfigNodePropertyBoolean jaspergenStringAsCharArray);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJasperkeepgenerated();

	/*! \brief Set 
	 */
	void setJasperkeepgenerated(ConfigNodePropertyBoolean jasperkeepgenerated);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJaspermappedfile();

	/*! \brief Set 
	 */
	void setJaspermappedfile(ConfigNodePropertyBoolean jaspermappedfile);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJaspertrimSpaces();

	/*! \brief Set 
	 */
	void setJaspertrimSpaces(ConfigNodePropertyBoolean jaspertrimSpaces);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJasperdisplaySourceFragments();

	/*! \brief Set 
	 */
	void setJasperdisplaySourceFragments(ConfigNodePropertyBoolean jasperdisplaySourceFragments);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDefaultissession();

	/*! \brief Set 
	 */
	void setDefaultissession(ConfigNodePropertyBoolean defaultissession);


    private:
    ConfigNodePropertyString jaspercompilerTargetVM;
    ConfigNodePropertyString jaspercompilerSourceVM;
    ConfigNodePropertyBoolean jasperclassdebuginfo;
    ConfigNodePropertyBoolean jasperenablePooling;
    ConfigNodePropertyString jasperieClassId;
    ConfigNodePropertyBoolean jaspergenStringAsCharArray;
    ConfigNodePropertyBoolean jasperkeepgenerated;
    ConfigNodePropertyBoolean jaspermappedfile;
    ConfigNodePropertyBoolean jaspertrimSpaces;
    ConfigNodePropertyBoolean jasperdisplaySourceFragments;
    ConfigNodePropertyBoolean defaultissession;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties_H_ */
