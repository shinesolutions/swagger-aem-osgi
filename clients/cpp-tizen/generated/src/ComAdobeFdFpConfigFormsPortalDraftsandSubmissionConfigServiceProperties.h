/*
 * ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.h
 *
 * 
 */

#ifndef _ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties_H_
#define _ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties();
	ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPortaloutboxes();

	/*! \brief Set 
	 */
	void setPortaloutboxes(ConfigNodePropertyArray  portaloutboxes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDraftdataservice();

	/*! \brief Set 
	 */
	void setDraftdataservice(ConfigNodePropertyString  draftdataservice);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDraftmetadataservice();

	/*! \brief Set 
	 */
	void setDraftmetadataservice(ConfigNodePropertyString  draftmetadataservice);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSubmitdataservice();

	/*! \brief Set 
	 */
	void setSubmitdataservice(ConfigNodePropertyString  submitdataservice);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSubmitmetadataservice();

	/*! \brief Set 
	 */
	void setSubmitmetadataservice(ConfigNodePropertyString  submitmetadataservice);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPendingSigndataservice();

	/*! \brief Set 
	 */
	void setPendingSigndataservice(ConfigNodePropertyString  pendingSigndataservice);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPendingSignmetadataservice();

	/*! \brief Set 
	 */
	void setPendingSignmetadataservice(ConfigNodePropertyString  pendingSignmetadataservice);

private:
	ConfigNodePropertyArray portaloutboxes;
	ConfigNodePropertyString draftdataservice;
	ConfigNodePropertyString draftmetadataservice;
	ConfigNodePropertyString submitdataservice;
	ConfigNodePropertyString submitmetadataservice;
	ConfigNodePropertyString pendingSigndataservice;
	ConfigNodePropertyString pendingSignmetadataservice;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties_H_ */
