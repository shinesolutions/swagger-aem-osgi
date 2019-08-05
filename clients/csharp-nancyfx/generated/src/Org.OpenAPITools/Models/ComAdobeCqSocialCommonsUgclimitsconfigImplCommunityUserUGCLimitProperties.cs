using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties:  IEquatable<ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties>
    { 
        /// <summary>
        /// Enable
        /// </summary>
        public ConfigNodePropertyBoolean Enable { get; private set; }

        /// <summary>
        /// UGCLimit
        /// </summary>
        public ConfigNodePropertyInteger UGCLimit { get; private set; }

        /// <summary>
        /// UgcLimitDuration
        /// </summary>
        public ConfigNodePropertyInteger UgcLimitDuration { get; private set; }

        /// <summary>
        /// Domains
        /// </summary>
        public ConfigNodePropertyArray Domains { get; private set; }

        /// <summary>
        /// ToList
        /// </summary>
        public ConfigNodePropertyArray ToList { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties()
        {
        }

        private ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties(ConfigNodePropertyBoolean Enable, ConfigNodePropertyInteger UGCLimit, ConfigNodePropertyInteger UgcLimitDuration, ConfigNodePropertyArray Domains, ConfigNodePropertyArray ToList)
        {
            
            this.Enable = Enable;
            
            this.UGCLimit = UGCLimit;
            
            this.UgcLimitDuration = UgcLimitDuration;
            
            this.Domains = Domains;
            
            this.ToList = ToList;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder With()
        {
            return Builder()
                .Enable(Enable)
                .UGCLimit(UGCLimit)
                .UgcLimitDuration(UgcLimitDuration)
                .Domains(Domains)
                .ToList(ToList);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties left, ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties left, ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enable;
            private ConfigNodePropertyInteger _UGCLimit;
            private ConfigNodePropertyInteger _UgcLimitDuration;
            private ConfigNodePropertyArray _Domains;
            private ConfigNodePropertyArray _ToList;

            internal ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.Enable property.
            /// </summary>
            /// <param name="value">Enable</param>
            public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder Enable(ConfigNodePropertyBoolean value)
            {
                _Enable = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.UGCLimit property.
            /// </summary>
            /// <param name="value">UGCLimit</param>
            public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder UGCLimit(ConfigNodePropertyInteger value)
            {
                _UGCLimit = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.UgcLimitDuration property.
            /// </summary>
            /// <param name="value">UgcLimitDuration</param>
            public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder UgcLimitDuration(ConfigNodePropertyInteger value)
            {
                _UgcLimitDuration = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.Domains property.
            /// </summary>
            /// <param name="value">Domains</param>
            public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder Domains(ConfigNodePropertyArray value)
            {
                _Domains = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.ToList property.
            /// </summary>
            /// <param name="value">ToList</param>
            public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesBuilder ToList(ConfigNodePropertyArray value)
            {
                _ToList = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties</returns>
            public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties(
                    Enable: _Enable,
                    UGCLimit: _UGCLimit,
                    UgcLimitDuration: _UgcLimitDuration,
                    Domains: _Domains,
                    ToList: _ToList
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}