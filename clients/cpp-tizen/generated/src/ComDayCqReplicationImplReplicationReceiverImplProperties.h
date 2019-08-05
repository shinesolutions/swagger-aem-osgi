/*
 * ComDayCqReplicationImplReplicationReceiverImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqReplicationImplReplicationReceiverImplProperties_H_
#define _ComDayCqReplicationImplReplicationReceiverImplProperties_H_


#include <string>
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

class ComDayCqReplicationImplReplicationReceiverImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqReplicationImplReplicationReceiverImplProperties();
	ComDayCqReplicationImplReplicationReceiverImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqReplicationImplReplicationReceiverImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getReceivertmpfilethreshold();

	/*! \brief Set 
	 */
	void setReceivertmpfilethreshold(ConfigNodePropertyInteger  receivertmpfilethreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getReceiverpackagesuseinstall();

	/*! \brief Set 
	 */
	void setReceiverpackagesuseinstall(ConfigNodePropertyBoolean  receiverpackagesuseinstall);

private:
	ConfigNodePropertyInteger receivertmpfilethreshold;
	ConfigNodePropertyBoolean receiverpackagesuseinstall;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqReplicationImplReplicationReceiverImplProperties_H_ */
