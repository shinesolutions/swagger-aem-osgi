/*
 * OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties_H_
#define _OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties_H_


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

class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties();
	OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaspercompilerTargetVM();

	/*! \brief Set 
	 */
	void setJaspercompilerTargetVM(ConfigNodePropertyString  jaspercompilerTargetVM);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJaspercompilerSourceVM();

	/*! \brief Set 
	 */
	void setJaspercompilerSourceVM(ConfigNodePropertyString  jaspercompilerSourceVM);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJasperclassdebuginfo();

	/*! \brief Set 
	 */
	void setJasperclassdebuginfo(ConfigNodePropertyBoolean  jasperclassdebuginfo);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJasperenablePooling();

	/*! \brief Set 
	 */
	void setJasperenablePooling(ConfigNodePropertyBoolean  jasperenablePooling);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJasperieClassId();

	/*! \brief Set 
	 */
	void setJasperieClassId(ConfigNodePropertyString  jasperieClassId);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJaspergenStringAsCharArray();

	/*! \brief Set 
	 */
	void setJaspergenStringAsCharArray(ConfigNodePropertyBoolean  jaspergenStringAsCharArray);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJasperkeepgenerated();

	/*! \brief Set 
	 */
	void setJasperkeepgenerated(ConfigNodePropertyBoolean  jasperkeepgenerated);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJaspermappedfile();

	/*! \brief Set 
	 */
	void setJaspermappedfile(ConfigNodePropertyBoolean  jaspermappedfile);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJaspertrimSpaces();

	/*! \brief Set 
	 */
	void setJaspertrimSpaces(ConfigNodePropertyBoolean  jaspertrimSpaces);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getJasperdisplaySourceFragments();

	/*! \brief Set 
	 */
	void setJasperdisplaySourceFragments(ConfigNodePropertyBoolean  jasperdisplaySourceFragments);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDefaultissession();

	/*! \brief Set 
	 */
	void setDefaultissession(ConfigNodePropertyBoolean  defaultissession);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties_H_ */
