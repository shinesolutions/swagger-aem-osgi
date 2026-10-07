
/*
 * ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties_H_


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

class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties();
    ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqpagesupdatehandlerimageresourcetypes();

	/*! \brief Set 
	 */
	void setCqpagesupdatehandlerimageresourcetypes(ConfigNodePropertyArray cqpagesupdatehandlerimageresourcetypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqpagesupdatehandlerproductresourcetypes();

	/*! \brief Set 
	 */
	void setCqpagesupdatehandlerproductresourcetypes(ConfigNodePropertyArray cqpagesupdatehandlerproductresourcetypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqpagesupdatehandlervideoresourcetypes();

	/*! \brief Set 
	 */
	void setCqpagesupdatehandlervideoresourcetypes(ConfigNodePropertyArray cqpagesupdatehandlervideoresourcetypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqpagesupdatehandlerdynamicsequenceresourcetypes();

	/*! \brief Set 
	 */
	void setCqpagesupdatehandlerdynamicsequenceresourcetypes(ConfigNodePropertyArray cqpagesupdatehandlerdynamicsequenceresourcetypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqpagesupdatehandlerpreviewmodepaths();

	/*! \brief Set 
	 */
	void setCqpagesupdatehandlerpreviewmodepaths(ConfigNodePropertyArray cqpagesupdatehandlerpreviewmodepaths);


    private:
    ConfigNodePropertyArray cqpagesupdatehandlerimageresourcetypes;
    ConfigNodePropertyArray cqpagesupdatehandlerproductresourcetypes;
    ConfigNodePropertyArray cqpagesupdatehandlervideoresourcetypes;
    ConfigNodePropertyArray cqpagesupdatehandlerdynamicsequenceresourcetypes;
    ConfigNodePropertyArray cqpagesupdatehandlerpreviewmodepaths;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties_H_ */
