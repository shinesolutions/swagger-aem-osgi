using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties
    /// </summary>
    public sealed class ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties:  IEquatable<ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties>
    { 
        /// <summary>
        /// CqStoreListenerAdditionalStorePaths
        /// </summary>
        public ConfigNodePropertyArray CqStoreListenerAdditionalStorePaths { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties()
        {
        }

        private ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties(ConfigNodePropertyArray CqStoreListenerAdditionalStorePaths)
        {
            
            this.CqStoreListenerAdditionalStorePaths = CqStoreListenerAdditionalStorePaths;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesBuilder</returns>
        public static ComDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesBuilder Builder()
        {
            return new ComDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesBuilder</returns>
        public ComDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesBuilder With()
        {
            return Builder()
                .CqStoreListenerAdditionalStorePaths(CqStoreListenerAdditionalStorePaths);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties left, ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties left, ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties.
        /// </summary>
        public sealed class ComDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqStoreListenerAdditionalStorePaths;

            internal ComDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties.CqStoreListenerAdditionalStorePaths property.
            /// </summary>
            /// <param name="value">CqStoreListenerAdditionalStorePaths</param>
            public ComDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesBuilder CqStoreListenerAdditionalStorePaths(ConfigNodePropertyArray value)
            {
                _CqStoreListenerAdditionalStorePaths = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties.
            /// </summary>
            /// <returns>ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties</returns>
            public ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties Build()
            {
                Validate();
                return new ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties(
                    CqStoreListenerAdditionalStorePaths: _CqStoreListenerAdditionalStorePaths
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}