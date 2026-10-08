
/*
 * ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties();
    ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getExtensionorder();

	/*! \brief Set 
	 */
	void setExtensionorder(ConfigNodePropertyInteger extensionorder);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFlushforumontopic();

	/*! \brief Set 
	 */
	void setFlushforumontopic(ConfigNodePropertyBoolean flushforumontopic);


    private:
    ConfigNodePropertyInteger extensionorder;
    ConfigNodePropertyBoolean flushforumontopic;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties_H_ */
