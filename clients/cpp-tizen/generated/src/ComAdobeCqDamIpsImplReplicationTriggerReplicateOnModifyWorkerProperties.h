/*
 * ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties_H_
#define _ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties();
	ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDmreplicateonmodifyenabled();

	/*! \brief Set 
	 */
	void setDmreplicateonmodifyenabled(ConfigNodePropertyBoolean  dmreplicateonmodifyenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDmreplicateonmodifyforcesyncdeletes();

	/*! \brief Set 
	 */
	void setDmreplicateonmodifyforcesyncdeletes(ConfigNodePropertyBoolean  dmreplicateonmodifyforcesyncdeletes);

private:
	ConfigNodePropertyBoolean dmreplicateonmodifyenabled;
	ConfigNodePropertyBoolean dmreplicateonmodifyforcesyncdeletes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties_H_ */
