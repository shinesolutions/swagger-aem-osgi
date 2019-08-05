/*
 * ComDayCqWcmMsmImplRolloutManagerImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmMsmImplRolloutManagerImplProperties_H_
#define _ComDayCqWcmMsmImplRolloutManagerImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
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

class ComDayCqWcmMsmImplRolloutManagerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmMsmImplRolloutManagerImplProperties();
	ComDayCqWcmMsmImplRolloutManagerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmMsmImplRolloutManagerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventfilter();

	/*! \brief Set 
	 */
	void setEventfilter(ConfigNodePropertyString  eventfilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getRolloutmgrexcludedpropsdefault();

	/*! \brief Set 
	 */
	void setRolloutmgrexcludedpropsdefault(ConfigNodePropertyArray  rolloutmgrexcludedpropsdefault);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getRolloutmgrexcludedparagraphpropsdefault();

	/*! \brief Set 
	 */
	void setRolloutmgrexcludedparagraphpropsdefault(ConfigNodePropertyArray  rolloutmgrexcludedparagraphpropsdefault);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getRolloutmgrexcludednodetypesdefault();

	/*! \brief Set 
	 */
	void setRolloutmgrexcludednodetypesdefault(ConfigNodePropertyArray  rolloutmgrexcludednodetypesdefault);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRolloutmgrthreadpoolmaxsize();

	/*! \brief Set 
	 */
	void setRolloutmgrthreadpoolmaxsize(ConfigNodePropertyInteger  rolloutmgrthreadpoolmaxsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRolloutmgrthreadpoolmaxshutdowntime();

	/*! \brief Set 
	 */
	void setRolloutmgrthreadpoolmaxshutdowntime(ConfigNodePropertyInteger  rolloutmgrthreadpoolmaxshutdowntime);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getRolloutmgrthreadpoolpriority();

	/*! \brief Set 
	 */
	void setRolloutmgrthreadpoolpriority(ConfigNodePropertyDropDown  rolloutmgrthreadpoolpriority);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRolloutmgrcommitsize();

	/*! \brief Set 
	 */
	void setRolloutmgrcommitsize(ConfigNodePropertyInteger  rolloutmgrcommitsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRolloutmgrconflicthandlingenabled();

	/*! \brief Set 
	 */
	void setRolloutmgrconflicthandlingenabled(ConfigNodePropertyBoolean  rolloutmgrconflicthandlingenabled);

private:
	ConfigNodePropertyString eventfilter;
	ConfigNodePropertyArray rolloutmgrexcludedpropsdefault;
	ConfigNodePropertyArray rolloutmgrexcludedparagraphpropsdefault;
	ConfigNodePropertyArray rolloutmgrexcludednodetypesdefault;
	ConfigNodePropertyInteger rolloutmgrthreadpoolmaxsize;
	ConfigNodePropertyInteger rolloutmgrthreadpoolmaxshutdowntime;
	ConfigNodePropertyDropDown rolloutmgrthreadpoolpriority;
	ConfigNodePropertyInteger rolloutmgrcommitsize;
	ConfigNodePropertyBoolean rolloutmgrconflicthandlingenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmMsmImplRolloutManagerImplProperties_H_ */
