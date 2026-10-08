
/*
 * ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties_H_
#define TINY_CPP_CLIENT_ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties();
    ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCodeupgradetasks();

	/*! \brief Set 
	 */
	void setCodeupgradetasks(ConfigNodePropertyArray codeupgradetasks);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCodeupgradetaskfilters();

	/*! \brief Set 
	 */
	void setCodeupgradetaskfilters(ConfigNodePropertyArray codeupgradetaskfilters);


    private:
    ConfigNodePropertyArray codeupgradetasks;
    ConfigNodePropertyArray codeupgradetaskfilters;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties_H_ */
