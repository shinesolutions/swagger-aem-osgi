
/*
 * ComDayCqWcmMsmImplRolloutManagerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmMsmImplRolloutManagerImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmMsmImplRolloutManagerImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmMsmImplRolloutManagerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmMsmImplRolloutManagerImplProperties();
    ComDayCqWcmMsmImplRolloutManagerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmMsmImplRolloutManagerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventfilter();

	/*! \brief Set 
	 */
	void setEventfilter(ConfigNodePropertyString eventfilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getRolloutmgrexcludedpropsdefault();

	/*! \brief Set 
	 */
	void setRolloutmgrexcludedpropsdefault(ConfigNodePropertyArray rolloutmgrexcludedpropsdefault);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getRolloutmgrexcludedparagraphpropsdefault();

	/*! \brief Set 
	 */
	void setRolloutmgrexcludedparagraphpropsdefault(ConfigNodePropertyArray rolloutmgrexcludedparagraphpropsdefault);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getRolloutmgrexcludednodetypesdefault();

	/*! \brief Set 
	 */
	void setRolloutmgrexcludednodetypesdefault(ConfigNodePropertyArray rolloutmgrexcludednodetypesdefault);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRolloutmgrthreadpoolmaxsize();

	/*! \brief Set 
	 */
	void setRolloutmgrthreadpoolmaxsize(ConfigNodePropertyInteger rolloutmgrthreadpoolmaxsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRolloutmgrthreadpoolmaxshutdowntime();

	/*! \brief Set 
	 */
	void setRolloutmgrthreadpoolmaxshutdowntime(ConfigNodePropertyInteger rolloutmgrthreadpoolmaxshutdowntime);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getRolloutmgrthreadpoolpriority();

	/*! \brief Set 
	 */
	void setRolloutmgrthreadpoolpriority(ConfigNodePropertyDropDown rolloutmgrthreadpoolpriority);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRolloutmgrcommitsize();

	/*! \brief Set 
	 */
	void setRolloutmgrcommitsize(ConfigNodePropertyInteger rolloutmgrcommitsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRolloutmgrconflicthandlingenabled();

	/*! \brief Set 
	 */
	void setRolloutmgrconflicthandlingenabled(ConfigNodePropertyBoolean rolloutmgrconflicthandlingenabled);


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
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmMsmImplRolloutManagerImplProperties_H_ */
