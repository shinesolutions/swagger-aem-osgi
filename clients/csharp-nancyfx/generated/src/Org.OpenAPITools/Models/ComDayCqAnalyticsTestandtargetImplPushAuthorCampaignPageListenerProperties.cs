using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties
    /// </summary>
    public sealed class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties:  IEquatable<ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties>
    { 
        /// <summary>
        /// CqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled
        /// </summary>
        public ConfigNodePropertyBoolean CqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties()
        {
        }

        private ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties(ConfigNodePropertyBoolean CqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled)
        {
            
            this.CqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled = CqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesBuilder</returns>
        public static ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesBuilder Builder()
        {
            return new ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesBuilder</returns>
        public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesBuilder With()
        {
            return Builder()
                .CqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled(CqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties left, ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties left, ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties.
        /// </summary>
        public sealed class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled;

            internal ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties.CqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled property.
            /// </summary>
            /// <param name="value">CqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled</param>
            public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesBuilder CqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled(ConfigNodePropertyBoolean value)
            {
                _CqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties.
            /// </summary>
            /// <returns>ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties</returns>
            public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties Build()
            {
                Validate();
                return new ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties(
                    CqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled: _CqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}