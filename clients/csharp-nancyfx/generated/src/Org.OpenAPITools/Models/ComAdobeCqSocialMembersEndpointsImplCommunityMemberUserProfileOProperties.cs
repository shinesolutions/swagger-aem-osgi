using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties
    /// </summary>
    public sealed class ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties:  IEquatable<ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties>
    { 
        /// <summary>
        /// FieldWhitelist
        /// </summary>
        public ConfigNodePropertyArray FieldWhitelist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties()
        {
        }

        private ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties(ConfigNodePropertyArray FieldWhitelist)
        {
            
            this.FieldWhitelist = FieldWhitelist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOPropertiesBuilder</returns>
        public static ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOPropertiesBuilder</returns>
        public ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOPropertiesBuilder With()
        {
            return Builder()
                .FieldWhitelist(FieldWhitelist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties left, ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties left, ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOPropertiesBuilder
        {
            private ConfigNodePropertyArray _FieldWhitelist;

            internal ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties.FieldWhitelist property.
            /// </summary>
            /// <param name="value">FieldWhitelist</param>
            public ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOPropertiesBuilder FieldWhitelist(ConfigNodePropertyArray value)
            {
                _FieldWhitelist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties</returns>
            public ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties(
                    FieldWhitelist: _FieldWhitelist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}