using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplExpiryNotificationJobImplProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplExpiryNotificationJobImplProperties:  IEquatable<ComDayCqDamCoreImplExpiryNotificationJobImplProperties>
    { 
        /// <summary>
        /// CqDamExpiryNotificationSchedulerIstimebased
        /// </summary>
        public ConfigNodePropertyBoolean CqDamExpiryNotificationSchedulerIstimebased { get; private set; }

        /// <summary>
        /// CqDamExpiryNotificationSchedulerTimebasedRule
        /// </summary>
        public ConfigNodePropertyString CqDamExpiryNotificationSchedulerTimebasedRule { get; private set; }

        /// <summary>
        /// CqDamExpiryNotificationSchedulerPeriodRule
        /// </summary>
        public ConfigNodePropertyInteger CqDamExpiryNotificationSchedulerPeriodRule { get; private set; }

        /// <summary>
        /// SendEmail
        /// </summary>
        public ConfigNodePropertyBoolean SendEmail { get; private set; }

        /// <summary>
        /// AssetExpiredLimit
        /// </summary>
        public ConfigNodePropertyInteger AssetExpiredLimit { get; private set; }

        /// <summary>
        /// PriorNotificationSeconds
        /// </summary>
        public ConfigNodePropertyInteger PriorNotificationSeconds { get; private set; }

        /// <summary>
        /// CqDamExpiryNotificationUrlProtocol
        /// </summary>
        public ConfigNodePropertyString CqDamExpiryNotificationUrlProtocol { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplExpiryNotificationJobImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplExpiryNotificationJobImplProperties()
        {
        }

        private ComDayCqDamCoreImplExpiryNotificationJobImplProperties(ConfigNodePropertyBoolean CqDamExpiryNotificationSchedulerIstimebased, ConfigNodePropertyString CqDamExpiryNotificationSchedulerTimebasedRule, ConfigNodePropertyInteger CqDamExpiryNotificationSchedulerPeriodRule, ConfigNodePropertyBoolean SendEmail, ConfigNodePropertyInteger AssetExpiredLimit, ConfigNodePropertyInteger PriorNotificationSeconds, ConfigNodePropertyString CqDamExpiryNotificationUrlProtocol)
        {
            
            this.CqDamExpiryNotificationSchedulerIstimebased = CqDamExpiryNotificationSchedulerIstimebased;
            
            this.CqDamExpiryNotificationSchedulerTimebasedRule = CqDamExpiryNotificationSchedulerTimebasedRule;
            
            this.CqDamExpiryNotificationSchedulerPeriodRule = CqDamExpiryNotificationSchedulerPeriodRule;
            
            this.SendEmail = SendEmail;
            
            this.AssetExpiredLimit = AssetExpiredLimit;
            
            this.PriorNotificationSeconds = PriorNotificationSeconds;
            
            this.CqDamExpiryNotificationUrlProtocol = CqDamExpiryNotificationUrlProtocol;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplExpiryNotificationJobImplProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder</returns>
        public ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder With()
        {
            return Builder()
                .CqDamExpiryNotificationSchedulerIstimebased(CqDamExpiryNotificationSchedulerIstimebased)
                .CqDamExpiryNotificationSchedulerTimebasedRule(CqDamExpiryNotificationSchedulerTimebasedRule)
                .CqDamExpiryNotificationSchedulerPeriodRule(CqDamExpiryNotificationSchedulerPeriodRule)
                .SendEmail(SendEmail)
                .AssetExpiredLimit(AssetExpiredLimit)
                .PriorNotificationSeconds(PriorNotificationSeconds)
                .CqDamExpiryNotificationUrlProtocol(CqDamExpiryNotificationUrlProtocol);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplExpiryNotificationJobImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplExpiryNotificationJobImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplExpiryNotificationJobImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplExpiryNotificationJobImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplExpiryNotificationJobImplProperties left, ComDayCqDamCoreImplExpiryNotificationJobImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplExpiryNotificationJobImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplExpiryNotificationJobImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplExpiryNotificationJobImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplExpiryNotificationJobImplProperties left, ComDayCqDamCoreImplExpiryNotificationJobImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplExpiryNotificationJobImplProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqDamExpiryNotificationSchedulerIstimebased;
            private ConfigNodePropertyString _CqDamExpiryNotificationSchedulerTimebasedRule;
            private ConfigNodePropertyInteger _CqDamExpiryNotificationSchedulerPeriodRule;
            private ConfigNodePropertyBoolean _SendEmail;
            private ConfigNodePropertyInteger _AssetExpiredLimit;
            private ConfigNodePropertyInteger _PriorNotificationSeconds;
            private ConfigNodePropertyString _CqDamExpiryNotificationUrlProtocol;

            internal ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplExpiryNotificationJobImplProperties.CqDamExpiryNotificationSchedulerIstimebased property.
            /// </summary>
            /// <param name="value">CqDamExpiryNotificationSchedulerIstimebased</param>
            public ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder CqDamExpiryNotificationSchedulerIstimebased(ConfigNodePropertyBoolean value)
            {
                _CqDamExpiryNotificationSchedulerIstimebased = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplExpiryNotificationJobImplProperties.CqDamExpiryNotificationSchedulerTimebasedRule property.
            /// </summary>
            /// <param name="value">CqDamExpiryNotificationSchedulerTimebasedRule</param>
            public ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder CqDamExpiryNotificationSchedulerTimebasedRule(ConfigNodePropertyString value)
            {
                _CqDamExpiryNotificationSchedulerTimebasedRule = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplExpiryNotificationJobImplProperties.CqDamExpiryNotificationSchedulerPeriodRule property.
            /// </summary>
            /// <param name="value">CqDamExpiryNotificationSchedulerPeriodRule</param>
            public ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder CqDamExpiryNotificationSchedulerPeriodRule(ConfigNodePropertyInteger value)
            {
                _CqDamExpiryNotificationSchedulerPeriodRule = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplExpiryNotificationJobImplProperties.SendEmail property.
            /// </summary>
            /// <param name="value">SendEmail</param>
            public ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder SendEmail(ConfigNodePropertyBoolean value)
            {
                _SendEmail = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplExpiryNotificationJobImplProperties.AssetExpiredLimit property.
            /// </summary>
            /// <param name="value">AssetExpiredLimit</param>
            public ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder AssetExpiredLimit(ConfigNodePropertyInteger value)
            {
                _AssetExpiredLimit = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplExpiryNotificationJobImplProperties.PriorNotificationSeconds property.
            /// </summary>
            /// <param name="value">PriorNotificationSeconds</param>
            public ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder PriorNotificationSeconds(ConfigNodePropertyInteger value)
            {
                _PriorNotificationSeconds = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplExpiryNotificationJobImplProperties.CqDamExpiryNotificationUrlProtocol property.
            /// </summary>
            /// <param name="value">CqDamExpiryNotificationUrlProtocol</param>
            public ComDayCqDamCoreImplExpiryNotificationJobImplPropertiesBuilder CqDamExpiryNotificationUrlProtocol(ConfigNodePropertyString value)
            {
                _CqDamExpiryNotificationUrlProtocol = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplExpiryNotificationJobImplProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplExpiryNotificationJobImplProperties</returns>
            public ComDayCqDamCoreImplExpiryNotificationJobImplProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplExpiryNotificationJobImplProperties(
                    CqDamExpiryNotificationSchedulerIstimebased: _CqDamExpiryNotificationSchedulerIstimebased,
                    CqDamExpiryNotificationSchedulerTimebasedRule: _CqDamExpiryNotificationSchedulerTimebasedRule,
                    CqDamExpiryNotificationSchedulerPeriodRule: _CqDamExpiryNotificationSchedulerPeriodRule,
                    SendEmail: _SendEmail,
                    AssetExpiredLimit: _AssetExpiredLimit,
                    PriorNotificationSeconds: _PriorNotificationSeconds,
                    CqDamExpiryNotificationUrlProtocol: _CqDamExpiryNotificationUrlProtocol
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}