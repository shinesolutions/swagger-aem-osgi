
/*
 * ComAdobeCqHistoryImplHistoryServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqHistoryImplHistoryServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqHistoryImplHistoryServiceImplProperties_H_


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

class ComAdobeCqHistoryImplHistoryServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqHistoryImplHistoryServiceImplProperties();
    ComAdobeCqHistoryImplHistoryServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqHistoryImplHistoryServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHistoryserviceresourceTypes();

	/*! \brief Set 
	 */
	void setHistoryserviceresourceTypes(ConfigNodePropertyArray historyserviceresourceTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHistoryservicepathFilter();

	/*! \brief Set 
	 */
	void setHistoryservicepathFilter(ConfigNodePropertyArray historyservicepathFilter);


    private:
    ConfigNodePropertyArray historyserviceresourceTypes;
    ConfigNodePropertyArray historyservicepathFilter;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqHistoryImplHistoryServiceImplProperties_H_ */
