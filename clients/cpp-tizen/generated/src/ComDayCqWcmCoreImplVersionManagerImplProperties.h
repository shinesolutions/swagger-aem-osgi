/*
 * ComDayCqWcmCoreImplVersionManagerImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplVersionManagerImplProperties_H_
#define _ComDayCqWcmCoreImplVersionManagerImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqWcmCoreImplVersionManagerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplVersionManagerImplProperties();
	ComDayCqWcmCoreImplVersionManagerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplVersionManagerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getVersionmanagercreateVersionOnActivation();

	/*! \brief Set 
	 */
	void setVersionmanagercreateVersionOnActivation(ConfigNodePropertyBoolean  versionmanagercreateVersionOnActivation);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getVersionmanagerpurgingEnabled();

	/*! \brief Set 
	 */
	void setVersionmanagerpurgingEnabled(ConfigNodePropertyBoolean  versionmanagerpurgingEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getVersionmanagerpurgePaths();

	/*! \brief Set 
	 */
	void setVersionmanagerpurgePaths(ConfigNodePropertyArray  versionmanagerpurgePaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getVersionmanagerivPaths();

	/*! \brief Set 
	 */
	void setVersionmanagerivPaths(ConfigNodePropertyArray  versionmanagerivPaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getVersionmanagermaxAgeDays();

	/*! \brief Set 
	 */
	void setVersionmanagermaxAgeDays(ConfigNodePropertyInteger  versionmanagermaxAgeDays);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getVersionmanagermaxNumberVersions();

	/*! \brief Set 
	 */
	void setVersionmanagermaxNumberVersions(ConfigNodePropertyInteger  versionmanagermaxNumberVersions);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getVersionmanagerminNumberVersions();

	/*! \brief Set 
	 */
	void setVersionmanagerminNumberVersions(ConfigNodePropertyInteger  versionmanagerminNumberVersions);

private:
	ConfigNodePropertyBoolean versionmanagercreateVersionOnActivation;
	ConfigNodePropertyBoolean versionmanagerpurgingEnabled;
	ConfigNodePropertyArray versionmanagerpurgePaths;
	ConfigNodePropertyArray versionmanagerivPaths;
	ConfigNodePropertyInteger versionmanagermaxAgeDays;
	ConfigNodePropertyInteger versionmanagermaxNumberVersions;
	ConfigNodePropertyInteger versionmanagerminNumberVersions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplVersionManagerImplProperties_H_ */
