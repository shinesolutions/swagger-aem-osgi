
/*
 * ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties();
    ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties();


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
	ConfigNodePropertyInteger getMinThreadPoolSize();

	/*! \brief Set 
	 */
	void setMinThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxThreadPoolSize();

	/*! \brief Set 
	 */
	void setMaxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqwcmworkflowterminateonactivate();

	/*! \brief Set 
	 */
	void setCqwcmworkflowterminateonactivate(ConfigNodePropertyBoolean cqwcmworkflowterminateonactivate);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqwcmworklfowterminateexclusionlist();

	/*! \brief Set 
	 */
	void setCqwcmworklfowterminateexclusionlist(ConfigNodePropertyArray cqwcmworklfowterminateexclusionlist);


    private:
    ConfigNodePropertyString eventfilter;
    ConfigNodePropertyInteger minThreadPoolSize;
    ConfigNodePropertyInteger maxThreadPoolSize;
    ConfigNodePropertyBoolean cqwcmworkflowterminateonactivate;
    ConfigNodePropertyArray cqwcmworklfowterminateexclusionlist;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties_H_ */
