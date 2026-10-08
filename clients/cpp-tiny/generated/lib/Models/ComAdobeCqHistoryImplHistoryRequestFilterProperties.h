
/*
 * ComAdobeCqHistoryImplHistoryRequestFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqHistoryImplHistoryRequestFilterProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqHistoryImplHistoryRequestFilterProperties_H_


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

class ComAdobeCqHistoryImplHistoryRequestFilterProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqHistoryImplHistoryRequestFilterProperties();
    ComAdobeCqHistoryImplHistoryRequestFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqHistoryImplHistoryRequestFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHistoryrequestFilterexcludedSelectors();

	/*! \brief Set 
	 */
	void setHistoryrequestFilterexcludedSelectors(ConfigNodePropertyArray historyrequestFilterexcludedSelectors);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHistoryrequestFilterexcludedExtensions();

	/*! \brief Set 
	 */
	void setHistoryrequestFilterexcludedExtensions(ConfigNodePropertyArray historyrequestFilterexcludedExtensions);


    private:
    ConfigNodePropertyArray historyrequestFilterexcludedSelectors;
    ConfigNodePropertyArray historyrequestFilterexcludedExtensions;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqHistoryImplHistoryRequestFilterProperties_H_ */
