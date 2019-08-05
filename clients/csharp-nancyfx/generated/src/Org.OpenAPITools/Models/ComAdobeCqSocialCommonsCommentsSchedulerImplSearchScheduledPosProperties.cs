using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties
    /// </summary>
    public sealed class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties:  IEquatable<ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties>
    { 
        /// <summary>
        /// EnableScheduledPostsSearch
        /// </summary>
        public ConfigNodePropertyBoolean EnableScheduledPostsSearch { get; private set; }

        /// <summary>
        /// NumberOfMinutes
        /// </summary>
        public ConfigNodePropertyInteger NumberOfMinutes { get; private set; }

        /// <summary>
        /// MaxSearchLimit
        /// </summary>
        public ConfigNodePropertyInteger MaxSearchLimit { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties()
        {
        }

        private ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties(ConfigNodePropertyBoolean EnableScheduledPostsSearch, ConfigNodePropertyInteger NumberOfMinutes, ConfigNodePropertyInteger MaxSearchLimit)
        {
            
            this.EnableScheduledPostsSearch = EnableScheduledPostsSearch;
            
            this.NumberOfMinutes = NumberOfMinutes;
            
            this.MaxSearchLimit = MaxSearchLimit;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesBuilder</returns>
        public static ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesBuilder</returns>
        public ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesBuilder With()
        {
            return Builder()
                .EnableScheduledPostsSearch(EnableScheduledPostsSearch)
                .NumberOfMinutes(NumberOfMinutes)
                .MaxSearchLimit(MaxSearchLimit);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties left, ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties left, ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _EnableScheduledPostsSearch;
            private ConfigNodePropertyInteger _NumberOfMinutes;
            private ConfigNodePropertyInteger _MaxSearchLimit;

            internal ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.EnableScheduledPostsSearch property.
            /// </summary>
            /// <param name="value">EnableScheduledPostsSearch</param>
            public ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesBuilder EnableScheduledPostsSearch(ConfigNodePropertyBoolean value)
            {
                _EnableScheduledPostsSearch = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.NumberOfMinutes property.
            /// </summary>
            /// <param name="value">NumberOfMinutes</param>
            public ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesBuilder NumberOfMinutes(ConfigNodePropertyInteger value)
            {
                _NumberOfMinutes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.MaxSearchLimit property.
            /// </summary>
            /// <param name="value">MaxSearchLimit</param>
            public ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesBuilder MaxSearchLimit(ConfigNodePropertyInteger value)
            {
                _MaxSearchLimit = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties</returns>
            public ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties(
                    EnableScheduledPostsSearch: _EnableScheduledPostsSearch,
                    NumberOfMinutes: _NumberOfMinutes,
                    MaxSearchLimit: _MaxSearchLimit
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}