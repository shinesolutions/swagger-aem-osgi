
/*
 * ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties_H_
#define TINY_CPP_CLIENT_ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties();
    ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPortaloutboxes();

	/*! \brief Set 
	 */
	void setPortaloutboxes(ConfigNodePropertyArray portaloutboxes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDraftdataservice();

	/*! \brief Set 
	 */
	void setDraftdataservice(ConfigNodePropertyString draftdataservice);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDraftmetadataservice();

	/*! \brief Set 
	 */
	void setDraftmetadataservice(ConfigNodePropertyString draftmetadataservice);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSubmitdataservice();

	/*! \brief Set 
	 */
	void setSubmitdataservice(ConfigNodePropertyString submitdataservice);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSubmitmetadataservice();

	/*! \brief Set 
	 */
	void setSubmitmetadataservice(ConfigNodePropertyString submitmetadataservice);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPendingSigndataservice();

	/*! \brief Set 
	 */
	void setPendingSigndataservice(ConfigNodePropertyString pendingSigndataservice);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPendingSignmetadataservice();

	/*! \brief Set 
	 */
	void setPendingSignmetadataservice(ConfigNodePropertyString pendingSignmetadataservice);


    private:
    ConfigNodePropertyArray portaloutboxes;
    ConfigNodePropertyString draftdataservice;
    ConfigNodePropertyString draftmetadataservice;
    ConfigNodePropertyString submitdataservice;
    ConfigNodePropertyString submitmetadataservice;
    ConfigNodePropertyString pendingSigndataservice;
    ConfigNodePropertyString pendingSignmetadataservice;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties_H_ */
