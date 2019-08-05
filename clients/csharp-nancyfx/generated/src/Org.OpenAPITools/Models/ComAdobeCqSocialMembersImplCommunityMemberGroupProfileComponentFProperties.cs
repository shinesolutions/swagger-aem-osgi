using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties
    /// </summary>
    public sealed class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties:  IEquatable<ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties>
    { 
        /// <summary>
        /// EveryoneLimit
        /// </summary>
        public ConfigNodePropertyInteger EveryoneLimit { get; private set; }

        /// <summary>
        /// Priority
        /// </summary>
        public ConfigNodePropertyInteger Priority { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties()
        {
        }

        private ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties(ConfigNodePropertyInteger EveryoneLimit, ConfigNodePropertyInteger Priority)
        {
            
            this.EveryoneLimit = EveryoneLimit;
            
            this.Priority = Priority;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesBuilder</returns>
        public static ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesBuilder</returns>
        public ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesBuilder With()
        {
            return Builder()
                .EveryoneLimit(EveryoneLimit)
                .Priority(Priority);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties left, ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties left, ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesBuilder
        {
            private ConfigNodePropertyInteger _EveryoneLimit;
            private ConfigNodePropertyInteger _Priority;

            internal ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.EveryoneLimit property.
            /// </summary>
            /// <param name="value">EveryoneLimit</param>
            public ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesBuilder EveryoneLimit(ConfigNodePropertyInteger value)
            {
                _EveryoneLimit = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.Priority property.
            /// </summary>
            /// <param name="value">Priority</param>
            public ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesBuilder Priority(ConfigNodePropertyInteger value)
            {
                _Priority = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties</returns>
            public ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties(
                    EveryoneLimit: _EveryoneLimit,
                    Priority: _Priority
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}