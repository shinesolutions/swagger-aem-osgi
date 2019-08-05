/*
 * ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties_H_
#define _ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties_H_


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

class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties();
	ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPaths();

	/*! \brief Set 
	 */
	void setPaths(ConfigNodePropertyArray  paths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExcludedPaths();

	/*! \brief Set 
	 */
	void setExcludedPaths(ConfigNodePropertyArray  excludedPaths);

private:
	ConfigNodePropertyArray paths;
	ConfigNodePropertyArray excludedPaths;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties_H_ */
