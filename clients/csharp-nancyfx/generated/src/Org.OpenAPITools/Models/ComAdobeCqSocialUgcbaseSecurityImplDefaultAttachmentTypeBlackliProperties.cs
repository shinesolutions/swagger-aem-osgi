using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties
    /// </summary>
    public sealed class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties:  IEquatable<ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties>
    { 
        /// <summary>
        /// DefaultAttachmentTypeBlacklist
        /// </summary>
        public ConfigNodePropertyArray DefaultAttachmentTypeBlacklist { get; private set; }

        /// <summary>
        /// BaselineAttachmentTypeBlacklist
        /// </summary>
        public ConfigNodePropertyArray BaselineAttachmentTypeBlacklist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties()
        {
        }

        private ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties(ConfigNodePropertyArray DefaultAttachmentTypeBlacklist, ConfigNodePropertyArray BaselineAttachmentTypeBlacklist)
        {
            
            this.DefaultAttachmentTypeBlacklist = DefaultAttachmentTypeBlacklist;
            
            this.BaselineAttachmentTypeBlacklist = BaselineAttachmentTypeBlacklist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesBuilder</returns>
        public static ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesBuilder</returns>
        public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesBuilder With()
        {
            return Builder()
                .DefaultAttachmentTypeBlacklist(DefaultAttachmentTypeBlacklist)
                .BaselineAttachmentTypeBlacklist(BaselineAttachmentTypeBlacklist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties left, ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties left, ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesBuilder
        {
            private ConfigNodePropertyArray _DefaultAttachmentTypeBlacklist;
            private ConfigNodePropertyArray _BaselineAttachmentTypeBlacklist;

            internal ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties.DefaultAttachmentTypeBlacklist property.
            /// </summary>
            /// <param name="value">DefaultAttachmentTypeBlacklist</param>
            public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesBuilder DefaultAttachmentTypeBlacklist(ConfigNodePropertyArray value)
            {
                _DefaultAttachmentTypeBlacklist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties.BaselineAttachmentTypeBlacklist property.
            /// </summary>
            /// <param name="value">BaselineAttachmentTypeBlacklist</param>
            public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesBuilder BaselineAttachmentTypeBlacklist(ConfigNodePropertyArray value)
            {
                _BaselineAttachmentTypeBlacklist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties</returns>
            public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties(
                    DefaultAttachmentTypeBlacklist: _DefaultAttachmentTypeBlacklist,
                    BaselineAttachmentTypeBlacklist: _BaselineAttachmentTypeBlacklist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}