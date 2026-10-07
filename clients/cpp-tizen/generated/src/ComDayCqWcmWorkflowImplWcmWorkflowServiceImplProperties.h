/*
 * ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties_H_
#define _ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties();
	ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties();

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
	ConfigNodePropertyInteger getMinThreadPoolSize();

	/*! \brief Set 
	 */
	void setMinThreadPoolSize(ConfigNodePropertyInteger  minThreadPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxThreadPoolSize();

	/*! \brief Set 
	 */
	void setMaxThreadPoolSize(ConfigNodePropertyInteger  maxThreadPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqwcmworkflowterminateonactivate();

	/*! \brief Set 
	 */
	void setCqwcmworkflowterminateonactivate(ConfigNodePropertyBoolean  cqwcmworkflowterminateonactivate);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqwcmworklfowterminateexclusionlist();

	/*! \brief Set 
	 */
	void setCqwcmworklfowterminateexclusionlist(ConfigNodePropertyArray  cqwcmworklfowterminateexclusionlist);

private:
	ConfigNodePropertyString eventfilter;
	ConfigNodePropertyInteger minThreadPoolSize;
	ConfigNodePropertyInteger maxThreadPoolSize;
	ConfigNodePropertyBoolean cqwcmworkflowterminateonactivate;
	ConfigNodePropertyArray cqwcmworklfowterminateexclusionlist;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties_H_ */
