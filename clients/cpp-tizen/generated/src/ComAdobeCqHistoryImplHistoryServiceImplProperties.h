/*
 * ComAdobeCqHistoryImplHistoryServiceImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqHistoryImplHistoryServiceImplProperties_H_
#define _ComAdobeCqHistoryImplHistoryServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeCqHistoryImplHistoryServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqHistoryImplHistoryServiceImplProperties();
	ComAdobeCqHistoryImplHistoryServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqHistoryImplHistoryServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHistoryserviceresourceTypes();

	/*! \brief Set 
	 */
	void setHistoryserviceresourceTypes(ConfigNodePropertyArray  historyserviceresourceTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHistoryservicepathFilter();

	/*! \brief Set 
	 */
	void setHistoryservicepathFilter(ConfigNodePropertyArray  historyservicepathFilter);

private:
	ConfigNodePropertyArray historyserviceresourceTypes;
	ConfigNodePropertyArray historyservicepathFilter;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqHistoryImplHistoryServiceImplProperties_H_ */
