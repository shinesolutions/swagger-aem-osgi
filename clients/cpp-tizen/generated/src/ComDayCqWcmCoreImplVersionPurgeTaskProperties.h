/*
 * ComDayCqWcmCoreImplVersionPurgeTaskProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplVersionPurgeTaskProperties_H_
#define _ComDayCqWcmCoreImplVersionPurgeTaskProperties_H_


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

class ComDayCqWcmCoreImplVersionPurgeTaskProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplVersionPurgeTaskProperties();
	ComDayCqWcmCoreImplVersionPurgeTaskProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplVersionPurgeTaskProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getVersionpurgepaths();

	/*! \brief Set 
	 */
	void setVersionpurgepaths(ConfigNodePropertyArray  versionpurgepaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getVersionpurgerecursive();

	/*! \brief Set 
	 */
	void setVersionpurgerecursive(ConfigNodePropertyBoolean  versionpurgerecursive);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getVersionpurgemaxVersions();

	/*! \brief Set 
	 */
	void setVersionpurgemaxVersions(ConfigNodePropertyInteger  versionpurgemaxVersions);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getVersionpurgeminVersions();

	/*! \brief Set 
	 */
	void setVersionpurgeminVersions(ConfigNodePropertyInteger  versionpurgeminVersions);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getVersionpurgemaxAgeDays();

	/*! \brief Set 
	 */
	void setVersionpurgemaxAgeDays(ConfigNodePropertyInteger  versionpurgemaxAgeDays);

private:
	ConfigNodePropertyArray versionpurgepaths;
	ConfigNodePropertyBoolean versionpurgerecursive;
	ConfigNodePropertyInteger versionpurgemaxVersions;
	ConfigNodePropertyInteger versionpurgeminVersions;
	ConfigNodePropertyInteger versionpurgemaxAgeDays;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplVersionPurgeTaskProperties_H_ */
