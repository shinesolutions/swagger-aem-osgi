/*
 * ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties_H_
#define _ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties_H_


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

class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties();
	ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getThreadPoolSize();

	/*! \brief Set 
	 */
	void setThreadPoolSize(ConfigNodePropertyInteger  threadPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDelayTime();

	/*! \brief Set 
	 */
	void setDelayTime(ConfigNodePropertyInteger  delayTime);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getWorkerSleepTime();

	/*! \brief Set 
	 */
	void setWorkerSleepTime(ConfigNodePropertyInteger  workerSleepTime);

private:
	ConfigNodePropertyInteger threadPoolSize;
	ConfigNodePropertyInteger delayTime;
	ConfigNodePropertyInteger workerSleepTime;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties_H_ */
