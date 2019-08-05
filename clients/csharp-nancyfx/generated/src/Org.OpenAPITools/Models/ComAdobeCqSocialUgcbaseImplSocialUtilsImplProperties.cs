using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties:  IEquatable<ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties>
    { 
        /// <summary>
        /// LegacyCloudUGCPathMapping
        /// </summary>
        public ConfigNodePropertyBoolean LegacyCloudUGCPathMapping { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties()
        {
        }

        private ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties(ConfigNodePropertyBoolean LegacyCloudUGCPathMapping)
        {
            
            this.LegacyCloudUGCPathMapping = LegacyCloudUGCPathMapping;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesBuilder</returns>
        public ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesBuilder With()
        {
            return Builder()
                .LegacyCloudUGCPathMapping(LegacyCloudUGCPathMapping);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties left, ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties left, ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _LegacyCloudUGCPathMapping;

            internal ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.LegacyCloudUGCPathMapping property.
            /// </summary>
            /// <param name="value">LegacyCloudUGCPathMapping</param>
            public ComAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesBuilder LegacyCloudUGCPathMapping(ConfigNodePropertyBoolean value)
            {
                _LegacyCloudUGCPathMapping = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties</returns>
            public ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties(
                    LegacyCloudUGCPathMapping: _LegacyCloudUGCPathMapping
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}