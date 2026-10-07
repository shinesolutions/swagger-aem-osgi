/*
 * ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties_H_
#define _ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties_H_


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

class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties();
	ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getMessageproperties();

	/*! \brief Set 
	 */
	void setMessageproperties(ConfigNodePropertyArray  messageproperties);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMessageBoxSizeLimit();

	/*! \brief Set 
	 */
	void setMessageBoxSizeLimit(ConfigNodePropertyInteger  messageBoxSizeLimit);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMessageCountLimit();

	/*! \brief Set 
	 */
	void setMessageCountLimit(ConfigNodePropertyInteger  messageCountLimit);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getNotifyFailure();

	/*! \brief Set 
	 */
	void setNotifyFailure(ConfigNodePropertyBoolean  notifyFailure);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFailureMessageFrom();

	/*! \brief Set 
	 */
	void setFailureMessageFrom(ConfigNodePropertyString  failureMessageFrom);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFailureTemplatePath();

	/*! \brief Set 
	 */
	void setFailureTemplatePath(ConfigNodePropertyString  failureTemplatePath);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxRetries();

	/*! \brief Set 
	 */
	void setMaxRetries(ConfigNodePropertyInteger  maxRetries);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMinWaitBetweenRetries();

	/*! \brief Set 
	 */
	void setMinWaitBetweenRetries(ConfigNodePropertyInteger  minWaitBetweenRetries);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCountUpdatePoolSize();

	/*! \brief Set 
	 */
	void setCountUpdatePoolSize(ConfigNodePropertyInteger  countUpdatePoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getInboxpath();

	/*! \brief Set 
	 */
	void setInboxpath(ConfigNodePropertyString  inboxpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSentitemspath();

	/*! \brief Set 
	 */
	void setSentitemspath(ConfigNodePropertyString  sentitemspath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSupportAttachments();

	/*! \brief Set 
	 */
	void setSupportAttachments(ConfigNodePropertyBoolean  supportAttachments);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSupportGroupMessaging();

	/*! \brief Set 
	 */
	void setSupportGroupMessaging(ConfigNodePropertyBoolean  supportGroupMessaging);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxTotalRecipients();

	/*! \brief Set 
	 */
	void setMaxTotalRecipients(ConfigNodePropertyInteger  maxTotalRecipients);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getBatchSize();

	/*! \brief Set 
	 */
	void setBatchSize(ConfigNodePropertyInteger  batchSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxTotalAttachmentSize();

	/*! \brief Set 
	 */
	void setMaxTotalAttachmentSize(ConfigNodePropertyInteger  maxTotalAttachmentSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAttachmentTypeBlacklist();

	/*! \brief Set 
	 */
	void setAttachmentTypeBlacklist(ConfigNodePropertyArray  attachmentTypeBlacklist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAllowedAttachmentTypes();

	/*! \brief Set 
	 */
	void setAllowedAttachmentTypes(ConfigNodePropertyArray  allowedAttachmentTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceSelector();

	/*! \brief Set 
	 */
	void setServiceSelector(ConfigNodePropertyString  serviceSelector);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFieldWhitelist();

	/*! \brief Set 
	 */
	void setFieldWhitelist(ConfigNodePropertyArray  fieldWhitelist);

private:
	ConfigNodePropertyArray messageproperties;
	ConfigNodePropertyInteger messageBoxSizeLimit;
	ConfigNodePropertyInteger messageCountLimit;
	ConfigNodePropertyBoolean notifyFailure;
	ConfigNodePropertyString failureMessageFrom;
	ConfigNodePropertyString failureTemplatePath;
	ConfigNodePropertyInteger maxRetries;
	ConfigNodePropertyInteger minWaitBetweenRetries;
	ConfigNodePropertyInteger countUpdatePoolSize;
	ConfigNodePropertyString inboxpath;
	ConfigNodePropertyString sentitemspath;
	ConfigNodePropertyBoolean supportAttachments;
	ConfigNodePropertyBoolean supportGroupMessaging;
	ConfigNodePropertyInteger maxTotalRecipients;
	ConfigNodePropertyInteger batchSize;
	ConfigNodePropertyInteger maxTotalAttachmentSize;
	ConfigNodePropertyArray attachmentTypeBlacklist;
	ConfigNodePropertyArray allowedAttachmentTypes;
	ConfigNodePropertyString serviceSelector;
	ConfigNodePropertyArray fieldWhitelist;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties_H_ */
