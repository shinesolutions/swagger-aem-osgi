/*
 * ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties_H_
#define _ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties_H_


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

class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties();
	ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPoolSize();

	/*! \brief Set 
	 */
	void setPoolSize(ConfigNodePropertyInteger  poolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxPoolSize();

	/*! \brief Set 
	 */
	void setMaxPoolSize(ConfigNodePropertyInteger  maxPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueueSize();

	/*! \brief Set 
	 */
	void setQueueSize(ConfigNodePropertyInteger  queueSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getKeepAliveTime();

	/*! \brief Set 
	 */
	void setKeepAliveTime(ConfigNodePropertyInteger  keepAliveTime);

private:
	ConfigNodePropertyInteger poolSize;
	ConfigNodePropertyInteger maxPoolSize;
	ConfigNodePropertyInteger queueSize;
	ConfigNodePropertyInteger keepAliveTime;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties_H_ */
