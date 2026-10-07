/*
 * ComAdobeCqHistoryImplHistoryRequestFilterProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqHistoryImplHistoryRequestFilterProperties_H_
#define _ComAdobeCqHistoryImplHistoryRequestFilterProperties_H_


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

class ComAdobeCqHistoryImplHistoryRequestFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqHistoryImplHistoryRequestFilterProperties();
	ComAdobeCqHistoryImplHistoryRequestFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqHistoryImplHistoryRequestFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHistoryrequestFilterexcludedSelectors();

	/*! \brief Set 
	 */
	void setHistoryrequestFilterexcludedSelectors(ConfigNodePropertyArray  historyrequestFilterexcludedSelectors);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHistoryrequestFilterexcludedExtensions();

	/*! \brief Set 
	 */
	void setHistoryrequestFilterexcludedExtensions(ConfigNodePropertyArray  historyrequestFilterexcludedExtensions);

private:
	ConfigNodePropertyArray historyrequestFilterexcludedSelectors;
	ConfigNodePropertyArray historyrequestFilterexcludedExtensions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqHistoryImplHistoryRequestFilterProperties_H_ */
