/*
 * ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties_H_
#define _ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties_H_


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

class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties();
	ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getReplicationcontentuseFileStorage();

	/*! \brief Set 
	 */
	void setReplicationcontentuseFileStorage(ConfigNodePropertyBoolean  replicationcontentuseFileStorage);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getReplicationcontentmaxCommitAttempts();

	/*! \brief Set 
	 */
	void setReplicationcontentmaxCommitAttempts(ConfigNodePropertyInteger  replicationcontentmaxCommitAttempts);

private:
	ConfigNodePropertyBoolean replicationcontentuseFileStorage;
	ConfigNodePropertyInteger replicationcontentmaxCommitAttempts;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties_H_ */
