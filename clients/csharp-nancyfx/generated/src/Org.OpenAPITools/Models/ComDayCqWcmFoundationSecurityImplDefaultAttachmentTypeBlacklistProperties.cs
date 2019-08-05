using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties
    /// </summary>
    public sealed class ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties:  IEquatable<ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties>
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
        /// Use ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties()
        {
        }

        private ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties(ConfigNodePropertyArray DefaultAttachmentTypeBlacklist, ConfigNodePropertyArray BaselineAttachmentTypeBlacklist)
        {
            
            this.DefaultAttachmentTypeBlacklist = DefaultAttachmentTypeBlacklist;
            
            this.BaselineAttachmentTypeBlacklist = BaselineAttachmentTypeBlacklist;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesBuilder</returns>
        public static ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesBuilder Builder()
        {
            return new ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesBuilder</returns>
        public ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesBuilder With()
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

        public bool Equals(ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties left, ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties left, ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties.
        /// </summary>
        public sealed class ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesBuilder
        {
            private ConfigNodePropertyArray _DefaultAttachmentTypeBlacklist;
            private ConfigNodePropertyArray _BaselineAttachmentTypeBlacklist;

            internal ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties.DefaultAttachmentTypeBlacklist property.
            /// </summary>
            /// <param name="value">DefaultAttachmentTypeBlacklist</param>
            public ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesBuilder DefaultAttachmentTypeBlacklist(ConfigNodePropertyArray value)
            {
                _DefaultAttachmentTypeBlacklist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties.BaselineAttachmentTypeBlacklist property.
            /// </summary>
            /// <param name="value">BaselineAttachmentTypeBlacklist</param>
            public ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesBuilder BaselineAttachmentTypeBlacklist(ConfigNodePropertyArray value)
            {
                _BaselineAttachmentTypeBlacklist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties</returns>
            public ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties Build()
            {
                Validate();
                return new ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties(
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