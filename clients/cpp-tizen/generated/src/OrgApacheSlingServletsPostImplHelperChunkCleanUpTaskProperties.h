/*
 * OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties_H_
#define _OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties_H_


#include <string>
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

class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties();
	OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString  schedulerexpression);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSchedulerconcurrent();

	/*! \brief Set 
	 */
	void setSchedulerconcurrent(ConfigNodePropertyBoolean  schedulerconcurrent);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getChunkcleanupage();

	/*! \brief Set 
	 */
	void setChunkcleanupage(ConfigNodePropertyInteger  chunkcleanupage);

private:
	ConfigNodePropertyString schedulerexpression;
	ConfigNodePropertyBoolean schedulerconcurrent;
	ConfigNodePropertyInteger chunkcleanupage;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties_H_ */
