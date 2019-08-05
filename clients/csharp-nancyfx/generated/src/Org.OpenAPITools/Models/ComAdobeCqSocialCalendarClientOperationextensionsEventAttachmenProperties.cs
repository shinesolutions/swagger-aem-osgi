using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties:  IEquatable<ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties>
    { 
        /// <summary>
        /// AttachmentTypeBlacklist
        /// </summary>
        public ConfigNodePropertyString AttachmentTypeBlacklist { get; private set; }

        /// <summary>
        /// ExtensionOrder
        /// </summary>
        public ConfigNodePropertyInteger ExtensionOrder { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties()
        {
        }

        private ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties(ConfigNodePropertyString AttachmentTypeBlacklist, ConfigNodePropertyInteger ExtensionOrder)
        {
            
            this.AttachmentTypeBlacklist = AttachmentTypeBlacklist;
            
            this.ExtensionOrder = ExtensionOrder;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesBuilder</returns>
        public static ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesBuilder</returns>
        public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesBuilder With()
        {
            return Builder()
                .AttachmentTypeBlacklist(AttachmentTypeBlacklist)
                .ExtensionOrder(ExtensionOrder);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties left, ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties left, ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesBuilder
        {
            private ConfigNodePropertyString _AttachmentTypeBlacklist;
            private ConfigNodePropertyInteger _ExtensionOrder;

            internal ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.AttachmentTypeBlacklist property.
            /// </summary>
            /// <param name="value">AttachmentTypeBlacklist</param>
            public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesBuilder AttachmentTypeBlacklist(ConfigNodePropertyString value)
            {
                _AttachmentTypeBlacklist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.ExtensionOrder property.
            /// </summary>
            /// <param name="value">ExtensionOrder</param>
            public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesBuilder ExtensionOrder(ConfigNodePropertyInteger value)
            {
                _ExtensionOrder = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties</returns>
            public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties(
                    AttachmentTypeBlacklist: _AttachmentTypeBlacklist,
                    ExtensionOrder: _ExtensionOrder
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}