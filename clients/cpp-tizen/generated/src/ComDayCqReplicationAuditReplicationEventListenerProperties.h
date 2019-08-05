/*
 * ComDayCqReplicationAuditReplicationEventListenerProperties.h
 *
 * 
 */

#ifndef _ComDayCqReplicationAuditReplicationEventListenerProperties_H_
#define _ComDayCqReplicationAuditReplicationEventListenerProperties_H_


#include <string>
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

class ComDayCqReplicationAuditReplicationEventListenerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqReplicationAuditReplicationEventListenerProperties();
	ComDayCqReplicationAuditReplicationEventListenerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqReplicationAuditReplicationEventListenerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger  serviceranking);

private:
	ConfigNodePropertyInteger serviceranking;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqReplicationAuditReplicationEventListenerProperties_H_ */
