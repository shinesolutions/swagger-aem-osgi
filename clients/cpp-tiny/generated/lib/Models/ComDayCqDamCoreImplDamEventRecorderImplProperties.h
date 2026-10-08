
/*
 * ComDayCqDamCoreImplDamEventRecorderImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplDamEventRecorderImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplDamEventRecorderImplProperties_H_


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

class ComDayCqDamCoreImplDamEventRecorderImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplDamEventRecorderImplProperties();
    ComDayCqDamCoreImplDamEventRecorderImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplDamEventRecorderImplProperties();


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
	ConfigNodePropertyInteger getEventqueuelength();

	/*! \brief Set 
	 */
	void setEventqueuelength(ConfigNodePropertyInteger eventqueuelength);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEventrecorderenabled();

	/*! \brief Set 
	 */
	void setEventrecorderenabled(ConfigNodePropertyBoolean eventrecorderenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getEventrecorderblacklist();

	/*! \brief Set 
	 */
	void setEventrecorderblacklist(ConfigNodePropertyArray eventrecorderblacklist);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getEventrecordereventtypes();

	/*! \brief Set 
	 */
	void setEventrecordereventtypes(ConfigNodePropertyDropDown eventrecordereventtypes);


    private:
    ConfigNodePropertyString eventfilter;
    ConfigNodePropertyInteger eventqueuelength;
    ConfigNodePropertyBoolean eventrecorderenabled;
    ConfigNodePropertyArray eventrecorderblacklist;
    ConfigNodePropertyDropDown eventrecordereventtypes;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplDamEventRecorderImplProperties_H_ */
