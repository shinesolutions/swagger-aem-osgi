/*
 * OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties_H_
#define _OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties();
	OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHandlerschemes();

	/*! \brief Set 
	 */
	void setHandlerschemes(ConfigNodePropertyArray  handlerschemes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingjcrinstallfoldernameregexp();

	/*! \brief Set 
	 */
	void setSlingjcrinstallfoldernameregexp(ConfigNodePropertyString  slingjcrinstallfoldernameregexp);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSlingjcrinstallfoldermaxdepth();

	/*! \brief Set 
	 */
	void setSlingjcrinstallfoldermaxdepth(ConfigNodePropertyInteger  slingjcrinstallfoldermaxdepth);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingjcrinstallsearchpath();

	/*! \brief Set 
	 */
	void setSlingjcrinstallsearchpath(ConfigNodePropertyArray  slingjcrinstallsearchpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingjcrinstallnewconfigpath();

	/*! \brief Set 
	 */
	void setSlingjcrinstallnewconfigpath(ConfigNodePropertyString  slingjcrinstallnewconfigpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingjcrinstallsignalpath();

	/*! \brief Set 
	 */
	void setSlingjcrinstallsignalpath(ConfigNodePropertyString  slingjcrinstallsignalpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSlingjcrinstallenablewriteback();

	/*! \brief Set 
	 */
	void setSlingjcrinstallenablewriteback(ConfigNodePropertyBoolean  slingjcrinstallenablewriteback);

private:
	ConfigNodePropertyArray handlerschemes;
	ConfigNodePropertyString slingjcrinstallfoldernameregexp;
	ConfigNodePropertyInteger slingjcrinstallfoldermaxdepth;
	ConfigNodePropertyArray slingjcrinstallsearchpath;
	ConfigNodePropertyString slingjcrinstallnewconfigpath;
	ConfigNodePropertyString slingjcrinstallsignalpath;
	ConfigNodePropertyBoolean slingjcrinstallenablewriteback;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties_H_ */
