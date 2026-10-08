
/*
 * ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties_H_
#define TINY_CPP_CLIENT_ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties();
    ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEffectiveBundleListPath();

	/*! \brief Set 
	 */
	void setEffectiveBundleListPath(ConfigNodePropertyString effectiveBundleListPath);


    private:
    ConfigNodePropertyString effectiveBundleListPath;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties_H_ */
