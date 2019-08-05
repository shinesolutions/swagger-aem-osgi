using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties
    /// </summary>
    public sealed class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties:  IEquatable<ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties>
    { 
        /// <summary>
        /// GroupListingPaginationEnable
        /// </summary>
        public ConfigNodePropertyBoolean GroupListingPaginationEnable { get; private set; }

        /// <summary>
        /// GroupListingLazyloadingEnable
        /// </summary>
        public ConfigNodePropertyBoolean GroupListingLazyloadingEnable { get; private set; }

        /// <summary>
        /// PageSize
        /// </summary>
        public ConfigNodePropertyInteger PageSize { get; private set; }

        /// <summary>
        /// Priority
        /// </summary>
        public ConfigNodePropertyInteger Priority { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties()
        {
        }

        private ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties(ConfigNodePropertyBoolean GroupListingPaginationEnable, ConfigNodePropertyBoolean GroupListingLazyloadingEnable, ConfigNodePropertyInteger PageSize, ConfigNodePropertyInteger Priority)
        {
            
            this.GroupListingPaginationEnable = GroupListingPaginationEnable;
            
            this.GroupListingLazyloadingEnable = GroupListingLazyloadingEnable;
            
            this.PageSize = PageSize;
            
            this.Priority = Priority;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesBuilder</returns>
        public static ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesBuilder</returns>
        public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesBuilder With()
        {
            return Builder()
                .GroupListingPaginationEnable(GroupListingPaginationEnable)
                .GroupListingLazyloadingEnable(GroupListingLazyloadingEnable)
                .PageSize(PageSize)
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

        public bool Equals(ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties left, ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties left, ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _GroupListingPaginationEnable;
            private ConfigNodePropertyBoolean _GroupListingLazyloadingEnable;
            private ConfigNodePropertyInteger _PageSize;
            private ConfigNodePropertyInteger _Priority;

            internal ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.GroupListingPaginationEnable property.
            /// </summary>
            /// <param name="value">GroupListingPaginationEnable</param>
            public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesBuilder GroupListingPaginationEnable(ConfigNodePropertyBoolean value)
            {
                _GroupListingPaginationEnable = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.GroupListingLazyloadingEnable property.
            /// </summary>
            /// <param name="value">GroupListingLazyloadingEnable</param>
            public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesBuilder GroupListingLazyloadingEnable(ConfigNodePropertyBoolean value)
            {
                _GroupListingLazyloadingEnable = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.PageSize property.
            /// </summary>
            /// <param name="value">PageSize</param>
            public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesBuilder PageSize(ConfigNodePropertyInteger value)
            {
                _PageSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.Priority property.
            /// </summary>
            /// <param name="value">Priority</param>
            public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesBuilder Priority(ConfigNodePropertyInteger value)
            {
                _Priority = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties</returns>
            public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties(
                    GroupListingPaginationEnable: _GroupListingPaginationEnable,
                    GroupListingLazyloadingEnable: _GroupListingLazyloadingEnable,
                    PageSize: _PageSize,
                    Priority: _Priority
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}