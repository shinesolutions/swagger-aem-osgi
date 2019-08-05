using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties
    /// </summary>
    public sealed class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties:  IEquatable<ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties>
    { 
        /// <summary>
        /// CqAnalyticsTestandtargetAccountoptionsupdaterEnabled
        /// </summary>
        public ConfigNodePropertyBoolean CqAnalyticsTestandtargetAccountoptionsupdaterEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties()
        {
        }

        private ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties(ConfigNodePropertyBoolean CqAnalyticsTestandtargetAccountoptionsupdaterEnabled)
        {
            
            this.CqAnalyticsTestandtargetAccountoptionsupdaterEnabled = CqAnalyticsTestandtargetAccountoptionsupdaterEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertiesBuilder</returns>
        public static ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertiesBuilder Builder()
        {
            return new ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertiesBuilder</returns>
        public ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertiesBuilder With()
        {
            return Builder()
                .CqAnalyticsTestandtargetAccountoptionsupdaterEnabled(CqAnalyticsTestandtargetAccountoptionsupdaterEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties left, ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties left, ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties.
        /// </summary>
        public sealed class ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqAnalyticsTestandtargetAccountoptionsupdaterEnabled;

            internal ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties.CqAnalyticsTestandtargetAccountoptionsupdaterEnabled property.
            /// </summary>
            /// <param name="value">CqAnalyticsTestandtargetAccountoptionsupdaterEnabled</param>
            public ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertiesBuilder CqAnalyticsTestandtargetAccountoptionsupdaterEnabled(ConfigNodePropertyBoolean value)
            {
                _CqAnalyticsTestandtargetAccountoptionsupdaterEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties.
            /// </summary>
            /// <returns>ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties</returns>
            public ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties Build()
            {
                Validate();
                return new ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties(
                    CqAnalyticsTestandtargetAccountoptionsupdaterEnabled: _CqAnalyticsTestandtargetAccountoptionsupdaterEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}