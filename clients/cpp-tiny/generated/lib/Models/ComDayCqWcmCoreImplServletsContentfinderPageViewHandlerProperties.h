
/*
 * ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties();
    ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getGuessTotal();

	/*! \brief Set 
	 */
	void setGuessTotal(ConfigNodePropertyString guessTotal);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getTagTitleSearch();

	/*! \brief Set 
	 */
	void setTagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch);


    private:
    ConfigNodePropertyString guessTotal;
    ConfigNodePropertyBoolean tagTitleSearch;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties_H_ */
