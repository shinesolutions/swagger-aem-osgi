/*
 * ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties_H_
#define _ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties_H_


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

class ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties();
	ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getLiverelationshipmgrrelationsconfigdefault();

	/*! \brief Set 
	 */
	void setLiverelationshipmgrrelationsconfigdefault(ConfigNodePropertyString  liverelationshipmgrrelationsconfigdefault);

private:
	ConfigNodePropertyString liverelationshipmgrrelationsconfigdefault;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties_H_ */
