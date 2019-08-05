using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplMissingMetadataNotificationJobProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties:  IEquatable<ComDayCqDamCoreImplMissingMetadataNotificationJobProperties>
    { 
        /// <summary>
        /// CqDamMissingmetadataNotificationSchedulerIstimebased
        /// </summary>
        public ConfigNodePropertyBoolean CqDamMissingmetadataNotificationSchedulerIstimebased { get; private set; }

        /// <summary>
        /// CqDamMissingmetadataNotificationSchedulerTimebasedRule
        /// </summary>
        public ConfigNodePropertyString CqDamMissingmetadataNotificationSchedulerTimebasedRule { get; private set; }

        /// <summary>
        /// CqDamMissingmetadataNotificationSchedulerPeriodRule
        /// </summary>
        public ConfigNodePropertyInteger CqDamMissingmetadataNotificationSchedulerPeriodRule { get; private set; }

        /// <summary>
        /// CqDamMissingmetadataNotificationRecipient
        /// </summary>
        public ConfigNodePropertyString CqDamMissingmetadataNotificationRecipient { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties()
        {
        }

        private ComDayCqDamCoreImplMissingMetadataNotificationJobProperties(ConfigNodePropertyBoolean CqDamMissingmetadataNotificationSchedulerIstimebased, ConfigNodePropertyString CqDamMissingmetadataNotificationSchedulerTimebasedRule, ConfigNodePropertyInteger CqDamMissingmetadataNotificationSchedulerPeriodRule, ConfigNodePropertyString CqDamMissingmetadataNotificationRecipient)
        {
            
            this.CqDamMissingmetadataNotificationSchedulerIstimebased = CqDamMissingmetadataNotificationSchedulerIstimebased;
            
            this.CqDamMissingmetadataNotificationSchedulerTimebasedRule = CqDamMissingmetadataNotificationSchedulerTimebasedRule;
            
            this.CqDamMissingmetadataNotificationSchedulerPeriodRule = CqDamMissingmetadataNotificationSchedulerPeriodRule;
            
            this.CqDamMissingmetadataNotificationRecipient = CqDamMissingmetadataNotificationRecipient;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesBuilder</returns>
        public ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesBuilder With()
        {
            return Builder()
                .CqDamMissingmetadataNotificationSchedulerIstimebased(CqDamMissingmetadataNotificationSchedulerIstimebased)
                .CqDamMissingmetadataNotificationSchedulerTimebasedRule(CqDamMissingmetadataNotificationSchedulerTimebasedRule)
                .CqDamMissingmetadataNotificationSchedulerPeriodRule(CqDamMissingmetadataNotificationSchedulerPeriodRule)
                .CqDamMissingmetadataNotificationRecipient(CqDamMissingmetadataNotificationRecipient);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplMissingMetadataNotificationJobProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplMissingMetadataNotificationJobProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplMissingMetadataNotificationJobProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplMissingMetadataNotificationJobProperties left, ComDayCqDamCoreImplMissingMetadataNotificationJobProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplMissingMetadataNotificationJobProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplMissingMetadataNotificationJobProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplMissingMetadataNotificationJobProperties left, ComDayCqDamCoreImplMissingMetadataNotificationJobProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqDamMissingmetadataNotificationSchedulerIstimebased;
            private ConfigNodePropertyString _CqDamMissingmetadataNotificationSchedulerTimebasedRule;
            private ConfigNodePropertyInteger _CqDamMissingmetadataNotificationSchedulerPeriodRule;
            private ConfigNodePropertyString _CqDamMissingmetadataNotificationRecipient;

            internal ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.CqDamMissingmetadataNotificationSchedulerIstimebased property.
            /// </summary>
            /// <param name="value">CqDamMissingmetadataNotificationSchedulerIstimebased</param>
            public ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesBuilder CqDamMissingmetadataNotificationSchedulerIstimebased(ConfigNodePropertyBoolean value)
            {
                _CqDamMissingmetadataNotificationSchedulerIstimebased = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.CqDamMissingmetadataNotificationSchedulerTimebasedRule property.
            /// </summary>
            /// <param name="value">CqDamMissingmetadataNotificationSchedulerTimebasedRule</param>
            public ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesBuilder CqDamMissingmetadataNotificationSchedulerTimebasedRule(ConfigNodePropertyString value)
            {
                _CqDamMissingmetadataNotificationSchedulerTimebasedRule = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.CqDamMissingmetadataNotificationSchedulerPeriodRule property.
            /// </summary>
            /// <param name="value">CqDamMissingmetadataNotificationSchedulerPeriodRule</param>
            public ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesBuilder CqDamMissingmetadataNotificationSchedulerPeriodRule(ConfigNodePropertyInteger value)
            {
                _CqDamMissingmetadataNotificationSchedulerPeriodRule = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.CqDamMissingmetadataNotificationRecipient property.
            /// </summary>
            /// <param name="value">CqDamMissingmetadataNotificationRecipient</param>
            public ComDayCqDamCoreImplMissingMetadataNotificationJobPropertiesBuilder CqDamMissingmetadataNotificationRecipient(ConfigNodePropertyString value)
            {
                _CqDamMissingmetadataNotificationRecipient = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplMissingMetadataNotificationJobProperties</returns>
            public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplMissingMetadataNotificationJobProperties(
                    CqDamMissingmetadataNotificationSchedulerIstimebased: _CqDamMissingmetadataNotificationSchedulerIstimebased,
                    CqDamMissingmetadataNotificationSchedulerTimebasedRule: _CqDamMissingmetadataNotificationSchedulerTimebasedRule,
                    CqDamMissingmetadataNotificationSchedulerPeriodRule: _CqDamMissingmetadataNotificationSchedulerPeriodRule,
                    CqDamMissingmetadataNotificationRecipient: _CqDamMissingmetadataNotificationRecipient
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}