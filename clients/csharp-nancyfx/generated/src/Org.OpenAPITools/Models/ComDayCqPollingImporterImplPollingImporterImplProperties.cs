using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqPollingImporterImplPollingImporterImplProperties
    /// </summary>
    public sealed class ComDayCqPollingImporterImplPollingImporterImplProperties:  IEquatable<ComDayCqPollingImporterImplPollingImporterImplProperties>
    { 
        /// <summary>
        /// ImporterMinInterval
        /// </summary>
        public ConfigNodePropertyInteger ImporterMinInterval { get; private set; }

        /// <summary>
        /// ImporterUser
        /// </summary>
        public ConfigNodePropertyString ImporterUser { get; private set; }

        /// <summary>
        /// ExcludePaths
        /// </summary>
        public ConfigNodePropertyArray ExcludePaths { get; private set; }

        /// <summary>
        /// IncludePaths
        /// </summary>
        public ConfigNodePropertyArray IncludePaths { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqPollingImporterImplPollingImporterImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqPollingImporterImplPollingImporterImplProperties()
        {
        }

        private ComDayCqPollingImporterImplPollingImporterImplProperties(ConfigNodePropertyInteger ImporterMinInterval, ConfigNodePropertyString ImporterUser, ConfigNodePropertyArray ExcludePaths, ConfigNodePropertyArray IncludePaths)
        {
            
            this.ImporterMinInterval = ImporterMinInterval;
            
            this.ImporterUser = ImporterUser;
            
            this.ExcludePaths = ExcludePaths;
            
            this.IncludePaths = IncludePaths;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqPollingImporterImplPollingImporterImplProperties.
        /// </summary>
        /// <returns>ComDayCqPollingImporterImplPollingImporterImplPropertiesBuilder</returns>
        public static ComDayCqPollingImporterImplPollingImporterImplPropertiesBuilder Builder()
        {
            return new ComDayCqPollingImporterImplPollingImporterImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqPollingImporterImplPollingImporterImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqPollingImporterImplPollingImporterImplPropertiesBuilder</returns>
        public ComDayCqPollingImporterImplPollingImporterImplPropertiesBuilder With()
        {
            return Builder()
                .ImporterMinInterval(ImporterMinInterval)
                .ImporterUser(ImporterUser)
                .ExcludePaths(ExcludePaths)
                .IncludePaths(IncludePaths);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqPollingImporterImplPollingImporterImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqPollingImporterImplPollingImporterImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqPollingImporterImplPollingImporterImplProperties</param>
        /// <param name="right">Compared (ComDayCqPollingImporterImplPollingImporterImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqPollingImporterImplPollingImporterImplProperties left, ComDayCqPollingImporterImplPollingImporterImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqPollingImporterImplPollingImporterImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqPollingImporterImplPollingImporterImplProperties</param>
        /// <param name="right">Compared (ComDayCqPollingImporterImplPollingImporterImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqPollingImporterImplPollingImporterImplProperties left, ComDayCqPollingImporterImplPollingImporterImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqPollingImporterImplPollingImporterImplProperties.
        /// </summary>
        public sealed class ComDayCqPollingImporterImplPollingImporterImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ImporterMinInterval;
            private ConfigNodePropertyString _ImporterUser;
            private ConfigNodePropertyArray _ExcludePaths;
            private ConfigNodePropertyArray _IncludePaths;

            internal ComDayCqPollingImporterImplPollingImporterImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplPollingImporterImplProperties.ImporterMinInterval property.
            /// </summary>
            /// <param name="value">ImporterMinInterval</param>
            public ComDayCqPollingImporterImplPollingImporterImplPropertiesBuilder ImporterMinInterval(ConfigNodePropertyInteger value)
            {
                _ImporterMinInterval = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplPollingImporterImplProperties.ImporterUser property.
            /// </summary>
            /// <param name="value">ImporterUser</param>
            public ComDayCqPollingImporterImplPollingImporterImplPropertiesBuilder ImporterUser(ConfigNodePropertyString value)
            {
                _ImporterUser = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplPollingImporterImplProperties.ExcludePaths property.
            /// </summary>
            /// <param name="value">ExcludePaths</param>
            public ComDayCqPollingImporterImplPollingImporterImplPropertiesBuilder ExcludePaths(ConfigNodePropertyArray value)
            {
                _ExcludePaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPollingImporterImplPollingImporterImplProperties.IncludePaths property.
            /// </summary>
            /// <param name="value">IncludePaths</param>
            public ComDayCqPollingImporterImplPollingImporterImplPropertiesBuilder IncludePaths(ConfigNodePropertyArray value)
            {
                _IncludePaths = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqPollingImporterImplPollingImporterImplProperties.
            /// </summary>
            /// <returns>ComDayCqPollingImporterImplPollingImporterImplProperties</returns>
            public ComDayCqPollingImporterImplPollingImporterImplProperties Build()
            {
                Validate();
                return new ComDayCqPollingImporterImplPollingImporterImplProperties(
                    ImporterMinInterval: _ImporterMinInterval,
                    ImporterUser: _ImporterUser,
                    ExcludePaths: _ExcludePaths,
                    IncludePaths: _IncludePaths
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}