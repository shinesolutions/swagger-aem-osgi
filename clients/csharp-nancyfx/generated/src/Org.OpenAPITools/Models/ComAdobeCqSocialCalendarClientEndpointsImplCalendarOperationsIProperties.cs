using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties:  IEquatable<ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties>
    { 
        /// <summary>
        /// MaxRetry
        /// </summary>
        public ConfigNodePropertyInteger MaxRetry { get; private set; }

        /// <summary>
        /// FieldWhitelist
        /// </summary>
        public ConfigNodePropertyArray FieldWhitelist { get; private set; }

        /// <summary>
        /// AttachmentTypeBlacklist
        /// </summary>
        public ConfigNodePropertyArray AttachmentTypeBlacklist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties()
        {
        }

        private ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties(ConfigNodePropertyInteger MaxRetry, ConfigNodePropertyArray FieldWhitelist, ConfigNodePropertyArray AttachmentTypeBlacklist)
        {
            
            this.MaxRetry = MaxRetry;
            
            this.FieldWhitelist = FieldWhitelist;
            
            this.AttachmentTypeBlacklist = AttachmentTypeBlacklist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesBuilder</returns>
        public static ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesBuilder</returns>
        public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesBuilder With()
        {
            return Builder()
                .MaxRetry(MaxRetry)
                .FieldWhitelist(FieldWhitelist)
                .AttachmentTypeBlacklist(AttachmentTypeBlacklist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties left, ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties left, ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesBuilder
        {
            private ConfigNodePropertyInteger _MaxRetry;
            private ConfigNodePropertyArray _FieldWhitelist;
            private ConfigNodePropertyArray _AttachmentTypeBlacklist;

            internal ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.MaxRetry property.
            /// </summary>
            /// <param name="value">MaxRetry</param>
            public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesBuilder MaxRetry(ConfigNodePropertyInteger value)
            {
                _MaxRetry = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.FieldWhitelist property.
            /// </summary>
            /// <param name="value">FieldWhitelist</param>
            public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesBuilder FieldWhitelist(ConfigNodePropertyArray value)
            {
                _FieldWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.AttachmentTypeBlacklist property.
            /// </summary>
            /// <param name="value">AttachmentTypeBlacklist</param>
            public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesBuilder AttachmentTypeBlacklist(ConfigNodePropertyArray value)
            {
                _AttachmentTypeBlacklist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties</returns>
            public ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties(
                    MaxRetry: _MaxRetry,
                    FieldWhitelist: _FieldWhitelist,
                    AttachmentTypeBlacklist: _AttachmentTypeBlacklist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}