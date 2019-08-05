/*
 * ComDayCqContentsyncImplContentSyncManagerImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqContentsyncImplContentSyncManagerImplProperties_H_
#define _ComDayCqContentsyncImplContentSyncManagerImplProperties_H_


#include <string>
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

class ComDayCqContentsyncImplContentSyncManagerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqContentsyncImplContentSyncManagerImplProperties();
	ComDayCqContentsyncImplContentSyncManagerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqContentsyncImplContentSyncManagerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getContentsyncfallbackauthorizable();

	/*! \brief Set 
	 */
	void setContentsyncfallbackauthorizable(ConfigNodePropertyString  contentsyncfallbackauthorizable);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getContentsyncfallbackupdateuser();

	/*! \brief Set 
	 */
	void setContentsyncfallbackupdateuser(ConfigNodePropertyString  contentsyncfallbackupdateuser);

private:
	ConfigNodePropertyString contentsyncfallbackauthorizable;
	ConfigNodePropertyString contentsyncfallbackupdateuser;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqContentsyncImplContentSyncManagerImplProperties_H_ */
